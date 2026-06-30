package v2;

/* loaded from: classes15.dex */
public class p extends v2.q {

    /* renamed from: c, reason: collision with root package name */
    public float f514260c = 0.0f;

    public void f() {
        this.f514262b = 0;
        this.f514261a.clear();
        this.f514260c = 0.0f;
    }

    public void g(int i17) {
        int i18 = this.f514262b;
        if (i18 == 0 || this.f514260c != i17) {
            this.f514260c = i17;
            if (i18 == 1) {
                c();
            }
            b();
        }
    }
}
