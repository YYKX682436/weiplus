package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* renamed from: com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView */
/* loaded from: classes14.dex */
public class C11508x646260ab extends android.opengl.GLSurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f156246d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.d f156247e;

    public C11508x646260ab(android.content.Context context) {
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
        setEGLContextFactory(new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.c(this));
        setEGLConfigChooser(new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.b(this, 5, 6, 5, 0, 0, 0));
        setRenderer(new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.a());
        setRenderMode(0);
    }

    /* renamed from: getEglContext */
    public android.opengl.EGLContext m48789x65b1be3b() {
        return this.f156246d;
    }

    /* renamed from: getFrameHeight */
    public int m48790xbdeae7be() {
        return 0;
    }

    /* renamed from: getFrameRotate */
    public int m48791xcf8d33f2() {
        return 0;
    }

    /* renamed from: getFrameWidth */
    public int m48792xddab284f() {
        return 0;
    }

    /* renamed from: setOnEglEnableListener */
    public void m48793xdb10fe20(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.d dVar) {
        this.f156247e = dVar;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", surfaceHolder, this, java.lang.Integer.valueOf(getId()));
        this.f156246d = android.opengl.EGL14.eglGetCurrentContext();
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.d dVar = this.f156247e;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", surfaceHolder, this);
    }

    public C11508x646260ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
