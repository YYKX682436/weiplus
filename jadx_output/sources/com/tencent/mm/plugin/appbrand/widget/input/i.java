package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.widget.input.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f91483o;

    /* renamed from: p, reason: collision with root package name */
    public final int f91484p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.d2 f91485q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.o2 f91486r;

    /* renamed from: s, reason: collision with root package name */
    public pl1.i f91487s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91488t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f91489u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f91490v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f91491w;

    public i(java.lang.String str, com.tencent.mm.plugin.appbrand.page.v5 v5Var, pl1.f fVar) {
        super(str, v5Var, fVar.Q);
        boolean z17 = false;
        this.f91484p = 0;
        java.lang.String str2 = fVar.R;
        this.f91483o = str2;
        this.f91485q = new com.tencent.mm.plugin.appbrand.widget.input.d2(v5Var.getContext());
        this.f91484p = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d.get(str), 0);
        if (v5Var.e1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "can send change event when hide");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "pageView == null? :%b", java.lang.Boolean.TRUE);
        }
        this.f91491w = z17;
        if ("encrypt-bankcard".equalsIgnoreCase(str2)) {
            this.f91485q.addTextChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.g(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public int b() {
        java.lang.Integer num;
        pl1.i iVar = this.f91487s;
        if (iVar == null || (num = iVar.f356611y) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean c(int i17, int i18, boolean z17) {
        if (this.f91485q == null) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f91435h;
        com.tencent.mm.plugin.appbrand.widget.input.o2 v17 = com.tencent.mm.plugin.appbrand.widget.input.o2.v(((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).getContentView(), (weakReference.get() == null || !(weakReference.get() instanceof com.tencent.mm.plugin.appbrand.page.v5)) ? null : ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).V1());
        this.f91486r = v17;
        v17.setComponentView(this.f91487s.G.booleanValue());
        this.f91486r.w();
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f91486r;
        if (o2Var == null) {
            return false;
        }
        this.f91490v = z17;
        if (z17) {
            o2Var.f91578d.setBackgroundResource(com.tencent.mm.R.color.BW_BG_100);
            o2Var.f91578d.findViewById(com.tencent.mm.R.id.d0v).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            o2Var.f91578d.findViewById(com.tencent.mm.R.id.b3f).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            o2Var.f91581g.a();
        }
        this.f91489u = true;
        k();
        this.f91486r.setXMode(this.f91484p);
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var2 = this.f91486r;
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91485q;
        if (d2Var == null) {
            o2Var2.getClass();
        } else {
            android.widget.EditText editText = o2Var2.f91582h;
            if (editText != d2Var && editText != null) {
                editText.clearFocus();
                o2Var2.f91582h = null;
                o2Var2.f91580f = null;
                o2Var2.f91579e = false;
            }
            o2Var2.setInputEditText(d2Var);
            o2Var2.setVisibility(0);
        }
        this.f91486r.setOnDoneListener(new com.tencent.mm.plugin.appbrand.widget.input.h(this));
        com.tencent.mm.plugin.appbrand.widget.input.b.b(n(), i17, i18);
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(weakReference).d(this.f91433f);
        this.f91489u = false;
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.view.View getInputPanel() {
        u();
        return this.f91486r;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean hideKeyboard() {
        if (u() == null || !v()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f91486r;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f91582h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f91582h = null;
            o2Var.f91580f = null;
            o2Var.f91579e = false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91485q;
        if (d2Var != null) {
            d2Var.setFocusable(false);
            this.f91485q.setFocusableInTouchMode(false);
            this.f91485q.setEnabled(false);
        }
        r();
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91435h).c(this.f91433f);
        if (!this.f91491w) {
            return true;
        }
        f(0);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean i() {
        pl1.i iVar = this.f91487s;
        return iVar != null && com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.B);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.widget.EditText n() {
        return this.f91485q;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.graphics.Rect o() {
        return new android.graphics.Rect(this.f91487s.f356591e.intValue(), this.f91487s.f356590d.intValue(), this.f91487s.f356591e.intValue() + this.f91487s.f356588b.intValue(), this.f91487s.f356590d.intValue() + this.f91487s.f356589c.intValue());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean p(boolean z17) {
        v();
        if (z17) {
            if (this.f91489u || v()) {
                return true;
            }
            this.f91489u = true;
            c(-2, -2, this.f91490v);
            this.f91489u = false;
        } else {
            if (this.f91488t || !v()) {
                return true;
            }
            this.f91488t = true;
            w();
            hideKeyboard();
            q();
            this.f91488t = false;
            this.f91485q = null;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public pl1.i s(pl1.i iVar) {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var;
        pl1.i iVar2 = this.f91487s;
        if (iVar2 == null) {
            this.f91487s = iVar;
            if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.F) && (d2Var = this.f91485q) != null) {
                d2Var.setPasswordMode(true);
            }
        } else {
            iVar2.a(iVar);
            com.tencent.mm.plugin.appbrand.widget.input.l4.a(this.f91487s, iVar);
        }
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var2 = this.f91485q;
        if (d2Var2 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.b.a(d2Var2, this.f91487s);
        return this.f91487s;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean t(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91485q;
        if (d2Var == null) {
            return false;
        }
        d2Var.u(str);
        return true;
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.o2 u() {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f91486r;
        if (o2Var != null) {
            return o2Var;
        }
        com.tencent.mm.plugin.appbrand.widget.input.o2 inputPanel = this.f91485q.getInputPanel();
        this.f91486r = inputPanel;
        return inputPanel;
    }

    public boolean v() {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91485q;
        if (d2Var == null) {
            return false;
        }
        if (d2Var.isFocused()) {
            return true;
        }
        return u() != null && u().isShown() && this.f91486r.getAttachedEditText() == this.f91485q;
    }

    public final void w() {
        java.lang.String message;
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        if (!com.tencent.mm.plugin.appbrand.widget.input.r1.e(this.f91483o)) {
            l(currentValue());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, do encrypt");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get();
        pl1.i iVar = this.f91487s;
        java.lang.String str = null;
        try {
            synchronized (this) {
                v4Var = this.f91438n;
                if (v4Var == null) {
                    v4Var = new com.tencent.mm.plugin.appbrand.widget.input.l(this.f91434g, this);
                    this.f91438n = v4Var;
                }
            }
            str = com.tencent.mm.plugin.appbrand.widget.input.l4.b(v4Var, v5Var, iVar);
            message = null;
        } catch (com.tencent.mm.plugin.appbrand.widget.input.k4 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, encrypt fail since %s", e17);
            message = e17.getMessage();
        }
        m(currentValue(), str, message);
    }
}
