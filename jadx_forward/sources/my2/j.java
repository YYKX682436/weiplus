package my2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f414272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my2.u f414273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.me2 me2Var, my2.u uVar) {
        super(0);
        this.f414272d = me2Var;
        this.f414273e = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        if (this.f414272d.m75939xb282bd08(3) <= 0 || this.f414272d.m75939xb282bd08(4) == 3 || this.f414272d.m75939xb282bd08(4) == 4) {
            boolean z18 = false;
            if (this.f414273e.f()) {
                if (this.f414272d.m75939xb282bd08(9) > 0) {
                    qo0.c.a(this.f414273e.f414297e, qo0.b.f446966x2, null, 2, null);
                    my2.u uVar = this.f414273e;
                    my2.b bVar = uVar.f414299g;
                    if (bVar != null) {
                        ((my2.y) bVar).F(new my2.g(uVar));
                    }
                    java.lang.String m75945x2fec8307 = this.f414272d.m75945x2fec8307(5);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, c17.v(u3Var, ""))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c18 = this.f414273e.c();
                        if (c18 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(c18, null, null, new my2.i(this.f414273e, null), 3, null);
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
                        java.lang.String m75945x2fec83072 = this.f414272d.m75945x2fec8307(5);
                        c19.x(u3Var, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                    }
                    r45.me2 me2Var = ((mm2.c1) this.f414273e.f414296d.a(mm2.c1.class)).f410317b6;
                    int m75939xb282bd08 = me2Var != null ? me2Var.m75939xb282bd08(9) : ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85314j2).mo141623x754a37bb()).r()).intValue();
                    ((ku5.t0) ku5.t0.f394148d).A(this.f414273e.f414300h);
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    my2.u uVar2 = this.f414273e;
                    ((ku5.t0) u0Var).l(uVar2.f414301i, m75939xb282bd08 * 1000, uVar2.f414300h);
                } else {
                    my2.u uVar3 = this.f414273e;
                    uVar3.getClass();
                    qo0.c.a(uVar3.f414297e, qo0.b.f446972y2, null, 2, null);
                    mm2.c1 c1Var = (mm2.c1) uVar3.f414296d.a(mm2.c1.class);
                    c1Var.f410317b6 = null;
                    c1Var.f410322c6 = false;
                    c1Var.f410327d6 = false;
                }
                ((mm2.c1) this.f414273e.f414296d.a(mm2.c1.class)).f410322c6 = false;
            } else {
                java.lang.String str = this.f414273e.f414298f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visitor resume show vote, choiceListHaveChoice: ");
                java.util.LinkedList m75941xfb821914 = this.f414272d.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getChoice_list(...)");
                if (!m75941xfb821914.isEmpty()) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (it.hasNext()) {
                        if (((r45.l30) it.next()).m75939xb282bd08(2) == 1) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414272d.m75945x2fec8307(5), gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC, ""))) {
                    java.util.LinkedList m75941xfb8219142 = this.f414272d.m75941xfb821914(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getChoice_list(...)");
                    if (!m75941xfb8219142.isEmpty()) {
                        java.util.Iterator it6 = m75941xfb8219142.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (((r45.l30) it6.next()).m75939xb282bd08(2) == 1) {
                                z18 = true;
                                break;
                            }
                        }
                    }
                    if (z18) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                        java.lang.String m75945x2fec83073 = this.f414272d.m75945x2fec8307(5);
                        c27.x(u3Var2, m75945x2fec83073 != null ? m75945x2fec83073 : "");
                        my2.u uVar4 = this.f414273e;
                        uVar4.f414302m = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar4.f414298f, "visitor resume show card");
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
