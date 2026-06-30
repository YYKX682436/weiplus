package he1;

/* loaded from: classes15.dex */
public final class j extends he1.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String data) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f362417a = data;
    }

    /* renamed from: equals */
    public boolean m133449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he1.j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362417a, ((he1.j) obj).f362417a);
    }

    /* renamed from: hashCode */
    public int m133450x8cdac1b() {
        return this.f362417a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133451x9616526c() {
        return "Success(data=" + this.f362417a + ')';
    }
}
