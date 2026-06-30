package a84;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f2270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2271e;

    public e(za4.e0 e0Var, java.lang.String str) {
        this.f2270d = e0Var;
        this.f2271e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$3");
        this.f2270d.c(this.f2271e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$3");
    }
}
