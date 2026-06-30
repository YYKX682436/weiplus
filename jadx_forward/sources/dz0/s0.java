package dz0;

/* loaded from: classes.dex */
public final class s0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326536d;

    public s0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.s0 s0Var = new dz0.s0((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        s0Var.f326536d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        s0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MaasMultiTemplate.MaasSdkUIC", (java.lang.Throwable) this.f326536d, "buildTemplateWithNonBlocking maas error", new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
