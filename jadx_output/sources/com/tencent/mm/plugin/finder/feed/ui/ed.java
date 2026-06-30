package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ed implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f109980d;

    public ed(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f109980d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f109980d;
        kdVar.getClass();
        android.content.Context context = kdVar.f118183e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI.class);
        java.util.List list = kdVar.H;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r45.il1) it.next()).toByteArray());
        }
        intent.putExtra("KEY_PARAMS_WHITE_LIST", arrayList2);
        java.lang.Iterable list2 = kdVar.L1.getList(3);
        if (list2 == null) {
            list2 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((r45.il1) it6.next()).toByteArray());
        }
        intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.feed.ui.dd(kdVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
