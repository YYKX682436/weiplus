package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class b8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f109699d;

    public b8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI) {
        this.f109699d = finderLiveBizListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI = this.f109699d;
        finderLiveBizListUI.getContext().startActivityForResult(new android.content.Intent(finderLiveBizListUI, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI.class), 5);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
