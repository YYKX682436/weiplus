package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityResume", "onActivityPause", "Lcom/tencent/mm/ui/MMActivity;", "context", "", "maxLimitLength", "", "placeorderReserves", "Lcom/tencent/mm/plugin/remittance/ui/l7;", "entryScene", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ILjava/lang/String;Lcom/tencent/mm/plugin/remittance/ui/l7;)V", "com/tencent/mm/plugin/remittance/ui/m7", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage */
/* loaded from: classes5.dex */
public final class C17147x9fa5370e implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f239094d;

    /* renamed from: e, reason: collision with root package name */
    public final int f239095e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f239096f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7 f239097g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f239098h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f239099i;

    /* renamed from: m, reason: collision with root package name */
    public int f239100m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f239101n;

    public C17147x9fa5370e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7 entryScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryScene, "entryScene");
        this.f239094d = context;
        this.f239095e = i17;
        this.f239096f = str;
        this.f239097g = entryScene;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(context);
        this.f239099i = f5Var;
        context.mo273xed6858b4().a(this);
        f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k7(this);
    }

    public final void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m7 callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7 l7Var;
        int i17;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f239098h;
        if (z2Var != null) {
            z2Var.B();
        }
        this.f239098h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this.f239094d, 1, 2, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f239098h;
        if (z2Var2 != null) {
            if (fp.h.c(36)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[showDialog] version >= 16");
                z2Var2.A(16);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[showDialog] version < 16");
                z2Var2.A(48);
            }
            if (com.p314xaae8f345.mm.ui.b4.c(this.f239094d)) {
                z2Var2.A(48);
            }
            android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f239094d);
            android.view.View view = z2Var2.f293591g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cee, (android.view.ViewGroup) view, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lwr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
            android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lwq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lws);
            android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lw_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById3;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                c22621x7603e017.setHint(str2);
            }
            z2Var2.f293588d.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r7(z2Var2, this, c22621x7603e017));
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.k(c22699x3dcdb352, i65.a.b(this.f239094d, 20));
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7 l7Var2 = this.f239097g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7 l7Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7.f239340d;
            if (l7Var2 == l7Var3) {
                l7Var = l7Var3;
                i17 = 0;
                linearLayout.setPadding(i65.a.b(this.f239094d, 0), i65.a.b(this.f239094d, 0), i65.a.b(this.f239094d, 6), i65.a.b(this.f239094d, 0));
                z17 = true;
            } else {
                l7Var = l7Var3;
                i17 = 0;
                z17 = false;
            }
            if (z17) {
                c22699x3dcdb352.setVisibility(i17);
                c22699x3dcdb352.setForeground(this.f239094d.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563598ax3));
            } else {
                c22699x3dcdb352.setVisibility(8);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            int length = str != null ? str.length() : 0;
            if (length > this.f239095e) {
                z2Var2.b(false);
                textView.setTextColor(this.f239094d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
                textView.setVisibility(0);
            } else {
                z2Var2.b(true);
                textView.setVisibility(4);
            }
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u7(this, c22621x7603e017, c0Var, h0Var, arrayList));
            java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(this.f239095e)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
            c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v7(textView, this, z2Var2, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), c0Var, arrayList));
            if (!(str == null || str.length() == 0)) {
                c22621x7603e017.setText(str);
                c22621x7603e017.mo81549xf579a34a(str.length());
            }
            z2Var2.j(viewGroup);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            java.lang.String str3 = this.f239101n;
            if (str3 == null || str3.length() == 0) {
                spannableStringBuilder.append((java.lang.CharSequence) this.f239094d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aeq));
            } else {
                spannableStringBuilder.append((java.lang.CharSequence) this.f239101n);
            }
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, 0, null, null), 0, spannableStringBuilder.length(), 18);
            z2Var2.q(spannableStringBuilder);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(z2Var2.C);
            z2Var2.m(this.f239094d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), this.f239094d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w7 w7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w7(callback, h0Var, this, c22621x7603e017, z2Var2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x7 x7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x7(callback, c22621x7603e017, h0Var, this, z2Var2, arrayList);
            z2Var2.D = w7Var;
            z2Var2.E = x7Var;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f239099i;
            if (f5Var != null) {
                f5Var.f();
            }
            z2Var2.C();
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.y7(c22621x7603e017, c22699x3dcdb352);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(y7Var, 50L, false);
            if (this.f239097g == l7Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22750, 1, this.f239096f);
            }
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onActivityPause */
    public final void m68431xf470b888() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f239099i;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onActivityResume */
    public final void m68432x9d4787db() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f239099i;
        if (f5Var != null) {
            f5Var.f();
        }
    }
}
