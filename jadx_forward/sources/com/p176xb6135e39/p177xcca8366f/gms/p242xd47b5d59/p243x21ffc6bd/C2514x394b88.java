package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzbj */
/* loaded from: classes13.dex */
public final class C2514x394b88 extends java.io.InputStream {

    /* renamed from: zzcv */
    private final java.io.InputStream f7598x394bb3;

    /* renamed from: zzcw */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 f7599x394bb4;

    public C2514x394b88(java.io.InputStream inputStream) {
        this.f7598x394bb3 = (java.io.InputStream) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(inputStream);
    }

    private final int zza(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75;
        if (i17 != -1 || (c2500x394b75 = this.f7599x394bb4) == null) {
            return i17;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2456x594fe106("Channel closed unexpectedly before stream was finished", c2500x394b75.zzg, c2500x394b75.f7571x394ba7);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7598x394bb3.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7598x394bb3.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i17) {
        this.f7598x394bb3.mark(i17);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f7598x394bb3.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        return zza(this.f7598x394bb3.read());
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f7598x394bb3.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j17) {
        return this.f7598x394bb3.skip(j17);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return zza(this.f7598x394bb3.read(bArr));
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75) {
        this.f7599x394bb4 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2500x394b75);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i17, int i18) {
        return zza(this.f7598x394bb3.read(bArr, i17, i18));
    }
}
