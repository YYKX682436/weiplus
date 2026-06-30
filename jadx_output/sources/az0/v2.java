package az0;

/* loaded from: classes14.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.v2 f15962d = new az0.v2();

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar = az0.w2.f15994g;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar.f399293b;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f399294c);
            is0.c cVar = az0.w2.f15995h;
            if (cVar != null) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{cVar.f294395e}, 0);
            }
            az0.n2 n2Var = az0.w2.f15997m;
            if (n2Var != null) {
                android.opengl.GLES20.glDeleteProgram(n2Var.f15734e);
                int i17 = n2Var.f15733d;
                if (i17 != -1) {
                    android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
                }
                int i18 = n2Var.f15732c;
                if (i18 != -1) {
                    android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                }
            }
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, hVar.f399293b);
            android.opengl.EGL14.eglDestroyContext(hVar.f399292a, hVar.f399294c);
            android.graphics.SurfaceTexture surfaceTexture = az0.w2.f15996i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMJCaptureSessionPreload", "release EGLEnvironment");
        az0.w2.f15994g = null;
    }
}
