package dk2;

/* loaded from: classes10.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public final int f315459a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315460b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f315461c;

    /* renamed from: d, reason: collision with root package name */
    public final int f315462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f315463e;

    public pf(int i17, int i18, java.lang.String giftId, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        this.f315459a = i17;
        this.f315460b = i18;
        this.f315461c = giftId;
        this.f315462d = i19;
        this.f315463e = i27;
    }

    /* renamed from: equals */
    public boolean m124632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.pf)) {
            return false;
        }
        dk2.pf pfVar = (dk2.pf) obj;
        return this.f315459a == pfVar.f315459a && this.f315460b == pfVar.f315460b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315461c, pfVar.f315461c) && this.f315462d == pfVar.f315462d && this.f315463e == pfVar.f315463e;
    }

    /* renamed from: hashCode */
    public int m124633x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f315459a) * 31) + java.lang.Integer.hashCode(this.f315460b)) * 31) + this.f315461c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f315462d)) * 31) + java.lang.Integer.hashCode(this.f315463e);
    }

    /* renamed from: toString */
    public java.lang.String m124634x9616526c() {
        return "FinderLiveVisitorBattleRequestData(battleMode=" + this.f315459a + ", battleWinWay=" + this.f315460b + ", giftId=" + this.f315461c + ", battleDuration=" + this.f315462d + ", battleScope=" + this.f315463e + ')';
    }
}
