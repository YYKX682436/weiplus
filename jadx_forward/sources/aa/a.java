package aa;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p251x2e7b10.C2693xf62d183c f84008a;

    /* renamed from: b, reason: collision with root package name */
    public int f84009b;

    /* renamed from: c, reason: collision with root package name */
    public int f84010c;

    public a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p251x2e7b10.C2693xf62d183c c2693xf62d183c) {
        this.f84008a = c2693xf62d183c;
    }

    public final void a() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p251x2e7b10.C2693xf62d183c c2693xf62d183c = this.f84008a;
        c2693xf62d183c.f91919f.set(c2693xf62d183c.m6983xd4c35f75() + this.f84010c, c2693xf62d183c.m6985xa3c45c27() + this.f84010c, c2693xf62d183c.m6984xc3fef06e() + this.f84010c, c2693xf62d183c.m6982xa0ec3619() + this.f84010c);
        ((w.b) p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5.f91916m).c(c2693xf62d183c.f91921h);
    }

    public void b() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p251x2e7b10.C2693xf62d183c c2693xf62d183c = this.f84008a;
        gradientDrawable.setCornerRadius(c2693xf62d183c.m6988x2d258f88());
        int i17 = this.f84009b;
        if (i17 != -1) {
            gradientDrawable.setStroke(this.f84010c, i17);
        }
        c2693xf62d183c.setForeground(gradientDrawable);
    }
}
