package sr2;

/* loaded from: classes10.dex */
public final class k2 implements w25.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493144a;

    public k2(sr2.y2 y2Var) {
        this.f493144a = y2Var;
    }

    @Override // w25.g
    public final void a() {
        sr2.y2 y2Var = this.f493144a;
        y2Var.f493336g = true;
        if (y2Var.W6() && !y2Var.V6()) {
            java.lang.String string = y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572907nm1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ry2.j.f482931a.a(y2Var.m158354x19263085(), kz5.b0.c(new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, com.p314xaae8f345.mm.R.C30867xcad56011.css, new sr2.p2(y2Var), null, 16, null)), string);
            return;
        }
        if (y2Var.U6()) {
            y2Var.Z6();
            return;
        }
        if (!y2Var.R6() || !y2Var.X6()) {
            y2Var.getClass();
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.D8).mo141623x754a37bb()).r()).intValue();
            if (intValue == 1) {
                y2Var.Z6();
                return;
            }
            if (intValue == 2) {
                pf5.e.m158343xd39de650(y2Var, null, null, new sr2.h2(y2Var, null), 3, null);
                return;
            }
            ya2.p1 p1Var = y2Var.f493333d;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            yv2.b bVar = p1Var instanceof yv2.b ? (yv2.b) p1Var : null;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(y2Var.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsu, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qxk);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) inflate.findViewById(com.p314xaae8f345.mm.R.id.qxh);
        if (c23001x9d3a0bdc != null) {
            java.lang.String string2 = y2Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eod);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = y2Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eoe, string2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string3);
            int L = r26.n0.L(string3, string2, 0, false, 6, null);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string3, y2Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), y2Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new sr2.q2(y2Var)), L, string2.length() + L, 17);
            c23001x9d3a0bdc.b(spannableString);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.hrk);
        ((android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566538qt1)).setOnClickListener(new sr2.r2(checkBox));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) inflate.findViewById(com.p314xaae8f345.mm.R.id.b0e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) inflate.findViewById(com.p314xaae8f345.mm.R.id.b0f);
        c22661xa3a2b3c0.setText(y2Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cju));
        com.p314xaae8f345.mm.ui.fk.a(c22661xa3a2b3c0);
        c22661xa3a2b3c02.setText(y2Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572953h95));
        com.p314xaae8f345.mm.ui.fk.a(c22661xa3a2b3c02);
        c22661xa3a2b3c02.setOnClickListener(new sr2.s2(checkBox, y2Var));
        y2Var.a7(inflate, "groupbuy_share_plan_describe", 32);
        y2Var.a7(c22661xa3a2b3c02, "join_groupbuy_share_plan", 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(y2Var.m158354x19263085());
        y1Var.k(inflate);
        c22661xa3a2b3c0.setOnClickListener(new sr2.t2(y1Var));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.pnq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.u2(y1Var));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qxi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        textView2.setOnClickListener(new sr2.v2(y1Var, y2Var));
        y1Var.s();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_STORE_PROMOTE_DIALOG_SHOW_COUNT_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
    }
}
