package d44;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d44.b f307958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d44.d f307960g;

    public c(d44.d dVar, int i17, d44.b bVar, java.lang.Object obj) {
        this.f307960g = dVar;
        this.f307957d = i17;
        this.f307958e = bVar;
        this.f307959f = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f307957d;
        d44.d dVar = this.f307960g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingRequest", "onResult:: snsId = " + dVar.f307961a + ", action type = " + dVar.f307962b + ", errorCode = " + i17);
            this.f307958e.a(dVar.f307961a, dVar.f307962b, i17, this.f307959f);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
    }
}
