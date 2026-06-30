package com.p314xaae8f345.mm.p786x600aa8b;

/* loaded from: classes7.dex */
public class g extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f149744d;

    public g(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f149744d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i17) {
        try {
            this.f149744d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("MicroMsg.MMBitmapFactory", e17, "fail to mark position.");
            this.f149744d = -1L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f149744d < 0) {
            throw new java.io.IOException("Illegal marked position: " + this.f149744d);
        }
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f149744d);
    }
}
