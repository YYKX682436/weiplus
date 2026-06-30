package ky;

/* loaded from: classes14.dex */
public final class b0 extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f394866a;

    /* renamed from: b, reason: collision with root package name */
    public final float f394867b;

    public b0(float f17, float f18) {
        super(null);
        this.f394866a = f17;
        this.f394867b = f18;
    }

    /* renamed from: equals */
    public boolean m144567xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.b0)) {
            return false;
        }
        ky.b0 b0Var = (ky.b0) obj;
        return java.lang.Float.compare(this.f394866a, b0Var.f394866a) == 0 && java.lang.Float.compare(this.f394867b, b0Var.f394867b) == 0;
    }

    /* renamed from: hashCode */
    public int m144568x8cdac1b() {
        return (java.lang.Float.hashCode(this.f394866a) * 31) + java.lang.Float.hashCode(this.f394867b);
    }

    /* renamed from: toString */
    public java.lang.String m144569x9616526c() {
        return "PressCancel(offsetX=" + this.f394866a + ", offsetY=" + this.f394867b + ')';
    }
}
