package py0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.y f440550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f440551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(py0.y yVar, dz0.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f440550e = yVar;
        this.f440551f = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.u uVar = new py0.u(this.f440550e, this.f440551f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        uVar.f440549d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MaasBaseUILogicUIC", (java.lang.Throwable) this.f440549d, "maas error", new java.lang.Object[0]);
        this.f440550e.P6().dismiss();
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) this.f440551f).r7(com.p314xaae8f345.mm.R.C30867xcad56011.m6j);
        return jz5.f0.f384359a;
    }
}
