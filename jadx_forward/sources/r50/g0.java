package r50;

/* loaded from: classes5.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r50.j0 j0Var) {
        super(1);
        this.f474112d = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        vg5.a state = (vg5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wg5.e)) {
            r50.j0 j0Var = this.f474112d;
            j0Var.W6().f().setOnClickListener(new r50.z(j0Var));
            if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
                j0Var.f474121g = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(j0Var.m158354x19263085());
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(j0Var.m158354x19263085());
                j0Var.f474121g = wi6;
                int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
                wi6.mo75331xef640234(0);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = j0Var.f474121g;
                if (abstractC19636xc6b37291 != null) {
                    abstractC19636xc6b37291.setVisibility(8);
                }
                int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(j0Var.m158354x19263085());
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = j0Var.f474121g;
                if (abstractC19636xc6b372912 != null) {
                    abstractC19636xc6b372912.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i65.a.B(j0Var.m158354x19263085()), g17));
                }
                em.b W6 = j0Var.W6();
                if (W6.f335625o == null) {
                    W6.f335625o = (android.widget.LinearLayout) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.dcu);
                }
                W6.f335625o.addView(j0Var.f474121g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "init: height %s, addView, Gone smileyPanel", java.lang.Integer.valueOf(g17));
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = j0Var.f474121g;
                if (abstractC19636xc6b372913 != null) {
                    abstractC19636xc6b372913.c();
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = j0Var.f474121g;
                if (abstractC19636xc6b372914 != null) {
                    abstractC19636xc6b372914.i();
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372915 = j0Var.f474121g;
                if (abstractC19636xc6b372915 != null) {
                    abstractC19636xc6b372915.mo75339x5e04422d(new r50.u(j0Var));
                }
            }
            em.b W62 = j0Var.W6();
            if (W62.f335626p == null) {
                W62.f335626p = (android.widget.LinearLayout) W62.f335611a.findViewById(com.p314xaae8f345.mm.R.id.ty8);
            }
            W62.f335626p.setOnTouchListener(new r50.a0(j0Var));
            java.util.ArrayList arrayList = (java.util.ArrayList) state.f518308f;
            if (arrayList.size() == 1) {
                java.lang.String str = (java.lang.String) arrayList.get(0);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                    ct.p2 p2Var = (ct.p2) i95.n0.c(ct.p2.class);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 e17 = j0Var.W6().e();
                    android.app.Activity m80379x76847179 = j0Var.m80379x76847179();
                    ((qg5.a) p2Var).getClass();
                    com.p314xaae8f345.mm.ui.i1.c(e17, m80379x76847179, str);
                }
            }
            j0Var.W6().i().setTextSize(0, i65.a.f(j0Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
            if (j0Var.V6()) {
                j0Var.W6().e().mo81358x8f2956f(true);
                j0Var.W6().e().setImeOptions(4);
            } else {
                j0Var.W6().i().setOnClickListener(new r50.b0(j0Var));
            }
            j0Var.W6().e().c(new r50.c0(j0Var));
            j0Var.W6().e().b("", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(j0Var.m80379x76847179()), (nl5.a0) ((jz5.n) j0Var.f474129r).mo141623x754a37bb(), null);
            ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).wi(j0Var.m80379x76847179(), 17, j0Var.W6().e(), j0Var.W6().j(), "");
            a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
            if (mVar != null) {
                mVar.f82506g = 4;
            }
            j0Var.W6().j().m75379x799b193b(new r50.d0(j0Var));
            j0Var.W6().j().m75380xef76fd8(new r50.e0(j0Var));
            j0Var.W6().e().setOnTouchListener(new r50.f0());
        }
        return jz5.f0.f384359a;
    }
}
