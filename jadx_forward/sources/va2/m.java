package va2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f515784d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f515785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va2.n f515786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f515787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f515789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(va2.n nVar, int i17, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f515786f = nVar;
        this.f515787g = i17;
        this.f515788h = str;
        this.f515789i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        va2.m mVar = new va2.m(this.f515786f, this.f515787g, this.f515788h, this.f515789i, interfaceC29045xdcb5ca57);
        mVar.f515785e = obj;
        return mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((va2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f515784d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f515785e;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            va2.l lVar = new va2.l(this.f515787g, this.f515788h, this.f515789i);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            u92.e eVar = new u92.e(lVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), this.f515786f.m158354x19263085(), null, 8, null);
            this.f515785e = c0Var2;
            this.f515784d = 1;
            obj = ay1.l.k(eVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f515785e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTopicTabUIC", "[request] cgiBack");
        va2.n nVar = this.f515786f;
        pf5.e.m158344xbe96bc24(nVar, null, null, new va2.k((com.p314xaae8f345.mm.p944x882e457a.f) obj, c0Var, nVar, null), 3, null);
        return jz5.f0.f384359a;
    }
}
