package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class eb extends com.p176xb6135e39.p283xc50a8b8b.hb {
    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public void c(long j17, byte[] bArr, long j18, long j19) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public boolean d(java.lang.Object obj, long j17) {
        return com.p176xb6135e39.p283xc50a8b8b.ib.f126743i ? com.p176xb6135e39.p283xc50a8b8b.ib.i(obj, j17) != 0 : com.p176xb6135e39.p283xc50a8b8b.ib.j(obj, j17) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public byte e(long j17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public byte f(java.lang.Object obj, long j17) {
        return com.p176xb6135e39.p283xc50a8b8b.ib.f126743i ? com.p176xb6135e39.p283xc50a8b8b.ib.i(obj, j17) : com.p176xb6135e39.p283xc50a8b8b.ib.j(obj, j17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public double g(java.lang.Object obj, long j17) {
        return java.lang.Double.longBitsToDouble(j(obj, j17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public float h(java.lang.Object obj, long j17) {
        return java.lang.Float.intBitsToFloat(i(obj, j17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public void m(java.lang.Object obj, long j17, boolean z17) {
        if (com.p176xb6135e39.p283xc50a8b8b.ib.f126743i) {
            com.p176xb6135e39.p283xc50a8b8b.ib.s(obj, j17, z17 ? (byte) 1 : (byte) 0);
        } else {
            com.p176xb6135e39.p283xc50a8b8b.ib.t(obj, j17, z17 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public void n(java.lang.Object obj, long j17, byte b17) {
        if (com.p176xb6135e39.p283xc50a8b8b.ib.f126743i) {
            com.p176xb6135e39.p283xc50a8b8b.ib.s(obj, j17, b17);
        } else {
            com.p176xb6135e39.p283xc50a8b8b.ib.t(obj, j17, b17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public void o(java.lang.Object obj, long j17, double d17) {
        r(obj, j17, java.lang.Double.doubleToLongBits(d17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.hb
    public void p(java.lang.Object obj, long j17, float f17) {
        q(obj, j17, java.lang.Float.floatToIntBits(f17));
    }
}
