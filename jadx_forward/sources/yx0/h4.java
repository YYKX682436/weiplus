package yx0;

/* loaded from: classes5.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f548893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(yx0.b8 b8Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548892d = b8Var;
        this.f548893e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.h4(this.f548892d, this.f548893e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yx0.b8 b8Var = this.f548892d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = b8Var.f548726t;
        java.util.List list = this.f548893e;
        reentrantLock.lock();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "preloadTemplate, count: " + list.size());
            int ordinal = b8Var.f548725s.ordinal();
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (ordinal != 0 && ordinal != 1) {
                switch (ordinal) {
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.g4(b8Var, list, null), 1, null);
                        return f0Var;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShootComposingCorePlugin", "preloadTemplate >> but state is " + b8Var.f548725s);
            return f0Var;
        } finally {
            reentrantLock.unlock();
        }
    }
}
