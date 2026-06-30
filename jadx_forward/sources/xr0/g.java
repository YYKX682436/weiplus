package xr0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f537699a;

    /* renamed from: b, reason: collision with root package name */
    public final int f537700b;

    public g(int i17, int i18) {
        this.f537699a = i17;
        this.f537700b = i18;
    }

    /* renamed from: equals */
    public boolean m175790xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.g)) {
            return false;
        }
        xr0.g gVar = (xr0.g) obj;
        return this.f537699a == gVar.f537699a && this.f537700b == gVar.f537700b;
    }

    /* renamed from: hashCode */
    public int m175791x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f537699a) * 31) + java.lang.Integer.hashCode(this.f537700b);
    }

    /* renamed from: toString */
    public java.lang.String m175792x9616526c() {
        return "CameraKitReportSetting(scene=" + this.f537699a + ", subScene=" + this.f537700b + ')';
    }
}
