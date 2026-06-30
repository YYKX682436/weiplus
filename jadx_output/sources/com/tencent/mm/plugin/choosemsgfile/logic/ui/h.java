package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.plugin.choosemsgfile.logic.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.l f95536a;

    public h(com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar) {
        this.f95536a = lVar;
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.logic.ui.v
    public void a(boolean z17, wv1.a aVar, androidx.recyclerview.widget.k3 k3Var) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileListUIController", "[onCheck] item is null, err");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUIController", "[onCheck] isChecked :%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar = this.f95536a;
        if (z17) {
            synchronized (aVar) {
                aVar.f449933e = 1;
            }
            xv1.b a17 = com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(lVar);
            long f17 = aVar.f();
            synchronized (a17) {
                java.util.Set set = a17.f457390d;
                if (set != null) {
                    ((java.util.HashSet) set).add(java.lang.Long.valueOf(f17));
                }
            }
            com.tencent.mm.plugin.choosemsgfile.logic.ui.f fVar = new com.tencent.mm.plugin.choosemsgfile.logic.ui.f(this, aVar, k3Var);
            com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var = lVar.f95528b;
            vv1.b.a(aVar, fVar, f0Var.getContext() instanceof im5.b ? (im5.b) f0Var.getContext() : null);
        } else {
            synchronized (aVar) {
                aVar.f449933e = 0;
            }
            com.tencent.mm.plugin.choosemsgfile.logic.ui.l.a(lVar).f(aVar.f());
            lVar.f95528b.f6().e(aVar.f());
            if (lVar.f95528b.f6().c()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.choosemsgfile.logic.ui.g(this));
            }
            lVar.f95528b.v2();
        }
        if (k3Var == null) {
            return;
        }
        aVar.l(k3Var);
    }
}
