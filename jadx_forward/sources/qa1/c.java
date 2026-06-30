package qa1;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f442504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qa1.h f442505g;

    public c(qa1.h hVar, int i17, int i18, android.graphics.SurfaceTexture surfaceTexture) {
        this.f442505g = hVar;
        this.f442502d = i17;
        this.f442503e = i18;
        this.f442504f = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f442505g;
        hVar.getClass();
        android.graphics.SurfaceTexture surfaceTexture = this.f442504f;
        hVar.f442527g = surfaceTexture;
        hVar.f442528h = rs0.i.f480829a.m(new android.view.Surface(surfaceTexture), null, 0, 0, android.opengl.EGL14.EGL_NO_CONTEXT);
        ms0.c cVar = hVar.f442531n;
        int i17 = this.f442502d;
        int i18 = this.f442503e;
        if (cVar != null) {
            cVar.onSurfaceCreated(null, null);
            hVar.f442531n.t(i17, i18);
            hVar.f442531n.u(i17, i18);
            hVar.f442531n.k(true);
        }
        super/*gh.k*/.onSurfaceTextureAvailable(hVar.f442532o.b(), i17, i18);
        hVar.f442533p.getAndSet(true);
    }
}
