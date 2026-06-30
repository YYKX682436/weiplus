package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f102942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f102943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102944f;

    public b7(com.tencent.mm.plugin.finder.convert.s7 s7Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f102942d = s7Var;
        this.f102943e = textView;
        this.f102944f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f102942d.f104528e;
        android.widget.TextView commentFailTV = this.f102943e;
        kotlin.jvm.internal.o.f(commentFailTV, "$commentFailTV");
        nPresenter.E(commentFailTV, this.f102944f.getAdapterPosition());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
