package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104924f;

    public x3(com.tencent.mm.plugin.finder.convert.u4 u4Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f104922d = u4Var;
        this.f104923e = textView;
        this.f104924f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f104922d.f104670e;
        android.widget.TextView commentFailTV = this.f104923e;
        kotlin.jvm.internal.o.f(commentFailTV, "$commentFailTV");
        nPresenter.E(commentFailTV, this.f104924f.getAdapterPosition());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
