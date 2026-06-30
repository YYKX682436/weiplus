package ha4;

/* loaded from: classes4.dex */
public class h {
    public static ha4.h I = null;

    /* renamed from: J, reason: collision with root package name */
    public static java.lang.String f361501J = "";
    public final java.util.LinkedList G;
    public java.lang.StringBuffer H;

    /* renamed from: a, reason: collision with root package name */
    public long f361502a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f361503b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f361504c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f361505d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f361506e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f361507f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f361508g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f361509h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f361510i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f361511j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f361512k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f361513l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f361514m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f361515n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f361516o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f361517p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f361518q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f361519r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f361520s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f361521t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f361522u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f361523v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f361524w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f361525x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f361526y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f361527z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int D = -1;
    public java.lang.String E = "";
    public final java.util.List F = new java.util.LinkedList();

    public h() {
        new java.util.LinkedList();
        this.G = new java.util.LinkedList();
        this.H = new java.lang.StringBuffer();
    }

    public static ha4.h a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            ha4.h hVar = new ha4.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            return hVar;
        }
        java.lang.String g17 = kk.k.g((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) ? "" : null).getBytes());
        if (I == null || !g17.equals(f361501J)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
            I = new ha4.h();
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("");
                I.b(java.net.URLDecoder.decode("", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), false);
                f361501J = g17;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + e17.getMessage());
            }
        }
        ha4.h hVar2 = I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return hVar2;
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        if (r14 >= r12) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha4.h.b(java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha4.h.d():void");
    }
}
