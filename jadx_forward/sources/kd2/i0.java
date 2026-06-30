package kd2;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f388289a;

    /* renamed from: b, reason: collision with root package name */
    public long f388290b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f388291c;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        this.f388289a = feed;
        this.f388290b = j17;
        this.f388291c = z17;
    }

    /* renamed from: equals */
    public boolean m142492xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2.i0)) {
            return false;
        }
        kd2.i0 i0Var = (kd2.i0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f388289a, i0Var.f388289a) && this.f388290b == i0Var.f388290b && this.f388291c == i0Var.f388291c;
    }

    /* renamed from: hashCode */
    public int m142493x8cdac1b() {
        return (((this.f388289a.m58305x8cdac1b() * 31) + java.lang.Long.hashCode(this.f388290b)) * 31) + java.lang.Boolean.hashCode(this.f388291c);
    }

    /* renamed from: toString */
    public java.lang.String m142494x9616526c() {
        return "CurFeedInfo(feed=" + this.f388289a + ", progress=" + this.f388290b + ", hasUpdateRecoverData=" + this.f388291c + ')';
    }
}
