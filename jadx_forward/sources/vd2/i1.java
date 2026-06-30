package vd2;

/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h32 f517294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f517295b;

    public i1(r45.h32 noticeInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        this.f517294a = noticeInfo;
        this.f517295b = i17;
    }

    /* renamed from: equals */
    public boolean m171631xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.i1)) {
            return false;
        }
        vd2.i1 i1Var = (vd2.i1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517294a, i1Var.f517294a) && this.f517295b == i1Var.f517295b;
    }

    /* renamed from: hashCode */
    public int m171632x8cdac1b() {
        return (this.f517294a.hashCode() * 31) + java.lang.Integer.hashCode(this.f517295b);
    }

    /* renamed from: toString */
    public java.lang.String m171633x9616526c() {
        return "CacheValue(noticeInfo=" + this.f517294a + ", saveTimeSec=" + this.f517295b + ')';
    }
}
