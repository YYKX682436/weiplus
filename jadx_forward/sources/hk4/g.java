package hk4;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f363475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.n f363476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p3325xe03a0797.p3326xc267989b.r2 r2Var, hk4.n nVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363475e = r2Var;
        this.f363476f = nVar;
        this.f363477g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hk4.g(this.f363475e, this.f363476f, this.f363477g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hk4.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363474d;
        yz5.a aVar2 = this.f363477g;
        hk4.n nVar = this.f363476f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f363475e;
            if (r2Var.A()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f363489k, "bitmap loading job has been already finished");
                aVar2.mo152xb9724478();
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f363489k, "joins the bitmap loading job");
            this.f363474d = 1;
            if (r2Var.C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f363489k, "bitmap loading job has been finished");
        aVar2.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
