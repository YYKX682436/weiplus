package bd;

/* loaded from: classes7.dex */
public abstract class j {
    public static java.lang.String a(bd.a aVar, java.lang.String str, long j17, boolean z17) {
        java.util.Map map = aVar.toMap();
        if (map == null) {
            return "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String lowerCase = value.getClass().getName().toLowerCase();
            if (lowerCase.contains("json")) {
                hashMap.put((java.lang.String) entry.getKey(), value.toString());
            } else if (lowerCase.contains("list")) {
                hashMap.put((java.lang.String) entry.getKey(), new org.json.JSONArray((java.util.Collection) value).toString());
            } else if (lowerCase.contains("map")) {
                hashMap.put((java.lang.String) entry.getKey(), new org.json.JSONObject((java.util.Map) value).toString());
            } else if (lowerCase.contains("string")) {
                hashMap.put((java.lang.String) entry.getKey(), "\"" + value + "\"");
            } else if (lowerCase.contains("byte")) {
                int buffer = com.tencent.mm.plugin.lite.LiteAppCenter.setBuffer(str, j17, ((java.nio.ByteBuffer) value).array(), z17);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("__id", java.lang.Integer.valueOf(buffer));
                hashMap.put((java.lang.String) entry.getKey(), hashMap2);
            } else {
                hashMap.put((java.lang.String) entry.getKey(), value);
            }
        }
        return new org.json.JSONObject(hashMap).toString();
    }
}
