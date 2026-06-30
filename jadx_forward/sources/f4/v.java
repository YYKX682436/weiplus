package f4;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340945a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f340946b;

    public v(java.lang.String stateName, java.lang.String state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f340945a = stateName;
        this.f340946b = state;
    }

    /* renamed from: equals */
    public boolean m129011xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f4.v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.metrics.performance.StateInfo");
        f4.v vVar = (f4.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340945a, vVar.f340945a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340946b, vVar.f340946b);
    }

    /* renamed from: hashCode */
    public int m129012x8cdac1b() {
        return (this.f340945a.hashCode() * 31) + this.f340946b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129013x9616526c() {
        return this.f340945a + ": " + this.f340946b;
    }
}
