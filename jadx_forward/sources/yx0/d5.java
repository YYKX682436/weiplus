package yx0;

/* loaded from: classes5.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548783e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yx0.d5 d5Var = new yx0.d5(this.f548783e, interfaceC29045xdcb5ca57);
        d5Var.f548782d = obj;
        return d5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f548782d;
        yx0.b8 b8Var = this.f548783e;
        java.util.concurrent.locks.ReentrantLock reentrantLock = b8Var.f548726t;
        reentrantLock.lock();
        try {
            int ordinal = b8Var.f548725s.ordinal();
            jz5.f0 f0Var = jz5.f0.f384359a;
            switch (ordinal) {
                case 0:
                    b8Var.T();
                    return f0Var;
                case 1:
                    return f0Var;
                case 2:
                    return f0Var;
                case 3:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.x4(b8Var, null), 1, null);
                    break;
                case 5:
                    return f0Var;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    b8Var.u(false, new yx0.y4(b8Var));
                    return f0Var;
                case 14:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.z4(b8Var, null), 1, null);
                    b8Var.T();
                    return f0Var;
                case 15:
                case 16:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShootComposingCorePlugin", "resumeShootingState but state is " + b8Var.f548725s);
                    return f0Var;
                case 17:
                    return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yx0.a5(b8Var, null), 2, null);
            b8Var.q0(yx0.v.f549231i);
            b8Var.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.c5(b8Var, null), 3, null);
            return f0Var;
        } finally {
            reentrantLock.unlock();
        }
    }
}
