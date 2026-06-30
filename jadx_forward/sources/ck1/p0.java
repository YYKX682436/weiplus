package ck1;

/* loaded from: classes4.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123895d;

    /* renamed from: e, reason: collision with root package name */
    public int f123896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.s0 f123897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ck1.s0 s0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123897f = s0Var;
        this.f123898g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ck1.p0(this.f123897f, this.f123898g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123896e;
        ck1.s0 s0Var = this.f123897f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = s0Var.f123907e;
                ck1.n0 n0Var = ck1.n0.f123887a;
                java.lang.String str = this.f123898g;
                this.f123895d = j0Var2;
                this.f123896e = 1;
                java.lang.Object a17 = n0Var.a(str, this);
                if (a17 == aVar) {
                    return aVar;
                }
                j0Var = j0Var2;
                obj = a17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j0Var = (p012xc85e97e9.p093xedfae76a.j0) this.f123895d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            j0Var.mo523x53d8522f(obj);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "<init>, getUsageInfo fail since " + e17);
            s0Var.f123906d.mo78641xb4098c93();
        }
        return jz5.f0.f384359a;
    }
}
