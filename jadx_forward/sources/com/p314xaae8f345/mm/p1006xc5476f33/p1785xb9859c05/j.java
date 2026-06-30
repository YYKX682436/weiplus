package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05;

/* loaded from: classes14.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.o, m83.b, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f223976u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l f223977d;

    /* renamed from: e, reason: collision with root package name */
    public s83.l f223978e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223979f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f223980g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f223981h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 f223982i = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.d(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f223983m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f223984n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f223985o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f223986p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f223987q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e f223988r;

    /* renamed from: s, reason: collision with root package name */
    public long f223989s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f223990t;

    public j() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f223983m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.IPCallManager$2
            {
                this.f39173x3fe91575 = 176812961;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "recevive BackupProcessMgrExitEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j.this.j(0, 0);
                return false;
            }
        };
        this.f223984n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe>(this, a0Var) { // from class: com.tencent.mm.plugin.ipcall.IPCallManager$3
            {
                this.f39173x3fe91575 = 1403859438;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe2 = c6229x2bb765fe;
                if (c6229x2bb765fe2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe) {
                    am.w00 w00Var = c6229x2bb765fe2.f136476g;
                    w00Var.f89778a = false;
                    w00Var.f89779b = false;
                    w00Var.f89780c = true;
                    w00Var.f89781d = "";
                }
                return false;
            }
        };
        this.f223985o = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.e(this);
        this.f223986p = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.f(this);
        this.f223988r = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.g(this);
        this.f223989s = 0L;
    }

    public void a(boolean z17) {
        synchronized (this.f223981h) {
            this.f223987q = false;
            gq4.v.Ai().a(z17);
            ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification")).cancel(42);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void b() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a));
            return;
        }
        l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
        Di.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = Di.f398631d;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    public boolean c(int i17, int i18, int i19) {
        int i27;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar;
        tl.w wVar;
        k83.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
            if (gVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", java.lang.Integer.valueOf(gVar.f386434d), java.lang.Integer.valueOf(gVar.f386431a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            }
            return false;
        }
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", java.lang.Integer.valueOf(gVar.f386434d), java.lang.Integer.valueOf(gVar.f386431a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.aj().e();
        wq4.k0 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.aj();
        boolean n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.n();
        aj6.getClass();
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e();
        android.content.Context context = aj6.f530181b;
        context.getSharedPreferences(e17, 0).getBoolean("settings_shake", true);
        ym1.f.Ai("voip").a(n17);
        if (n17) {
            i95.m c17 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f544669e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ((ym1.f) c18).f544669e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ((ym1.f) c19).f544671g[0] = "music";
            }
            xm1.h.y(hVar, 0, null, 2, null);
        } else {
            i95.m c27 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            xm1.h hVar2 = ((ym1.f) c27).f544669e;
            if (hVar2 == null) {
                hVar2 = new xm1.j();
                i95.m c28 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                ((ym1.f) c28).f544669e = hVar2;
                i95.m c29 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                ((ym1.f) c29).f544671g[0] = "music";
            }
            xm1.h.y(hVar2, 2, null, 2, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingPlayer", "playSound, shake: %s, isSpeakerOn: %s, type: %s", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(n17), 2);
        aj6.f530186g = java.lang.System.currentTimeMillis();
        to.g gVar2 = new to.g();
        try {
            gVar2.setDataSource(context, aj6.b("close_lower_volume"));
            gVar2.setOnCompletionListener(new wq4.h0(aj6));
            gVar2.setOnErrorListener(new wq4.i0(aj6));
            gVar2.setAudioStreamType((ym1.f.Ni() || !n17) ? 0 : 2);
            gVar2.prepare();
            gVar2.setLooping(false);
            gVar2.start();
            if (java.lang.System.currentTimeMillis() - aj6.f530186g > 2000) {
                aj6.getClass();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", th6);
            aj6.getClass();
            gVar2.stop();
            gVar2.release();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "closeDeviceEngine");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a();
        a17.f257860e = -1L;
        a17.f257858c = false;
        a17.f257859d = false;
        a17.f257862g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.y1(a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a();
        a18.getClass();
        a18.f257861f = new java.lang.ref.WeakReference(null);
        m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        l83.h hVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379695m;
        int i28 = (hVar3 == null || (wVar = hVar3.f398637a) == null) ? 0 : wVar.f501681a;
        if (Zi.D == 0) {
            Zi.D = i28;
        }
        m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        l83.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379694l;
        int i29 = (cVar == null || (eVar = cVar.f398623a) == null) ? 0 : eVar.K;
        if (Zi2.E == 0) {
            Zi2.E = i29;
        }
        l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
        Di.getClass();
        m83.c Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni();
        l83.c cVar2 = Di.f398629b.f379694l;
        if (cVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = cVar2.f398623a;
            i27 = (eVar2 == null || !cVar2.f398625c) ? -1 : eVar2.g();
        } else {
            i27 = 0;
        }
        Ni.f406250a.f258393k0 = i27 == -1 ? 0 : (int) ((r6.h(i27) / r6.g(i27)) * 100);
        Di.f398632e = null;
        j83.b bVar = Di.f398629b;
        l83.c cVar3 = bVar.f379694l;
        if (cVar3 != null && cVar3.f398625c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
            synchronized (cVar3.f398624b) {
                s75.d.b(new l83.b(cVar3, cVar3.f398623a), "IPCallAudioPlayer_stop");
                cVar3.f398625c = false;
                cVar3.f398623a = null;
            }
        }
        bVar.q("ipcall");
        bVar.f379693k = null;
        bVar.f379696n.a();
        Di.f398631d = null;
        l83.d Di2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
        l83.h hVar4 = Di2.f398629b.f379695m;
        if (hVar4 != null && hVar4.f398639c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRecorder", "stop record");
            synchronized (hVar4.f398638b) {
                tl.w wVar2 = hVar4.f398637a;
                if (wVar2 != null) {
                    s75.d.b(new l83.g(hVar4, wVar2), "IPCallRecorder_stopRecord");
                    hVar4.f398637a = null;
                    hVar4.f398639c = false;
                    hVar4.f398640d = false;
                }
            }
        }
        Di2.f398632e = null;
        m83.c Ni2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni();
        Ni2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "close engine");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = Ni2.f406250a;
        c18912x54425f62.A(true);
        m83.d Zi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi3.f406279x) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi3.f406278w)) {
            Zi3.f406279x = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.t(Zi3.f406263h == 1, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386456z);
            Zi3.f406278w = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.u();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a;
            Zi3.f406280y = c18912x54425f622.j() + "," + c18912x54425f622.J0 + "," + (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.X1 & 255) + c18912x54425f622.g() + "," + c18912x54425f622.f258393k0;
        }
        c18912x54425f62.B();
        Ni2.f406253d = false;
        Ni2.f406252c = false;
        Ni2.f406254e = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f223976u;
        n3Var.mo50300x3fa464aa(this.f223986p);
        n3Var.mo50300x3fa464aa(this.f223985o);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f223990t;
        if (b4Var != null) {
            b4Var.d();
            this.f223990t = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().f406265j = i19;
        m83.d Zi4 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
        if (Zi4.f406277v == 0 && Zi4.f406276u != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            Zi4.f406277v = currentTimeMillis;
            Zi4.f406264i = (currentTimeMillis - Zi4.f406276u) / 1000;
        }
        if (i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().a();
            s83.l lVar = this.f223978e;
            if (lVar != null && lVar.f72763xa3c65b86 != -1) {
                lVar.f68177x10a0fed7 = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar);
            }
        } else if (i17 == 12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().a();
            if (i18 == 11) {
                s83.l lVar2 = this.f223978e;
                if (lVar2 != null && lVar2.f72763xa3c65b86 != -1) {
                    lVar2.f68177x10a0fed7 = 7;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar2);
                }
            } else {
                s83.l lVar3 = this.f223978e;
                if (lVar3 != null && lVar3.f72763xa3c65b86 != -1) {
                    lVar3.f68177x10a0fed7 = 6;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar3);
                }
            }
        } else if (i17 == 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().m(1);
            m83.d Zi5 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            Zi5.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "selfShutdown");
            Zi5.f406260e = 1;
            s83.l lVar4 = this.f223978e;
            long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().f406264i;
            if (lVar4 != null && lVar4.f72763xa3c65b86 != -1) {
                lVar4.f68177x10a0fed7 = 4;
                lVar4.f68174xa7075739 = j17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar4);
            }
        } else if (i17 == 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().m(1);
            m83.d Zi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            Zi6.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
            Zi6.f406258c = 1;
            s83.l lVar5 = this.f223978e;
            long j18 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().f406264i;
            if (lVar5 != null && lVar5.f72763xa3c65b86 != -1) {
                lVar5.f68177x10a0fed7 = 5;
                lVar5.f68174xa7075739 = j18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar5);
            }
        } else if (i17 == 11) {
            if (i18 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().m(3);
            } else if (i18 == 11) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().m(1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().m(2);
            }
            m83.d Zi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            Zi7.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "selfShutdown");
            Zi7.f406260e = 1;
            if (i18 == 11) {
                s83.l lVar6 = this.f223978e;
                if (lVar6 != null && lVar6.f72763xa3c65b86 != -1) {
                    lVar6.f68177x10a0fed7 = 7;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar6);
                }
            } else {
                s83.l lVar7 = this.f223978e;
                long j19 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().f406264i;
                if (lVar7 != null && lVar7.f72763xa3c65b86 != -1) {
                    lVar7.f68177x10a0fed7 = 4;
                    lVar7.f68174xa7075739 = j19;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar7);
                }
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224033w) {
            if (this.f223987q || com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386431a == 0 || com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386433c == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
            } else {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386431a;
                long j27 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386433c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.k.a()) {
                    int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOMaxTimesForShowFeedback", 0);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_SHOW_FEEDBACK_TIME_COUNT_INT;
                    int intValue = ((java.lang.Integer) p17.m(u3Var, 0)).intValue();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_SHOW_FEEDBACK_LAST_TIME_LONG;
                    long longValue = ((java.lang.Long) p18.m(u3Var2, 0L)).longValue();
                    long i110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    long j28 = i110 - longValue;
                    if (j28 > 86400) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
                        intValue = 0;
                    }
                    if (intValue >= b17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time" + b17);
                    } else if (j28 < 1800) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
                    } else {
                        c01.d9.b().p().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                        c01.d9.b().p().x(u3Var2, java.lang.Long.valueOf(i110));
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("IPCallFeedbackDialogUI_KRoomId", i37);
                        intent.putExtra("IPCallFeedbackDialogUI_KCallseq", j27);
                        j45.l.j(context2, "ipcall", ".ui.IPCallFeedbackDialogUI", intent, null);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224022i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406255f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a = -1;
        l83.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi().f224039g;
        if (dVar.f398630c) {
            dVar.f398629b.getClass();
            ym1.f.f544667h.o("ipcall");
            dVar.f398630c = false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.h(this));
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(this.f223982i);
        this.f223984n.mo48814x2efc64();
        this.f223983m.mo48814x2efc64();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.IPCallManager", "unbindIPCallForegroundIfNeed", new java.lang.Object[0]);
        if (!fp.h.c(26)) {
            return true;
        }
        try {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.ServiceC16121xac04f64d.class);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(intent2);
            z17 = true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallManager", e18, "unbindIPCallForegroundIfNeed error: %s", e18.getMessage());
            z17 = false;
        }
        if (!z17) {
            return true;
        }
        this.f223980g = false;
        return true;
    }

    public void d() {
        synchronized (this.f223981h) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().d()) {
                if (this.f223987q) {
                    l();
                    return;
                }
                this.f223987q = true;
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h2d, 0).show();
                android.content.Intent intent = new android.content.Intent();
                intent.setFlags(268435456);
                intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
                intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
                gq4.v.Ai().d(intent, false, true, this.f223988r);
                l();
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar = this.f223977d;
                if (lVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar).f224457w.finish();
                }
            }
        }
    }

    public void e(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
        if (j(8, 9)) {
            i(8, str, str2, i18);
        }
    }

    public void f(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
        if (j(11, 0)) {
            i(11, str, str2, i18);
        }
    }

    public void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406253d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
            if (j(5, i17)) {
                i(5, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apy), 1);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
        if (j(4, i17)) {
            i(4, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apy), 1);
        }
    }

    public void h(int i17, java.lang.String str, java.lang.String str2, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
        if (j(12, 0)) {
            h(12, str, str2, i18, i19);
        }
    }

    public void i(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar = this.f223977d;
        if (lVar == null) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, 1).show();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar;
        if (i18 == 1) {
            l6Var.D = false;
        }
        if (i17 == 8) {
            if (i18 != 1) {
                l6Var.j(str, str2, i18, l6Var.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3g));
                l6Var.k(8);
                return;
            }
            l6Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = l6Var.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3h);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5 = l6Var.f224457w;
            db5.e1.E(activityC16150x8f474cc5, str2, str, activityC16150x8f474cc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3i), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a6(l6Var));
            l6Var.k(8);
            return;
        }
        if (i17 == 10) {
            l6Var.j(str, str2, i18, null);
            l6Var.k(10);
        } else {
            if (i17 == 11) {
                l6Var.j(str, str2, i18, null);
                l6Var.k(11);
                return;
            }
            l6Var.j(str, str2, i18, null);
            if (i17 == 5) {
                l6Var.k(3);
            } else {
                l6Var.k(2);
            }
        }
    }

    public boolean j(int i17, int i18) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c() ? i17 == 0 ? c(9, i17, i18) : c(11, i17, i18) : i17 == 0 ? c(8, i17, i18) : c(12, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void k() {
    }

    public void l() {
        if (fp.h.a(26)) {
            java.lang.String string = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573871g41, java.lang.String.format("%02d:%02d", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f223989s) / 60), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f223989s) % 60))) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573870g40);
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
            intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 42, intent, fp.g0.a(134217728));
            int i17 = fp.h.a(19) ? com.p314xaae8f345.mm.R.C30861xcebc809e.c7u : com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            k0Var.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573870g40));
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3s));
            k0Var.e(string);
            k0Var.f550996g = activity;
            android.app.Notification b17 = k0Var.b();
            b17.icon = i17;
            b17.flags |= 32;
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).n(42, b17, false);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai = gq4.v.Ai();
            int H1 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f223989s);
            int i18 = H1 > 0 ? H1 : 0;
            if (Ai.f258520a != null) {
                Ai.f258520a.f(java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(i18 / 60), java.lang.Integer.valueOf(i18 % 60)));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai2 = gq4.v.Ai();
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = Ai2.f258520a;
        if (c18918x502f85f5 != null) {
            c18918x502f85f5.e(string2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void m(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a));
            return;
        }
        l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
        Di.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = Di.f398631d;
        if (l6Var != null) {
            android.widget.TextView textView = l6Var.f224445k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view = l6Var.f224446l;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (Di.f398629b.n()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - Di.f398633f > 30000) {
            Di.f398633f = currentTimeMillis;
            gq4.v.Bi().f258091a.getClass();
        }
    }

    public final void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "startTimeCount");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f223990t;
        if (b4Var != null) {
            b4Var.d();
            return;
        }
        if (b4Var == null) {
            this.f223990t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.i(this), true);
        }
        this.f223990t.c(1000L, 1000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void p() {
    }
}
