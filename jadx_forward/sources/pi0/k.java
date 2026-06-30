package pi0;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f436157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f436158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f436159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f436160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pi0.u0 u0Var, pi0.m1 m1Var, long j17, long j18, pi0.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f436157d = u0Var;
        this.f436158e = m1Var;
        this.f436159f = j17;
        this.f436160g = j18;
        this.f436161h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.k(this.f436157d, this.f436158e, this.f436159f, this.f436160g, this.f436161h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pi0.k kVar = (pi0.k) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pi0.a aVar2 = new pi0.a();
        java.lang.String str = this.f436157d.f436263a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar2.f436035a = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pi0.m1 m1Var = this.f436158e;
        sb6.append(m1Var.f436198a);
        sb6.append('/');
        sb6.append(m1Var.f436200c);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
        aVar2.f436041g = sb7;
        aVar2.f436036b = this.f436159f - this.f436160g;
        aVar2.f436037c = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pi0.q qVar = this.f436161h;
        aVar2.f436038d = currentTimeMillis - qVar.f436245p;
        aVar2.f436040f = qVar.e();
        int e17 = qVar.e();
        aVar2.f436039e = e17 + (qVar.f436233d != null ? r1.getDestroyEngineCount() : 0);
        qVar.f436244o = aVar2;
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "create rootEngine cost:" + aVar2.f436036b);
        return jz5.f0.f384359a;
    }
}
