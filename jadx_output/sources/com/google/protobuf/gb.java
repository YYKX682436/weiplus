package com.google.protobuf;

/* loaded from: classes16.dex */
public final class gb extends com.google.protobuf.hb {
    @Override // com.google.protobuf.hb
    public void c(long j17, byte[] bArr, long j18, long j19) {
        this.f45172a.copyMemory((java.lang.Object) null, j17, bArr, com.google.protobuf.ib.f45208g + j18, j19);
    }

    @Override // com.google.protobuf.hb
    public boolean d(java.lang.Object obj, long j17) {
        return this.f45172a.getBoolean(obj, j17);
    }

    @Override // com.google.protobuf.hb
    public byte e(long j17) {
        return this.f45172a.getByte(j17);
    }

    @Override // com.google.protobuf.hb
    public byte f(java.lang.Object obj, long j17) {
        return this.f45172a.getByte(obj, j17);
    }

    @Override // com.google.protobuf.hb
    public double g(java.lang.Object obj, long j17) {
        return this.f45172a.getDouble(obj, j17);
    }

    @Override // com.google.protobuf.hb
    public float h(java.lang.Object obj, long j17) {
        return this.f45172a.getFloat(obj, j17);
    }

    @Override // com.google.protobuf.hb
    public void m(java.lang.Object obj, long j17, boolean z17) {
        this.f45172a.putBoolean(obj, j17, z17);
    }

    @Override // com.google.protobuf.hb
    public void n(java.lang.Object obj, long j17, byte b17) {
        this.f45172a.putByte(obj, j17, b17);
    }

    @Override // com.google.protobuf.hb
    public void o(java.lang.Object obj, long j17, double d17) {
        this.f45172a.putDouble(obj, j17, d17);
    }

    @Override // com.google.protobuf.hb
    public void p(java.lang.Object obj, long j17, float f17) {
        this.f45172a.putFloat(obj, j17, f17);
    }
}
