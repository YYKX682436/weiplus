package yx0;

/* loaded from: classes5.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f548702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(nx0.b3 b3Var, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548702d = b3Var;
        this.f548703e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.b7(this.f548702d, this.f548703e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.b7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nx0.b3 b3Var = this.f548702d;
        b3Var.getClass();
        boolean z17 = b3Var == nx0.b3.f422607g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> clearMakeup");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> " + this.f548702d.f422608a);
        }
        int ordinal = this.f548703e.f548725s.ordinal();
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "clearMakeup >> but state is " + this.f548703e.f548725s);
                    return f0Var;
            }
        }
        if (this.f548703e.f548725s != yx0.v.f549228f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> but state is " + this.f548703e.f548725s);
            return f0Var;
        }
        pp0.p0 p0Var = this.f548703e.K;
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> but setup is error");
            return f0Var;
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.y6(this.f548703e, p0Var, null), 1, null);
        } else {
            this.f548703e.q0(yx0.v.f549236q);
            yx0.b8 b8Var = this.f548703e;
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.z6(b8Var, p0Var, this.f548702d, null), 3, null);
            ((p3325xe03a0797.p3326xc267989b.c3) d17).p(new yx0.a7(this.f548703e));
            b8Var.f548727u = d17;
        }
        return f0Var;
    }
}
