package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes.dex */
public final class w implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109908d;

    public w(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109908d = finderCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (((java.lang.Number) obj).intValue() == -4012) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109908d;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(finderCommentImageFlowUI);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.f211776c = finderCommentImageFlowUI.getString(com.tencent.mm.R.string.f491365nl1);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
