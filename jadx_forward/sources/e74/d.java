package e74;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f331493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f331495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e74.i f331497h;

    public d(e74.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, boolean z17, java.lang.String str) {
        this.f331497h = iVar;
        this.f331493d = c17933xe8d1b226;
        this.f331494e = i17;
        this.f331495f = z17;
        this.f331496g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$4");
        try {
            e74.i.b(this.f331497h, this.f331493d, this.f331494e, this.f331495f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct exp, snsId=" + this.f331496g + ", exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$4");
    }
}
