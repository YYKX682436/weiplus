package db5;

/* loaded from: classes8.dex */
public class e4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f309859d;

    public e4(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e) {
        this.f309859d = c21506x8bfe589e;
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
        yj0.a.b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e = this.f309859d;
        if (i17 == 0 && c21506x8bfe589e.getChildAt(0) != null && c21506x8bfe589e.getChildAt(0).getTop() == c21506x8bfe589e.getPaddingTop()) {
            c21506x8bfe589e.f279028f = true;
        } else {
            c21506x8bfe589e.f279028f = false;
        }
        new java.lang.StringBuilder("").append(c21506x8bfe589e.f279028f);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        db5.f4 f4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getLastVisiblePosition() == absListView.getCount() - 1 && (f4Var = this.f309859d.f279027e) != null) {
            f4Var.mo43537x1318b45a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
