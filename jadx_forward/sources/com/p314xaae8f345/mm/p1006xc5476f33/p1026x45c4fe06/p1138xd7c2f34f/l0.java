package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f166265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f166266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f166267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f166268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f166269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 f166271g;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092, boolean[] zArr, long j17, int i17, java.lang.String[] strArr, java.lang.Runnable runnable, java.lang.String str) {
        this.f166271g = c12330xa378a092;
        this.f166265a = zArr;
        this.f166266b = j17;
        this.f166267c = i17;
        this.f166268d = strArr;
        this.f166269e = runnable;
        this.f166270f = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1
    public boolean a(java.lang.String[] strArr) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            iz5.a.a(2, this.f166267c);
        }
        boolean[] zArr = this.f166265a;
        boolean z17 = zArr[0];
        java.lang.String[] strArr2 = this.f166268d;
        if (z17) {
            strArr[0] = strArr2[0];
        } else {
            java.lang.String str2 = strArr2[0];
            zArr[0] = true;
            this.f166269e.run();
            strArr[0] = strArr2[0];
            this.f166271g.f165901m.Z = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreInitTask", "runInAccountScope for %s, resetInstance %s -> %s", this.f166270f, str2, strArr2[0]);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p0
    /* renamed from: c */
    public void b(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092 = this.f166271g;
        c12330xa378a092.f165905q = c11809xbc286be4;
        c12330xa378a092.f165901m.f166443o = c12559xbdae8559;
        if (c11809xbc286be4 == null) {
            c12330xa378a092.c();
            return;
        }
        final boolean[] zArr = this.f166265a;
        boolean z17 = false;
        if (zArr[0]) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c11809xbc286be4.T1 = this.f166266b;
            c11809xbc286be4.U1 = currentTimeMillis;
        }
        c12330xa378a092.f165901m.b(c11809xbc286be4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.c(c11809xbc286be4, c12330xa378a092.f165901m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = c12330xa378a092.f165901m;
        c11809xbc286be4.S = c12362x460991bc.f166451u;
        c11809xbc286be4.V = c12362x460991bc.f166453w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g0.a(c11809xbc286be4, c12559xbdae8559);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.m.a(c11809xbc286be4, java.lang.Integer.valueOf(c12559xbdae8559 != null ? c12559xbdae8559.f169323f : -1), c11809xbc286be4.f128811x, c11809xbc286be4.f158814g)) {
            java.lang.String appId = c11809xbc286be4.f158811d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            if (!((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_" + appId)) {
                z17 = true;
            }
        }
        c12330xa378a092.f165906r = z17;
        if (c12330xa378a092.f165906r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.k.d(c11809xbc286be4.f128811x);
            c12330xa378a092.c();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.l0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l0.this;
                l0Var.getClass();
                boolean z19 = zArr[0];
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = c11809xbc286be4;
                c11809xbc286be42.f158829i2 = !z19;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a0922 = l0Var.f166271g;
                if (z19 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j(c11809xbc286be42.f128810w) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreInitTask", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d", c11809xbc286be42.f158811d, java.lang.Integer.valueOf(c11809xbc286be42.f158814g));
                    java.lang.String str = c12330xa378a0922.f165900i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = c12559xbdae8559;
                    java.util.Objects.requireNonNull(c12559xbdae85592);
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2(str, c11809xbc286be42, c12559xbdae85592).m();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.c(21, c11809xbc286be42.f158811d, c11809xbc286be42.L, c11809xbc286be42.f158814g, c11809xbc286be42.k());
                }
                c12330xa378a0922.c();
            }
        };
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.p.f166550a.a(c11809xbc286be4.f158811d, c11809xbc286be4.L1.c(), c11809xbc286be4.f158825e2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.V6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c12330xa378a092.f165899h, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m0(this, runnable));
        } else {
            runnable.run();
        }
    }
}
