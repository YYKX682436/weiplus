package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class g0 extends com.google.protobuf.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f45092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45093e;

    /* renamed from: f, reason: collision with root package name */
    public int f45094f;

    public g0(int i17) {
        super(null);
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[java.lang.Math.max(i17, 20)];
        this.f45092d = bArr;
        this.f45093e = bArr.length;
    }

    public final void V(int i17) {
        int i18 = this.f45094f;
        int i19 = i18 + 1;
        byte[] bArr = this.f45092d;
        bArr[i18] = (byte) (i17 & 255);
        int i27 = i19 + 1;
        bArr[i19] = (byte) ((i17 >> 8) & 255);
        int i28 = i27 + 1;
        bArr[i27] = (byte) ((i17 >> 16) & 255);
        this.f45094f = i28 + 1;
        bArr[i28] = (byte) ((i17 >> 24) & 255);
    }

    public final void W(long j17) {
        int i17 = this.f45094f;
        int i18 = i17 + 1;
        byte[] bArr = this.f45092d;
        bArr[i17] = (byte) (j17 & 255);
        int i19 = i18 + 1;
        bArr[i18] = (byte) ((j17 >> 8) & 255);
        int i27 = i19 + 1;
        bArr[i19] = (byte) ((j17 >> 16) & 255);
        int i28 = i27 + 1;
        bArr[i27] = (byte) (255 & (j17 >> 24));
        int i29 = i28 + 1;
        bArr[i28] = (byte) (((int) (j17 >> 32)) & 255);
        int i37 = i29 + 1;
        bArr[i29] = (byte) (((int) (j17 >> 40)) & 255);
        int i38 = i37 + 1;
        bArr[i37] = (byte) (((int) (j17 >> 48)) & 255);
        this.f45094f = i38 + 1;
        bArr[i38] = (byte) (((int) (j17 >> 56)) & 255);
    }

    public final void X(int i17, int i18) {
        Y((i17 << 3) | i18);
    }

    public final void Y(int i17) {
        boolean z17 = com.google.protobuf.k0.f45247c;
        byte[] bArr = this.f45092d;
        if (z17) {
            while ((i17 & (-128)) != 0) {
                int i18 = this.f45094f;
                this.f45094f = i18 + 1;
                com.google.protobuf.ib.r(bArr, i18, (byte) ((i17 & 127) | 128));
                i17 >>>= 7;
            }
            int i19 = this.f45094f;
            this.f45094f = i19 + 1;
            com.google.protobuf.ib.r(bArr, i19, (byte) i17);
            return;
        }
        while ((i17 & (-128)) != 0) {
            int i27 = this.f45094f;
            this.f45094f = i27 + 1;
            bArr[i27] = (byte) ((i17 & 127) | 128);
            i17 >>>= 7;
        }
        int i28 = this.f45094f;
        this.f45094f = i28 + 1;
        bArr[i28] = (byte) i17;
    }

    public final void Z(long j17) {
        boolean z17 = com.google.protobuf.k0.f45247c;
        byte[] bArr = this.f45092d;
        if (z17) {
            while ((j17 & (-128)) != 0) {
                int i17 = this.f45094f;
                this.f45094f = i17 + 1;
                com.google.protobuf.ib.r(bArr, i17, (byte) ((((int) j17) & 127) | 128));
                j17 >>>= 7;
            }
            int i18 = this.f45094f;
            this.f45094f = i18 + 1;
            com.google.protobuf.ib.r(bArr, i18, (byte) j17);
            return;
        }
        while ((j17 & (-128)) != 0) {
            int i19 = this.f45094f;
            this.f45094f = i19 + 1;
            bArr[i19] = (byte) ((((int) j17) & 127) | 128);
            j17 >>>= 7;
        }
        int i27 = this.f45094f;
        this.f45094f = i27 + 1;
        bArr[i27] = (byte) j17;
    }

    @Override // com.google.protobuf.k0
    public final int v() {
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
