package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\"\u0010\n\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPreloadPlayView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Ljz5/f0;", "onSizeChanged", "setOnSizeChangedListener", "", "onProgress", "setOnProgressListener", "", "mute", "setMute", "Landroid/graphics/Rect;", "rect", "setCropRect", "Landroid/util/Size;", "getSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPreloadPlayView */
/* loaded from: classes10.dex */
public final class TextureViewSurfaceTextureListenerC18804xad6b7034 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public final android.os.HandlerThread f257510h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f257511i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f257512m;

    public TextureViewSurfaceTextureListenerC18804xad6b7034(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int i18 = pu5.i.f440006b;
        this.f257510h = pu5.f.a("VLogPlayView_PreviewPlayer", -4);
        setSurfaceTextureListener(this);
        int i19 = ap4.a.f94322a;
    }

    /* renamed from: getSize */
    public final android.util.Size m72616xfb854877() {
        return null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        android.os.HandlerThread handlerThread = this.f257510h;
        if (handlerThread.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is alive");
        } else {
            handlerThread.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is not alive, start");
        }
        this.f257511i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "bindPreloadManager surfaceTexture:" + surfaceTexture);
        int i19 = ap4.a.f94322a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "vLogDirector init : 0, vLogSurface : 0");
        yz5.p pVar = this.f257512m;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceDestroy");
        surface.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadPlayView", "surfaceSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    /* renamed from: setCropRect */
    public final void m72617xf4e85f16(android.graphics.Rect rect) {
    }

    /* renamed from: setMute */
    public final void m72618x764d819b(boolean z17) {
    }

    /* renamed from: setOnProgressListener */
    public final void m72619xcd1c0602(yz5.p pVar) {
    }

    /* renamed from: setOnSizeChangedListener */
    public final void m72620x138029a6(yz5.p pVar) {
        this.f257512m = pVar;
    }

    public TextureViewSurfaceTextureListenerC18804xad6b7034(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17 = pu5.i.f440006b;
        this.f257510h = pu5.f.a("VLogPlayView_PreviewPlayer", -4);
        setSurfaceTextureListener(this);
        int i18 = ap4.a.f94322a;
    }
}
