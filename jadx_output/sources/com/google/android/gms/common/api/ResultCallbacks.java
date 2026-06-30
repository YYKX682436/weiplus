package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public abstract void onFailure(com.google.android.gms.common.api.Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r17) {
        com.google.android.gms.common.api.Status status = r17.getStatus();
        if (status.isSuccess()) {
            onSuccess(r17);
            return;
        }
        onFailure(status);
        if (r17 instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) r17).release();
            } catch (java.lang.RuntimeException unused) {
                "Unable to release ".concat(java.lang.String.valueOf(r17));
            }
        }
    }

    public abstract void onSuccess(R r17);
}
