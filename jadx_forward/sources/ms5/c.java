package ms5;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f412679f;

    /* renamed from: g, reason: collision with root package name */
    public int f412680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f412681h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f f412682i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ns5.a f412683m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.Map map, com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f abstractC25298xba75790f, ns5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f412681h = map;
        this.f412682i = abstractC25298xba75790f;
        this.f412683m = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ms5.c(this.f412681h, this.f412682i, this.f412683m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ms5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ns5.a aVar;
        com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f abstractC25298xba75790f;
        java.util.Iterator it;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f412680g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : this.f412681h.entrySet()) {
                java.lang.String str = ((ls5.f) entry.getValue()).f402665b;
                if (!(str == null || str.length() == 0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
            com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f abstractC25298xba75790f2 = this.f412682i;
            aVar = this.f412683m;
            abstractC25298xba75790f = abstractC25298xba75790f2;
            it = it6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f412679f;
            aVar = (ns5.a) this.f412678e;
            abstractC25298xba75790f = (com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f) this.f412677d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f();
            c6516x7962e81f.f138678e = abstractC25298xba75790f.j();
            c6516x7962e81f.p(abstractC25298xba75790f.k((ls5.f) entry2.getValue(), aVar));
            abstractC25298xba75790f.a(c6516x7962e81f, (ls5.f) entry2.getValue(), aVar);
            c6516x7962e81f.f138677d = c6516x7962e81f.b("playerLeaksTrace", ((ls5.f) entry2.getValue()).f402665b, true);
            c6516x7962e81f.f138680g = abstractC25298xba75790f.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC25298xba75790f.f296760e, "ilog report " + c6516x7962e81f.f138679f + " version: " + c6516x7962e81f.f138680g);
            c6516x7962e81f.k();
            this.f412677d = abstractC25298xba75790f;
            this.f412678e = aVar;
            this.f412679f = it;
            this.f412680g = 1;
            if (abstractC25298xba75790f.q(aVar, entry2, c6516x7962e81f, this) == aVar2) {
                return aVar2;
            }
        }
        this.f412682i.o(this.f412681h);
        return jz5.f0.f384359a;
    }
}
