package qu2;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.o f448333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f448334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qu2.o oVar, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448333d = oVar;
        this.f448334e = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qu2.n(this.f448333d, this.f448334e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qu2.n nVar = (qu2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rh.c1 c17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qu2.o oVar = this.f448333d;
        oVar.f448337c = true;
        try {
            nh.c cVar = oVar.f448338d;
            if (cVar != null && (c17 = cVar.c()) != null) {
                c17.u(uh.g.class, new qu2.m(oVar, this.f448334e, c17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PowerConsumptionEasyCollector", e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
