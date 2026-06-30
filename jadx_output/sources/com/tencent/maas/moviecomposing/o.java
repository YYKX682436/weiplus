package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class o extends com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.j f48517a;

    public o(com.tencent.maas.moviecomposing.ExportSession exportSession, com.tencent.maas.moviecomposing.j jVar) {
        super(exportSession);
        this.f48517a = jVar;
    }

    @Override // com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.ExportSession exportSession, java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.CompleteArg completeArg = (com.tencent.maas.moviecomposing.ExportSessionCallback$ExportSessionCallbackArg.CompleteArg) obj;
        com.tencent.maas.moviecomposing.j jVar = this.f48517a;
        if (jVar == null || completeArg == null) {
            return;
        }
        jVar.onComplete(completeArg.error);
    }
}
