package mz0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f414443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, mz0.b2 b2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414443e = c0Var;
        this.f414444f = b2Var;
        this.f414445g = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = this.f414445g;
        mz0.c1 c1Var = new mz0.c1(this.f414443e, this.f414444f, str, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        c1Var.f414442d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f414442d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Template.TemplateControlUIC", "change on completion");
        this.f414443e.f391645d = th6 == null;
        mz0.b2 b2Var = this.f414444f;
        b2Var.A7();
        b2Var.f7().dismiss();
        b2Var.z7();
        b2Var.u7(th6, this.f414445g);
        return jz5.f0.f384359a;
    }
}
