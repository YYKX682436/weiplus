package az0;

/* loaded from: classes14.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.v2 f97495d = new az0.v2();

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar = az0.w2.f97527g;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface = hVar.f480826b;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f480827c);
            is0.c cVar = az0.w2.f97528h;
            if (cVar != null) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{cVar.f375928e}, 0);
            }
            az0.n2 n2Var = az0.w2.f97530m;
            if (n2Var != null) {
                android.opengl.GLES20.glDeleteProgram(n2Var.f97267e);
                int i17 = n2Var.f97266d;
                if (i17 != -1) {
                    android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
                }
                int i18 = n2Var.f97265c;
                if (i18 != -1) {
                    android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                }
            }
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
            android.graphics.SurfaceTexture surfaceTexture = az0.w2.f97529i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMJCaptureSessionPreload", "release EGLEnvironment");
        az0.w2.f97527g = null;
    }
}
