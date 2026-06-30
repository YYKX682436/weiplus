package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275089d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 f275091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f275091f = p1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.o1 o1Var = new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.o1(this.f275091f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        o1Var.f275089d = (g4.j3) obj;
        o1Var.f275090e = (java.util.List) obj2;
        return o1Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g4.j3 filter = (g4.j3) this.f275089d;
        for (com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.u0 u0Var : (java.util.List) this.f275090e) {
            this.f275091f.getClass();
            if (!(u0Var instanceof com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.t0)) {
                throw new jz5.j();
            }
            com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.m1 m1Var = new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.m1(u0Var, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "$this$filter");
            filter = new g4.j3(new g4.t3(filter.f349922a, m1Var), filter.f349923b);
        }
        return filter;
    }
}
