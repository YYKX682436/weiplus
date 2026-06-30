package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0002B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardTouchContainer;", "Landroid/widget/FrameLayout;", "Lt74/f2;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setScrollListener", "Ljz5/l;", "", "getClickPos", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer */
/* loaded from: classes4.dex */
public final class C17761xd9001aa2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f244754d;

    /* renamed from: e, reason: collision with root package name */
    public float f244755e;

    /* renamed from: f, reason: collision with root package name */
    public float f244756f;

    /* renamed from: g, reason: collision with root package name */
    public t74.f2 f244757g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f244758h;

    /* renamed from: i, reason: collision with root package name */
    public final int f244759i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f244760m;

    /* renamed from: n, reason: collision with root package name */
    public float f244761n;

    /* renamed from: o, reason: collision with root package name */
    public float f244762o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f244763p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f244764q;

    /* renamed from: r, reason: collision with root package name */
    public float f244765r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17761xd9001aa2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getClickPos */
    public final jz5.l m69497xb1e16522() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickPos", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        jz5.l lVar = new jz5.l(java.lang.Float.valueOf(this.f244761n), java.lang.Float.valueOf(this.f244762o));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickPos", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        return lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        super.onDetachedFromWindow();
        android.view.VelocityTracker velocityTracker = this.f244758h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f244758h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 != 3) goto L99;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17761xd9001aa2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setScrollListener */
    public final void m69498x561227a3(t74.f2 listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f244757g = listener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17761xd9001aa2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f244759i = android.view.ViewConfiguration.getTouchSlop();
        this.f244761n = -1.0f;
        this.f244762o = -1.0f;
        this.f244763p = true;
    }
}
