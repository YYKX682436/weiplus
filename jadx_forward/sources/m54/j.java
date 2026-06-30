package m54;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f405817c;

    /* renamed from: e, reason: collision with root package name */
    public static long f405819e;

    /* renamed from: a, reason: collision with root package name */
    public static final m54.j f405815a = new m54.j();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.LruCache f405816b = new android.util.LruCache(10);

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f405818d = "";

    public static final void a(java.lang.String key) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanOldVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            synchronized (f405815a) {
                try {
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanOldVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0();
            o0Var.f66719x4b6e619a = key;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ri().get(o0Var, new java.lang.String[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ri().mo9951xb06685ab(o0Var, new java.lang.String[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghPageLoader", "clean old data error " + th6.getMessage());
        }
    }

    public static final m54.y b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        try {
            m54.j jVar = f405815a;
            m54.y c17 = jVar.c(d(jVar, j17, str == null ? "" : str, str2 == null ? "" : str2, null, str3, 8, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return c17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghPageLoader", "there is an exception, " + th6.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return null;
        }
    }

    public static final java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghLibVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f405819e > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            f405819e = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghPageLoader", "it is going to check vangogh version!");
            try {
                f405818d = f405815a.f();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("getVangoghLibVersion", th6);
            }
        }
        java.lang.String str = f405818d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghLibVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return str;
    }

    public static final boolean g(m54.y yVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        boolean z18 = true;
        if (!h(yVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            if (yVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                z17 = false;
            } else {
                z17 = yVar.b().length() > 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            }
            if (!z17) {
                z18 = false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return z18;
    }

    public static final boolean h(m54.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        if (yVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return false;
        }
        boolean z17 = yVar.a().length() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return z17;
    }

    public final m54.y c(java.lang.String key) {
        android.util.LruCache lruCache;
        m54.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        synchronized (this) {
            try {
                lruCache = f405816b;
                yVar = (m54.y) lruCache.get(key);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                throw th6;
            }
        }
        if (yVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0();
            o0Var.f66719x4b6e619a = key;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ri();
            if (Ri != null) {
                Ri.get(o0Var, new java.lang.String[0]);
            }
            java.lang.String str = o0Var.f66714x7aef8bf2;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = o0Var.f66720x39742e6;
            if (str2 == null) {
                str2 = "";
            }
            m54.y yVar2 = new m54.y(str, str2, o0Var.f66713x4e8bea10);
            if (g(yVar2)) {
                synchronized (this) {
                    try {
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                        throw th7;
                    }
                }
            }
            yVar = yVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return yVar;
    }

    public final java.lang.String d(long j17, java.lang.String dynamicInfo, java.lang.String uxInfo, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicInfo, "dynamicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureSupport", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        if (f405817c == null) {
            f405817c = l44.e.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureSupport", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        org.json.JSONObject jSONObject = f405817c;
        if (jSONObject == null || (str3 = jSONObject.toString()) == null) {
            str3 = "";
        }
        if (str == null) {
            str = e();
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(j17 + uxInfo + dynamicInfo + str3 + str + str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicKey", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return a17;
    }

    public final java.lang.String f() {
        boolean z17;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj;
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghPageLoader", "it is going to get vangogh version");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z18 = false;
        if (e0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            z17 = false;
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_ad_vangogh_page_support_version, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicCanvas", "Vangogh version needed: the switch value is " + Ni);
            z17 = Ni > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            return "";
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            } else {
                int Ni2 = ((h62.d) e0Var2).Ni(e42.c0.clicfg_sns_ad_use_new_wx_liteapp_info_method_v2, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicCanvas", "use new wx liteapp info: the switch value is " + Ni2);
                boolean z19 = Ni2 > 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportNewLiteAppInfoMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
                z18 = z19;
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghLiteAppInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 50);
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Cj("wxalite0c45e912005759856ea55eb382e8c509"));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("sns_ad_lite_app_info", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = null;
                }
                Bj = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) m143895xf1229813;
                if (Bj == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.VangoghPageLoader", "the value of getLiteAppItemInfo is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 51);
                    Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Bj("wxalite0c45e912005759856ea55eb382e8c509");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghLiteAppInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            } else {
                Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Bj("wxalite0c45e912005759856ea55eb382e8c509");
            }
            if (Bj != null) {
                java.lang.String Ej = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Ej(Bj.f14369x346425, Bj.f14359x58b7f1c, Bj.f14372xa8503287);
                java.lang.String str = Ej != null ? Ej : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghPageLoader", "the vangogh version is ".concat(str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                return str;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return "";
    }

    public final void i(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String d17 = d(j17, str, str2, str5, str6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentServerTimeSecond", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        long a17 = c01.id.a() / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentServerTimeSecond", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        synchronized (this) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ri();
        if (Ri != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o0();
            o0Var.f66719x4b6e619a = d17;
            o0Var.f66721xa7932ef = java.lang.String.valueOf(j17);
            o0Var.f66715x5c4f59c8 = str;
            o0Var.f66713x4e8bea10 = a17;
            o0Var.f66714x7aef8bf2 = str3;
            o0Var.f66720x39742e6 = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("upsert", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfoStorage");
            if (!Ri.mo880xb970c2b9(o0Var)) {
                Ri.mo9952xce0038c9(o0Var, new java.lang.String[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("upsert", "com.tencent.mm.plugin.sns.storage.AdDynamicCanvasInfoStorage");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
    }

    public final void j(long j17, java.lang.String str, java.lang.String str2, int i17, im5.b bVar, android.content.Intent intent, java.lang.String str3, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("request", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String e17 = e();
        za4.a aVar = new za4.a();
        aVar.f552589d = false;
        aVar.f552590e = e17;
        aVar.f552591f = intent != null ? intent.getIntExtra("sns_landing_page_is_direct_download", 0) : 0;
        za4.s1.e(j17, 0, 0, i17, str2, str, str3 == null ? "" : str3, aVar, new m54.g(pVar), bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("request", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
    }

    public static /* synthetic */ java.lang.String d(m54.j jVar, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicKey$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        java.lang.String d17 = jVar.d(j17, str, str2, (i17 & 8) != 0 ? null : str3, (i17 & 16) != 0 ? null : str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicKey$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        return d17;
    }
}
