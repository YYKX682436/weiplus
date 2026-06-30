package ms0;

/* loaded from: classes10.dex */
public abstract class e extends ms0.c {
    public e(int i17, int i18) {
        super(0, 0, 0, 0, i17, i18);
    }

    @Override // ms0.c, android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var = qs0.a.f447740a;
            synchronized (b3Var) {
                try {
                    b3Var.b();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreviewRenderSignal", e17, "markRendering error", new java.lang.Object[0]);
                }
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f412486i;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.AbsSurfaceRenderer", e18, "updateTexImage error", new java.lang.Object[0]);
        }
        if (this.f412488k) {
            this.f412488k = false;
        } else {
            super.onDrawFrame(gl10);
        }
    }

    public /* synthetic */ e(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i19 & 2) != 0 ? 2 : i18);
    }
}
