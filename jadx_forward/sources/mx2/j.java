package mx2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f414023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f414026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f414027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041, int i17, boolean z17, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414023d = abstractC14490x69736cb5;
        this.f414024e = c15401xb8016041;
        this.f414025f = i17;
        this.f414026g = z17;
        this.f414027h = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx2.j(this.f414023d, this.f414024e, this.f414025f, this.f414026g, this.f414027h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx2.j jVar = (mx2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f414023d;
        if (abstractC14490x69736cb5 != null) {
            android.content.Context context = this.f414024e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                int i17 = this.f414025f;
                boolean z17 = this.f414026g;
                java.util.LinkedList linkedList = this.f414027h;
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.a0(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec(), i17);
                if (mb4Var != null) {
                    fc2.c n17 = zy2.ra.n1(nyVar, 0, 1, null);
                    long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                    java.lang.String objectNonceId = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y5 y5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y5(m59251x5db1b11, mb4Var, objectNonceId, i17, linkedList2, abstractC14490x69736cb5, z17, linkedList);
                    if (n17 != null) {
                        n17.b(y5Var);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
