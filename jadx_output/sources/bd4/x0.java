package bd4;

/* loaded from: classes2.dex */
public final class x0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f19408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19410f;

    public x0(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17, int i18) {
        this.f19408d = linearLayoutManager;
        this.f19409e = i17;
        this.f19410f = i18;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1");
        view.removeOnLayoutChangeListener(this);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f19408d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f19410f));
        arrayList.add(java.lang.Integer.valueOf(this.f19409e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$$inlined$doOnNextLayout$1");
    }
}
