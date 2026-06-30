package cd1;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f40653a = java.util.regex.Pattern.compile("^\\d{6,20}_[a-zA-Z0-9]+@pay$");

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
        com.tencent.mm.sdk.platformtools.o4 M;
        java.lang.String[] b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            M = com.tencent.mm.sdk.platformtools.o4.M("LITEAPP_MMKV_DB_NAME");
            b17 = M.b();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HCEService.Utils", e17, "getLiteAppAidList error", new java.lang.Object[0]);
        }
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("HCEService.Utils", "getLiteAppAidList mmkv allKeys is null");
            return arrayList;
        }
        for (java.lang.String str : b17) {
            if (f40653a.matcher(str).matches()) {
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
                    com.tencent.mars.xlog.Log.e("HCEService.Utils", "parse register option error", e18);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("HCEService.Utils", "loadNFCLiteAppInfo liteAppAidList=%s", arrayList.toString());
        return arrayList;
    }
}
