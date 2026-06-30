package ml2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f408901a;

    public e(int i17) {
        this.f408901a = i17;
    }

    /* renamed from: equals */
    public boolean m147481xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml2.e) && this.f408901a == ((ml2.e) obj).f408901a;
    }

    /* renamed from: hashCode */
    public int m147482x8cdac1b() {
        return java.lang.Integer.hashCode(this.f408901a);
    }

    /* renamed from: toString */
    public java.lang.String m147483x9616526c() {
        return "DeviceMonitorResult(cpuLoad=" + this.f408901a + ')';
    }
}
