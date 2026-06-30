package x3;

/* loaded from: classes15.dex */
public class g extends x3.n {

    /* renamed from: d, reason: collision with root package name */
    public int f533104d;

    public g(x3.h hVar) {
    }

    @Override // x3.n
    public int a(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230, android.view.View view, x3.j jVar, int i17, boolean z17) {
        return java.lang.Math.max(0, super.a(c1110x93624230, view, jVar, i17, z17));
    }

    @Override // x3.n
    public void b(int i17, int i18) {
        super.b(i17, i18);
        this.f533104d = java.lang.Math.max(this.f533104d, i17 + i18);
    }

    @Override // x3.n
    public void c() {
        super.c();
        this.f533104d = Integer.MIN_VALUE;
    }

    @Override // x3.n
    public int d(boolean z17) {
        return java.lang.Math.max(super.d(z17), this.f533104d);
    }
}
