package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f109133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109134b;

    public u3(so2.y0 y0Var, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f109133a = y0Var;
        this.f109134b = a7Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("Finder.DrawerPresenter", "loadMoreLevel2Comments resp null");
            return new jz5.l(-2, p0Var);
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0 || fVar.f70618d == null) {
            return fVar.f70616b == -4032 ? new jz5.l(-1, p0Var) : new jz5.l(0, p0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments after lastBuffer ");
        so2.y0 y0Var = this.f109133a;
        if (y0Var.f410703d.u0().getLastBuffer() == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g lastBuffer = y0Var.f410703d.u0().getLastBuffer();
            b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list = ((r45.j51) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getCommentInfo(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
            kotlin.jvm.internal.o.d(finderCommentInfo);
            com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f109134b;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            long id6 = finderItem.getId();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.lang.String dupFlag = finderItem2.getDupFlag();
            long itemId = y0Var.getItemId();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = id6;
            yj0Var.field_dupFlag = dupFlag;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, finderCommentInfo);
            yj0Var.n1(itemId);
            arrayList.add(new so2.y0(yj0Var));
        }
        return new jz5.l(0, arrayList);
    }
}
