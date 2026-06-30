package ee;

/* loaded from: classes7.dex */
public final class a implements pi1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f332938a;

    /* renamed from: b, reason: collision with root package name */
    public pi1.d f332939b = null;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f332938a = v5Var;
    }

    @Override // pi1.e
    public void a() {
        this.f332939b = pi1.d.HIDDEN;
        e(true);
    }

    @Override // pi1.e
    public void b() {
    }

    @Override // pi1.e
    public void c() {
        if (this.f332939b == null) {
            this.f332939b = this.f332938a.t3().m0().f387281r.f387084b ? pi1.d.SHOWN : pi1.d.HIDDEN;
        }
        int ordinal = this.f332939b.ordinal();
        if (ordinal == 0) {
            d();
        } else {
            if (ordinal != 1) {
                return;
            }
            a();
        }
    }

    @Override // pi1.e
    public void d() {
        android.view.Window window;
        this.f332939b = pi1.d.SHOWN;
        e(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f332938a;
        if (!(v5Var.mo50352x76847179() instanceof android.app.Activity) || (window = ((android.app.Activity) v5Var.mo50352x76847179()).getWindow()) == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public final void e(boolean z17) {
        android.app.Activity a17 = q75.a.a(this.f332938a.mo50352x76847179());
        if (a17 == null) {
            return;
        }
        android.view.Window window = a17.getWindow();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.h(window, true, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.h(window, false, false);
        }
    }

    @Override // pi1.e
    /* renamed from: getCurrentState */
    public pi1.d mo127344xb7d72d0e() {
        return this.f332939b;
    }
}
