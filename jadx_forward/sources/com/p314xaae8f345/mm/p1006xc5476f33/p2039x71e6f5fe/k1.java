package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes3.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f240282a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f240283b;

    static {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_img_translate_threshold_for_test, 10);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_img_translate_threshold_use_config, 0);
        if (Ni2 == 1) {
            f240282a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_img_translate_threshold_for_config, 10);
        } else {
            f240282a = Ni;
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_img_translate_entry_always_show_disable, 0);
        if (Ni3 == 1) {
            f240283b = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHelper", "initScannerHelper testTranslateConfig: %s, useConfig: %s, translateConfigRatio %d, disableAlwaysShowTranslateMenu: %s, alwaysShowTranlsateMenu: %s", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(f240282a), java.lang.Integer.valueOf(Ni3), java.lang.Boolean.valueOf(f240283b));
    }

    public static java.lang.String a(int i17) {
        switch (i17) {
            case 1:
                return "en";
            case 2:
                return "zh_CN";
            case 3:
                return "ja";
            case 4:
                return "ko";
            case 5:
                return "ru";
            case 6:
                return "th";
            case 7:
                return "vi";
            default:
                return "bg";
        }
    }

    public static int b(java.util.List list) {
        if (list == null || list.size() <= 1) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < list.size(); i18++) {
            if (!a(i18).equalsIgnoreCase("bg") && !a(i18).equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) {
                i17 += (int) (((java.lang.Float) list.get(i18)).floatValue() * 100.0f);
            }
        }
        return i17;
    }

    public static boolean c() {
        java.lang.String[] split;
        if (!e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHelper", "Word Detect Closed");
            return false;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableFavPicTranslation", 0);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PicTranslationSupportUserLanguage");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(b17 == 1);
        objArr[1] = d17;
        objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHelper", "enable %s, support lang %s, current lang %s", objArr);
        return (b17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && (split = d17.split(";")) != null && java.util.Arrays.asList(split).contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) || o45.wf.f424567l;
    }

    public static boolean d() {
        java.lang.String[] split;
        if (!gm0.j1.a()) {
            return false;
        }
        if (!e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHelper", "Word Detect Closed");
            return false;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableWebviewPicTranslation", 0);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PicTranslationSupportUserLanguage");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(b17 == 1);
        objArr[1] = d17;
        objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerHelper", "enable %s, support lang %s, current lang %s", objArr);
        return (b17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && (split = d17.split(";")) != null && java.util.Arrays.asList(split).contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) || o45.wf.f424567l;
    }

    public static boolean e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_lib_word_detect_open, 1) == 1;
    }

    public static boolean f(int i17) {
        return i17 >= f240282a;
    }
}
