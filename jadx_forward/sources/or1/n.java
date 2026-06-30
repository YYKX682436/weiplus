package or1;

/* loaded from: classes12.dex */
public class n implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f429071d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 f429072e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 c12976x62b3a916) {
        this.f429072e = c12976x62b3a916;
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
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i17 + i18 == i19) {
            this.f429071d = true;
        } else {
            this.f429071d = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && this.f429071d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 c12976x62b3a916 = this.f429072e;
            or1.r rVar = c12976x62b3a916.f175517g;
            if ((!rVar.f429094f || rVar.f429089a == 0 || rVar.f429093e) ? false : true) {
                java.lang.String str = rVar.f429090b;
                int i18 = rVar.f429092d;
                long[] jArr = c12976x62b3a916.f175522o;
                c12976x62b3a916.b(str, i18, jArr[jArr.length - 1]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
