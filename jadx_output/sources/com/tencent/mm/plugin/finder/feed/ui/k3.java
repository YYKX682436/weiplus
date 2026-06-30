package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI f110211d;

    public k3(com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f110211d = finderFriendLikeTimelineUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI.E;
        com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f110211d;
        finderFriendLikeTimelineUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderFriendLikeTimelineUI, 1, false);
        k0Var.f211872n = com.tencent.mm.plugin.finder.feed.ui.l3.f110255d;
        k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.ui.m3(finderFriendLikeTimelineUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
