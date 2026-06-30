package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class m implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288553d;

    public m(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288553d = addressUIFragment;
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
        yj0.a.b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i17 < 2) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288553d;
        if (!addressUIFragment.f287849x) {
            addressUIFragment.f287849x = true;
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
