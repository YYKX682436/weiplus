package e50;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f331084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f331085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18, long j19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331083d = j17;
        this.f331084e = j18;
        this.f331085f = j19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e50.y(this.f331083d, this.f331084e, this.f331085f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        e50.y yVar = (e50.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jx3.f.INSTANCE.mo68477x336bdfd8(this.f331083d, this.f331084e, this.f331085f, false);
        return jz5.f0.f384359a;
    }
}
