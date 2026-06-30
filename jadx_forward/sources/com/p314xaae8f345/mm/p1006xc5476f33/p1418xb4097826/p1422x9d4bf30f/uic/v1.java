package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 f183493d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 w1Var) {
        this.f183493d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "progressBar FinderActivityContentUIC visible");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 w1Var = this.f183493d;
        android.widget.FrameLayout frameLayout = w1Var.f183501t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = w1Var.f183502u;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        w1Var.c7().P();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
