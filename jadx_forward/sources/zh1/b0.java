package zh1;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zh1.y0 f554396a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f554397b;

    public b0(zh1.y0 type, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f554396a = type;
        this.f554397b = z17;
    }

    /* renamed from: equals */
    public boolean m178955xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh1.b0)) {
            return false;
        }
        zh1.b0 b0Var = (zh1.b0) obj;
        return this.f554396a == b0Var.f554396a && this.f554397b == b0Var.f554397b;
    }

    /* renamed from: hashCode */
    public int m178956x8cdac1b() {
        return (this.f554396a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f554397b);
    }

    /* renamed from: toString */
    public java.lang.String m178957x9616526c() {
        return "EnhanceState(type=" + this.f554396a + ", hidden=" + this.f554397b + ')';
    }
}
