package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109882d;

    public p(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109882d = finderCommentImageFlowUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f109882d.f109781y;
        if (f5Var != null) {
            f5Var.d();
        }
    }
}
