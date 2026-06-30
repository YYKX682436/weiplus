package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    com.google.android.gms.tasks.Task<TContinuationResult> then(TResult tresult);
}
