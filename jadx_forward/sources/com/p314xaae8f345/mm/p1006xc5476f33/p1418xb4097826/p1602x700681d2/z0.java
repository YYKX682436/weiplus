package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f204037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f204038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f204040g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var, java.util.List list, java.lang.Long l17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f204037d = lVar;
        this.f204038e = s1Var;
        this.f204039f = list;
        this.f204040g = l17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z0(this.f204037d, this.f204038e, this.f204039f, this.f204040g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List list = this.f204039f;
        yz5.l lVar = this.f204037d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = this.f204038e;
        if (lVar == null) {
            s1Var.f203955b.f203829a.addAll(list);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = s1Var.f203958e;
            if (l0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                throw null;
            }
            l0Var.v();
            if (s1Var.f203955b.f203829a.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var2 = s1Var.f203958e;
                if (l0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                    throw null;
                }
                l0Var2.A();
            } else {
                s1Var.r(true);
            }
        } else {
            s1Var.f203955b.f203829a.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2 e2Var = s1Var.f203955b;
            e2Var.f203829a.addAll(list);
            s1Var.r(false);
            if (e2Var.f203829a.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var3 = s1Var.f203958e;
                if (l0Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                    throw null;
                }
                l0Var3.B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y0(s1Var, this.f204040g, lVar));
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            } else {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f384359a;
    }
}
