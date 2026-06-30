package hg;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa f362830a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f362831b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 f362832c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f362833d;

    /* renamed from: e, reason: collision with root package name */
    public int f362834e;

    /* renamed from: f, reason: collision with root package name */
    public int f362835f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362836g;

    /* renamed from: h, reason: collision with root package name */
    public int f362837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f362838i;

    /* renamed from: j, reason: collision with root package name */
    public int f362839j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f362840k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 f362841l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 f362842m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 f362843n;

    public h(com.p314xaae8f345.p3210x3857dc.i2 i2Var) {
        super(i2Var);
        this.f362834e = 0;
        this.f362835f = 0;
        this.f362836g = false;
        this.f362837h = -1;
        this.f362838i = false;
        this.f362839j = 0;
        this.f362840k = false;
        this.f362841l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5(new hg.a(this));
        this.f362842m = new hg.b(this);
        this.f362843n = new hg.c(this);
    }

    public final void a(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm();        }");
        sb6.append(!z17 ? "        focusElement.blur();" : "");
        sb6.append("    }})();");
        m120228x738236e6(sb6.toString(), new hg.f(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 b() {
        synchronized ("WebViewExtendTextAreaClient") {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = this.f362832c;
            if (u3Var != null) {
                return u3Var;
            }
            if (!this.f362836g) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f362830a;
            if (oaVar == null || oaVar.a() == null) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 G = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.G(this.f362830a.a().mo51310xc2a54588(), null, (this.f362830a.a() == null || !(this.f362830a.a() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5)) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f362830a.a()).V1());
            this.f362832c = G;
            if (G != null) {
                this.f362833d = new android.widget.EditText(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(this.f362832c.getContext()));
                this.f362832c.k(this.f362842m);
            }
            return this.f362832c;
        }
    }

    public final int c(int i17) {
        if (b() == null) {
            return 0;
        }
        int minimumHeight = this.f362832c.getMinimumHeight();
        if (minimumHeight != 0 && minimumHeight != this.f362834e) {
            this.f362834e = minimumHeight;
        }
        return i17 + this.f362834e;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b
    /* renamed from: getToolBarHeight */
    public int mo120229x6a051cac(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = this.f362830a;
        if (oaVar == null || oaVar.a() == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.c(this.f362830a.a().mo51310xc2a54588())) {
            return 0;
        }
        return c(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b
    /* renamed from: onHideKeyboard */
    public boolean mo120230xb4cbdec8(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 b17;
        if (this.f362830a != null && (b17 = b()) != null) {
            b17.a(false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var = this.f362841l;
            w5Var.a();
            if (this.f362830a.a() != null && this.f362830a.a().mo51310xc2a54588() != null && this.f362830a.a().mo51310xc2a54588().getViewTreeObserver() != null) {
                this.f362830a.a().mo51310xc2a54588().getViewTreeObserver().removeOnGlobalLayoutListener(w5Var);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f362831b;
            if (l2Var != null) {
                l2Var.g(this.f362843n);
            }
        }
        fg.p0.f343334a.a(true);
        this.f362836g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = this.f362832c;
        if (u3Var != null) {
            u3Var.m(this.f362842m);
        }
        this.f362832c = null;
        this.f362837h = -1;
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b
    /* renamed from: onShowKeyboard */
    public boolean mo120232x6080f183(java.lang.String str, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 b17;
        boolean z17;
        this.f362836g = true;
        hg.g gVar = new hg.g(this, str);
        sf.c cVar = sf.c.f488472a;
        int i17 = gVar.f362829f;
        cVar.c(new sf.a(1, i17));
        if (this.f362831b == null) {
            this.f362831b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(this.f362830a.a().mo51310xc2a54588());
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f362831b;
            if (l2Var != null) {
                l2Var.a(this.f362843n);
            }
        } else if (this.f362830a.a() != null && this.f362830a.a().mo51310xc2a54588() != null && this.f362830a.a().mo51310xc2a54588().getViewTreeObserver() != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.f362830a.a().mo51310xc2a54588().getViewTreeObserver();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var = this.f362841l;
            viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
            viewTreeObserver.addOnGlobalLayoutListener(w5Var);
        }
        fg.p0.f343334a.a(false);
        this.f362840k = gVar.f362828e;
        this.f362837h = i17;
        if (this.f362830a != null && (b17 = b()) != null && (z17 = gVar.f362825b)) {
            b17.m53529xb5ed2800(gVar.f362827d);
            b17.M();
            b17.m53528x5b5172eb(!gVar.f362826c && "emoji".equals(gVar.f362824a));
            b17.m53534xc4cc2133(z17);
            b17.m53531x87046ad7(new hg.d(this));
            b17.postDelayed(new hg.e(this, b17, gVar), 200L);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b
    /* renamed from: onShowKeyboardConfig */
    public boolean mo120233x48bcf2a5(int i17, int i18, java.lang.String str, int i19, int i27, android.view.inputmethod.EditorInfo editorInfo) {
        pl1.c cVar = null;
        try {
            cVar = (pl1.c) pl1.e.a(new org.json.JSONObject(str).optString("confirm-type", null), pl1.c.class);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WebViewExtendTextAreaClient", "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewExtendTextAreaClient", "onShowKeyboardConfig, confirmType: " + cVar);
        if (pl1.c.RETURN != cVar) {
            editorInfo.imeOptions &= -1073741825;
        }
        int i28 = editorInfo.imeOptions;
        int i29 = cVar.f438116d;
        editorInfo.imeOptions = i28 | i29;
        this.f362839j = i29;
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27823x54bbb77b
    /* renamed from: performEditorAction */
    public boolean mo120234x17a33804(int i17) {
        if (i17 == 0 || i17 != this.f362839j) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewExtendTextAreaClient", "performEditorAction, confirmHold: " + this.f362840k);
        a(this.f362840k);
        return false;
    }
}
