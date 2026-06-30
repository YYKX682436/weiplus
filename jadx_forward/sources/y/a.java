package y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f539836a;

    /* renamed from: b, reason: collision with root package name */
    public final float f539837b;

    public a(float f17, float f18) {
        this.f539836a = f17;
        this.f539837b = f18;
    }

    /* renamed from: equals */
    public boolean m176192xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.a)) {
            return false;
        }
        y.a aVar = (y.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f539836a), java.lang.Float.valueOf(aVar.f539836a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f539837b), java.lang.Float.valueOf(aVar.f539837b));
    }

    /* renamed from: hashCode */
    public int m176193x8cdac1b() {
        return (java.lang.Float.hashCode(this.f539836a) * 31) + java.lang.Float.hashCode(this.f539837b);
    }

    /* renamed from: toString */
    public java.lang.String m176194x9616526c() {
        return "FlingResult(distanceCoefficient=" + this.f539836a + ", velocityCoefficient=" + this.f539837b + ')';
    }
}
