package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI f110487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f110488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI finderLiveFansListUI, com.tencent.mm.modelbase.m1 m1Var) {
        super(0);
        this.f110487d = finderLiveFansListUI;
        this.f110488e = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.f fVar = ((db2.n5) ((zy2.kc) this.f110488e)).f228100g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
        java.util.LinkedList list = ((r45.v51) fVar).getList(5);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI.D;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI finderLiveFansListUI = this.f110487d;
        finderLiveFansListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i(finderLiveFansListUI.f109367v, sb6.toString());
        if (list != null) {
            java.util.ArrayList arrayList = finderLiveFansListUI.f109371z;
            arrayList.addAll(list);
            com.tencent.mm.plugin.finder.feed.ui.o9 o9Var = finderLiveFansListUI.f109370y;
            o9Var.getClass();
            o9Var.f110369d = arrayList;
            o9Var.notifyDataSetChanged();
            finderLiveFansListUI.e7();
        }
        return jz5.f0.f302826a;
    }
}
