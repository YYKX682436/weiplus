package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104759e;

    public v1(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, so2.y0 y0Var) {
        this.f104758d = nPresenter;
        this.f104759e = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f104758d.H(view, this.f104759e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
