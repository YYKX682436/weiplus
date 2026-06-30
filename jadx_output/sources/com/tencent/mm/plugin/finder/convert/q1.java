package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f104305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104306f;

    public q1(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, so2.y0 y0Var) {
        this.f104304d = nPresenter;
        this.f104305e = finderEmojiView;
        this.f104306f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderEmojiView emojiView = this.f104305e;
        kotlin.jvm.internal.o.f(emojiView, "$emojiView");
        this.f104304d.n(emojiView, this.f104306f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
