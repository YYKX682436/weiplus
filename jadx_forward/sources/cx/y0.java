package cx;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final cx.x0 f306018d = new cx.x0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f306019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f306020b;

    /* renamed from: c, reason: collision with root package name */
    public final long f306021c;

    public y0(long j17, int i17, long j18) {
        this.f306019a = j17;
        this.f306020b = i17;
        this.f306021c = j18;
    }

    /* renamed from: equals */
    public boolean m123054xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.y0)) {
            return false;
        }
        cx.y0 y0Var = (cx.y0) obj;
        return this.f306019a == y0Var.f306019a && this.f306020b == y0Var.f306020b && this.f306021c == y0Var.f306021c;
    }

    /* renamed from: hashCode */
    public int m123055x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f306019a) * 31) + java.lang.Integer.hashCode(this.f306020b)) * 31) + java.lang.Long.hashCode(this.f306021c);
    }

    /* renamed from: toString */
    public java.lang.String m123056x9616526c() {
        return "RecreationConfig(disconnectAsCrashFreqThreshold=" + this.f306019a + ", maxCrashLimitBeforeCloseFeature=" + this.f306020b + ", recoverFeatureSwitchAfter=" + this.f306021c + ')';
    }
}
