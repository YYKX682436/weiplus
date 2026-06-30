package ir1;

/* loaded from: classes3.dex */
public final class g implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e f375506d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e) {
        this.f375506d = activityC12967xcacb933e;
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
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView != null && !absListView.canScrollVertically(1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e = this.f375506d;
            if (activityC12967xcacb933e.f175469h) {
                activityC12967xcacb933e.V6();
            } else {
                android.widget.ListView listView = activityC12967xcacb933e.f175465d;
                if (listView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                    throw null;
                }
                if (listView.getFooterViewsCount() == 0) {
                    android.view.View inflate = android.view.View.inflate(activityC12967xcacb933e, com.p314xaae8f345.mm.R.C30864xbddafb2a.dzi, null);
                    activityC12967xcacb933e.f175476r = inflate;
                    android.widget.ListView listView2 = activityC12967xcacb933e.f175465d;
                    if (listView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                        throw null;
                    }
                    listView2.addFooterView(inflate);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
