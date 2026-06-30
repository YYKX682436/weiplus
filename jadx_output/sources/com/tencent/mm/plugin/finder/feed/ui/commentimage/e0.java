package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(1);
        this.f109839d = finderCommentImageFlowUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String d17;
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109839d;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d76 = finderCommentImageFlowUI.d7();
        d76.getClass();
        java.util.ArrayList arrayList = d76.f109827n;
        if (intValue >= 0 && intValue < arrayList.size()) {
            java.lang.Object obj2 = arrayList.get(intValue);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            so2.y0 y0Var = (so2.y0) obj2;
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = nv2.n1.f340551h.i(d76.O6().getId(), y0Var.f410703d, d76.f109822f);
            com.tencent.mars.xlog.Log.i("FinderCommentImageFlowViewModel", "[onLikeComment] position=" + intValue + " isLike=" + c0Var.f310112d + " commentObj=" + y0Var.f410703d);
            c0Var.f310112d = c0Var.f310112d ^ true;
            pf5.z zVar = pf5.z.f353948a;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(finderCommentImageFlowUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            boolean H = hc2.o0.H(d76.O6().getFeedObject());
            if (!H) {
                str = "get(...)";
            } else if (c0Var.f310112d) {
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
                yj0Var.l1(yj0Var.z0() | 1);
                com.tencent.mm.protocal.protobuf.FinderCommentInfo u07 = y0Var.f410703d.u0();
                r45.dc dcVar = new r45.dc();
                str = "get(...)";
                dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                u07.setAuthor_reaction_info(dcVar);
            } else {
                str = "get(...)";
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = y0Var.f410703d;
                yj0Var2.l1(yj0Var2.z0() & (-2));
            }
            d17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.d(null, 0, y0Var.D, y0Var.f410703d.w0(), y0Var.f410714r, y0Var.f410703d.J0(), (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : null);
            so2.e2.a(so2.e2.f410328a, V6, d76.O6().getId(), d76.O6().getDupFlag(), d76.O6().getObjectNonceId(), y0Var.f410703d, c0Var.f310112d, d76.f109822f, H, null, 0, d17, new com.tencent.mm.plugin.finder.feed.ui.commentimage.x0(new com.tencent.mm.plugin.finder.feed.ui.commentimage.a1(d76, y0Var, c0Var)), 768, null);
            java.lang.Object a17 = zVar.a(finderCommentImageFlowUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, str);
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                long id6 = d76.O6().getId();
                java.lang.String dupFlag = d76.O6().getDupFlag();
                boolean z17 = c0Var.f310112d;
                e27.a(new ec2.a(15, id6, dupFlag));
                if (z17) {
                    e27.a(new ec2.a(27, id6, dupFlag));
                } else {
                    e27.a(new ec2.a(28, id6, dupFlag));
                }
            }
            long id7 = d76.O6().getId();
            long itemId = y0Var.getItemId();
            boolean z18 = c0Var.f310112d;
            com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = new com.tencent.mm.autogen.events.FinderCommentChangeEvent();
            am.ta taVar = finderCommentChangeEvent.f54263g;
            taVar.f7993a = id7;
            taVar.f7994b = itemId;
            taVar.f7995c = z18 ? com.tencent.mm.plugin.finder.storage.wj0.Z : com.tencent.mm.plugin.finder.storage.wj0.f128259p0;
            finderCommentChangeEvent.e();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ok(c0Var.f310112d, y0Var.f410703d.t0());
        } else {
            com.tencent.mars.xlog.Log.i("FinderCommentImageFlowViewModel", "onLikeComment position: " + intValue);
        }
        return jz5.f0.f302826a;
    }
}
