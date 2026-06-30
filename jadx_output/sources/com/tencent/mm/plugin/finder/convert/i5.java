package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class i5 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103639e;

    public i5(com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var) {
        this.f103638d = q6Var;
        this.f103639e = s0Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$4", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "finder_feed_jumper_comment_desc child added");
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103638d;
        q6Var.getClass();
        in5.s0 s0Var = this.f103639e;
        so2.z0 z0Var = (so2.z0) s0Var.f293125i;
        if (z0Var != null && q6Var.f104342g) {
            q6Var.v(s0Var, z0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$4", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$4", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "finder_feed_jumper_comment_desc child removed");
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f103638d;
        q6Var.getClass();
        in5.s0 s0Var = this.f103639e;
        so2.z0 z0Var = (so2.z0) s0Var.f293125i;
        if (z0Var != null && q6Var.f104342g) {
            q6Var.v(s0Var, z0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$4", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
