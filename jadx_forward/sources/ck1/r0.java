package ck1;

/* loaded from: classes4.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.s0 f123903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.t0 f123904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ck1.s0 s0Var, ck1.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123903e = s0Var;
        this.f123904f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ck1.r0(this.f123903e, this.f123904f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123902d;
        ck1.t0 t0Var = this.f123904f;
        ck1.s0 s0Var = this.f123903e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                s0Var.f123911i.mo523x53d8522f(ck1.o0.f123889d);
                r45.vf7 vf7Var = t0Var.f123915b;
                if (vf7Var != null) {
                    ck1.n0 n0Var = ck1.n0.f123887a;
                    java.lang.String str = t0Var.f123914a.f469726d;
                    java.lang.String str2 = vf7Var.f469726d;
                    java.lang.String str3 = t0Var.f123916c.f460512d;
                    this.f123902d = 1;
                    if (n0Var.d(str, str2, str3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    ck1.n0 n0Var2 = ck1.n0.f123887a;
                    java.lang.String str4 = t0Var.f123914a.f469726d;
                    java.lang.String str5 = t0Var.f123916c.f460512d;
                    this.f123902d = 2;
                    if (n0Var2.c(str4, str5, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1 && i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            t0Var.f123916c.f460514f = 7;
            p012xc85e97e9.p093xedfae76a.j0 j0Var = s0Var.f123907e;
            j0Var.mo523x53d8522f(j0Var.mo3195x754a37bb());
            s0Var.f123911i.mo523x53d8522f(ck1.o0.f123890e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onRevokeBtnClick, revoke fail since " + e17);
            s0Var.f123911i.mo523x53d8522f(ck1.o0.f123891f);
        }
        return jz5.f0.f384359a;
    }
}
