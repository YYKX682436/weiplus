package pr4;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.p f439572a;

    public n(pr4.p status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f439572a = status;
    }

    /* renamed from: equals */
    public boolean m158917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.n) && this.f439572a == ((pr4.n) obj).f439572a;
    }

    /* renamed from: hashCode */
    public int m158918x8cdac1b() {
        return this.f439572a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158919x9616526c() {
        return "WeCoinSubscribeResult(status=" + this.f439572a + ')';
    }
}
