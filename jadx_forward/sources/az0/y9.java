package az0;

/* loaded from: classes5.dex */
public final class y9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f97617f;

    /* renamed from: g, reason: collision with root package name */
    public int f97618g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97619h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97620i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b f97621m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(java.lang.String str, az0.xb xbVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97619h = str;
        this.f97620i = xbVar;
        this.f97621m = c4025xdf96d81b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.y9(this.f97619h, this.f97620i, this.f97621m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.y9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97618g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginUseTemplateV2 >> ");
            java.lang.String str = this.f97619h;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", sb6.toString());
            az0.xb xbVar = this.f97620i;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = xbVar.f97594m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (xbVar.P0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamoSession", "beginUseTemplateV2 >> when call is release");
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("when call is release"))));
                }
                readLock.unlock();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b = this.f97621m;
                this.f97615d = c4025xdf96d81b;
                this.f97616e = xbVar;
                this.f97617f = str;
                this.f97618g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                az0.x9 x9Var = new az0.x9(nVar, currentTimeMillis);
                if (c4025xdf96d81b == null) {
                    com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = xbVar.f97593i;
                    if (c4027x83c03a19 != null) {
                        c4027x83c03a19.f(str, x9Var);
                    }
                } else {
                    com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a192 = xbVar.f97593i;
                    if (c4027x83c03a192 != null) {
                        c4027x83c03a192.g(str, c4025xdf96d81b, x9Var);
                    }
                }
                obj = nVar.a();
                if (obj == aVar) {
                    return aVar;
                }
            } finally {
                readLock.unlock();
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
