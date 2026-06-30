package a44;

/* loaded from: classes4.dex */
public final class o implements za4.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1300b;

    public o(java.lang.ref.WeakReference weakReference, int i17) {
        this.f1299a = weakReference;
        this.f1300b = i17;
    }

    @Override // za4.f
    public void a(long j17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 103);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download stopped but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download stopped");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(downloadHelper.h(), 0, null, 2, null);
                downloadHelper.m();
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = downloadHelper.f162653t;
                if (u3Var2 != null) {
                    if ((u3Var2.isShowing()) && (u3Var = downloadHelper.f162653t) != null) {
                        u3Var.dismiss();
                    }
                }
                android.content.Context context = downloadHelper.f162640d;
                if (context != null) {
                    db5.t7.h(context, context.getString(com.tencent.mm.R.string.f493169lo2));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 104);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download succeed but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download succeed");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = downloadHelper.f162649p;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                j44.j.p(downloadHelper.h(), 3, null, 2, null);
                downloadHelper.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void c(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download get progress but downloadHelper is null, id is " + j17 + ", progress is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download progress is " + i17);
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j h17 = downloadHelper.h();
                h17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = h17.f297686d;
                if (roundProgressBtn != null) {
                    roundProgressBtn.setProgress(i17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
                if (i17 > 0 && !downloadHelper.f162650q) {
                    downloadHelper.f162650q = true;
                    ((kotlinx.coroutines.flow.q2) downloadHelper.f162652s).e(java.lang.Boolean.TRUE);
                    downloadHelper.m();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void d(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 102);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download resumed but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download resumed");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(downloadHelper.h(), 1, null, 2, null);
                downloadHelper.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void e(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 105);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download failed but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download failed");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(downloadHelper.f162641e.b());
            if (l17 != null && l17.longValue() == j17) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = downloadHelper.f162649p;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                downloadHelper.h().l();
                android.content.Context context = downloadHelper.f162640d;
                if (context != null) {
                    java.lang.String string = context.getString(com.tencent.mm.R.string.j6z);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                    ((ku5.t0) ku5.t0.f312615d).B(new a44.c0(downloadHelper, string));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                }
                j44.j.p(downloadHelper.h(), 0, null, 2, null);
                downloadHelper.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void f(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 101);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download paused but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download paused");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(downloadHelper.h(), 2, null, 2, null);
                downloadHelper.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }

    @Override // za4.f
    public void n(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
        a44.m.a(this.f1300b, 100);
        java.lang.ref.WeakReference weakReference = this.f1299a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper = (com.tencent.mm.plugin.sns.ad.download.DownloadHelper) weakReference.get();
        if (downloadHelper == null) {
            com.tencent.mars.xlog.Log.w("DownloadCallback", "download start but downloadHelper is null, id is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "id is " + j17 + ", download start");
        h44.b bVar = downloadHelper.f162641e;
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f471140g;
            kotlin.jvm.internal.o.f(callbackIds, "callbackIds");
            java.lang.Long l17 = (java.lang.Long) callbackIds.get(bVar.b());
            if (l17 != null && l17.longValue() == j17) {
                j44.j.p(downloadHelper.h(), 1, null, 2, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.download.DownloadCallback");
    }
}
