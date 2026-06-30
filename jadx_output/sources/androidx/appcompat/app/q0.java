package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class q0 extends androidx.appcompat.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.x0 f9204a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9205b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window.Callback f9206c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9207d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9208e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f9209f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f9210g = new androidx.appcompat.app.l0(this);

    public q0(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence, android.view.Window.Callback callback) {
        androidx.appcompat.app.m0 m0Var = new androidx.appcompat.app.m0(this);
        androidx.appcompat.widget.z2 z2Var = new androidx.appcompat.widget.z2(toolbar, false);
        this.f9204a = z2Var;
        androidx.appcompat.app.p0 p0Var = new androidx.appcompat.app.p0(this, callback);
        this.f9206c = p0Var;
        z2Var.f9758l = p0Var;
        toolbar.setOnMenuItemClickListener(m0Var);
        if (z2Var.f9754h) {
            return;
        }
        z2Var.f9755i = charSequence;
        if ((z2Var.f9748b & 8) != 0) {
            toolbar.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.app.b
    public void A(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void B(boolean z17) {
        O(z17 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.b
    public void C(int i17) {
        O(i17, -1);
    }

    @Override // androidx.appcompat.app.b
    public void D(boolean z17) {
        O(z17 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.b
    public void E(boolean z17) {
        O(z17 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.b
    public void F(boolean z17) {
        O(z17 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.b
    public void G(float f17) {
        androidx.appcompat.widget.Toolbar toolbar = ((androidx.appcompat.widget.z2) this.f9204a).f9747a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.s(toolbar, f17);
    }

    @Override // androidx.appcompat.app.b
    public void H(int i17) {
        ((androidx.appcompat.widget.z2) this.f9204a).e(i17);
    }

    @Override // androidx.appcompat.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9204a;
        z2Var.f9752f = drawable;
        z2Var.h();
    }

    @Override // androidx.appcompat.app.b
    public void J(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void K(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9204a;
        if (z2Var.f9754h) {
            return;
        }
        z2Var.f9755i = charSequence;
        if ((z2Var.f9748b & 8) != 0) {
            z2Var.f9747a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.app.b
    public void L() {
        ((androidx.appcompat.widget.z2) this.f9204a).f9747a.setVisibility(0);
    }

    public final android.view.Menu N() {
        boolean z17 = this.f9207d;
        androidx.appcompat.widget.x0 x0Var = this.f9204a;
        if (!z17) {
            androidx.appcompat.app.n0 n0Var = new androidx.appcompat.app.n0(this);
            androidx.appcompat.app.o0 o0Var = new androidx.appcompat.app.o0(this);
            androidx.appcompat.widget.Toolbar toolbar = ((androidx.appcompat.widget.z2) x0Var).f9747a;
            toolbar.S = n0Var;
            toolbar.T = o0Var;
            androidx.appcompat.widget.ActionMenuView actionMenuView = toolbar.f9478d;
            if (actionMenuView != null) {
                actionMenuView.A = n0Var;
                actionMenuView.B = o0Var;
            }
            this.f9207d = true;
        }
        return ((androidx.appcompat.widget.z2) x0Var).f9747a.getMenu();
    }

    public void O(int i17, int i18) {
        androidx.appcompat.widget.x0 x0Var = this.f9204a;
        int i19 = ((androidx.appcompat.widget.z2) x0Var).f9748b;
        ((androidx.appcompat.widget.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    @Override // androidx.appcompat.app.b
    public boolean g() {
        return ((androidx.appcompat.widget.z2) this.f9204a).b();
    }

    @Override // androidx.appcompat.app.b
    public boolean h() {
        androidx.appcompat.widget.u2 u2Var = ((androidx.appcompat.widget.z2) this.f9204a).f9747a.R;
        if (!((u2Var == null || u2Var.f9729e == null) ? false : true)) {
            return false;
        }
        o.u uVar = u2Var == null ? null : u2Var.f9729e;
        if (uVar != null) {
            uVar.collapseActionView();
        }
        return true;
    }

    @Override // androidx.appcompat.app.b
    public void i(boolean z17) {
        if (z17 == this.f9208e) {
            return;
        }
        this.f9208e = z17;
        java.util.ArrayList arrayList = this.f9209f;
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.f.a(arrayList.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.b
    public android.view.View j() {
        return ((androidx.appcompat.widget.z2) this.f9204a).f9750d;
    }

    @Override // androidx.appcompat.app.b
    public int k() {
        return ((androidx.appcompat.widget.z2) this.f9204a).f9748b;
    }

    @Override // androidx.appcompat.app.b
    public int l() {
        return ((androidx.appcompat.widget.z2) this.f9204a).f9747a.getHeight();
    }

    @Override // androidx.appcompat.app.b
    public android.content.Context m() {
        return ((androidx.appcompat.widget.z2) this.f9204a).a();
    }

    @Override // androidx.appcompat.app.b
    public java.lang.CharSequence n() {
        return ((androidx.appcompat.widget.z2) this.f9204a).f9747a.getTitle();
    }

    @Override // androidx.appcompat.app.b
    public void o() {
        ((androidx.appcompat.widget.z2) this.f9204a).f9747a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.b
    public boolean p() {
        androidx.appcompat.widget.x0 x0Var = this.f9204a;
        androidx.appcompat.widget.Toolbar toolbar = ((androidx.appcompat.widget.z2) x0Var).f9747a;
        java.lang.Runnable runnable = this.f9210g;
        toolbar.removeCallbacks(runnable);
        androidx.appcompat.widget.Toolbar toolbar2 = ((androidx.appcompat.widget.z2) x0Var).f9747a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(toolbar2, runnable);
        return true;
    }

    @Override // androidx.appcompat.app.b
    public boolean q() {
        return ((androidx.appcompat.widget.z2) this.f9204a).f9747a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.b
    public void r(android.content.res.Configuration configuration) {
    }

    @Override // androidx.appcompat.app.b
    public void s() {
        ((androidx.appcompat.widget.z2) this.f9204a).f9747a.removeCallbacks(this.f9210g);
    }

    @Override // androidx.appcompat.app.b
    public boolean t(int i17, android.view.KeyEvent keyEvent) {
        android.view.Menu N = N();
        if (N == null) {
            return false;
        }
        N.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return N.performShortcut(i17, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.b
    public boolean u(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            v();
        }
        return true;
    }

    @Override // androidx.appcompat.app.b
    public boolean v() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.z2) this.f9204a).f9747a.f9478d;
        if (actionMenuView == null) {
            return false;
        }
        androidx.appcompat.widget.q qVar = actionMenuView.f9340z;
        return qVar != null && qVar.o();
    }

    @Override // androidx.appcompat.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9204a;
        z2Var.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(z2Var.f9747a, drawable);
    }

    @Override // androidx.appcompat.app.b
    public void x(int i17) {
        androidx.appcompat.widget.x0 x0Var = this.f9204a;
        y(android.view.LayoutInflater.from(((androidx.appcompat.widget.z2) x0Var).a()).inflate(i17, (android.view.ViewGroup) ((androidx.appcompat.widget.z2) x0Var).f9747a, false));
    }

    @Override // androidx.appcompat.app.b
    public void y(android.view.View view) {
        z(view, new androidx.appcompat.app.ActionBar$LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.b
    public void z(android.view.View view, androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
        if (view != null) {
            view.setLayoutParams(actionBar$LayoutParams);
        }
        ((androidx.appcompat.widget.z2) this.f9204a).c(view);
    }
}
