package rm5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f479014a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f479015b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f479016c;

    public d(long j17, yz5.p callback, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 cmTime, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        cmTime = (i17 & 4) != 0 ? new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j17, 1000) : cmTime;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmTime, "cmTime");
        this.f479014a = j17;
        this.f479015b = callback;
        this.f479016c = cmTime;
    }

    /* renamed from: equals */
    public boolean m162729xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.d)) {
            return false;
        }
        rm5.d dVar = (rm5.d) obj;
        return this.f479014a == dVar.f479014a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479015b, dVar.f479015b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479016c, dVar.f479016c);
    }

    /* renamed from: hashCode */
    public int m162730x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f479014a) * 31) + this.f479015b.hashCode()) * 31) + this.f479016c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162731x9616526c() {
        return "Request(timeMs=" + this.f479014a + ", callback=" + this.f479015b + ", cmTime=" + this.f479016c + ')';
    }
}
