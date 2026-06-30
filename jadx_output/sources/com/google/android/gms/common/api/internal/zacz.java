package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(com.google.android.gms.common.api.internal.zada zadaVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.google.android.gms.common.api.internal.zada zadaVar;
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(java.lang.String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        com.google.android.gms.common.api.PendingResult pendingResult = (com.google.android.gms.common.api.PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            zadaVar = this.zaa.zab;
            com.google.android.gms.common.api.internal.zada zadaVar2 = (com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(zadaVar);
            if (pendingResult == null) {
                zadaVar2.zaj(new com.google.android.gms.common.api.Status(13, "Transform returned null"));
            } else if (pendingResult instanceof com.google.android.gms.common.api.internal.zacp) {
                zadaVar2.zaj(((com.google.android.gms.common.api.internal.zacp) pendingResult).zaa());
            } else {
                zadaVar2.zai(pendingResult);
            }
        }
    }
}
