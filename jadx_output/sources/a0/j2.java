package a0;

/* loaded from: classes14.dex */
public final class j2 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0.j2 f187c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0.j2 f188d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f189a;

    /* renamed from: b, reason: collision with root package name */
    public final long f190b;

    static {
        long j17 = p2.k.f351385c;
        f187c = new a0.j2(false, j17, Float.NaN, Float.NaN, true, false, null);
        f188d = new a0.j2(true, j17, Float.NaN, Float.NaN, true, false, null);
    }

    public j2(boolean z17, long j17, float f17, float f18, boolean z18, boolean z19, kotlin.jvm.internal.i iVar) {
        this.f189a = z17;
        this.f190b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0.j2)) {
            return false;
        }
        a0.j2 j2Var = (a0.j2) obj;
        if (this.f189a != j2Var.f189a) {
            return false;
        }
        return ((this.f190b > j2Var.f190b ? 1 : (this.f190b == j2Var.f190b ? 0 : -1)) == 0) && p2.h.a(Float.NaN, Float.NaN) && p2.h.a(Float.NaN, Float.NaN);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f189a) * 31;
        int i17 = p2.k.f351386d;
        return ((((((((hashCode + java.lang.Long.hashCode(this.f190b)) * 31) + java.lang.Float.hashCode(Float.NaN)) * 31) + java.lang.Float.hashCode(Float.NaN)) * 31) + java.lang.Boolean.hashCode(true)) * 31) + java.lang.Boolean.hashCode(false);
    }

    public java.lang.String toString() {
        if (this.f189a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((java.lang.Object) p2.k.c(this.f190b)) + ", cornerRadius=" + ((java.lang.Object) p2.h.b(Float.NaN)) + ", elevation=" + ((java.lang.Object) p2.h.b(Float.NaN)) + ", clippingEnabled=true, fishEyeEnabled=false)";
    }
}
