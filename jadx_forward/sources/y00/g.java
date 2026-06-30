package y00;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f540058a;

    /* renamed from: b, reason: collision with root package name */
    public final long f540059b;

    public g(java.util.Map values, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f540058a = values;
        this.f540059b = j17;
    }

    /* renamed from: equals */
    public boolean m176251xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.g)) {
            return false;
        }
        y00.g gVar = (y00.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540058a, gVar.f540058a) && this.f540059b == gVar.f540059b;
    }

    /* renamed from: hashCode */
    public int m176252x8cdac1b() {
        return (this.f540058a.hashCode() * 31) + java.lang.Long.hashCode(this.f540059b);
    }

    /* renamed from: toString */
    public java.lang.String m176253x9616526c() {
        return "Entry(values=" + this.f540058a + ", updateTimeMs=" + this.f540059b + ')';
    }
}
