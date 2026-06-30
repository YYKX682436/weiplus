package a44;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f1250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f1252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.l lVar, int i17, r45.mr5 mr5Var) {
        super(1);
        this.f1250d = lVar;
        this.f1251e = i17;
        this.f1252f = mr5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
        try {
            this.f1250d.hashCode();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "requestCgiAsync canceled " + this.f1251e + ' ' + this.f1252f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
        return f0Var;
    }
}
