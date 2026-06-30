package i1;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public float f368365a;

    /* renamed from: b, reason: collision with root package name */
    public float f368366b;

    public b0(float f17, float f18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 0.0f : f17;
        f18 = (i17 & 2) != 0 ? 0.0f : f18;
        this.f368365a = f17;
        this.f368366b = f18;
    }

    public final void a() {
        this.f368365a = 0.0f;
        this.f368366b = 0.0f;
    }

    /* renamed from: equals */
    public boolean m134426xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.b0)) {
            return false;
        }
        i1.b0 b0Var = (i1.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368365a), java.lang.Float.valueOf(b0Var.f368365a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368366b), java.lang.Float.valueOf(b0Var.f368366b));
    }

    /* renamed from: hashCode */
    public int m134427x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368365a) * 31) + java.lang.Float.hashCode(this.f368366b);
    }

    /* renamed from: toString */
    public java.lang.String m134428x9616526c() {
        return "PathPoint(x=" + this.f368365a + ", y=" + this.f368366b + ')';
    }
}
