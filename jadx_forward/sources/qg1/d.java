package qg1;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f444281z = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f444282o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f444283p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 f444284q;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f444286s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 f444287t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f444288u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Runnable f444290w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7111x29f27a4c f444291x;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f444285r = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f444289v = false;

    /* renamed from: y, reason: collision with root package name */
    public int f444292y = -1;

    public d(java.lang.String str, boolean z17, r45.ac7 ac7Var, r45.ag7 ag7Var, r45.de7 de7Var, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b c11810xcb772e0b, java.lang.String str4, r45.y50 y50Var, int i18, boolean z18, java.lang.String str5, boolean z19, boolean z27) {
        java.lang.String str6 = str;
        java.lang.String str7 = str3;
        this.f444288u = z19;
        this.f444283p = str2;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7111x29f27a4c b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.b(c12566x87f2d8b7);
        this.f444291x = b17;
        b17.f144307n = z17 ? cm.o0.sync : cm.o0.async;
        b17.f144308o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        b17.f144312s = b17.b("NetworkTypeStr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        java.lang.String str8 = c12566x87f2d8b7.f169667d;
        this.f444286s = str8;
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        r45.u54 u54Var = new r45.u54();
        u54Var.f468588d = str6;
        u54Var.f468589e = ac7Var;
        u54Var.f468590f = z17 ? 1 : 2;
        u54Var.f468593i = ag7Var;
        u54Var.f468594m = de7Var;
        u54Var.f468598q = str7;
        u54Var.f468597p = str8;
        u54Var.f468606y = i18;
        u54Var.f468607z = str5;
        u54Var.B = z27;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            u54Var.C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x.a(str3);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            u54Var.C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x.a(k91.k4.f(str));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "appId:%s, userName:%s,is_first_launch:%b", str6, str7, java.lang.Boolean.valueOf(u54Var.C));
        r45.fd7 fd7Var = new r45.fd7();
        fd7Var.f455779d = i17;
        u54Var.f468592h = fd7Var;
        if (u54Var.f468589e.f451461f == 1162 && c11810xcb772e0b != null) {
            r45.qe7 qe7Var = new r45.qe7();
            qe7Var.f465454d = c11810xcb772e0b.f158850g;
            u54Var.f468601t = qe7Var;
        }
        if (1173 == u54Var.f468589e.f451461f) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init>, openMaterialMimeType is empty");
            } else {
                r45.he7 he7Var = new r45.he7();
                he7Var.f457634d = str4;
                u54Var.f468605x = he7Var;
            }
        }
        java.util.Objects.requireNonNull(y50Var);
        u54Var.f468604w = y50Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1122;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f152197a = u54Var;
        lVar.f152198b = new r45.v54();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f444282o = a17;
        p(a17);
        iz5.a.c(null, z27 && z27 == H());
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = str7 == null ? "" : str7;
        objArr[2] = str6 == null ? "" : str6;
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = str2;
        objArr[5] = str8;
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = wz0.a.a(y50Var);
        objArr[8] = java.lang.Integer.valueOf(i18);
        objArr[9] = java.lang.Boolean.valueOf(z18);
        objArr[10] = java.lang.Boolean.valueOf(z27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "<init> cgiHash[%d], username[%s] appId[%s] sync[%b] sessionId[%s] instanceId[%s] libVersion[%d], source:%s, launchMode:%d, migrate:%b, fallback:%b", objArr);
    }

    public static void J(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "saveMigrateAppId2SourceAppIdMapping, %s -> %s", str, str2);
        f444281z.put(str, str2);
    }

    public static void K(r45.u54 u54Var) {
        r45.fd7 fd7Var = u54Var.f468592h;
        int i17 = fd7Var.f455779d;
        if (i17 <= 0) {
            fd7Var.f455779d = 0;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6 e6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6.class);
        if (e6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d6 d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d6();
            d6Var.f66667x4b6e619a = "@LibraryAppId";
            d6Var.f66670x8987ca93 = i17;
            if (e6Var.get(d6Var, "key", "version")) {
                r45.fd7 fd7Var2 = u54Var.f468592h;
                fd7Var2.f455780e = (int) d6Var.f66669xa783a79b;
                fd7Var2.f455781f = d6Var.f66668x29cbf907;
            }
        }
    }

    public static void L(r45.u54 u54Var) {
        try {
            if (wo.v1.f529364k.f529119a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "SrvDeviceInfo isLimit benchmarkLevel");
                u54Var.f468596o = -1;
            } else {
                int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ClientBenchmarkLevel", -1);
                u54Var.f468596o = b17;
                if (b17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "DynamicConfig performanceLevel 0 illegal");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", e17, "read performanceLevel", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public r45.y50 A() {
        return E().f468604w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String B() {
        java.lang.String str = E().f468597p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String C() {
        java.lang.String str = E().f468598q;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    public final java.lang.String D() {
        return ((r45.u54) this.f444282o.f152243a.f152217a).f468588d;
    }

    public r45.u54 E() {
        return (r45.u54) this.f444282o.f152243a.f152217a;
    }

    public final r45.v54 F() {
        return (r45.v54) this.f444282o.f152244b.f152233a;
    }

    public final int G() {
        return ((r45.u54) this.f444282o.f152243a.f152217a).f468589e.f451459d;
    }

    public final boolean H() {
        return ((r45.u54) this.f444282o.f152243a.f152217a).f468589e.f451463h > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r33, int r34, java.lang.String r35, r45.v54 r36, com.p314xaae8f345.mm.p944x882e457a.m1 r37) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg1.d.x(int, int, java.lang.String, r45.v54, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d, com.p314xaae8f345.mm.p944x882e457a.i
    public final synchronized pq5.g l() {
        pq5.g a17 = new qg1.c().a((r45.u54) this.f444282o.f152243a.f152217a, this.f444285r, this);
        if (a17 != null) {
            return a17;
        }
        af.c b17 = af.d.f85977a.b(this.f444286s, false);
        if (b17 != null) {
            af.b bVar = (af.b) b17.f85975a.get(0);
            ug1.h hVar = null;
            if (bVar == null) {
                bVar = null;
            }
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "getLaunchTask: ret == null!");
            } else {
                hVar = (ug1.h) bVar;
            }
            if (hVar != null) {
                com.p314xaae8f345.mm.p944x882e457a.f a18 = hVar.a(100);
                if (a18 != null && a18.f152151d != null && a18.f152148a == 0 && a18.f152149b == 0) {
                    hVar.f85973d = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "run() intercepted by preFetchLaunchTask, instanceId:%s", this.f444286s);
                    return pq5.h.d(new qg1.f(this, a18));
                }
                hVar.f85973d = false;
            }
        }
        K(E());
        L(E());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f444292y = sj1.l.f(D(), "public:prepare", "小程序相关信息准备");
        this.f444291x.f144304k = currentTimeMillis;
        return super.l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public final com.p314xaae8f345.mm.p944x882e457a.f t() {
        this.f444285r = true;
        return super.t();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public pq5.g u() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.a.a(D(), ((r45.u54) this.f444282o.f152243a.f152217a).f468598q)) {
            return null;
        }
        return pq5.h.d(new qg1.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String y() {
        java.lang.String str = E().f468588d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }
}
