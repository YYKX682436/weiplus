package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzbj extends java.io.InputStream {
    private final java.io.InputStream zzcv;
    private volatile com.google.android.gms.wearable.internal.zzav zzcw;

    public zzbj(java.io.InputStream inputStream) {
        this.zzcv = (java.io.InputStream) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream);
    }

    private final int zza(int i17) {
        com.google.android.gms.wearable.internal.zzav zzavVar;
        if (i17 != -1 || (zzavVar = this.zzcw) == null) {
            return i17;
        }
        throw new com.google.android.gms.wearable.ChannelIOException("Channel closed unexpectedly before stream was finished", zzavVar.zzg, zzavVar.zzcj);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zzcv.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzcv.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i17) {
        this.zzcv.mark(i17);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zzcv.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        return zza(this.zzcv.read());
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.zzcv.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j17) {
        return this.zzcv.skip(j17);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return zza(this.zzcv.read(bArr));
    }

    public final void zza(com.google.android.gms.wearable.internal.zzav zzavVar) {
        this.zzcw = (com.google.android.gms.wearable.internal.zzav) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzavVar);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i17, int i18) {
        return zza(this.zzcv.read(bArr, i17, i18));
    }
}
