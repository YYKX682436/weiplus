package ai4;

/* loaded from: classes11.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f86655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86654e = z17;
        this.f86655f = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ai4.a0 a0Var = new ai4.a0(this.f86654e, this.f86655f, interfaceC29045xdcb5ca57);
        a0Var.f86653d = obj;
        return a0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ai4.a0 a0Var = (ai4.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f86653d;
        ai4.b0 b0Var = ai4.b0.f86656a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferToAffDB: start taskRetryNum=");
        sb6.append(ai4.b0.f86661f);
        sb6.append(", maxTryCount:");
        ai4.b0 b0Var2 = ai4.b0.f86656a;
        sb6.append(b0Var2.e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        ai4.b0.f86657b.A(b0Var2.d(), ai4.b0.f86661f + 1);
        if (!this.f86654e) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ai4.v(null), 3, null);
        }
        if (!this.f86655f) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ai4.z(null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
