package j94;

/* loaded from: classes4.dex */
public final class c implements k44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f380079b;

    public c(android.content.Context context, android.content.Intent intent) {
        this.f380078a = context;
        this.f380079b = intent;
    }

    @Override // k44.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppMarketClick", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper$showHalfScreenAppMarket$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldJumpAppMarketHelper", "showHalfScreenAppMarket, user confirmed, launch market intent");
            j94.d dVar = j94.d.f380080a;
            android.content.Context context = this.f380078a;
            android.content.Intent intent = this.f380079b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
            dVar.b(context, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
            a44.m.a(5, 13);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpAppMarketHelper", "showHalfScreenAppMarket, launch market intent exp=%s", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppMarketClick", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper$showHalfScreenAppMarket$1");
    }
}
