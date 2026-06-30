package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f173016o;

    /* renamed from: p, reason: collision with root package name */
    public final int f173017p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 f173018q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 f173019r;

    /* renamed from: s, reason: collision with root package name */
    public pl1.i f173020s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f173021t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f173022u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f173023v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f173024w;

    public i(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, pl1.f fVar) {
        super(str, v5Var, fVar.Q);
        boolean z17 = false;
        this.f173017p = 0;
        java.lang.String str2 = fVar.R;
        this.f173016o = str2;
        this.f173018q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2(v5Var.mo50352x76847179());
        this.f173017p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d.get(str), 0);
        if (v5Var.e1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "can send change event when hide");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "pageView == null? :%b", java.lang.Boolean.TRUE);
        }
        this.f173024w = z17;
        if ("encrypt-bankcard".equalsIgnoreCase(str2)) {
            this.f173018q.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public int b() {
        java.lang.Integer num;
        pl1.i iVar = this.f173020s;
        if (iVar == null || (num = iVar.f438144y) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean c(int i17, int i18, boolean z17) {
        if (this.f173018q == null) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = this.f172968h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2.v(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).mo51310xc2a54588(), (weakReference.get() == null || !(weakReference.get() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5)) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()).V1());
        this.f173019r = v17;
        v17.m53509xb5ed2800(this.f173020s.G.booleanValue());
        this.f173019r.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f173019r;
        if (o2Var == null) {
            return false;
        }
        this.f173023v = z17;
        if (z17) {
            o2Var.f173111d.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621);
            o2Var.f173111d.findViewById(com.p314xaae8f345.mm.R.id.d0v).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            o2Var.f173111d.findViewById(com.p314xaae8f345.mm.R.id.b3f).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            o2Var.f173114g.a();
        }
        this.f173022u = true;
        k();
        this.f173019r.m53513x53eb72f9(this.f173017p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var2 = this.f173019r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173018q;
        if (d2Var == null) {
            o2Var2.getClass();
        } else {
            android.widget.EditText editText = o2Var2.f173115h;
            if (editText != d2Var && editText != null) {
                editText.clearFocus();
                o2Var2.f173115h = null;
                o2Var2.f173113f = null;
                o2Var2.f173112e = false;
            }
            o2Var2.m53510xce4186ff(d2Var);
            o2Var2.setVisibility(0);
        }
        this.f173019r.m53512x87046ad7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.b(n(), i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(weakReference).d(this.f172966f);
        this.f173022u = false;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: getInputPanel */
    public android.view.View mo53483x400bc850() {
        u();
        return this.f173019r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    /* renamed from: hideKeyboard */
    public boolean mo53484x3f895349() {
        if (u() == null || !v()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f173019r;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f173115h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f173115h = null;
            o2Var.f173113f = null;
            o2Var.f173112e = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173018q;
        if (d2Var != null) {
            d2Var.setFocusable(false);
            this.f173018q.setFocusableInTouchMode(false);
            this.f173018q.setEnabled(false);
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.b(this.f172968h).c(this.f172966f);
        if (!this.f173024w) {
            return true;
        }
        f(0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4
    public boolean i() {
        pl1.i iVar = this.f173020s;
        return iVar != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.B);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.widget.EditText n() {
        return this.f173018q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public android.graphics.Rect o() {
        return new android.graphics.Rect(this.f173020s.f438124e.intValue(), this.f173020s.f438123d.intValue(), this.f173020s.f438124e.intValue() + this.f173020s.f438121b.intValue(), this.f173020s.f438123d.intValue() + this.f173020s.f438122c.intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean p(boolean z17) {
        v();
        if (z17) {
            if (this.f173022u || v()) {
                return true;
            }
            this.f173022u = true;
            c(-2, -2, this.f173023v);
            this.f173022u = false;
        } else {
            if (this.f173021t || !v()) {
                return true;
            }
            this.f173021t = true;
            w();
            mo53484x3f895349();
            q();
            this.f173021t = false;
            this.f173018q = null;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public pl1.i s(pl1.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var;
        pl1.i iVar2 = this.f173020s;
        if (iVar2 == null) {
            this.f173020s = iVar;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.F) && (d2Var = this.f173018q) != null) {
                d2Var.mo53458xb9053060(true);
            }
        } else {
            iVar2.a(iVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.a(this.f173020s, iVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var2 = this.f173018q;
        if (d2Var2 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.a(d2Var2, this.f173020s);
        return this.f173020s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f
    public boolean t(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173018q;
        if (d2Var == null) {
            return false;
        }
        d2Var.u(str);
        return true;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f173019r;
        if (o2Var != null) {
            return o2Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 mo53433x400bc850 = this.f173018q.mo53433x400bc850();
        this.f173019r = mo53433x400bc850;
        return mo53433x400bc850;
    }

    public boolean v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var = this.f173018q;
        if (d2Var == null) {
            return false;
        }
        if (d2Var.isFocused()) {
            return true;
        }
        return u() != null && u().isShown() && this.f173019r.m53507xb5567791() == this.f173018q;
    }

    public final void w() {
        java.lang.String message;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 v4Var;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.e(this.f173016o)) {
            l(mo53471x57066778());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, do encrypt");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f172968h.get();
        pl1.i iVar = this.f173020s;
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
