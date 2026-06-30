package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class r extends com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.m f48520a;

    public r(com.tencent.maas.moviecomposing.ExportSession exportSession, com.tencent.maas.moviecomposing.m mVar, boolean z17) {
        super(exportSession, z17);
        this.f48520a = mVar;
    }

    @Override // com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportProgressArgs onExportProgressArgs = (com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportProgressArgs) obj;
        com.tencent.maas.moviecomposing.m mVar = this.f48520a;
        if (mVar == null || onExportProgressArgs == null) {
            return;
        }
        mVar.a(onExportProgressArgs.frameIndex);
    }
}
