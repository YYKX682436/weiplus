package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lrp1/d;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOverScrollHorizontallyListener", "", "dockLeft", "setDockLeft", "Lcom/tencent/mm/plugin/ball/view/ContentFloatBallView;", "contentFloatBallView", "setContentFloatBallView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView */
/* loaded from: classes10.dex */
public final class C12916x4253bec6 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name */
    public boolean f174937j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f174938k2;

    /* renamed from: l2, reason: collision with root package name */
    public rp1.d f174939l2;

    /* renamed from: m2, reason: collision with root package name */
    public final int f174940m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f174941n2;

    /* renamed from: o2, reason: collision with root package name */
    public float f174942o2;

    /* renamed from: p2, reason: collision with root package name */
    public float f174943p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f174944q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f174945r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f174946s2;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f174947t2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12916x4253bec6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void g1(android.view.MotionEvent motionEvent) {
        this.f174943p2 = motionEvent.getRawX();
        this.f174942o2 = motionEvent.getRawY();
        this.f174944q2 = 0.0f;
        this.f174941n2 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContentFloatBallRecyclerView", "recordDownPos mDownX: " + this.f174943p2 + ", mDownY: " + this.f174942o2);
    }

    public final void h1() {
        this.f174941n2 = false;
        this.f174942o2 = 0.0f;
        this.f174943p2 = 0.0f;
        this.f174944q2 = 0.0f;
        this.f174945r2 = false;
        this.f174946s2 = false;
        this.f174947t2 = false;
    }

    /* renamed from: setContentFloatBallView */
    public final void m54096x3605bb49(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 contentFloatBallView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentFloatBallView, "contentFloatBallView");
        this.f174938k2 = contentFloatBallView;
    }

    /* renamed from: setDockLeft */
    public final void m54097xa953835c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContentFloatBallRecyclerView", "setDockLeft dockLeft: " + z17);
        this.f174937j2 = z17;
    }

    /* renamed from: setOverScrollHorizontallyListener */
    public final void m54098x6bf463e8(rp1.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f174939l2 = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12916x4253bec6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f174940m2 = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        i(new rp1.c(this));
    }
}
