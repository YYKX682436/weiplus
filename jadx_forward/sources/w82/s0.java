package w82;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f525458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f525459b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f525460c;

    public s0(java.lang.String content, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f525458a = content;
        this.f525459b = i17;
        this.f525460c = z17;
    }

    /* renamed from: equals */
    public boolean m173333xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof w82.s0)) {
            return false;
        }
        w82.s0 s0Var = (w82.s0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525458a, s0Var.f525458a) && this.f525459b == s0Var.f525459b;
    }

    /* renamed from: hashCode */
    public int m173334x8cdac1b() {
        return (((this.f525458a.hashCode() * 31) + this.f525459b) * 31) + java.lang.Boolean.hashCode(this.f525460c);
    }

    /* renamed from: toString */
    public java.lang.String m173335x9616526c() {
        return "PanelInfo(content=" + this.f525458a + ", type=" + this.f525459b + ", canCancel=" + this.f525460c + ')';
    }
}
