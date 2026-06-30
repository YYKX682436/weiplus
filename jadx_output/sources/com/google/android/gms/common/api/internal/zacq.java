package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zacq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    public zacq(com.google.android.gms.common.api.internal.zact zactVar) {
        this.zaa = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zacs zacsVar;
        zacsVar = this.zaa.zah;
        zacsVar.zae(new com.google.android.gms.common.ConnectionResult(4));
    }
}
