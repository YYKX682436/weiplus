package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f10 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public final p012xc85e97e9.p093xedfae76a.k0 A;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194013p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f194014q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f194015r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f194016s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.RelativeLayout f194017t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f194018u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f194019v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f194020w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f194021x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f194022y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f194023z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194013p = statusMonitor;
        this.f194014q = "Finder.FinderLiveNewVisitorPostPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.fq6);
        this.f194015r = findViewById;
        android.widget.TextView postHint = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566388fq3);
        this.f194016s = postHint;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.tqr);
        this.f194017t = relativeLayout;
        this.f194018u = "";
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dae);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f194019v = string;
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        this.f194020w = string2;
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cl_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        this.f194021x = string3;
        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cy_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        this.f194022y = string4;
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.evd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        this.f194023z = string5;
        this.A = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b10(this);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x00(this, root));
        if (relativeLayout != null) {
            ym5.a1.h(relativeLayout, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y00(this));
        }
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z00(this));
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        r4Var.e(this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(postHint, "postHint");
        com.p314xaae8f345.mm.ui.fk.a(postHint);
        postHint.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        r4Var.n3(root, "Finder.FinderLiveNewVisitorPostPlugin", false, true);
        if (r4Var.w1()) {
            android.view.ViewGroup viewGroup = this.f446856d;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a10 a10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a10(this, i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.u(viewGroup, a10Var);
            z1(i17);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), v1((int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)));
        }
    }

    public static final boolean t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var) {
        java.lang.String str;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) f10Var.P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        boolean z17 = str.length() == 0;
        android.view.ViewGroup viewGroup = f10Var.f446856d;
        if (z17) {
            db5.t7.m123883x26a183b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cya), 0).show();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
            if (xVar.g(str)) {
                db5.t7.m123883x26a183b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyb), 0).show();
            } else if (xVar.h(str)) {
                db5.t7.m123883x26a183b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyc), 0).show();
            } else {
                if (((mm2.e0) f10Var.P0(mm2.e0.class)).f410502i) {
                    return true;
                }
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eby);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                db5.t7.g(viewGroup.getContext(), string);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            super.K0(i17);
        } else {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f194014q, "setVisible return for isTeenMode");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        fe2.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            K0(8);
            return;
        }
        if (ordinal == 123) {
            u1("");
            return;
        }
        android.view.View view = this.f194015r;
        if (ordinal == 127) {
            java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG") : null;
            this.f194018u = string != null ? string : "";
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a.a(S0()) && (qVar = (fe2.q) X0(fe2.q.class)) != null) {
                qVar.w1(this.f194014q);
            }
            view.performClick();
            return;
        }
        if (ordinal == 187) {
            if (((mm2.u0) P0(mm2.u0.class)).f410978h) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 6, kz5.b1.e(new jz5.l(ya.b.f77502x92235c1b, "1")));
                return;
            }
            return;
        }
        if (ordinal == 243) {
            ((mm2.e0) P0(mm2.e0.class)).f410503m.mo7806x9d92d11c(this, this.A);
            return;
        }
        if (ordinal != 245) {
            return;
        }
        boolean z17 = bundle != null && bundle.getBoolean("isShow");
        android.widget.RelativeLayout relativeLayout = this.f194017t;
        if (z17) {
            if (relativeLayout != null) {
                relativeLayout.setVisibility(x1() ? 0 : 8);
            }
            view.requestLayout();
        } else {
            if (relativeLayout != null) {
                relativeLayout.setVisibility(x1() ? 0 : 8);
            }
            this.f446856d.requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        android.widget.RelativeLayout relativeLayout = this.f194017t;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(x1() ? 0 : 8);
        }
        this.f446856d.requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r6.y1()
            android.widget.TextView r1 = r6.f194016s
            if (r0 == 0) goto L25
            java.lang.Class<mm2.j2> r0 = mm2.j2.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.j2 r0 = (mm2.j2) r0
            boolean r2 = r6.x0()
            boolean r0 = r0.O6(r2)
            if (r0 != 0) goto L25
            java.lang.String r7 = r6.f194022y
            r1.setText(r7)
            return
        L25:
            boolean r0 = r6.w1()
            r2 = 0
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            if (r0 == 0) goto L7d
            java.lang.Class<mm2.u0> r0 = mm2.u0.class
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.u0 r0 = (mm2.u0) r0
            boolean r4 = r0.f410977g
            r5 = 1
            if (r4 == 0) goto L44
            r45.i60 r0 = r0.f410976f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.m75945x2fec8307(r5)
            goto L4e
        L44:
            r45.i60 r0 = r0.f410976f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.m75945x2fec8307(r2)
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L58
            int r4 = r0.length()
            if (r4 != 0) goto L57
            goto L58
        L57:
            r5 = r2
        L58:
            if (r5 != 0) goto L5b
            goto L79
        L5b:
            zl2.r4 r0 = zl2.r4.f555483a
            gk2.e r4 = r6.S0()
            boolean r0 = r0.W1(r4)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r6.f194021x
            goto L79
        L6a:
            androidx.lifecycle.c1 r0 = r6.P0(r3)
            mm2.c1 r0 = (mm2.c1) r0
            boolean r0 = r0.T
            if (r0 == 0) goto L77
            java.lang.String r0 = r6.f194020w
            goto L79
        L77:
            java.lang.String r0 = r6.f194019v
        L79:
            r1.setText(r0)
            goto L82
        L7d:
            java.lang.String r0 = r6.f194023z
            r1.setText(r0)
        L82:
            android.widget.RelativeLayout r0 = r6.f194017t
            if (r0 != 0) goto L87
            goto L93
        L87:
            boolean r1 = r6.x1()
            if (r1 == 0) goto L8e
            goto L90
        L8e:
            r2 = 8
        L90:
            r0.setVisibility(r2)
        L93:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " riskControlEnableComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f410417t
            r0.append(r7)
            java.lang.String r7 = ",enableLiveRoomComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f410435w
            r0.append(r7)
            java.lang.String r7 = ",enableCustomerComment:"
            r0.append(r7)
            androidx.lifecycle.c1 r7 = r6.P0(r3)
            mm2.c1 r7 = (mm2.c1) r7
            boolean r7 = r7.f410429v
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = r6.f194014q
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10.u1(java.lang.String):void");
    }

    public final int v1(int i17) {
        android.view.ViewGroup viewGroup = this.f446856d;
        if (i65.a.q(viewGroup.getContext()) <= 1.0f) {
            return i17;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return (int) r4Var.s0(context, i17);
    }

    public final boolean w1() {
        return !zl2.r4.f555483a.J1(S0()) && ((mm2.c1) P0(mm2.c1.class)).f410417t && ((mm2.c1) P0(mm2.c1.class)).f410435w && ((mm2.c1) P0(mm2.c1.class)).f410429v;
    }

    public final boolean x1() {
        ae2.in inVar = ae2.in.f85221a;
        return (w1() || y1()) && (((java.lang.Number) ae2.in.H3.r()).intValue() == 1);
    }

    public final boolean y1() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a.a(S0()) && ((mm2.e0) P0(mm2.e0.class)).P6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d10(this, null), 3, null);
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (c14227x4262fb44 = k0Var.f380917s) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e10(this));
    }

    public final void z1(int i17) {
        if (x0()) {
            return;
        }
        if ((sn0.b.f491497e2 != null) || ((mm2.c1) P0(mm2.c1.class)).O7()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = v1(i17 + c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194014q, "updateAnchorMarginBottom navigationHeight: " + c17);
    }
}
