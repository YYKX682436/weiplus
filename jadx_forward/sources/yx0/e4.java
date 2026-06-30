package yx0;

/* loaded from: classes5.dex */
public final class e4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(yx0.b8 b8Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548811d = b8Var;
        this.f548812e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.e4(this.f548811d, this.f548812e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx0.e4 e4Var = (yx0.e4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yx0.b8 b8Var = this.f548811d;
        java.lang.String str = this.f548812e;
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "onPause. state: " + b8Var.f548725s);
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = b8Var.f548726t;
        reentrantLock2.lock();
        try {
            switch (b8Var.f548725s.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 14:
                case 15:
                case 16:
                case 17:
                    reentrantLock2.unlock();
                    return jz5.f0.f384359a;
                case 1:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.u0(b8Var, null), 1, null);
                    break;
                case 5:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.v0(b8Var, null), 1, null);
                    break;
                case 6:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.x0(b8Var, null), 1, null);
                    break;
                case 7:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.w0(b8Var, null), 1, null);
                    break;
                case 8:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.y0(b8Var, null), 1, null);
                    break;
                case 9:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.z0(b8Var, null), 1, null);
                    break;
                case 10:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.a1(b8Var, null), 1, null);
                    break;
                case 11:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.b1(b8Var, null), 1, null);
                    break;
                case 12:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.c1(b8Var, null), 1, null);
                    b8Var.W(str, false);
                    break;
                case 13:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.s0(b8Var, null), 1, null);
                    break;
            }
            b8Var.q0(yx0.v.f549229g);
            b8Var.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.t0(b8Var, null), 3, null);
            reentrantLock2.unlock();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            reentrantLock2.unlock();
            throw th6;
        }
    }
}
