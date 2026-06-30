package te2;

/* loaded from: classes2.dex */
public final class z implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a0 f500085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500086e;

    public z(te2.a0 a0Var, java.lang.String str) {
        this.f500085d = a0Var;
        this.f500086e = str;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationCancel view=" + c22789xd23e9a9b);
        android.view.View view = this.f500085d.f499377d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationCancel", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationStart view=" + c22789xd23e9a9b);
        te2.a0 a0Var = this.f500085d;
        android.widget.FrameLayout frameLayout = a0Var.f499381h;
        if (frameLayout != null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = a0Var.f499380g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            a0Var.f499380g = p3325xe03a0797.p3326xc267989b.l.d(a0Var.f499379f, null, null, new te2.x(a0Var, frameLayout, this.f500086e, null), 3, null);
        }
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationEnd view=" + c22789xd23e9a9b);
        android.view.View view = this.f500085d.f499377d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$showPagView$1$1", "onAnimationEnd", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onAnimationRepeat view=" + c22789xd23e9a9b);
    }
}
