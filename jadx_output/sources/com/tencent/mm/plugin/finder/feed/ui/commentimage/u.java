package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109899d;

    public u(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109899d = finderCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        jz5.l lVar = (jz5.l) obj;
        so2.y0 y0Var = (so2.y0) lVar.f302833d;
        int intValue = ((java.lang.Number) lVar.f302834e).intValue();
        int w07 = y0Var.f410703d.w0();
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109899d;
        if (w07 == 2) {
            int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
            finderCommentImageFlowUI.d7().f109827n.add(intValue, y0Var);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderCommentImageFlowUI.f109780x;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemInserted(intValue);
            }
        }
        int i18 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(finderCommentImageFlowUI);
        t4Var.f6042e = finderCommentImageFlowUI.getString(com.tencent.mm.R.string.lot);
        t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
        t4Var.a(finderCommentImageFlowUI.getString(com.tencent.mm.R.string.njs));
        t4Var.f6038a.f6014b = new com.tencent.mm.plugin.finder.feed.ui.commentimage.t(finderCommentImageFlowUI, y0Var);
        t4Var.g();
        return jz5.f0.f302826a;
    }
}
