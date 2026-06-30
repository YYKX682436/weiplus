package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class y0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 f109915a;

    public y0(com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var) {
        this.f109915a = d1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.j51 j51Var = (r45.j51) fVar.f70618d;
        if (fVar.f70615a != 0 || fVar.f70616b != 0 || j51Var == null) {
            return new com.tencent.mm.plugin.finder.feed.m2(false, new java.util.ArrayList());
        }
        this.f109915a.f109830q = j51Var.getInteger(5) == 1;
        this.f109915a.f109829p = j51Var.getByteString(3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreImageComment after lastBuffer ");
        if (this.f109915a.f109829p == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f109915a.f109829p;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("FinderCommentImageFlowViewModel", sb6.toString());
        java.util.LinkedList list = j51Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getCommentInfo(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj2).getContent_type() == 2) {
                arrayList.add(obj2);
            }
        }
        com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var = this.f109915a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next();
            kotlin.jvm.internal.o.d(finderCommentInfo);
            long id6 = d1Var.O6().getId();
            java.lang.String dupFlag = d1Var.O6().getDupFlag();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = id6;
            yj0Var.field_dupFlag = dupFlag;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, finderCommentInfo);
            yj0Var.n1(0L);
            arrayList2.add(new so2.y0(yj0Var));
        }
        return new com.tencent.mm.plugin.finder.feed.m2(true, kz5.n0.V0(arrayList2));
    }
}
