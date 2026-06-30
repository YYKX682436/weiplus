package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzbl extends java.io.OutputStream {
    private volatile com.google.android.gms.wearable.internal.zzav zzcw;
    private final java.io.OutputStream zzcy;

    public zzbl(java.io.OutputStream outputStream) {
        this.zzcy = (java.io.OutputStream) com.google.android.gms.common.internal.Preconditions.checkNotNull(outputStream);
    }

    private final java.io.IOException zza(java.io.IOException iOException) {
        com.google.android.gms.wearable.internal.zzav zzavVar = this.zzcw;
        if (zzavVar == null) {
            return iOException;
        }
        android.util.Log.isLoggable("ChannelOutputStream", 2);
        return new com.google.android.gms.wearable.ChannelIOException("Channel closed unexpectedly before stream was finished", zzavVar.zzg, zzavVar.zzcj);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzcy.close();
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.zzcy.flush();
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i17) {
        try {
            this.zzcy.write(i17);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    public final void zzc(com.google.android.gms.wearable.internal.zzav zzavVar) {
        this.zzcw = zzavVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        try {
            this.zzcy.write(bArr);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i17, int i18) {
        try {
            this.zzcy.write(bArr, i17, i18);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }
}
