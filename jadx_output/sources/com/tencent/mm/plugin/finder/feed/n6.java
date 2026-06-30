package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f108558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f108561g;

    public n6(android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f108558d = textView;
        this.f108559e = str;
        this.f108560f = a7Var;
        this.f108561g = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f108558d;
        if (textView != null) {
            textView.setText(this.f108559e);
        }
        com.tencent.mm.plugin.finder.feed.a7.g(this.f108560f, r45.vg7.emFinderGetCommentListSortType_MostInteractions);
        this.f108561g.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
