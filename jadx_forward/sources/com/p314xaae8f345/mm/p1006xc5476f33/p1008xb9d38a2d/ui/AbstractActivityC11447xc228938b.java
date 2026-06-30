package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/MMBaseAccountActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.ui.MMBaseAccountActivity */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC11447xc228938b extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f154966d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f154967e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f154968f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f154969g;

    /* renamed from: h, reason: collision with root package name */
    public int f154970h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f154971i;

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b abstractActivityC11447xc228938b) {
        android.view.View currentFocus = abstractActivityC11447xc228938b.getWindow().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            int height = iArr[1] + currentFocus.getHeight() + com.p314xaae8f345.mm.ui.kk.a(currentFocus);
            android.view.ViewParent parent = currentFocus.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.getLocationInWindow(iArr);
                height = iArr[1] + viewGroup.getHeight();
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            abstractActivityC11447xc228938b.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i17 = height - rect.bottom;
            int i18 = -i65.a.b(abstractActivityC11447xc228938b.mo55332x76847179(), 56);
            if (i17 > i18) {
                android.widget.ScrollView scrollView = abstractActivityC11447xc228938b.f154966d;
                if (scrollView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                    throw null;
                }
                int scrollY = (i17 + scrollView.getScrollY()) - i18;
                android.widget.ScrollView scrollView2 = abstractActivityC11447xc228938b.f154966d;
                if (scrollView2 != null) {
                    scrollView2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a8(scrollY, abstractActivityC11447xc228938b));
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                    throw null;
                }
            }
        }
    }

    public android.view.View V6() {
        return null;
    }

    public int W6() {
        return 0;
    }

    public void X6() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(m81186xd24c19fa());
        this.f154971i = f5Var;
        f5Var.f291933e = this;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mcm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f154966d = (android.widget.ScrollView) findViewById;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567366uf0);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.skn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f154967e = (android.widget.LinearLayout) findViewById2;
        int W6 = W6();
        if (W6 != 0) {
            android.view.LayoutInflater.from(this).inflate(W6, (android.view.ViewGroup) linearLayout, true);
        }
        android.view.View V6 = V6();
        if (V6 != null) {
            android.widget.LinearLayout linearLayout2 = this.f154967e;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomContainer");
                throw null;
            }
            linearLayout2.addView(V6);
        }
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            com.p314xaae8f345.mm.C4825x87088c51 c4825x87088c51 = (com.p314xaae8f345.mm.C4825x87088c51) findViewById(com.p314xaae8f345.mm.R.id.hdq);
            double d17 = getResources().getDisplayMetrics().heightPixels;
            c4825x87088c51.setPadding(c4825x87088c51.getPaddingLeft(), (int) (0.1d * d17), c4825x87088c51.getPaddingRight(), (int) (d17 * 0.15d));
            c4825x87088c51.m42182xb247bcf0(mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.an7));
        }
        if (fp.h.c(30)) {
            android.widget.LinearLayout linearLayout3 = this.f154967e;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomContainer");
                throw null;
            }
            linearLayout3.setWindowInsetsAnimationCallback(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h8(linearLayout3, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b8(this)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linearLayout);
            linearLayout.setWindowInsetsAnimationCallback(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h8(linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c8.f155303d));
        }
    }

    public final void Y6(android.view.View view, int i17, int i18, yz5.a aVar) {
        android.animation.ValueAnimator valueAnimator = this.f154968f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
            ofInt.setDuration(175L);
            ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f8(layoutParams, view));
            ofInt.start();
            ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g8(aVar));
            this.f154968f = ofInt;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejw;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().getDecorView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78530x8b45058f();
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f154971i;
        if (f5Var != null) {
            f5Var.d();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f154971i;
        if (f5Var != null) {
            f5Var.f();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f154971i;
        if (f5Var != null) {
            f5Var.f();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        if (!z18 && this.f154969g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSheetActivity", "keyboard hide");
            this.f154969g = false;
            if (fp.h.c(30)) {
                android.widget.LinearLayout linearLayout = this.f154967e;
                if (linearLayout != null) {
                    linearLayout.setPadding(0, 0, 0, 0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomContainer");
                    throw null;
                }
            }
            android.widget.ScrollView scrollView = this.f154966d;
            if (scrollView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                throw null;
            }
            int height = scrollView.getHeight();
            android.widget.ScrollView scrollView2 = this.f154966d;
            if (scrollView2 != null) {
                Y6(scrollView, height, scrollView2.getHeight() + this.f154970h, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d8(this));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                throw null;
            }
        }
        if (!z18 || this.f154969g) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSheetActivity", "keyboard show");
        this.f154969g = true;
        this.f154970h = i17;
        if (fp.h.c(30)) {
            android.widget.LinearLayout linearLayout2 = this.f154967e;
            if (linearLayout2 != null) {
                linearLayout2.setPadding(0, 0, 0, this.f154970h);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomContainer");
                throw null;
            }
        }
        android.widget.ScrollView scrollView3 = this.f154966d;
        if (scrollView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
            throw null;
        }
        int height2 = scrollView3.getHeight();
        android.widget.ScrollView scrollView4 = this.f154966d;
        if (scrollView4 != null) {
            Y6(scrollView3, height2, scrollView4.getHeight() - this.f154970h, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e8(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
            throw null;
        }
    }
}
