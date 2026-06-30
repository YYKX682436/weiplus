package a0;

/* loaded from: classes14.dex */
public final class j2 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0.j2 f81720c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0.j2 f81721d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81722a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81723b;

    static {
        long j17 = p2.k.f432918c;
        f81720c = new a0.j2(false, j17, Float.NaN, Float.NaN, true, false, null);
        f81721d = new a0.j2(true, j17, Float.NaN, Float.NaN, true, false, null);
    }

    public j2(boolean z17, long j17, float f17, float f18, boolean z18, boolean z19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f81722a = z17;
        this.f81723b = j17;
    }

    /* renamed from: equals */
    public boolean m166xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.j2)) {
            return false;
        }
        a0.j2 j2Var = (a0.j2) obj;
        if (this.f81722a != j2Var.f81722a) {
            return false;
        }
        return ((this.f81723b > j2Var.f81723b ? 1 : (this.f81723b == j2Var.f81723b ? 0 : -1)) == 0) && p2.h.a(Float.NaN, Float.NaN) && p2.h.a(Float.NaN, Float.NaN);
    }

    /* renamed from: hashCode */
    public int m167x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f81722a) * 31;
        int i17 = p2.k.f432919d;
        return ((((((((hashCode + java.lang.Long.hashCode(this.f81723b)) * 31) + java.lang.Float.hashCode(Float.NaN)) * 31) + java.lang.Float.hashCode(Float.NaN)) * 31) + java.lang.Boolean.hashCode(true)) * 31) + java.lang.Boolean.hashCode(false);
    }

    /* renamed from: toString */
    public java.lang.String m168x9616526c() {
        if (this.f81722a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((java.lang.Object) p2.k.c(this.f81723b)) + ", cornerRadius=" + ((java.lang.Object) p2.h.b(Float.NaN)) + ", elevation=" + ((java.lang.Object) p2.h.b(Float.NaN)) + ", clippingEnabled=true, fishEyeEnabled=false)";
    }
}
