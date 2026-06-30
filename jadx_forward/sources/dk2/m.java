package dk2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f315271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f315273c;

    /* renamed from: d, reason: collision with root package name */
    public final int f315274d;

    /* renamed from: e, reason: collision with root package name */
    public final int f315275e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f315276f;

    /* renamed from: g, reason: collision with root package name */
    public int f315277g;

    public m(int i17, int i18, java.lang.String giftId, int i19, int i27, java.util.List battleTeam, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleTeam, "battleTeam");
        this.f315271a = i17;
        this.f315272b = i18;
        this.f315273c = giftId;
        this.f315274d = i19;
        this.f315275e = i27;
        this.f315276f = battleTeam;
        this.f315277g = i28;
    }

    /* renamed from: equals */
    public boolean m124605xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.m)) {
            return false;
        }
        dk2.m mVar = (dk2.m) obj;
        return this.f315271a == mVar.f315271a && this.f315272b == mVar.f315272b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315273c, mVar.f315273c) && this.f315274d == mVar.f315274d && this.f315275e == mVar.f315275e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315276f, mVar.f315276f) && this.f315277g == mVar.f315277g;
    }

    /* renamed from: hashCode */
    public int m124606x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f315271a) * 31) + java.lang.Integer.hashCode(this.f315272b)) * 31) + this.f315273c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f315274d)) * 31) + java.lang.Integer.hashCode(this.f315275e)) * 31) + this.f315276f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f315277g);
    }

    /* renamed from: toString */
    public java.lang.String m124607x9616526c() {
        return "battleMode: " + this.f315271a + " battleWinWay: " + this.f315272b + " selectGiftId: " + this.f315273c + " battleDuration: " + this.f315274d + " battleScope: " + this.f315275e + " battleLayout: " + this.f315277g + " battleTeam: " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a0.f196970a.a(this.f315276f) + ' ';
    }
}
