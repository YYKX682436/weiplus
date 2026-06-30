package bd;

/* loaded from: classes7.dex */
public abstract class j {
    public static java.lang.String a(bd.a aVar, java.lang.String str, long j17, boolean z17) {
        java.util.Map mo10162x69648e1 = aVar.mo10162x69648e1();
        if (mo10162x69648e1 == null) {
            return "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : mo10162x69648e1.entrySet()) {
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
                int m65461x627eb42 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65461x627eb42(str, j17, ((java.nio.ByteBuffer) value).array(), z17);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("__id", java.lang.Integer.valueOf(m65461x627eb42));
                hashMap.put((java.lang.String) entry.getKey(), hashMap2);
            } else {
                hashMap.put((java.lang.String) entry.getKey(), value);
            }
        }
        return new org.json.JSONObject(hashMap).toString();
    }
}
