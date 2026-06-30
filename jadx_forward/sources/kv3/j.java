package kv3;

/* loaded from: classes5.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.p1 {
    public final r45.yv0 F;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, r45.yv0 finderCgiType, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(parent, status);
        finderCgiType = (i17 & 4) != 0 ? r45.yv0.kFinderBgmListTypeSearch : finderCgiType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderCgiType, "finderCgiType");
        this.F = finderCgiType;
        this.G = jz5.h.b(new kv3.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public void u(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c1 searchType) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchType, "searchType");
        ev3.d dVar = this.A;
        ((nv3.i) ((jz5.n) this.G).mo141623x754a37bb()).a(this.f237714v, z17, searchType, (dVar == null || (f17 = dVar.f()) == null) ? null : f17.p());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public int x() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1
    public void z() {
        super.z();
        nv3.i iVar = (nv3.i) ((jz5.n) this.G).mo141623x754a37bb();
        jv3.a aVar = iVar.f422214e;
        if (aVar != null) {
            aVar.j();
        }
        iVar.f422214e = null;
    }
}
