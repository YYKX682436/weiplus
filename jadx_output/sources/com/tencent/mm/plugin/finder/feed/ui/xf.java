package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class xf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI f110734d;

    public xf(com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI) {
        this.f110734d = finderLoaderFeedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$updateDeleteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI = this.f110734d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderLoaderFeedUI.getContext(), 1, true);
        k0Var.q(finderLoaderFeedUI.getIntent().getStringExtra("KEY_SUPPORT_DELETE_SOURCE_TITLE"), 17);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.feed.ui.vf(finderLoaderFeedUI);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.ui.wf(finderLoaderFeedUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$updateDeleteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
