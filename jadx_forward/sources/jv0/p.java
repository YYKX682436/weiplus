package jv0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f383738a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f383739b;

    public p(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        this.f383738a = time;
        this.f383739b = z17;
    }

    /* renamed from: equals */
    public boolean m141440xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv0.p)) {
            return false;
        }
        jv0.p pVar = (jv0.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383738a, pVar.f383738a) && this.f383739b == pVar.f383739b;
    }

    /* renamed from: hashCode */
    public int m141441x8cdac1b() {
        return (this.f383738a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f383739b);
    }

    /* renamed from: toString */
    public java.lang.String m141442x9616526c() {
        return "SnapTime(time=" + this.f383738a + ", isStartTime=" + this.f383739b + ')';
    }
}
