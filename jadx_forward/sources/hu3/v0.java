package hu3;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f366742a;

    /* renamed from: b, reason: collision with root package name */
    public final ct0.b f366743b;

    static {
        new hu3.u0(null);
    }

    public v0(int i17, ct0.b bVar) {
        this.f366742a = i17;
        this.f366743b = bVar;
    }

    /* renamed from: equals */
    public boolean m134160xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.v0)) {
            return false;
        }
        hu3.v0 v0Var = (hu3.v0) obj;
        return this.f366742a == v0Var.f366742a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f366743b, v0Var.f366743b);
    }

    /* renamed from: hashCode */
    public int m134161x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f366742a) * 31;
        ct0.b bVar = this.f366743b;
        return hashCode + (bVar == null ? 0 : bVar.m122691x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m134162x9616526c() {
        return "TemplateResult(result=" + this.f366742a + ", captureInfo=" + this.f366743b + ')';
    }
}
