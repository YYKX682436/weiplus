package ab2;

/* loaded from: classes.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f2796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2798f;

    public x(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        this.f2796d = recyclerView;
        this.f2797e = i17;
        this.f2798f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f2796d.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f2798f));
        arrayList.add(java.lang.Integer.valueOf(this.f2797e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        gridLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(gridLayoutManager, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
