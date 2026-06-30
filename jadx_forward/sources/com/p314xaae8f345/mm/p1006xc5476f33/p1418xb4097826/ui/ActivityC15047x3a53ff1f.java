package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderModifyNameUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lal5/e0;", "Lck5/e;", "Lzy2/gc;", "Lr45/ri2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI */
/* loaded from: classes8.dex */
public final class ActivityC15047x3a53ff1f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements al5.e0, ck5.e, zy2.gc {
    public static java.lang.String Q = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NICKNAME_MODIFY_WORD_STRING_SYNC, "");
    public static int R = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NICKNAME_MODIFY_LIMIT_LENGTH_INT_SYNC, 20);
    public android.widget.ScrollView A;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public ya2.b2 G;
    public int H;
    public android.app.ProgressDialog I;
    public int L;
    public final p3325xe03a0797.p3326xc267989b.y0 M;
    public java.lang.String N;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qa P;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f210161t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.EditText f210162u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f210163v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f210164w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f210165x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f210166y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f210167z;
    public java.lang.String E = "";
    public final java.lang.String F = "$nickname$";

    /* renamed from: J, reason: collision with root package name */
    public int f210160J = 400;
    public final int K = 12;

    public ActivityC15047x3a53ff1f() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.M = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.N = "";
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qa(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.c7(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI, java.lang.String):void");
    }

    public static /* synthetic */ void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        if ((i17 & 4) != 0) {
            str3 = null;
        }
        activityC15047x3a53ff1f.g7(str, str2, str3);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qa qaVar = this.P;
        if (!z17) {
            android.view.View view = this.f210165x;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edtContainer");
                throw null;
            }
            view.removeOnLayoutChangeListener(qaVar);
            android.widget.Button button = this.f210164w;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            android.widget.Button button2 = this.f210164w;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
                throw null;
            }
            button2.setLayoutParams(layoutParams2);
            android.view.View view2 = this.f210166y;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.height = -1;
            android.view.View view3 = this.f210166y;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                throw null;
            }
            view3.setLayoutParams(layoutParams4);
            android.view.View view4 = this.f210166y;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                throw null;
            }
            view4.requestLayout();
            android.view.View view5 = this.f210166y;
            if (view5 != null) {
                view5.scrollTo(0, 0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
                throw null;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keyboardHeight ");
        sb6.append(i17);
        sb6.append(", inputContainer.height ");
        android.view.View view6 = this.f210166y;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
            throw null;
        }
        sb6.append(view6.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", sb6.toString());
        android.view.View view7 = this.f210165x;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edtContainer");
            throw null;
        }
        view7.addOnLayoutChangeListener(qaVar);
        android.widget.Button button3 = this.f210164w;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = button3.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.bottomMargin = 0;
        android.widget.Button button4 = this.f210164w;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
            throw null;
        }
        button4.setLayoutParams(layoutParams6);
        android.view.View view8 = this.f210166y;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = view8.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams8 = (android.widget.FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.height = this.L - i17;
        android.view.View view9 = this.f210166y;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
            throw null;
        }
        view9.setLayoutParams(layoutParams8);
        android.view.View view10 = this.f210166y;
        if (view10 != null) {
            view10.requestLayout();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
            throw null;
        }
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        android.widget.TextView textView = this.f210163v;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(d7()));
        android.widget.TextView textView2 = this.f210163v;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(d7(), str);
        android.widget.TextView textView = this.f210163v;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(b17));
        android.widget.TextView textView2 = this.f210163v;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        int d76 = (int) (d7() * 0.1f);
        if (d76 < 1) {
            d76 = 1;
        }
        if (b17 <= d76) {
            android.widget.TextView textView3 = this.f210163v;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
                throw null;
            }
            textView3.setVisibility(0);
        } else {
            android.widget.TextView textView4 = this.f210163v;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
                throw null;
            }
            textView4.setVisibility(4);
        }
        android.widget.TextView textView5 = this.C;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
            throw null;
        }
        textView5.setText("");
        android.widget.TextView textView6 = this.C;
        if (textView6 != null) {
            textView6.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
            throw null;
        }
    }

    public final int d7() {
        int i17 = this.H;
        if (i17 == 1) {
            return R;
        }
        if (i17 != 2) {
            return Integer.MAX_VALUE;
        }
        return this.f210160J;
    }

    public final void e7() {
        android.widget.EditText editText = this.f210162u;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        int g17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(r26.n0.u0(editText.getText().toString()).toString());
        android.widget.TextView textView = this.f210163v;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.er7, java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(R / 2)));
        android.widget.TextView textView2 = this.f210163v;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        if (textView2.getVisibility() == 4) {
            android.widget.TextView textView3 = this.f210163v;
            if (textView3 != null) {
                textView3.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
                throw null;
            }
        }
    }

    public final void f7() {
        m92.b j37 = g92.a.j3(g92.b.f351302e, this.N, false, 2, null);
        int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "user extFlag " + i17);
        if (this.H == 1) {
            boolean z17 = (i17 & 2) != 0;
            android.widget.EditText editText = this.f210162u;
            if (editText == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            editText.setEnabled(!z17);
            android.widget.Button button = this.f210164w;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
                throw null;
            }
            button.setEnabled(!z17);
            java.lang.String nickNameModifyWord = Q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nickNameModifyWord, "nickNameModifyWord");
            if (nickNameModifyWord.length() > 0) {
                android.widget.TextView textView = this.D;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyCountTip");
                    throw null;
                }
                textView.setText(Q);
                android.widget.TextView textView2 = this.D;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyCountTip");
                    throw null;
                }
                textView2.setVisibility(0);
            }
            e7();
        }
    }

    public final void g7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "showError " + str);
        java.util.regex.Matcher matcher = zy2.v.f559123a.matcher(str);
        if (matcher.find()) {
            java.lang.String group = matcher.group(1);
            if (group == null) {
                group = "";
            }
            java.lang.String str4 = group;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (matcher.start(0) > 0) {
                java.lang.String substring = str.substring(0, matcher.start(0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                sb6.append(substring);
            }
            sb6.append(str4);
            if (matcher.end(0) < str.length()) {
                java.lang.String substring2 = str.substring(matcher.end(0), str.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                sb6.append(substring2);
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            int start = matcher.start(0);
            int length = str4.length() + start;
            android.text.SpannableString spannableString = new android.text.SpannableString(sb7);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str4, mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77841x66d62781), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.db(str2, str3), 16, null), start, length, 17);
            android.widget.TextView textView = this.C;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
                throw null;
            }
            textView.setText(spannableString);
            android.widget.TextView textView2 = this.C;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
                throw null;
            }
            textView2.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c8(spannableString, textView2));
        } else {
            android.widget.TextView textView3 = this.C;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
                throw null;
            }
            textView3.setText(str);
        }
        android.widget.TextView textView4 = this.C;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topErrorTip");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566411ft1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210165x = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f566057ei1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210166y = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f566412ft2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f210161t = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ec8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f210162u = (android.widget.EditText) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ec_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f210163v = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.d9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f210167z = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f566410ft0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f210164w = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.jps);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.mc9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.A = (android.widget.ScrollView) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.hdq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.B = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d) findViewById10;
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.ofn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById11;
        android.widget.Button button = this.f210164w;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("modifyBtn");
            throw null;
        }
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sa(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xa(this, f0Var, h0Var);
        android.widget.EditText editText = this.f210162u;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        editText.addTextChangedListener(xaVar);
        android.widget.EditText editText2 = this.f210162u;
        if (editText2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        editText2.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ta(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ua(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d c22606xbb21161d = this.B;
        if (c22606xbb21161d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputPanel");
            throw null;
        }
        c22606xbb21161d.m81272xb3968e21(this);
        int i17 = this.H;
        if (i17 == 1) {
            android.widget.EditText editText3 = this.f210162u;
            if (editText3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            editText3.setMaxLines(2);
            android.widget.EditText editText4 = this.f210162u;
            if (editText4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ya2.b2 b2Var = this.G;
            java.lang.String w07 = b2Var != null ? b2Var.w0() : null;
            ((ke0.e) xVar).getClass();
            editText4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, w07));
            android.widget.TextView textView = this.f210161t;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eop));
            android.widget.EditText editText5 = this.f210162u;
            if (editText5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            editText5.setHint(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eop));
        } else if (i17 == 2) {
            android.widget.TextView textView2 = this.f210161t;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eoq));
            android.widget.EditText editText6 = this.f210162u;
            if (editText6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            editText6.setHint(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eoq));
            android.widget.EditText editText7 = this.f210162u;
            if (editText7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            editText7.setMaxLines(5);
            android.widget.EditText editText8 = this.f210162u;
            if (editText8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                throw null;
            }
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            ya2.b2 b2Var2 = this.G;
            java.lang.String str = b2Var2 != null ? b2Var2.f69341xda9bc3b3 : null;
            ((ke0.e) xVar2).getClass();
            editText8.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471792, str));
        }
        f7();
        android.widget.EditText editText9 = this.f210162u;
        if (editText9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        editText9.requestFocus();
        android.view.View view = this.f210166y;
        if (view != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.va(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputContainer");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        r45.gb4 gb4Var;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 20001) {
            mo26063x7b383410();
            if (intent == null || i18 != -1) {
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_select_contact");
            if (byteArrayExtra != null) {
                try {
                    gb4Var = new r45.gb4();
                    gb4Var.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderModifyNameUI", "onActivityResult LocalFinderAtContact parseFrom:%s", e17.getMessage());
                }
                if (gb4Var != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gb4Var.m75945x2fec8307(2))) {
                }
                android.widget.EditText editText = this.f210162u;
                if (editText == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
                int selectionEnd = editText.getSelectionEnd();
                android.widget.EditText editText2 = this.f210162u;
                if (editText2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
                java.lang.String obj = editText2.getText().toString();
                if (this.H == 2) {
                    android.widget.EditText editText3 = this.f210162u;
                    if (editText3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                        throw null;
                    }
                    int selectionEnd2 = editText3.getSelectionEnd();
                    if (selectionEnd2 > 0) {
                        int i19 = selectionEnd2 - 1;
                        boolean z17 = true;
                        while (i19 >= 0 && z17) {
                            android.widget.EditText editText4 = this.f210162u;
                            if (editText4 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                                throw null;
                            }
                            if (editText4.getText().toString().charAt(i19) == '@') {
                                i19--;
                            } else {
                                z17 = false;
                            }
                        }
                        selectionEnd = i19 + 1;
                        if (selectionEnd > obj.length()) {
                            selectionEnd = obj.length();
                        }
                        java.lang.String substring = obj.substring(0, selectionEnd);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        java.lang.String substring2 = obj.substring(selectionEnd2, obj.length());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        obj = substring.concat(substring2);
                    }
                }
                if (selectionEnd > obj.length()) {
                    selectionEnd = obj.length();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String substring3 = obj.substring(0, selectionEnd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                sb6.append(substring3);
                sb6.append('@');
                sb6.append(gb4Var.m75945x2fec8307(2));
                sb6.append(' ');
                java.lang.String substring4 = obj.substring(selectionEnd, obj.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                sb6.append(substring4);
                java.lang.String sb7 = sb6.toString();
                java.lang.String m75945x2fec8307 = gb4Var.m75945x2fec8307(2);
                int length = selectionEnd + (m75945x2fec8307 != null ? m75945x2fec8307.length() : 0) + 2;
                android.widget.EditText editText5 = this.f210162u;
                if (editText5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
                editText5.setText(sb7);
                android.widget.EditText editText6 = this.f210162u;
                if (editText6 != null) {
                    editText6.setSelection(length);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
            }
            gb4Var = null;
            if (gb4Var != null) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.N = stringExtra;
        if (stringExtra.length() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            this.N = xy2.c.e(mo55332x76847179);
        }
        this.G = ya2.h.f542017a.b(this.N);
        this.H = getIntent().getIntExtra("key_scene", 0);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        p3325xe03a0797.p3326xc267989b.l.d(this.M, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pa(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // zy2.gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r5(java.lang.Object r14, r45.ix0 r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.r5(java.lang.Object, r45.ix0):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(d92.f1.class);
        set.add(dv2.c0.class);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        android.widget.TextView textView = this.f210163v;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView.setText("0");
        android.widget.TextView textView2 = this.f210163v;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f210163v;
        if (textView3 != null) {
            textView3.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editLimit");
            throw null;
        }
    }
}
