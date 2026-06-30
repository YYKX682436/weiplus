package y;

/* loaded from: classes14.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final z.e f539957a;

    /* renamed from: b, reason: collision with root package name */
    public long f539958b;

    public p1(z.e eVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f539957a = eVar;
        this.f539958b = j17;
    }

    /* renamed from: equals */
    public boolean m176226xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.p1)) {
            return false;
        }
        y.p1 p1Var = (y.p1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539957a, p1Var.f539957a) && p2.q.a(this.f539958b, p1Var.f539958b);
    }

    /* renamed from: hashCode */
    public int m176227x8cdac1b() {
        return (this.f539957a.hashCode() * 31) + java.lang.Long.hashCode(this.f539958b);
    }

    /* renamed from: toString */
    public java.lang.String m176228x9616526c() {
        return "AnimData(anim=" + this.f539957a + ", startSize=" + ((java.lang.Object) p2.q.c(this.f539958b)) + ')';
    }
}
