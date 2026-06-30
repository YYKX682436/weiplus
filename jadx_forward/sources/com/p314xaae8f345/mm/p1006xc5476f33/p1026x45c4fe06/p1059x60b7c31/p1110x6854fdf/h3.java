package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class h3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public h3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        ot0.q qVar;
        com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c event = (com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a() || (qVar = event.f150518g) == null) {
            return false;
        }
        java.lang.String str = qVar.f430222n2;
        if (!(str == null || str.length() == 0)) {
            java.lang.String appbrandShareActionId = qVar.f430222n2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appbrandShareActionId, "appbrandShareActionId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2();
            if (kz5.z.G(new java.lang.Integer[]{2, 3}, java.lang.Integer.valueOf(qVar.f430214l2))) {
                q2Var.f164747a = 1;
                q2Var.f164748b = qVar.n();
                q2Var.f164749c = qVar.f430202i2;
                ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                q2Var.f164750d = aVar != null ? aVar.f429901x : null;
            } else {
                q2Var.f164747a = 0;
                q2Var.f164748b = qVar.n();
                q2Var.f164750d = qVar.f430267z;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r2.b(appbrandShareActionId, q2Var);
        }
        return true;
    }
}
