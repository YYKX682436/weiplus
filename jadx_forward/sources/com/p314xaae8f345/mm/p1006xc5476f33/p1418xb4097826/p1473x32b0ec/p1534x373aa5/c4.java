package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class c4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public android.view.View H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f197758J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 K;
    public android.widget.TextView L;
    public int M;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 N;
    public yz5.q P;
    public yz5.l Q;
    public android.view.View R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.M = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aq7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        android.text.TextPaint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.H = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566476g10);
        this.I = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.eco);
        this.f197758J = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.R = rootView.findViewById(com.p314xaae8f345.mm.R.id.ljs);
        android.widget.TextView textView = this.f197758J;
        if (textView != null) {
            dq4.c.f323902a.f(textView);
        }
        android.widget.TextView textView2 = this.I;
        if (textView2 != null) {
            dq4.c.f323902a.f(textView2);
        }
        android.view.View view = this.H;
        if (view != null) {
            dq4.c.f323902a.f(view);
        }
        android.widget.TextView textView3 = this.f197758J;
        if (textView3 != null && (paint = textView3.getPaint()) != null) {
            com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        }
        this.K = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) rootView.findViewById(com.p314xaae8f345.mm.R.id.ecr);
        this.L = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.ecs);
        android.view.View view2 = this.H;
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.z3(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.K;
        if (c22621x7603e017 != null) {
            c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a4(this));
        }
        g0();
        e0();
        android.content.Context context = this.f199716e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        this.N = f5Var;
        f5Var.f291933e = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
    }

    public final void e0() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.K;
        java.lang.String valueOf = java.lang.String.valueOf(c22621x7603e017 != null ? c22621x7603e017.getText() : null);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf);
        android.content.Context context = this.f199716e;
        if (K0) {
            android.widget.TextView textView = this.I;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            android.widget.TextView textView2 = this.I;
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
            }
            android.widget.TextView textView3 = this.I;
            if (textView3 != null) {
                textView3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a7o);
                return;
            }
            return;
        }
        android.widget.TextView textView4 = this.I;
        if (textView4 != null) {
            textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y3(this, valueOf));
        }
        android.widget.TextView textView5 = this.I;
        if (textView5 != null) {
            textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        android.widget.TextView textView6 = this.I;
        if (textView6 != null) {
            textView6.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a7j);
        }
    }

    public final void f0() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.N;
        if (f5Var != null) {
            f5Var.d();
        }
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.K;
        if (c22621x7603e017 != null) {
            inputMethodManager.hideSoftInputFromWindow(c22621x7603e017.getWindowToken(), 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r26.i0.y("", "https", true) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0() {
        /*
            r7 = this;
            android.widget.TextView r0 = r7.L
            android.content.Context r1 = r7.f199716e
            if (r0 == 0) goto L14
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131099999(0x7f06015f, float:1.7812367E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L14:
            android.widget.TextView r0 = r7.L
            r2 = 0
            if (r0 == 0) goto L1c
            r0.setOnClickListener(r2)
        L1c:
            java.lang.String r0 = ""
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r4 = 4
            if (r3 != 0) goto L8d
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r5 = 0
            if (r3 != 0) goto L3e
            java.lang.String r3 = "http"
            r6 = 1
            boolean r3 = r26.i0.y(r0, r3, r6)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "https"
            boolean r3 = r26.i0.y(r0, r3, r6)
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            r6 = r5
        L3f:
            if (r6 != 0) goto L42
            goto L8d
        L42:
            com.tencent.mm.ui.widget.MMEditText r3 = r7.K
            if (r3 == 0) goto L4b
            android.text.Editable r3 = r3.getText()
            goto L4c
        L4b:
            r3 = r2
        L4c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r0)
            if (r3 == 0) goto L66
            android.widget.TextView r0 = r7.L
            if (r0 != 0) goto L5b
            goto L5e
        L5b:
            r0.setVisibility(r4)
        L5e:
            android.widget.TextView r0 = r7.L
            if (r0 == 0) goto L9c
            r0.setOnClickListener(r2)
            goto L9c
        L66:
            android.widget.TextView r2 = r7.L
            if (r2 != 0) goto L6b
            goto L6e
        L6b:
            r2.setVisibility(r5)
        L6e:
            android.widget.TextView r2 = r7.L
            if (r2 == 0) goto L80
            r3 = 2131765699(0x7f1029c3, float:1.9162567E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            java.lang.String r1 = r1.getString(r3, r4)
            r2.setText(r1)
        L80:
            android.widget.TextView r1 = r7.L
            if (r1 == 0) goto L9c
            com.tencent.mm.plugin.finder.live.view.b4 r2 = new com.tencent.mm.plugin.finder.live.view.b4
            r2.<init>(r7, r0)
            r1.setOnClickListener(r2)
            goto L9c
        L8d:
            android.widget.TextView r0 = r7.L
            if (r0 != 0) goto L92
            goto L95
        L92:
            r0.setVisibility(r4)
        L95:
            android.widget.TextView r0 = r7.L
            if (r0 == 0) goto L9c
            r0.setOnClickListener(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4.g0():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
    }
}
