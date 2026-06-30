package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f110397e;

    public p5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, android.view.View view) {
        this.f110396d = finderHorizontalVideoHalfFeedUI;
        this.f110397e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI.B;
        com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f110396d;
        finderHorizontalVideoHalfFeedUI.l7(true);
        android.view.View view2 = this.f110397e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.feed.wb wbVar = finderHorizontalVideoHalfFeedUI.f109292x;
        if (wbVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        wbVar.P();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$showRetryTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
