package xe2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f535384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q26.n f535385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f535386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yg2.b bVar, q26.n nVar, xe2.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535384d = bVar;
        this.f535385e = nVar;
        this.f535386f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xe2.e0(this.f535384d, this.f535385e, this.f535386f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xe2.e0 e0Var = (xe2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.c(this.f535384d, p3325xe03a0797.p3326xc267989b.q1.f392103c, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new xe2.d0(this.f535385e, this.f535386f, null));
        return jz5.f0.f384359a;
    }
}
