package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class j1 extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f274285d;

    public j1(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f274285d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i17) {
        try {
            this.f274285d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileSeekingInputStream", e17, "Failed seeking FileChannel.", new java.lang.Object[0]);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f274285d);
    }
}
