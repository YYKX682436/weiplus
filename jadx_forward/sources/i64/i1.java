package i64;

/* loaded from: classes4.dex */
public class i1 implements com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: n, reason: collision with root package name */
    public static int f370721n = 20480;

    /* renamed from: o, reason: collision with root package name */
    public static int f370722o = 30720;

    /* renamed from: p, reason: collision with root package name */
    public static int f370723p = 51200;

    /* renamed from: q, reason: collision with root package name */
    public static int f370724q = 60;

    /* renamed from: r, reason: collision with root package name */
    public static int f370725r = 1800;

    /* renamed from: s, reason: collision with root package name */
    public static volatile boolean f370726s = false;

    /* renamed from: t, reason: collision with root package name */
    public static int f370727t = 43200;

    /* renamed from: d, reason: collision with root package name */
    public int f370728d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f370729e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Random f370730f = new java.util.Random(java.lang.System.currentTimeMillis());

    /* renamed from: g, reason: collision with root package name */
    public final r45.e96 f370731g = new r45.e96();

    /* renamed from: h, reason: collision with root package name */
    public boolean f370732h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f370733i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f370734m = 0;

    public static /* synthetic */ r45.e96 b(i64.i1 i1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        r45.e96 e96Var = i1Var.f370731g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return e96Var;
    }

    public java.lang.String c(java.lang.Object... objArr) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (objArr == null || objArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length = objArr.length - 1;
            for (int i17 = 0; i17 < length; i17++) {
                sb6.append(java.lang.String.valueOf(objArr[i17]));
                sb6.append(',');
            }
            sb6.append(java.lang.String.valueOf(objArr[length]));
            str = sb6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return str;
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (f370726s) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLogMgr", "Account not ready");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        f370721n = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLog2GSendSize", 20480);
        f370722o = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLog3GSendSize", 30720);
        f370723p = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogWifiSendSize", 51200);
        f370724q = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMinRandTime", 60);
        f370725r = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMaxRandTime", 1800);
        f370727t = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMUxAdLogMaxExceptionTime", 43200);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLogMgr", "init " + f370721n + ";" + f370722o + ";" + f370723p + ";" + f370724q + ";" + f370725r + ";" + f370727t);
        int i17 = f370725r;
        int i18 = f370724q;
        if (i17 - i18 < 0) {
            f370725r = i18;
        }
        f370726s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    public void h(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new i64.d1(this, i17, objArr));
        if (this.f370732h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        this.f370732h = true;
        ((ku5.t0) ku5.t0.f394148d).k(new i64.f1(this), 2000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        f();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_SNS_ADLOG_CNTTIME_INT, 0)).intValue();
        gm0.j1.i();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_SNS_ADLOG_FREQUENCY_INT, -1)).intValue();
        boolean z17 = true;
        if (intValue2 > f370727t || intValue2 < 0) {
            intValue2 = this.f370730f.nextInt((f370725r - f370724q) + 1) + f370724q;
        }
        if ((java.lang.System.currentTimeMillis() / 1000) - intValue > intValue2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new i64.g1(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k2 Ij = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ij();
        Ij.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKvReportStg", " getLast select rowid from SnsReportKv order by rowid desc  limit 1");
        android.database.Cursor f17 = Ij.f247571d.f("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
        int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        this.f370728d = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new i64.h1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new i64.g1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (m1Var.mo808xfb85f7b0() == 1802 && (m1Var instanceof i64.n0)) {
            i64.n0 n0Var = (i64.n0) m1Var;
            if (i17 == 0 && i18 == 0) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_SNS_ADLOG_CNTTIME_INT, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new i64.h1(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k2 Ij = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ij();
                Ij.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
                r45.e96 e96Var = new r45.e96();
                java.util.Iterator it = n0Var.f370780f.iterator();
                while (it.hasNext()) {
                    e96Var.f454713d.add((r45.e44) it.next());
                }
                Ij.y0(e96Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }
}
