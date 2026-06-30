package wl2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f528578a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f528579b;

    public b(boolean z17, java.lang.String error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f528578a = z17;
        this.f528579b = error;
    }

    public final wl2.b a(wl2.b otherResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherResult, "otherResult");
        return new wl2.b(this.f528578a && otherResult.f528578a, this.f528579b + '\n' + otherResult.f528579b);
    }

    /* renamed from: equals */
    public boolean m174129xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2.b)) {
            return false;
        }
        wl2.b bVar = (wl2.b) obj;
        return this.f528578a == bVar.f528578a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528579b, bVar.f528579b);
    }

    /* renamed from: hashCode */
    public int m174130x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f528578a) * 31) + this.f528579b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174131x9616526c() {
        return "Result(result=" + this.f528578a + ", error=" + this.f528579b + ')';
    }
}
