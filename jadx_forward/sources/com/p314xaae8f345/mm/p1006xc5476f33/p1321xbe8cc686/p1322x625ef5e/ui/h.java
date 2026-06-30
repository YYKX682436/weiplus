package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l f177069a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar) {
        this.f177069a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.v
    public void a(boolean z17, wv1.a aVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileListUIController", "[onCheck] item is null, err");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUIController", "[onCheck] isChecked :%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar = this.f177069a;
        if (z17) {
            synchronized (aVar) {
                aVar.f531466e = 1;
            }
            xv1.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l.a(lVar);
            long f17 = aVar.f();
            synchronized (a17) {
                java.util.Set set = a17.f538923d;
                if (set != null) {
                    ((java.util.HashSet) set).add(java.lang.Long.valueOf(f17));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.f(this, aVar, k3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f0Var = lVar.f177061b;
            vv1.b.a(aVar, fVar, f0Var.mo54478x76847179() instanceof im5.b ? (im5.b) f0Var.mo54478x76847179() : null);
        } else {
            synchronized (aVar) {
                aVar.f531466e = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l.a(lVar).f(aVar.f());
            lVar.f177061b.f6().e(aVar.f());
            if (lVar.f177061b.f6().c()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.g(this));
            }
            lVar.f177061b.v2();
        }
        if (k3Var == null) {
            return;
        }
        aVar.l(k3Var);
    }
}
