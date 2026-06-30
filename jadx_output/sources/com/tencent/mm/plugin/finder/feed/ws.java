package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ws implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xs f111006d;

    public ws(com.tencent.mm.plugin.finder.feed.xs xsVar) {
        this.f111006d = xsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback$showEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.MMActivity mMActivity = this.f111006d.f106174d;
        com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI finderSnsGridFeedUI = mMActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI) mMActivity : null;
        if (finderSnsGridFeedUI != null) {
            finderSnsGridFeedUI.g7(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback$showEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
