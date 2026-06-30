package mz0;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f414496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414496e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.g1 g1Var = new mz0.g1(this.f414496e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        g1Var.f414495d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        g1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f414495d, "maas error", new java.lang.Object[0]);
        this.f414496e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
