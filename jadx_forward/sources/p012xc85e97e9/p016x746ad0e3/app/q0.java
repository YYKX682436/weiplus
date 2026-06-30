package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class q0 extends p012xc85e97e9.p016x746ad0e3.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 f90737a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f90738b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window.Callback f90739c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90741e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f90742f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f90743g = new p012xc85e97e9.p016x746ad0e3.app.l0(this);

    public q0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b, java.lang.CharSequence charSequence, android.view.Window.Callback callback) {
        p012xc85e97e9.p016x746ad0e3.app.m0 m0Var = new p012xc85e97e9.p016x746ad0e3.app.m0(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2(c0102x1f44235b, false);
        this.f90737a = z2Var;
        p012xc85e97e9.p016x746ad0e3.app.p0 p0Var = new p012xc85e97e9.p016x746ad0e3.app.p0(this, callback);
        this.f90739c = p0Var;
        z2Var.f91291l = p0Var;
        c0102x1f44235b.m2842x99906709(m0Var);
        if (z2Var.f91287h) {
            return;
        }
        z2Var.f91288i = charSequence;
        if ((z2Var.f91281b & 8) != 0) {
            c0102x1f44235b.mo2849x53bfe316(charSequence);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void A(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void B(boolean z17) {
        O(z17 ? 4 : 0, 4);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void C(int i17) {
        O(i17, -1);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void D(boolean z17) {
        O(z17 ? 16 : 0, 16);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void E(boolean z17) {
        O(z17 ? 2 : 0, 2);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void F(boolean z17) {
        O(z17 ? 8 : 0, 8);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void G(float f17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.s(c0102x1f44235b, f17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void H(int i17) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).e(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a;
        z2Var.f91285f = drawable;
        z2Var.h();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void J(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void K(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a;
        if (z2Var.f91287h) {
            return;
        }
        z2Var.f91288i = charSequence;
        if ((z2Var.f91281b & 8) != 0) {
            z2Var.f91280a.mo2849x53bfe316(charSequence);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void L() {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.setVisibility(0);
    }

    public final android.view.Menu N() {
        boolean z17 = this.f90740d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90737a;
        if (!z17) {
            p012xc85e97e9.p016x746ad0e3.app.n0 n0Var = new p012xc85e97e9.p016x746ad0e3.app.n0(this);
            p012xc85e97e9.p016x746ad0e3.app.o0 o0Var = new p012xc85e97e9.p016x746ad0e3.app.o0(this);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a;
            c0102x1f44235b.S = n0Var;
            c0102x1f44235b.T = o0Var;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = c0102x1f44235b.f91011d;
            if (c0076xa566151a != null) {
                c0076xa566151a.A = n0Var;
                c0076xa566151a.B = o0Var;
            }
            this.f90740d = true;
        }
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a.m2816xfb827dd5();
    }

    public void O(int i17, int i18) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90737a;
        int i19 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91281b;
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean g() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).b();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean h() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2 u2Var = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.R;
        if (!((u2Var == null || u2Var.f91262e == null) ? false : true)) {
            return false;
        }
        o.u uVar = u2Var == null ? null : u2Var.f91262e;
        if (uVar != null) {
            uVar.collapseActionView();
        }
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void i(boolean z17) {
        if (z17 == this.f90741e) {
            return;
        }
        this.f90741e = z17;
        java.util.ArrayList arrayList = this.f90742f;
        if (arrayList.size() <= 0) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
        throw null;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.view.View j() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91283d;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int k() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91281b;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int l() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.getHeight();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.content.Context m() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).a();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public java.lang.CharSequence n() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.m2824x7531c8a2();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void o() {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.setVisibility(8);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean p() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90737a;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a;
        java.lang.Runnable runnable = this.f90743g;
        c0102x1f44235b.removeCallbacks(runnable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b2 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(c0102x1f44235b2, runnable);
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean q() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.getVisibility() == 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void r(android.content.res.Configuration configuration) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void s() {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.removeCallbacks(this.f90743g);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean t(int i17, android.view.KeyEvent keyEvent) {
        android.view.Menu N = N();
        if (N == null) {
            return false;
        }
        N.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return N.performShortcut(i17, keyEvent, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean u(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            v();
        }
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean v() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).f91280a.f91011d;
        if (c0076xa566151a == null) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = c0076xa566151a.f90873z;
        return qVar != null && qVar.o();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a;
        z2Var.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(z2Var.f91280a, drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void x(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90737a;
        y(android.view.LayoutInflater.from(((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).a()).inflate(i17, (android.view.ViewGroup) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a, false));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void y(android.view.View view) {
        z(view, new p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7(-2, -2));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void z(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
        if (view != null) {
            view.setLayoutParams(c0063x293d4d7);
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90737a).c(view);
    }
}
