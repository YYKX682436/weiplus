package xt2;

/* loaded from: classes3.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mm2.y5 f538607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(xt2.e3 e3Var, cm2.m0 m0Var, mm2.y5 y5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538605e = e3Var;
        this.f538606f = m0Var;
        this.f538607g = y5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.v2(this.f538605e, this.f538606f, this.f538607g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.v2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.y23 y23Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538604d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f538604d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(150L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        xt2.e3 e3Var = this.f538605e;
        if (e3Var.U != null) {
            java.lang.String str = e3Var.f538239h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subsidy replay: clear stale playing flag before retrigger, productId=");
            cm2.m0 m0Var = e3Var.U;
            sb6.append((m0Var == null || (y23Var = m0Var.f124901v) == null) ? null : new java.lang.Long(y23Var.m75942xfb822ef2(0)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            e3Var.c();
        }
        e3Var.f538254x0 = true;
        e3Var.l(this.f538606f, this.f538607g.f411108b);
        return jz5.f0.f384359a;
    }
}
