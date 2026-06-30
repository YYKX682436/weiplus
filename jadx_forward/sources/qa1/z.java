package qa1;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f442563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.o f442564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f442565f;

    public z(qa1.f0 f0Var, android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        this.f442565f = f0Var;
        this.f442563d = surfaceHolder;
        this.f442564e = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f442565f.f442519g = this.f442563d.getSurface();
        android.view.Surface surface = this.f442565f.f442519g;
        if (surface == null || !surface.isValid()) {
            android.view.Surface surface2 = this.f442565f.f442519g;
            if (surface2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is null!");
            } else if (!surface2.isValid()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is disable!");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface switch to record!");
            this.f442565f.f442525p = true;
            qa1.f0 f0Var = this.f442565f;
            f0Var.f442520h = rs0.i.f480829a.m(f0Var.f442519g, null, 0, 0, android.opengl.EGL14.EGL_NO_CONTEXT);
            ms0.c cVar = this.f442565f.f442521i;
            if (cVar != null) {
                cVar.onSurfaceCreated(null, null);
                android.graphics.Rect surfaceFrame = this.f442563d.getSurfaceFrame();
                this.f442565f.f442521i.t(surfaceFrame.width(), surfaceFrame.height());
                this.f442565f.f442521i.u(surfaceFrame.width(), surfaceFrame.height());
                this.f442565f.f442521i.k(true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "renderer is null!");
            }
        }
        this.f442565f.f442516d.e(this.f442563d);
        this.f442565f.f442516d.b(this.f442564e);
    }
}
