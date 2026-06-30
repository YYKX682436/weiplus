package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class w8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110690d;

    public w8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110690d = finderLiveCreateVisitorModeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI.S;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110690d;
        finderLiveCreateVisitorModeUI.e7(false);
        java.lang.String str = finderLiveCreateVisitorModeUI.I;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI.d7(finderLiveCreateVisitorModeUI);
        } else {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            mv2.f0.f331561a.x(str, xy2.c.e(finderLiveCreateVisitorModeUI), new com.tencent.mm.plugin.finder.feed.ui.v8(finderLiveCreateVisitorModeUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
