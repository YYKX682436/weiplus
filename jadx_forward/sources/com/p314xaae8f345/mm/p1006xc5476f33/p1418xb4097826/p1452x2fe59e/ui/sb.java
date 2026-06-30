package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes11.dex */
public final class sb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 f192063d;

    public sb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6) {
        this.f192063d = activityC14024xae8cf4a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6 = this.f192063d;
        activityC14024xae8cf4a6.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC14024xae8cf4a6, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", activityC14024xae8cf4a6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eol));
        intent.putExtra("without_openim", true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c & (-16777217), 131072));
        intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC14024xae8cf4a6.G, ","));
        int i18 = activityC14024xae8cf4a6.I;
        if (i18 <= 0) {
            i18 = 500;
        }
        intent.putExtra("max_limit_num", i18);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC14024xae8cf4a6.N, ","));
        activityC14024xae8cf4a6.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
