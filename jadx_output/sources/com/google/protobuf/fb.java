package com.google.protobuf;

/* loaded from: classes16.dex */
public final class fb extends com.google.protobuf.hb {
    @Override // com.google.protobuf.hb
    public void c(long j17, byte[] bArr, long j18, long j19) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.hb
    public boolean d(java.lang.Object obj, long j17) {
        return com.google.protobuf.ib.f45210i ? com.google.protobuf.ib.i(obj, j17) != 0 : com.google.protobuf.ib.j(obj, j17) != 0;
    }

    @Override // com.google.protobuf.hb
    public byte e(long j17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.hb
    public byte f(java.lang.Object obj, long j17) {
        return com.google.protobuf.ib.f45210i ? com.google.protobuf.ib.i(obj, j17) : com.google.protobuf.ib.j(obj, j17);
    }

    @Override // com.google.protobuf.hb
    public double g(java.lang.Object obj, long j17) {
        return java.lang.Double.longBitsToDouble(j(obj, j17));
    }

    @Override // com.google.protobuf.hb
    public float h(java.lang.Object obj, long j17) {
        return java.lang.Float.intBitsToFloat(i(obj, j17));
    }

    @Override // com.google.protobuf.hb
    public void m(java.lang.Object obj, long j17, boolean z17) {
        if (com.google.protobuf.ib.f45210i) {
            com.google.protobuf.ib.s(obj, j17, z17 ? (byte) 1 : (byte) 0);
        } else {
            com.google.protobuf.ib.t(obj, j17, z17 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.protobuf.hb
    public void n(java.lang.Object obj, long j17, byte b17) {
        if (com.google.protobuf.ib.f45210i) {
            com.google.protobuf.ib.s(obj, j17, b17);
        } else {
            com.google.protobuf.ib.t(obj, j17, b17);
        }
    }

    @Override // com.google.protobuf.hb
    public void o(java.lang.Object obj, long j17, double d17) {
        r(obj, j17, java.lang.Double.doubleToLongBits(d17));
    }

    @Override // com.google.protobuf.hb
    public void p(java.lang.Object obj, long j17, float f17) {
        q(obj, j17, java.lang.Float.floatToIntBits(f17));
    }
}
