package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class tj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211422d;

    public tj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        this.f211422d = activityC15076x7a6c76b6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211422d;
        activityC15076x7a6c76b6.f210347p = false;
        activityC15076x7a6c76b6.onBackPressed();
        activityC15076x7a6c76b6.f210347p = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initOnCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
