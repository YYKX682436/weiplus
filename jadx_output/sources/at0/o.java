package at0;

/* loaded from: classes14.dex */
public final class o extends com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView {

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f13614h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f13615i;

    /* renamed from: m, reason: collision with root package name */
    public int f13616m;

    /* renamed from: n, reason: collision with root package name */
    public int f13617n;

    /* renamed from: o, reason: collision with root package name */
    public et0.k f13618o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13619p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context mContext, android.view.Surface surface, int i17, int i18) {
        super(mContext, null);
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f13614h = mContext;
        this.f13615i = surface;
        this.f13616m = i17;
        this.f13617n = i18;
        this.f13619p = "MicroMsg.CameraPreviewSurfaceRenderView";
        this.f13618o = new et0.k();
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public android.opengl.EGLContext getEGLContext() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            return kVar.getEGLContext();
        }
        return null;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public di3.o getFrameDataCallback() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            return kVar.getFrameDataCallback();
        }
        return null;
    }

    public final android.content.Context getMContext() {
        return this.f13614h;
    }

    public final int getMHeight() {
        return this.f13617n;
    }

    public final int getMWidth() {
        return this.f13616m;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public is0.c getPreviewTexture() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            return kVar.getPreviewTexture();
        }
        return null;
    }

    public final android.view.Surface getSurface() {
        return this.f13615i;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void j() {
        com.tencent.mm.sdk.platformtools.Log.c(this.f13619p, "tryStopCameraPreview", new java.lang.Object[0]);
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.r
    public void l(yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.l(r17);
        }
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void m(ms0.c renderer, boolean z17) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.m(renderer, false);
        }
        et0.k kVar2 = this.f13618o;
        if (kVar2 != null) {
            android.view.Surface surface = this.f13615i;
            int i17 = this.f13616m;
            int i18 = this.f13617n;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceAvailable, surface:" + surface + ", width:" + i17 + ", height:" + i18 + ", handler: " + kVar2.f256546g);
            if (kVar2.f256546g == null) {
                kVar2.a();
            }
            if (surface != null) {
                kVar2.l(new et0.e(kVar2, i17, i18, surface));
            }
        }
        et0.k kVar3 = this.f13618o;
        if (kVar3 != null) {
            android.view.Surface surface2 = this.f13615i;
            int i19 = this.f13616m;
            int i27 = this.f13617n;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceSizeChanged, surface:" + surface2 + ", width:" + i19 + ", height:" + i27);
            kVar3.l(new et0.g(kVar3, i19, i27));
        }
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void release() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceDestroyed", new java.lang.Object[0]);
            kVar.f256549m = false;
            kVar.l(new et0.f(kVar));
        }
        et0.k kVar2 = this.f13618o;
        if (kVar2 != null) {
            kVar2.release();
        }
        this.f13618o = null;
    }

    @Override // android.opengl.GLSurfaceView, et0.r
    public void requestRender() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.l(new et0.i(kVar));
        }
    }

    public final void setMContext(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<set-?>");
        this.f13614h = context;
    }

    public final void setMHeight(int i17) {
        this.f13617n = i17;
    }

    public final void setMWidth(int i17) {
        this.f13616m = i17;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void setOnDrawListener(yz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c(this.f13619p, "setOnDrawListener", new java.lang.Object[0]);
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.setOnDrawListener(lVar);
        }
    }

    public final void setSurface(android.view.Surface surface) {
        kotlin.jvm.internal.o.g(surface, "<set-?>");
        this.f13615i = surface;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void u(yz5.l lVar) {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.u(lVar);
        }
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void w(ts0.c cameraConfig) {
        kotlin.jvm.internal.o.g(cameraConfig, "cameraConfig");
        com.tencent.mm.sdk.platformtools.Log.c(this.f13619p, "updateCameraConfig:" + cameraConfig, new java.lang.Object[0]);
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.w(cameraConfig);
        }
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView, et0.q
    public void y() {
        et0.k kVar = this.f13618o;
        if (kVar != null) {
            kVar.y();
        }
    }
}
