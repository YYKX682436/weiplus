package wi5;

/* loaded from: classes.dex */
public final class w0 implements j75.e {

    /* renamed from: a, reason: collision with root package name */
    public final wi5.v0 f527890a;

    /* renamed from: b, reason: collision with root package name */
    public final wi5.u0 f527891b;

    public w0(wi5.v0 operation, wi5.u0 retCode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retCode, "retCode");
        this.f527890a = operation;
        this.f527891b = retCode;
    }

    /* renamed from: equals */
    public boolean m173866xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.w0)) {
            return false;
        }
        wi5.w0 w0Var = (wi5.w0) obj;
        return this.f527890a == w0Var.f527890a && this.f527891b == w0Var.f527891b;
    }

    /* renamed from: hashCode */
    public int m173867x8cdac1b() {
        return (this.f527890a.hashCode() * 31) + this.f527891b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173868x9616526c() {
        return "SelectUserActionResult(operation=" + this.f527890a + ", retCode=" + this.f527891b + ')';
    }
}
