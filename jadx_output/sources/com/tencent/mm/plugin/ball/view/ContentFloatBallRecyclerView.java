package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lrp1/d;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOverScrollHorizontallyListener", "", "dockLeft", "setDockLeft", "Lcom/tencent/mm/plugin/ball/view/ContentFloatBallView;", "contentFloatBallView", "setContentFloatBallView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ContentFloatBallRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public boolean f93404j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallView f93405k2;

    /* renamed from: l2, reason: collision with root package name */
    public rp1.d f93406l2;

    /* renamed from: m2, reason: collision with root package name */
    public final int f93407m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f93408n2;

    /* renamed from: o2, reason: collision with root package name */
    public float f93409o2;

    /* renamed from: p2, reason: collision with root package name */
    public float f93410p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f93411q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f93412r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f93413s2;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f93414t2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void g1(android.view.MotionEvent motionEvent) {
        this.f93410p2 = motionEvent.getRawX();
        this.f93409o2 = motionEvent.getRawY();
        this.f93411q2 = 0.0f;
        this.f93408n2 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContentFloatBallRecyclerView", "recordDownPos mDownX: " + this.f93410p2 + ", mDownY: " + this.f93409o2);
    }

    public final void h1() {
        this.f93408n2 = false;
        this.f93409o2 = 0.0f;
        this.f93410p2 = 0.0f;
        this.f93411q2 = 0.0f;
        this.f93412r2 = false;
        this.f93413s2 = false;
        this.f93414t2 = false;
    }

    public final void setContentFloatBallView(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        kotlin.jvm.internal.o.g(contentFloatBallView, "contentFloatBallView");
        this.f93405k2 = contentFloatBallView;
    }

    public final void setDockLeft(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContentFloatBallRecyclerView", "setDockLeft dockLeft: " + z17);
        this.f93404j2 = z17;
    }

    public final void setOverScrollHorizontallyListener(rp1.d listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f93406l2 = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93407m2 = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        i(new rp1.c(this));
    }
}
