package s74;

/* loaded from: classes4.dex */
public final class p3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(android.content.Context context, s74.f3 f3Var) {
        super(context);
        this.f486024d = f3Var;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
        if (this.f486024d.i() >= 101) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
            return true;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createMainElement$layout$1");
        return onInterceptTouchEvent;
    }
}
