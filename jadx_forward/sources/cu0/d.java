package cu0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cu0.x xVar) {
        super(1);
        this.f303844d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f303844d.f303887d = booleanValue;
        this.f303844d.g().e().i(booleanValue);
        if (booleanValue) {
            oo4.d dVar = oo4.d.f428730a;
            dVar.h(25496, this.f303844d.i());
            cu0.x xVar = this.f303844d;
            if (xVar.f303898o) {
                dVar.i(xVar.f303890g, xVar.i());
                this.f303844d.f303898o = false;
            }
        }
        yz5.l lVar = this.f303844d.f303897n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        cu0.x xVar2 = this.f303844d;
        if (booleanValue) {
            xVar2.k();
        } else {
            ev0.b bVar = xVar2.f303886c.f338412b;
            long o17 = bVar != null ? bVar.o() : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = xVar2.g().f304112o;
            if (aVar != null) {
                aVar.j(xVar2.f303888e, xVar2.f303890g, o17);
            }
            ev0.t.c(xVar2.f303886c, false, null, 2, null);
            if (xVar2.m()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = xVar2.f303888e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) xVar2.g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class);
                boolean s17 = e0Var != null ? e0Var.s(3) : false;
                boolean z17 = xVar2.f303889f;
                if (c16997xb0aa383a != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(xVar2.f303892i, null, null, new cu0.w(xVar2, c16997xb0aa383a, s17, z17, null), 3, null);
                }
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(xVar2.f303893j, null, null, new cu0.n(xVar2, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
