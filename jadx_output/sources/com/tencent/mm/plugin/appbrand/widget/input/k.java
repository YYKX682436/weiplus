package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.widget.input.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f91514o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.d2 f91515p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.y3 f91516q;

    /* renamed from: r, reason: collision with root package name */
    public pl1.i f91517r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f91518s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91519t;

    public k(java.lang.String str, com.tencent.mm.plugin.appbrand.page.v5 v5Var, pl1.f fVar) {
        super(str, v5Var, fVar.Q);
        this.f91514o = fVar.R;
        this.f91515p = new com.tencent.mm.plugin.appbrand.widget.input.d2(v5Var.getContext());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public int b() {
        java.lang.Integer num;
        pl1.i iVar = this.f91517r;
        if (iVar == null || (num = iVar.f356611y) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean c(int i17, int i18, boolean z17) {
        if (this.f91515p == null) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f91435h;
        com.tencent.mm.plugin.appbrand.widget.input.y3 v17 = com.tencent.mm.plugin.appbrand.widget.input.y3.v(((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).getContentView(), (weakReference.get() == null || !(weakReference.get() instanceof com.tencent.mm.plugin.appbrand.page.v5)) ? null : ((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()).V1());
        this.f91516q = v17;
        if (v17 == null) {
            return false;
        }
        int i19 = this.f91433f;
        v17.f91728i = i19;
        this.f91519t = true;
        k();
        com.tencent.mm.plugin.appbrand.widget.input.y3 y3Var = this.f91516q;
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91515p;
        if (d2Var == null) {
            y3Var.getClass();
        } else {
            android.widget.EditText editText = y3Var.f91726g;
            if (editText != d2Var && editText != null) {
                editText.clearFocus();
                y3Var.f91726g = null;
                y3Var.f91724e = null;
                y3Var.f91723d = false;
            }
            y3Var.setInputEditText(d2Var);
            y3Var.f91725f.setVisibility(0);
            y3Var.setVisibility(0);
            nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
            android.view.ViewGroup viewGroup = y3Var.f91725f;
            ((com.tencent.mm.plugin.appbrand.utils.i5) dVar).getClass();
            ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(viewGroup);
        }
        this.f91516q.setOnDoneListener(new com.tencent.mm.plugin.appbrand.widget.input.j(this));
        com.tencent.mm.plugin.appbrand.widget.input.b.b(n(), i17, i18);
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(weakReference).d(i19);
        this.f91519t = false;
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.view.View getInputPanel() {
        return this.f91516q;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean hideKeyboard() {
        com.tencent.mm.plugin.appbrand.widget.input.y3 y3Var = this.f91516q;
        if (y3Var == null) {
            y3Var = null;
        }
        if (y3Var == null || !u()) {
            return false;
        }
        this.f91516q.u();
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91515p;
        if (d2Var != null) {
            d2Var.setFocusable(false);
            this.f91515p.setFocusableInTouchMode(false);
            this.f91515p.setEnabled(false);
        }
        r();
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91435h).c(this.f91433f);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean i() {
        pl1.i iVar = this.f91517r;
        return iVar != null && com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.B);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.widget.EditText n() {
        return this.f91515p;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public android.graphics.Rect o() {
        return new android.graphics.Rect(this.f91517r.f356591e.intValue(), this.f91517r.f356590d.intValue(), this.f91517r.f356591e.intValue() + this.f91517r.f356588b.intValue(), this.f91517r.f356590d.intValue() + this.f91517r.f356589c.intValue());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean p(boolean z17) {
        u();
        if (z17) {
            if (this.f91519t || u()) {
                return true;
            }
            this.f91519t = true;
            c(-2, -2, false);
            this.f91519t = false;
        } else {
            if (this.f91518s || !u()) {
                return true;
            }
            this.f91518s = true;
            v();
            hideKeyboard();
            q();
            this.f91518s = false;
            this.f91515p = null;
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public pl1.i s(pl1.i iVar) {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var;
        pl1.i iVar2 = this.f91517r;
        if (iVar2 == null) {
            this.f91517r = iVar;
            if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.F) && (d2Var = this.f91515p) != null) {
                d2Var.setPasswordMode(true);
            }
        } else {
            iVar2.a(iVar);
            com.tencent.mm.plugin.appbrand.widget.input.l4.a(this.f91517r, iVar);
        }
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var2 = this.f91515p;
        if (d2Var2 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.b.a(d2Var2, this.f91517r);
        return this.f91517r;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.f
    public boolean t(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91515p;
        if (d2Var == null) {
            return false;
        }
        d2Var.u(str);
        return true;
    }

    public boolean u() {
        com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var = this.f91515p;
        if (d2Var == null) {
            return false;
        }
        if (d2Var.isFocused()) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.widget.input.y3 y3Var = this.f91516q;
        if ((y3Var != null ? y3Var : null) == null) {
            return false;
        }
        if (y3Var == null) {
            y3Var = null;
        }
        return y3Var.isShown() && this.f91516q.getAttachedEditText() == this.f91515p;
    }

    public final void v() {
        java.lang.String message;
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        if (!com.tencent.mm.plugin.appbrand.widget.input.r1.e(this.f91514o)) {
            l(currentValue());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, do encrypt");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91435h.get();
        pl1.i iVar = this.f91517r;
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
