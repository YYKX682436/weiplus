package hk0;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.u0 f363328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f363329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hk0.k f363330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(hk0.u0 u0Var, java.util.ArrayList arrayList, hk0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363328e = u0Var;
        this.f363329f = arrayList;
        this.f363330g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hk0.q0(this.f363328e, this.f363329f, this.f363330g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk0.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363327d;
        hk0.u0 u0Var = this.f363328e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f363327d = 1;
            hk0.u0.O6(u0Var, this.f363329f, this);
            if (f0Var == aVar) {
                return aVar;
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
        hk0.k kVar = this.f363330g;
        if (kVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new hk0.i(hk0.d1.f363253d, kVar));
            this.f363327d = 2;
            hk0.u0.N6(u0Var, arrayList, this);
            if (f0Var == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
