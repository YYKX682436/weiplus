package lj2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400385a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.f0 f400386b;

    public e0(android.view.View attachView, lj2.f0 orientation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        this.f400385a = attachView;
        this.f400386b = orientation;
    }

    /* renamed from: equals */
    public boolean m145842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj2.e0)) {
            return false;
        }
        lj2.e0 e0Var = (lj2.e0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400385a, e0Var.f400385a) && this.f400386b == e0Var.f400386b;
    }

    /* renamed from: hashCode */
    public int m145843x8cdac1b() {
        return (this.f400385a.hashCode() * 31) + this.f400386b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145844x9616526c() {
        return "AttachData(attachView=" + this.f400385a + ", orientation=" + this.f400386b + ')';
    }
}
