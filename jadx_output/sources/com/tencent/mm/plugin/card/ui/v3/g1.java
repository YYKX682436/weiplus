package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95324b;

    public g1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, java.lang.String str) {
        this.f95323a = vipCardListUI;
        this.f95324b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95323a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.hd0 hd0Var = (r45.hd0) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(hd0Var.f376062d));
            if (hd0Var.f376062d == 0) {
                java.util.Iterator it = vipCardListUI.f95279v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.card.ui.v3.t0 t0Var = (com.tencent.mm.plugin.card.ui.v3.t0) it.next();
                    if (kotlin.jvm.internal.o.b(t0Var.a().f386765d, this.f95324b)) {
                        vipCardListUI.f95279v.remove(t0Var);
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = vipCardListUI.f95278u;
                        if (wxRecyclerAdapter == null) {
                            kotlin.jvm.internal.o.o("mVipCardListAdapter");
                            throw null;
                        }
                        wxRecyclerAdapter.notifyDataSetChanged();
                    }
                }
            } else {
                lu1.a0.r(vipCardListUI, hd0Var.f376063e);
            }
        } else {
            lu1.a0.q(vipCardListUI, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.tencent.mm.plugin.card.ui.v3.VipCardListUI.S;
        vipCardListUI.a7(bool);
        return jz5.f0.f302826a;
    }
}
