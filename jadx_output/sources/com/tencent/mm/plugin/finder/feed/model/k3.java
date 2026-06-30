package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class k3 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader f108113d;

    public k3(com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader finderLiveLotteryListLoader) {
        this.f108113d = finderLiveLotteryListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mars.xlog.Log.i(getTAG(), "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.tencent.mm.plugin.finder.feed.model.l3 l3Var = new com.tencent.mm.plugin.finder.feed.model.l3(i17, i18, str, null, false, null, null, 0, 248, null);
        if (!(fVar instanceof r45.ht1) || i17 != 0 || i18 != 0) {
            return l3Var;
        }
        r45.ht1 ht1Var = (r45.ht1) fVar;
        com.tencent.mm.plugin.finder.feed.model.l3 l3Var2 = new com.tencent.mm.plugin.finder.feed.model.l3(i17, i18, str, (r45.cz1) ht1Var.getCustom(1), ht1Var.getInteger(6) == 0, null, null, 0, 224, null);
        l3Var2.setLastBuffer(ht1Var.getByteString(2));
        l3Var2.setHasMore(ht1Var.getInteger(3) == 1);
        r45.jz1 jz1Var = (r45.jz1) ht1Var.getCustom(4);
        java.util.LinkedList<r45.zy1> list = jz1Var != null ? jz1Var.getList(0) : null;
        if (list == null) {
            list = new java.util.LinkedList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.zy1 zy1Var : list) {
            kotlin.jvm.internal.o.d(zy1Var);
            arrayList.add(new so2.b3(zy1Var));
        }
        l3Var2.setIncrementList(arrayList);
        ek2.a1 a1Var = iVar instanceof ek2.a1 ? (ek2.a1) iVar : null;
        l3Var2.setPullType(a1Var != null ? a1Var.f253410w : 0);
        l3Var2.f108144c = ht1Var.getString(7);
        l3Var2.f108145d = ht1Var.getString(9);
        l3Var2.f108146e = ht1Var.getInteger(8);
        return l3Var2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader finderLiveLotteryListLoader = this.f108113d;
        int i17 = finderLiveLotteryListLoader.f107487h;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ek2.a1 a1Var = new ek2.a1(i17, xy2.c.e(context), finderLiveLotteryListLoader.f107484e, finderLiveLotteryListLoader.f107485f, null, finderLiveLotteryListLoader.f107486g, finderLiveLotteryListLoader.f107483d, finderLiveLotteryListLoader.getLastBuffer(), null);
        a1Var.f253410w = 2;
        return a1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader finderLiveLotteryListLoader = this.f108113d;
        int i17 = finderLiveLotteryListLoader.f107487h;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ek2.a1 a1Var = new ek2.a1(i17, xy2.c.e(context), finderLiveLotteryListLoader.f107484e, finderLiveLotteryListLoader.f107485f, null, finderLiveLotteryListLoader.f107486g, finderLiveLotteryListLoader.f107483d, finderLiveLotteryListLoader.getLastBuffer(), null);
        a1Var.f253410w = 0;
        return a1Var;
    }
}
