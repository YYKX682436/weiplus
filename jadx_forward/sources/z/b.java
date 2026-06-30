package z;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f550117d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f550118e;

    /* renamed from: f, reason: collision with root package name */
    public int f550119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.e f550120g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550121h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.l f550122i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f550123m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f550124n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z.e eVar, java.lang.Object obj, z.l lVar, long j17, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f550120g = eVar;
        this.f550121h = obj;
        this.f550122i = lVar;
        this.f550123m = j17;
        this.f550124n = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z.b(this.f550120g, this.f550121h, this.f550122i, this.f550123m, this.f550124n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((z.b) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        z.r rVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f550119f;
        z.e eVar = this.f550120g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                z.r rVar2 = eVar.f550165c;
                z.w wVar = (z.w) ((z.x2) eVar.f550163a).f550406a.mo146xb9724478(this.f550121h);
                rVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<set-?>");
                rVar2.f550345f = wVar;
                ((n0.q4) eVar.f550167e).mo148714x53d8522f(this.f550122i.f());
                ((n0.q4) eVar.f550166d).mo148714x53d8522f(java.lang.Boolean.TRUE);
                z.r rVar3 = eVar.f550165c;
                z.r rVar4 = new z.r(rVar3.f550343d, rVar3.mo128745x754a37bb(), z.x.a(rVar3.f550345f), rVar3.f550346g, Long.MIN_VALUE, rVar3.f550348i);
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                z.l lVar = this.f550122i;
                long j17 = this.f550123m;
                z.a aVar2 = new z.a(eVar, rVar4, this.f550124n, c0Var2);
                this.f550117d = rVar4;
                this.f550118e = c0Var2;
                this.f550119f = 1;
                if (z.z1.a(rVar4, lVar, j17, aVar2, this) == aVar) {
                    return aVar;
                }
                c0Var = c0Var2;
                rVar = rVar4;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f550118e;
                rVar = (z.r) this.f550117d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            z.m mVar = c0Var.f391645d ? z.m.BoundReached : z.m.Finished;
            z.e.b(eVar);
            return new z.n(rVar, mVar);
        } catch (java.util.concurrent.CancellationException e17) {
            z.e.b(eVar);
            throw e17;
        }
    }
}
