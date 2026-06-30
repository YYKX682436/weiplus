package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f391713a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f391714b;

    public f0(java.lang.Object obj, yz5.l lVar) {
        this.f391713a = obj;
        this.f391714b = lVar;
    }

    /* renamed from: equals */
    public boolean m143990xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.f0)) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.f0 f0Var = (p3325xe03a0797.p3326xc267989b.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391713a, f0Var.f391713a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391714b, f0Var.f391714b);
    }

    /* renamed from: hashCode */
    public int m143991x8cdac1b() {
        java.lang.Object obj = this.f391713a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f391714b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143992x9616526c() {
        return "CompletedWithCancellation(result=" + this.f391713a + ", onCancellation=" + this.f391714b + ')';
    }
}
