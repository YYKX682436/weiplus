package o54;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public long f424690a;

    /* renamed from: b, reason: collision with root package name */
    public long f424691b;

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f424691b != 0) {
            this.f424690a += android.os.SystemClock.elapsedRealtime() - this.f424691b;
        }
        this.f424691b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f424691b == 0) {
            this.f424691b = android.os.SystemClock.elapsedRealtime();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }
}
