package du0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f324887d;

    /* renamed from: e, reason: collision with root package name */
    public int f324888e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f324889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f324890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324890g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        du0.g1 g1Var = new du0.g1(this.f324890g, interfaceC29045xdcb5ca57);
        g1Var.f324889f = obj;
        return g1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.g1) mo148xaf65a0fc((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324888e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) this.f324889f;
            if (this.f324890g && c16997xb0aa383a3 != null && !c16997xb0aa383a3.f237249m) {
                java.lang.String str = c16997xb0aa383a3.f237245f;
                if (str == null || str.length() == 0) {
                    this.f324889f = c16997xb0aa383a3;
                    this.f324887d = c16997xb0aa383a3;
                    this.f324888e = 1;
                    p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                    rVar.k();
                    rVar.m(new ev0.g(c16997xb0aa383a3));
                    wt3.c1 c1Var = wt3.c1.f530920b;
                    wt3.c1.f530920b.c(c16997xb0aa383a3, new ev0.h(rVar));
                    java.lang.Object j17 = rVar.j();
                    pz5.a aVar2 = pz5.a.f440719d;
                    if (j17 == aVar) {
                        return aVar;
                    }
                    c16997xb0aa383a = c16997xb0aa383a3;
                    obj = j17;
                    c16997xb0aa383a2 = c16997xb0aa383a;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16997xb0aa383a = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) this.f324887d;
        c16997xb0aa383a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) this.f324889f;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c16997xb0aa383a.f237248i = (java.lang.String) obj;
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c16997xb0aa383a2.f237249m = ((c61.p7) ((m40.k0) c17)).ij(c16997xb0aa383a2.f237248i);
        return jz5.f0.f384359a;
    }
}
