package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(com.google.android.gms.common.api.internal.zabi zabiVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            ((com.google.android.gms.common.api.internal.zabg) message.obj).zab(this.zaa);
        } else if (i17 == 2) {
            throw ((java.lang.RuntimeException) message.obj);
        }
    }
}
