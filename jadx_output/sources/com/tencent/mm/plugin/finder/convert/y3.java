package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104988f;

    public y3(com.tencent.mm.plugin.finder.convert.u4 u4Var, in5.s0 s0Var, so2.y0 y0Var) {
        this.f104986d = u4Var;
        this.f104987e = s0Var;
        this.f104988f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$28$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f104986d.f104670e;
        android.view.View itemView = this.f104987e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        nPresenter.u(itemView, this.f104988f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$28$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
