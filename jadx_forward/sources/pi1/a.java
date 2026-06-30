package pi1;

/* loaded from: classes7.dex */
public class a extends pi1.b {

    /* renamed from: c, reason: collision with root package name */
    public int f436288c;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        super(v5Var);
        this.f436288c = 0;
    }

    @Override // pi1.e
    public void a() {
        android.view.Window window;
        this.f436290b.set(pi1.d.HIDDEN);
        android.app.Activity a17 = q75.a.a(this.f436289a.getF229340d());
        if (a17 == null || a17.isFinishing() || a17.isDestroyed() || (window = a17.getWindow()) == null) {
            return;
        }
        window.addFlags(1024);
        android.view.View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
    }

    @Override // pi1.e
    public void b() {
    }

    @Override // pi1.b, pi1.e
    public void c() {
        super.c();
        int ordinal = ((pi1.d) this.f436290b.get()).ordinal();
        if (ordinal == 0) {
            f(true);
        } else {
            if (ordinal != 1) {
                return;
            }
            a();
        }
    }

    @Override // pi1.e
    public void d() {
        f(false);
    }

    public void e(boolean z17, int i17) {
        boolean z18 = i17 != this.f436288c;
        this.f436288c = i17;
        if (2 != i17) {
            if ((z18 || this.f436290b.get() == pi1.d.SHOWN) && !z17) {
                f(false);
                return;
            }
            return;
        }
        android.app.Activity v17 = this.f436289a.v1();
        if ((v17 != null && v17.isInMultiWindowMode() && v17.getRequestedOrientation() == 1) || z17) {
            return;
        }
        a();
    }

    public final void f(boolean z17) {
        android.view.Window window;
        this.f436290b.set(pi1.d.SHOWN);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f436289a;
        if (!(v5Var.getF229340d() instanceof android.app.Activity) || (window = ((android.app.Activity) v5Var.getF229340d()).getWindow()) == null) {
            return;
        }
        android.view.View decorView = window.getDecorView();
        window.clearFlags(1024);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5));
    }
}
