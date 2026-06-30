package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zacy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.Result zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zab;

    public zacy(com.google.android.gms.common.api.internal.zada zadaVar, com.google.android.gms.common.api.Result result) {
        this.zab = zadaVar;
        this.zaa = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference;
        com.google.android.gms.common.api.internal.zacz zaczVar;
        com.google.android.gms.common.api.internal.zacz zaczVar2;
        java.lang.ref.WeakReference weakReference2;
        com.google.android.gms.common.api.GoogleApiClient googleApiClient;
        com.google.android.gms.common.api.ResultTransform resultTransform;
        com.google.android.gms.common.api.internal.zacz zaczVar3;
        com.google.android.gms.common.api.internal.zacz zaczVar4;
        java.lang.ref.WeakReference weakReference3;
        try {
            try {
                java.lang.ThreadLocal threadLocal = com.google.android.gms.common.api.internal.BasePendingResult.zaa;
                threadLocal.set(java.lang.Boolean.TRUE);
                resultTransform = this.zab.zaa;
                com.google.android.gms.common.api.PendingResult onSuccess = ((com.google.android.gms.common.api.ResultTransform) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultTransform)).onSuccess(this.zaa);
                com.google.android.gms.common.api.internal.zada zadaVar = this.zab;
                zaczVar3 = zadaVar.zah;
                zaczVar4 = zadaVar.zah;
                zaczVar3.sendMessage(zaczVar4.obtainMessage(0, onSuccess));
                threadLocal.set(java.lang.Boolean.FALSE);
                com.google.android.gms.common.api.internal.zada zadaVar2 = this.zab;
                com.google.android.gms.common.api.internal.zada.zan(this.zaa);
                weakReference3 = this.zab.zag;
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (java.lang.RuntimeException e17) {
                com.google.android.gms.common.api.internal.zada zadaVar3 = this.zab;
                zaczVar = zadaVar3.zah;
                zaczVar2 = zadaVar3.zah;
                zaczVar.sendMessage(zaczVar2.obtainMessage(1, e17));
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(java.lang.Boolean.FALSE);
                com.google.android.gms.common.api.internal.zada zadaVar4 = this.zab;
                com.google.android.gms.common.api.internal.zada.zan(this.zaa);
                weakReference2 = this.zab.zag;
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) weakReference2.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.zab);
        } catch (java.lang.Throwable th6) {
            com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(java.lang.Boolean.FALSE);
            com.google.android.gms.common.api.internal.zada zadaVar5 = this.zab;
            com.google.android.gms.common.api.internal.zada.zan(this.zaa);
            weakReference = this.zab.zag;
            com.google.android.gms.common.api.GoogleApiClient googleApiClient2 = (com.google.android.gms.common.api.GoogleApiClient) weakReference.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
            throw th6;
        }
    }
}
