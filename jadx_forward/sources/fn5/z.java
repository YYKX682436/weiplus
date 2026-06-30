package fn5;

/* loaded from: classes14.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fn5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346307e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn5.z(this.f346307e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f346306d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + java.lang.Thread.currentThread().getName());
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            aq.n nVar = aq.o.f94455c;
            if ((nVar != null ? nVar.f94439a : null) != aq.b.f94368d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq >> data is ready");
                aq.n nVar2 = aq.o.f94455c;
                if (nVar2 != null) {
                    nVar2.f94440b = fn5.p0.f346280d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "applyQueryNormalReq >> dataType: " + nVar2.f94439a + ", currentIdentifyType: " + aq.r0.f94486n);
                    aq.b bVar = nVar2.f94439a;
                    aq.b bVar2 = aq.b.f94369e;
                    f65.n nVar3 = f65.n.f341442a;
                    if (bVar == bVar2 || aq.r0.f94486n == aq.c.f94378g) {
                        f65.p.f341477k = nVar2.f94439a == bVar2 ? 3 : 1;
                        nVar3.b(true);
                        nVar3.a(true);
                        jVar = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.n(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new aq.f(null)), p3325xe03a0797.p3326xc267989b.q1.f392103c);
                    } else {
                        f65.p.f341477k = 2;
                        nVar3.b(false);
                        nVar3.a(false);
                        nVar2.f94441c = 0;
                        nVar2.f94442d = -2;
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                        nVar2.f94447i = b17;
                        jVar = b17;
                    }
                    if (jVar != null) {
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.g0 g0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(jVar, new fn5.w(this.f346307e, null));
                        fn5.y yVar = new fn5.y(this.f346307e);
                        this.f346306d = 2;
                        if (g0Var.a(yVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "when apply normal req >> data is no ready");
            this.f346306d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) != aVar);
        return aVar;
    }
}
