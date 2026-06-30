package ql2;

/* loaded from: classes10.dex */
public final class d0 extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f446036e;

    /* renamed from: f, reason: collision with root package name */
    public int f446037f;

    /* renamed from: g, reason: collision with root package name */
    public r45.g92 f446038g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.C25485x5a0a6891 f446039h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f446040i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec f446041m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f446042n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f446043o;

    /* renamed from: p, reason: collision with root package name */
    public f25.m0 f446044p;

    static {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public d0(java.lang.String str, android.widget.FrameLayout frameLayout, pj4.j0 j0Var, pj4.t tVar, java.util.Map liveInfoCache) {
        java.lang.String m75945x2fec8307;
        java.util.Map d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfoCache, "liveInfoCache");
        this.f446036e = liveInfoCache;
        ql2.a0 a0Var = new ql2.a0(this);
        android.view.View inflate = android.view.View.inflate(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30864xbddafb2a.axv, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.fjk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec textureViewSurfaceTextureListenerC22777xe1200dec = (com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991.TextureViewSurfaceTextureListenerC22777xe1200dec) findViewById;
        this.f446041m = textureViewSurfaceTextureListenerC22777xe1200dec;
        if (frameLayout != null) {
            frameLayout.addView(inflate);
        }
        o();
        if (j0Var != null && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j0Var.f436674f, "finderLive", null)) != null) {
            this.f446038g = zy2.d5.l("", d17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryGetLiveInfo anchorUsername:");
        r45.g92 g92Var = this.f446038g;
        sb6.append(g92Var != null ? g92Var.m75945x2fec8307(1) : null);
        sb6.append(" liveId:");
        r45.g92 g92Var2 = this.f446038g;
        sb6.append(g92Var2 != null ? g92Var2.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        r45.g92 g92Var3 = this.f446038g;
        if (g92Var3 != null) {
            r45.nw1 nw1Var = (r45.nw1) liveInfoCache.get(g92Var3.m75945x2fec8307(0));
            if (nw1Var == null || nw1Var.m75939xb282bd08(2) != 2) {
                java.lang.String m75945x2fec83072 = g92Var3.m75945x2fec8307(1);
                new ek2.y0(m75945x2fec83072 != null ? m75945x2fec83072 : "", new ql2.b0(this)).l();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryGetLiveInfo cacheLiveStatus:");
            r45.nw1 nw1Var2 = (r45.nw1) liveInfoCache.get(g92Var3.m75945x2fec8307(0));
            sb7.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(2)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb7.toString());
        }
        this.f446039h = new com.p314xaae8f345.p2926x359365.C25485x5a0a6891(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946 = new com.p314xaae8f345.p2926x359365.C25484xcc963946();
        c25484xcc963946.m94495x228612f(false);
        c25484xcc963946.m94505xe33b97ef(5.0f);
        c25484xcc963946.m94506x3bb0e441(5.0f);
        c25484xcc963946.m94496x3ac2172d(5.0f);
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446039h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.mo94524x9951f728(null);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68912 = this.f446039h;
        if (c25485x5a0a68912 != null) {
            c25485x5a0a68912.mo94523xbdb2cd8a(a0Var);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68913 = this.f446039h;
        if (c25485x5a0a68913 != null) {
            c25485x5a0a68913.m94513x8ee3e659(true);
        }
        hn0.w.f363976a.a("LivePullDownView");
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68914 = this.f446039h;
        if (c25485x5a0a68914 != null) {
            c25485x5a0a68914.m94521x78bda44(c25484xcc963946);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68915 = this.f446039h;
        if (c25485x5a0a68915 != null) {
            c25485x5a0a68915.mo94525x638e3a5b(0);
        }
        java.lang.Integer valueOf = tVar != null ? java.lang.Integer.valueOf(tVar.f436822e) : null;
        boolean z17 = valueOf != null && valueOf.intValue() == 0;
        this.f446042n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "initPlayer: isMute = " + z17 + ", shouldMute = " + m());
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68916 = this.f446039h;
        if (c25485x5a0a68916 != null) {
            c25485x5a0a68916.m94522x764d819b(m());
        }
        textureViewSurfaceTextureListenerC22777xe1200dec.m82500x9972f526().d();
        textureViewSurfaceTextureListenerC22777xe1200dec.m82504x55ebdf50(new ql2.z(this));
        r45.g92 g92Var4 = this.f446038g;
        if (g92Var4 == null || (m75945x2fec8307 = g92Var4.m75945x2fec8307(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(m75945x2fec8307), false, null, new ql2.y(inflate), 0, null, null, null, 246, null);
    }

    @Override // al5.a0
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", "applyMute: " + z17);
        this.f446043o = z17;
        q(z17);
    }

    @Override // al5.a0
    public boolean f() {
        return true;
    }

    @Override // al5.a0
    public void g() {
        this.f87395d = false;
        o();
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return "LivePullDownView";
    }

    @Override // al5.a0
    public void h() {
        boolean z17 = true;
        this.f87395d = true;
        if (!m() && !iq.b.y() && !iq.b.F(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false)) {
            z17 = false;
        }
        q(z17);
        p();
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

    public final boolean m() {
        return this.f446042n || this.f446043o;
    }

    public final void n() {
        f25.m0 m0Var = this.f446044p;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f446044p = null;
    }

    public final void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToImage liveId:");
        r45.g92 g92Var = this.f446038g;
        sb6.append(g92Var != null ? g92Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        this.f446037f = 0;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446039h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.mo94537x66343656(true);
        }
        n();
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        n();
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }

    public final void p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToVideo liveId:");
        r45.g92 g92Var = this.f446038g;
        sb6.append(g92Var != null ? g92Var.m75945x2fec8307(0) : null);
        sb6.append(", shouldMute=");
        sb6.append(m());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb6.toString());
        r45.g92 g92Var2 = this.f446038g;
        if (g92Var2 != null) {
            this.f446037f = 1;
            r45.nw1 nw1Var = (r45.nw1) this.f446036e.get(g92Var2.m75945x2fec8307(0));
            if (nw1Var != null && nw1Var.m75939xb282bd08(2) != 2) {
                ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446039h;
                if (c25485x5a0a6891 != null) {
                    c25485x5a0a6891.m94522x764d819b(m());
                }
                com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68912 = this.f446039h;
                if (c25485x5a0a68912 != null) {
                    c25485x5a0a68912.mo94535x5c1200c2(nw1Var.m75945x2fec8307(3), 1);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("switchToVideo streamUrl:");
            sb7.append(nw1Var != null ? nw1Var.m75945x2fec8307(3) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePullDownView", sb7.toString());
        }
    }

    public final void q(boolean z17) {
        boolean z18 = false;
        if (z17) {
            n();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f340650c, new ql2.c0(this));
            this.f446044p = m96;
            if (m96 != null && ((g25.e) m96).f349513c) {
                z18 = true;
            }
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f446039h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94522x764d819b(true ^ z18);
        }
    }
}
