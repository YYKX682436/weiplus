package i55;

/* loaded from: classes8.dex */
public final class h extends i55.b implements android.widget.AbsListView.OnScrollListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h() {
        super(2);
        f55.e eVar = f55.e.f341304e;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/reddot/report/logic/FindFriendTabExposureLogic", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/reddot/report/logic/FindFriendTabExposureLogic", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/reddot/report/logic/FindFriendTabExposureLogic", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && this.f370365e && (y0Var = this.f370370m) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new i55.g(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/reddot/report/logic/FindFriendTabExposureLogic", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
