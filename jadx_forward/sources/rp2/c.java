package rp2;

/* loaded from: classes3.dex */
public final class c implements ws5.f {

    /* renamed from: d, reason: collision with root package name */
    public final rp2.a f480105d;

    /* renamed from: e, reason: collision with root package name */
    public mn0.b0 f480106e;

    /* renamed from: f, reason: collision with root package name */
    public cw2.d4 f480107f;

    /* renamed from: g, reason: collision with root package name */
    public final int f480108g;

    /* renamed from: h, reason: collision with root package name */
    public final int f480109h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f480110i;

    public c(rp2.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f480105d = config;
        this.f480108g = -1;
        this.f480109h = -1;
    }

    @Override // ws5.f
    public android.view.View H() {
        return a();
    }

    public final cw2.d4 a() {
        cw2.d4 d4Var = this.f480107f;
        if (d4Var != null) {
            return d4Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public mn0.b0 e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePreloadVideoView", "disConnectPlayer player:" + this.f480106e);
        mn0.b0 b0Var = this.f480106e;
        this.f480106e = null;
        pm0.v.B(a());
        return b0Var;
    }

    @Override // ws5.f
    public void c(yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4) {
    }

    @Override // ws5.f
    public android.view.View f() {
        android.view.ViewGroup viewGroup = this.f480105d.f480100a;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: getBindFeedId */
    public long mo58373xc51e5ec() {
        return this.f480105d.f480103d;
    }

    @Override // ws5.f
    /* renamed from: getCoverView */
    public android.view.View mo58374x756ec046() {
        return a();
    }

    @Override // ws5.f
    /* renamed from: getLivePlayer */
    public java.lang.Object mo58375x1c918ee3() {
        return this.f480106e;
    }

    @Override // ws5.f
    public int getPlayStatus() {
        return 0;
    }

    @Override // ws5.f
    /* renamed from: getStreamId */
    public java.lang.String mo58381xe699b631() {
        ko0.t tVar = ko0.t.f391436a;
        mn0.b0 b0Var = this.f480106e;
        return tVar.d(b0Var != null ? ((mn0.y) b0Var).f411348q : null);
    }

    @Override // ws5.f
    /* renamed from: getTextureView */
    public android.view.TextureView mo58382x3a06c52a() {
        return a().mo46536x4ee17f0a();
    }

    @Override // ws5.f
    /* renamed from: getVideoHeight */
    public int getA() {
        int i17 = this.f480109h;
        if (i17 > 0) {
            return i17;
        }
        android.view.ViewGroup viewGroup = this.f480105d.f480100a;
        if (viewGroup != null) {
            return viewGroup.getMeasuredHeight();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: getVideoRatioWH */
    public float getB() {
        return 0.0f;
    }

    @Override // ws5.f
    /* renamed from: getVideoWidth */
    public int getF212290z() {
        int i17 = this.f480108g;
        if (i17 > 0) {
            return i17;
        }
        android.view.ViewGroup viewGroup = this.f480105d.f480100a;
        if (viewGroup != null) {
            return viewGroup.getMeasuredWidth();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: isMute */
    public boolean getF212277m() {
        return false;
    }

    @Override // ws5.f
    /* renamed from: isPlaying */
    public boolean mo58387xc00617a4() {
        mn0.b0 b0Var = this.f480106e;
        return b0Var != null && ((mn0.y) b0Var).b(false);
    }

    @Override // ws5.f
    /* renamed from: k */
    public boolean getIsPauseToRemovePlayer() {
        return this.f480110i;
    }

    @Override // ws5.f
    /* renamed from: o */
    public boolean getF212288x() {
        return false;
    }

    @Override // ws5.f
    /* renamed from: pause */
    public boolean mo58388x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "pause");
        mn0.b0 b0Var = this.f480106e;
        if (b0Var != null) {
            mn0.b0.M(b0Var, false, 1, null);
        }
        return true;
    }

    @Override // ws5.f
    public java.lang.Object q() {
        this.f480110i = true;
        return e();
    }

    @Override // ws5.f
    /* renamed from: release */
    public void mo58389x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "release");
        mn0.b0 b0Var = this.f480106e;
        if (b0Var != null) {
            mn0.b0.C(b0Var, true, false, false, 6, null);
        }
        mn0.b0 b0Var2 = this.f480106e;
        if (b0Var2 != null) {
            mn0.b0.B(b0Var2, null, null, 2, null);
        }
        pm0.v.B(a());
    }

    @Override // ws5.f
    /* renamed from: resume */
    public void mo58390xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "resume");
    }

    @Override // ws5.f
    /* renamed from: setMute */
    public void mo58394x764d819b(boolean z17) {
        mn0.b0 b0Var = this.f480106e;
        if (b0Var != null) {
            ((mn0.y) b0Var).G(z17);
        }
    }

    @Override // ws5.f
    /* renamed from: stop */
    public void mo58404x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "stop");
        mo58389x41012807();
    }
}
