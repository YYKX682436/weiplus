package s82;

/* loaded from: classes9.dex */
public class v0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f486381f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        super(raVar);
        this.f486381f = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561308ew);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07;
        java.lang.String str;
        r45.km6 km6Var;
        r45.gp0 J2 = o72.x1.J(r2Var);
        int i17 = r2Var.f67657x2262335f;
        if (i17 == 33) {
            if (J2 != null && (km6Var = J2.J1.G) != null) {
                boolean q17 = il4.d.q(km6Var.f460371d);
                boolean z17 = !il4.d.f373635a.u(km6Var.f460371d);
                il4.d.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, km6Var);
                return (q17 || z17) ? il4.d.g(il4.d.v(km6Var.f460372e)) : J2.f456941f;
            }
        } else {
            if (i17 == 24) {
                r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                r45.op0 op0Var = bq0Var != null ? bq0Var.P : null;
                return (op0Var == null || (str = op0Var.f463943g) == null) ? "" : str;
            }
            if (i17 == 5 && (jq0Var = r2Var.f67640x5ab01132.f452495d) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.B) && (f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(jq0Var.B)) != null && f07.d1().equals(jq0Var.B)) {
                return f07.g2();
            }
        }
        return "";
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return (gp0Var == null || gp0Var.I == 33) ? java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79117xea106884) : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80322xbf1ef89e);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.u0 u0Var;
        int i17;
        r45.op0 op0Var;
        r45.qp0 qp0Var;
        r45.km6 km6Var;
        if (r2Var.f67640x5ab01132 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavUrlListItem", "getView: err favProto null");
            r2Var.f67640x5ab01132 = new r45.bq0();
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            s82.u0 u0Var2 = new s82.u0();
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abb, null);
            a(inflate, u0Var2, r2Var);
            u0Var2.f486374q = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dum);
            u0Var2.f486375r = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dur);
            u0Var2.f486376s = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dwp);
            u0Var2.f486377t = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            u0Var2.f486376s.setMaxLines(2);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565847du0);
            u0Var2.f486377t = textView;
            textView.setMaxLines(2);
            u0Var = u0Var2;
            view2 = inflate;
        } else {
            view2 = view;
            u0Var = (s82.u0) view.getTag();
        }
        g(u0Var, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        r45.tq0 tq0Var = r2Var.f67640x5ab01132.f452501m;
        if (tq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavUrlListItem", "getView: urlItem null, type=%d, id=%d, sourceType=%d", java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Integer.valueOf(r2Var.f67651x76e81a5a));
        }
        android.widget.TextView textView2 = u0Var.f486376s;
        r45.gp0 J3 = o72.x1.J(r2Var);
        java.lang.String str = tq0Var != null ? tq0Var.f468197d : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && J3 != null) {
            str = J3.f456937d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView2.setVisibility(8);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = textView2.getContext();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str));
            textView2.setVisibility(0);
        }
        int i18 = r2Var.f67657x2262335f;
        if (i18 == 33) {
            if (J2 != null && (km6Var = J2.J1.G) != null) {
                int i19 = km6Var.f460371d;
                il4.d dVar = il4.d.f373635a;
                boolean z17 = i19 == 4;
                boolean q17 = il4.d.q(i19);
                boolean u17 = true ^ il4.d.f373635a.u(km6Var.f460371d);
                java.lang.String n17 = il4.d.n(viewGroup.getContext(), km6Var);
                if (z17) {
                    u0Var.f486377t.setText(n17);
                } else if (q17 || u17) {
                    il4.d.g(il4.d.v(km6Var.f460372e));
                    if (u17) {
                        u0Var.f486377t.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.c_6));
                    } else {
                        u0Var.f486377t.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.c_5));
                    }
                }
            }
        } else if (i18 == 24) {
            r45.bq0 bq0Var = r2Var.f67640x5ab01132;
            r45.op0 op0Var2 = bq0Var != null ? bq0Var.P : null;
            int i27 = r2Var.f67652x5334f55;
            if (op0Var2 != null) {
                if (i27 == 0 && (i17 = op0Var2.f463941e) != 0) {
                    i27 = i17;
                }
                u0Var.f486376s.setVisibility(0);
                u0Var.f486377t.setVisibility(0);
                java.lang.String str2 = op0Var2.f463946m;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = op0Var2.f463945i;
                if (str3 == null) {
                    str3 = "";
                }
                u0Var.f486377t.setText(str2);
                u0Var.f486376s.setText(str3);
                u0Var.f486308b.setVisibility(0);
                if (i27 == 1) {
                    u0Var.f486308b.s(com.p314xaae8f345.mm.R.raw.f79119x133d2099, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
                } else if (i27 == 2) {
                    u0Var.f486308b.s(com.p314xaae8f345.mm.R.raw.f81003x40b817d9, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
                } else if (i27 == 3) {
                    u0Var.f486308b.s(com.p314xaae8f345.mm.R.raw.f79445x9691bd4e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
                }
            }
        }
        int a17 = o25.y.a(J2.K);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = u0Var.f486374q;
        if (a17 == (com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81273xa841889 : com.p314xaae8f345.mm.R.raw.f81274x46732e63)) {
            a17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563020bi5;
        }
        int i28 = this.f486381f;
        raVar.c(imageView, J2, r2Var, a17, i28, i28);
        r45.bq0 bq0Var2 = r2Var.f67640x5ab01132;
        if ((bq0Var2 == null || (qp0Var = bq0Var2.K) == null || qp0Var.f465695d != 16) && (tq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468211u))) {
            u0Var.f486375r.setVisibility(8);
        } else {
            u0Var.f486375r.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            u0Var.f486375r.setVisibility(0);
        }
        if (r2Var.f67657x2262335f == 24) {
            r45.bq0 bq0Var3 = r2Var.f67640x5ab01132;
            if (bq0Var3 == null || (op0Var = bq0Var3.P) == null || op0Var.f463944h != 2) {
                u0Var.f486375r.setVisibility(8);
            } else {
                u0Var.f486375r.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                u0Var.f486375r.setVisibility(0);
            }
        }
        android.widget.ImageView imageView2 = u0Var.f486375r;
        if (imageView2 != null) {
            imageView2.setContentDescription("");
        }
        if (J2.I == 33) {
            s82.c.h(u0Var.f486374q, 33);
        } else {
            s82.c.h(u0Var.f486374q, 5);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.qp0 qp0Var;
        s82.u0 u0Var = (s82.u0) view.getTag();
        android.content.Context context = view.getContext();
        android.widget.ImageView imageView = u0Var.f486374q;
        o72.r2 r2Var = u0Var.f486307a;
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (bq0Var != null && (qp0Var = bq0Var.K) != null && qp0Var.f465695d >= 0) {
            int[] iArr = new int[2];
            if (imageView != null) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                imageView.getLocationInWindow(iArr);
                r45.qp0 qp0Var2 = r2Var.f67640x5ab01132.K;
                r45.rp0 rp0Var = new r45.rp0();
                qp0Var2.f465705q = rp0Var;
                rp0Var.f466603d = iArr[0];
                rp0Var.f466604e = iArr[1];
                rp0Var.f466605f = width;
                rp0Var.f466606g = height;
            }
        }
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, u0Var.f486307a, dq0Var);
    }
}
