package qm2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f446248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f446249b;

    /* renamed from: c, reason: collision with root package name */
    public final float f446250c;

    /* renamed from: d, reason: collision with root package name */
    public final float f446251d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f446252e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f446253f;

    /* renamed from: g, reason: collision with root package name */
    public final int f446254g;

    public f(int i17, int i18, float f17, float f18, boolean z17, boolean z18, int i19) {
        this.f446248a = i17;
        this.f446249b = i18;
        this.f446250c = f17;
        this.f446251d = f18;
        this.f446252e = z17;
        this.f446253f = z18;
        this.f446254g = i19;
    }

    /* renamed from: equals */
    public boolean m160516xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm2.f)) {
            return false;
        }
        qm2.f fVar = (qm2.f) obj;
        return this.f446248a == fVar.f446248a && this.f446249b == fVar.f446249b && java.lang.Float.compare(this.f446250c, fVar.f446250c) == 0 && java.lang.Float.compare(this.f446251d, fVar.f446251d) == 0 && this.f446252e == fVar.f446252e && this.f446253f == fVar.f446253f && this.f446254g == fVar.f446254g;
    }

    /* renamed from: hashCode */
    public int m160517x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f446248a) * 31) + java.lang.Integer.hashCode(this.f446249b)) * 31) + java.lang.Float.hashCode(this.f446250c)) * 31) + java.lang.Float.hashCode(this.f446251d)) * 31) + java.lang.Boolean.hashCode(this.f446252e)) * 31) + java.lang.Boolean.hashCode(this.f446253f)) * 31) + java.lang.Integer.hashCode(this.f446254g);
    }

    /* renamed from: toString */
    public java.lang.String m160518x9616526c() {
        return "NetSpeedTestResult(testResult=" + this.f446248a + ", avgSpeed=" + this.f446249b + ", rtt=" + this.f446250c + ", jitter=" + this.f446251d + ", uploadSuccessful=" + this.f446252e + ", downloadSuccessful=" + this.f446253f + ", aveDownSpeed=" + this.f446254g + ')';
    }

    public /* synthetic */ f(int i17, int i18, float f17, float f18, boolean z17, boolean z18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i27 & 1) != 0 ? -1 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? 0.0f : f17, (i27 & 8) == 0 ? f18 : 0.0f, (i27 & 16) != 0 ? false : z17, (i27 & 32) != 0 ? false : z18, (i27 & 64) == 0 ? i19 : 0);
    }
}
