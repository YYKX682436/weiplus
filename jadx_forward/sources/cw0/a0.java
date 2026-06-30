package cw0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 f304138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cw0.l0 l0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f304137d = l0Var;
        this.f304138e = c4189xeb0c3951;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw0.a0(this.f304137d, this.f304138e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cw0.a0 a0Var = (cw0.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cw0.l0 l0Var = this.f304137d;
        gx0.sc z76 = l0Var.z7();
        cw0.l0 l0Var2 = this.f304137d;
        cw0.g0 timbrePanelCallback = (cw0.g0) ((jz5.n) l0Var2.A).mo141623x754a37bb();
        java.lang.String r17 = i65.a.r(l0Var2.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574032mu4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        pv0.j jVar = pv0.j.f440065d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 segment = this.f304138e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbrePanelCallback, "timbrePanelCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_TIMBRE_ARGS", new pv0.h(segment, timbrePanelCallback, r17, jVar, false, true, false));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(l0Var, z76, hashMap, null, null, null, 28, null);
        return jz5.f0.f384359a;
    }
}
