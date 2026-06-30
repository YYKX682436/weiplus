package y;

/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f539907a;

    /* renamed from: b, reason: collision with root package name */
    public final float f539908b;

    /* renamed from: c, reason: collision with root package name */
    public final long f539909c;

    public j1(float f17, float f18, long j17) {
        this.f539907a = f17;
        this.f539908b = f18;
        this.f539909c = j17;
    }

    /* renamed from: equals */
    public boolean m176218xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.j1)) {
            return false;
        }
        y.j1 j1Var = (y.j1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f539907a), java.lang.Float.valueOf(j1Var.f539907a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f539908b), java.lang.Float.valueOf(j1Var.f539908b)) && this.f539909c == j1Var.f539909c;
    }

    /* renamed from: hashCode */
    public int m176219x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f539907a) * 31) + java.lang.Float.hashCode(this.f539908b)) * 31) + java.lang.Long.hashCode(this.f539909c);
    }

    /* renamed from: toString */
    public java.lang.String m176220x9616526c() {
        return "FlingInfo(initialVelocity=" + this.f539907a + ", distance=" + this.f539908b + ", duration=" + this.f539909c + ')';
    }
}
