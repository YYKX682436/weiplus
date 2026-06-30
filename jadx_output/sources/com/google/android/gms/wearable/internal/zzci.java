package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzci implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult {
    private volatile boolean closed = false;
    private volatile java.io.InputStream zzct;
    private volatile android.os.ParcelFileDescriptor zzf;
    private final com.google.android.gms.common.api.Status zzp;

    public zzci(com.google.android.gms.common.api.Status status, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zzp = status;
        this.zzf = parcelFileDescriptor;
    }

    @Override // com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    public final android.os.ParcelFileDescriptor getFd() {
        if (this.closed) {
            throw new java.lang.IllegalStateException("Cannot access the file descriptor after release().");
        }
        return this.zzf;
    }

    @Override // com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    public final java.io.InputStream getInputStream() {
        if (this.closed) {
            throw new java.lang.IllegalStateException("Cannot access the input stream after release().");
        }
        if (this.zzf == null) {
            return null;
        }
        if (this.zzct == null) {
            this.zzct = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.zzf);
        }
        return this.zzct;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        if (this.zzf == null) {
            return;
        }
        if (this.closed) {
            throw new java.lang.IllegalStateException("releasing an already released result.");
        }
        try {
            if (this.zzct != null) {
                this.zzct.close();
            } else {
                this.zzf.close();
            }
            this.closed = true;
            this.zzf = null;
            this.zzct = null;
        } catch (java.io.IOException unused) {
        }
    }
}
