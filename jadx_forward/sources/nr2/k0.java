package nr2;

/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f420779a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f420780b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f420781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420782d;

    public k0(boolean z17, java.lang.String failReason, java.lang.String errMsg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failReason, "failReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f420779a = z17;
        this.f420780b = failReason;
        this.f420781c = errMsg;
        this.f420782d = i17;
    }

    /* renamed from: equals */
    public boolean m149931xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr2.k0)) {
            return false;
        }
        nr2.k0 k0Var = (nr2.k0) obj;
        return this.f420779a == k0Var.f420779a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420780b, k0Var.f420780b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420781c, k0Var.f420781c) && this.f420782d == k0Var.f420782d;
    }

    /* renamed from: hashCode */
    public int m149932x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f420779a) * 31) + this.f420780b.hashCode()) * 31) + this.f420781c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f420782d);
    }

    /* renamed from: toString */
    public java.lang.String m149933x9616526c() {
        return "PayResult(success=" + this.f420779a + ", failReason=" + this.f420780b + ", errMsg=" + this.f420781c + ", errorCode=" + this.f420782d + ')';
    }
}
