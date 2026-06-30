package k94;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f387469a;

    /* renamed from: b, reason: collision with root package name */
    public long f387470b;

    /* renamed from: c, reason: collision with root package name */
    public long f387471c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f387472d;

    public b(boolean z17, long j17, long j18, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        j18 = (i17 & 4) != 0 ? 0L : j18;
        z18 = (i17 & 8) != 0 ? false : z18;
        this.f387469a = z17;
        this.f387470b = j17;
        this.f387471c = j18;
        this.f387472d = z18;
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        boolean z17 = this.f387469a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        return z17;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        this.f387469a = false;
        this.f387470b = java.lang.System.currentTimeMillis();
        this.f387471c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
    }
}
