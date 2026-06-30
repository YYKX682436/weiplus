package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class t10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.x10 f109026d;

    public t10(com.tencent.mm.plugin.finder.feed.x10 x10Var) {
        this.f109026d = x10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f109026d;
        if (x10Var.E == 9) {
            android.view.View view2 = x10Var.f111027x;
            kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView");
            ((com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView) view2).b();
        } else {
            android.view.KeyEvent.Callback callback = x10Var.f111027x;
            kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.IFinderFollowTopicHeaderView");
            ((com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView) ((uo2.k0) callback)).D();
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.D(x10Var.f106174d, false, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$getHeaderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
