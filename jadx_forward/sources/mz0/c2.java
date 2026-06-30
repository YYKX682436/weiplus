package mz0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f414446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f414447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f414449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.util.List list, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414446d = list;
        this.f414447e = c11120x15dce88d;
        this.f414448f = i17;
        this.f414449g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.c2(this.f414446d, this.f414447e, this.f414448f, this.f414449g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f414446d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b bVar = wi6 != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b(str, 0L, wi6.f442899d) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d.b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d.f257108a, arrayList, this.f414447e, this.f414448f, this.f414449g, false, 0, 32, null);
        if (b17.f257070a == 0) {
            return new java.lang.Integer(b17.f257073d);
        }
        return null;
    }
}
