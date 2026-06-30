package ad4;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f3186d;

    public j(java.util.Map.Entry entry) {
        this.f3186d = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1$1");
        sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
        java.util.Map.Entry entry = this.f3186d;
        ((rx.l) e0Var).Di((java.lang.String) entry.getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveImageDownloadUtil", "exec removeTask task id:" + ((java.lang.String) entry.getKey()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1$1");
    }
}
