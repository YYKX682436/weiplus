package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class sl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI f110541d;

    public sl(com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI) {
        this.f110541d = finderTeenModeLimitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI.f109555w;
        com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI finderTeenModeLimitUI = this.f110541d;
        finderTeenModeLimitUI.getClass();
        com.tencent.mars.xlog.Log.i("FinderHotWordTimelineUI", "exitFinder");
        finderTeenModeLimitUI.setResult(11112);
        if (!(finderTeenModeLimitUI.isFinishing() | finderTeenModeLimitUI.isDestroyed())) {
            finderTeenModeLimitUI.finish();
        }
        finderTeenModeLimitUI.c7("teenagemode_timelock_exit", 0, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
