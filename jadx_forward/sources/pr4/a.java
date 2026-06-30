package pr4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.j f439518a;

    public a(pr4.j type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f439518a = type;
    }

    /* renamed from: equals */
    public boolean m158893xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.a) && this.f439518a == ((pr4.a) obj).f439518a;
    }

    /* renamed from: hashCode */
    public int m158894x8cdac1b() {
        return this.f439518a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158895x9616526c() {
        return "ConsumeError(type=" + this.f439518a + ')';
    }
}
