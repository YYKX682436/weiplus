package ci5;

/* loaded from: classes12.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, gg3.c cVar, ci5.b0 b0Var, mf3.k kVar, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123318d = str;
        this.f123319e = cVar;
        this.f123320f = b0Var;
        this.f123321g = kVar;
        this.f123322h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ci5.u(this.f123318d, this.f123319e, this.f123320f, this.f123321g, this.f123322h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ci5.u uVar = (ci5.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ci5.f fVar = ci5.f.f123261a;
        java.lang.String downloadPath = this.f123318d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(downloadPath, "$downloadPath");
        pm0.v.X(new ci5.t(fVar.a(downloadPath, this.f123319e.f353261c), this.f123320f, this.f123321g, this.f123319e, this.f123322h));
        return jz5.f0.f384359a;
    }
}
