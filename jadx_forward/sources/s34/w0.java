package s34;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final s34.r1 f484337a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484338b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f484339c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f484341e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f484342f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f484343g;

    /* renamed from: h, reason: collision with root package name */
    public final float f484344h;

    /* renamed from: i, reason: collision with root package name */
    public final int f484345i;

    /* renamed from: j, reason: collision with root package name */
    public final s34.r1 f484346j;

    /* renamed from: k, reason: collision with root package name */
    public final s34.r1 f484347k;

    /* renamed from: l, reason: collision with root package name */
    public final s34.r1 f484348l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f484349m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f484350n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f484351o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f484352p;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f484336r = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(s34.w0.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(s34.w0.class, "scratchSuccessActionInfo", "getScratchSuccessActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final s34.v0 f484335q = new s34.v0(null);

    public w0(s34.r1 r1Var, java.lang.String textBeforeScratch, java.lang.String titleAfterScratch, java.lang.String subTitleAfterScratch, int i17, java.lang.String voucherNumberStr, java.lang.String discountStr, float f17, int i18, s34.r1 r1Var2, s34.r1 r1Var3, s34.r1 r1Var4, java.lang.String btnTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textBeforeScratch, "textBeforeScratch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleAfterScratch, "titleAfterScratch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitleAfterScratch, "subTitleAfterScratch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voucherNumberStr, "voucherNumberStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(discountStr, "discountStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnTitle, "btnTitle");
        this.f484337a = r1Var;
        this.f484338b = textBeforeScratch;
        this.f484339c = titleAfterScratch;
        this.f484340d = subTitleAfterScratch;
        this.f484341e = i17;
        this.f484342f = voucherNumberStr;
        this.f484343g = discountStr;
        this.f484344h = f17;
        this.f484345i = i18;
        this.f484346j = r1Var2;
        this.f484347k = r1Var3;
        this.f484348l = r1Var4;
        this.f484349m = btnTitle;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f484351o = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
        this.f484352p = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
    }

    public static final s34.w0 b(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        f484335q.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        s34.w0 w0Var = null;
        if (values.containsKey(prefKey)) {
            s34.q1 q1Var = s34.r1.f484288g;
            s34.r1 a17 = q1Var.a(values, prefKey.concat(".guidePagInfo"));
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".textBeforeScratch"));
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".titleAfterScratch"));
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = (java.lang.String) values.get(prefKey.concat(".subTitleAfterScratch"));
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) values.get(prefKey.concat(".couponType"));
            int intValue = (str7 == null || (h17 = r26.h0.h(str7)) == null) ? 0 : h17.intValue();
            java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".voucherNumberStr"));
            java.lang.String str9 = str8 == null ? "" : str8;
            java.lang.String str10 = (java.lang.String) values.get(prefKey.concat(".discountStr"));
            java.lang.String str11 = str10 == null ? "" : str10;
            java.lang.String str12 = (java.lang.String) values.get(prefKey.concat(".scratchAreaPercent"));
            java.lang.Float f17 = str12 != null ? r26.g0.f(str12) : null;
            float floatValue = (f17 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.a(f17, 0.0f)) ? 0.3f : f17.floatValue();
            java.lang.String str13 = (java.lang.String) values.get(prefKey.concat(".scratchAreaRadius"));
            java.lang.Integer h18 = str13 != null ? r26.h0.h(str13) : null;
            int intValue2 = (h18 == null || h18.intValue() == 0) ? 25 : h18.intValue();
            s34.r1 a18 = q1Var.a(values, prefKey.concat(".scratchBeginPagInfo"));
            s34.r1 a19 = q1Var.a(values, prefKey.concat(".scratchSuccessLeftPagInfo"));
            s34.r1 a27 = q1Var.a(values, prefKey.concat(".scratchSuccessRightPagInfo"));
            java.lang.String str14 = (java.lang.String) values.get(prefKey.concat(".clickActionInfo.btnTitle"));
            if (str14 == null) {
                str14 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575367pa0);
            }
            java.lang.String str15 = str14;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str15);
            w0Var = new s34.w0(a17, str2, str4, str6, intValue, str9, str11, floatValue, intValue2, a18, a19, a27, str15);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(values, prefKey.concat(".clickActionInfo"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = w0Var.f484351o;
            f06.v[] vVarArr = f484336r;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) h1Var).b(w0Var, vVarArr[0], f18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(values, prefKey.concat(".scratchSuccessActionInfo"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) w0Var.f484352p).b(w0Var, vVarArr[1], f19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        return w0Var;
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        boolean z17 = this.f484350n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        return z17;
    }
}
