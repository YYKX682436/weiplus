package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabb implements com.google.android.gms.common.api.ResultCallback {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zad;

    public zabb(com.google.android.gms.common.api.internal.zabe zabeVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z17, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zad = zabeVar;
        this.zaa = statusPendingResult;
        this.zab = z17;
        this.zac = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(com.google.android.gms.common.api.Result result) {
        android.content.Context context;
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) result;
        context = this.zad.zan;
        com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).zac();
        if (status.isSuccess() && this.zad.isConnected()) {
            com.google.android.gms.common.api.internal.zabe zabeVar = this.zad;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
