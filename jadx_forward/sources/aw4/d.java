package aw4;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw4.l f96387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aw4.l lVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96387d = lVar;
        this.f96388e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aw4.d(this.f96387d, this.f96388e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        aw4.d dVar = (aw4.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.g gVar = aw4.l.f96428d;
        aw4.q i17 = this.f96387d.i();
        if (i17 != null && (mo9090x86b9ebe3 = i17.mo9090x86b9ebe3()) != null) {
            java.lang.String params = this.f96388e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onFinderItemDetailReady", params);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onFinderItemDetailReady", "onFinderItemDetailReady", params}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
