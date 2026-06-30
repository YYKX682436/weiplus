package kv3;

/* loaded from: classes5.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f394204q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f394205r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f394206s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, int i17) {
        super(parent, status, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f394204q = kz5.z.D0(new java.lang.Integer[]{12, 13});
        this.f394205r = kz5.c0.i(8, 7, 9, 14, 10);
        this.f394206s = kz5.c0.i(9, 12, 13);
    }

    @Override // ev3.d
    public void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17, rv3.v musicPlayStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlayStatus, "musicPlayStatus");
        java.util.Iterator it = this.f394205r.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.q(i17, info, z17, musicPlayStatus);
            }
        }
    }

    @Override // ev3.d
    public void i(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17, rv3.v musicPlayStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlayStatus, "musicPlayStatus");
        ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(14);
        if (cVar != null) {
            cVar.w(i17, info, z17, musicPlayStatus);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f, ev3.d
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar;
        super.k(c16997xb0aa383a, i17, view, z17, z18, bundle);
        if (c16997xb0aa383a == null || this.f394206s.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.uin) : null;
        if (findViewById == null || (aVar = this.f237755o) == null) {
            return;
        }
        aVar.e(findViewById, c16997xb0aa383a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f, ev3.d
    public void l(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18, boolean z19) {
        super.l(i17, c16997xb0aa383a, z17, z18, z19);
        if (!z17 || c16997xb0aa383a == null) {
            return;
        }
        int i18 = c16997xb0aa383a.f237252p;
        if (i18 == 7 || i18 == 8) {
            return;
        }
        nv3.c.f422187a.b(c16997xb0aa383a, true, i17, rv3.y.f481952a, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public java.util.List o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17) {
        return this.f394205r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public boolean q(int i17) {
        return this.f394204q.contains(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f
    public void u() {
        i95.m c17 = i95.n0.c(su4.x0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) c17)).aj().getClass();
        java.lang.String f17 = su4.r2.f(3206);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f237755o;
        if (aVar != null) {
            aVar.q(f17);
        }
    }
}
