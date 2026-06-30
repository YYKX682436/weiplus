package xr0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f537706a;

    /* renamed from: b, reason: collision with root package name */
    public int f537707b;

    public j(int i17, int i18) {
        this.f537706a = i17;
        this.f537707b = i18;
    }

    public final float a() {
        return (this.f537707b * 1.0f) / this.f537706a;
    }

    /* renamed from: equals */
    public boolean m175799xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.j)) {
            return false;
        }
        xr0.j jVar = (xr0.j) obj;
        return this.f537706a == jVar.f537706a && this.f537707b == jVar.f537707b;
    }

    /* renamed from: hashCode */
    public int m175800x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f537706a) * 31) + java.lang.Integer.hashCode(this.f537707b);
    }

    /* renamed from: toString */
    public java.lang.String m175801x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f537706a);
        sb6.append('x');
        sb6.append(this.f537707b);
        return sb6.toString();
    }
}
