package mm2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.u0 f410958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i17, mm2.u0 u0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410957e = i17;
        this.f410958f = u0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.t0(this.f410957e, this.f410958f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410956d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f410957e * 1000;
            this.f410956d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        mm2.u0 u0Var = this.f410958f;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = u0Var.f410983p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        u0Var.f410983p = null;
        pm0.v.X(new mm2.p0(u0Var));
        return jz5.f0.f384359a;
    }
}
