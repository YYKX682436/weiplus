package pi0;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pi0.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436104e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.g(this.f436104e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f436103d;
        pi0.q qVar = this.f436104e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f436232c;
            if (r2Var != null) {
                this.f436103d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "init job done");
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "external init end");
        qVar.f436233d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961(qVar.f436230a, qVar.f436231b);
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "group init end");
        this.f436103d = 2;
        qVar.getClass();
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "start create router");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pi0.m1 m1Var = new pi0.m1("root", "home", "root", new java.util.HashMap());
        pi0.r.f436250a.d(m1Var);
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterRouteCreator", "setupRouteInfo, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        m1Var.f436205h = true;
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "create route finished");
        g17 = qVar.g(m1Var, (r16 & 2) != 0, (r16 & 4) != 0, (r16 & 8) != 0, (r16 & 16) != 0 ? null : null, this);
        if (g17 == aVar) {
            return aVar;
        }
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "init job done");
        return jz5.f0.f384359a;
    }
}
