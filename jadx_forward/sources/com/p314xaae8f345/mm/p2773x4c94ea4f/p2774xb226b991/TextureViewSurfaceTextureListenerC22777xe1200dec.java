package com.p314xaae8f345.mm.p2773x4c94ea4f.p2774xb226b991;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/videocomposition/effect/EffectRenderView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setInputBitmap", "Lcom/tencent/mm/xeffect/effect/EffectManager;", "getEffectManager", "Lum5/x;", "getReportData", "()Lum5/x;", "reportData", "Lum5/e;", "value", "getSurfaceCallback", "()Lum5/e;", "setSurfaceCallback", "(Lum5/e;)V", "surfaceCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.videocomposition.effect.EffectRenderView */
/* loaded from: classes10.dex */
public final class TextureViewSurfaceTextureListenerC22777xe1200dec extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294815d;

    /* renamed from: e, reason: collision with root package name */
    public um5.p f294816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22777xe1200dec(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f294815d = "EffectRenderView@" + hashCode();
        this.f294816e = new um5.p();
        setSurfaceTextureListener(this);
        m82501x6157b6f4().f510745a = 2;
    }

    public final void a(int i17, int i18, int i19) {
        xm5.b.c(this.f294815d, "setInputContentInfo, size:[" + i17 + ',' + i18 + "], rotate:" + i19, new java.lang.Object[0]);
        this.f294816e.m(i17, i18, i19);
    }

    /* renamed from: getEffectManager */
    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc m82500x9972f526() {
        return this.f294816e.f510726b;
    }

    /* renamed from: getReportData */
    public final um5.x m82501x6157b6f4() {
        return this.f294816e.f510742r;
    }

    /* renamed from: getSurfaceCallback */
    public final um5.e m82502x1f1545dc() {
        return this.f294816e.A;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c(this.f294815d, "onSurfaceTextureAvailable, surface:" + surface.hashCode() + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        um5.p pVar = this.f294816e;
        pVar.getClass();
        pVar.f510731g = new android.view.Surface(surface);
        pVar.j(i17, i18);
        pVar.d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c(this.f294815d, "onSurfaceTextureDestroyed, surface:" + surface.hashCode(), new java.lang.Object[0]);
        this.f294816e.b();
        um5.p pVar = this.f294816e;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = pVar.f510726b;
        um5.e eVar = pVar.A;
        um5.p pVar2 = new um5.p();
        this.f294816e = pVar2;
        pVar2.n(eVar);
        um5.p pVar3 = this.f294816e;
        pVar3.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22979xbb268bc, "<set-?>");
        pVar3.f510726b = c22979xbb268bc;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c(this.f294815d, "onSurfaceTextureSizeChanged, surface:" + surface.hashCode() + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        this.f294816e.j(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    /* renamed from: setInputBitmap */
    public final void m82503x40626fd7(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        xm5.b.c(this.f294815d, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        this.f294816e.l(bitmap);
    }

    /* renamed from: setSurfaceCallback */
    public final void m82504x55ebdf50(um5.e eVar) {
        this.f294816e.n(eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22777xe1200dec(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f294815d = "EffectRenderView@" + hashCode();
        this.f294816e = new um5.p();
        setSurfaceTextureListener(this);
        m82501x6157b6f4().f510745a = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22777xe1200dec(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f294815d = "EffectRenderView@" + hashCode();
        this.f294816e = new um5.p();
        setSurfaceTextureListener(this);
        m82501x6157b6f4().f510745a = 2;
    }
}
