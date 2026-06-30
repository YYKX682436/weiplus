package ue4;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes12.dex */
public class r extends i95.w implements ue4.m {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m f508453g;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d[] f508450d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f[] f508451e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.s f508452f = new ue4.o(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f508454h = new ue4.q(this);

    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f Ai() {
        if (this.f508451e[0] == null && gm0.j1.a()) {
            synchronized (this.f508451e) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f[] fVarArr = this.f508451e;
                if (fVarArr[0] == null) {
                    fVarArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f();
                }
            }
        }
        return this.f508451e[0];
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m Bi() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && this.f508453g == null) {
            this.f508453g = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.m();
        }
        return this.f508453g;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        wi();
        Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.s sVar = this.f508452f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253348d = sVar;
        ue4.o oVar = (ue4.o) sVar;
        oVar.getClass();
        if (gm0.j1.a()) {
            oVar.f508447a.wi().b();
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.plugin.sport.uploadstep");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f508454h;
        if (a17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
        ot0.r.f430288a.add(new ue4.n(this));
        if (gm0.j1.a()) {
            ((ue4.r) i95.n0.c(ue4.r.class)).wi().c(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().toString());
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f508454h);
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253348d = null;
        synchronized (this.f508450d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d dVar = this.f508450d[0];
            if (dVar != null) {
                dVar.f253309a.b();
                if (dVar.f253310b != null) {
                    gm0.j1.d().d(dVar.f253310b);
                }
                this.f508450d[0] = null;
            }
        }
        synchronized (this.f508451e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f fVar = this.f508451e[0];
            if (fVar != null) {
                if (fVar.f253314a != null) {
                    gm0.j1.d().d(fVar.f253314a);
                }
                this.f508451e[0] = null;
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u uVar2;
        java.lang.String str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253361c;
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                try {
                    uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u(str2);
                } catch (java.lang.OutOfMemoryError e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sport.SportKvStorage", e17, "", new java.lang.Object[0]);
                    java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253361c;
                    com.p314xaae8f345.mm.vfs.w6.h(str3);
                    uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u(str3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x();
                xVar.f253351a = uVar.d(202, 0L) * 10000;
                xVar.f253356f = uVar.d(201, 0L);
                xVar.f253355e = uVar.d(203, 0L);
                xVar.f253352b = uVar.d(204, 0L);
                xVar.f253354d = uVar.d(209, 0L);
                xVar.f253357g = xVar.f253356f;
                xVar.f253353c = xVar.f253352b;
                zVar.c().D("KEY_STEP_DETAIL_INFO", xVar.m71369x9616526c());
                java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253361c;
                com.p314xaae8f345.mm.vfs.w6.h(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKvStorage", "compat first file:" + str4 + " detailInfo:" + xVar);
            }
            java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253362d;
            if (com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                try {
                    uVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u(str5);
                } catch (java.lang.OutOfMemoryError e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sport.SportKvStorage", e18, "", new java.lang.Object[0]);
                    java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253362d;
                    com.p314xaae8f345.mm.vfs.w6.h(str6);
                    uVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.u(str6);
                }
                str = "";
                synchronized (uVar2) {
                    if (uVar2.i()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.m3 m3Var = uVar2.f276582i;
                        str = m3Var.c(301, "") instanceof java.lang.String ? (java.lang.String) m3Var.c(301, "") : "";
                    } else {
                        try {
                            java.lang.Object a17 = uVar2.a(301);
                            if (a17 instanceof java.lang.String) {
                                str = (java.lang.String) a17;
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x xVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.x();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                xVar2.a(str);
                zVar.c().D("KEY_STEP_DETAIL_INFO", xVar2.m71369x9616526c());
                java.lang.String str7 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253362d;
                com.p314xaae8f345.mm.vfs.w6.h(str7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportKvStorage", "compat second file:" + str7 + " detailInfo:" + xVar2);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.ServiceC18457xefbbaefe.a();
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d wi() {
        if (this.f508450d[0] == null && gm0.j1.a()) {
            synchronized (this.f508450d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d[] dVarArr = this.f508450d;
                if (dVarArr[0] == null) {
                    dVarArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d();
                }
            }
        }
        return this.f508450d[0];
    }
}
