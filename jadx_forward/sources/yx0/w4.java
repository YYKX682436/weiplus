package yx0;

/* loaded from: classes5.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549274e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.w4(this.f549274e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.w4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549273d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bool = null;
            if (this.f549274e.f548725s == yx0.v.f549233n) {
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.v4(this.f549274e, null), 1, null);
            }
            if (this.f549274e.f548725s != yx0.v.f549228f && this.f549274e.f548725s != yx0.v.f549232m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> but state is " + this.f549274e.f548725s);
                return f0Var;
            }
            pp0.p0 p0Var = this.f549274e.K;
            if (p0Var != null) {
                this.f549273d = 1;
                obj = p0Var.j0(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> " + bool);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> " + bool);
        return f0Var;
    }
}
