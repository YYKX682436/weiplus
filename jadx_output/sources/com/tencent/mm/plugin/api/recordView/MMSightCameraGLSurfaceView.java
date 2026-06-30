package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes14.dex */
public class MMSightCameraGLSurfaceView extends android.opengl.GLSurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f74713d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.d f74714e;

    public MMSightCameraGLSurfaceView(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        getHolder().addCallback(this);
        try {
            try {
                try {
                    getHolder().setType(2);
                } catch (java.lang.Exception unused) {
                    getHolder().setType(0);
                }
            } catch (java.lang.Exception unused2) {
            }
        } catch (java.lang.Exception unused3) {
            getHolder().setType(1);
        }
        setEGLContextFactory(new com.tencent.mm.plugin.api.recordView.c(this));
        setEGLConfigChooser(new com.tencent.mm.plugin.api.recordView.b(this, 5, 6, 5, 0, 0, 0));
        setRenderer(new com.tencent.mm.plugin.api.recordView.a());
        setRenderMode(0);
    }

    public android.opengl.EGLContext getEglContext() {
        return this.f74713d;
    }

    public int getFrameHeight() {
        return 0;
    }

    public int getFrameRotate() {
        return 0;
    }

    public int getFrameWidth() {
        return 0;
    }

    public void setOnEglEnableListener(com.tencent.mm.plugin.api.recordView.d dVar) {
        this.f74714e = dVar;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", surfaceHolder, this, java.lang.Integer.valueOf(getId()));
        this.f74713d = android.opengl.EGL14.eglGetCurrentContext();
        com.tencent.mm.plugin.api.recordView.d dVar = this.f74714e;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", surfaceHolder, this);
    }

    public MMSightCameraGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
