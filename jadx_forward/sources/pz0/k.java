package pz0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440671d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pz0.m f440673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f440674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pz0.m mVar, long j17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440673f = mVar;
        this.f440674g = j17;
        this.f440675h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pz0.k kVar = new pz0.k(this.f440673f, this.f440674g, this.f440675h, interfaceC29045xdcb5ca57);
        kVar.f440672e = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440671d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f440675h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            az0.n7 n7Var = this.f440673f.f440683g;
            if (n7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: movieSessionManager is null");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
                return f0Var;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(this.f440674g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33967x6fa736dc, "fromMilliseconds(...)");
            this.f440671d = 1;
            obj = az0.n7.p(n7Var, m33967x6fa736dc, null, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: ret " + booleanValue);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(booleanValue))));
        return f0Var;
    }
}
