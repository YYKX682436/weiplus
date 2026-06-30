package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
public class NativeOnCompleteListener implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Object> {
    private final long zza;

    public NativeOnCompleteListener(long j17) {
        this.zza = j17;
    }

    public static void createAndAddCallback(com.google.android.gms.tasks.Task<java.lang.Object> task, long j17) {
        task.addOnCompleteListener(new com.google.android.gms.tasks.NativeOnCompleteListener(j17));
    }

    public native void nativeOnComplete(long j17, java.lang.Object obj, boolean z17, boolean z18, java.lang.String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(com.google.android.gms.tasks.Task<java.lang.Object> task) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
