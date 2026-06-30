package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzbg implements com.google.android.gms.wearable.Channel.GetInputStreamResult {
    private final java.io.InputStream zzct;
    private final com.google.android.gms.common.api.Status zzp;

    public zzbg(com.google.android.gms.common.api.Status status, java.io.InputStream inputStream) {
        this.zzp = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status);
        this.zzct = inputStream;
    }

    @Override // com.google.android.gms.wearable.Channel.GetInputStreamResult
    public final java.io.InputStream getInputStream() {
        return this.zzct;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        java.io.InputStream inputStream = this.zzct;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
