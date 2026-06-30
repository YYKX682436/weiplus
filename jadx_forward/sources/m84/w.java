package m84;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f406337a;

    /* renamed from: b, reason: collision with root package name */
    public int f406338b;

    /* renamed from: c, reason: collision with root package name */
    public int f406339c;

    /* renamed from: d, reason: collision with root package name */
    public mb4.e f406340d;

    /* renamed from: e, reason: collision with root package name */
    public mb4.e f406341e;

    /* renamed from: f, reason: collision with root package name */
    public mb4.e f406342f;

    /* renamed from: g, reason: collision with root package name */
    public mb4.e f406343g;

    /* renamed from: h, reason: collision with root package name */
    public mb4.e f406344h;

    /* renamed from: i, reason: collision with root package name */
    public mb4.e f406345i;

    /* renamed from: j, reason: collision with root package name */
    public m84.c0 f406346j;

    /* renamed from: k, reason: collision with root package name */
    public m84.c0 f406347k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f406348l = kz5.p0.f395529d;

    /* renamed from: m, reason: collision with root package name */
    public m84.c0 f406349m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h1 f406350n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f406351o;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f406336q = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(m84.w.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final m84.v f406335p = new m84.v(null);

    public w() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x0.f247699a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1[] t1VarArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.t1.f247674d;
        this.f406350n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0();
        this.f406351o = "";
    }

    public static final m84.w d(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        m84.v vVar = f406335p;
        vVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        m84.w wVar = null;
        wVar = null;
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(prefKey)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            m84.w wVar2 = new m84.w();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            wVar2.f406337a = (str == null || (h19 = r26.h0.h(str)) == null) ? 0 : h19.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            wVar2.f406338b = (str2 == null || (h18 = r26.h0.h(str2)) == null) ? 0 : h18.intValue();
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".bottomOffset"));
            wVar2.f406339c = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
            mb4.d dVar = mb4.e.f406928f;
            wVar2.f406340d = dVar.a(values, prefKey.concat(".stageOnePagInfo"));
            wVar2.f406341e = dVar.a(values, prefKey.concat(".stageOnePagDarkInfo"));
            wVar2.f406342f = dVar.a(values, prefKey.concat(".stageTwoPagInfo"));
            wVar2.f406343g = dVar.a(values, prefKey.concat(".stageTwoPagDarkInfo"));
            wVar2.f406344h = dVar.a(values, prefKey.concat(".stageFourPagInfo"));
            wVar2.f406345i = dVar.a(values, prefKey.concat(".stageFourPagDarkInfo"));
            m84.b0 b0Var = m84.c0.f406297e;
            wVar2.f406346j = b0Var.a(values, prefKey.concat(".avatarHotZone"));
            wVar2.f406347k = b0Var.a(values, prefKey.concat(".descHotZone"));
            java.lang.String concat = prefKey.concat(".optionHotZones");
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseOptionHotZones", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            do {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(concat);
                sb6.append(".optionHotZone");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                if (!values.containsKey(sb7)) {
                    break;
                }
                m84.c0 a17 = b0Var.a(values, sb7);
                if (a17 != null && a17.a()) {
                    arrayList.add(a17);
                }
                i17++;
            } while (arrayList.size() < 4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseOptionHotZones", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            wVar2.f406348l = arrayList;
            m84.c0 a18 = b0Var.a(values, prefKey.concat(".stageOneHotZone"));
            if (a18 == null || !java.lang.Boolean.valueOf(a18.a()).booleanValue()) {
                a18 = null;
            }
            wVar2.f406349m = a18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f17 = values.containsKey(prefKey.concat(".clickActionInfo")) ? com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(values, prefKey.concat(".clickActionInfo")) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) wVar2.f406350n).b(wVar2, f406336q[0], f17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
            wVar = wVar2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return wVar;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) this.f406350n).a(this, f406336q[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return c17702x544f64e9;
    }

    public final boolean b(mb4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        if (eVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStageInfoValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return z17;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        if (this.f406337a <= 0 || this.f406338b <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        if (this.f406339c < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        boolean b17 = b(this.f406342f);
        boolean b18 = b(this.f406344h);
        if (!b17 && !b18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        m84.c0 c0Var = this.f406346j;
        if (!(c0Var != null && c0Var.a())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        if (this.f406348l.size() < 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarInfo");
        return true;
    }
}
