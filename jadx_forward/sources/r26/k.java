package r26;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f450433a;

    /* renamed from: b, reason: collision with root package name */
    public final e06.k f450434b;

    public k(java.lang.String value, e06.k range) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        this.f450433a = value;
        this.f450434b = range;
    }

    /* renamed from: equals */
    public boolean m161397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r26.k)) {
            return false;
        }
        r26.k kVar = (r26.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f450433a, kVar.f450433a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f450434b, kVar.f450434b);
    }

    /* renamed from: hashCode */
    public int m161398x8cdac1b() {
        return (this.f450433a.hashCode() * 31) + this.f450434b.mo126624x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m161399x9616526c() {
        return "MatchGroup(value=" + this.f450433a + ", range=" + this.f450434b + ')';
    }
}
