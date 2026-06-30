package ql2;

/* loaded from: classes10.dex */
public final class r extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final pj4.t f446075e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f446076f;

    /* renamed from: g, reason: collision with root package name */
    public int f446077g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g92 f446078h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.C25485x5a0a6891 f446079i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f446080m;

    /* renamed from: n, reason: collision with root package name */
    public final ql2.n f446081n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f446082o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec f446083p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f446084q;

    /* renamed from: r, reason: collision with root package name */
    public f25.m0 f446085r;

    static {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public r(java.lang.String str, android.widget.FrameLayout frameLayout, pj4.j0 j0Var, pj4.t tVar, java.util.Map liveInfoCache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfoCache, "liveInfoCache");
        this.f446075e = tVar;
        this.f446076f = liveInfoCache;
        this.f446081n = new ql2.n(this);
        android.view.View inflate = android.view.View.inflate(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30864xbddafb2a.axv, null);
        this.f446082o = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.fjk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f446083p = (com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec) findViewById;
        if (frameLayout != null) {
            frameLayout.addView(inflate);
        }
        n();
    }

    @Override // al5.a0
    public void g() {
        this.f87395d = false;
        n();
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return "LivePullDownView";
    }

    @Override // al5.a0
    public void h() {
        this.f87395d = true;
        boolean z17 = false;
        if (this.f446084q || iq.b.y() || iq.b.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false)) {
            m();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f340650c, new ql2.p(this));
            this.f446085r = m96;
            if (m96 != null && ((g25.e) m96).f349513c) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446079i;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94522x764d819b(true ^ z17);
        }
        o();
    }

    @Override // al5.a0
    public void i() {
    }

    @Override // al5.a0
    public void j() {
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public final void m() {
        f25.m0 m0Var = this.f446085r;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f446085r = null;
    }

    public final void n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToImage liveId:");
        r45.g92 g92Var = this.f446078h;
        sb6.append(g92Var != null ? g92Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        this.f446077g = 0;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446079i;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.mo94537x66343656(true);
        }
        m();
    }

    public final void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToVideo liveId:");
        r45.g92 g92Var = this.f446078h;
        sb6.append(g92Var != null ? g92Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        this.f446077g = 1;
        r45.g92 g92Var2 = this.f446078h;
        if (g92Var2 != null) {
            r45.nw1 nw1Var = (r45.nw1) this.f446076f.get(g92Var2.m75945x2fec8307(0));
            if (nw1Var != null && nw1Var.m75939xb282bd08(2) != 2) {
                ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446079i;
                if (c25485x5a0a6891 != null) {
                    c25485x5a0a6891.mo94535x5c1200c2(nw1Var.m75945x2fec8307(3), 1);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("switchToVideo streamUrl:");
            sb7.append(nw1Var != null ? nw1Var.m75945x2fec8307(3) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb7.toString());
        }
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        m();
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    public final void p(r45.g92 g92Var) {
        java.lang.String m75945x2fec8307;
        if (g92Var == null) {
            return;
        }
        this.f446078h = g92Var;
        java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(1);
        r45.g92 g92Var2 = this.f446078h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "tryGetLiveInfo anchorUsername:" + m75945x2fec83072 + " liveId:" + (g92Var2 != null ? g92Var2.m75945x2fec8307(0) : null));
        r45.g92 g92Var3 = this.f446078h;
        if (g92Var3 != null) {
            java.lang.String m75945x2fec83073 = g92Var3.m75945x2fec8307(0);
            java.util.Map map = this.f446076f;
            r45.nw1 nw1Var = (r45.nw1) map.get(m75945x2fec83073);
            if (nw1Var == null || nw1Var.m75939xb282bd08(2) != 2) {
                java.lang.String m75945x2fec83074 = g92Var3.m75945x2fec8307(1);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                new ek2.y0(m75945x2fec83074, new ql2.o(this)).l();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryGetLiveInfo cacheLiveStatus:");
            r45.nw1 nw1Var2 = (r45.nw1) map.get(g92Var3.m75945x2fec8307(0));
            sb6.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(2)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        }
        this.f446079i = new com.p314xaae8f345.p2926x359365.C25485x5a0a6891(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946 = new com.p314xaae8f345.p2926x359365.C25484xcc963946();
        c25484xcc963946.m94495x228612f(false);
        c25484xcc963946.m94505xe33b97ef(5.0f);
        c25484xcc963946.m94506x3bb0e441(5.0f);
        c25484xcc963946.m94496x3ac2172d(5.0f);
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446079i;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.mo94524x9951f728(null);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68912 = this.f446079i;
        if (c25485x5a0a68912 != null) {
            c25485x5a0a68912.mo94523xbdb2cd8a(this.f446081n);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68913 = this.f446079i;
        if (c25485x5a0a68913 != null) {
            c25485x5a0a68913.m94513x8ee3e659(true);
        }
        hn0.w.f363976a.a("LivePullDownView");
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68914 = this.f446079i;
        if (c25485x5a0a68914 != null) {
            c25485x5a0a68914.m94521x78bda44(c25484xcc963946);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68915 = this.f446079i;
        if (c25485x5a0a68915 != null) {
            c25485x5a0a68915.mo94525x638e3a5b(0);
        }
        pj4.t tVar = this.f446075e;
        java.lang.Integer valueOf = tVar != null ? java.lang.Integer.valueOf(tVar.f436822e) : null;
        this.f446084q = valueOf != null && valueOf.intValue() == 0;
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec textureViewSurfaceTextureListenerC22777xe1200dec = this.f446083p;
        textureViewSurfaceTextureListenerC22777xe1200dec.m82500x9972f526().d();
        textureViewSurfaceTextureListenerC22777xe1200dec.m82504x55ebdf50(new ql2.m(this));
        r45.g92 g92Var4 = this.f446078h;
        if (g92Var4 == null || (m75945x2fec8307 = g92Var4.m75945x2fec8307(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(m75945x2fec8307), false, null, new ql2.q(this), 0, null, null, null, 246, null);
    }
}
