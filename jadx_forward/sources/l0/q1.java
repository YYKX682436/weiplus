package l0;

/* loaded from: classes14.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.a f396002a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.a f396003b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.a f396004c;

    public q1(i0.a small, i0.a medium, i0.a large, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        small = (i17 & 1) != 0 ? i0.h.a(4) : small;
        medium = (i17 & 2) != 0 ? i0.h.a(4) : medium;
        large = (i17 & 4) != 0 ? i0.h.a(0) : large;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(small, "small");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(medium, "medium");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(large, "large");
        this.f396002a = small;
        this.f396003b = medium;
        this.f396004c = large;
    }

    /* renamed from: equals */
    public boolean m144752xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.q1)) {
            return false;
        }
        l0.q1 q1Var = (l0.q1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396002a, q1Var.f396002a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396003b, q1Var.f396003b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f396004c, q1Var.f396004c);
    }

    /* renamed from: hashCode */
    public int m144753x8cdac1b() {
        return (((this.f396002a.hashCode() * 31) + this.f396003b.hashCode()) * 31) + this.f396004c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144754x9616526c() {
        return "Shapes(small=" + this.f396002a + ", medium=" + this.f396003b + ", large=" + this.f396004c + ')';
    }
}
