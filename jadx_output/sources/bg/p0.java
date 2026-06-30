package bg;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f19825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f19826e;

    public p0(bg.f fVar, android.view.Surface surface) {
        this.f19826e = fVar;
        this.f19825d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19826e;
        android.view.Surface surface = this.f19825d;
        fVar.f19763g = surface;
        if (fVar.f19764h != null) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "replaceSurfaceTextureInternal, setSurface:%s", surface);
            fVar.f19764h.setSurface(fVar.f19763g);
        }
    }
}
