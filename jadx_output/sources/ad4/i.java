package ad4;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {
    public i(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        ad4.i iVar = new ad4.i(continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        ad4.i iVar = (ad4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "downloadingTask size:" + ad4.l.a().size());
        for (java.util.Map.Entry entry : ad4.l.a().entrySet()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "exec removeTask task id2:" + ((java.lang.String) entry.getValue()));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di((java.lang.String) entry.getValue());
        }
        ad4.l.a().clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        java.util.HashMap hashMap = ad4.l.f3189b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCancelTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThread$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        android.os.HandlerThread handlerThread = ad4.l.f3190c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThread$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$onDestroy$1");
        return f0Var;
    }
}
