package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/l7", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI */
/* loaded from: classes8.dex */
public final class ActivityC17414x34d8ac5f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f241860x = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f241862e;

    /* renamed from: f, reason: collision with root package name */
    public int f241863f;

    /* renamed from: g, reason: collision with root package name */
    public int f241864g;

    /* renamed from: h, reason: collision with root package name */
    public int f241865h;

    /* renamed from: i, reason: collision with root package name */
    public int f241866i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 f241868n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f241869o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f241870p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241871q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241872r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f241874t;

    /* renamed from: u, reason: collision with root package name */
    public rl5.r f241875u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f241876v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f241877w;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f241861d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a8(this));

    /* renamed from: m, reason: collision with root package name */
    public int f241867m = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f241873s = -1;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        if (activityC17414x34d8ac5f.f241876v) {
            return;
        }
        activityC17414x34d8ac5f.f241876v = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17414x34d8ac5f.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7.class)).O6(activityC17414x34d8ac5f.f241869o);
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        if (activityC17414x34d8ac5f.f241866i <= 0 || activityC17414x34d8ac5f.f241867m <= 0) {
            return;
        }
        activityC17414x34d8ac5f.Z6(activityC17414x34d8ac5f.X6().f349108e.getVisibility() == 0);
        activityC17414x34d8ac5f.Y6(activityC17414x34d8ac5f.X6().f349106c.getVisibility() == 0);
        if (activityC17414x34d8ac5f.f241871q) {
            activityC17414x34d8ac5f.W6();
        }
    }

    public static final boolean V6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        int i17;
        int i18 = activityC17414x34d8ac5f.f241866i;
        if (i18 <= 0 || (i17 = activityC17414x34d8ac5f.f241863f) <= 0 || activityC17414x34d8ac5f.f241867m >= 0) {
            return false;
        }
        activityC17414x34d8ac5f.f241867m = i18 - i17;
        int dimensionPixelSize = i17 - activityC17414x34d8ac5f.mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        activityC17414x34d8ac5f.f241864g = dimensionPixelSize;
        activityC17414x34d8ac5f.f241865h = dimensionPixelSize + activityC17414x34d8ac5f.mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", "updateViewParams titleHeaderHeight: " + activityC17414x34d8ac5f.f241863f + ", containerViewHeight: " + activityC17414x34d8ac5f.f241867m + ", startOffset: " + activityC17414x34d8ac5f.f241864g + ", endOffset: " + activityC17414x34d8ac5f.f241865h);
        return true;
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var2 = this.f241868n;
        if (l7Var2 != null && l7Var2.x()) {
            this.f241871q = true;
            java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            a7(true, string);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var3 = this.f241868n;
            if (l7Var3 != null) {
                int mo1894x7e414b06 = l7Var3.mo1894x7e414b06() - 1;
                java.util.List list = l7Var3.f242809f;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7 h7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7) kz5.n0.a0(list, mo1894x7e414b06);
                if (h7Var != null && h7Var.f242630a == 2) {
                    ((java.util.ArrayList) list).remove(mo1894x7e414b06);
                    l7Var3.m8146xced61ae5();
                }
            }
        } else {
            this.f241871q = false;
            a7(false, "");
        }
        if (!this.f241872r && (l7Var = this.f241868n) != null && !l7Var.x()) {
            this.f241872r = true;
            m78548x39037dd1();
            m78478x84f07bce(800, com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b8(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var4 = this.f241868n;
            if (l7Var4 != null && l7Var4.x()) {
                this.f241872r = false;
                m78548x39037dd1();
            }
        }
    }

    public final g14.a X6() {
        return (g14.a) ((jz5.n) this.f241861d).mo141623x754a37bb();
    }

    public final void Y6(boolean z17) {
        X6().f349106c.setVisibility(z17 ? 0 : 8);
        if (z17) {
            android.widget.LinearLayout linearLayout = X6().f349106c;
            android.view.ViewGroup.LayoutParams layoutParams = X6().f349106c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) (this.f241867m * 0.3f)) - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            }
            linearLayout.setLayoutParams(layoutParams);
            if (gm0.j1.d().n() == 0) {
                X6().f349107d.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipm));
            } else {
                X6().f349107d.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipl));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r7.x() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showLoading show: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.SettingsAuthUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r7 == 0) goto L64
            com.tencent.mm.plugin.setting.ui.setting.l7 r7 = r6.f241868n
            r0 = 0
            if (r7 == 0) goto L23
            boolean r7 = r7.x()
            r1 = 1
            if (r7 != r1) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 == 0) goto L64
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f349108e
            g14.a r1 = r6.X6()
            android.widget.ProgressBar r1 = r1.f349108e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L56
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L57
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r6.f241867m
            float r3 = (float) r3
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r4
            int r3 = (int) r3
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165432(0x7f0700f8, float:1.794508E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r3 - r4
            r2.topMargin = r3
            goto L57
        L56:
            r1 = 0
        L57:
            r7.setLayoutParams(r1)
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f349108e
            r7.setVisibility(r0)
            goto L6f
        L64:
            g14.a r7 = r6.X6()
            android.widget.ProgressBar r7 = r7.f349108e
            r0 = 8
            r7.setVisibility(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f.Z6(boolean):void");
    }

    public final void a7(boolean z17, java.lang.String str) {
        X6().f349111h.setVisibility(z17 ? 0 : 8);
        X6().f349111h.setText(str);
        if (z17) {
            android.widget.TextView textView = X6().f349111h;
            android.view.ViewGroup.LayoutParams layoutParams = X6().f349111h.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (this.f241867m * 0.3f);
            }
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cl6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var = this.f241868n;
            boolean z17 = false;
            if (l7Var != null && l7Var.y(this.f241873s)) {
                z17 = true;
            }
            if (z17) {
                W6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ipn);
        mo78530x8b45058f();
        this.f241870p = java.lang.Integer.valueOf(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78519xb1736e47().setAlpha(0.0f);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f241863f = 0;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m7(this));
        this.f241875u = new rl5.r(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f settingsAuthRecyclerView = X6().f349109f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(settingsAuthRecyclerView, "settingsAuthRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7(this, settingsAuthRecyclerView);
        this.f241868n = l7Var;
        l7Var.f242813m = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p7(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = X6().f349109f;
        c12808x5de4409f.mo7960x6cab2c8d(this.f241868n);
        c12808x5de4409f.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c12808x5de4409f.getContext()));
        c12808x5de4409f.m7964x8d4ad49c(null);
        android.view.View inflate = android.view.LayoutInflater.from(c12808x5de4409f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bp8, (android.view.ViewGroup) null);
        this.f241877w = inflate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.imd);
        android.view.View view = this.f241877w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ime)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.q7(progressBar, this));
        android.view.View view2 = this.f241877w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        c12808x5de4409f.m53682x626a4c3f(view2);
        c12808x5de4409f.m1(false);
        c12808x5de4409f.m53683x6891e372(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.r7(progressBar, this));
        android.view.View inflate2 = android.view.LayoutInflater.from(c12808x5de4409f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bp9, (android.view.ViewGroup) null);
        this.f241862e = inflate2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.mp7)).getPaint(), 0.8f);
        android.view.View view3 = this.f241862e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        view3.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.s7(this));
        android.view.View view4 = this.f241862e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        c12808x5de4409f.m53684x77114253(view4);
        c12808x5de4409f.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.t7(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7.class)).f242394d = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u7(this);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7.class)).f242468d = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v7(this);
        X6().f349105b.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w7(this));
        X6().f349106c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x7(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(X6().f349110g, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7.class)).f242394d = null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7.class)).f242468d = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = mo78514x143f1b92();
        java.lang.Integer num = this.f241870p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        mo78514x143f1b92.G0(num.intValue());
        ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            m78511x9f88d943.mo82173x2c7f5575(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b7.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d7.class);
    }
}
