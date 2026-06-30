package wd0;

/* loaded from: classes14.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final du5.c f526230a;

    /* renamed from: b, reason: collision with root package name */
    public final du5.d f526231b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f526232c;

    public b2(du5.c canceller, du5.d stateCallback, java.lang.String ticket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canceller, "canceller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateCallback, "stateCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        this.f526230a = canceller;
        this.f526231b = stateCallback;
        this.f526232c = ticket;
    }

    /* renamed from: equals */
    public boolean m173473xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.b2)) {
            return false;
        }
        wd0.b2 b2Var = (wd0.b2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526230a, b2Var.f526230a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526231b, b2Var.f526231b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526232c, b2Var.f526232c);
    }

    /* renamed from: hashCode */
    public int m173474x8cdac1b() {
        return (((this.f526230a.hashCode() * 31) + this.f526231b.hashCode()) * 31) + this.f526232c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173475x9616526c() {
        return "LaunchFingerprintParam(canceller=" + this.f526230a + ", stateCallback=" + this.f526231b + ", ticket=" + this.f526232c + ')';
    }
}
