package com.p314xaae8f345.p592x631407a.p602x551ac888;

/* renamed from: com.tencent.midas.download.APMidasPluginDownloadUtils */
/* loaded from: classes13.dex */
public class C4789x4d5bb90b {
    private static final java.lang.String TAG = "PDUtils";

    /* renamed from: checkIniFileExist */
    public static boolean m41953xd7a9a87f(java.io.File file) {
        if (file != null && file.isDirectory()) {
            return new java.io.File(file, "MidasSign.ini").exists();
        }
        return false;
    }

    /* renamed from: getPureH5UpdateJsAlertData */
    private static org.json.JSONArray m41954x74ad4fb9(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action")) && jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) && !android.text.TextUtils.isEmpty(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306))) {
                    return jSONObject.getJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: handlePureH5UpdateJsAlertLogic */
    public static boolean m41955x2ad99a01(final android.content.Context context, java.lang.String str) {
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Cannot handle h5 update logic! Null context!");
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Cannot handle h5 update logic! Empty alert message!");
            return false;
        }
        boolean m41956xccfa251b = m41956xccfa251b(str);
        org.json.JSONArray m41954x74ad4fb9 = m41954x74ad4fb9(str);
        if (m41954x74ad4fb9 == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Cannot handle h5 update logic! Not relevant message!");
            return m41956xccfa251b;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Got h5 update alert message!");
        final java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> m41957x265d807d = m41957x265d807d(m41954x74ad4fb9);
        if (m41957x265d807d == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Got h5 update alert message! Cannot parse json to list!");
            return m41956xccfa251b;
        }
        if (m41957x265d807d.size() <= 0) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Got h5 update alert message! Cannot parse json to list! Size error = " + m41957x265d807d.size());
            return m41956xccfa251b;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Got h5 update alert message! Start down lists = " + m41957x265d807d.toString());
        com.p314xaae8f345.p592x631407a.p602x551ac888.C4788x9df50987.m41950x5cae6f0a(context, m41957x265d807d, new com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b() { // from class: com.tencent.midas.download.APMidasPluginDownloadUtils.1
            @Override // com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b
            /* renamed from: onDownloadFail */
            public void mo41959xb7571b45(int i17) {
            }

            @Override // com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b
            /* renamed from: onDownloadSuccess */
            public void mo41960x5329367c() {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(com.p314xaae8f345.p592x631407a.p602x551ac888.C4789x4d5bb90b.TAG, "Got h5 update alert message! List download success!");
                com.p314xaae8f345.p592x631407a.p602x551ac888.C4789x4d5bb90b.m41958xf3c585d4(context, m41957x265d807d);
            }
        });
        return m41956xccfa251b;
    }

    /* renamed from: isPureH5UpdateJsAlert */
    private static boolean m41956xccfa251b(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action"))) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "isPureH5UpdateJsAlert msg = ".concat(str));
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "isPureH5UpdateJsAlert == true!");
                    return true;
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }

    /* renamed from: parseDownJson */
    private static java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> m41957x265d807d(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! jsonArray is null!");
            return null;
        }
        try {
            int length = jSONArray.length();
            if (length == 0) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! jsonArray length is 0!");
                return null;
            }
            java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> arrayList = new java.util.ArrayList<>();
            for (int i17 = 0; i17 < length; i17++) {
                com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e c4787x4ae5972e = new com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e();
                org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i17);
                java.lang.String string = jSONObject.getString("file_name");
                c4787x4ae5972e.f20656x337a8b = string;
                if (android.text.TextUtils.isEmpty(string)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! item's name is empty!");
                    return null;
                }
                java.lang.String string2 = jSONObject.getString("update_md5");
                c4787x4ae5972e.f20658xbf1573f6 = string2;
                if (android.text.TextUtils.isEmpty(string2)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! item's new encode md5 is empty!");
                    return null;
                }
                try {
                    c4787x4ae5972e.f20657xbce1c7ce = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4759x7fb6c226().m41656x81edbd71(c4787x4ae5972e.f20658xbf1573f6).substring(r7.length() - 32);
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Parse down json! name = " + c4787x4ae5972e.f20656x337a8b + " decode md5 success!");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json, decode md5 got exception = " + e17);
                }
                if (android.text.TextUtils.isEmpty(c4787x4ae5972e.f20657xbce1c7ce)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! item's new decode md5 is empty!");
                    return null;
                }
                java.lang.String string3 = jSONObject.getString("full_download_url");
                c4787x4ae5972e.f20652x4f5b37bf = string3;
                if (android.text.TextUtils.isEmpty(string3)) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! item's full url is empty!");
                    return null;
                }
                arrayList.add(c4787x4ae5972e);
            }
            return arrayList;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot parse down json! exception = " + e18);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeMidasSignFile */
    public static void m41958xf3c585d4(android.content.Context context, java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> arrayList) {
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot write MidasSign.ini! null context!");
            return;
        }
        if (arrayList == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot write MidasSign.ini! null list!");
            return;
        }
        if (arrayList.size() <= 0) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot write MidasSign.ini! list size error = " + arrayList.size());
            return;
        }
        java.io.File file = new java.io.File(context.getApplicationContext().getDir("midaspluginsTemp", 0), "MidasSign.ini");
        if (file.exists() && !file.delete()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot delete old MidasSign.ini file!");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = arrayList.get(i17).f20656x337a8b;
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot write MidasSign.ini! item name empty!");
                return;
            }
            if (!str.endsWith(".apk")) {
                str = str.concat(".apk");
            }
            java.lang.String str2 = arrayList.get(i17).f20658xbf1573f6;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot write MidasSign.ini! item md5 empty!");
                return;
            }
            sb6.append(str + ":" + str2);
            sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
        }
        java.lang.String sb7 = sb6.toString();
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
            bufferedWriter.write(sb7);
            bufferedWriter.close();
            fileWriter.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Write MidasSign.ini got exception = " + e17);
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Write MidasSign.ini success!");
    }
}
