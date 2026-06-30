package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzbh implements com.google.android.gms.wearable.Channel.GetOutputStreamResult {
    private final java.io.OutputStream zzcu;
    private final com.google.android.gms.common.api.Status zzp;

    public zzbh(com.google.android.gms.common.api.Status status, java.io.OutputStream outputStream) {
        this.zzp = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status);
        this.zzcu = outputStream;
    }

    @Override // com.google.android.gms.wearable.Channel.GetOutputStreamResult
    public final java.io.OutputStream getOutputStream() {
        return this.zzcu;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        java.io.OutputStream outputStream = this.zzcu;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
