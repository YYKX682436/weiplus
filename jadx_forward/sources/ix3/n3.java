package ix3;

/* loaded from: classes.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f377037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ix3.o3 o3Var) {
        super(1);
        this.f377037d = o3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        hx3.b state = (hx3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ix3.o3 o3Var = this.f377037d;
        if (dVar != null && (dVar instanceof hx3.a)) {
            hx3.a aVar = (hx3.a) dVar;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) o3Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqa);
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(o3Var.m158354x19263085()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new xw3.b(aVar.f367190b, state.f367191e), new xm3.n0(), o3Var.m158354x19263085(), null, null, 24, null);
            if (c22849x81a93d25 != null) {
                xm3.t0 t0Var = new xm3.t0(c16718x7059cefe2, new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.uic.RepairerListUIC$buildItemCoverts$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new ex3.d();
                    }
                }, false);
                t0Var.B = o3Var.f377054i;
                c22849x81a93d25.mo7960x6cab2c8d(t0Var);
            }
            o3Var.f377049d = c16718x7059cefe2;
            o3Var.f377050e = new rl5.r(o3Var.m158354x19263085());
            if (ih.d.c()) {
                if (!(th.o.f500795l.f500800e != null) && new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2543xbf8d97c1.C20360xfae2d969().o().contains(java.lang.String.valueOf(0))) {
                    bm5.o1.f104252a.p("RepairerConfig_Matrix_Battery_Top_Thread_Int_Int", 0);
                }
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof hx3.e) && r26.n0.N(((hx3.e) dVar2).f367194b) && (c16718x7059cefe = o3Var.f377049d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe, null, 1, null);
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof hx3.c)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i17 = 0;
            for (java.lang.Object obj2 : ((hx3.c) dVar3).f367193b) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dp5 dp5Var = (r45.dp5) obj2;
                xw3.a aVar2 = xw3.b.f539260g;
                r45.ep5 ep5Var = (r45.ep5) dp5Var.m75936x14adae67(12);
                linkedList.add(new ex3.e(i17, 1, dp5Var, aVar2.a(dp5Var, ep5Var != null && ep5Var.m75939xb282bd08(0) == 1)));
                i17 = i18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = o3Var.f377049d;
            if (c16718x7059cefe3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.w(c16718x7059cefe3, linkedList, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
