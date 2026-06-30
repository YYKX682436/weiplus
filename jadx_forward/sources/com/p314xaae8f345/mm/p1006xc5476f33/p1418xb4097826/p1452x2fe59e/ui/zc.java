package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class zc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f192332d;

    public zc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f192332d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f192332d;
        kdVar.getClass();
        android.content.Context context = kdVar.f199716e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        int i17 = kdVar.K;
        if (i17 == 0) {
            i17 = 1000;
        }
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", i17);
        intent.putExtra("KEY_PARAMS_WHITE_LIST", kdVar.L1.mo14344x5f01b1f6());
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
        if (kdVar.f191758J == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192186h) {
            intent.putStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST", arrayList2);
        } else {
            intent.putStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST", arrayList2);
        }
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = activityC21401x6ce6f73f != null ? activityC21401x6ce6f73f.m78751x5dc77fb5(intent) : null;
        if (activityC21401x6ce6f73f != null) {
            activityC21401x6ce6f73f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yc(kdVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
