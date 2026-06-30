package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout */
/* loaded from: classes8.dex */
public class C19330x7ca5b1cf extends com.p314xaae8f345.mm.ui.C21386xa8232056 {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.Boolean f265305u;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265306m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f265307n;

    /* renamed from: o, reason: collision with root package name */
    public int f265308o;

    /* renamed from: p, reason: collision with root package name */
    public int f265309p;

    /* renamed from: q, reason: collision with root package name */
    public int f265310q;

    /* renamed from: r, reason: collision with root package name */
    public int f265311r;

    /* renamed from: s, reason: collision with root package name */
    public int f265312s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f265313t;

    public C19330x7ca5b1cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f265306m = false;
        this.f265312s = -1;
        this.f265313t = false;
        i();
    }

    /* renamed from: getHideKeyHeightRate */
    private int m74395xec78ab8e() {
        if (this.f265312s < 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_keyboard_screen_height_hide_rate, 10);
            int i17 = Ni > 0 ? Ni : 10;
            this.f265312s = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "hide rate:%d", java.lang.Integer.valueOf(i17));
        }
        return this.f265312s;
    }

    @Override // com.p314xaae8f345.mm.ui.C21386xa8232056
    public void c(int i17) {
        if (fp.h.c(30)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "api30, ban onLayout method");
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        getWindowVisibleDisplayFrame(rect);
        int height = getRootView().getHeight();
        if (!this.f265306m) {
            this.f265306m = true;
            this.f265310q = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "init height:%d", java.lang.Integer.valueOf(i17));
            super.e(-1);
            this.f265311r = height - rect.bottom;
        }
        rect.toString();
        int height2 = rect.height();
        this.f265310q = height2;
        if (this.f265308o != height2) {
            int height3 = (getRootView().getHeight() - this.f265311r) - rect.top;
            int i18 = height3 - height2;
            if (i18 > height3 / m74395xec78ab8e()) {
                this.f265307n = true;
                this.f265309p = i18;
                super.e(-3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!! mHeight: " + this.f265310q + " b: " + i17 + " mKBHeight: " + this.f265309p);
            } else {
                this.f265307n = false;
                super.e(-2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!! mHeight: " + this.f265310q + " b: " + i17);
            }
            this.f265308o = height2;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.C21386xa8232056
    public void e(int i17) {
        super.e(i17);
    }

    /* renamed from: getKeyBoardHeight */
    public final int m74396xfc829cc4() {
        return this.f265309p;
    }

    public final void i() {
        if (f265305u == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_webview_enable_new_kb_height, 1) == 1);
            f265305u = valueOf;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "initKbListenerByApi30 enableNewKbHeight: %s", valueOf);
        }
        if (fp.h.c(30)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "keyboard api30 rootView: %s", getRootView());
            getRootView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.C21386xa8232056, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22601x66cbd65e, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setFixApplyWindow */
    public void m74397x1e54e2ab(boolean z17) {
        this.f265313t = z17;
    }

    public C19330x7ca5b1cf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f265306m = false;
        this.f265312s = -1;
        this.f265313t = false;
        i();
    }
}
