package com.tencent.mm.media.camera.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitTextureView;", "Landroid/view/TextureView;", "Lbs0/i;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lnr0/z;", "kit", "Ljz5/f0;", "setCameraKitEnv", "", "radius", "setCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CameraKitTextureView extends android.view.TextureView implements bs0.i, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public nr0.z f68869d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f68870e;

    /* renamed from: f, reason: collision with root package name */
    public int f68871f;

    /* renamed from: g, reason: collision with root package name */
    public int f68872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureAvailable");
        nr0.z zVar = this.f68869d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.m("bindSurfaceTexture", new pr0.j0(n0Var, surface, null, null, null));
        }
        nr0.z zVar2 = this.f68869d;
        if (zVar2 != null) {
            pr0.n0 n0Var2 = (pr0.n0) zVar2;
            n0Var2.l("updateScreenSize", new pr0.m0(n0Var2, i17, i18, null));
        }
        this.f68870e = surface;
        this.f68871f = i17;
        this.f68872g = i18;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureDestroyed");
        nr0.z zVar = this.f68869d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.m("unbindSurface", new pr0.k0(n0Var, null));
        }
        this.f68870e = null;
        this.f68871f = 0;
        this.f68872g = 0;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureSizeChanged");
        nr0.z zVar = this.f68869d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.l("updateScreenSize", new pr0.m0(n0Var, i17, i18, null));
        }
        this.f68871f = i17;
        this.f68872g = i18;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // bs0.i
    public void setCameraKitEnv(nr0.z zVar) {
        this.f68869d = zVar;
        android.graphics.SurfaceTexture surfaceTexture = this.f68870e;
        if (surfaceTexture == null || zVar == null) {
            return;
        }
        pr0.n0 n0Var = (pr0.n0) zVar;
        n0Var.m("bindSurfaceTexture", new pr0.j0(n0Var, surfaceTexture, java.lang.Integer.valueOf(this.f68871f), java.lang.Integer.valueOf(this.f68872g), null));
    }

    @Override // bs0.i
    public void setCornerRadius(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        setClipToOutline(true);
        setOutlineProvider(new bs0.b(f17));
    }
}
