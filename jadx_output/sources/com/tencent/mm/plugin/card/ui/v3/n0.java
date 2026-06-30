package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95349d;

    public n0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95349d = couponCardListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.ru ruVar = this.f95349d.C;
        kotlin.jvm.internal.o.d(ruVar);
        java.util.Iterator it = ruVar.f385209d.iterator();
        while (it.hasNext()) {
            r45.qu quVar = (r45.qu) it.next();
            g4Var.add(0, quVar.f384259d, 1, quVar.f384261f);
        }
    }
}
