package ty2;

/* loaded from: classes5.dex */
public final class a0 implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f504589a;

    /* renamed from: b, reason: collision with root package name */
    public final float f504590b;

    public a0(int i17, float f17) {
        this.f504589a = i17;
        this.f504590b = f17;
    }

    /* renamed from: equals */
    public boolean m167214xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.a0)) {
            return false;
        }
        ty2.a0 a0Var = (ty2.a0) obj;
        return this.f504589a == a0Var.f504589a && java.lang.Float.compare(this.f504590b, a0Var.f504590b) == 0;
    }

    /* renamed from: hashCode */
    public int m167215x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f504589a) * 31) + java.lang.Float.hashCode(this.f504590b);
    }

    /* renamed from: toString */
    public java.lang.String m167216x9616526c() {
        return "Config(maxLineType=" + this.f504589a + ", lineSpacingExtraDp=" + this.f504590b + ')';
    }
}
