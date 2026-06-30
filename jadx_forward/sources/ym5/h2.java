package ym5;

/* loaded from: classes15.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f544896a;

    /* renamed from: b, reason: collision with root package name */
    public int f544897b;

    /* renamed from: c, reason: collision with root package name */
    public int f544898c;

    /* renamed from: d, reason: collision with root package name */
    public double f544899d;

    /* renamed from: e, reason: collision with root package name */
    public double f544900e;

    /* renamed from: f, reason: collision with root package name */
    public int f544901f;

    /* renamed from: g, reason: collision with root package name */
    public int f544902g;

    /* renamed from: h, reason: collision with root package name */
    public double f544903h;

    /* renamed from: i, reason: collision with root package name */
    public double f544904i;

    public h2(long j17, int i17, int i18, double d17, double d18, int i19, int i27, double d19, double d27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j18 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        int i37 = (i28 & 4) != 0 ? 0 : i18;
        double d28 = (i28 & 8) != 0 ? 0.0d : d17;
        double d29 = (i28 & 16) != 0 ? 0.0d : d18;
        int i38 = (i28 & 32) != 0 ? 0 : i19;
        int i39 = (i28 & 64) == 0 ? i27 : 0;
        double d37 = (i28 & 128) != 0 ? 0.0d : d19;
        double d38 = (i28 & 256) == 0 ? d27 : 0.0d;
        this.f544896a = j18;
        this.f544897b = i29;
        this.f544898c = i37;
        this.f544899d = d28;
        this.f544900e = d29;
        this.f544901f = i38;
        this.f544902g = i39;
        this.f544903h = d37;
        this.f544904i = d38;
    }

    /* renamed from: equals */
    public boolean m177322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.h2)) {
            return false;
        }
        ym5.h2 h2Var = (ym5.h2) obj;
        return this.f544896a == h2Var.f544896a && this.f544897b == h2Var.f544897b && this.f544898c == h2Var.f544898c && java.lang.Double.compare(this.f544899d, h2Var.f544899d) == 0 && java.lang.Double.compare(this.f544900e, h2Var.f544900e) == 0 && this.f544901f == h2Var.f544901f && this.f544902g == h2Var.f544902g && java.lang.Double.compare(this.f544903h, h2Var.f544903h) == 0 && java.lang.Double.compare(this.f544904i, h2Var.f544904i) == 0;
    }

    /* renamed from: hashCode */
    public int m177323x8cdac1b() {
        return (((((((((((((((java.lang.Long.hashCode(this.f544896a) * 31) + java.lang.Integer.hashCode(this.f544897b)) * 31) + java.lang.Integer.hashCode(this.f544898c)) * 31) + java.lang.Double.hashCode(this.f544899d)) * 31) + java.lang.Double.hashCode(this.f544900e)) * 31) + java.lang.Integer.hashCode(this.f544901f)) * 31) + java.lang.Integer.hashCode(this.f544902g)) * 31) + java.lang.Double.hashCode(this.f544903h)) * 31) + java.lang.Double.hashCode(this.f544904i);
    }

    /* renamed from: toString */
    public java.lang.String m177324x9616526c() {
        return "ReportContent(curLiveId=" + this.f544896a + ", rfxPlayCnt=" + this.f544897b + ", rfxFrameCnt=" + this.f544898c + ", rfxMax=" + this.f544899d + ", rfxTotal=" + this.f544900e + ", pagPlayCnt=" + this.f544901f + ", pagFrameCnt=" + this.f544902g + ", pagMax=" + this.f544903h + ", pagTotal=" + this.f544904i + ')';
    }
}
