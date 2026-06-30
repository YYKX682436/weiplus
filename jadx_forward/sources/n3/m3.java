package n3;

/* loaded from: classes11.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final n3.l3 f415907a;

    public m3(android.view.Window window, android.view.View view) {
        n3.s0 s0Var = new n3.s0(view);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            this.f415907a = new n3.k3(window, this, s0Var);
        } else if (i17 >= 26) {
            this.f415907a = new n3.j3(window, s0Var);
        } else {
            this.f415907a = new n3.i3(window, s0Var);
        }
    }

    public void a(int i17) {
        this.f415907a.a(i17);
    }

    public void b(boolean z17) {
        this.f415907a.d(z17);
    }

    public void c(boolean z17) {
        this.f415907a.e(z17);
    }
}
