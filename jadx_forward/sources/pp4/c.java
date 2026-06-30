package pp4;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 f439045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f439046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f439047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 c18816x3a93c0f9, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439045d = c18816x3a93c0f9;
        this.f439046e = h1Var;
        this.f439047f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pp4.c(this.f439045d, this.f439046e, this.f439047f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pp4.c cVar = (pp4.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 c18816x3a93c0f9 = this.f439045d;
        bp4.e4 e4Var = (bp4.e4) c18816x3a93c0f9.j(bp4.e4.class);
        if (e4Var != null) {
            bp4.b0.o(e4Var, this.f439046e, 0L, false, 6, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineProfile", "VLogThumbViewPlugin:" + (java.lang.System.currentTimeMillis() - this.f439047f));
        c18816x3a93c0f9.m72664xc322f48(true);
        bp4.e4 e4Var2 = (bp4.e4) c18816x3a93c0f9.j(bp4.e4.class);
        if (e4Var2 != null && (c18833x82cf22d = e4Var2.f104693h) != null) {
            c18833x82cf22d.f257673n = true;
        }
        return jz5.f0.f384359a;
    }
}
