package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f173047o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 f173048p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 f173049q;

    /* renamed from: r, reason: collision with root package name */
    public pl1.i f173050r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f173051s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f173052t;

    public k(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, pl1.f fVar) {
        super(str, v5Var, fVar.Q);
        this.f173047o = fVar.R;
        this.f173048p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2(v5Var.mo50352x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public int b() {
        java.lang.Integer num;
        pl1.i iVar = this.f173050r;
        if (iVar == null || (num = iVar.f438144y) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean c(int i17, int i18, boolean z17) {
        if (this.f173048p == null) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f172968h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3.v(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).mo51310xc2a54588(), (weakReference.get() == null || !(weakReference.get() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5)) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).V1());
        this.f173049q = v17;
        if (v17 == null) {
            return false;
        }
        int i19 = this.f172966f;
        v17.f173261i = i19;
        this.f173052t = true;
        k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 y3Var = this.f173049q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173048p;
        if (d2Var == null) {
            y3Var.getClass();
        } else {
            android.widget.EditText editText = y3Var.f173259g;
            if (editText != d2Var && editText != null) {
                editText.clearFocus();
                y3Var.f173259g = null;
                y3Var.f173257e = null;
                y3Var.f173256d = false;
            }
            y3Var.m53541xce4186ff(d2Var);
            y3Var.f173258f.setVisibility(0);
            y3Var.setVisibility(0);
            nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
            android.view.ViewGroup viewGroup = y3Var.f173258f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) dVar).getClass();
            ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(viewGroup);
        }
        this.f173049q.m53543x87046ad7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.b(n(), i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(weakReference).d(i19);
        this.f173052t = false;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: getInputPanel */
    public android.view.View mo53483x400bc850() {
        return this.f173049q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: hideKeyboard */
    public boolean mo53484x3f895349() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 y3Var = this.f173049q;
        if (y3Var == null) {
            y3Var = null;
        }
        if (y3Var == null || !u()) {
            return false;
        }
        this.f173049q.u();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173048p;
        if (d2Var != null) {
            d2Var.setFocusable(false);
            this.f173048p.setFocusableInTouchMode(false);
            this.f173048p.setEnabled(false);
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(this.f172968h).c(this.f172966f);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean i() {
        pl1.i iVar = this.f173050r;
        return iVar != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.B);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.widget.EditText n() {
        return this.f173048p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.graphics.Rect o() {
        return new android.graphics.Rect(this.f173050r.f438124e.intValue(), this.f173050r.f438123d.intValue(), this.f173050r.f438124e.intValue() + this.f173050r.f438121b.intValue(), this.f173050r.f438123d.intValue() + this.f173050r.f438122c.intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean p(boolean z17) {
        u();
        if (z17) {
            if (this.f173052t || u()) {
                return true;
            }
            this.f173052t = true;
            c(-2, -2, false);
            this.f173052t = false;
        } else {
            if (this.f173051s || !u()) {
                return true;
            }
            this.f173051s = true;
            v();
            mo53484x3f895349();
            q();
            this.f173051s = false;
            this.f173048p = null;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public pl1.i s(pl1.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var;
        pl1.i iVar2 = this.f173050r;
        if (iVar2 == null) {
            this.f173050r = iVar;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.F) && (d2Var = this.f173048p) != null) {
                d2Var.mo53458xb9053060(true);
            }
        } else {
            iVar2.a(iVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.a(this.f173050r, iVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var2 = this.f173048p;
        if (d2Var2 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.a(d2Var2, this.f173050r);
        return this.f173050r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean t(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173048p;
        if (d2Var == null) {
            return false;
        }
        d2Var.u(str);
        return true;
    }

    public boolean u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173048p;
        if (d2Var == null) {
            return false;
        }
        if (d2Var.isFocused()) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 y3Var = this.f173049q;
        if ((y3Var != null ? y3Var : null) == null) {
            return false;
        }
        if (y3Var == null) {
            y3Var = null;
        }
        return y3Var.isShown() && this.f173049q.m53539xb5567791() == this.f173048p;
    }

    public final void v() {
        java.lang.String message;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 v4Var;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.e(this.f173047o)) {
            l(mo53471x57066778());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, do encrypt");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get();
        pl1.i iVar = this.f173050r;
        java.lang.String str = null;
        try {
            synchronized (this) {
                v4Var = this.f172971n;
                if (v4Var == null) {
                    v4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l(this.f172967g, this);
                    this.f172971n = v4Var;
                }
            }
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.b(v4Var, v5Var, iVar);
            message = null;
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, encrypt fail since %s", e17);
            message = e17.getMessage();
        }
        m(mo53471x57066778(), str, message);
    }
}
