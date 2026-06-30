package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI f110529d;

    public sa(com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI finderLiveMentionsUI) {
        this.f110529d = finderLiveMentionsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI finderLiveMentionsUI = this.f110529d;
        if (!finderLiveMentionsUI.isFinishing()) {
            finderLiveMentionsUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveMentionsUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
