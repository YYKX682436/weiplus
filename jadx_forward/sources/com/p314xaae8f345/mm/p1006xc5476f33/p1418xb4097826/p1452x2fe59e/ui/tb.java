package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes11.dex */
public final class tb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f192096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 f192097e;

    public tb(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6) {
        this.f192096d = view;
        this.f192097e = activityC14024xae8cf4a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f192096d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14024xae8cf4a6 activityC14024xae8cf4a6 = this.f192097e;
        int i17 = activityC14024xae8cf4a6.K ^ true ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!activityC14024xae8cf4a6.f190935J) {
            this.f192096d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sb(activityC14024xae8cf4a6));
        }
        android.view.View view2 = activityC14024xae8cf4a6.f287989q;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            activityC14024xae8cf4a6.S = layoutParams.height;
        }
        activityC14024xae8cf4a6.w7();
    }
}
