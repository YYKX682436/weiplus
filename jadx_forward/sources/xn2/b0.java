package xn2;

/* loaded from: classes2.dex */
public final class b0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537009g;

    public b0(xn2.p0 p0Var) {
        this.f537009g = p0Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) || (event instanceof fc2.t) || (event instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d1);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        xn2.p0 p0Var = this.f537009g;
        if (z17) {
            fc2.t tVar = (fc2.t) ev6;
            if (tVar.f342518d != 6 || p0Var.f537084i == tVar.f342525k) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "lastCenterFeedId=" + pm0.v.u(p0Var.f537084i) + ", new centerFeedId=" + pm0.v.u(tVar.f342525k));
            p0Var.f537084i = tVar.f342525k;
            ao2.a k17 = p0Var.k();
            k17.getClass();
            qg3.w wVar = k17.f94076l;
            if (wVar != null) {
                p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169893x21b82281(((qg3.x) wVar).m105978x2737f10(), 7, "ViewIdMainFeed");
                return;
            }
            return;
        }
        if (!(ev6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d1)) {
            if (ev6 instanceof ec2.f) {
                if (vn2.u0.f519920a.g()) {
                    ec2.f fVar = (ec2.f) ev6;
                    int i17 = fVar.f332492d;
                    if (i17 == 4) {
                        ao2.a k18 = p0Var.k();
                        long j17 = fVar.f332498j;
                        if (!k18.f94069e && k18.f94068d && !k18.f94070f) {
                            k18.f94070f = true;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            k18.f94072h = currentTimeMillis;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 4, java.lang.Integer.valueOf(k18.f94066b), java.lang.Long.valueOf(currentTimeMillis - k18.f94074j), 1, java.lang.Long.valueOf(k18.f94065a), java.lang.Integer.valueOf(k18.f94073i), pm0.v.u(j17));
                        }
                    } else if (i17 == 18) {
                        ao2.a k19 = p0Var.k();
                        long j18 = fVar.f332498j;
                        if (!k19.f94069e && k19.f94068d) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 6, java.lang.Integer.valueOf(k19.f94066b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - k19.f94072h), 1, java.lang.Long.valueOf(k19.f94065a), java.lang.Integer.valueOf(k19.f94073i), pm0.v.u(j18));
                        }
                    } else if (i17 == 19) {
                        ao2.a k27 = p0Var.k();
                        long j19 = fVar.f332498j;
                        if (!k27.f94069e && k27.f94068d && !k27.f94071g) {
                            k27.f94071g = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 5, java.lang.Integer.valueOf(k27.f94066b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - k27.f94072h), 1, java.lang.Long.valueOf(k27.f94065a), java.lang.Integer.valueOf(k27.f94073i), pm0.v.u(j19));
                        }
                    }
                }
                ec2.f fVar2 = (ec2.f) ev6;
                if (fVar2.f332492d == 12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, pm0.v.u(fVar2.f332498j).concat(" auto play"));
                    ao2.a k28 = p0Var.k();
                    k28.getClass();
                    qg3.w wVar2 = k28.f94076l;
                    if (wVar2 != null) {
                        p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169893x21b82281(((qg3.x) wVar2).m105978x2737f10(), 8, "ViewIdMainFeed");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String str = p0Var.f537078c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d1) ev6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c1 c1Var = d1Var.f202452e;
        sb6.append(c1Var);
        sb6.append(" SeeLaterFeedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = d1Var.f202451d;
        sb6.append(pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (c1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c1.f202441d) {
            zn2.a aVar = abstractC14490x69736cb5 instanceof zn2.a ? (zn2.a) abstractC14490x69736cb5 : null;
            if (aVar != null) {
                bo2.c cVar = (bo2.c) cu2.u.f303974a.o(aVar.getFeedObject(), 11003);
                vn2.u0 u0Var = vn2.u0.f519920a;
                r45.dm2 m76806xdef68064 = cVar.getFeedObject().getFeedObject().m76806xdef68064();
                r45.yu2 yu2Var = m76806xdef68064 != null ? (r45.yu2) m76806xdef68064.m75936x14adae67(35) : null;
                if (yu2Var == null) {
                    yu2Var = new r45.yu2();
                }
                if (yu2Var.m75939xb282bd08(1) <= 0) {
                    java.lang.Number valueOf = java.lang.Integer.valueOf(c01.id.e());
                    if (!(valueOf.intValue() > 0)) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
                    }
                    yu2Var.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
                }
                r45.dm2 m76806xdef680642 = cVar.getFeedObject().getFeedObject().m76806xdef68064();
                if (m76806xdef680642 != null) {
                    m76806xdef680642.set(35, yu2Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.g0 c17 = p0Var.j().c();
                c17.getClass();
                if (c17.d().isEmpty()) {
                    c17.d().add(cVar);
                } else {
                    java.util.List d17 = c17.d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-seeLaterDetailList>(...)");
                    pm0.v.I(d17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.b0(cVar));
                    c17.d().add(0, cVar);
                }
                c17.e(3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.g0 c18 = p0Var.j().c();
                xn2.b bVar = p0Var.f537080e;
                c18.b(aVar, bVar != null ? ((xn2.f1) bVar).a() : null);
            }
        }
    }
}
