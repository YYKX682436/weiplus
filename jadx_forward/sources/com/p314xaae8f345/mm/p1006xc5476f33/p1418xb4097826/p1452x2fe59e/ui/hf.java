package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class hf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d f191652d;

    public hf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d abstractActivityC14049xc2d06a4d) {
        this.f191652d = abstractActivityC14049xc2d06a4d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d abstractActivityC14049xc2d06a4d = this.f191652d;
        abstractActivityC14049xc2d06a4d.f210347p = false;
        abstractActivityC14049xc2d06a4d.onBackPressed();
        abstractActivityC14049xc2d06a4d.f210347p = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
