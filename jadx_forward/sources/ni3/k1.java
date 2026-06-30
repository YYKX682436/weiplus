package ni3;

/* loaded from: classes10.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni3.l1 f419154a;

    /* renamed from: b, reason: collision with root package name */
    public final ni3.p0 f419155b;

    /* renamed from: c, reason: collision with root package name */
    public int f419156c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419157d;

    public k1(ni3.l1 stage, ni3.p0 feedLife, int i17, java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLife, "feedLife");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f419154a = stage;
        this.f419155b = feedLife;
        this.f419156c = i17;
        this.f419157d = reason;
    }

    /* renamed from: equals */
    public boolean m149649xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.k1)) {
            return false;
        }
        ni3.k1 k1Var = (ni3.k1) obj;
        return this.f419154a == k1Var.f419154a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419155b, k1Var.f419155b) && this.f419156c == k1Var.f419156c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419157d, k1Var.f419157d);
    }

    /* renamed from: hashCode */
    public int m149650x8cdac1b() {
        return (((((this.f419154a.hashCode() * 31) + this.f419155b.m149666x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f419156c)) * 31) + this.f419157d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149651x9616526c() {
        return this.f419155b.f419204b + " - stage:" + this.f419154a + " - " + this.f419156c + " - " + this.f419157d;
    }
}
