package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class q50 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 A1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40 B1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f201029J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.view.View Q;
    public android.view.View R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.view.View U;
    public android.widget.TextView V;
    public android.widget.TextView W;
    public android.view.View X;
    public android.widget.TextView Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 f201030l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f201031p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40 f201032p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f201033x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f201034x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f201035y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.re2 f201036y1;

    /* renamed from: z1, reason: collision with root package name */
    public r45.re2 f201037z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.H = store;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200784f;
        this.f201030l1 = o40Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40 m40Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40.f200569f;
        this.f201032p1 = m40Var;
        this.f201037z1 = new r45.re2();
        this.A1 = o40Var;
        this.B1 = m40Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570371er0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        boolean d17 = g0().d();
        android.content.Context context = this.f199716e;
        if (d17) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.noc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oou);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        d0();
        this.f201029J = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9_);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6e);
        this.L = rootView.findViewById(com.p314xaae8f345.mm.R.id.t6d);
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.soc);
        this.N = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9e);
        this.P = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565699t71);
        this.R = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9c);
        this.S = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6q);
        this.U = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9a);
        this.V = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6i);
        this.X = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9b);
        this.Y = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6l);
        this.T = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6r);
        this.W = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6j);
        this.Z = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.t6m);
        this.f201035y0 = rootView.findViewById(com.p314xaae8f345.mm.R.id.u9n);
        this.Q = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565698t70);
        this.f201031p0 = rootView.findViewById(com.p314xaae8f345.mm.R.id.t6k);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.kpi);
        this.f201033x0 = textView;
        if (textView != null) {
            ne2.c.f418060a.c(textView);
        }
        android.view.View G = G();
        if (G == null) {
            return;
        }
        G.setEnabled(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[confirmBtn-click] currentMode:");
        sb6.append(this.A1);
        sb6.append(", isChargeLive:");
        sb6.append(g0().d());
        sb6.append(", deltaVisibleList:");
        r45.re2 re2Var = this.f201036y1;
        if (re2Var == null || (obj = pm0.b0.g(re2Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", sb6.toString());
        if (this.A1 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200786h && h0()) {
            j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200784f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "[confirmBtn-click] current invisible list is empty, reset to public mode");
        }
        if (this.B1 != this.f201032p1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408874i);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p40(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        android.view.View view;
        super.V(e0Var, z17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40 m40Var = g0().f() ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40.f200570g : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40.f200569f;
        this.f201032p1 = m40Var;
        this.B1 = m40Var;
        j0(m40Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m40.f200569f ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200784f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var = (g0().d() || g0().f()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g : pm0.v.z(g0().f411114e, 64) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200786h : g0().e() ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200784f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40.f200785g;
        this.f201030l1 = o40Var;
        j0(o40Var);
        if (this.f201034x1 && (view = this.f201029J) != null) {
            view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q40(this), 300L);
        }
        df2.o f07 = f0();
        if ((f07 != null ? f07.f312437u : null) != r45.f07.VisibilityModeOptionStatus_Hide) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408872g);
        }
    }

    public final java.lang.Object e0(r45.hx0 hx0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.H;
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) c14197x319b1b9e.m56796xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) c14197x319b1b9e.m56796xbba4bfc0(mm2.e1.class)).f410516m, 23, hx0Var);
        az2.j.u(r1Var, this.f199716e, null, 0L, 6, null);
        return rm0.h.b(r1Var, interfaceC29045xdcb5ca57);
    }

    public final df2.o f0() {
        return (df2.o) this.H.m56798x25fe639c(df2.o.class);
    }

    public final mm2.y6 g0() {
        return (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) this.H.m56796xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb();
    }

    public final boolean h0() {
        return this.f201037z1.m75941xfb821914(1).isEmpty() && this.f201037z1.m75941xfb821914(0).isEmpty() && this.f201037z1.m75941xfb821914(4).isEmpty() && this.f201037z1.m75941xfb821914(3).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017d, code lost:
    
        if (h0() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
    
        if (r29.f201030l1 != r11) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01eb, code lost:
    
        if ((r4 == null || r4.isEmpty()) == false) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50.i0():void");
    }

    public final void j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o40 o40Var) {
        r45.re2 re2Var;
        this.A1 = o40Var;
        r45.re2 re2Var2 = new r45.re2();
        this.f201037z1 = re2Var2;
        if (this.A1 == this.f201030l1) {
            if (g0().d()) {
                r45.hn1 hn1Var = g0().f411120k;
                re2Var = hn1Var != null ? (r45.re2) hn1Var.m75936x14adae67(2) : null;
            } else {
                re2Var = g0().f411123n;
            }
            if (re2Var != null) {
                re2Var2.m75941xfb821914(4).addAll(re2Var.m75941xfb821914(4));
                re2Var2.m75941xfb821914(1).addAll(re2Var.m75941xfb821914(1));
                re2Var2.m75941xfb821914(2).addAll(re2Var.m75941xfb821914(2));
                re2Var2.m75941xfb821914(3).addAll(re2Var.m75941xfb821914(3));
                re2Var2.m75941xfb821914(0).addAll(re2Var.m75941xfb821914(0));
            }
        }
        this.f201036y1 = null;
        i0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb));
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.widget.TextView x17 = x();
        x17.setText(x17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573262m94));
        x17.setTextSize(17.0f);
        int b17 = i65.a.b(x17.getContext(), 12);
        x17.setPadding(b17, 0, b17, 0);
        x17.setTextColor(x17.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
        x17.setBackgroundDrawable(x17.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo));
        x17.setMinWidth((int) x17.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        x17.setMinHeight((int) x17.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        x17.setGravity(17);
        this.I = x17;
        return x17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
