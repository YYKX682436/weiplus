package d82;

/* loaded from: classes11.dex */
public final class d extends d82.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String compressedPath) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compressedPath, "compressedPath");
        this.f308458a = compressedPath;
    }

    /* renamed from: equals */
    public boolean m123653xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d82.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308458a, ((d82.d) obj).f308458a);
    }

    /* renamed from: hashCode */
    public int m123654x8cdac1b() {
        return this.f308458a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123655x9616526c() {
        return "Success(compressedPath=" + this.f308458a + ')';
    }
}
