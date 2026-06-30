package rl1;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f478711a;

    /* renamed from: b, reason: collision with root package name */
    public final double f478712b;

    public g(double d17, double d18) {
        this.f478711a = d17;
        this.f478712b = d18;
    }

    /* renamed from: equals */
    public boolean m162701xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof rl1.g)) {
            return false;
        }
        rl1.g gVar = (rl1.g) obj;
        return this.f478711a == gVar.f478711a && this.f478712b == gVar.f478712b;
    }

    /* renamed from: toString */
    public java.lang.String m162702x9616526c() {
        return "Point{x=" + this.f478711a + ", y=" + this.f478712b + '}';
    }
}
