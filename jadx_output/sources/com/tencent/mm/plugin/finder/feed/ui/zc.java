package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class zc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110799d;

    public zc(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110799d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110799d;
        kdVar.getClass();
        android.content.Context context = kdVar.f118183e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.class);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        int i17 = kdVar.K;
        if (i17 == 0) {
            i17 = 1000;
        }
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", i17);
        intent.putExtra("KEY_PARAMS_WHITE_LIST", kdVar.L1.toByteArray());
        intent.putExtra("KEY_PARAMS_WHITE_LIST_HIDE_SELECT_FROM_CONTACT_BOOK", true);
        java.util.List list = kdVar.M;
        intent.putStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST", list != null ? new java.util.ArrayList<>(list) : null);
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.lang.String str = kdVar.L;
        if (str != null) {
            arrayList2.add(str);
        }
        if (list != null) {
            arrayList2.addAll(list);
        }
        if (kdVar.f110225J == com.tencent.mm.plugin.finder.feed.ui.vd.f110653h) {
            intent.putStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST", arrayList2);
        } else {
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST", arrayList2);
        }
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (mMFragmentActivity != null) {
            mMFragmentActivity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
        }
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.feed.ui.yc(kdVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
