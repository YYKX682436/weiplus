package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 implements za3.a1 {
    public final va3.t0 A1;
    public final i11.c B1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C1;
    public final java.util.HashMap D1;
    public android.widget.Button S;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832 T;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 U;
    public android.view.View V;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16291x2f212556 W;
    public za3.i1 X;
    public final va3.v0 Y;
    public za3.b1 Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f226396l1;

    /* renamed from: p0, reason: collision with root package name */
    public za3.u0 f226397p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16289x539f232c f226398p1;

    /* renamed from: x0, reason: collision with root package name */
    public za3.g0 f226399x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f226400x1;

    /* renamed from: y0, reason: collision with root package name */
    public final i11.e f226401y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f226402y1;

    /* renamed from: z1, reason: collision with root package name */
    public final va3.u0 f226403z1;

    public p0(android.app.Activity activity) {
        super(activity);
        this.f226402y1 = 0L;
        this.f226403z1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.i0(this);
        this.A1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.j0(this);
        this.B1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.k0(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.location.ui.impl.RealTimeLocationUI$5
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba2 = c6231x4f3054ba;
                if (!gm0.j1.a()) {
                    return false;
                }
                if (c6231x4f3054ba2.f136478g.f89948b == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0.this;
                    p0Var.X.e(false);
                    va3.v0 v0Var = p0Var.Y;
                    v0Var.h();
                    v0Var.b(2);
                    p0Var.f226397p0.c();
                    p0Var.f226261d.finish();
                }
                return true;
            }
        };
        this.D1 = new java.util.HashMap();
        this.Y = va3.j0.Ri();
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f226401y0 = i11.h.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void A() {
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            i1Var.f552489n = false;
            i1Var.d(false);
            this.T.setSelected(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void D() {
    }

    public int J() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226400x1)) {
            if (this.f226400x1.equals("fromBanner")) {
                return 0;
            }
            if (this.f226400x1.equals("fromPluginLocation")) {
                return 1;
            }
            if (this.f226400x1.equals("fromPluginTalk")) {
                return 2;
            }
            if (this.f226400x1.equals("fromTrackButton")) {
                return 3;
            }
            if (this.f226400x1.equals("fromMessage")) {
                return 4;
            }
        }
        return 1;
    }

    public void K() {
        p();
        this.X.e(false);
        va3.v0 v0Var = this.Y;
        v0Var.h();
        v0Var.b(3);
        this.f226397p0.c();
        v0Var.f515901z = this.f226266i.f226337f.mo1008xfb888c49();
        this.f226261d.finish();
    }

    @Override // ab3.e
    public boolean a(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        j();
        this.f226261d.finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a, ab3.e
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, "11", 0, 0, 0);
        this.Z.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public void e(android.os.Bundle bundle) {
        super.e(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealTimeLocationUI", "onCreate");
        this.f226402y1 = java.lang.System.currentTimeMillis();
        this.C1.mo48813x58998cd();
        android.app.Activity activity = this.f226261d;
        if (com.p314xaae8f345.mm.ui.b4.c(activity)) {
            com.p314xaae8f345.mm.ui.a4.g(this.f226398p1, true);
            com.p314xaae8f345.mm.ui.a4.d(m(com.p314xaae8f345.mm.R.id.ujf), false, true);
            com.p314xaae8f345.mm.ui.a4.d(m(com.p314xaae8f345.mm.R.id.oi8), false, true);
            new n3.m3(activity.getWindow(), activity.getWindow().getDecorView()).b(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public void f() {
        super.f();
        va3.u0 u0Var = this.f226403z1;
        va3.v0 v0Var = this.Y;
        java.util.HashSet hashSet = v0Var.f515886h;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.u0) weakReference.get()).equals(u0Var)) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.C1.mo48814x2efc64();
        v0Var.f515900y = null;
        za3.u0 u0Var2 = this.f226397p0;
        if (u0Var2 != null) {
            u0Var2.f552557d = null;
            ((dh4.f0) u0Var2.f552572v).r(u0Var2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f runnableC16292x2e41dc6f = u0Var2.f552559f;
            runnableC16292x2e41dc6f.f226213n.mo50300x3fa464aa(runnableC16292x2e41dc6f);
            runnableC16292x2e41dc6f.f226213n.mo50293x3498a0(runnableC16292x2e41dc6f.B);
        }
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            synchronized (za3.i1.f552475x) {
                java.util.List list = i1Var.f552477b;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                i1Var.f552487l.mo996x5a5b649();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealTimeLocationUI", "onDestory");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        return true;
    }

    @Override // ab3.e
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealTimeLocationUI", "pause");
        db5.m9.a(false, new android.content.Intent().putExtra("classname", com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0.class.getName()));
        i11.e eVar = this.f226277w;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f226408J);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f226396l1;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        va3.v0 v0Var = this.Y;
        if (!v0Var.f515893r) {
            ((i11.h) v0Var.f515884f).m(v0Var.K);
            v0Var.f515885g.c(v0Var.L);
            v0Var.f515894s = true;
            v0Var.A = true;
        }
        ab3.h hVar = this.f226266i.f226337f;
        v0Var.f515896u = v0Var.f515889n;
        v0Var.f515889n = 0;
        if (v0Var.d()) {
            v0Var.D = (hVar.mo1002x1cd6e99d() * 1.0d) / 1000000.0d;
            v0Var.E = (hVar.mo1003x1cd6e99e() * 1.0d) / 1000000.0d;
            v0Var.F = hVar.mo1008xfb888c49();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, "17", 0, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f226402y1));
        this.f226402y1 = java.lang.System.currentTimeMillis();
        i11.e eVar2 = this.f226401y0;
        if (eVar2 != null) {
            ((i11.h) eVar2).m(this.B1);
        }
        za3.i1 i1Var = this.X;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // ab3.e
    public void i() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealTimeLocationUI", "resume");
        db5.m9.a(true, new android.content.Intent().putExtra("classname", com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0.class.getName()));
        i11.e eVar = this.f226277w;
        if (eVar != null) {
            ((i11.h) eVar).j(this.f226408J, true);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f226396l1;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        int J2 = J();
        va3.v0 v0Var = this.Y;
        if (v0Var.f515894s) {
            v0Var.B = java.lang.System.currentTimeMillis();
            ((i11.h) v0Var.f515884f).j(v0Var.K, true);
            v0Var.f515885g.a(v0Var.L);
        }
        if (v0Var.d()) {
            v0Var.f(J2, 0, true, false, false);
        }
        v0Var.f515894s = false;
        v0Var.g();
        ab3.h hVar = this.f226266i.f226337f;
        v0Var.f515889n = v0Var.f515896u;
        if (v0Var.D == -1000.0d || v0Var.E == -1000.0d || v0Var.F == -1) {
            z17 = false;
        } else {
            hVar.mo1001x8873d7af().mo991x6ff2357(v0Var.D, v0Var.E);
            hVar.mo1001x8873d7af().mo992x76535355(v0Var.F);
            z17 = true;
        }
        if (z17) {
            this.T.setSelected(false);
            za3.i1 i1Var = this.X;
            i1Var.f552489n = false;
            i1Var.f552481f = true;
        }
        ab3.h hVar2 = this.f226266i.f226337f;
        if (v0Var.f515901z != -1) {
            hVar2.mo1001x8873d7af().mo992x76535355(v0Var.f515901z);
        }
        i11.e eVar2 = this.f226401y0;
        if (eVar2 != null) {
            ((i11.h) eVar2).j(this.B1, true);
        }
        za3.i1 i1Var2 = this.X;
        if (i1Var2 != null) {
            i1Var2.c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public void j() {
        super.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public void k() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public int o() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ccd;
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionDenied */
    public void mo65979x34301f29(java.lang.String str) {
        if (str.equals(d85.g0.LOCAION.f308725d)) {
            this.X.e(false);
            va3.v0 v0Var = this.Y;
            v0Var.h();
            v0Var.b(0);
            this.f226397p0.c();
            this.f226261d.finish();
        }
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionGranted */
    public void mo65980x600c4ed(java.lang.String str) {
        this.f226261d.recreate();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void y() {
        super.y();
        android.app.Activity activity = this.f226261d;
        this.f226396l1 = ((android.os.PowerManager) activity.getSystemService("power")).newWakeLock(26, "Track Lock");
        za3.l1 l1Var = this.B;
        if (l1Var != null) {
            l1Var.f552520m.setVisibility(4);
        }
        android.view.View m17 = m(com.p314xaae8f345.mm.R.id.gy8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "initHeaderBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI", "initHeaderBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.U = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2) m(com.p314xaae8f345.mm.R.id.cov);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo1021xe8ef6fcd = this.f226274t.mo1007xb0d6012().mo1021xe8ef6fcd();
        if (mo1021xe8ef6fcd != null) {
            this.f226274t.mo999x4e2a20af(false);
            mo1021xe8ef6fcd.mo98994x16b0fc2c(false);
            if (n().getIntExtra("map_indoor_support", 0) == 1) {
                mo1021xe8ef6fcd.mo98994x16b0fc2c(true);
                this.U.g1(mo1021xe8ef6fcd, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832 c16295x2743832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832) m(com.p314xaae8f345.mm.R.id.f567220in2);
        this.T = c16295x2743832;
        c16295x2743832.setSelected(true);
        this.T.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.l0(this));
        this.V = m(com.p314xaae8f345.mm.R.id.gy7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16289x539f232c c16289x539f232c = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16289x539f232c) m(com.p314xaae8f345.mm.R.id.msv);
        this.f226398p1 = c16289x539f232c;
        c16289x539f232c.setVisibility(0);
        this.f226398p1.setPadding(0, com.p314xaae8f345.mm.ui.bl.h(activity), 0, 0);
        za3.g0 g0Var = new za3.g0(this.f226261d, this.f226398p1.m65947xf2b66b90(), this.V, this.f226273s, this.f226266i.f226337f);
        this.f226399x0 = g0Var;
        g0Var.f552452h = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.m0(this);
        va3.t0 t0Var = this.A1;
        va3.v0 v0Var = this.Y;
        v0Var.f515900y = t0Var;
        if (this.X == null) {
            this.X = new za3.i1(activity, this.f226266i.f226337f, true);
        }
        this.X.getClass();
        this.X.f552482g = false;
        this.Z = new za3.b1(activity, this);
        this.W = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16291x2f212556) m(com.p314xaae8f345.mm.R.id.m_6);
        android.widget.Button button = (android.widget.Button) m(com.p314xaae8f345.mm.R.id.mtf);
        this.S = button;
        button.setVisibility(0);
        za3.u0 u0Var = new za3.u0(activity, this.S, this.W);
        this.f226397p0 = u0Var;
        u0Var.f552573w = this.f226399x0;
        this.f226398p1.m65948xe30c61b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.n0(this));
        this.f226398p1.m65949x205c3d61(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.o0(this));
        v0Var.B = java.lang.System.currentTimeMillis();
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        v0Var.f515884f = e17;
        e17.j(v0Var.K, true);
        if (v0Var.f515885g == null) {
            v0Var.f515885g = va3.j0.Bi();
        }
        v0Var.f515885g.a(v0Var.L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        if (c16279x64cea23 != null) {
            v0Var.f515892q = c16279x64cea23;
        }
        if (v0Var.f515895t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.TrackRefreshManager", "start location " + v0Var.f515892q.f226119e + " " + v0Var.f515892q.f226120f);
        } else {
            v0Var.f515889n = 1;
            r45.mw6 mw6Var = new r45.mw6();
            v0Var.f515891p = mw6Var;
            mw6Var.f462406e = new r45.wa5();
            r45.wa5 wa5Var = v0Var.f515891p.f462406e;
            wa5Var.f470544d = -1000.0d;
            wa5Var.f470545e = -1000.0d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.TrackRefreshManager", "start location imp " + v0Var.f515892q.f226119e + " " + v0Var.f515892q.f226120f);
            gm0.j1.d().a(uc1.o.f76896x366c91de, v0Var);
            gm0.j1.d().a(490, v0Var);
            gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.q.f34769x366c91de, v0Var);
            v0Var.f515898w = false;
            v0Var.f515895t = true;
        }
        va3.u0 u0Var2 = this.f226403z1;
        java.util.HashSet hashSet = v0Var.f515886h;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.add(new java.lang.ref.WeakReference(u0Var2));
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.u0) weakReference.get()).equals(u0Var2)) {
                break;
            }
        }
        this.f226400x1 = activity.getIntent().getStringExtra("fromWhereShare");
        if (v0Var.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealTimeLocationUI", "has join");
            this.X.e(true);
            this.f226397p0.d();
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.g0(this))) {
            return;
        }
        java.lang.String str = this.f226273s;
        int J2 = J();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.TrackRefreshManager", "track join %s", str);
        v0Var.f515897v = str;
        java.lang.String r17 = c01.z1.r();
        if (!str.contains("@chatroom")) {
            str = r17.compareTo(str) > 0 ? str.concat(r17) : r17.concat(str);
        }
        ya3.b bVar = new ya3.b(str);
        ((r45.v24) bVar.f542125e.f152243a.f152217a).f469359e = J2;
        gm0.j1.d().g(bVar);
    }
}
