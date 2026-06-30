package ym5;

/* loaded from: classes5.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public float f544959a;

    /* renamed from: b, reason: collision with root package name */
    public float f544960b;

    /* renamed from: c, reason: collision with root package name */
    public float f544961c;

    /* renamed from: d, reason: collision with root package name */
    public float f544962d;

    public l3(float f17, float f18, float f19, float f27) {
        this.f544959a = f17;
        this.f544960b = f18;
        this.f544961c = f19;
        this.f544962d = f27;
    }

    /* renamed from: equals */
    public boolean m177335xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.l3)) {
            return false;
        }
        ym5.l3 l3Var = (ym5.l3) obj;
        return java.lang.Float.compare(this.f544959a, l3Var.f544959a) == 0 && java.lang.Float.compare(this.f544960b, l3Var.f544960b) == 0 && java.lang.Float.compare(this.f544961c, l3Var.f544961c) == 0 && java.lang.Float.compare(this.f544962d, l3Var.f544962d) == 0;
    }

    /* renamed from: hashCode */
    public int m177336x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f544959a) * 31) + java.lang.Float.hashCode(this.f544960b)) * 31) + java.lang.Float.hashCode(this.f544961c)) * 31) + java.lang.Float.hashCode(this.f544962d);
    }

    /* renamed from: toString */
    public java.lang.String m177337x9616526c() {
        return "topLeft:" + this.f544959a + ", topRight:" + this.f544960b + ", bottomLeft:" + this.f544961c + ", bottomRight:" + this.f544962d;
    }
}
