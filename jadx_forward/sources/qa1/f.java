package qa1;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.h f442515d;

    public f(qa1.h hVar) {
        this.f442515d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.h hVar = this.f442515d;
        try {
            if (hVar.f442531n.f412496s) {
                android.graphics.SurfaceTexture b17 = hVar.f442532o.b();
                java.util.Objects.requireNonNull(b17);
                b17.updateTexImage();
                hVar.f442531n.onDrawFrame(null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: renderer already released!");
            }
            if (!hVar.f442533p.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraPreviewGLTextureView", "hy: can not render because already destroyed");
                return;
            }
            rs0.h hVar2 = hVar.f442528h;
            if (hVar2 != null) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar2.f480825a, hVar2.f480826b, java.lang.System.nanoTime());
                rs0.h hVar3 = hVar.f442528h;
                android.opengl.EGL14.eglSwapBuffers(hVar3.f480825a, hVar3.f480826b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewGLTextureView", th6, "hy: encounter exception! gl get error: %d", java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(808L, 2L, 1L, true);
        }
    }
}
