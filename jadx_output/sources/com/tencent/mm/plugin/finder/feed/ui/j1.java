package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class j1 implements com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI f110170a;

    public j1(com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI) {
        this.f110170a = finderCommentUI;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI = this.f110170a;
        if (finderCommentUI.F) {
            return;
        }
        finderCommentUI.F = true;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.view.d5 d5Var = com.tencent.mm.plugin.finder.view.f5.f132064i;
        com.tencent.mm.plugin.finder.view.c5 c5Var = new com.tencent.mm.plugin.finder.view.c5(i17, data);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        intent.putExtra("COMMENT_RESULT_KEY", currentTimeMillis);
        com.tencent.mm.plugin.finder.view.f5.f132066k.put(java.lang.Long.valueOf(currentTimeMillis), c5Var);
        finderCommentUI.setResult(0, intent);
        finderCommentUI.getContentView().postDelayed(new com.tencent.mm.plugin.finder.feed.ui.i1(finderCommentUI), finderCommentUI.f109221u);
    }
}
