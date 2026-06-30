package mx0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f413738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.p pVar, boolean z17, mx0.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413738d = pVar;
        this.f413739e = z17;
        this.f413740f = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.p0(this.f413738d, this.f413739e, this.f413740f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.p0 p0Var = (mx0.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f413738d.mo149xb9724478(java.lang.Boolean.valueOf(this.f413739e), java.lang.Boolean.valueOf(this.f413740f.f413469c));
        return jz5.f0.f384359a;
    }
}
