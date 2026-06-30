package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zacv extends com.google.android.gms.common.api.internal.TaskApiCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.TaskApiCall.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacv(com.google.android.gms.common.api.internal.TaskApiCall.Builder builder, com.google.android.gms.common.Feature[] featureArr, boolean z17, int i17) {
        super(featureArr, z17, i17);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.common.api.internal.RemoteCall remoteCall;
        remoteCall = this.zaa.zaa;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
