package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f103028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103030f;

    public c7(com.tencent.mm.plugin.finder.convert.s7 s7Var, in5.s0 s0Var, so2.y0 y0Var) {
        this.f103028d = s7Var;
        this.f103029e = s0Var;
        this.f103030f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f103028d.f104528e;
        android.view.View itemView = this.f103029e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        nPresenter.u(itemView, this.f103030f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
