package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class f6 implements oc5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282452a;

    public f6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282452a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // oc5.n
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        java.lang.Integer e17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282452a;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        java.lang.String x27 = viewOnClickListenerC21748xb3d38e6b.x2();
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(x27, false);
        if (i18 == null || !i18.equals(c5886xd11a0be7.f136194g.f87901a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        this.f282452a.W2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f282452a.X2.longValue());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n8 n8Var = this.f282452a.E3;
        n8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        n8Var.f282753a = 2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
        java.util.ArrayList a17 = s6Var.a(c5886xd11a0be7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess data size: %d, recognizeType: %d, curPath: %s, path: %s", java.lang.Integer.valueOf(a17.size()), java.lang.Integer.valueOf(c5886xd11a0be7.f136194g.f87911k), i18, x27);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a17)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282452a;
            oc5.g0 g0Var = viewOnClickListenerC21748xb3d38e6b2.f282202w2;
            if (g0Var != null) {
                g0Var.f425963n = c5886xd11a0be7.f136194g.f87914n;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = viewOnClickListenerC21748xb3d38e6b2.f282144g.y(viewOnClickListenerC21748xb3d38e6b2.O3);
            java.lang.String valueOf = y17 != null ? java.lang.String.valueOf(y17.I0()) : null;
            oc5.l0 l0Var = this.f282452a.f282196u2;
            l0Var.getClass();
            l0Var.f425984a.clear();
            l0Var.f425985b = null;
            l0Var.f425986c = null;
            l0Var.f425984a = s6Var.a(c5886xd11a0be7);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b3 = this.f282452a;
            oc5.l0 l0Var2 = viewOnClickListenerC21748xb3d38e6b3.f282196u2;
            l0Var2.f425996m = i18;
            l0Var2.f425997n = valueOf;
            viewOnClickListenerC21748xb3d38e6b3.f282207x2.g(2, 1);
            oc5.m mVar = this.f282452a.f282207x2;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q5 q5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q5(this);
            mVar.getClass();
            oc5.e eVar = (oc5.e) mVar.f425999b.get(2);
            if (eVar != null) {
                oc5.f fVar = (oc5.f) eVar;
                if (!fVar.f425942b || ((e17 = mVar.e(2)) != null && e17.intValue() == 4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageScanButtonStatusManager", "postAction action not enable or overTimeLimit: %d", 2);
                } else if (fVar.b()) {
                    mVar.c(2, new oc5.j(mVar));
                    q5Var.run();
                } else {
                    eVar.a();
                    mVar.b(2);
                    java.util.HashMap hashMap = mVar.f426001d;
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    oc5.k kVar = new oc5.k(mVar, 2, q5Var);
                    long a18 = eVar.a();
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    wu5.c z17 = t0Var.z(kVar, a18, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "uiDelay(...)");
                    hashMap.put(2, z17);
                }
            }
            if (2 == c5886xd11a0be7.f136194g.f87911k) {
                if (this.f282452a.f282196u2.f425984a.size() == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) this.f282452a.f282196u2.f425984a.get(0);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b4 = this.f282452a;
                    oc5.l0 l0Var3 = viewOnClickListenerC21748xb3d38e6b4.f282196u2;
                    l0Var3.f425986c = c17261xe88a6357;
                    l0Var3.f425985b = null;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) viewOnClickListenerC21748xb3d38e6b4.Z2).j(c17261xe88a6357.f240153e, viewOnClickListenerC21748xb3d38e6b4.N7(c17261xe88a6357.f240152d), 1000L);
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b5 = this.f282452a;
                    java.util.ArrayList arrayList = (java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.a(viewOnClickListenerC21748xb3d38e6b5, viewOnClickListenerC21748xb3d38e6b5.L7(viewOnClickListenerC21748xb3d38e6b5.f282144g, viewOnClickListenerC21748xb3d38e6b5.f282170n), this.f282452a.f282196u2.f425984a, 0).f384366d;
                    if (arrayList.size() == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a63572 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b6 = this.f282452a;
                        oc5.l0 l0Var4 = viewOnClickListenerC21748xb3d38e6b6.f282196u2;
                        l0Var4.f425985b = c17261xe88a63572;
                        l0Var4.f425986c = c17261xe88a63572;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) viewOnClickListenerC21748xb3d38e6b6.Z2).j(c17261xe88a63572.f240153e, viewOnClickListenerC21748xb3d38e6b6.N7(c17261xe88a63572.f240152d), 1000L);
                    } else {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b7 = this.f282452a;
                        oc5.l0 l0Var5 = viewOnClickListenerC21748xb3d38e6b7.f282196u2;
                        l0Var5.f425985b = null;
                        l0Var5.f425986c = null;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = viewOnClickListenerC21748xb3d38e6b7.f282184q2;
                        if (k0Var2 != null && k0Var2.i()) {
                            this.f282452a.n9(false);
                        }
                    }
                }
            }
        }
        if (this.f282452a.u8()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b8 = this.f282452a;
        if (c01.ia.C(viewOnClickListenerC21748xb3d38e6b8.f282144g.y(viewOnClickListenerC21748xb3d38e6b8.O3)) || (k0Var = this.f282452a.f282184q2) == null || !k0Var.i() || this.f282452a.H3 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, show enhance bottomSheet");
        this.f282452a.H3.o(zh1.y0.ENABLE);
    }

    @Override // oc5.n
    public void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282452a;
        java.lang.String x27 = viewOnClickListenerC21748xb3d38e6b.x2();
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(x27, false);
        if (i18 == null || !i18.equals(c5885x60bd3c7.f136193g.f87811a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        am.bq bqVar = c5885x60bd3c7.f136193g;
        if (bqVar.f87813c && bqVar.f87812b == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282452a;
            viewOnClickListenerC21748xb3d38e6b2.u7(2, viewOnClickListenerC21748xb3d38e6b2.K7(viewOnClickListenerC21748xb3d38e6b2.f282144g, viewOnClickListenerC21748xb3d38e6b2.f282170n), com.p314xaae8f345.mm.vfs.w6.i(x27, false), null, true, viewOnClickListenerC21748xb3d38e6b.f282157j3);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n8 n8Var = viewOnClickListenerC21748xb3d38e6b.E3;
        n8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        n8Var.f282753a = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "scanCode onFailed result: %s, curPath: %s, path: %s", null, i18, x27);
        if (viewOnClickListenerC21748xb3d38e6b.f282207x2.d(2, 2) != 1) {
            viewOnClickListenerC21748xb3d38e6b.f282207x2.g(2, 2);
        }
        if (viewOnClickListenerC21748xb3d38e6b.u8() || (k0Var = viewOnClickListenerC21748xb3d38e6b.f282184q2) == null || !k0Var.i() || viewOnClickListenerC21748xb3d38e6b.H3 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "scanCode onFailed, show enhance bottomSheet");
        viewOnClickListenerC21748xb3d38e6b.H3.o(zh1.y0.ENABLE);
    }

    @Override // oc5.n
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n8 n8Var = this.f282452a.E3;
        if (n8Var != null) {
            n8Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, realScanImgPath: " + str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = n8Var.f282754b;
            int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.vfs.w6.i(viewOnClickListenerC21748xb3d38e6b.x2(), false), str)) {
                n8Var.f282753a = 1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onScanStart#ScanState, not match");
            }
        }
    }
}
