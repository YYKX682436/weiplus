package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class s extends com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.n f48521a;

    public s(com.tencent.maas.moviecomposing.ExportSession exportSession, com.tencent.maas.moviecomposing.n nVar) {
        super(exportSession);
        this.f48521a = nVar;
    }

    @Override // com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportStartedArgs onExportStartedArgs = (com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportStartedArgs) obj;
        com.tencent.maas.moviecomposing.n nVar = this.f48521a;
        if (nVar == null || onExportStartedArgs == null) {
            return;
        }
        nVar.a(onExportStartedArgs.totalFrameCount);
    }
}
