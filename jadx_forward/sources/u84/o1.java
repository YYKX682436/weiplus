package u84;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f507159a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f507160b;

    /* renamed from: c, reason: collision with root package name */
    public s34.g1 f507161c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f507162d;

    /* renamed from: e, reason: collision with root package name */
    public s34.g1 f507163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f507164f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f507165g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f507166h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f507167i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f507168j;

    /* renamed from: k, reason: collision with root package name */
    public long f507169k;

    /* renamed from: l, reason: collision with root package name */
    public int f507170l;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f507158n = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(u84.o1.class, "jumpLinkIconLight", "getJumpLinkIconLight()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(u84.o1.class, "jumpLinkIconDark", "getJumpLinkIconDark()Ljava/lang/String;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(u84.o1.class, "jumpLinkActionInfo", "getJumpLinkActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final u84.n1 f507157m = new u84.n1(null);

    public o1() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f507166h = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        this.f507167i = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f507168j = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
        this.f507169k = 3000L;
    }

    public static final u84.o1 c(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        f507157m.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        u84.o1 o1Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (a84.b0.c(map) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (map.containsKey(str)) {
            o1Var = new u84.o1();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".numberDefaultTitle"));
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507159a = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507160b = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.f1 f1Var = s34.g1.f484179c;
            s34.g1 a17 = f1Var.a(map, str.concat(".numberTitleColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507161c = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".jumpLinkTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507162d = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".linkTitleColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLinkTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507163e = a18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLinkTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".desc"));
            if (str5 == null) {
                str5 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507164f = str5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".descColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDescEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507165g = a19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDescEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".jumpLinkIconLight"));
            if (str6 == null) {
                str6 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 h1Var = o1Var.f507166h;
            f06.v[] vVarArr = f507158n;
            int i17 = 0;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) h1Var).b(o1Var, vVarArr[0], str6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".jumpLinkIconDark"));
            java.lang.String str8 = str7 != null ? str7 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) o1Var.f507167i).b(o1Var, vVarArr[1], str8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(map, str.concat(".jumpLinkActionInfo"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) o1Var.f507168j).b(o1Var, vVarArr[2], f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".stateTriggerTime"));
            long longValue = (str9 == null || (j17 = r26.h0.j(str9)) == null) ? 3000L : j17.longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507169k = longValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".stateTriggerType"));
            if (str10 != null && (h17 = r26.h0.h(str10)) != null) {
                i17 = h17.intValue();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f507170l = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return o1Var;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        java.lang.String str = this.f507159a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return str;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        int i17 = this.f507170l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return i17;
    }
}
