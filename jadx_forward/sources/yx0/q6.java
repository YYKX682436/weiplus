package yx0;

/* loaded from: classes5.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f549114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(nx0.r1 r1Var, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549114d = r1Var;
        this.f549115e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.q6(this.f549114d, this.f549115e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.q6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nx0.r1 r1Var = this.f549114d;
        r1Var.getClass();
        boolean z17 = r1Var == nx0.r1.f422742g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchFaceEffect >> clearFaceEffect");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchFaceEffect >> " + this.f549114d.f422743a);
        }
        int ordinal = this.f549115e.f548725s.ordinal();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (ordinal != 2) {
            switch (ordinal) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "clearFaceEffect >> but state is " + this.f549115e.f548725s);
                    return f0Var;
            }
        }
        if (this.f549115e.f548725s != yx0.v.f549228f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchFaceEffect >> but state is " + this.f549115e.f548725s);
            return f0Var;
        }
        pp0.p0 p0Var = this.f549115e.K;
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchFaceEffect >> but setup is error");
            return f0Var;
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.n6(this.f549115e, p0Var, null), 1, null);
        } else {
            this.f549115e.q0(yx0.v.f549237r);
            yx0.b8 b8Var = this.f549115e;
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.o6(b8Var, p0Var, this.f549114d, null), 3, null);
            ((p3325xe03a0797.p3326xc267989b.c3) d17).p(new yx0.p6(this.f549115e));
            b8Var.f548727u = d17;
        }
        return f0Var;
    }
}
