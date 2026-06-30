package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public final class Batch extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final com.google.android.gms.common.api.PendingResult[] zah;
    private final java.lang.Object zai;

    /* loaded from: classes13.dex */
    public static final class Builder {
        private final java.util.List zaa = new java.util.ArrayList();
        private final com.google.android.gms.common.api.GoogleApiClient zab;

        public Builder(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            this.zab = googleApiClient;
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.BatchResultToken<R> add(com.google.android.gms.common.api.PendingResult<R> pendingResult) {
            com.google.android.gms.common.api.BatchResultToken<R> batchResultToken = new com.google.android.gms.common.api.BatchResultToken<>(this.zaa.size());
            this.zaa.add(pendingResult);
            return batchResultToken;
        }

        public com.google.android.gms.common.api.Batch build() {
            return new com.google.android.gms.common.api.Batch(this.zaa, this.zab, null);
        }
    }

    public /* synthetic */ Batch(java.util.List list, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.zac zacVar) {
        super(googleApiClient);
        this.zai = new java.lang.Object();
        int size = list.size();
        this.zae = size;
        com.google.android.gms.common.api.PendingResult[] pendingResultArr = new com.google.android.gms.common.api.PendingResult[size];
        this.zah = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new com.google.android.gms.common.api.BatchResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.google.android.gms.common.api.PendingResult pendingResult = (com.google.android.gms.common.api.PendingResult) list.get(i17);
            this.zah[i17] = pendingResult;
            pendingResult.addStatusListener(new com.google.android.gms.common.api.zab(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i17 = 0;
        while (true) {
            com.google.android.gms.common.api.PendingResult[] pendingResultArr = this.zah;
            if (i17 >= pendingResultArr.length) {
                return;
            }
            pendingResultArr[i17].cancel();
            i17++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public com.google.android.gms.common.api.BatchResult createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.common.api.BatchResult(status, this.zah);
    }
}
