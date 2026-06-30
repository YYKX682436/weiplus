package mz0;

/* loaded from: classes5.dex */
public final class f1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f414483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(mz0.b2 b2Var, az0.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414482e = b2Var;
        this.f414483f = b0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.f1 f1Var = new mz0.f1(this.f414482e, this.f414483f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        f1Var.f414481d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        f1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f414481d;
        int i17 = th6 == null ? 3 : 4;
        mz0.b2 b2Var = this.f414482e;
        b2Var.B7(i17);
        b2Var.r7(th6);
        if (th6 == null) {
            b2Var.x7(this.f414483f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "export successful");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Template.TemplateControlUIC", th6, "maas error", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
