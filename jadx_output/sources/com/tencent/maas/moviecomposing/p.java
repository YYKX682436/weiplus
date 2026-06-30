package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class p extends com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.k f48518a;

    public p(com.tencent.maas.moviecomposing.ExportSession exportSession, com.tencent.maas.moviecomposing.k kVar) {
        super(exportSession);
        this.f48518a = kVar;
    }

    @Override // com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportCompleteArgs onExportCompleteArgs = (com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.OnExportCompleteArgs) obj;
        com.tencent.maas.moviecomposing.k kVar = this.f48518a;
        if (kVar == null || onExportCompleteArgs == null) {
            return;
        }
        kVar.a(onExportCompleteArgs.checksum, onExportCompleteArgs.isSoftwareEncoding, onExportCompleteArgs.error);
    }
}
