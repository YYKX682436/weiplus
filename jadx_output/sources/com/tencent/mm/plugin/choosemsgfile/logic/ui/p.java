package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class p implements com.tencent.mm.plugin.choosemsgfile.logic.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.u f95552a;

    public p(com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar) {
        this.f95552a = uVar;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.logic.ui.v
    public void a(boolean z17, wv1.a aVar, androidx.recyclerview.widget.k3 k3Var) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileUIController", "[onCheck] item is null, err");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileUIController", "[onCheck] isChecked:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar = this.f95552a;
        if (z17) {
            synchronized (aVar) {
                aVar.f449933e = 1;
            }
            xv1.b a17 = com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(uVar);
            long f17 = aVar.f();
            synchronized (a17) {
                java.util.Set set = a17.f457390d;
                if (set != null) {
                    ((java.util.HashSet) set).add(java.lang.Long.valueOf(f17));
                }
            }
            com.tencent.mm.plugin.choosemsgfile.logic.ui.n nVar = new com.tencent.mm.plugin.choosemsgfile.logic.ui.n(this, aVar, k3Var);
            com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var = uVar.f95528b;
            vv1.b.a(aVar, nVar, f0Var.getContext() instanceof im5.b ? (im5.b) f0Var.getContext() : null);
        } else {
            synchronized (aVar) {
                aVar.f449933e = 0;
            }
            com.tencent.mm.plugin.choosemsgfile.logic.ui.u.a(uVar).f(aVar.f());
            uVar.f95528b.f6().e(aVar.f());
            if (uVar.f95528b.f6().c()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.o(this));
            }
            uVar.f95528b.v2();
        }
        if (k3Var != null && ((wv1.a) ((wv1.o) k3Var).f449960e.getTag()).equals(aVar)) {
            aVar.l(k3Var);
        }
    }
}
