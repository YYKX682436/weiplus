package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.w1 f101960d;

    public v1(com.tencent.mm.plugin.finder.activity.uic.w1 w1Var) {
        this.f101960d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "progressBar FinderActivityContentUIC visible");
        com.tencent.mm.plugin.finder.activity.uic.w1 w1Var = this.f101960d;
        android.widget.FrameLayout frameLayout = w1Var.f101968t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = w1Var.f101969u;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        w1Var.c7().P();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
