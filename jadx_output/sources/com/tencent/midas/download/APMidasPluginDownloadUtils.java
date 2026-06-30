package com.tencent.midas.download;

/* loaded from: classes13.dex */
public class APMidasPluginDownloadUtils {
    private static final java.lang.String TAG = "PDUtils";

    public static boolean checkIniFileExist(java.io.File file) {
        if (file != null && file.isDirectory()) {
            return new java.io.File(file, "MidasSign.ini").exists();
        }
        return false;
    }

    private static org.json.JSONArray getPureH5UpdateJsAlertData(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action")) && jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) && !android.text.TextUtils.isEmpty(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA))) {
                    return jSONObject.getJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public static boolean handlePureH5UpdateJsAlertLogic(final android.content.Context context, java.lang.String str) {
        if (context == null) {
            com.tencent.midas.comm.APLog.d(TAG, "Cannot handle h5 update logic! Null context!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.comm.APLog.d(TAG, "Cannot handle h5 update logic! Empty alert message!");
            return false;
        }
        boolean isPureH5UpdateJsAlert = isPureH5UpdateJsAlert(str);
        org.json.JSONArray pureH5UpdateJsAlertData = getPureH5UpdateJsAlertData(str);
        if (pureH5UpdateJsAlertData == null) {
            com.tencent.midas.comm.APLog.d(TAG, "Cannot handle h5 update logic! Not relevant message!");
            return isPureH5UpdateJsAlert;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Got h5 update alert message!");
        final java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> parseDownJson = parseDownJson(pureH5UpdateJsAlertData);
        if (parseDownJson == null) {
            com.tencent.midas.comm.APLog.d(TAG, "Got h5 update alert message! Cannot parse json to list!");
            return isPureH5UpdateJsAlert;
        }
        if (parseDownJson.size() <= 0) {
            com.tencent.midas.comm.APLog.d(TAG, "Got h5 update alert message! Cannot parse json to list! Size error = " + parseDownJson.size());
            return isPureH5UpdateJsAlert;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Got h5 update alert message! Start down lists = " + parseDownJson.toString());
        com.tencent.midas.download.APMidasPluginDownloadManager.startDownload(context, parseDownJson, new com.tencent.midas.download.IAPMidasPluginDownListener() { // from class: com.tencent.midas.download.APMidasPluginDownloadUtils.1
            @Override // com.tencent.midas.download.IAPMidasPluginDownListener
            public void onDownloadFail(int i17) {
            }

            @Override // com.tencent.midas.download.IAPMidasPluginDownListener
            public void onDownloadSuccess() {
                com.tencent.midas.comm.APLog.d(com.tencent.midas.download.APMidasPluginDownloadUtils.TAG, "Got h5 update alert message! List download success!");
                com.tencent.midas.download.APMidasPluginDownloadUtils.writeMidasSignFile(context, parseDownJson);
            }
        });
        return isPureH5UpdateJsAlert;
    }

    private static boolean isPureH5UpdateJsAlert(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action"))) {
                    com.tencent.midas.comm.APLog.d(TAG, "isPureH5UpdateJsAlert msg = ".concat(str));
                    com.tencent.midas.comm.APLog.d(TAG, "isPureH5UpdateJsAlert == true!");
                    return true;
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }

    private static java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> parseDownJson(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! jsonArray is null!");
            return null;
        }
        try {
            int length = jSONArray.length();
            if (length == 0) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! jsonArray length is 0!");
                return null;
            }
            java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> arrayList = new java.util.ArrayList<>();
            for (int i17 = 0; i17 < length; i17++) {
                com.tencent.midas.download.APMidasPluginDownInfo aPMidasPluginDownInfo = new com.tencent.midas.download.APMidasPluginDownInfo();
                org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i17);
                java.lang.String string = jSONObject.getString("file_name");
                aPMidasPluginDownInfo.name = string;
                if (android.text.TextUtils.isEmpty(string)) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! item's name is empty!");
                    return null;
                }
                java.lang.String string2 = jSONObject.getString("update_md5");
                aPMidasPluginDownInfo.new_md5_encode = string2;
                if (android.text.TextUtils.isEmpty(string2)) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! item's new encode md5 is empty!");
                    return null;
                }
                try {
                    aPMidasPluginDownInfo.new_md5_decode = new com.tencent.midas.comm.APMidasRSATools().deCodeKey(aPMidasPluginDownInfo.new_md5_encode).substring(r7.length() - 32);
                    com.tencent.midas.comm.APLog.d(TAG, "Parse down json! name = " + aPMidasPluginDownInfo.name + " decode md5 success!");
                } catch (java.lang.Exception e17) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json, decode md5 got exception = " + e17);
                }
                if (android.text.TextUtils.isEmpty(aPMidasPluginDownInfo.new_md5_decode)) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! item's new decode md5 is empty!");
                    return null;
                }
                java.lang.String string3 = jSONObject.getString("full_download_url");
                aPMidasPluginDownInfo.full_url = string3;
                if (android.text.TextUtils.isEmpty(string3)) {
                    com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! item's full url is empty!");
                    return null;
                }
                arrayList.add(aPMidasPluginDownInfo);
            }
            return arrayList;
        } catch (java.lang.Exception e18) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot parse down json! exception = " + e18);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMidasSignFile(android.content.Context context, java.util.ArrayList<com.tencent.midas.download.APMidasPluginDownInfo> arrayList) {
        if (context == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot write MidasSign.ini! null context!");
            return;
        }
        if (arrayList == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot write MidasSign.ini! null list!");
            return;
        }
        if (arrayList.size() <= 0) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot write MidasSign.ini! list size error = " + arrayList.size());
            return;
        }
        java.io.File file = new java.io.File(context.getApplicationContext().getDir("midaspluginsTemp", 0), "MidasSign.ini");
        if (file.exists() && !file.delete()) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot delete old MidasSign.ini file!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = arrayList.get(i17).name;
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot write MidasSign.ini! item name empty!");
                return;
            }
            if (!str.endsWith(".apk")) {
                str = str.concat(".apk");
            }
            java.lang.String str2 = arrayList.get(i17).new_md5_encode;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.midas.comm.APLog.e(TAG, "Cannot write MidasSign.ini! item md5 empty!");
                return;
            }
            sb6.append(str + ":" + str2);
            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        }
        java.lang.String sb7 = sb6.toString();
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
            bufferedWriter.write(sb7);
            bufferedWriter.close();
            fileWriter.close();
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.e(TAG, "Write MidasSign.ini got exception = " + e17);
        }
        com.tencent.midas.comm.APLog.d(TAG, "Write MidasSign.ini success!");
    }
}
