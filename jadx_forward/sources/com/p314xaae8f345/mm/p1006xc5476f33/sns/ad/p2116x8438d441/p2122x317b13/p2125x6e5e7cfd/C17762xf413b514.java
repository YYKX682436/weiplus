package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AlphaMaskLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout */
/* loaded from: classes4.dex */
public final class C17762xf413b514 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f244766d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f244767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17762xf413b514(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(0);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
        this.f244766d = paint;
        this.f244767e = new android.graphics.Path();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearMaskAlphaPath", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
        this.f244767e.reset();
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearMaskAlphaPath", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f244767e, this.f244766d);
        canvas.restoreToCount(saveLayer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
        super.onAttachedToWindow();
        setLayerType(2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout");
    }
}
