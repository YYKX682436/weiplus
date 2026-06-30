package t64;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f497547a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 f497548b;

    /* renamed from: c, reason: collision with root package name */
    public final r34.b f497549c;

    public c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 adSnsInfo, r34.b adRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSnsInfo, "adSnsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adRecord, "adRecord");
        this.f497547a = i17;
        this.f497548b = adSnsInfo;
        this.f497549c = adRecord;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return this.f497548b;
    }

    /* renamed from: equals */
    public boolean m165964xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return true;
        }
        if (!(obj instanceof t64.c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        t64.c cVar = (t64.c) obj;
        if (this.f497547a != cVar.f497547a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f497548b, cVar.f497548b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f497549c, cVar.f497549c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return b17;
    }

    /* renamed from: hashCode */
    public int m165965x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f497547a) * 31) + this.f497548b.hashCode()) * 31) + this.f497549c.m161435x8cdac1b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m165966x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        java.lang.String str = "AdSwapChangeInfo(createTime=" + this.f497547a + ", adSnsInfo=" + this.f497548b + ", adRecord=" + this.f497549c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.adop.AdSwapHelper$AdSwapChangeInfo");
        return str;
    }
}
