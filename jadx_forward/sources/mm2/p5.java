package mm2;

/* loaded from: classes3.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final zl2.d5 f410882a;

    /* renamed from: b, reason: collision with root package name */
    public final long f410883b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f410884c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f410885d;

    public p5(zl2.d5 noticeType, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeType, "noticeType");
        this.f410882a = noticeType;
        this.f410883b = j17;
        this.f410884c = "";
        this.f410885d = "";
    }

    /* renamed from: equals */
    public boolean m147997xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.p5)) {
            return false;
        }
        mm2.p5 p5Var = (mm2.p5) obj;
        return this.f410882a == p5Var.f410882a && this.f410883b == p5Var.f410883b;
    }

    /* renamed from: hashCode */
    public int m147998x8cdac1b() {
        return (this.f410882a.hashCode() * 31) + java.lang.Long.hashCode(this.f410883b);
    }

    /* renamed from: toString */
    public java.lang.String m147999x9616526c() {
        return "ConsumeDialogShowData(noticeType=" + this.f410882a + ", reachAmountQuota=" + this.f410883b + ')';
    }
}
