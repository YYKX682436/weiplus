package bm2;

/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f103318a;

    /* renamed from: b, reason: collision with root package name */
    public final kn0.r f103319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103320c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f103321d;

    public b2(int i17, kn0.r liveUrlInfo, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveUrlInfo, "liveUrlInfo");
        this.f103318a = i17;
        this.f103319b = liveUrlInfo;
        this.f103320c = i18;
        this.f103321d = z17;
    }

    /* renamed from: equals */
    public boolean m10733xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.b2)) {
            return false;
        }
        bm2.b2 b2Var = (bm2.b2) obj;
        return this.f103318a == b2Var.f103318a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103319b, b2Var.f103319b) && this.f103320c == b2Var.f103320c && this.f103321d == b2Var.f103321d;
    }

    /* renamed from: hashCode */
    public int m10734x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f103318a) * 31) + this.f103319b.m143771x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f103320c)) * 31) + java.lang.Boolean.hashCode(this.f103321d);
    }

    /* renamed from: toString */
    public java.lang.String m10735x9616526c() {
        return "liveUrlInfo:" + this.f103319b + ", chooser:" + this.f103321d + " mainUrlBlock: " + this.f103320c;
    }
}
