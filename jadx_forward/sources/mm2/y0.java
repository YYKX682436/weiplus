package mm2;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final qs5.m f411081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f411082b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f411083c;

    public y0(qs5.m result, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        this.f411081a = result;
        this.f411082b = i17;
        this.f411083c = bundle;
    }

    /* renamed from: equals */
    public boolean m148034xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y0)) {
            return false;
        }
        mm2.y0 y0Var = (mm2.y0) obj;
        return this.f411081a == y0Var.f411081a && this.f411082b == y0Var.f411082b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411083c, y0Var.f411083c);
    }

    /* renamed from: hashCode */
    public int m148035x8cdac1b() {
        return (((this.f411081a.hashCode() * 31) + java.lang.Integer.hashCode(this.f411082b)) * 31) + this.f411083c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148036x9616526c() {
        return "GiftConstantClickResultData(result=" + this.f411081a + ", scene=" + this.f411082b + ", bundle=" + this.f411083c + ')';
    }
}
