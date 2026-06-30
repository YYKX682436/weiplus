package n3;

/* loaded from: classes14.dex */
public class k3 extends n3.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowInsetsController f415891a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.s0 f415892b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f415893c;

    public k3(android.view.Window window, n3.m3 m3Var, n3.s0 s0Var) {
        this.f415891a = window.getInsetsController();
        this.f415892b = s0Var;
        this.f415893c = window;
    }

    @Override // n3.l3
    public void a(int i17) {
        if ((i17 & 8) != 0) {
            this.f415892b.f415931a.a();
        }
        this.f415891a.hide(i17 & (-9));
    }

    @Override // n3.l3
    public boolean b() {
        return (this.f415891a.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // n3.l3
    public boolean c() {
        return (this.f415891a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // n3.l3
    public void d(boolean z17) {
        android.view.WindowInsetsController windowInsetsController = this.f415891a;
        android.view.Window window = this.f415893c;
        if (z17) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // n3.l3
    public void e(boolean z17) {
        android.view.WindowInsetsController windowInsetsController = this.f415891a;
        android.view.Window window = this.f415893c;
        if (z17) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // n3.l3
    public void f(int i17) {
        this.f415891a.setSystemBarsBehavior(i17);
    }

    @Override // n3.l3
    public void g(int i17) {
        if ((i17 & 8) != 0) {
            this.f415892b.f415931a.b();
        }
        this.f415891a.show(i17 & (-9));
    }
}
