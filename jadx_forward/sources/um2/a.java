package um2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.g f510240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(um2.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510240e = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.a(this.f510240e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510239d;
        um2.g gVar = this.f510240e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jf0 jf0Var = gVar.f510334f;
            if (jf0Var != null) {
                this.f510239d = 1;
                ya2.b2 b17 = jf0Var.Y().f492179a != null ? ya2.h.f542017a.b(jf0Var.Y().f492179a) : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17 != null ? b17.y0() : null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPlugin", "update bg fail,contact is null!");
                    jf0Var.f194631x.setVisibility(8);
                    jf0Var.N.setVisibility(0);
                } else {
                    jf0Var.v1((b17 == null || (c19780xceb4c4dc = b17.f69300x731cac1b) == null) ? null : c19780xceb4c4dc.m76029xad9975ba(), jf0Var.Y().f492180b, b17 != null ? b17.f69300x731cac1b : null);
                    jf0Var.x1(b17 != null ? b17.y0() : "", jf0Var.Y().f492179a, this);
                }
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jf0 jf0Var2 = gVar.f510334f;
        if (jf0Var2 != null) {
            this.f510239d = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(jf0Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ef0(jf0Var2, null), 3, null);
            if (f0Var == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
