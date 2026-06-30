package cj5;

/* loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k4 f42103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(cj5.k4 k4Var) {
        super(1);
        this.f42103d = k4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.k4 k4Var = this.f42103d;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "InitAction");
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView b17 = k4Var.U6().b();
            jz5.g gVar = k4Var.f42166f;
            b17.setOnSearchTextChangeListener((cj5.x3) ((jz5.n) gVar).getValue());
            k4Var.U6().b().setOnSearchTextFouceChangeListener((cj5.x3) ((jz5.n) gVar).getValue());
            k4Var.U6().b().setOnContactDeselectListener((cj5.x3) ((jz5.n) gVar).getValue());
            if (k4Var.T6() != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = new com.tencent.mm.plugin.mvvmlist.MvvmList(new ym3.e(), new xm3.n0(), k4Var.getActivity(), null, null, 24, null);
                xm3.t0 t0Var = new xm3.t0(mvvmList2, new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.base.SelectContactSearchMvvmListUIC$buildItemConvertFactory$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        ri5.h hVar = ri5.j.I;
                        return type == ri5.j.X ? new ri5.m() : type == ri5.j.M ? new ri5.k() : type == ri5.j.V ? new ri5.l() : new ri5.g();
                    }
                }, false);
                t0Var.B = (cj5.e4) ((jz5.n) k4Var.f42172o).getValue();
                k4Var.f42169i = t0Var;
                k4Var.U6().h().setAdapter(k4Var.f42169i);
                k4Var.U6().h().setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) k4Var.f42165e).getValue());
                k4Var.f42168h = mvvmList2;
            }
            k4Var.U6().h().setOnTouchListener(new cj5.a4(k4Var));
            em.l2 U6 = k4Var.U6();
            if (U6.f254546c == null) {
                U6.f254546c = (android.widget.LinearLayout) U6.f254544a.findViewById(com.tencent.mm.R.id.kcl);
            }
            U6.f254546c.setOnTouchListener(new cj5.z3(k4Var));
            k4Var.U6().h().i(new cj5.b4(k4Var));
            com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
            updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
            updateSearchIndexAtOnceEvent.e();
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            if (!k4Var.f42171n) {
                android.view.View inflate = android.view.LayoutInflater.from(k4Var.getActivity()).inflate(com.tencent.mm.R.layout.a0c, (android.view.ViewGroup) k4Var.U6().h(), false);
                k4Var.f42170m = inflate;
                xm3.t0 t0Var2 = k4Var.f42169i;
                if (t0Var2 != null) {
                    kotlin.jvm.internal.o.d(inflate);
                    android.view.View view = k4Var.f42170m;
                    in5.n0.U(t0Var2, inflate, view != null ? view.hashCode() : 0, false, 4, null);
                }
                k4Var.f42171n = true;
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.t)) {
            wi5.t tVar = (wi5.t) dVar2;
            if (k4Var.f42170m != null && !((java.lang.Boolean) ((jz5.n) k4Var.f42167g).getValue()).booleanValue()) {
                android.view.View view2 = k4Var.f42170m;
                kotlin.jvm.internal.o.d(view2);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.gxy);
                if (linearLayout != null) {
                    linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(linearLayout.getWidth(), tVar.f446340b));
                }
            }
        }
        if (((wi5.t0) state.a(wi5.t0.class)) != null && (mvvmList = k4Var.f42168h) != null) {
            mvvmList.z(new cj5.c4(state));
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof p0.h)) {
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = k4Var.f42168h;
            if (mvvmList3 != null) {
                mvvmList3.z(new q0.p(state));
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.a1)) {
            wi5.a1 a1Var = (wi5.a1) dVar4;
            android.view.ViewGroup.LayoutParams layoutParams = k4Var.U6().h().getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a1Var.f446279b;
            }
            k4Var.U6().h().setLayoutParams(layoutParams);
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.v)) {
            wi5.v vVar = (wi5.v) dVar5;
            if (kotlin.jvm.internal.o.b(vVar.f446348b.f446366a, state.f446326v)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactSearchMvvmListUIC", "SearchEndAction: multiSearch: " + vVar.f446348b.f446369d);
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList4 = k4Var.f42168h;
                if (mvvmList4 != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.w(mvvmList4, vVar.f446350d, false, 2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
