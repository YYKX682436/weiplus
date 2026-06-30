package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public class AccountTransferClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.accounttransfer.zzq> {
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzx> zzau;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzx, com.google.android.gms.auth.api.accounttransfer.zzq> zzav;
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.accounttransfer.zzq> zzaw;

    /* loaded from: classes13.dex */
    public static class zzd<T> extends com.google.android.gms.internal.auth.zzv {
        private com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze<T> zzbg;

        public zzd(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze<T> zzeVar) {
            this.zzbg = zzeVar;
        }

        @Override // com.google.android.gms.internal.auth.zzv, com.google.android.gms.internal.auth.zzaa
        public final void onFailure(com.google.android.gms.common.api.Status status) {
            this.zzbg.zzd(status);
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class zze<T> extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.auth.zzx, T> {
        private com.google.android.gms.tasks.TaskCompletionSource<T> zzbh;

        private zze() {
        }

        public /* synthetic */ zze(com.google.android.gms.auth.api.accounttransfer.zzf zzfVar) {
            this();
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzx zzxVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
            this.zzbh = taskCompletionSource;
            zzd((com.google.android.gms.internal.auth.zzac) zzxVar.getService());
        }

        public final void setResult(T t17) {
            this.zzbh.setResult(t17);
        }

        public final void zzd(com.google.android.gms.common.api.Status status) {
            com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd(this.zzbh, status);
        }

        public abstract void zzd(com.google.android.gms.internal.auth.zzac zzacVar);
    }

    /* loaded from: classes13.dex */
    public static abstract class zzf extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zze<java.lang.Void> {
        com.google.android.gms.internal.auth.zzab zzbi;

        private zzf() {
            super(null);
            this.zzbi = new com.google.android.gms.auth.api.accounttransfer.zzn(this);
        }

        public /* synthetic */ zzf(com.google.android.gms.auth.api.accounttransfer.zzf zzfVar) {
            this();
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzx> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzau = clientKey;
        com.google.android.gms.auth.api.accounttransfer.zzf zzfVar = new com.google.android.gms.auth.api.accounttransfer.zzf();
        zzav = zzfVar;
        zzaw = new com.google.android.gms.common.api.Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzfVar, clientKey);
    }

    public AccountTransferClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) zzaw, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.Status status) {
        taskCompletionSource.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> getDeviceMetaData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zzj(this, new com.google.android.gms.internal.auth.zzy(str)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> notifyCompletion(java.lang.String str, int i17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzm(this, new com.google.android.gms.internal.auth.zzae(str, i17)));
    }

    public com.google.android.gms.tasks.Task<byte[]> retrieveData(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return doRead(new com.google.android.gms.auth.api.accounttransfer.zzh(this, new com.google.android.gms.internal.auth.zzag(str)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendData(java.lang.String str, byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzg(this, new com.google.android.gms.internal.auth.zzai(str, bArr)));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> showUserChallenge(java.lang.String str, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.zzl(this, new com.google.android.gms.internal.auth.zzak(str, pendingIntent)));
    }

    public AccountTransferClient(android.content.Context context) {
        super(context, zzaw, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }
}
