package d04;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final sz3.w0 f306945a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f306946b;

    public f0(sz3.w0 data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f306945a = data;
        this.f306946b = z17;
    }

    /* renamed from: equals */
    public boolean m123303xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04.f0)) {
            return false;
        }
        d04.f0 f0Var = (d04.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306945a, f0Var.f306945a) && this.f306946b == f0Var.f306946b;
    }

    /* renamed from: hashCode */
    public int m123304x8cdac1b() {
        return (this.f306945a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f306946b);
    }

    /* renamed from: toString */
    public java.lang.String m123305x9616526c() {
        return "ScanMergeSuccessDataWrapper(data=" + this.f306945a + ", needSuccessMarkAnimation=" + this.f306946b + ')';
    }
}
