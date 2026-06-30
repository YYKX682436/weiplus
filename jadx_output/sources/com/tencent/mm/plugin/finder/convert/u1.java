package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f104659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f104661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104662g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104663h;

    public u1(com.tencent.mm.plugin.finder.convert.x1 x1Var, so2.y0 y0Var, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, in5.s0 s0Var, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter) {
        this.f104659d = x1Var;
        this.f104660e = y0Var;
        this.f104661f = finderEmojiView;
        this.f104662g = s0Var;
        this.f104663h = nPresenter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.convert.x1.n(this.f104659d);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f104660e.f410714r;
        java.lang.String md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
        if (md52 == null) {
            md52 = "";
        }
        objArr[0] = md52;
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f104661f;
        objArr[1] = java.lang.Integer.valueOf(finderEmojiView.getStatus());
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "emoji longClick %s emojiStatus:%d", objArr);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f104662g.f293121e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.convert.r1(finderEmojiView, 0, 1);
        so2.y0 y0Var = this.f104660e;
        k0Var.f211881s = new com.tencent.mm.plugin.finder.convert.s1(0, y0Var, this.f104662g, 1, this.f104663h);
        k0Var.f211892z = new com.tencent.mm.plugin.finder.convert.t1(0, y0Var);
        k0Var.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
