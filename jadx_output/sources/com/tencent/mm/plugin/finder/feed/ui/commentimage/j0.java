package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f109849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f109851f;

    public j0(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, so2.y0 y0Var) {
        this.f109849d = finderCommentFooter;
        this.f109850e = finderCommentImageFlowUI;
        this.f109851f = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109850e;
        this.f109849d.i(finderCommentImageFlowUI.d7().f109822f, this.f109851f.f410703d, finderCommentImageFlowUI.d7().f109822f == 2);
    }
}
