package cu0;

/* loaded from: classes5.dex */
public final class f extends no4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303847i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cu0.x xVar, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 i0Var) {
        super(bundle, i0Var);
        this.f303847i = xVar;
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
        this.f303847i.j();
        ev0.t.c(this.f303847i.f303886c, false, null, 3, null);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        this.f303847i.n(z17, lyricsInfos);
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        super.g(z17);
        cu0.x xVar = this.f303847i;
        xVar.j();
        xVar.f303889f = z17;
    }

    @Override // no4.c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var;
        super.m(c16997xb0aa383a);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.u3(m7Var, null), 3, null);
        this.f303847i.j();
        cu0.x xVar = this.f303847i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = xVar.f303888e;
        int i17 = xVar.f303890g;
        ev0.b bVar = xVar.f303886c.f338412b;
        j(c16997xb0aa383a2, i17, bVar != null ? bVar.o() : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3 = this.f303847i.f303888e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a3 != null ? c16997xb0aa383a3.a() : null, c16997xb0aa383a != null ? c16997xb0aa383a.a() : null) && c16997xb0aa383a != null) {
            c16997xb0aa383a.G = null;
            c16997xb0aa383a.H = null;
        }
        cu0.x xVar2 = this.f303847i;
        xVar2.f303888e = c16997xb0aa383a;
        xVar2.f303890g = xVar2.f();
        if (this.f303847i.f303887d || this.f303847i.c(c16997xb0aa383a)) {
            ev0.t tVar = this.f303847i.f303886c;
            cu0.x xVar3 = this.f303847i;
            p3325xe03a0797.p3326xc267989b.l.d(tVar.f338411a, null, null, new ev0.r(c16997xb0aa383a, xVar3.f303896m, tVar, new cu0.e(c16997xb0aa383a, xVar3), null), 3, null);
        } else if (c16997xb0aa383a != null) {
            pv3.n.f440152a.a(this.f303847i.h(), c16997xb0aa383a);
        }
        cu0.x xVar4 = this.f303847i;
        yz5.l lVar = xVar4.f303895l;
        if (lVar != null) {
            lVar.mo146xb9724478(xVar4.f303888e);
        }
        this.f303847i.j();
        if (c16997xb0aa383a != null || (e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) this.f303847i.g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class)) == null) {
            return;
        }
        e0Var.o();
    }
}
