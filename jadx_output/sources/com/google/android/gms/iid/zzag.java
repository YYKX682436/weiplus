package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzag extends android.os.Handler {
    private final /* synthetic */ com.google.android.gms.iid.zzaf zzcx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(com.google.android.gms.iid.zzaf zzafVar, android.os.Looper looper) {
        super(looper);
        this.zzcx = zzafVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        this.zzcx.zze(message);
    }
}
