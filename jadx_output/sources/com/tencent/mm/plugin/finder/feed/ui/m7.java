package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class m7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI f110297a;

    public m7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        this.f110297a = finderLiveAnchorCommentManagerUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String nickname;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f110297a;
        if (i17 == 0 && fVar.f70616b == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList<r45.l82> list = ((r45.xu1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getRoom_manager_list(...)");
            for (r45.l82 l82Var : list) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(0, l82Var.getString(0));
                ty1Var.set(2, java.lang.Integer.valueOf(l82Var.getInteger(1)));
                java.lang.String str = null;
                if (l82Var.getInteger(1) == 2) {
                    r45.xn1 xn1Var = (r45.xn1) l82Var.getCustom(2);
                    if (xn1Var != null) {
                        nickname = xn1Var.getString(6);
                    }
                    nickname = null;
                } else {
                    r45.xn1 xn1Var2 = (r45.xn1) l82Var.getCustom(2);
                    if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                        nickname = finderContact.getNickname();
                    }
                    nickname = null;
                }
                ty1Var.set(1, nickname);
                ty1Var.set(3, 0);
                r45.xn1 xn1Var3 = (r45.xn1) l82Var.getCustom(2);
                if (xn1Var3 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) != null) {
                    str = finderContact2.getHeadUrl();
                }
                int i18 = 4;
                ty1Var.set(4, str);
                r45.xn1 xn1Var4 = (r45.xn1) l82Var.getCustom(2);
                if (xn1Var4 != null) {
                    i18 = xn1Var4.getInteger(7);
                }
                ty1Var.set(5, java.lang.Integer.valueOf(i18));
                linkedList.add(ty1Var);
            }
            finderLiveAnchorCommentManagerUI.f109324w = ((r45.xu1) fVar.f70618d).getInteger(2);
            java.util.LinkedList linkedList2 = finderLiveAnchorCommentManagerUI.f109325x;
            linkedList2.clear();
            linkedList2.addAll(((r45.xu1) fVar.f70618d).getList(1));
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.k7(finderLiveAnchorCommentManagerUI, linkedList));
        } else {
            db5.t7.g(finderLiveAnchorCommentManagerUI.getContext(), finderLiveAnchorCommentManagerUI.getContext().getResources().getString(com.tencent.mm.R.string.dte));
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.l7(finderLiveAnchorCommentManagerUI));
        }
        return jz5.f0.f302826a;
    }
}
