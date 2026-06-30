package km2;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f390607a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f390608b;

    public b0(int i17, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f390607a = i17;
        this.f390608b = content;
    }

    /* renamed from: equals */
    public boolean m143647xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.b0)) {
            return false;
        }
        km2.b0 b0Var = (km2.b0) obj;
        return this.f390607a == b0Var.f390607a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390608b, b0Var.f390608b);
    }

    /* renamed from: hashCode */
    public int m143648x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f390607a) * 31) + this.f390608b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143649x9616526c() {
        return "PayMicData(totalWecoin=" + this.f390607a + ", content=" + this.f390608b + ')';
    }
}
