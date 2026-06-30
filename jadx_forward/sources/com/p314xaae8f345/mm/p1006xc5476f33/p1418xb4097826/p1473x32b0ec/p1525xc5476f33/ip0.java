package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes16.dex */
public final class ip0 extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.M = tyVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip0(this.M, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.L;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                o0.k kVar = new o0.k();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.M;
                kVar.set(1, db2.t4.f309704a.a(11572));
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                kVar.set(2, xy2.c.e(context));
                int i18 = 3;
                kVar.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) tyVar.P0(mm2.e1.class)).f410518o));
                kVar.set(4, java.lang.Long.valueOf(((mm2.e1) tyVar.P0(mm2.e1.class)).f410516m));
                kVar.set(5, java.lang.Long.valueOf(((mm2.e1) tyVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                if (!((mm2.c1) tyVar.P0(mm2.c1.class)).T) {
                    if (((mm2.c1) tyVar.P0(mm2.c1.class)).N7()) {
                        i18 = 1;
                    } else {
                        i18 = ((mm2.n0) tyVar.P0(mm2.n0.class)).f410806r ? 16 : 2;
                    }
                }
                kVar.set(6, java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.p944x882e457a.i a17 = kVar.a();
                this.L = 1;
                obj = rm0.h.b(a17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
            if (fVar.b()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar2 = this.M;
                tyVar2.L.d(tyVar2.R0());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar3 = this.M;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14325xe0883bfd c14325xe0883bfd = tyVar3.L;
                o0.l lVar = (o0.l) fVar.f152151d;
                r45.xn1 xn1Var = null;
                r45.xn1 xn1Var2 = (lVar == null || (m75941xfb8219143 = lVar.m75941xfb821914(1)) == null) ? null : (r45.xn1) kz5.n0.a0(m75941xfb8219143, 0);
                o0.l lVar2 = (o0.l) fVar.f152151d;
                r45.xn1 xn1Var3 = (lVar2 == null || (m75941xfb8219142 = lVar2.m75941xfb821914(1)) == null) ? null : (r45.xn1) kz5.n0.a0(m75941xfb8219142, 1);
                o0.l lVar3 = (o0.l) fVar.f152151d;
                if (lVar3 != null && (m75941xfb821914 = lVar3.m75941xfb821914(1)) != null) {
                    xn1Var = (r45.xn1) kz5.n0.a0(m75941xfb821914, 2);
                }
                c14325xe0883bfd.c(tyVar3, xn1Var2, xn1Var3, xn1Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.M.f196021q, e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
