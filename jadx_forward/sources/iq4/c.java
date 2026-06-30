package iq4;

/* loaded from: classes14.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d {

    /* renamed from: n, reason: collision with root package name */
    public long f375332n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f375333o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f375334p;

    public c(iq4.a aVar) {
        b(9, "VOIPFloatBall");
        t().f174619f = 10;
        if (gq4.v.Bi() != null) {
            t().f174620g = java.lang.String.valueOf(gq4.v.Bi().n());
        }
        g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, currentSituation:%s", java.lang.Long.valueOf(this.f375333o));
        if (gq4.v.Bi().f258095e) {
            return;
        }
        if (iq.b.H()) {
            ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(false);
        } else if (iq.b.j() != 0) {
            ((jp5.o) i95.n0.c(jp5.o.class)).K8();
        }
    }

    public void e0(int i17, boolean z17, android.view.View view, long j17, boolean z18) {
        if (view != null) {
            if (i17 == 4 || i17 == 8) {
                if (!u()) {
                    iq4.a aVar = new iq4.a(this, i17, view, z17, z18, j17);
                    long j18 = this.f375332n + 200;
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = j18 - java.lang.System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        aVar.run();
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, add delayed:%s", java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aVar, currentTimeMillis);
                    this.f375334p = new java.lang.ref.WeakReference(aVar);
                    return;
                }
                if (this.f174665d.f174583h == view) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", java.lang.Integer.valueOf(i17), view);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", java.lang.Integer.valueOf(i17), view, this.f174665d.f174583h);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
                c12886x91aa2b6d.I = true;
                c12886x91aa2b6d.f174583h = view;
                c12886x91aa2b6d.f174578J = false;
                c12886x91aa2b6d.f174591s = false;
                c12886x91aa2b6d.F = true;
                if (!z17) {
                    c12886x91aa2b6d.H = i17;
                } else if (i17 == 4) {
                    c12886x91aa2b6d.H = 512;
                } else if (i17 == 8) {
                    c12886x91aa2b6d.H = 1024;
                }
                h0(i17, z17, z18);
                g0(i17, z17);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
                this.f375333o = j17;
                j();
            }
        }
    }

    public void f0(android.widget.FrameLayout frameLayout) {
        java.lang.ref.WeakReference weakReference = this.f375334p;
        if (weakReference != null && weakReference.get() != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l((java.lang.Runnable) this.f375334p.get());
            this.f375334p = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, canceled delayed add runnable");
        }
        if (!u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, no ball, view:%s", frameLayout);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "removeVoipView, has ball, view:%s", frameLayout);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f375332n = java.lang.System.currentTimeMillis();
        this.f375333o = 0L;
        d();
    }

    public final void g0(int i17, boolean z17) {
        if (z17 || i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            if (c12886x91aa2b6d.P == null) {
                c12886x91aa2b6d.P = new np1.c();
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            int e17 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0y);
            int e18 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0y);
            int e19 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0x);
            this.f174665d.P.f420324a = new android.graphics.Point(e17, e19);
            this.f174665d.P.f420325b = new android.graphics.Point(e18, e19);
            return;
        }
        if (i17 != 4) {
            this.f174665d.P = null;
            return;
        }
        com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int e27 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f562053a10);
        int e28 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0z);
        int e29 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0w);
        int e37 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0v);
        this.f174665d.P.f420324a = new android.graphics.Point(e27, e28);
        this.f174665d.P.f420325b = new android.graphics.Point(e29, e37);
        np1.c cVar = this.f174665d.P;
        android.graphics.Point point = cVar.f420324a;
        android.graphics.Point point2 = cVar.f420325b;
    }

    public void h0(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d.f174584i == null) {
            c12886x91aa2b6d.f174584i = new android.graphics.Point();
        }
        com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        if (i17 == 8) {
            if (z17) {
                this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0y);
                this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0x);
            } else {
                this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0w);
                this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0v);
            }
        } else if (i17 == 4) {
            if (z17) {
                this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0y);
                this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0x);
            } else {
                this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f562053a10);
                this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.a0z);
            }
        }
        if (z18) {
            android.graphics.Point point = this.f174665d.f174584i;
            int i18 = point.x;
            point.x = point.y;
            point.y = i18;
        }
        android.graphics.Point point2 = this.f174665d.f174584i;
    }
}
