package yn1;

/* loaded from: classes11.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(yn1.a4 a4Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545208d = a4Var;
        this.f545209e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.g3(this.f545208d, this.f545209e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.g3 g3Var = (yn1.g3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String A = kn1.k.A();
        yn1.a4 a4Var = this.f545208d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[getWifiNameAsync] wifiName=" + A);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
        if (aVar2 != null) {
            if (A == null) {
                A = "";
            }
            aVar2.K(this.f545209e, A);
        }
        return jz5.f0.f384359a;
    }
}
