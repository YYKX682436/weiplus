package mz0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414531e = b2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.l1 l1Var = new mz0.l1(this.f414531e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        l1Var.f414530d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        l1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f414530d, "maas error", new java.lang.Object[0]);
        mz0.b2 b2Var = this.f414531e;
        b2Var.f7().dismiss();
        db5.t7.g(b2Var.m80379x76847179(), b2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572310aq5));
        return jz5.f0.f384359a;
    }
}
