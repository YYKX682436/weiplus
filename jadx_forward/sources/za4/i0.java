package za4;

/* loaded from: classes4.dex */
public class i0 implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f552655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f552657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f552658d;

    public i0(za4.o0 o0Var, long j17, java.lang.String str, int i17) {
        this.f552658d = o0Var;
        this.f552655a = j17;
        this.f552656b = str;
        this.f552657c = i17;
    }

    @Override // za4.r1
    public int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageResPreloader", "callback() called with: isSucc = [" + z17 + "], pageId = [" + this.f552655a + "]");
        if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            this.f552658d.e(str, this.f552656b, this.f552657c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
        return 0;
    }
}
