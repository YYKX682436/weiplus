package me4;

/* loaded from: classes11.dex */
public abstract class f {
    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return "";
        }
        java.lang.String replace = str.replace(",", ";");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        return replace;
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportDeviceChange isWxEnvInitDone==false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            java.lang.String a17 = a(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidReporter", "reportDeviceChange data=" + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18666, 2004, a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportDeviceChange exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void c(me4.d dVar, java.lang.String str) {
        java.lang.String[] strArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportPkg isWxEnvInitDone==false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        if (dVar != null && (strArr = dVar.f407476b) != null && strArr.length > 1) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i17 = 0;
                while (true) {
                    java.lang.String[] strArr2 = dVar.f407476b;
                    if (i17 >= strArr2.length) {
                        break;
                    }
                    sb6.append(strArr2[i17]);
                    if (i17 != dVar.f407476b.length - 1) {
                        sb6.append("|");
                    }
                    i17++;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("rawCallPkg", dVar.f407475a);
                jSONObject.put("callPkgType", dVar.f407477c);
                jSONObject.put("pkgsFromUid", sb6.toString());
                jSONObject.put("queryPkg", str);
                java.lang.String a17 = a(jSONObject.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidReporter", "reportPkg data=" + a17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18666, 2002, a17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportPkg exp=" + android.util.Log.getStackTraceString(th6));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void d(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportQuery isWxEnvInitDone==false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("callPkg", str);
            jSONObject.put("callPkgType", i17);
            jSONObject.put("queryPkg", str2);
            jSONObject.put("errCode", i18);
            jSONObject.put("waitInit", i19);
            jSONObject.put("timeCost", i27);
            java.lang.String a17 = a(jSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidReporter", "reportQuery data=" + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18666, 2000, a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportQuery exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportWaidChange isWxEnvInitDone==false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("needUpdate", i17);
            jSONObject.put("kvCount", i18);
            java.lang.String a17 = a(jSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidReporter", "reportWaidChange data=" + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18666, 2003, a17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidReporter", "reportWaidChange exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }
}
