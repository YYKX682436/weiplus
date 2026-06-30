package dd4;

/* loaded from: classes4.dex */
public final class d0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f310520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f310521c;

    public d0(java.lang.String str, android.content.Context context, dd4.e0 e0Var) {
        this.f310519a = str;
        this.f310520b = context;
        this.f310521c = e0Var;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        java.lang.String str = this.f310519a;
        if (!booleanValue || android.text.TextUtils.isEmpty(str)) {
            android.content.Context context = this.f310520b;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a), 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlexibleShareHelper", hashCode() + " save downloaded video fail, granted = " + booleanValue + ", fullPath = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context2 = this.f310520b;
            java.lang.String str2 = this.f310519a;
            ((yb0.g) b0Var).Bi(context2, str2, new dd4.c0(context2, this.f310521c, elapsedRealtime, str2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("accept", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1");
    }
}
