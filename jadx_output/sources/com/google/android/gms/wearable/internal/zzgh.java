package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgh implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> {
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zzes;

    public zzgh(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzes.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.Status status2 = status;
        int statusCode = status2.getStatusCode();
        if (statusCode == 0 || statusCode == 4001) {
            this.zzes.setResult(null);
        } else {
            setFailedResult(status2);
        }
    }
}
