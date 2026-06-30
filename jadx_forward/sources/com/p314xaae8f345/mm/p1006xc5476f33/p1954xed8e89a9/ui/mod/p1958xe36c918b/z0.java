package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 f235699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 j1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235699d = j1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.z0(this.f235699d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r61.a h17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 j1Var = this.f235699d;
        com.p314xaae8f345.mm.p670x38b72420.o U6 = j1Var.U6();
        if (U6 == null) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) j1Var.f393013h;
        java.lang.String valueOf = java.lang.String.valueOf(c21503x6e5a020a != null ? c21503x6e5a020a.m79028xfb85ada3() : null);
        yq3.v vVar = (yq3.v) U6;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
        int m43619x2fa78b11 = z3Var != null ? z3Var.m43619x2fa78b11() : 0;
        if ((m43619x2fa78b11 == 10 || m43619x2fa78b11 == 11 || m43619x2fa78b11 == 13) && (h17 = m61.k.wi().h(vVar.h())) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h())) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf)) {
                h17.f474334q |= 1;
            } else {
                h17.f474334q &= -2;
            }
            r61.b wi6 = m61.k.wi();
            if (wi6 != null) {
                qz5.b.d(wi6.j(h17.e(), h17));
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) j1Var.f393013h;
        vVar.q(java.lang.String.valueOf(c21503x6e5a020a2 != null ? c21503x6e5a020a2.m79028xfb85ada3() : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModRemarkUI", "doSaveLocalAfterRequest new Remark: " + vVar.c());
        return jz5.f0.f384359a;
    }
}
