package z;

/* loaded from: classes13.dex */
public final class p1 implements z.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f550314a;

    /* renamed from: b, reason: collision with root package name */
    public final float f550315b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f550316c;

    public p1(float f17, float f18, java.lang.Object obj) {
        this.f550314a = f17;
        this.f550315b = f18;
        this.f550316c = obj;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(converter, "converter");
        java.lang.Object obj = this.f550316c;
        return new z.d4(this.f550314a, this.f550315b, obj == null ? null : (z.w) ((z.x2) converter).f550406a.mo146xb9724478(obj));
    }

    /* renamed from: equals */
    public boolean m178180xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.p1)) {
            return false;
        }
        z.p1 p1Var = (z.p1) obj;
        if (p1Var.f550314a == this.f550314a) {
            return ((p1Var.f550315b > this.f550315b ? 1 : (p1Var.f550315b == this.f550315b ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p1Var.f550316c, this.f550316c);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178181x8cdac1b() {
        java.lang.Object obj = this.f550316c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + java.lang.Float.hashCode(this.f550314a)) * 31) + java.lang.Float.hashCode(this.f550315b);
    }

    public /* synthetic */ p1(float f17, float f18, java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 1.0f : f17, (i17 & 2) != 0 ? 1500.0f : f18, (i17 & 4) != 0 ? null : obj);
    }
}
