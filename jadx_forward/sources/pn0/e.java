package pn0;

/* loaded from: classes14.dex */
public class e extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f438483l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Surface f438484m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.SurfaceHolder.Callback f438485n;

    public e(nn0.o oVar) {
        super(oVar);
        this.f438483l = "SurfaceView_Render_" + hashCode();
        this.f438485n = new pn0.d(this);
    }

    @Override // pn0.a, pn0.b
    public void b(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f438480k = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        android.view.SurfaceView f150155g = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g();
        java.lang.String str = this.f438483l;
        if (f150155g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "surfaceView = null");
            return;
        }
        android.view.Surface surface = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g().getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onViewRenderSet no valid surface can use");
        } else {
            android.graphics.Rect surfaceFrame = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g().getHolder().getSurfaceFrame();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onViewRenderSet surace valid = " + surface + " width = " + surfaceFrame.width() + " height = " + surfaceFrame.height());
            u(surfaceFrame.width(), surfaceFrame.height());
            this.f438484m = surface;
            this.f438478i = false;
        }
        scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getF150155g().getHolder().addCallback(this.f438485n);
    }

    @Override // pn0.b
    /* renamed from: getSurface */
    public android.view.Surface mo158745xcf572877() {
        return this.f438484m;
    }

    @Override // pn0.b
    /* renamed from: reset */
    public void mo158746x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438483l, "reset");
        android.view.SurfaceView f150155g = this.f438480k.getF150155g();
        if (f150155g != null) {
            f150155g.getHolder().removeCallback(this.f438485n);
        }
    }

    @Override // pn0.b
    /* renamed from: startPlay */
    public void mo158747x8113c2b6() {
    }

    @Override // pn0.b
    /* renamed from: stopPlay */
    public void mo158748x66343656(boolean z17) {
    }
}
