package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class nb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ta W = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ta(null);
    public mm2.n0 H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f200707J;
    public android.widget.ImageView K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb S;
    public p3325xe03a0797.p3326xc267989b.r2 T;
    public android.view.View U;
    public yz5.a V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "initContentView");
        this.U = rootView;
        android.content.Context context = this.f199716e;
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.ah8);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.suj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565306su4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f200707J = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.suh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.suf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.L = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.su6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.M = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.su8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.N = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sub);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.P = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565307su5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sug);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.R = (android.widget.TextView) findViewById9;
        android.widget.TextView textView = this.I;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.onx);
        android.widget.TextView textView2 = this.I;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.Q;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endBtn");
            throw null;
        }
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.eb(this));
        android.widget.TextView textView4 = this.R;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("learnMoreBtn");
            throw null;
        }
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fb(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb sbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb(context);
        this.S = sbVar;
        sbVar.f201281f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gb(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.P;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.P;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb sbVar2 = this.S;
        if (sbVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostAdapter");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(sbVar2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.P;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        c1163xf1deaba43.setOverScrollMode(2);
        e0();
        mm2.n0 n0Var = this.H;
        if (n0Var != null && (y0Var = this.E) != null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.T;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            c0Var.f391645d = n0Var.O6();
            this.T = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ib(n0Var, this, c0Var, null), 3, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            if (d3Var != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).wi(context, re2.j1.f475972c);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "enableScreenShotListener: registered, context=".concat(context.getClass().getSimpleName()));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.CoLiveTaskManager", th6, "enableScreenShotListener failed", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        android.content.Context context = this.f199716e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            if (d3Var != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).Bi(context, re2.j1.f475972c);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "disableScreenShotListener: unregistered, context=".concat(context.getClass().getSimpleName()));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.CoLiveTaskManager", th6, "disableScreenShotListener failed", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        android.view.Window b17;
        super.V(e0Var, z17, i17);
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.B;
            if (y1Var == null || (b17 = y1Var.b()) == null) {
                android.view.View view = this.U;
                if (view != null) {
                    view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ua(this, view));
                }
            } else {
                b17.addFlags(8192);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveCoLiveInvitorPreparePanel", th6, "applySecureFlag failed", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb.e0():void");
    }
}
