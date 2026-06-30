package et0;

/* loaded from: classes14.dex */
public final class c implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea f338063a;

    public c(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea) {
        this.f338063a = c10905xfb961aea;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        int i17 = com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea.f150470g;
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = this.f338063a;
        c10905xfb961aea.getClass();
        ft0.d dVar = c10905xfb961aea.f150472e;
        if (dVar != null) {
            dVar.d(gl10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceChanged width:" + i17 + " height:" + i18, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = this.f338063a;
        ft0.d dVar = c10905xfb961aea.f150472e;
        if (dVar != null) {
            dVar.f347993a.l(new ft0.a(dVar, new et0.b(c10905xfb961aea, gl10, i17, i18), true, 0));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceCreated", new java.lang.Object[0]);
        ft0.d dVar = this.f338063a.f150472e;
        if (dVar != null) {
            dVar.f(gl10, eGLConfig);
        }
    }
}
