package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f166511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f166512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e f166513c;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e eVar, long j17, long j18) {
        this.f166513c = eVar;
        this.f166511a = j17;
        this.f166512b = j18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1
    public boolean a(java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e eVar = this.f166513c;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s d17 = C.d(eVar.f166489e);
        if (d17 == null) {
            strArr[0] = eVar.f166489e;
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            iz5.a.a(2, d17.f129218b);
        }
        strArr[0] = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(eVar.f166488d, d17.f129217a, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(d17.f129217a, d17.f129218b);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(c11809xbc286be4 != null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e eVar = this.f166513c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = eVar.f166488d;
        objArr[1] = c12362x460991bc.f166434d;
        objArr[2] = c12362x460991bc.f166435e;
        objArr[3] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[4] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f166511a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "AppBrandPreLaunchProcessWC.onResult, config?:%b, username:%s, appId:%s, result:%d, cost:%d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a aVar = eVar.f166490f;
        if (aVar.g()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc2 = eVar.f166488d;
        if (c11809xbc286be4 == null) {
            java.lang.String str = c12362x460991bc2.f166435e;
            java.lang.String str2 = c12362x460991bc2.f166439i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = c12362x460991bc2.f166443o;
            if (c12559xbdae85592 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12559xbdae85592.f169327m)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.k0.b(4, str, str2, c12559xbdae85592.f169327m, 0L);
            }
            aVar.e(null, null);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c11809xbc286be4.T1 = this.f166512b;
        c11809xbc286be4.U1 = currentTimeMillis;
        c12362x460991bc2.b(c11809xbc286be4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.c(c11809xbc286be4, c12362x460991bc2);
        c11809xbc286be4.S = c12362x460991bc2.f166451u;
        c11809xbc286be4.V = c12362x460991bc2.f166453w;
        c11809xbc286be4.f158836p2 = c12362x460991bc2.G;
        c11809xbc286be4.f158844x2 = c12362x460991bc2.N;
        com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = c12362x460991bc2.f166447q;
        c11809xbc286be4.N1 = c11105x57aff1b9 != null ? c11105x57aff1b9.f151952h : 0;
        c11809xbc286be4.H = c11105x57aff1b9 == null ? "" : c11105x57aff1b9.f151954m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.g(this, c11809xbc286be4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalAppbrand.l(aVar.f(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.h(this))) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.i(this, c11809xbc286be4, gVar);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.p.f166550a.a(c11809xbc286be4.f158811d, c11809xbc286be4.L1.c(), c11809xbc286be4.f158825e2)) {
                aVar.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.V6(fVar.f166513c.f166490f.getBaseContext(), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.j(fVar, iVar));
                    }
                }, true);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85593 = c12362x460991bc2.f166443o;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.m.a(c11809xbc286be4, java.lang.Integer.valueOf(c12559xbdae85593 != null ? c12559xbdae85593.f169323f : -1), c12362x460991bc2.f166434d, c12362x460991bc2.f166437g)) {
                java.lang.String appId = c11809xbc286be4.f158811d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                if (!((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_".concat(appId))) {
                    aVar.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.m(this, c11809xbc286be4, iVar), true);
                    return;
                }
            }
            iVar.run();
        }
    }
}
