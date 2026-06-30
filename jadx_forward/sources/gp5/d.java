package gp5;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp5.e f355990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f355992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gp5.e eVar, long j17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f355990d = eVar;
        this.f355991e = j17;
        this.f355992f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gp5.d(this.f355990d, this.f355991e, this.f355992f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gp5.d dVar = (gp5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gp5.e eVar = this.f355990d;
        if (eVar.f355996d && eVar.f355998f) {
            eVar.a(eVar.f355993a, eVar.f355994b, eVar.f355995c, this.f355991e, this.f355992f);
        }
        return jz5.f0.f384359a;
    }
}
