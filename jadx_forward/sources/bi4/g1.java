package bi4;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final bi4.f1 f102580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102581b;

    static {
        new bi4.e1(null);
    }

    public g1(bi4.f1 preset, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        preset = (i17 & 1) != 0 ? bi4.f1.f102574d : preset;
        j17 = (i17 & 2) != 0 ? 200L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preset, "preset");
        this.f102580a = preset;
        this.f102581b = j17;
    }

    /* renamed from: equals */
    public boolean m10610xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi4.g1)) {
            return false;
        }
        bi4.g1 g1Var = (bi4.g1) obj;
        return this.f102580a == g1Var.f102580a && this.f102581b == g1Var.f102581b;
    }

    /* renamed from: hashCode */
    public int m10611x8cdac1b() {
        return (this.f102580a.hashCode() * 31) + java.lang.Long.hashCode(this.f102581b);
    }

    /* renamed from: toString */
    public java.lang.String m10612x9616526c() {
        return "StatusCardDialogAnimationConfig(preset=" + this.f102580a + ", durationMs=" + this.f102581b + ')';
    }
}
