package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class kp implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200383d;

    public kp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar) {
        this.f200383d = ppVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200383d;
        int u07 = ppVar.f200931d.u0(view);
        if (u07 < 0 || u07 >= ppVar.f200933f.size()) {
            return;
        }
        r45.xn1 xn1Var = ((vi2.d) ppVar.f200933f.get(u07)).f519077d;
        java.lang.String m76197x6c03c64c = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicRecommAnchorsCardPanelWidget", "username is null or empty");
        } else {
            ppVar.f200937j.put(m76197x6c03c64c, new hi2.a(((vi2.d) ppVar.f200933f.get(u07)).f519077d));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
