package com.tencent.mm.media.widget.camerarecordview.preview;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0007\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Let0/q;", "Lkotlin/Function1;", "Lis0/c;", "Ljz5/f0;", "frameAvailableListener", "setOnDrawListener", "getPreviewTexture", "Landroid/opengl/EGLContext;", "getEGLContext", "Ldi3/o;", "getFrameDataCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "camera-widget-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class CameraPreviewGLSurfaceView extends android.opengl.GLSurfaceView implements et0.q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f68937g = 0;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f68938d;

    /* renamed from: e, reason: collision with root package name */
    public ft0.d f68939e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68940f;

    public CameraPreviewGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
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
        setEGLContextFactory(new ns0.b());
        setEGLContextClientVersion(com.tencent.mm.sdk.platformtools.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3));
        setEGLConfigChooser(new ns0.a(5, 6, 5, 0, 0, 0));
        setPreserveEGLContextOnPause(false);
        setRenderer(new et0.c(this));
        setRenderMode(0);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "init create CameraPreviewGLSurfaceView", new java.lang.Object[0]);
    }

    public android.opengl.EGLContext getEGLContext() {
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            return dVar.f266463d;
        }
        return null;
    }

    public di3.o getFrameDataCallback() {
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public is0.c getPreviewTexture() {
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public void j() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "tryStopCameraPreview", new java.lang.Object[0]);
        this.f68938d = null;
    }

    public void l(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        queueEvent(new java.lang.Runnable(r17) { // from class: et0.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f256531d;

            {
                kotlin.jvm.internal.o.g(r17, "function");
                this.f256531d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f256531d.invoke();
            }
        });
    }

    public void m(ms0.c renderer, boolean z17) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "setPreviewRenderer cpuCrop:" + z17 + ", previewController:" + this.f68939e, new java.lang.Object[0]);
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            ft0.d.h(dVar, false, true, 1, null);
        }
        ft0.d fVar = z17 ? new ft0.f(this) : new ft0.h(this);
        this.f68939e = fVar;
        fVar.i(renderer);
    }

    public void release() {
        getHolder().removeCallback(this);
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
        this.f68940f = false;
    }

    public void setOnDrawListener(yz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "setOnDrawListener", new java.lang.Object[0]);
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            dVar.f266464e = lVar;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceChanged:" + holder.getSurface() + ", format:" + i17 + ", w:" + i18 + ", h:" + i19);
        super.surfaceChanged(holder, i17, i18, i19);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceCreated: " + holder.getSurface());
        super.surfaceCreated(holder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceDestroyed: " + holder.getSurface());
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            ft0.d.h(dVar, false, true, 1, null);
        }
        this.f68940f = false;
        super.surfaceDestroyed(holder);
    }

    public void u(yz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "tryCameraPreview  canPreview:" + this.f68940f, new java.lang.Object[0]);
        if (!this.f68940f) {
            this.f68938d = lVar;
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback.invoke  ");
        ft0.d dVar = this.f68939e;
        sb6.append(dVar != null ? dVar.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", sb6.toString(), new java.lang.Object[0]);
        if (lVar != null) {
            ft0.d dVar2 = this.f68939e;
            lVar.invoke(dVar2 != null ? dVar2.b() : null);
        }
    }

    public void w(ts0.c cameraConfig) {
        kotlin.jvm.internal.o.g(cameraConfig, "cameraConfig");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "updateCameraConfig:" + cameraConfig, new java.lang.Object[0]);
        ft0.d dVar = this.f68939e;
        if (dVar != null) {
            dVar.j(cameraConfig);
        }
    }

    public void y() {
        ms0.c cVar;
        ft0.d dVar = this.f68939e;
        if (dVar == null || (cVar = dVar.f266462c) == null) {
            return;
        }
        cVar.f330955k = true;
    }
}
