package ni3;

/* loaded from: classes10.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni3.p0 f419150a;

    /* renamed from: b, reason: collision with root package name */
    public int f419151b;

    public j1(ni3.p0 feedLife, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLife, "feedLife");
        this.f419150a = feedLife;
        this.f419151b = i17;
    }

    /* renamed from: equals */
    public boolean m149646xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.j1)) {
            return false;
        }
        ni3.j1 j1Var = (ni3.j1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419150a, j1Var.f419150a) && this.f419151b == j1Var.f419151b;
    }

    /* renamed from: hashCode */
    public int m149647x8cdac1b() {
        return (this.f419150a.m149666x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f419151b);
    }

    /* renamed from: toString */
    public java.lang.String m149648x9616526c() {
        return this.f419150a.f419204b + " - stage:play - " + this.f419151b;
    }
}
