package com.tencent.midas.comm;

/* loaded from: classes12.dex */
public class APIPConfig {
    private static java.util.HashMap<java.lang.String, java.lang.String> currentEnvIPList = new java.util.HashMap<>();

    public static java.lang.String getDomain(java.lang.String str) {
        java.lang.String str2 = currentEnvIPList.get(str);
        return android.text.TextUtils.isEmpty(str2) ? str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_DEV) ? "dev.api.unipay.qq.com" : str.equals("test") ? "sandbox.api.unipay.qq.com" : (!str.equals("release") && str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_TESTING)) ? "183.60.36.92" : "api.unipay.qq.com" : str2;
    }

    private static java.lang.String getFromAssets(android.content.Context context) {
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
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, file is null!");
            return null;
        }
    }

    public static void loadIPMappingFile(android.content.Context context) {
        org.json.JSONObject jSONObject;
        if (context == null) {
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, context null!");
            return;
        }
        java.lang.String fromAssets = getFromAssets(context);
        if (android.text.TextUtils.isEmpty(fromAssets)) {
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, got empty json!");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(fromAssets);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, exception json!");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("info");
        if (optJSONArray == null) {
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, json no info!");
            return;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            com.tencent.midas.comm.APLog.e("APIPConfig", "Loading ip mapping file, json info length 0!");
            return;
        }
        for (int i17 = 0; i17 < length; i17++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                currentEnvIPList.put(jSONObject2.optString("env"), jSONObject2.optString("domain"));
            } catch (org.json.JSONException | java.lang.Exception unused2) {
            }
        }
    }
}
