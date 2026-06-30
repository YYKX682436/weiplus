package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class w7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f110688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f110689b;

    public w7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI, yz5.q qVar) {
        this.f110688a = finderLiveBizListUI;
        this.f110689b = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ke2.n0 n0Var = ke2.o0.f306976v;
        kotlin.jvm.internal.o.d(fVar);
        r45.vl3 vl3Var = (r45.vl3) n0Var.a(fVar, new r45.vl3());
        if (vl3Var != null) {
            if ((fVar.f70615a == 0) && fVar.f70616b == 0) {
                int integer = vl3Var.getInteger(2);
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI = this.f110688a;
                finderLiveBizListUI.A = integer;
                finderLiveBizListUI.B = vl3Var.getString(3);
            } else {
                int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI.C;
                com.tencent.mars.xlog.Log.e("finder_live_biz_list", "GetProfileScreenCastReq Request Fail! errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.v7(this.f110689b, fVar, vl3Var));
        }
        return jz5.f0.f302826a;
    }
}
