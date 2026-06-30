package oh5;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f427051a;

    /* renamed from: b, reason: collision with root package name */
    public final long f427052b;

    public q(java.lang.Object obj, long j17) {
        this.f427051a = obj;
        this.f427052b = j17;
    }

    /* renamed from: equals */
    public boolean m151415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5.q)) {
            return false;
        }
        oh5.q qVar = (oh5.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427051a, qVar.f427051a) && this.f427052b == qVar.f427052b;
    }

    /* renamed from: hashCode */
    public int m151416x8cdac1b() {
        java.lang.Object obj = this.f427051a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f427052b);
    }

    /* renamed from: toString */
    public java.lang.String m151417x9616526c() {
        return "WhiteListItem(value=" + this.f427051a + ", expiredTimeMillis=" + this.f427052b + ')';
    }
}
