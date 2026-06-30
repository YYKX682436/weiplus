package qu2;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.f f448297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f448298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qu2.f fVar, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448297d = fVar;
        this.f448298e = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qu2.e(this.f448297d, this.f448298e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qu2.e eVar = (qu2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rh.c1 c17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qu2.f fVar = this.f448297d;
        fVar.f448301c = true;
        try {
            nh.c cVar = fVar.f448302d;
            if (cVar != null && (c17 = cVar.c()) != null) {
                c17.u(uh.g.class, new qu2.d(fVar, c17, this.f448298e));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AvgPowerConsumeCollector", e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
