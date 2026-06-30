package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes9.dex */
public final class lb implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f272000d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.kb f272001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f272002f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f272003g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f272004h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f272005i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f272006m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f272007n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f272008o;

    public lb(android.content.Context context, android.view.View rootView, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.kb callback, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f272000d = rootView;
        this.f272001e = callback;
        this.f272002f = i17;
        this.f272008o = "";
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.plm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f272003g = linearLayout;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.plo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f272004h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.pln);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f272005i = (android.widget.TextView) findViewById3;
        this.f272006m = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.vpb);
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.jb(this, context));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c())) {
            this.f272007n = true;
        }
        rn3.i.Di().k(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    public final int a() {
        int i17 = this.f272002f;
        if (i17 == 10) {
            return 47;
        }
        return i17 == 6 ? 54 : 49;
    }

    public final java.lang.String b() {
        return this.f272004h.getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:16:0x0067, B:18:0x0081, B:19:0x00b0, B:23:0x00f0, B:25:0x00fa, B:26:0x0100, B:31:0x00da, B:34:0x00e4), top: B:15:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.lb.c():java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    public final boolean d() {
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(a()));
        return c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
    }

    public final void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "refresh %s", java.lang.Boolean.valueOf(z17));
        android.widget.TextView textView = this.f272006m;
        android.widget.LinearLayout linearLayout = this.f272003g;
        if (!z17) {
            this.f272007n = false;
            if (linearLayout.getVisibility() == 0) {
                linearLayout.setVisibility(4);
            }
            if (textView == null || textView.getVisibility() != 0) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        java.lang.String c17 = c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            this.f272007n = false;
            linearLayout.setVisibility(8);
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        if (!this.f272007n) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().n(a());
        }
        linearLayout.setVisibility(0);
        this.f272004h.setText(c17);
        if (textView != null) {
            textView.setVisibility(8);
        }
        boolean d17 = d();
        if (this.f272002f == 10) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_username", this.f272008o);
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(d17 ? 1 : 0));
            hashMap.put("log_version", "20260409");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("wechat_keyboard_promote", "view_exp", hashMap, 36465);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "reportWetypeGuideExposure: chat_username=" + this.f272008o + ", is_red_dot=" + hashMap.get("is_red_dot"));
        }
        this.f272001e.b(d17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        int i17 = this.f272002f;
        return i17 == 10 ? "attach_voiceinput_wxkeyboard" : i17 == 6 ? "custom_emoji_wetype" : "fulltext_input_wxkeyboard";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f272000d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        android.widget.TextView textView = this.f272005i;
        if (z17) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(4);
        return true;
    }
}
