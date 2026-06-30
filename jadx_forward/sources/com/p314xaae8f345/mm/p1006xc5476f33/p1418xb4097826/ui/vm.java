package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class vm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d f211500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d c15099x5c64104d, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211500d = c15099x5c64104d;
        this.f211501e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vm(this.f211500d, this.f211501e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vm vmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vmVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d c15099x5c64104d = this.f211500d;
        c15099x5c64104d.f210364e.clear();
        c15099x5c64104d.f210364e.addAll(this.f211501e);
        c15099x5c64104d.f210365f.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
