package cd1;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f122186a = java.util.regex.Pattern.compile("^\\d{6,20}_[a-zA-Z0-9]+@pay$");

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b17 : bArr) {
            stringBuffer.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
        }
        return stringBuffer.toString();
    }

    public static java.util.List b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        java.lang.String[] b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("LITEAPP_MMKV_DB_NAME");
            b17 = M.b();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HCEService.Utils", e17, "getLiteAppAidList error", new java.lang.Object[0]);
        }
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HCEService.Utils", "getLiteAppAidList mmkv allKeys is null");
            return arrayList;
        }
        for (java.lang.String str : b17) {
            if (f122186a.matcher(str).matches()) {
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(M.getString(str, "{}")).optJSONArray("aidList");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (optJSONArray != null) {
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            arrayList2.add(optJSONArray.optString(i17));
                        }
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.toString();
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HCEService.Utils", "parse register option error", e18);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HCEService.Utils", "loadNFCLiteAppInfo liteAppAidList=%s", arrayList.toString());
        return arrayList;
    }
}
