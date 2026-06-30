package fo5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f346508a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346509b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346510c;

    /* renamed from: d, reason: collision with root package name */
    public final int f346511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f346512e;

    public f(int i17, int i18, int i19, int i27, int i28) {
        this.f346508a = i17;
        this.f346509b = i18;
        this.f346510c = i19;
        this.f346511d = i27;
        this.f346512e = i28;
    }

    /* renamed from: equals */
    public boolean m129925xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo5.f)) {
            return false;
        }
        fo5.f fVar = (fo5.f) obj;
        return this.f346508a == fVar.f346508a && this.f346509b == fVar.f346509b && this.f346510c == fVar.f346510c && this.f346511d == fVar.f346511d && this.f346512e == fVar.f346512e;
    }

    /* renamed from: hashCode */
    public int m129926x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f346508a) * 31) + java.lang.Integer.hashCode(this.f346509b)) * 31) + java.lang.Integer.hashCode(this.f346510c)) * 31) + java.lang.Integer.hashCode(this.f346511d)) * 31) + java.lang.Integer.hashCode(this.f346512e);
    }

    /* renamed from: toString */
    public java.lang.String m129927x9616526c() {
        return "RenderErrorReport(camera=" + this.f346508a + ", onscreen=" + this.f346509b + ", encode=" + this.f346510c + ", decode=" + this.f346511d + ", errorState=" + this.f346512e + ')';
    }
}
