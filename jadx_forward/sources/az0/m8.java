package az0;

/* loaded from: classes5.dex */
public final class m8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(az0.s9 s9Var, java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97246e = s9Var;
        this.f97247f = str;
        this.f97248g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.m8(this.f97246e, this.f97247f, this.f97248g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.m8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97245d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            az0.s9 s9Var = this.f97246e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f97431n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = s9Var.f97430m;
                boolean a17 = az0.s9.a(s9Var);
                java.lang.String str = this.f97247f;
                if (a17 || c4020x8c1a4944 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamSession", str + " >> when call is release");
                    return java.lang.Boolean.FALSE;
                }
                readLock.unlock();
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a49442 = s9Var.f97430m;
                if (c4020x8c1a49442 == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f97245d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                this.f97248g.mo149xb9724478(c4020x8c1a49442, new az0.i(nVar, str, java.lang.System.currentTimeMillis()));
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
