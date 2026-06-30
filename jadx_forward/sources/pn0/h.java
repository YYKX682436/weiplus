package pn0;

/* loaded from: classes14.dex */
public class h extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f438488l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView f438489m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f438490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f438491o;

    /* renamed from: p, reason: collision with root package name */
    public nn0.m f438492p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f438493q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f438494r;

    public h(nn0.o oVar) {
        super(oVar);
        this.f438488l = "TextureView_Render_" + hashCode();
        this.f438489m = null;
        this.f438490n = null;
        this.f438491o = false;
        this.f438492p = null;
        this.f438493q = new java.util.HashMap();
        this.f438494r = false;
        this.f438491o = true;
    }

    @Override // pn0.a, pn0.b
    public void B(boolean z17) {
        this.f438494r = z17;
    }

    @Override // pn0.a, pn0.b
    public boolean a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        return scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null && scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a() == this.f438489m;
    }

    @Override // pn0.a, pn0.b
    public void b(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        android.view.TextureView mo46536x4ee17f0a;
        nn0.o oVar = this.f438479j;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o17 = oVar.o1();
        if (o17 != null && o17 != scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf && (mo46536x4ee17f0a = o17.mo46536x4ee17f0a()) != null) {
            o17.removeView(mo46536x4ee17f0a);
        }
        android.graphics.SurfaceTexture Da = oVar.Da();
        this.f438480k = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            android.view.TextureView mo46536x4ee17f0a2 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a();
            this.f438489m = mo46536x4ee17f0a2;
            if (mo46536x4ee17f0a2 == null) {
                android.view.TextureView textureView = new android.view.TextureView(this.f438480k.getContext());
                this.f438489m = textureView;
                this.f438480k.mo46533x473bda1f(textureView);
                this.f438489m.setOpaque(false);
                this.f438489m.setTransform(new android.graphics.Matrix());
                this.f438489m.setScaleX(1.0f);
                this.f438489m.setScaleY(1.0f);
                this.f438489m.setRotation(0.0f);
            }
        }
        java.lang.String str = "onViewRenderSet mSaveSurfaceTexture = " + Da + " mTextureView = " + this.f438489m;
        java.lang.String str2 = this.f438488l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        android.view.TextureView textureView2 = this.f438489m;
        if (textureView2 != null && Da == null) {
            textureView2.setSurfaceTextureListener(null);
        }
        if (this.f438489m.getWidth() != 0 && this.f438489m.getHeight() != 0) {
            this.f438490n = this.f438489m.getSurfaceTexture();
            this.f438470a = this.f438489m.getWidth();
            this.f438471b = this.f438489m.getHeight();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onViewRenderSet mSurfaceTexture = " + this.f438490n + " mViewWidth = " + this.f438470a + " mViewHeight = " + this.f438471b);
        }
        android.view.TextureView textureView3 = this.f438489m;
        if (textureView3 != null && this.f438474e != 1) {
            this.f438470a = textureView3.getWidth();
            this.f438471b = this.f438489m.getHeight();
            nn0.m mVar = new nn0.m(this.f438489m);
            this.f438492p = mVar;
            mVar.f(this.f438472c, this.f438473d);
            this.f438492p.g(this.f438470a, this.f438471b);
            this.f438492p.b(this.f438475f);
            this.f438492p.d(this.f438476g % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        }
        this.f438489m.setSurfaceTextureListener(new pn0.f(this));
        if (Da != null) {
            if (this.f438490n != null) {
                Da.release();
                oVar.v3(null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "not valid cacheSurfaceTexture use, use self " + this.f438489m.getSurfaceTexture() + ", cacheSurfaceTexture " + Da);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setSurfaceTexture from cacheSurfaceTexture " + this.f438489m + ", mSaveSurfaceTexture " + Da);
            try {
                this.f438489m.setSurfaceTexture(Da);
                this.f438490n = Da;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setSurfaceTexture error " + e17);
                this.f438490n = this.f438489m.getSurfaceTexture();
            }
        }
    }

    @Override // pn0.a, pn0.b
    public void c(int i17, int i18) {
        nn0.m mVar;
        boolean z17 = (this.f438472c == i17 && this.f438473d == i18) ? false : true;
        super.c(i17, i18);
        if (!z17 || (mVar = this.f438492p) == null || this.f438474e == 1) {
            return;
        }
        mVar.f(this.f438472c, this.f438473d);
    }

    @Override // pn0.b
    /* renamed from: getSurface */
    public android.view.Surface mo158745xcf572877() {
        android.graphics.SurfaceTexture surfaceTexture = this.f438490n;
        if (surfaceTexture == null) {
            return null;
        }
        java.util.HashMap hashMap = this.f438493q;
        if (hashMap.get(surfaceTexture) == null) {
            hashMap.put(this.f438490n, new android.view.Surface(this.f438490n));
        }
        return (android.view.Surface) hashMap.get(this.f438490n);
    }

    @Override // pn0.a, pn0.b
    /* renamed from: release */
    public void mo158742x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438488l, "release");
        if (fn0.g.f345728a.l()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pn0.g(this));
        }
    }

    @Override // pn0.b
    /* renamed from: reset */
    public void mo158746x6761d4f() {
    }

    @Override // pn0.a, pn0.b
    /* renamed from: setRenderMode */
    public void mo158743x638e3a5b(int i17) {
        this.f438475f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438488l, "setRenderMode: renderMode=" + i17);
        nn0.m mVar = this.f438492p;
        if (mVar == null || this.f438474e == 1) {
            return;
        }
        mVar.b(i17);
    }

    @Override // pn0.a, pn0.b
    /* renamed from: setRenderRotation */
    public void mo158744x4594f436(int i17) {
        this.f438476g = i17;
        nn0.m mVar = this.f438492p;
        if (mVar == null || this.f438474e == 1) {
            return;
        }
        mVar.d(i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
    }

    @Override // pn0.b
    /* renamed from: startPlay */
    public void mo158747x8113c2b6() {
        this.f438491o = true;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f438480k;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.m94617x2f1ab5b7();
            this.f438480k.setVisibility(0);
        }
        android.view.TextureView textureView = this.f438489m;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    @Override // pn0.b
    /* renamed from: stopPlay */
    public void mo158748x66343656(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438488l, "stopPlay saveTextureWhenStop: " + this.f438494r + " clearLastFrame = " + z17);
        if (!this.f438494r || z17) {
            this.f438491o = false;
        } else {
            this.f438491o = true;
        }
        this.f438494r = false;
        this.f438479j.v3(null);
        if (z17) {
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f438480k;
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.setVisibility(8);
            }
            android.view.TextureView textureView = this.f438489m;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
        }
    }

    @Override // pn0.a, pn0.b
    public void u(int i17, int i18) {
        super.u(i17, i18);
        nn0.m mVar = this.f438492p;
        if (mVar == null || this.f438474e == 1) {
            return;
        }
        mVar.g(this.f438470a, this.f438471b);
    }
}
