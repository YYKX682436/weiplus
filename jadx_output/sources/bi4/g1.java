package bi4;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final bi4.f1 f21047a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21048b;

    static {
        new bi4.e1(null);
    }

    public g1(bi4.f1 preset, long j17, int i17, kotlin.jvm.internal.i iVar) {
        preset = (i17 & 1) != 0 ? bi4.f1.f21041d : preset;
        j17 = (i17 & 2) != 0 ? 200L : j17;
        kotlin.jvm.internal.o.g(preset, "preset");
        this.f21047a = preset;
        this.f21048b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi4.g1)) {
            return false;
        }
        bi4.g1 g1Var = (bi4.g1) obj;
        return this.f21047a == g1Var.f21047a && this.f21048b == g1Var.f21048b;
    }

    public int hashCode() {
        return (this.f21047a.hashCode() * 31) + java.lang.Long.hashCode(this.f21048b);
    }

    public java.lang.String toString() {
        return "StatusCardDialogAnimationConfig(preset=" + this.f21047a + ", durationMs=" + this.f21048b + ')';
    }
}
