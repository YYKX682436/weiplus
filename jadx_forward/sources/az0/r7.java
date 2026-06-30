package az0;

/* loaded from: classes5.dex */
public final class r7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(az0.s9 s9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97397e = s9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.r7(this.f97397e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.r7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97396d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginAdjustSpatialDesc");
            az0.s9 s9Var = this.f97397e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f97431n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (az0.s9.a(s9Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamSession", "beginAdjustSpatialDesc>> when call is release");
                    return null;
                }
                readLock.unlock();
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = s9Var.f97430m;
                if (c4020x8c1a4944 == null) {
                    return null;
                }
                this.f97396d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                c4020x8c1a4944.a(new az0.q7(new az0.g(nVar, "1055", java.lang.System.currentTimeMillis())));
                obj = nVar.a();
                pz5.a aVar2 = pz5.a.f440719d;
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
