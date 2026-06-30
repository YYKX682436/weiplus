package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f107276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f107279g;

    public l6(android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f107276d = textView;
        this.f107277e = str;
        this.f107278f = a7Var;
        this.f107279g = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f107276d;
        if (textView != null) {
            textView.setText(this.f107277e);
        }
        com.tencent.mm.plugin.finder.feed.a7.g(this.f107278f, r45.vg7.emFinderGetCommentListSortType_Latest);
        this.f107279g.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
