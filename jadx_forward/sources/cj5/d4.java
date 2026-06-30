package cj5;

/* loaded from: classes.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k4 f123636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(cj5.k4 k4Var) {
        super(1);
        this.f123636d = k4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.k4 k4Var = this.f123636d;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "InitAction");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 b17 = k4Var.U6().b();
            jz5.g gVar = k4Var.f123699f;
            b17.m75368x62bf99da((cj5.x3) ((jz5.n) gVar).mo141623x754a37bb());
            k4Var.U6().b().m75369x50775ebc((cj5.x3) ((jz5.n) gVar).mo141623x754a37bb());
            k4Var.U6().b().m75367x3935f5b0((cj5.x3) ((jz5.n) gVar).mo141623x754a37bb());
            if (k4Var.T6() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new ym3.e(), new xm3.n0(), k4Var.m158354x19263085(), null, null, 24, null);
                xm3.t0 t0Var = new xm3.t0(c16718x7059cefe2, new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactSearchMvvmListUIC$buildItemConvertFactory$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        ri5.h hVar = ri5.j.I;
                        return type == ri5.j.X ? new ri5.m() : type == ri5.j.M ? new ri5.k() : type == ri5.j.V ? new ri5.l() : new ri5.g();
                    }
                }, false);
                t0Var.B = (cj5.e4) ((jz5.n) k4Var.f123705o).mo141623x754a37bb();
                k4Var.f123702i = t0Var;
                k4Var.U6().h().mo7960x6cab2c8d(k4Var.f123702i);
                k4Var.U6().h().mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) k4Var.f123698e).mo141623x754a37bb());
                k4Var.f123701h = c16718x7059cefe2;
            }
            k4Var.U6().h().setOnTouchListener(new cj5.a4(k4Var));
            em.l2 U6 = k4Var.U6();
            if (U6.f336079c == null) {
                U6.f336079c = (android.widget.LinearLayout) U6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.kcl);
            }
            U6.f336079c.setOnTouchListener(new cj5.z3(k4Var));
            k4Var.U6().h().i(new cj5.b4(k4Var));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
            c6205xeec13785.f136457g.f87952a = 0L;
            c6205xeec13785.e();
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            if (!k4Var.f123704n) {
                android.view.View inflate = android.view.LayoutInflater.from(k4Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0c, (android.view.ViewGroup) k4Var.U6().h(), false);
                k4Var.f123703m = inflate;
                xm3.t0 t0Var2 = k4Var.f123702i;
                if (t0Var2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                    android.view.View view = k4Var.f123703m;
                    in5.n0.U(t0Var2, inflate, view != null ? view.hashCode() : 0, false, 4, null);
                }
                k4Var.f123704n = true;
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.t)) {
            wi5.t tVar = (wi5.t) dVar2;
            if (k4Var.f123703m != null && !((java.lang.Boolean) ((jz5.n) k4Var.f123700g).mo141623x754a37bb()).booleanValue()) {
                android.view.View view2 = k4Var.f123703m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.gxy);
                if (linearLayout != null) {
                    linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout.getWidth(), tVar.f527873b));
                }
            }
        }
        if (((wi5.t0) state.a(wi5.t0.class)) != null && (c16718x7059cefe = k4Var.f123701h) != null) {
            c16718x7059cefe.z(new cj5.c4(state));
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof p0.h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = k4Var.f123701h;
            if (c16718x7059cefe3 != null) {
                c16718x7059cefe3.z(new q0.p(state));
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.a1)) {
            wi5.a1 a1Var = (wi5.a1) dVar4;
            android.view.ViewGroup.LayoutParams layoutParams = k4Var.U6().h().getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a1Var.f527812b;
            }
            k4Var.U6().h().setLayoutParams(layoutParams);
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof wi5.v)) {
            wi5.v vVar = (wi5.v) dVar5;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f527881b.f527899a, state.f527859v)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "SearchEndAction: multiSearch: " + vVar.f527881b.f527902d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe4 = k4Var.f123701h;
                if (c16718x7059cefe4 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.w(c16718x7059cefe4, vVar.f527883d, false, 2, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
