package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public abstract class TaskApiCall<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
    private final com.google.android.gms.common.Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* loaded from: classes13.dex */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
        private com.google.android.gms.common.api.internal.RemoteCall zaa;
        private com.google.android.gms.common.Feature[] zac;
        private boolean zab = true;
        private int zad = 0;

        private Builder() {
        }

        public com.google.android.gms.common.api.internal.TaskApiCall<A, ResultT> build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new com.google.android.gms.common.api.internal.zacv(this, this.zac, this.zab, this.zad);
        }

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> execute(final com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacu
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    com.google.android.gms.common.util.BiConsumer.this.accept((com.google.android.gms.common.api.Api.AnyClient) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> run(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z17) {
            this.zab = z17;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setFeatures(com.google.android.gms.common.Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setMethodKey(int i17) {
            this.zad = i17;
            return this;
        }

        public /* synthetic */ Builder(com.google.android.gms.common.api.internal.zacw zacwVar) {
        }
    }

    @java.lang.Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> builder() {
        return new com.google.android.gms.common.api.internal.TaskApiCall.Builder<>(null);
    }

    public abstract void doExecute(A a17, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final com.google.android.gms.common.Feature[] zab() {
        return this.zaa;
    }

    public TaskApiCall(com.google.android.gms.common.Feature[] featureArr, boolean z17, int i17) {
        this.zaa = featureArr;
        boolean z18 = false;
        if (featureArr != null && z17) {
            z18 = true;
        }
        this.zab = z18;
        this.zac = i17;
    }
}
