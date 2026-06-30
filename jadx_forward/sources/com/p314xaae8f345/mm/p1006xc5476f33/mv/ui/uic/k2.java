package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f232776d = c16668xffb9dd68;
        this.f232777e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k2(this.f232776d, this.f232777e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = 0;
        for (java.lang.Object obj2 : this.f232776d.f232510g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            lm3.e eVar = (lm3.e) obj2;
            if (java.lang.Math.abs(i17 - this.f232777e) > 1) {
                eVar.f401015d.getClass();
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
