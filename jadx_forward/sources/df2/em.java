package df2;

/* loaded from: classes3.dex */
public final class em extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tb2 f311603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f311604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.hm f311605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(r45.tb2 tb2Var, android.view.ViewGroup viewGroup, df2.hm hmVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311603e = tb2Var;
        this.f311604f = viewGroup;
        this.f311605g = hmVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.em(this.f311603e, this.f311604f, this.f311605g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.em) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311602d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long max = java.lang.Math.max(this.f311603e.m75939xb282bd08(3), 0) * 1000;
            this.f311602d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(max, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f311604f.setVisibility(8);
        df2.hm.Z6(this.f311605g);
        return jz5.f0.f384359a;
    }
}
