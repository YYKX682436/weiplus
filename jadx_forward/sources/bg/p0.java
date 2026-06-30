package bg;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f101358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f101359e;

    public p0(bg.f fVar, android.view.Surface surface) {
        this.f101359e = fVar;
        this.f101358d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101359e;
        android.view.Surface surface = this.f101358d;
        fVar.f101296g = surface;
        if (fVar.f101297h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "replaceSurfaceTextureInternal, setSurface:%s", surface);
            fVar.f101297h.mo1864x42c875eb(fVar.f101296g);
        }
    }
}
