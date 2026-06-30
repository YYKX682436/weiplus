package cw2;

/* loaded from: classes5.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f305150a;

    /* renamed from: b, reason: collision with root package name */
    public final long f305151b;

    public c6(int i17, long j17) {
        this.f305150a = i17;
        this.f305151b = j17;
    }

    /* renamed from: equals */
    public boolean m122859xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.c6)) {
            return false;
        }
        cw2.c6 c6Var = (cw2.c6) obj;
        return this.f305150a == c6Var.f305150a && this.f305151b == c6Var.f305151b;
    }

    /* renamed from: hashCode */
    public int m122860x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f305150a) * 31) + java.lang.Long.hashCode(this.f305151b);
    }

    /* renamed from: toString */
    public java.lang.String m122861x9616526c() {
        return "StrategyPostProcessorHolder(strategy=" + this.f305150a + ", postProcessor=" + this.f305151b + ')';
    }
}
