package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes2.dex */
public final class jy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 f200320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f200321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f200322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f200323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 c14412x91d09c17, java.lang.Object obj, yz5.l lVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200320d = c14412x91d09c17;
        this.f200321e = obj;
        this.f200322f = lVar;
        this.f200323g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jy(this.f200320d, this.f200321e, this.f200322f, this.f200323g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jy jyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jyVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Object ret = this.f200321e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ret, "$ret");
        yz5.l lVar = this.f200322f;
        yz5.a aVar2 = this.f200323g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17.a(this.f200320d, (r45.nw6) ret, lVar, aVar2);
        return jz5.f0.f384359a;
    }
}
