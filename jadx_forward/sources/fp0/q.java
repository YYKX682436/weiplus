package fp0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f346808a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f346809b;

    public q(java.lang.Object obj, java.util.Queue second) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(second, "second");
        this.f346808a = obj;
        this.f346809b = second;
    }

    /* renamed from: equals */
    public boolean m129987xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0.q)) {
            return false;
        }
        fp0.q qVar = (fp0.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346808a, qVar.f346808a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346809b, qVar.f346809b);
    }

    /* renamed from: hashCode */
    public int m129988x8cdac1b() {
        java.lang.Object obj = this.f346808a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f346809b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129989x9616526c() {
        return "LoaderPair(first=" + this.f346808a + ", second=" + this.f346809b + ')';
    }
}
