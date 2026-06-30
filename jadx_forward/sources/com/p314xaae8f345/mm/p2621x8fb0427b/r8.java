package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes10.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f276813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f276814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f276813e = arrayList;
        this.f276814f = arrayList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.r8(this.f276813e, this.f276814f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.r8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f276812d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "initDBWithData");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init after to insert data >> dataList: ");
            java.util.ArrayList arrayList = this.f276813e;
            sb6.append(arrayList.size());
            sb6.append(", oldNoRecData: ");
            java.util.ArrayList arrayList2 = this.f276814f;
            sb6.append(arrayList2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
            f65.p.f341472f = arrayList.size();
            f65.p.f341473g = arrayList2.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.c((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next(), aq.o.f94454b);
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p2621x8fb0427b.q8 q8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.q8(arrayList, arrayList2, null);
            this.f276812d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(g3Var, q8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
