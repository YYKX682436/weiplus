package so2;

/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.f0 f492012a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f492013b;

    public m2(ml2.f0 liveFeed, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveFeed, "liveFeed");
        this.f492012a = liveFeed;
        this.f492013b = str;
    }

    /* renamed from: equals */
    public boolean m164921xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.m2)) {
            return false;
        }
        so2.m2 m2Var = (so2.m2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492012a, m2Var.f492012a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492013b, m2Var.f492013b);
    }

    /* renamed from: hashCode */
    public int m164922x8cdac1b() {
        int m147504x8cdac1b = this.f492012a.m147504x8cdac1b() * 31;
        java.lang.String str = this.f492013b;
        return m147504x8cdac1b + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164923x9616526c() {
        return "ResumeReportInfo(liveFeed=" + this.f492012a + ", sessionBuffer=" + this.f492013b + ')';
    }
}
