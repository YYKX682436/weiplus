package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzbl */
/* loaded from: classes13.dex */
public final class C2516x394b8a extends java.io.OutputStream {

    /* renamed from: zzcw */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 f7601x394bb4;

    /* renamed from: zzcy */
    private final java.io.OutputStream f7602x394bb6;

    public C2516x394b8a(java.io.OutputStream outputStream) {
        this.f7602x394bb6 = (java.io.OutputStream) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(outputStream);
    }

    private final java.io.IOException zza(java.io.IOException iOException) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75 = this.f7601x394bb4;
        if (c2500x394b75 == null) {
            return iOException;
        }
        android.util.Log.isLoggable("ChannelOutputStream", 2);
        return new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2456x594fe106("Channel closed unexpectedly before stream was finished", c2500x394b75.zzg, c2500x394b75.f7571x394ba7);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7602x394bb6.close();
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.f7602x394bb6.flush();
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i17) {
        try {
            this.f7602x394bb6.write(i17);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    public final void zzc(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75) {
        this.f7601x394bb4 = c2500x394b75;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        try {
            this.f7602x394bb6.write(bArr);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i17, int i18) {
        try {
            this.f7602x394bb6.write(bArr, i17, i18);
        } catch (java.io.IOException e17) {
            throw zza(e17);
        }
    }
}
