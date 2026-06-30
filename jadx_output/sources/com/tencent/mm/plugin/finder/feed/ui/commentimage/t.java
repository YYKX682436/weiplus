package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class t implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f109896b;

    public t(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, so2.y0 y0Var) {
        this.f109895a = finderCommentImageFlowUI;
        this.f109896b = y0Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        so2.y0 y0Var = this.f109896b;
        java.lang.Long valueOf = java.lang.Long.valueOf(y0Var.getItemId());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(y0Var.f410703d.Y0());
        int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109895a;
        finderCommentImageFlowUI.getClass();
        if (valueOf != null && valueOf2 != null) {
            android.content.Intent intent = finderCommentImageFlowUI.E;
            intent.putExtra("lastSentCommentIdKey", valueOf.longValue());
            intent.putExtra("lastSentCommentRootIdKey", valueOf2.longValue());
        }
        finderCommentImageFlowUI.e7();
    }
}
