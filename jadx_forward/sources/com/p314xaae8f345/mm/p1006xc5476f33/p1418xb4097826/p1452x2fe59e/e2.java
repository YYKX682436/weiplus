package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 f188152d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var) {
        this.f188152d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "progressBar FinderActivityContentUIC visible");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f188152d;
        android.widget.FrameLayout frameLayout = h2Var.f188421w;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = h2Var.f188422x;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1(h2Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
