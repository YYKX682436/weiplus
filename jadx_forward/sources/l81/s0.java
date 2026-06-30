package l81;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f398607a;

    /* renamed from: b, reason: collision with root package name */
    public final int f398608b;

    public s0(java.lang.String snapshotPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotPath, "snapshotPath");
        this.f398607a = snapshotPath;
        this.f398608b = i17;
    }

    /* renamed from: equals */
    public boolean m145302xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81.s0)) {
            return false;
        }
        l81.s0 s0Var = (l81.s0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f398607a, s0Var.f398607a) && this.f398608b == s0Var.f398608b;
    }

    /* renamed from: hashCode */
    public int m145303x8cdac1b() {
        return (this.f398607a.hashCode() * 31) + java.lang.Integer.hashCode(this.f398608b);
    }

    /* renamed from: toString */
    public java.lang.String m145304x9616526c() {
        return "NodeOnlySnapshotInfo(snapshotPath='" + this.f398607a + "', mainContextSnapshotIndex=" + this.f398608b + ')';
    }
}
