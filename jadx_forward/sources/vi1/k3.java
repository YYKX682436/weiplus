package vi1;

/* loaded from: classes7.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518917a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f518918b;

    /* renamed from: c, reason: collision with root package name */
    public final vi1.j2 f518919c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 f518920d;

    /* renamed from: e, reason: collision with root package name */
    public final vi1.f0 f518921e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f518922f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EditText f518923g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f518924h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f518925i;

    /* renamed from: j, reason: collision with root package name */
    public vi1.m2 f518926j;

    /* renamed from: k, reason: collision with root package name */
    public final int f518927k;

    /* renamed from: l, reason: collision with root package name */
    public final int f518928l;

    public k3(android.content.Context context, java.lang.String appId, vi1.j2 j2Var, java.lang.String ext_desc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem, vi1.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext_desc, "ext_desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        this.f518917a = context;
        this.f518918b = appId;
        this.f518919c = j2Var;
        this.f518920d = phoneItem;
        this.f518921e = f0Var;
        this.f518927k = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        this.f518928l = 1000;
        java.lang.Object systemService = context.getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569643hf, (android.view.ViewGroup) null);
        this.f518922f = inflate;
        this.f518923g = inflate != null ? (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.a0u) : null;
        this.f518925i = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a0v) : null;
        this.f518924h = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a08) : null;
    }

    public static final void a(vi1.k3 k3Var, java.lang.String str) {
        k3Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str);
        vi1.f0 f0Var = k3Var.f518921e;
        if (f0Var != null) {
            ((cb1.g0) f0Var).a(false, hashMap);
        }
    }

    public static final void b(vi1.k3 k3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleCheckVerifyCodeStatus:%d", java.lang.Integer.valueOf(i17));
        vi1.j2 j2Var = k3Var.f518919c;
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
            vi1.f0 f0Var = k3Var.f518921e;
            if (f0Var != null) {
                ((cb1.g0) f0Var).a(true, hashMap);
                return;
            }
            return;
        }
        android.content.Context context = k3Var.f518917a;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            k3Var.f(string);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f518910z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
            j2Var.f518910z = valueOf2.longValue() + 1;
            return;
        }
        if (i17 == 3 || i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m1.b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_), "", false, new vi1.a3(k3Var));
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f518910z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf3);
            j2Var.f518910z = valueOf3.longValue() + 1;
            return;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571684mc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        k3Var.f(string2);
        if (j2Var == null) {
            return;
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(j2Var.f518910z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf4);
        j2Var.f518910z = valueOf4.longValue() + 1;
    }

    public static final void c(vi1.k3 k3Var, int i17) {
        k3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleSendVerifyCodeStatus:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "startSmsListener");
            vi1.m2 m2Var = k3Var.f518926j;
            if (m2Var != null) {
                m2Var.cancel();
            } else {
                k3Var.f518926j = new vi1.m2(k3Var, k3Var.f518927k, k3Var.f518928l);
            }
            vi1.m2 m2Var2 = k3Var.f518926j;
            if (m2Var2 != null) {
                m2Var2.start();
                return;
            }
            return;
        }
        android.content.Context context = k3Var.f518917a;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            k3Var.f(string);
        } else if (i17 == 2) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            k3Var.f(string2);
        } else {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            k3Var.f(string3);
        }
    }

    public static final void d(vi1.k3 k3Var) {
        android.widget.EditText editText = k3Var.f518923g;
        if (editText != null) {
            editText.setText("");
        }
        android.content.Context context = k3Var.f518917a;
        android.widget.TextView textView = k3Var.f518925i;
        if (textView != null) {
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571685md, k3Var.f518920d.f168933e));
        }
        k3Var.h();
        android.view.View view = k3Var.f518922f;
        if (view != null && (view.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(view);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571688mg);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.D(view, -1);
        j0Var.setOnDismissListener(new vi1.e3(k3Var));
        j0Var.A(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4f), false, new vi1.h3(k3Var));
        j0Var.w(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4j), true, new vi1.i3(k3Var));
        j0Var.show();
        if (view != null) {
            view.post(new vi1.d3(k3Var));
        }
    }

    public final void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "doSendVerifyCode");
        android.content.Context context = this.f518917a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3u), true, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = this.f518920d;
        boolean z18 = c12542x3a17e581.f168939n;
        java.lang.String appId = this.f518918b;
        if (z18) {
            java.lang.String mobile = c12542x3a17e581.f168932d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            vi1.p2 p2Var = new vi1.p2(c17, this, z17);
            r45.xz5 xz5Var = new r45.xz5();
            xz5Var.f472164d = appId;
            xz5Var.f472165e = mobile;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", appId, xz5Var, r45.yz5.class).n(new vi1.p(p2Var))).s(new vi1.q(p2Var));
            return;
        }
        java.lang.String mobile2 = c12542x3a17e581.f168932d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile2, "mobile");
        vi1.t2 t2Var = new vi1.t2(this, c17, z17);
        r45.xz5 xz5Var2 = new r45.xz5();
        xz5Var2.f472164d = appId;
        xz5Var2.f472165e = mobile2;
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", appId, xz5Var2, r45.yz5.class).n(new vi1.n(t2Var))).s(new vi1.o(t2Var));
    }

    public final void f(java.lang.String str) {
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m1.b(this.f518917a, str, "", false, new vi1.c3(this));
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "stopSmsListener");
        vi1.m2 m2Var = this.f518926j;
        if (m2Var != null) {
            m2Var.cancel();
        }
    }

    public final void h() {
        android.content.Context context = this.f518917a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571675m3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571678m6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.append((java.lang.CharSequence) string2);
        int length = string.length();
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new vi1.j3(this), length, length2, 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5)), length, length2, 17);
        android.widget.TextView textView = this.f518924h;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
