package az0;

/* loaded from: classes5.dex */
public final class w7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97550d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97551e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f97552f;

    /* renamed from: g, reason: collision with root package name */
    public int f97553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97555i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b f97556m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(java.lang.String str, az0.s9 s9Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97554h = str;
        this.f97555i = s9Var;
        this.f97556m = c4025xdf96d81b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.w7(this.f97554h, this.f97555i, this.f97556m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.w7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97553g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginUseTemplateV2 >> ");
            java.lang.String str = this.f97554h;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", sb6.toString());
            az0.s9 s9Var = this.f97555i;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f97431n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (az0.s9.a(s9Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamSession", "beginUseTemplateV2 >> when call is release");
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("when call is release"))));
                }
                readLock.unlock();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b c4025xdf96d81b = this.f97556m;
                this.f97550d = c4025xdf96d81b;
                this.f97551e = s9Var;
                this.f97552f = str;
                this.f97553g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                az0.v7 v7Var = new az0.v7(nVar, currentTimeMillis);
                if (c4025xdf96d81b == null) {
                    com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = s9Var.f97430m;
                    if (c4020x8c1a4944 != null) {
                        c4020x8c1a4944.f(str, v7Var);
                    }
                } else {
                    com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a49442 = s9Var.f97430m;
                    if (c4020x8c1a49442 != null) {
                        c4020x8c1a49442.g(str, c4025xdf96d81b, v7Var);
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
