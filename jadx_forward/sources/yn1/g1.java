package yn1;

/* loaded from: classes9.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f545207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yn1.r2 r2Var, long j17, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545205d = r2Var;
        this.f545206e = j17;
        this.f545207f = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.g1(this.f545205d, this.f545206e, this.f545207f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.g1 g1Var = (yn1.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545205d.f545343a;
        if (gVar != null) {
            gVar.a1(this.f545206e, this.f545207f);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }
}
