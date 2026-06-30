package qa1;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.h f442526d;

    public g(qa1.h hVar) {
        this.f442526d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f442526d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", java.lang.Boolean.valueOf(hVar.f442533p.get()));
        try {
            if (hVar.f442533p.get()) {
                qa1.h.a(hVar, hVar.f442532o.b());
                hVar.f442533p.getAndSet(false);
                ms0.c cVar = hVar.f442531n;
                if (cVar != null) {
                    cVar.n(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: no renderer!");
                }
                rs0.h hVar2 = hVar.f442528h;
                if (hVar2 != null) {
                    android.opengl.EGL14.eglDestroyContext(hVar2.f480825a, hVar2.f480827c);
                    rs0.h hVar3 = hVar.f442528h;
                    android.opengl.EGL14.eglDestroySurface(hVar3.f480825a, hVar3.f480826b);
                    hVar.f442527g.release();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewGLTextureView", th6, "hy: error in surface destroy!!", new java.lang.Object[0]);
        }
    }
}
