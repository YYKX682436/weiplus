package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes16.dex */
public final class hp0 extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.M = ivVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hp0(this.M, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hp0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.L;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                o0.k kVar = new o0.k();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.M;
                kVar.set(1, db2.t4.f309704a.a(11572));
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                int i18 = 2;
                kVar.set(2, xy2.c.e(context));
                kVar.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) ivVar.P0(mm2.e1.class)).f410518o));
                kVar.set(4, java.lang.Long.valueOf(((mm2.e1) ivVar.P0(mm2.e1.class)).f410516m));
                kVar.set(5, java.lang.Long.valueOf(((mm2.e1) ivVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                if (((mm2.c1) ivVar.P0(mm2.c1.class)).T) {
                    i18 = 3;
                } else if (((mm2.c1) ivVar.P0(mm2.c1.class)).N7()) {
                    i18 = 1;
                } else {
                    if (((mm2.n0) ivVar.P0(mm2.n0.class)).f410806r) {
                        i18 = 16;
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
                bm2.n5 n5Var = this.M.W;
                o0.l lVar = (o0.l) fVar.f152151d;
                n5Var.R = lVar != null ? lVar.m75941xfb821914(1) : null;
                n5Var.B();
                n5Var.m8146xced61ae5();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.M.f194549r, e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
