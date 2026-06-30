package t34;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f496952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396 f496953e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396 activityC17704xe73e9396, int i17) {
        this.f496953e = activityC17704xe73e9396;
        this.f496952d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdAnimProxyUI", "protectFinish run, maxLifeDuration=" + this.f496952d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396 activityC17704xe73e9396 = this.f496953e;
        if (!activityC17704xe73e9396.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdAnimProxyUI", "do protect finish activity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.T6(13);
            activityC17704xe73e9396.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$3");
    }
}
