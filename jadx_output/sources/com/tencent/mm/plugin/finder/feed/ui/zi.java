package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI f110806d;

    public zi(com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI) {
        this.f110806d = finderProfileTimeLineUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean w07 = com.tencent.mm.ui.bk.w0();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI = this.f110806d;
        if (w07) {
            com.tencent.mm.ui.fj.g(finderProfileTimeLineUI, true, true, new com.tencent.mm.plugin.finder.feed.ui.xi(finderProfileTimeLineUI));
        } else {
            com.tencent.mm.ui.ee.f(finderProfileTimeLineUI.getTaskId(), new com.tencent.mm.plugin.finder.feed.ui.yi(finderProfileTimeLineUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
