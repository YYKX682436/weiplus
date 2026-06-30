package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView */
/* loaded from: classes14.dex */
public class C16557x646260ab extends android.opengl.GLSurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public hi3.c f230835d;

    /* renamed from: e, reason: collision with root package name */
    public int f230836e;

    /* renamed from: f, reason: collision with root package name */
    public int f230837f;

    /* renamed from: g, reason: collision with root package name */
    public int f230838g;

    public C16557x646260ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230835d = null;
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
        setEGLContextFactory(new hi3.e(this));
        setEGLConfigChooser(new hi3.d(this, 5, 6, 5, 0, 0, 0));
        hi3.c cVar = new hi3.c();
        this.f230835d = cVar;
        setRenderer(cVar);
        setRenderMode(0);
    }

    /* renamed from: getFrameHeight */
    public int m66982xbdeae7be() {
        return this.f230837f;
    }

    /* renamed from: getFrameRotate */
    public int m66983xcf8d33f2() {
        return this.f230838g;
    }

    /* renamed from: getFrameWidth */
    public int m66984xddab284f() {
        return this.f230836e;
    }

    /* renamed from: getRenderer */
    public hi3.c m66985x5e5b7e39() {
        return this.f230835d;
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
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", surfaceHolder, this);
    }
}
