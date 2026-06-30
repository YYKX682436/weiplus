package az0;

/* loaded from: classes5.dex */
public final class l8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(az0.s9 s9Var, java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97204e = s9Var;
        this.f97205f = str;
        this.f97206g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.l8(this.f97204e, this.f97205f, this.f97206g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.l8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97203d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            az0.s9 s9Var = this.f97204e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f97431n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = s9Var.f97430m;
                boolean a17 = az0.s9.a(s9Var);
                java.lang.String str = this.f97205f;
                if (a17 || c4020x8c1a4944 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamSession", str + " >> when call is release");
                    readLock.unlock();
                    return null;
                }
                readLock.unlock();
                this.f97203d = 1;
                obj = az0.j.a(str, this.f97206g, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (java.lang.Throwable th6) {
                readLock.unlock();
                throw th6;
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
