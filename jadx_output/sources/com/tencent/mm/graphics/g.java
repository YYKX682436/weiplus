package com.tencent.mm.graphics;

/* loaded from: classes7.dex */
public class g extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f68211d;

    public g(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f68211d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f68211d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.io.IOException e17) {
            com.tencent.stubs.logger.Log.e("MicroMsg.MMBitmapFactory", e17, "fail to mark position.");
            this.f68211d = -1L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f68211d < 0) {
            throw new java.io.IOException("Illegal marked position: " + this.f68211d);
        }
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f68211d);
    }
}
