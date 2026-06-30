package hw;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final hw.d0 f366902d = new hw.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f366903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366904b;

    /* renamed from: c, reason: collision with root package name */
    public final long f366905c;

    public e0(long j17, int i17, long j18) {
        this.f366903a = j17;
        this.f366904b = i17;
        this.f366905c = j18;
    }

    /* renamed from: equals */
    public boolean m134185xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw.e0)) {
            return false;
        }
        hw.e0 e0Var = (hw.e0) obj;
        return this.f366903a == e0Var.f366903a && this.f366904b == e0Var.f366904b && this.f366905c == e0Var.f366905c;
    }

    /* renamed from: hashCode */
    public int m134186x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f366903a) * 31) + java.lang.Integer.hashCode(this.f366904b)) * 31) + java.lang.Long.hashCode(this.f366905c);
    }

    /* renamed from: toString */
    public java.lang.String m134187x9616526c() {
        return "RecreationConfig(disconnectAsCrashFreqThreshold=" + this.f366903a + ", maxCrashLimitBeforeCloseFeature=" + this.f366904b + ", recoverFeatureSwitchAfter=" + this.f366905c + ')';
    }
}
