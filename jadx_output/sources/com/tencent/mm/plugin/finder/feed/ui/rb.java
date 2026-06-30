package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class rb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110491e;

    public rb(android.view.View view, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110490d = view;
        this.f110491e = finderLivePostSelectContactUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f110490d;
        int i17 = this.f110491e.f109402J ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
