package so2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public so2.h f491883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f491884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f491885c;

    /* renamed from: d, reason: collision with root package name */
    public final long f491886d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f491887e;

    /* renamed from: f, reason: collision with root package name */
    public final int f491888f;

    public g(so2.h showMileStoneState, int i17, int i18, long j17, boolean z17, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        showMileStoneState = (i27 & 1) != 0 ? so2.h.f491903d : showMileStoneState;
        z17 = (i27 & 16) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMileStoneState, "showMileStoneState");
        this.f491883a = showMileStoneState;
        this.f491884b = i17;
        this.f491885c = i18;
        this.f491886d = j17;
        this.f491887e = z17;
        this.f491888f = i19;
    }

    /* renamed from: equals */
    public boolean m164878xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.g)) {
            return false;
        }
        so2.g gVar = (so2.g) obj;
        return this.f491883a == gVar.f491883a && this.f491884b == gVar.f491884b && this.f491885c == gVar.f491885c && this.f491886d == gVar.f491886d && this.f491887e == gVar.f491887e && this.f491888f == gVar.f491888f;
    }

    /* renamed from: hashCode */
    public int m164879x8cdac1b() {
        return (((((((((this.f491883a.hashCode() * 31) + java.lang.Integer.hashCode(this.f491884b)) * 31) + java.lang.Integer.hashCode(this.f491885c)) * 31) + java.lang.Long.hashCode(this.f491886d)) * 31) + java.lang.Boolean.hashCode(this.f491887e)) * 31) + java.lang.Integer.hashCode(this.f491888f);
    }

    /* renamed from: toString */
    public java.lang.String m164880x9616526c() {
        return "MileStoneShowInfo(showMileStoneState=" + this.f491883a + ", interactionType=" + this.f491884b + ", interactionCount=" + this.f491885c + ", firstShowTimeStamp=" + this.f491886d + ", showAgain=" + this.f491887e + ", showPoint=" + this.f491888f + ')';
    }
}
