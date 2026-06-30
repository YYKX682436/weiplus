package d84;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f308635a;

    /* renamed from: b, reason: collision with root package name */
    public int f308636b;

    /* renamed from: c, reason: collision with root package name */
    public mb4.e f308637c;

    /* renamed from: d, reason: collision with root package name */
    public mb4.e f308638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f308639e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f308640f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f308641g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f308642h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f308643i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f308644j;

    /* renamed from: k, reason: collision with root package name */
    public mb4.e f308645k;

    /* renamed from: l, reason: collision with root package name */
    public mb4.e f308646l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f308647m;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f308634o = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(d84.l0.class, "titleIcon", "getTitleIcon()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(d84.l0.class, "titleDarkIcon", "getTitleDarkIcon()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(d84.l0.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final d84.k0 f308633n = new d84.k0(null);

    public l0() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f308641g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        this.f308642h = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f308647m = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
    }

    public static final d84.l0 a(java.util.Map values, java.lang.String prefKey) {
        s34.g1 g1Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        f308633n.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        d84.l0 l0Var = null;
        l0Var = null;
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            d84.l0 l0Var2 = new d84.l0();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            l0Var2.f308635a = (str == null || (h18 = r26.h0.h(str)) == null) ? 0 : h18.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            l0Var2.f308636b = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue();
            mb4.d dVar = mb4.e.f406928f;
            l0Var2.f308637c = dVar.a(values, prefKey.concat(".animationPagInfo"));
            l0Var2.f308638d = dVar.a(values, prefKey.concat(".animationPagDarkInfo"));
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".title"));
            if (str3 == null) {
                str3 = "";
            }
            l0Var2.f308639e = str3;
            java.lang.String concat = prefKey.concat(".titleColor");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            if (concat == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
                g1Var = null;
            } else {
                java.lang.String str4 = (java.lang.String) values.get(concat.concat(".color"));
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) values.get(concat.concat(".colorDark"));
                if (str5 == null) {
                    str5 = "";
                }
                g1Var = new s34.g1(str4, str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            }
            l0Var2.f308640f = g1Var;
            java.lang.String str6 = (java.lang.String) values.get(prefKey.concat(".titleIcon"));
            if (str6 == null) {
                str6 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = l0Var2.f308641g;
            f06.v[] vVarArr = f308634o;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) h1Var).b(l0Var2, vVarArr[0], str6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            java.lang.String str7 = (java.lang.String) values.get(prefKey.concat(".titleDarkIcon"));
            if (str7 == null) {
                str7 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) l0Var2.f308642h).b(l0Var2, vVarArr[1], str7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".numberDefaultTitle"));
            if (str8 == null) {
                str8 = "";
            }
            l0Var2.f308643i = str8;
            java.lang.String str9 = (java.lang.String) values.get(prefKey.concat(".numberRequestParams"));
            l0Var2.f308644j = str9 != null ? str9 : "";
            l0Var2.f308645k = dVar.a(values, prefKey.concat(".leftDecorPagInfo"));
            l0Var2.f308646l = dVar.a(values, prefKey.concat(".rightDecorPagInfo"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = values.containsKey(prefKey.concat(".clickActionInfo")) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(values, prefKey.concat(".clickActionInfo")) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) l0Var2.f308647m).b(l0Var2, vVarArr[2], f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
            l0Var = l0Var2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        return l0Var;
    }
}
