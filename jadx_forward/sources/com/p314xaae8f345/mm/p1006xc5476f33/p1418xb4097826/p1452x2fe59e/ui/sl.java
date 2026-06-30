package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class sl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c f192074d;

    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c activityC14095xead19c0c) {
        this.f192074d = activityC14095xead19c0c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c.f191088w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c activityC14095xead19c0c = this.f192074d;
        activityC14095xead19c0c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHotWordTimelineUI", "exitFinder");
        activityC14095xead19c0c.setResult(11112);
        if (!(activityC14095xead19c0c.isFinishing() | activityC14095xead19c0c.isDestroyed())) {
            activityC14095xead19c0c.finish();
        }
        activityC14095xead19c0c.c7("teenagemode_timelock_exit", 0, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
