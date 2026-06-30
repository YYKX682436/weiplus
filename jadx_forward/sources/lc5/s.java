package lc5;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f399562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f399563b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399564c;

    public s(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f399562a = j17;
        this.f399563b = ballInfo;
        this.f399564c = talker;
    }

    /* renamed from: equals */
    public boolean m145621xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5.s)) {
            return false;
        }
        lc5.s sVar = (lc5.s) obj;
        return this.f399562a == sVar.f399562a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399563b, sVar.f399563b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399564c, sVar.f399564c);
    }

    /* renamed from: hashCode */
    public int m145622x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f399562a) * 31) + this.f399563b.hashCode()) * 31) + this.f399564c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145623x9616526c() {
        return "ImageFloatBallData(msgId=" + this.f399562a + ", ballInfo=" + this.f399563b + ", talker=" + this.f399564c + ')';
    }
}
