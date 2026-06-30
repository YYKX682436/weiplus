package at4;

/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f95549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95551c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f95552d;

    public y1(int i17, boolean z17, boolean z18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f95549a = i17;
        this.f95550b = z17;
        this.f95551c = z18;
        this.f95552d = callback;
    }

    /* renamed from: equals */
    public boolean m9035xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.y1)) {
            return false;
        }
        at4.y1 y1Var = (at4.y1) obj;
        return this.f95549a == y1Var.f95549a && this.f95550b == y1Var.f95550b && this.f95551c == y1Var.f95551c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95552d, y1Var.f95552d);
    }

    /* renamed from: hashCode */
    public int m9036x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f95549a) * 31) + java.lang.Boolean.hashCode(this.f95550b)) * 31) + java.lang.Boolean.hashCode(this.f95551c)) * 31) + this.f95552d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9037x9616526c() {
        return "Request(scene=" + this.f95549a + ", useCache=" + this.f95550b + ", alwaysDoScene=" + this.f95551c + ", callback=" + this.f95552d + ')';
    }
}
