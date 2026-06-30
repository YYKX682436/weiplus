package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class o4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp2.q f203390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 f203391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f203392g;

    public o4(int i17, vp2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        this.f203389d = i17;
        this.f203390e = qVar;
        this.f203391f = p4Var;
        this.f203392g = f2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        int i18 = this.f203389d;
        if (i18 != -1) {
            java.lang.Object remove = this.f203390e.f520484e.remove(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
            so2.j5 j5Var = (so2.j5) remove;
            vp2.p pVar = j5Var instanceof vp2.p ? (vp2.p) j5Var : null;
            long m75942xfb822ef2 = (pVar == null || (feedObject = pVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? 0L : m59258xd0557130.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var = this.f203391f;
            p4Var.o(5, m75942xfb822ef2);
            this.f203392g.m8155x27702c4(i18);
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            p4Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n4(mo2128x1ed62e84, null), 2, null);
        }
    }
}
