package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f197049d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f197050e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f197051f;

    /* renamed from: g, reason: collision with root package name */
    public int f197052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 f197053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1 f197054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f197053h = j1Var;
        this.f197054i = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.g1(this.f197053h, this.f197054i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1 n1Var;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f197052g;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j1Var = this.f197053h;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = j1Var.f197110j;
            this.f197049d = dVar2;
            this.f197050e = j1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1 n1Var2 = this.f197054i;
            this.f197051f = n1Var2;
            this.f197052g = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            n1Var = n1Var2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1) this.f197051f;
            j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f197050e;
            dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f197049d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        try {
            int size = j1Var.f197109i.size();
            java.util.Map map = j1Var.f197109i;
            java.lang.String str = j1Var.f197111k;
            if (size > 1000) {
                java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (java.lang.System.currentTimeMillis() - ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1) entry.getValue()).f197171b > 60000) {
                        it.remove();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#putOvertimeCache remove comboid=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1) entry.getValue()).f197170a + " fromNickName=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1) entry.getValue()).f197172c);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("#putOvertimeCache comboid=");
            java.lang.String str2 = n1Var.f197170a;
            java.lang.String str3 = n1Var.f197170a;
            java.lang.String str4 = n1Var.f197172c;
            sb6.append(str2);
            sb6.append(" fromNickName=");
            sb6.append(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (str3.length() > 0) {
                if (str4.length() <= 0) {
                    z17 = false;
                }
                if (z17) {
                    map.put(str3, n1Var);
                }
            }
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            throw th6;
        }
    }
}
