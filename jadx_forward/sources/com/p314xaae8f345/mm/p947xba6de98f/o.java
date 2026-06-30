package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.n1 f152644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.z f152645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var, com.p314xaae8f345.mm.p947xba6de98f.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152644d = n1Var;
        this.f152645e = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.o(this.f152644d, this.f152645e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p947xba6de98f.o oVar = (com.p314xaae8f345.mm.p947xba6de98f.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = this.f152644d;
        int ordinal = n1Var.f152636a.ordinal();
        com.p314xaae8f345.mm.p947xba6de98f.z zVar = this.f152645e;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            com.p314xaae8f345.mm.p947xba6de98f.e eVar = n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152610f ? (com.p314xaae8f345.mm.p947xba6de98f.e) zVar.Y6().get(n1Var.f152637b) : (com.p314xaae8f345.mm.p947xba6de98f.e) zVar.Y6().remove(n1Var.f152637b);
            if (eVar != null && (i2Var = eVar.f152461b) != null) {
                n1Var.f152639d = eVar.f152460a;
                jz5.g gVar = com.p314xaae8f345.mm.p947xba6de98f.z.f152707n;
                zVar.W6(i2Var, n1Var);
            }
        } else if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
            com.p314xaae8f345.mm.p947xba6de98f.e eVar2 = n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152613i ? (com.p314xaae8f345.mm.p947xba6de98f.e) zVar.Z6().get(n1Var.f152637b) : (com.p314xaae8f345.mm.p947xba6de98f.e) zVar.Z6().remove(n1Var.f152637b);
            if (eVar2 != null && (i2Var2 = eVar2.f152461b) != null) {
                n1Var.f152639d = eVar2.f152460a;
                jz5.g gVar2 = com.p314xaae8f345.mm.p947xba6de98f.z.f152707n;
                zVar.W6(i2Var2, n1Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
