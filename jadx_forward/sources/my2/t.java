package my2;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f414295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(my2.u uVar) {
        super(0);
        this.f414295d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c17;
        my2.k0 k0Var;
        my2.k0 k0Var2;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f414295d.f414298f, "updateStatus");
        if (((mm2.c1) this.f414295d.f414296d.a(mm2.c1.class)).f410322c6) {
            my2.u uVar = this.f414295d;
            r45.me2 me2Var = ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410317b6;
            if (me2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "update votingInfo is null");
                qo0.c.a(uVar.f414297e, qo0.b.f446972y2, null, 2, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c18 = uVar.c();
                if (((c18 == null || (k0Var2 = (my2.k0) c18.mo57682x2a5e9229(my2.k0.class)) == null || (viewGroup = k0Var2.f446856d) == null || viewGroup.getVisibility() != 0) ? false : true) && (c17 = uVar.c()) != null && (k0Var = (my2.k0) c17.mo57682x2a5e9229(my2.k0.class)) != null) {
                    k0Var.u1();
                }
                if (me2Var.m75939xb282bd08(3) < 0 || !(me2Var.m75939xb282bd08(4) == 1 || me2Var.m75939xb282bd08(4) == 1)) {
                    my2.b bVar = uVar.f414299g;
                    if (bVar != null) {
                        ((my2.y) bVar).F(new my2.l(uVar));
                    }
                    java.lang.String m75945x2fec8307 = me2Var.m75945x2fec8307(5);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, c19.v(u3Var, "")) || !(me2Var.m75939xb282bd08(11) == 0 || uVar.f())) {
                        r45.me2 me2Var2 = ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410317b6;
                        int m75939xb282bd08 = me2Var2 != null ? me2Var2.m75939xb282bd08(9) : 0;
                        ((ku5.t0) ku5.t0.f394148d).A(uVar.f414300h);
                        ((ku5.t0) ku5.t0.f394148d).l(uVar.f414301i, m75939xb282bd08 * 1000, uVar.f414300h);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "voteInfo clear task execute");
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
                        java.lang.String m75945x2fec83072 = me2Var.m75945x2fec8307(5);
                        c27.x(u3Var, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c28 = uVar.c();
                        if (c28 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(c28, null, null, new my2.n(uVar, null), 3, null);
                        }
                    }
                    ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410322c6 = false;
                } else {
                    my2.b bVar2 = uVar.f414299g;
                    if (bVar2 != null) {
                        ((my2.y) bVar2).G(new my2.k(uVar));
                    }
                    qo0.c.a(uVar.f414297e, qo0.b.f446966x2, null, 2, null);
                    ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410322c6 = true;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
