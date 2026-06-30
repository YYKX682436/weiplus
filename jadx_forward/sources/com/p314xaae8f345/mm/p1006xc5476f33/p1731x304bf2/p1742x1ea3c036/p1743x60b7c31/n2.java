package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes8.dex */
public class n2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String string = ((android.os.Bundle) obj).getString("url");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Di(string, new m33.f1() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.n2$$a
            @Override // m33.f1
            public final void a(m33.e1 e1Var) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = com.p314xaae8f345.mm.p794xb0fa9b5e.r.this;
                if (e1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f404815a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f404816b) || (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.l() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.l().f405658d.contains(e1Var.f404815a))) {
                    rVar2.a(null);
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", e1Var.f404815a);
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e1Var.f404816b);
                rVar2.a(bundle);
            }
        });
    }
}
