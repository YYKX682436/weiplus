package ci5;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123274g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123276i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, sf3.g gVar, ci5.q qVar, mf3.k kVar, sf3.g gVar2, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123271d = str;
        this.f123272e = gVar;
        this.f123273f = qVar;
        this.f123274g = kVar;
        this.f123275h = gVar2;
        this.f123276i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ci5.l(this.f123271d, this.f123272e, this.f123273f, this.f123274g, this.f123275h, this.f123276i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ci5.l lVar = (ci5.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ci5.f fVar = ci5.f.f123261a;
        java.lang.String downloadPath = this.f123271d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(downloadPath, "$downloadPath");
        pm0.v.X(new ci5.k(fVar.a(downloadPath, this.f123272e.c()), this.f123273f, this.f123274g, this.f123275h, this.f123276i));
        return jz5.f0.f384359a;
    }
}
