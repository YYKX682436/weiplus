package ho1;

/* loaded from: classes9.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn1.k f364298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.w0 f364299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364300i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(long j17, java.lang.String str, xn1.k kVar, bw5.w0 w0Var, long j18, ho1.q1 q1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f364296e = j17;
        this.f364297f = str;
        this.f364298g = kVar;
        this.f364299h = w0Var;
        this.f364300i = j18;
        this.f364301m = q1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ho1.n1(this.f364296e, this.f364297f, this.f364298g, this.f364299h, this.f364300i, this.f364301m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ho1.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f364295d;
        xn1.k kVar = this.f364298g;
        java.lang.String str = this.f364297f;
        long j17 = this.f364296e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[insertChatPackageAsync] Real start, taskId=" + j17 + ", convId=" + str + ", st=" + kVar);
            co1.g gVar = co1.g.f125301a;
            java.lang.String str2 = this.f364297f;
            bw5.w0 w0Var = this.f364299h;
            long j18 = this.f364300i;
            this.f364295d = 1;
            if (gVar.k(str2, w0Var, j18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        oo1.o.f428684a.f(str);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364301m.f364320a;
        if (g0Var != null) {
            g0Var.v(j17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[insertChatPackageAsync] Done, taskId=" + j17 + ", convId=" + str + ", st=" + kVar);
        return jz5.f0.f384359a;
    }
}
