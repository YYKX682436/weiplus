package me4;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String trim = str.trim();
        if (android.text.TextUtils.isEmpty(trim) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        try {
            java.lang.String g17 = kk.k.g((trim.toLowerCase() + "_" + str2).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            if (!android.text.TextUtils.isEmpty(g17)) {
                java.lang.String str3 = "waid" + g17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "getAppWaid, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return "";
    }

    public static synchronized java.lang.String b(java.lang.String str) {
        java.lang.String a17;
        synchronized (me4.c.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                a17 = a(str, g());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidHelper", "doGetAppWaid pkg=" + str + ", appWaid=" + a17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "doGetAppWaid exp=" + th6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                return "";
            }
        }
        return a17;
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ad_id_kv_pref");
            java.lang.String[] b17 = M.b();
            if (b17 != null && b17.length > 0) {
                for (java.lang.String str : b17) {
                    jSONObject.put(str, M.getString(str, ""));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "dumpKV exp=" + th6.toString());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpKV", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return jSONObject2;
    }

    public static java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            r5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_inner_switch, 1) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "isInnerExptWaidEnable, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInnerExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        }
        if (r5) {
            java.lang.String b17 = b(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ad.waid.WaidHelper", "getAppWaid, isInnerExptWaidEnable==false");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return "";
    }

    public static java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appWaid_");
        java.lang.String str = android.os.Build.BRAND;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String replace = str.replace(" ", "_");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb6.append(replace);
        sb6.append("_");
        java.lang.String m17 = wo.w0.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        java.lang.String replace2 = m17.replace(" ", "_");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatStr", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        sb6.append(replace2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaidKey", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return sb7;
    }

    public static int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        int i17 = 0;
        try {
            java.lang.String[] b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ad_id_kv_pref").b();
            if (b17 != null) {
                i17 = b17.length;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "getKVCount exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKVCount", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return 0;
        }
    }

    public static java.lang.String g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            java.lang.String e17 = e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ad_id_kv_pref").getString(e17, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            java.lang.String Kc = fo3.s.INSTANCE.Kc();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidHelper", "getRawWaid, key=" + e17 + ", wxWaid=" + Kc + ", localWaid=" + string);
            int i17 = 1;
            if (android.text.TextUtils.isEmpty(string) && !android.text.TextUtils.isEmpty(Kc)) {
                k(e17, Kc);
                java.lang.String c17 = c();
                int f17 = f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ad.waid.WaidHelper", "device changed, update localWaid, key=" + e17 + ", kvCount=" + f17);
                if (f17 > 1) {
                    me4.f.b(c17);
                }
                string = Kc;
            }
            if (!android.text.TextUtils.isEmpty(string) && !android.text.TextUtils.isEmpty(Kc) && !string.equals(Kc)) {
                boolean i18 = i();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidHelper", "waid Changed, key=" + e17 + ", localWaid=" + string + ", wxWaid=" + Kc + ", isNeedUpdate=" + i18);
                if (i18) {
                    k(e17, Kc);
                    string = Kc;
                }
                int f18 = f();
                if (!i18) {
                    i17 = 0;
                }
                me4.f.e(string, Kc, i17, f18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return string;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "getRawWaid exp=" + android.util.Log.getStackTraceString(th6));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRawWaid", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return "";
        }
    }

    public static boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_switch, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "isExptWaidEnable, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptWaidEnable", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    public static boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_waid_update_switch, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "isExptWaidNeedUpdate, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptWaidNeedUpdate", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return false;
        }
    }

    public static boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        boolean z17 = gm0.j1.i().f354751k && gm0.j1.b().m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxEnvInitDone", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        return z17;
    }

    public static void k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ad_id_kv_pref");
        int f17 = f();
        if (f17 >= 10) {
            M.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidHelper", "saveKVString, clearKv, kvCOunt=" + f17);
        }
        M.getClass();
        M.putString(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveKVString", "com.tencent.mm.plugin.sns.waid.WaidHelper");
    }
}
