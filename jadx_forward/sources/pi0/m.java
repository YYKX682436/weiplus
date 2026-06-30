package pi0;

/* loaded from: classes11.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f436197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pi0.q qVar, pi0.u0 u0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436196d = qVar;
        this.f436197e = u0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.m(this.f436196d, this.f436197e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pi0.m mVar = (pi0.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pi0.q qVar = this.f436196d;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness platformBrightness = (qVar.d().getContext().getResources().getConfiguration().uiMode & 48) == 32 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness.dark : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness.light;
        pi0.u0 u0Var = this.f436197e;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138331x30e78145 = u0Var.f436264b.m137446xd8a0cd2a().m138331x30e78145();
        pi0.r rVar = pi0.r.f436250a;
        yz5.a aVar2 = pi0.r.f436252c;
        m138331x30e78145.m138341x54570f0a(aVar2 != null ? ((java.lang.Number) aVar2.mo152xb9724478()).floatValue() : qVar.d().getContext().getResources().getConfiguration().fontScale).m138342x827522(android.text.format.DateFormat.is24HourFormat(qVar.d().getContext())).m138340xbad3a126(platformBrightness).m138336x35cf88();
        pi0.i0 i0Var = pi0.k0.f436162c;
        java.lang.String engineId = u0Var.f436263a;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e engine = u0Var.f436264b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 m137427x4255efe8 = engine.m137427x4255efe8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137427x4255efe8, "getDartExecutor(...)");
        pi0.k0 k0Var = new pi0.k0(m137427x4255efe8);
        k0Var.f436165b = engineId;
        pi0.k0.f436163d.put(engineId, k0Var);
        return jz5.f0.f384359a;
    }
}
