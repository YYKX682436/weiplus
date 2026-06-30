package x3;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f533115a;

    /* renamed from: b, reason: collision with root package name */
    public int f533116b;

    /* renamed from: c, reason: collision with root package name */
    public int f533117c;

    public n() {
        c();
    }

    public int a(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230, android.view.View view, x3.j jVar, int i17, boolean z17) {
        return this.f533115a - jVar.a(view, i17, n3.p1.a(c1110x93624230));
    }

    public void b(int i17, int i18) {
        this.f533115a = java.lang.Math.max(this.f533115a, i17);
        this.f533116b = java.lang.Math.max(this.f533116b, i18);
    }

    public void c() {
        this.f533115a = Integer.MIN_VALUE;
        this.f533116b = Integer.MIN_VALUE;
        this.f533117c = 2;
    }

    public int d(boolean z17) {
        if (!z17) {
            int i17 = this.f533117c;
            android.util.Printer printer = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93063o;
            if ((i17 & 2) != 0) {
                return 100000;
            }
        }
        return this.f533115a + this.f533116b;
    }

    /* renamed from: toString */
    public java.lang.String m174931x9616526c() {
        return "Bounds{before=" + this.f533115a + ", after=" + this.f533116b + '}';
    }
}
