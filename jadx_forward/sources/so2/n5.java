package so2;

/* loaded from: classes8.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f492030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f492032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f492033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(so2.k5 k5Var, java.lang.String str, int i17, r45.ix0 ix0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492030d = k5Var;
        this.f492031e = str;
        this.f492032f = i17;
        this.f492033g = ix0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.n5(this.f492030d, this.f492031e, this.f492032f, this.f492033g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        so2.n5 n5Var = (so2.n5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ix0 ix0Var = this.f492033g;
        this.f492030d.a(this.f492031e, this.f492032f, ix0Var.m75939xb282bd08(1), ix0Var.m75945x2fec8307(2));
        return jz5.f0.f384359a;
    }
}
