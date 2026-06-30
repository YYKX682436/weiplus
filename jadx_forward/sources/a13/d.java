package a13;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f82072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f82073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f82074f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a13.t tVar, boolean z17, boolean z18, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82072d = tVar;
        this.f82073e = z17;
        this.f82074f = z18;
        this.f82075g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a13.d(this.f82072d, this.f82073e, this.f82074f, this.f82075g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a13.d dVar = (a13.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        a13.t tVar = this.f82072d;
        b13.m mVar = tVar.f82110m;
        if (mVar != null) {
            mVar.H0(this.f82073e, new a13.c(this.f82074f, tVar, this.f82075g));
        }
        return jz5.f0.f384359a;
    }
}
