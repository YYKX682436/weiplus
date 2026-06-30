package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.h2 f106619d;

    public e2(com.tencent.mm.plugin.finder.feed.h2 h2Var) {
        this.f106619d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "progressBar FinderActivityContentUIC visible");
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f106619d;
        android.widget.FrameLayout frameLayout = h2Var.f106888w;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = h2Var.f106889x;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.p1(h2Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
