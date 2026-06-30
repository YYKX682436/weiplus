package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class l0 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f109859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109860b;

    public l0(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109859a = finderCommentFooter;
        this.f109860b = finderCommentImageFlowUI;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onReply privacy result " + bool);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f109859a;
        finderCommentFooter.setFrozen(false);
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            finderCommentFooter.postDelayed(new com.tencent.mm.plugin.finder.feed.ui.commentimage.k0(finderCommentFooter), 300L);
            return;
        }
        int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109860b;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.d1.P6(finderCommentImageFlowUI.d7(), this.f109860b, finderCommentFooter, finderCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String(), finderCommentFooter.getMentionListWhenReply(), null, 16, null);
        rx2.d dVar = finderCommentFooter.D1;
        dVar.f400966b.clear();
        dVar.f400965a.clear();
        finderCommentImageFlowUI.c7();
    }
}
