package yx0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.m f548637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 f548638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f548639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yx0.b8 b8Var, yx0.m mVar, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 c3975xde78a307, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548636d = b8Var;
        this.f548637e = mVar;
        this.f548638f = c3975xde78a307;
        this.f548639g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.a(this.f548636d, this.f548637e, this.f548638f, this.f548639g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "updateAIGCResult, state: " + this.f548636d.f548725s + ", isImportPreviewState: " + this.f548636d.Z());
        yx0.v vVar = this.f548636d.f548725s;
        yx0.v vVar2 = yx0.v.f549238s;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (vVar != vVar2 && !this.f548636d.Z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "updateAIGCResult >> Invalid state: " + this.f548636d.f548725s);
            return f0Var;
        }
        yx0.m mVar = this.f548637e;
        yx0.b8 this_run = this.f548636d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_run, "$this_run");
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 c3975xde78a307 = this.f548638f;
        boolean z17 = this.f548639g;
        mVar.getClass();
        pp0.p0 p0Var = this_run.K;
        if (p0Var != null) {
            p0Var.c0(c3975xde78a307, new yx0.l(z17, this_run));
        }
        return f0Var;
    }
}
