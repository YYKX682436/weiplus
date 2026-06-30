package dd4;

/* loaded from: classes4.dex */
public final class c0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f310508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f310509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f310510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310511d;

    public c0(android.content.Context context, dd4.e0 e0Var, long j17, java.lang.String str) {
        this.f310508a = context;
        this.f310509b = e0Var;
        this.f310510c = j17;
        this.f310511d = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onExportSuccess", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        android.content.Context context = this.f310508a;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7b, q75.c.c(destPath)), 1).show();
        q75.c.f(destPath, this.f310508a);
        dd4.e0 e0Var = this.f310509b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        ((ku5.t0) ku5.t0.f394148d).h(new dd4.b0(e0Var), "SnsVideoExportReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$reportExportAsync", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onExportSuccess", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onExportFail", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        android.content.Context context = this.f310508a;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a), 1).show();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlexibleShareHelper", "%d save downloaded video finish %d %s", valueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f310510c), this.f310511d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onExportFail", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$saveDownloadedVideo$1$accept$1");
    }
}
