package yf;

/* loaded from: classes7.dex */
public final class e0 implements pd1.j, pd1.o, tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final yf.i0 f542870a;

    /* renamed from: b, reason: collision with root package name */
    public int f542871b;

    /* renamed from: c, reason: collision with root package name */
    public pd1.m f542872c;

    public e0(yf.i0 pluginHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginHandler, "pluginHandler");
        this.f542870a = pluginHandler;
        zf.c cVar = pluginHandler.f542898o;
        if (cVar != null) {
            bg1.h hVar = (bg1.h) cVar;
            hVar.f101432j = this;
            tf.n0.a(hVar.f101433k, this);
        }
        this.f542871b = -1;
    }

    @Override // tf.m0
    public void a() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).a(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 5;
        }
    }

    @Override // pd1.o
    public boolean b() {
        return false;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        yf.i0 i0Var = this.f542870a;
        sf.f fVar = i0Var.f542899p;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17 = tf.d.f(fVar);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.j
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 pageView, pd1.i onVideoPositionGotCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onVideoPositionGotCallback, "onVideoPositionGotCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = pageView.mo50357xcd94f799();
        yf.i0 i0Var = this.f542870a;
        if (mo50357xcd94f799 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, jsRuntime is null");
            onVideoPositionGotCallback.a(i0Var.Q, i0Var.R);
        } else {
            mo50357xcd94f799.mo14660x738236e6("document.querySelector('embed[embed-id=" + i0Var.f334030d + "]').getBoundingClientRect().toJSON()", new yf.d0(this, onVideoPositionGotCallback));
        }
    }

    @Override // tf.m0
    public void e(boolean z17) {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).e(this, z17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = z17 ? 2 : 3;
        }
    }

    @Override // tf.m0
    public void f() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).f(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 7;
        }
    }

    @Override // pd1.o
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 g() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e.U2(true, true);
    }

    @Override // pd1.o
    /* renamed from: getKey */
    public java.lang.String mo129528xb5884f29() {
        java.lang.String w17 = this.f542870a.w();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w17, "also(...)");
        return w17;
    }

    @Override // pd1.o
    /* renamed from: getType */
    public pd1.n mo129529xfb85f7b0() {
        return pd1.n.LivePusher;
    }

    @Override // pd1.o
    /* renamed from: getVideoHeight */
    public int mo129530x463504c() {
        return -1;
    }

    @Override // pd1.o
    /* renamed from: getVideoWidth */
    public int mo129531x8d5c7601() {
        return -1;
    }

    @Override // pd1.o
    public void h(pd1.m mVar) {
        this.f542872c = mVar;
        if (mVar != null) {
            switch (this.f542871b) {
                case 0:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).c(this);
                    break;
                case 1:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).b(this);
                    break;
                case 2:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).e(this, true);
                    break;
                case 3:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).e(this, false);
                    break;
                case 4:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(this);
                    break;
                case 5:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).a(this);
                    break;
                case 6:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).g(this);
                    break;
                case 7:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).f(this);
                    break;
            }
            this.f542871b = -1;
        }
    }

    @Override // pd1.j
    public int i() {
        return this.f542870a.f542900q;
    }

    @Override // pd1.j
    /* renamed from: isPlaying */
    public boolean mo129535xc00617a4() {
        yf.o oVar = this.f542870a.f542895i;
        if (oVar != null) {
            return oVar.mo176945xd057a1fe();
        }
        return false;
    }

    @Override // tf.m0
    public void j() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).c(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 0;
        }
    }

    @Override // pd1.j
    public int k() {
        return this.f542870a.f542901r;
    }

    @Override // tf.m0
    public void l() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).b(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 1;
        }
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        yf.i0 i0Var = this.f542870a;
        return new android.graphics.Point(i0Var.Q, i0Var.R);
    }

    @Override // pd1.j
    public pd1.o n() {
        return this;
    }

    public final boolean o(android.view.Surface surface) {
        yf.i0 i0Var = this.f542870a;
        yf.o oVar = i0Var.f542895i;
        if (oVar != null) {
            oVar.mo176947x42c875eb(surface);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "setSurface, Adapter is null");
        return false;
    }

    @Override // tf.m0
    /* renamed from: onPause */
    public void mo129541xb01dfb57() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 4;
        }
    }

    @Override // tf.m0
    /* renamed from: onStop */
    public void mo129542xc39f8281() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f542872c;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).g(this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f542871b = 6;
        }
    }

    public final boolean p(int i17, int i18) {
        yf.o oVar;
        yf.i0 i0Var = this.f542870a;
        i0Var.x();
        if (i17 == 0 || i18 == 0 || (oVar = i0Var.f542895i) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "setSurfaceSize, Adapter is null");
            return false;
        }
        oVar.mo176948x1c9cdc8c(i17, i18);
        return true;
    }

    @Override // pd1.o
    /* renamed from: pause */
    public void mo129532x65825f6() {
        yf.i0 i0Var = this.f542870a;
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "pauseExternal");
        i0Var.H = true;
        i0Var.G(new yf.RunnableC30778x5de01a9(i0Var, "pause"));
    }

    @Override // pd1.o
    /* renamed from: release */
    public void mo129533x41012807() {
        final yf.i0 i0Var = this.f542870a;
        i0Var.H = false;
        i0Var.G(new java.lang.Runnable() { // from class: yf.i0$$n
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.E();
            }
        });
    }

    @Override // pd1.o
    /* renamed from: start */
    public void mo129534x68ac462() {
        yf.i0 i0Var = this.f542870a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "startExternal mHadPauseFromExternal:%b mAdapter.isPushing():%b", java.lang.Boolean.valueOf(i0Var.H), java.lang.Boolean.valueOf(((yf.n1) i0Var.f542895i).mo176945xd057a1fe()));
        yf.o oVar = i0Var.f542895i;
        if (oVar != null && !((yf.n1) oVar).mo176945xd057a1fe()) {
            i0Var.G(new yf.RunnableC30778x5de01a9(i0Var, "start"));
        } else if (i0Var.H && ((yf.n1) i0Var.f542895i).mo176945xd057a1fe()) {
            i0Var.G(new yf.RunnableC30778x5de01a9(i0Var, "resume"));
        }
        i0Var.H = false;
    }
}
