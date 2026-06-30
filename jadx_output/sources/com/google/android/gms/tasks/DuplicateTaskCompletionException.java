package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
    }

    public static java.lang.IllegalStateException of(com.google.android.gms.tasks.Task<?> task) {
        if (!task.isComplete()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception exception = task.getException();
        return new com.google.android.gms.tasks.DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(java.lang.String.valueOf(task.getResult())) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
    }
}
