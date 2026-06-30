package rf2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, rf2.v0 v0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476434d = hVar;
        this.f476435e = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.u(this.f476434d, interfaceC29045xdcb5ca57, this.f476435e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.u uVar = (rf2.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f476434d).f535914b;
        rf2.v0 v0Var = this.f476435e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.f476449c, "attendLottery failed. " + aVar2);
        db5.t7.g(v0Var.f476447a.getContext(), v0Var.f476447a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dor));
        return jz5.f0.f384359a;
    }
}
