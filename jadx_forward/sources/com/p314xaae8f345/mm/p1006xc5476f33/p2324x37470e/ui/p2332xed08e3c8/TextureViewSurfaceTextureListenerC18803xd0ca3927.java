package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2332xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/Rect;", "rect", "Ljz5/f0;", "setCropRect", "", "mute", "setMute", "Lkotlin/Function0;", "prepareCallback", "setPrepareCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView */
/* loaded from: classes10.dex */
public final class TextureViewSurfaceTextureListenerC18803xd0ca3927 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f257502r = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.os.HandlerThread f257503h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f257504i;

    /* renamed from: m, reason: collision with root package name */
    public vo4.i f257505m;

    /* renamed from: n, reason: collision with root package name */
    public vo4.t f257506n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f257507o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f257508p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Rect f257509q;

    public TextureViewSurfaceTextureListenerC18803xd0ca3927(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPlayView", "surfaceAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("VLogPlayView_PreviewPlayer", -4);
        this.f257503h = a17;
        a17.start();
        android.os.HandlerThread handlerThread = this.f257503h;
        this.f257504i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread != null ? handlerThread.getLooper() : null);
        vo4.p pVar = new vo4.p(i17, i18);
        this.f257506n = pVar;
        pVar.a(new android.view.Surface(surfaceTexture));
        vo4.i iVar = new vo4.i(i17, i18, true, true);
        this.f257505m = iVar;
        vo4.t tVar = this.f257506n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        iVar.d(tVar);
        vo4.i iVar2 = this.f257505m;
        if (iVar2 != null) {
            iVar2.c(30, 30);
        }
        vo4.i iVar3 = this.f257505m;
        if (iVar3 != null) {
            iVar3.f520170h = new ip4.b(this);
            iVar3.f520171i = new ip4.c(this);
            android.graphics.Rect rect = this.f257509q;
            if (rect != null) {
                iVar3.b(rect);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPlayView", "surfaceDestroy");
        surface.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPlayView", "surfaceSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    /* renamed from: setCropRect */
    public final void m72613xf4e85f16(android.graphics.Rect rect) {
        vo4.i iVar = this.f257505m;
        if (iVar == null) {
            this.f257509q = rect;
        } else if (iVar != null) {
            iVar.b(rect);
        }
    }

    /* renamed from: setMute */
    public final void m72614x764d819b(boolean z17) {
        vo4.t tVar;
        vo4.i iVar = this.f257505m;
        if (iVar == null || (tVar = iVar.f520169g) == null) {
            return;
        }
        tVar.b(new vo4.e(iVar, z17));
    }

    /* renamed from: setPrepareCallback */
    public final void m72615x235705aa(yz5.a prepareCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareCallback, "prepareCallback");
        this.f257507o = prepareCallback;
    }

    public TextureViewSurfaceTextureListenerC18803xd0ca3927(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
