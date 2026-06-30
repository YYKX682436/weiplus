package l44;

/* loaded from: classes4.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f397923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 f397925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f397926g;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        this.f397923d = c17933xe8d1b226;
        this.f397924e = i17;
        this.f397925f = c17902x72cc1771;
        this.f397926g = c17903x3b438f4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = this.f397925f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
        try {
            java.lang.String t07 = ca4.z0.t0(this.f397923d.f68891x29d1292e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdPreloadHelper", "reqFinderFeedsObjectId, source=" + this.f397924e + ", snsId=" + t07);
            java.lang.String m17 = l44.s4.m(c17902x72cc1771.f38104xce64ddf1, t07, 3);
            l44.a5.a(this.f397926g, m17);
            l44.a5.b(c17902x72cc1771, m17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAdPreloadHelper", "reqFinderFeedsObjectId, exp=" + th6.toString());
            ca4.q.c("reqFinderFeedsObjectId", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
    }
}
