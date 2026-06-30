package x84;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f534119a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f534120b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f534121c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f534122d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f534118f = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(x84.e.class, "unreadStateImageUrl", "getUnreadStateImageUrl()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(x84.e.class, "unreadStateDarkImageUrl", "getUnreadStateDarkImageUrl()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(x84.e.class, "readStateImageUrl", "getReadStateImageUrl()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(x84.e.class, "readStateDarkImageUrl", "getReadStateDarkImageUrl()Ljava/lang/String;", 0))};

    /* renamed from: e, reason: collision with root package name */
    public static final x84.d f534117e = new x84.d(null);

    public e() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f534119a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        this.f534120b = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        this.f534121c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        this.f534122d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
    }

    public static final x84.e a(java.util.Map values, java.lang.String prefKey) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
        f534117e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        x84.e eVar = null;
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            eVar = new x84.e();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".unreadStateImageUrl"));
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = eVar.f534119a;
            f06.v[] vVarArr = f534118f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) h1Var).b(eVar, vVarArr[0], str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".unreadStateDarkImageUrl"));
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar.f534120b).b(eVar, vVarArr[1], str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".readStateImageUrl"));
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar.f534121c).b(eVar, vVarArr[2], str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            java.lang.String str4 = (java.lang.String) values.get(prefKey.concat(".readStateDarkImageUrl"));
            java.lang.String str5 = str4 != null ? str4 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar.f534122d).b(eVar, vVarArr[3], str5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
        return eVar;
    }
}
