package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class hd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 f255494d;

    public hd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004) {
        this.f255494d = c18652x18778004;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            qj4.s sVar = qj4.s.f445491a;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004.f255175y;
            ai4.m0 m0Var = ai4.m0.f86706a;
            mj4.h E = m0Var.E();
            qj4.s.l(sVar, 23L, null, null, 0L, E != null ? ((mj4.k) E).l() : "", 0L, 46, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004 = this.f255494d;
            in5.c cVar = (in5.c) kz5.n0.a0(c18652x18778004.f255179q, c18652x18778004.f255184v);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("menu delete: ");
            sb6.append(cVar != null);
            sb6.append(", ");
            sb6.append(c18652x18778004.f255184v);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", sb6.toString());
            if (cVar == null) {
                return;
            }
            c18652x18778004.f255179q.remove(c18652x18778004.f255184v);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c18652x18778004.f255177o;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvLikeList");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8155x27702c4(c18652x18778004.f255184v);
            }
            if (cVar instanceof kj4.c) {
                mj4.l lVar = ((kj4.c) cVar).f389987d;
                lVar.f76602x68e4d00a = 1;
                m0Var.u(lVar);
            } else if (cVar instanceof kj4.a) {
                mj4.e eVar = ((kj4.a) cVar).f389984d;
                eVar.f76556x68e4d00a = 1;
                m0Var.A(eVar);
            }
        }
    }
}
