package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ng implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderMixCellUI f110343d;

    public ng(com.tencent.mm.plugin.finder.feed.ui.FinderMixCellUI finderMixCellUI) {
        this.f110343d = finderMixCellUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderMixCellUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderMixCellUI finderMixCellUI = this.f110343d;
        if (!finderMixCellUI.isFinishing()) {
            finderMixCellUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderMixCellUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
