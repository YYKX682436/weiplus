package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> canceledPendingResult() {
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> immediateFailedResult(R r17, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r17, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!r17.getStatus().isSuccess(), "Status code must not be SUCCESS");
        com.google.android.gms.common.api.zag zagVar = new com.google.android.gms.common.api.zag(googleApiClient, r17);
        zagVar.setResult(r17);
        return zagVar;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r17, "Result must not be null");
        com.google.android.gms.common.api.zah zahVar = new com.google.android.gms.common.api.zah(null);
        zahVar.setResult(r17);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zahVar);
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> canceledPendingResult(R r17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r17, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(r17.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        com.google.android.gms.common.api.zaf zafVar = new com.google.android.gms.common.api.zaf(r17);
        zafVar.cancel();
        return zafVar;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r17, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r17, "Result must not be null");
        com.google.android.gms.common.api.zah zahVar = new com.google.android.gms.common.api.zah(googleApiClient);
        zahVar.setResult(r17);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zahVar);
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
