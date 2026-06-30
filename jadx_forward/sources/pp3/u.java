package pp3;

/* loaded from: classes5.dex */
public final class u extends p012xc85e97e9.p016x746ad0e3.app.i0 implements sr.k, xg3.d0 {

    /* renamed from: s, reason: collision with root package name */
    public static pp3.u f439031s;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f439032f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439033g;

    /* renamed from: h, reason: collision with root package name */
    public final int f439034h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 f439035i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f439036m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f439037n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f439038o;

    /* renamed from: p, reason: collision with root package name */
    public final pp3.m f439039p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f439040q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f439041r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context dialogContext) {
        super(dialogContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f575977nd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogContext, "dialogContext");
        this.f439032f = dialogContext;
        this.f439033g = "MicroMsg.Pat.PatSuffixSettingDialog";
        this.f439034h = 20;
        this.f439039p = new pp3.m(this);
        this.f439041r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new pp3.n(this), false);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f439035i;
        if (c10449x84ee1171 != null) {
            c10449x84ee1171.setVisibility(4);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11712 = this.f439035i;
        if (c10449x84ee11712 != null) {
            c10449x84ee11712.f146478q = null;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c10449x84ee11712.f146471g;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.l();
                c10449x84ee11712.f146471g.a();
            }
        }
        mo158845x36654fab();
        super.dismiss();
    }

    @Override // sr.k
    /* renamed from: hideVKB */
    public void mo158845x36654fab() {
        java.lang.Object systemService = this.f439032f.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = this.f439037n;
        inputMethodManager.hideSoftInputFromWindow(c22618x59d05a04 != null ? c22618x59d05a04.getWindowToken() : null, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f439032f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8x, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f439035i = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171) findViewById(com.p314xaae8f345.mm.R.id.hde);
        this.f439037n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.kpy);
        this.f439038o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kpz);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2).setOnTouchListener(new pp3.o(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new pp3.p(this));
        setCancelable(true);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.kpy);
        if (editText != null) {
            editText.requestFocus();
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        pp3.q qVar = new pp3.q(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qVar, 128L, false);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.khs);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pp3.r(this));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 == null) {
            str2 = "";
        }
        this.f439036m = str2;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439033g, "curSuffix %s, suffixVersion %d", this.f439036m, java.lang.Integer.valueOf(r17));
        if (r17 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() && (str = this.f439036m) != null) {
            this.f439036m = "的".concat(str);
        }
        java.lang.String str3 = this.f439036m;
        if (str3 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = this.f439037n;
            if (c22618x59d05a04 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f439032f;
                ((ke0.e) xVar).getClass();
                c22618x59d05a04.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a042 = this.f439037n;
            if (c22618x59d05a042 != null) {
                c22618x59d05a042.mo81549xf579a34a(str3.length());
            }
            if (str3.length() > 0) {
                com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f439035i;
                if (c10449x84ee1171 != null) {
                    c10449x84ee1171.m43725xd2dca690(true);
                }
            } else {
                com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11712 = this.f439035i;
                if (c10449x84ee11712 != null) {
                    c10449x84ee11712.m43725xd2dca690(false);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a043 = this.f439037n;
        if (c22618x59d05a043 != null) {
            c22618x59d05a043.addTextChangedListener(this.f439039p);
        }
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, this, true);
        setOnDismissListener(new pp3.s(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6812xec41ec53 c6812xec41ec53 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6812xec41ec53();
        c6812xec41ec53.f141377d = c6812xec41ec53.b("SessionId", java.lang.String.valueOf(c01.id.c()), true);
        c6812xec41ec53.f141378e = 1;
        c6812xec41ec53.f141380g = 3;
        c6812xec41ec53.f141379f = 0;
        c6812xec41ec53.k();
        c6812xec41ec53.o();
        setOnCancelListener(pp3.t.f439030d);
        f439031s = this;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11713 = this.f439035i;
        if (c10449x84ee11713 != null) {
            c10449x84ee11713.m43724x1b9709f9(this.f439037n);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11714 = this.f439035i;
        if (c10449x84ee11714 != null) {
            c10449x84ee11714.m43723x8a9c4129(this);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11715 = this.f439035i;
        if (c10449x84ee11715 == null) {
            return;
        }
        c10449x84ee11715.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f439035i;
        if (!(c10449x84ee1171 != null && c10449x84ee1171.h())) {
            dismiss();
            return false;
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11712 = this.f439035i;
        if (c10449x84ee11712 == null) {
            return true;
        }
        c10449x84ee11712.g();
        c10449x84ee11712.setVisibility(8);
        return true;
    }

    @Override // sr.k
    /* renamed from: showVKB */
    public void mo158846x7b383410() {
        java.lang.Object systemService = this.f439032f.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f439037n, 0);
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = g25Var != null ? g25Var.f456374d : null;
        objArr[2] = g25Var != null ? g25Var.f456375e : null;
        java.lang.String str = this.f439033g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ret:%d, content:%s, title:%s", objArr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f439040q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6812xec41ec53 c6812xec41ec53 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6812xec41ec53();
            c6812xec41ec53.f141377d = c6812xec41ec53.b("SessionId", java.lang.String.valueOf(c01.id.c()), true);
            c6812xec41ec53.f141378e = 2;
            c6812xec41ec53.f141380g = 3;
            android.content.Context context = this.f439032f;
            if (i17 == 0) {
                db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9));
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = q0Var != null ? q0Var.f535964j : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModPatSuffixOplog");
                r45.mo4 mo4Var = (r45.mo4) fVar;
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC;
                java.lang.Object m17 = c17.m(u3Var2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) m17, mo4Var.f462245d)) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
                }
                gm0.j1.u().c().x(u3Var2, mo4Var.f462245d);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, java.lang.Long.valueOf(c01.id.c()));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
                c6812xec41ec53.f141379f = 0;
                dismiss();
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g25Var != null ? g25Var.f456374d : null)) {
                    db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8);
                } else {
                    db5.e1.s(context, g25Var != null ? g25Var.f456374d : null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8));
                }
                c6812xec41ec53.f141379f = i17;
            }
            c6812xec41ec53.k();
            c6812xec41ec53.o();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
    }
}
