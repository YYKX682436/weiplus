package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class tb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110564e;

    public tb(android.view.View view, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110563d = view;
        this.f110564e = finderLivePostSelectContactUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f110563d;
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f110564e;
        int i17 = finderLivePostSelectContactUI.K ^ true ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!finderLivePostSelectContactUI.f109402J) {
            this.f110563d.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.sb(finderLivePostSelectContactUI));
        }
        android.view.View view2 = finderLivePostSelectContactUI.f206456q;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            finderLivePostSelectContactUI.S = layoutParams.height;
        }
        finderLivePostSelectContactUI.w7();
    }
}
