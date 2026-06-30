package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class cf extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final android.app.Activity H;
    public final gk2.e I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f199536J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.widget.EditText Q;
    public android.widget.TextView R;
    public android.view.View S;
    public boolean T;
    public java.lang.String U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(android.app.Activity activity, gk2.e eVar) {
        super(activity, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.H = activity;
        this.I = eVar;
        this.U = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aqa;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View root) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.K = root;
        this.L = root.findViewById(com.p314xaae8f345.mm.R.id.cgs);
        this.M = root.findViewById(com.p314xaae8f345.mm.R.id.dqn);
        this.N = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.dso);
        this.P = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.dsl);
        this.Q = (android.widget.EditText) root.findViewById(com.p314xaae8f345.mm.R.id.k3n);
        this.R = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.c_x);
        this.S = root.findViewById(com.p314xaae8f345.mm.R.id.jpu);
        zl2.r4.f555483a.Z2(this.Q, null, 6, 3, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xe(this));
        android.widget.EditText editText = this.Q;
        if (editText != null) {
            editText.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ye(this, editText));
        }
        android.view.View view = this.M;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ze(this));
        }
        android.widget.TextView textView = this.R;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.af(this));
        }
        android.widget.TextView textView2 = this.N;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.bk.q0(textView2.getPaint());
        }
        android.widget.EditText editText2 = this.Q;
        if (editText2 != null) {
            com.p314xaae8f345.mm.ui.bk.q0(editText2.getPaint());
        }
        android.widget.TextView textView3 = this.R;
        if (textView3 != null) {
            com.p314xaae8f345.mm.ui.bk.q0(textView3.getPaint());
        }
        android.widget.EditText editText3 = this.Q;
        java.lang.String valueOf = java.lang.String.valueOf(editText3 != null ? editText3.getHint() : null);
        this.U = valueOf;
        g0(!(valueOf.length() == 0));
        android.widget.TextView textView4 = this.P;
        if (textView4 != null) {
            java.lang.CharSequence text = textView4.getText();
            android.content.Context context = this.f199716e;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dde);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
            int L = r26.n0.L(text, string, 0, false, 6, null);
            int length = string.length() + L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bf bfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bf(this);
            android.text.SpannableString spannableString = new android.text.SpannableString(text);
            spannableString.setSpan(bfVar, L, length, 33);
            textView4.setText(spannableString);
            textView4.setHighlightColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (this.H.getResources().getConfiguration().orientation == 2) {
            android.view.View view2 = this.S;
            layoutParams = view2 != null ? view2.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            return;
        }
        android.widget.TextView textView5 = this.R;
        layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.p314xaae8f345.mm.ui.dl.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public final void e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        android.content.Context context;
        android.widget.EditText editText = this.Q;
        if (editText != null) {
            editText.clearFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        if (this.T) {
            gk2.e eVar = this.I;
            if (eVar != null && (c14227x4262fb44 = ((mm2.s2) eVar.a(mm2.s2.class)).f410937f) != null) {
                c14227x4262fb44.mo7808x76db6cb1(new mm2.q2(true, 0, 2, null));
            }
            this.T = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r1.a8() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "2"
            dk2.ef r1 = dk2.ef.f314905a
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r1.i(r2)
            mm2.c1 r1 = (mm2.c1) r1
            if (r1 == 0) goto L1f
            boolean r1 = r1.a8()
            r2 = 1
            if (r1 != r2) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            r1 = 0
            java.lang.Class<ml2.j0> r3 = ml2.j0.class
            if (r2 == 0) goto L31
            i95.m r2 = i95.n0.c(r3)
            ml2.j0 r2 = (ml2.j0) r2
            ml2.z4 r3 = ml2.z4.Q
            r2.yj(r3, r0, r1)
            goto L3e
        L31:
            i95.m r2 = i95.n0.c(r3)
            ml2.j0 r2 = (ml2.j0) r2
            ml2.c1 r3 = ml2.c1.f408858e
            r3 = 27
            r2.hj(r3, r0, r1)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf.f0():void");
    }

    public final void g0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansBuildWidget", "updateConfirmBtn canConfirm:" + z17);
        android.widget.TextView textView = this.R;
        if (textView == null) {
            return;
        }
        textView.setEnabled(z17);
    }
}
