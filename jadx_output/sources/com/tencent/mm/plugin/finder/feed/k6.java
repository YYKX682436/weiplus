package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f107173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f107176g;

    public k6(android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f107173d = textView;
        this.f107174e = str;
        this.f107175f = a7Var;
        this.f107176g = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = this.f107173d;
        if (textView != null) {
            textView.setText(this.f107174e);
        }
        com.tencent.mm.plugin.finder.feed.a7.g(this.f107175f, r45.vg7.emFinderGetCommentListSortType_Default);
        this.f107176g.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$showSortBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
