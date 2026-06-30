package vi1;

/* loaded from: classes7.dex */
public final class z3 implements fl1.b2, si1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f519050d;

    /* renamed from: e, reason: collision with root package name */
    public final xi1.g f519051e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f519052f;

    /* renamed from: g, reason: collision with root package name */
    public final vi1.j2 f519053g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 f519054h;

    /* renamed from: i, reason: collision with root package name */
    public final vi1.f0 f519055i;

    /* renamed from: m, reason: collision with root package name */
    public fl1.g2 f519056m;

    /* renamed from: n, reason: collision with root package name */
    public final int f519057n;

    /* renamed from: o, reason: collision with root package name */
    public int f519058o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f519059p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f519060q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb f519061r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f519062s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f519063t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f519064u;

    /* renamed from: v, reason: collision with root package name */
    public vi1.p3 f519065v;

    public z3(android.content.Context context, int i17, xi1.g windowAndroid, java.lang.String appId, vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem, vi1.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        this.f519050d = context;
        this.f519051e = windowAndroid;
        this.f519052f = appId;
        this.f519053g = j2Var;
        this.f519054h = phoneItem;
        this.f519055i = f0Var;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        a17 = a17 < i17 ? i17 : a17;
        this.f519057n = a17;
        this.f519058o = s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "candidateMinHeight:%d", java.lang.Integer.valueOf(i17));
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569597fv, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f519059p = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f519060q = frameLayout;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb) findViewById2;
        this.f519061r = c12811x748ecb;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f519062s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f519063t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f519064u = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a0p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        ((android.widget.ImageView) findViewById6).setOnClickListener(new vi1.l3(this));
        frameLayout.setMinimumHeight(a17);
        frameLayout.addOnLayoutChangeListener(new vi1.n3(this));
        c12811x748ecb.m53696xfc227346(new vi1.o3(this));
    }

    public static final void c(vi1.z3 z3Var, int i17) {
        z3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processSendSmsResp:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "startSmsListener");
            vi1.p3 p3Var = z3Var.f519065v;
            if (p3Var != null) {
                p3Var.cancel();
            } else {
                z3Var.f519065v = new vi1.p3(z3Var, 60000L, 1000L);
            }
            vi1.p3 p3Var2 = z3Var.f519065v;
            if (p3Var2 != null) {
                p3Var2.start();
                return;
            }
            return;
        }
        android.content.Context context = z3Var.f519050d;
        if (i17 == 1) {
            z3Var.x();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z3Var.u(string);
            return;
        }
        if (i17 == 2) {
            z3Var.x();
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            z3Var.u(string2);
            return;
        }
        z3Var.x();
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        z3Var.u(string3);
    }

    public static final void e(vi1.z3 z3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        z3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processVerifyCodeResp:%d", java.lang.Integer.valueOf(i17));
        vi1.j2 j2Var = z3Var.f519053g;
        boolean z17 = true;
        if (i17 == 0) {
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518909y);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                j2Var.f518909y = valueOf.longValue() + 1;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errMsg", "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("encryptedData", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("iv", str2);
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("cloud_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str4);
            vi1.f0 f0Var = z3Var.f519055i;
            if (f0Var != null) {
                ((cb1.g0) f0Var).a(true, hashMap);
            }
            z3Var.dismiss();
            return;
        }
        android.content.Context context = z3Var.f519050d;
        if (i17 == 1) {
            z3Var.x();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z3Var.u(string);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f518910z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
            j2Var.f518910z = valueOf2.longValue() + 1;
            return;
        }
        if (i17 != 3 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            z3Var.x();
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            z3Var.u(string2);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f518910z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf3);
            j2Var.f518910z = valueOf3.longValue() + 1;
            return;
        }
        z3Var.x();
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571684mc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        z3Var.u(string3);
        if (j2Var == null) {
            return;
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(j2Var.f518910z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf4);
        j2Var.f518910z = valueOf4.longValue() + 1;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f519056m;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f519059p;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final void k() {
        java.lang.Object systemService = this.f519050d.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f345325a;
            android.content.Context context = this.f519059p.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i2Var.a(context, this.f519059p, null, windowManager.getDefaultDisplay().getRotation(), this.f519051e, false);
        }
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f519059p);
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        i(component).c(this);
        w();
    }

    public final int s() {
        int i17 = (int) (r0.getResources().getDisplayMetrics().heightPixels * (2 == this.f519050d.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "calculateMaxHeight, maxHeight: " + i17);
        return i17;
    }

    public final void t() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.content.Context context = this.f519050d;
        spannableStringBuilder.append((java.lang.CharSequence) context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571678m6));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new vi1.q3(this), 0, length, 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5)), 0, length, 17);
        android.widget.TextView textView = this.f519062s;
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void u(java.lang.String str) {
        this.f519061r.m53697x765074af("");
        android.widget.TextView textView = this.f519064u;
        textView.setText(str);
        textView.setTextColor(this.f519050d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        t();
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f519056m = g2Var;
        k();
    }

    public final void w() {
        this.f519061r.m53697x765074af("");
        android.content.Context context = this.f519050d;
        java.lang.CharSequence text = context.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571868s4);
        android.widget.TextView textView = this.f519064u;
        textView.setText(text);
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = this.f519054h;
        this.f519063t.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571685md, c12542x3a17e581.f168933e));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3u), true, null);
        boolean z17 = c12542x3a17e581.f168939n;
        java.lang.String appId = this.f519052f;
        if (z17) {
            java.lang.String mobile = c12542x3a17e581.f168932d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            vi1.s3 s3Var = new vi1.s3(this, c17);
            r45.xz5 xz5Var = new r45.xz5();
            xz5Var.f472164d = appId;
            xz5Var.f472165e = mobile;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", appId, xz5Var, r45.yz5.class).n(new vi1.p(s3Var))).s(new vi1.q(s3Var));
            return;
        }
        java.lang.String mobile2 = c12542x3a17e581.f168932d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile2, "mobile");
        vi1.u3 u3Var = new vi1.u3(this, c17);
        r45.xz5 xz5Var2 = new r45.xz5();
        xz5Var2.f472164d = appId;
        xz5Var2.f472165e = mobile2;
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", appId, xz5Var2, r45.yz5.class).n(new vi1.n(u3Var))).s(new vi1.o(u3Var));
    }

    public final void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "stopSmsListener");
        vi1.p3 p3Var = this.f519065v;
        if (p3Var != null) {
            p3Var.cancel();
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        k();
        this.f519058o = s();
    }
}
