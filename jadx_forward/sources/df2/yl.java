package df2;

/* loaded from: classes3.dex */
public final class yl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vb2 f313409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f313410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.hm f313411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(r45.vb2 vb2Var, android.view.ViewGroup viewGroup, df2.hm hmVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313409e = vb2Var;
        this.f313410f = viewGroup;
        this.f313411g = hmVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.yl(this.f313409e, this.f313410f, this.f313411g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313408d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long max = java.lang.Math.max(this.f313409e.m75939xb282bd08(2), 0) * 1000;
            this.f313408d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(max, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f313410f.setVisibility(8);
        df2.hm.Z6(this.f313411g);
        return jz5.f0.f384359a;
    }
}
