package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zaaf {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab = new com.google.android.gms.tasks.TaskCompletionSource();

    public zaaf(com.google.android.gms.common.api.internal.ApiKey apiKey) {
        this.zaa = apiKey;
    }

    public final com.google.android.gms.common.api.internal.ApiKey zaa() {
        return this.zaa;
    }

    public final com.google.android.gms.tasks.TaskCompletionSource zab() {
        return this.zab;
    }
}
