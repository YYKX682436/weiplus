package rc4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f475654a;

    /* renamed from: b, reason: collision with root package name */
    public int f475655b;

    /* renamed from: c, reason: collision with root package name */
    public int f475656c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475657d;

    /* renamed from: e, reason: collision with root package name */
    public int f475658e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f475659f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f475660g;

    /* renamed from: h, reason: collision with root package name */
    public int f475661h;

    public a(long j17, int i17, int i18, java.lang.String nextPageFeedid, int i19, java.lang.String show_username, java.lang.String tips_uuid, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i28 & 1) != 0 ? 0L : j17;
        i17 = (i28 & 2) != 0 ? 0 : i17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        nextPageFeedid = (i28 & 8) != 0 ? "" : nextPageFeedid;
        i19 = (i28 & 16) != 0 ? 6 : i19;
        show_username = (i28 & 32) != 0 ? "" : show_username;
        tips_uuid = (i28 & 64) != 0 ? "" : tips_uuid;
        i27 = (i28 & 128) != 0 ? 0 : i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextPageFeedid, "nextPageFeedid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(show_username, "show_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tips_uuid, "tips_uuid");
        this.f475654a = j17;
        this.f475655b = i17;
        this.f475656c = i18;
        this.f475657d = nextPageFeedid;
        this.f475658e = i19;
        this.f475659f = show_username;
        this.f475660g = tips_uuid;
        this.f475661h = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.ArrayList arrayList = rc4.e.f475673e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        arrayList.add(this);
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        int i17 = this.f475655b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return i17;
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        this.f475658e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
    }

    /* renamed from: equals */
    public boolean m162154xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return true;
        }
        if (!(obj instanceof rc4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        rc4.a aVar = (rc4.a) obj;
        if (this.f475654a != aVar.f475654a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f475655b != aVar.f475655b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f475656c != aVar.f475656c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475657d, aVar.f475657d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f475658e != aVar.f475658e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475659f, aVar.f475659f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475660g, aVar.f475660g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        int i17 = this.f475661h;
        int i18 = aVar.f475661h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m162155x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f475654a) * 31) + java.lang.Integer.hashCode(this.f475655b)) * 31) + java.lang.Integer.hashCode(this.f475656c)) * 31) + this.f475657d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f475658e)) * 31) + this.f475659f.hashCode()) * 31) + this.f475660g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f475661h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m162156x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        java.lang.String str = "TierReportData(indicator=" + this.f475654a + ", exposeCount=" + this.f475655b + ", clickCount=" + this.f475656c + ", nextPageFeedid=" + this.f475657d + ", finderbar_unexpose_reason=" + this.f475658e + ", show_username=" + this.f475659f + ", tips_uuid=" + this.f475660g + ", content_type=" + this.f475661h + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return str;
    }
}
