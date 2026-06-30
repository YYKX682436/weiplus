package gr5;

/* loaded from: classes13.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f356460a;

    /* renamed from: b, reason: collision with root package name */
    public final float f356461b;

    /* renamed from: c, reason: collision with root package name */
    public final float f356462c;

    public g0(float f17, float f18, float f19) {
        this.f356460a = f17;
        this.f356461b = f18;
        this.f356462c = f19;
    }

    /* renamed from: equals */
    public boolean m132107xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.g0)) {
            return false;
        }
        gr5.g0 g0Var = (gr5.g0) obj;
        return java.lang.Float.compare(this.f356460a, g0Var.f356460a) == 0 && java.lang.Float.compare(this.f356461b, g0Var.f356461b) == 0 && java.lang.Float.compare(this.f356462c, g0Var.f356462c) == 0;
    }

    /* renamed from: hashCode */
    public int m132108x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f356460a) * 31) + java.lang.Float.hashCode(this.f356461b)) * 31) + java.lang.Float.hashCode(this.f356462c);
    }

    /* renamed from: toString */
    public java.lang.String m132109x9616526c() {
        return "Result(minScale=" + zq5.b.c(this.f356460a, 2) + ", mediumScale=" + zq5.b.c(this.f356461b, 2) + ", maxScale=" + zq5.b.c(this.f356462c, 2) + ')';
    }
}
