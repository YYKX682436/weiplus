package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f196987d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f196988e;

    /* renamed from: f, reason: collision with root package name */
    public int f196989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 f196990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196990g = j1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.c1(this.f196990g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f196989f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var2 = this.f196990g;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = j1Var2.f197110j;
            this.f196987d = dVar;
            this.f196988e = j1Var2;
            this.f196989f = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            j1Var = j1Var2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f196988e;
            java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f196987d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj3;
        }
        try {
            ((java.util.LinkedHashMap) j1Var.f197109i).clear();
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
