package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class q extends com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.l f48519a;

    public q(com.tencent.maas.moviecomposing.ExportSession exportSession, com.tencent.maas.moviecomposing.l lVar) {
        super(exportSession);
        this.f48519a = lVar;
    }

    @Override // com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportCompleteWithDetailsArgs onExportCompleteWithDetailsArgs = (com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportCompleteWithDetailsArgs) obj;
        com.tencent.maas.moviecomposing.l lVar = this.f48519a;
        if (lVar == null || onExportCompleteWithDetailsArgs == null) {
            return;
        }
        com.tencent.maas.moviecomposing.MJExportResultDetails mJExportResultDetails = onExportCompleteWithDetailsArgs.resultDetails;
        com.tencent.maas.instamovie.base.MJError mJError = onExportCompleteWithDetailsArgs.error;
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "startExporting: onComplete, resultDetail:" + mJExportResultDetails + ", error:" + mJError);
        ((kotlinx.coroutines.r) ((gx0.k8) lVar).f276619a).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(mJExportResultDetails, mJError)));
    }
}
