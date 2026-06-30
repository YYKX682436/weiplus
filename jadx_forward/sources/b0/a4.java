package b0;

/* loaded from: classes14.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97733d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f97735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f97736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f97737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97738i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97739m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97740n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b0.h2 h2Var, yz5.q qVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97735f = h2Var;
        this.f97736g = qVar;
        this.f97737h = y0Var;
        this.f97738i = lVar;
        this.f97739m = lVar2;
        this.f97740n = lVar3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.a4 a4Var = new b0.a4(this.f97735f, this.f97736g, this.f97737h, this.f97738i, this.f97739m, this.f97740n, interfaceC29045xdcb5ca57);
        a4Var.f97734e = obj;
        return a4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.a4) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97733d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f97734e;
            b0.z3 z3Var = new b0.z3(this.f97735f, this.f97736g, this.f97737h, this.f97738i, this.f97739m, this.f97740n, null);
            this.f97733d = 1;
            if (((p1.q0) a0Var).v(z3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
