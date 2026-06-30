package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitTextureView;", "Landroid/view/TextureView;", "Lbs0/i;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lnr0/z;", "kit", "Ljz5/f0;", "setCameraKitEnv", "", "radius", "setCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitTextureView */
/* loaded from: classes14.dex */
public final class TextureViewSurfaceTextureListenerC10896xd0f4e44f extends android.view.TextureView implements bs0.i, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public nr0.z f150402d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f150403e;

    /* renamed from: f, reason: collision with root package name */
    public int f150404f;

    /* renamed from: g, reason: collision with root package name */
    public int f150405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC10896xd0f4e44f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureAvailable");
        nr0.z zVar = this.f150402d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.m("bindSurfaceTexture", new pr0.j0(n0Var, surface, null, null, null));
        }
        nr0.z zVar2 = this.f150402d;
        if (zVar2 != null) {
            pr0.n0 n0Var2 = (pr0.n0) zVar2;
            n0Var2.l("updateScreenSize", new pr0.m0(n0Var2, i17, i18, null));
        }
        this.f150403e = surface;
        this.f150404f = i17;
        this.f150405g = i18;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureDestroyed");
        nr0.z zVar = this.f150402d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.m("unbindSurface", new pr0.k0(n0Var, null));
        }
        this.f150403e = null;
        this.f150404f = 0;
        this.f150405g = 0;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitTextureView", "[" + hashCode() + "]onSurfaceTextureSizeChanged");
        nr0.z zVar = this.f150402d;
        if (zVar != null) {
            pr0.n0 n0Var = (pr0.n0) zVar;
            n0Var.l("updateScreenSize", new pr0.m0(n0Var, i17, i18, null));
        }
        this.f150404f = i17;
        this.f150405g = i18;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // bs0.i
    /* renamed from: setCameraKitEnv */
    public void mo11087x5156873e(nr0.z zVar) {
        this.f150402d = zVar;
        android.graphics.SurfaceTexture surfaceTexture = this.f150403e;
        if (surfaceTexture == null || zVar == null) {
            return;
        }
        pr0.n0 n0Var = (pr0.n0) zVar;
        n0Var.m("bindSurfaceTexture", new pr0.j0(n0Var, surfaceTexture, java.lang.Integer.valueOf(this.f150404f), java.lang.Integer.valueOf(this.f150405g), null));
    }

    @Override // bs0.i
    /* renamed from: setCornerRadius */
    public void mo11088xba0484c9(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        setClipToOutline(true);
        setOutlineProvider(new bs0.b(f17));
    }
}
