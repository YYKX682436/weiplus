package ng1;

/* loaded from: classes7.dex */
public final class p extends ng1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418480a;

    public p(java.lang.String str) {
        super(null);
        this.f418480a = str;
    }

    /* renamed from: equals */
    public boolean m149562xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1.p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418480a, ((ng1.p) obj).f418480a);
    }

    /* renamed from: hashCode */
    public int m149563x8cdac1b() {
        java.lang.String str = this.f418480a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149564x9616526c() {
        return "NetworkError(message=" + this.f418480a + ')';
    }
}
