package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class m6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f107354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f107357g;

    public m6(android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f107354d = textView;
        this.f107355e = str;
        this.f107356f = a7Var;
        this.f107357g = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f107354d;
        if (textView != null) {
            textView.setText(this.f107355e);
        }
        com.tencent.mm.plugin.finder.feed.a7.g(this.f107356f, r45.vg7.emFinderGetCommentListSortType_TopLike);
        this.f107357g.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
