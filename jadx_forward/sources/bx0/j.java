package bx0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public e3.d f117828a;

    /* renamed from: b, reason: collision with root package name */
    public final int f117829b;

    public j(e3.d insets, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        this.f117828a = insets;
        this.f117829b = i17;
    }

    /* renamed from: equals */
    public boolean m13546xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx0.j)) {
            return false;
        }
        bx0.j jVar = (bx0.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f117828a, jVar.f117828a) && this.f117829b == jVar.f117829b;
    }

    /* renamed from: hashCode */
    public int m13547x8cdac1b() {
        return (this.f117828a.m126835x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f117829b);
    }

    /* renamed from: toString */
    public java.lang.String m13548x9616526c() {
        return "TimelineUIStyle(insets=" + this.f117828a + ", storylineHeight=" + this.f117829b + ')';
    }
}
