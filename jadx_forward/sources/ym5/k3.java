package ym5;

/* loaded from: classes5.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public float f544948a;

    /* renamed from: b, reason: collision with root package name */
    public float f544949b;

    /* renamed from: c, reason: collision with root package name */
    public float f544950c;

    /* renamed from: d, reason: collision with root package name */
    public float f544951d;

    public k3(float f17, float f18, float f19, float f27) {
        this.f544948a = f17;
        this.f544949b = f18;
        this.f544950c = f19;
        this.f544951d = f27;
    }

    /* renamed from: equals */
    public boolean m177331xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.k3)) {
            return false;
        }
        ym5.k3 k3Var = (ym5.k3) obj;
        return java.lang.Float.compare(this.f544948a, k3Var.f544948a) == 0 && java.lang.Float.compare(this.f544949b, k3Var.f544949b) == 0 && java.lang.Float.compare(this.f544950c, k3Var.f544950c) == 0 && java.lang.Float.compare(this.f544951d, k3Var.f544951d) == 0;
    }

    /* renamed from: hashCode */
    public int m177332x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f544948a) * 31) + java.lang.Float.hashCode(this.f544949b)) * 31) + java.lang.Float.hashCode(this.f544950c)) * 31) + java.lang.Float.hashCode(this.f544951d);
    }

    /* renamed from: toString */
    public java.lang.String m177333x9616526c() {
        return "topLeft:" + this.f544948a + ", topRight:" + this.f544949b + ", bottomLeft:" + this.f544950c + ", bottomRight:" + this.f544951d;
    }
}
