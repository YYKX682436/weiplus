package a44;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f1277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a44.k f1279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1281h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1284n;

    public i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.content.Context context, a44.k kVar, java.lang.String str, android.view.View view, int i17, android.view.View view2, int i18) {
        this.f1277d = snsInfo;
        this.f1278e = context;
        this.f1279f = kVar;
        this.f1280g = str;
        this.f1281h = view;
        this.f1282i = i17;
        this.f1283m = view2;
        this.f1284n = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1");
        if (a44.k.f1285g.a(this.f1277d, this.f1278e)) {
            ((ku5.t0) ku5.t0.f312615d).B(new a44.g(this.f1279f, this.f1280g, this.f1281h));
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new a44.h(this.f1279f, this.f1278e, this.f1280g, this.f1282i, this.f1281h, this.f1283m, this.f1284n, this.f1277d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1");
    }
}
