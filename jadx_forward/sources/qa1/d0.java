package qa1;

/* loaded from: classes14.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f442511d;

    public d0(qa1.f0 f0Var) {
        this.f442511d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.f0 f0Var = this.f442511d;
        try {
            if (f0Var.f442521i.f412496s) {
                android.graphics.SurfaceTexture b17 = f0Var.f442522m.b();
                java.util.Objects.requireNonNull(b17);
                b17.updateTexImage();
                f0Var.f442521i.onDrawFrame(null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: renderer already released!");
            }
            if (!f0Var.f442523n.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: can not render because already destroyed");
                return;
            }
            rs0.h hVar = f0Var.f442520h;
            if (hVar != null) {
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, java.lang.System.nanoTime());
                rs0.h hVar2 = f0Var.f442520h;
                android.opengl.EGL14.eglSwapBuffers(hVar2.f480825a, hVar2.f480826b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecordableSurfaceView.RecordableImp", th6, "hy: encounter exception! gl get error: %d", java.lang.Integer.valueOf(android.opengl.EGL14.eglGetError()));
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(808L, 2L, 1L, true);
        }
    }
}
