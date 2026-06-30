package xr0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f537705a;

    public i(int i17) {
        this.f537705a = i17;
    }

    /* renamed from: equals */
    public boolean m175796xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr0.i) && this.f537705a == ((xr0.i) obj).f537705a;
    }

    /* renamed from: hashCode */
    public int m175797x8cdac1b() {
        return java.lang.Integer.hashCode(this.f537705a);
    }

    /* renamed from: toString */
    public java.lang.String m175798x9616526c() {
        return "CameraKitUiSetting(themeColor=" + this.f537705a + ')';
    }
}
