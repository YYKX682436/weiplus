package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APIPConfig */
/* loaded from: classes12.dex */
public class C4754xfbd52878 {

    /* renamed from: currentEnvIPList */
    private static java.util.HashMap<java.lang.String, java.lang.String> f20264x48df2019 = new java.util.HashMap<>();

    /* renamed from: getDomain */
    public static java.lang.String m41597x160af7ba(java.lang.String str) {
        java.lang.String str2 = f20264x48df2019.get(str);
        return android.text.TextUtils.isEmpty(str2) ? str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583) ? "dev.api.unipay.qq.com" : str.equals("test") ? "sandbox.api.unipay.qq.com" : (!str.equals("release") && str.equals(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20064xc194547e)) ? "183.60.36.92" : "api.unipay.qq.com" : str2;
    }

    /* renamed from: getFromAssets */
    private static java.lang.String m41598x501c47c3(android.content.Context context) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getResources().getAssets().open("IPMappingInfo.json")));
            java.lang.String str = "";
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return str;
                }
                str = str + readLine;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, file is null!");
            return null;
        }
    }

    /* renamed from: loadIPMappingFile */
    public static void m41599xa4917c9d(android.content.Context context) {
        org.json.JSONObject jSONObject;
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, context null!");
            return;
        }
        java.lang.String m41598x501c47c3 = m41598x501c47c3(context);
        if (android.text.TextUtils.isEmpty(m41598x501c47c3)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, got empty json!");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(m41598x501c47c3);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, exception json!");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("info");
        if (optJSONArray == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, json no info!");
            return;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APIPConfig", "Loading ip mapping file, json info length 0!");
            return;
        }
        for (int i17 = 0; i17 < length; i17++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                f20264x48df2019.put(jSONObject2.optString("env"), jSONObject2.optString("domain"));
            } catch (org.json.JSONException | java.lang.Exception unused2) {
            }
        }
    }
}
