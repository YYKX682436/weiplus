package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class h8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110112d;

    public h8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI) {
        this.f110112d = finderLiveBizSearchUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI = this.f110112d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderLiveBizSearchUI.f109350x;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        finderLiveBizSearchUI.e7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
