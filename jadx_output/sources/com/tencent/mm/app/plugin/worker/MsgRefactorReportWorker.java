package com.tencent.mm.app.plugin.worker;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/app/plugin/worker/MsgRefactorReportWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class MsgRefactorReportWorker extends androidx.work.CoroutineWorker {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f53706o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgRefactorReportWorker(android.content.Context context, androidx.work.WorkerParameters params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f53706o = context;
    }

    @Override // androidx.work.CoroutineWorker
    public java.lang.Object h(kotlin.coroutines.Continuation continuation) {
        androidx.work.WorkerParameters workerParameters = this.f12459e;
        int i17 = workerParameters.f12467c;
        if (i17 >= 10) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgRefactorReportWorker", "doWork() runAttemptCount reach max: " + i17);
            return new a5.v();
        }
        a5.m mVar = workerParameters.f12466b;
        int b17 = mVar.b("DATA_KEY_CHECK_PERIOD", 0);
        java.lang.Object obj = ((java.util.HashMap) mVar.f1411a).get("DATA_KEY_TARGET_TIME");
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        try {
            boolean i18 = i();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "doWork() isNeedRetry: " + i18 + ", runAttemptCount: " + i17 + ", checkPeriod: " + b17 + ", targetTime: " + longValue);
            if (i18) {
                return new a5.w();
            }
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(new yk.z(this));
            return a5.y.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRefactorReportWorker", th6, "report failed", new java.lang.Object[0]);
            return new a5.v();
        }
    }

    public final boolean i() {
        if (!(com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground() || com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "isNeedRetry() isBackground = false");
            return true;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(15, null);
        if (!(com.tencent.mm.sdk.platformtools.t8.q1(l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null) == 0)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "isNeedRetry() notInit");
        return true;
    }
}
