package oy;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431361a;

    /* renamed from: b, reason: collision with root package name */
    public final long f431362b;

    public l(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f431361a = talker;
        this.f431362b = j17;
    }

    /* renamed from: equals */
    public boolean m157345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy.l)) {
            return false;
        }
        oy.l lVar = (oy.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431361a, lVar.f431361a) && this.f431362b == lVar.f431362b;
    }

    /* renamed from: hashCode */
    public int m157346x8cdac1b() {
        return (this.f431361a.hashCode() * 31) + java.lang.Long.hashCode(this.f431362b);
    }

    /* renamed from: toString */
    public java.lang.String m157347x9616526c() {
        return "PlayingInfo(talker=" + this.f431361a + ", msgId=" + this.f431362b + ')';
    }
}
