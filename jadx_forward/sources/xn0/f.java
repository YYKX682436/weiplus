package xn0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final kn0.e f536953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536954b;

    public f(kn0.e liveQosInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveQosInfo, "liveQosInfo");
        this.f536953a = liveQosInfo;
        this.f536954b = i17;
    }

    /* renamed from: equals */
    public boolean m175681xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn0.f)) {
            return false;
        }
        xn0.f fVar = (xn0.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536953a, fVar.f536953a) && this.f536954b == fVar.f536954b;
    }

    /* renamed from: hashCode */
    public int m175682x8cdac1b() {
        return (this.f536953a.m143734x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f536954b);
    }

    /* renamed from: toString */
    public java.lang.String m175683x9616526c() {
        return "FLVQualitySample(liveQosInfo=" + this.f536953a + ", blockCnt=" + this.f536954b + ')';
    }
}
