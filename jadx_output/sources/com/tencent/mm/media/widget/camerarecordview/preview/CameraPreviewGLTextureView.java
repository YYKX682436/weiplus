package com.tencent.mm.media.widget.camerarecordview.preview;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001d\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001eJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\n\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLTextureView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraObservableTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Let0/q;", "Landroid/opengl/EGLContext;", "getEGLContext", "Lkotlin/Function1;", "Lis0/c;", "Ljz5/f0;", "frameDrawCallback", "setOnDrawListener", "getPreviewTexture", "Ldi3/o;", "getFrameDataCallback", "Lms0/c;", "s", "Lms0/c;", "getRenderer", "()Lms0/c;", "setRenderer", "(Lms0/c;)V", "renderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "camera-widget-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class CameraPreviewGLTextureView extends com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView implements et0.q {

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f68941i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f68942m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.Surface f68943n;

    /* renamed from: o, reason: collision with root package name */
    public int f68944o;

    /* renamed from: p, reason: collision with root package name */
    public int f68945p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.HandlerThread f68946q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f68947r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public ms0.c renderer;

    /* renamed from: t, reason: collision with root package name */
    public ft0.d f68949t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f68950u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f68951v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f68952w;

    public CameraPreviewGLTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68952w = new java.util.ArrayList();
        setSurfaceTextureListener(this);
        F();
    }

    public final void F() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("CameraPreviewTextureView_renderThread", -2);
        a17.start();
        this.f68947r = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f68952w;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((yz5.a) it.next());
        }
        this.f68946q = a17;
    }

    @Override // et0.q
    public android.opengl.EGLContext getEGLContext() {
        rs0.h hVar = this.f68941i;
        if (hVar != null) {
            return hVar.f399294c;
        }
        return null;
    }

    @Override // et0.q
    public di3.o getFrameDataCallback() {
        ft0.d dVar = this.f68949t;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // et0.q
    public is0.c getPreviewTexture() {
        ms0.c cVar = this.renderer;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public final ms0.c getRenderer() {
        return this.renderer;
    }

    @Override // et0.q
    public void j() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLTextureView", "tryStopCameraPreview", new java.lang.Object[0]);
        this.f68951v = null;
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f68947r;
        if (n3Var == null) {
            this.f68952w.add(r17);
        } else if (n3Var != null) {
            n3Var.post(new java.lang.Runnable(r17) { // from class: et0.p

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f256562d;

                {
                    kotlin.jvm.internal.o.g(r17, "function");
                    this.f256562d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f256562d.invoke();
                }
            });
        }
    }

    @Override // et0.q
    public void m(ms0.c renderer, boolean z17) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "setRenderer:" + renderer.hashCode() + "  cpuCrop:" + z17);
        ft0.d dVar = this.f68949t;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
        ft0.d fVar = z17 ? new ft0.f(this) : new ft0.h(this);
        this.f68949t = fVar;
        fVar.i(renderer);
        this.renderer = renderer;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18 + ", handler: " + this.f68947r);
        if (this.f68947r == null) {
            F();
        }
        l(new et0.l(this, surfaceTexture, i17, i18, surfaceTexture));
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        super.onSurfaceTextureDestroyed(p07);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureDestroyed");
        this.f68950u = false;
        l(new et0.m(this));
        return false;
    }

    @Override // com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        l(new et0.n(this, i17, i18));
    }

    @Override // et0.q
    public void release() {
        ms0.c cVar = this.renderer;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        this.renderer = null;
        setSurfaceTextureListener(null);
        ft0.d dVar = this.f68949t;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
    }

    @Override // et0.r
    public void requestRender() {
        l(new et0.o(this));
    }

    @Override // et0.q
    public void setOnDrawListener(yz5.l lVar) {
        ft0.d dVar = this.f68949t;
        if (dVar != null) {
            dVar.f266464e = lVar;
        }
    }

    public final void setRenderer(ms0.c cVar) {
        this.renderer = cVar;
    }

    @Override // et0.q
    public void u(yz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLTextureView", "tryCameraPreview canPreview:" + this.f68950u, new java.lang.Object[0]);
        if (!this.f68950u) {
            this.f68951v = lVar;
        } else if (lVar != null) {
            ft0.d dVar = this.f68949t;
            lVar.invoke(dVar != null ? dVar.b() : null);
        }
    }

    @Override // et0.q
    public void w(ts0.c cameraConfig) {
        kotlin.jvm.internal.o.g(cameraConfig, "cameraConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "updateCameraConfig: " + cameraConfig);
        ft0.d dVar = this.f68949t;
        if (dVar != null) {
            dVar.j(cameraConfig);
        }
    }

    @Override // et0.q
    public void y() {
        ms0.c cVar;
        ft0.d dVar = this.f68949t;
        if (dVar == null || (cVar = dVar.f266462c) == null) {
            return;
        }
        cVar.f330955k = true;
    }

    public CameraPreviewGLTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68952w = new java.util.ArrayList();
        setSurfaceTextureListener(this);
        F();
    }

    public CameraPreviewGLTextureView(android.content.Context context) {
        super(context);
        this.f68952w = new java.util.ArrayList();
        setSurfaceTextureListener(this);
        F();
    }
}
