package aq3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f94695a;

    /* renamed from: b, reason: collision with root package name */
    public int f94696b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94697c;

    public b(long j17, int i17, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f94695a = j17;
        this.f94696b = i17;
        this.f94697c = name;
    }

    /* renamed from: equals */
    public boolean m8874xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.b)) {
            return false;
        }
        aq3.b bVar = (aq3.b) obj;
        return this.f94695a == bVar.f94695a && this.f94696b == bVar.f94696b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94697c, bVar.f94697c);
    }

    /* renamed from: hashCode */
    public int m8875x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f94695a) * 31) + java.lang.Integer.hashCode(this.f94696b)) * 31) + this.f94697c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8876x9616526c() {
        return "{name=" + this.f94697c + " threadTime=" + this.f94695a + " count=" + this.f94696b + '}';
    }
}
