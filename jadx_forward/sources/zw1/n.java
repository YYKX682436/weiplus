package zw1;

/* loaded from: classes9.dex */
public class n implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 f558265d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85) {
        this.f558265d = activityC13141xbbc9be85;
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
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85 = this.f558265d;
        if (activityC13141xbbc9be85.f177890d.getLastVisiblePosition() == activityC13141xbbc9be85.f177891e.getCount() && activityC13141xbbc9be85.f177891e.getCount() > 0 && !activityC13141xbbc9be85.f177903t && !activityC13141xbbc9be85.f177902s) {
            if (!activityC13141xbbc9be85.f177901r) {
                activityC13141xbbc9be85.f177890d.addFooterView(activityC13141xbbc9be85.f177892f, null, false);
                activityC13141xbbc9be85.f177901r = true;
            }
            if (!activityC13141xbbc9be85.f177903t) {
                activityC13141xbbc9be85.m83096xe7b1ccf7(new ww1.y1(activityC13141xbbc9be85.f177906w, activityC13141xbbc9be85.f177908y, activityC13141xbbc9be85.f177905v, activityC13141xbbc9be85.f177909z));
                activityC13141xbbc9be85.f177902s = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
