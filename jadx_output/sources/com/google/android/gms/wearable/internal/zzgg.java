package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgg implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> {
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zzes;

    public zzgg(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zzes.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource;
        java.lang.Boolean bool;
        com.google.android.gms.common.api.Status status2 = status;
        int statusCode = status2.getStatusCode();
        if (statusCode == 0) {
            taskCompletionSource = this.zzes;
            bool = java.lang.Boolean.TRUE;
        } else if (statusCode != 4002) {
            setFailedResult(status2);
            return;
        } else {
            taskCompletionSource = this.zzes;
            bool = java.lang.Boolean.FALSE;
        }
        taskCompletionSource.setResult(bool);
    }
}
