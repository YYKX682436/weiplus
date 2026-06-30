package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q f230915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f230915d = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p(this.f230915d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q qVar = this.f230915d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a aVar2 = qVar.f230936k;
        if (aVar2 == null) {
            return null;
        }
        float f17 = qVar.f230931f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d) aVar2;
        if (f17 <= 100.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16547xe8ba10c2 c16547xe8ba10c2 = dVar.f230839a;
            c16547xe8ba10c2.f230675n = f17;
            c16547xe8ba10c2.invalidate();
        }
        return jz5.f0.f384359a;
    }
}
