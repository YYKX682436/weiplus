package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderCommentChangeEvent f109913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(0);
        this.f109913d = finderCommentChangeEvent;
        this.f109914e = finderCommentImageFlowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = this.f109913d;
        int i17 = finderCommentChangeEvent.f54263g.f7995c;
        int i18 = com.tencent.mm.plugin.finder.storage.wj0.Z;
        am.ta taVar = finderCommentChangeEvent.f54263g;
        int i19 = -1;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109914e;
        if (i17 == i18) {
            int i27 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
            java.util.Iterator it = finderCommentImageFlowUI.d7().f109827n.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((so2.y0) it.next()).getItemId() == taVar.f7994b) {
                    i19 = i28;
                    break;
                }
                i28++;
            }
            if (i19 >= 0) {
                java.lang.Object obj = finderCommentImageFlowUI.d7().f109827n.get(i19);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                so2.y0 y0Var = (so2.y0) obj;
                if (hc2.o0.H(finderCommentImageFlowUI.d7().O6().getFeedObject())) {
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
                    yj0Var.l1(yj0Var.z0() | 1);
                    com.tencent.mm.protocal.protobuf.FinderCommentInfo u07 = y0Var.f410703d.u0();
                    r45.dc dcVar = new r45.dc();
                    dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                    u07.setAuthor_reaction_info(dcVar);
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderCommentImageFlowUI.f109780x;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(i19, 1);
                }
            }
        } else if (i17 == com.tencent.mm.plugin.finder.storage.wj0.f128259p0) {
            int i29 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
            java.util.Iterator it6 = finderCommentImageFlowUI.d7().f109827n.iterator();
            int i37 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((so2.y0) it6.next()).getItemId() == taVar.f7994b) {
                    i19 = i37;
                    break;
                }
                i37++;
            }
            if (i19 >= 0) {
                java.lang.Object obj2 = finderCommentImageFlowUI.d7().f109827n.get(i19);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                so2.y0 y0Var2 = (so2.y0) obj2;
                if (hc2.o0.H(finderCommentImageFlowUI.d7().O6().getFeedObject())) {
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = y0Var2.f410703d;
                    yj0Var2.l1(yj0Var2.z0() & (-2));
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = finderCommentImageFlowUI.f109780x;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemChanged(i19, 1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
