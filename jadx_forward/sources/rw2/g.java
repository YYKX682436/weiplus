package rw2;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f482129a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f482130b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f482131c;

    public g(long j17, yz5.p callback, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 cmTime, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 4) != 0) {
            cmTime = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cmTime, "fromMs(...)");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmTime, "cmTime");
        this.f482129a = j17;
        this.f482130b = callback;
        this.f482131c = cmTime;
    }

    /* renamed from: equals */
    public boolean m163240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw2.g)) {
            return false;
        }
        rw2.g gVar = (rw2.g) obj;
        return this.f482129a == gVar.f482129a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482130b, gVar.f482130b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482131c, gVar.f482131c);
    }

    /* renamed from: hashCode */
    public int m163241x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f482129a) * 31) + this.f482130b.hashCode()) * 31) + this.f482131c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163242x9616526c() {
        return "Request(timeMs=" + this.f482129a + ", callback=" + this.f482130b + ", cmTime=" + this.f482131c + ')';
    }
}
