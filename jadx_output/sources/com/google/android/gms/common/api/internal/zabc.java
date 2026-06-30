package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(com.google.android.gms.common.api.internal.zabe zabeVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            com.google.android.gms.common.api.internal.zabe.zaj(this.zaa);
        } else {
            if (i17 != 2) {
                return;
            }
            com.google.android.gms.common.api.internal.zabe.zai(this.zaa);
        }
    }
}
