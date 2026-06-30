package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class k8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f110218b;

    public k8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI, yz5.q qVar) {
        this.f110217a = finderLiveBizSearchUI;
        this.f110218b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ke2.n0 n0Var = ke2.o0.f306976v;
        kotlin.jvm.internal.o.d(fVar);
        r45.kx5 kx5Var = (r45.kx5) n0Var.a(fVar, new r45.kx5());
        if (kx5Var != null) {
            if ((fVar.f70615a == 0) && fVar.f70616b == 0) {
                int integer = kx5Var.getInteger(2);
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI = this.f110217a;
                finderLiveBizSearchUI.C = integer;
                finderLiveBizSearchUI.D = kx5Var.getString(3);
            } else {
                int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI.C;
                com.tencent.mars.xlog.Log.e("finder_live_biz_list", "SearchScreenCastReq Request Fail! errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.j8(this.f110218b, fVar, kx5Var));
        }
        return jz5.f0.f302826a;
    }
}
