package yx0;

/* loaded from: classes5.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 f549091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(yx0.b8 b8Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549090e = b8Var;
        this.f549091f = c4019xd47cd265;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.p5(this.f549090e, this.f549091f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.p5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549089d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "setExposureCheck");
            pp0.p0 p0Var = this.f549090e.K;
            if (p0Var == null) {
                return null;
            }
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265 = this.f549091f;
            this.f549089d = 1;
            obj = p0Var.W(c4019xd47cd265, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return (java.lang.Boolean) obj;
    }
}
