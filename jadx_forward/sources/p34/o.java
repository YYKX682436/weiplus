package p34;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f433219a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f433220b = new java.util.HashMap();

    public static void a(java.lang.String str) {
        long currentTimeMillis;
        java.util.HashMap hashMap;
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            hashMap = f433220b;
            bool = (java.lang.Boolean) hashMap.get(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "checkInit, exp=" + th6.toString());
        }
        if (hashMap.containsKey(str) && bool != null && bool.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        try {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_mmkv").getString(str, "");
            if (!android.text.TextUtils.isEmpty(string)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString = jSONObject.optString(next);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (optString == null) {
                        optString = "";
                    }
                    if (!android.text.TextUtils.isEmpty(next)) {
                        hashMap2.put(next, optString);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLocalStoreage", "checkInit, snsId=" + str + ", value=" + string + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "checkInit exp=" + th7.toString());
        }
        f433219a.put(str, hashMap2);
        hashMap.put(str, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkInit", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLocalStoreage", "clearCache");
        java.util.HashMap hashMap = f433219a;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                f433220b.clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCache", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        java.lang.String d17 = d("", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        return d17;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "getAdValue, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default_snsid_123456";
        }
        java.util.HashMap hashMap = f433219a;
        synchronized (hashMap) {
            try {
                a(str);
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                if (hashMap2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                    return "";
                }
                java.lang.String str3 = (java.lang.String) hashMap2.get(str2);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str3 == null) {
                    str3 = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                return str3;
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            }
        }
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? c(str) : com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69849xf897eed8("", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        return c17;
    }

    public static void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.HashMap hashMap = (java.util.HashMap) f433219a.get(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            java.lang.String str2 = "{}";
            if (hashMap == null || hashMap.size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            } else {
                try {
                    str2 = new org.json.JSONObject(hashMap).toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mapToJsonStr", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_mmkv");
            M.getClass();
            M.putString(str, str2).apply();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLocalStoreage", "saveAdKV, snsId=" + str + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", value=" + str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "saveAdKV, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAdKV", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        h("", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }

    public static void h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLocalStoreage", "setAdValue, exp=" + th6.toString());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default_snsid_123456";
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        java.util.HashMap hashMap = f433219a;
        synchronized (hashMap) {
            try {
                a(str);
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
                if (hashMap2 == null) {
                    hashMap2 = new java.util.HashMap();
                }
                hashMap2.put(str2, str3);
                f(str);
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValue", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
            }
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            g(str, str2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69997x6c093c4c("", str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValueMultiprocess", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
    }
}
