package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
final class zacx implements com.google.android.gms.tasks.Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
        if (((java.lang.Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, "listener already unregistered"));
    }
}
