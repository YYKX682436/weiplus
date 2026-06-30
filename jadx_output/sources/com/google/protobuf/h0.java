package com.google.protobuf;

/* loaded from: classes16.dex */
public class h0 extends com.google.protobuf.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f45146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45147e;

    /* renamed from: f, reason: collision with root package name */
    public int f45148f;

    public h0(byte[] bArr, int i17, int i18) {
        super(null);
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        }
        int i19 = i17 + i18;
        if ((i17 | i18 | (bArr.length - i19)) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        this.f45146d = bArr;
        this.f45148f = i17;
        this.f45147e = i19;
    }

    @Override // com.google.protobuf.k0
    public final void A(com.google.protobuf.y yVar) {
        S(yVar.size());
        yVar.s(this);
    }

    @Override // com.google.protobuf.k0
    public final void C(int i17, int i18) {
        Q(i17, 5);
        D(i18);
    }

    @Override // com.google.protobuf.k0
    public final void D(int i17) {
        try {
            byte[] bArr = this.f45146d;
            int i18 = this.f45148f;
            int i19 = i18 + 1;
            bArr[i18] = (byte) (i17 & 255);
            int i27 = i19 + 1;
            bArr[i19] = (byte) ((i17 >> 8) & 255);
            int i28 = i27 + 1;
            bArr[i27] = (byte) ((i17 >> 16) & 255);
            this.f45148f = i28 + 1;
            bArr[i28] = (byte) ((i17 >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(this.f45147e), 1), e17);
        }
    }

    @Override // com.google.protobuf.k0
    public final void E(int i17, long j17) {
        Q(i17, 1);
        F(j17);
    }

    @Override // com.google.protobuf.k0
    public final void F(long j17) {
        try {
            byte[] bArr = this.f45146d;
            int i17 = this.f45148f;
            int i18 = i17 + 1;
            bArr[i17] = (byte) (((int) j17) & 255);
            int i19 = i18 + 1;
            bArr[i18] = (byte) (((int) (j17 >> 8)) & 255);
            int i27 = i19 + 1;
            bArr[i19] = (byte) (((int) (j17 >> 16)) & 255);
            int i28 = i27 + 1;
            bArr[i27] = (byte) (((int) (j17 >> 24)) & 255);
            int i29 = i28 + 1;
            bArr[i28] = (byte) (((int) (j17 >> 32)) & 255);
            int i37 = i29 + 1;
            bArr[i29] = (byte) (((int) (j17 >> 40)) & 255);
            int i38 = i37 + 1;
            bArr[i37] = (byte) (((int) (j17 >> 48)) & 255);
            this.f45148f = i38 + 1;
            bArr[i38] = (byte) (((int) (j17 >> 56)) & 255);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(this.f45147e), 1), e17);
        }
    }

    @Override // com.google.protobuf.k0
    public final void H(int i17, int i18) {
        Q(i17, 0);
        I(i18);
    }

    @Override // com.google.protobuf.k0
    public final void I(int i17) {
        if (i17 >= 0) {
            S(i17);
        } else {
            U(i17);
        }
    }

    @Override // com.google.protobuf.k0
    public final void J(int i17, com.google.protobuf.o8 o8Var) {
        Q(i17, 2);
        L(o8Var);
    }

    @Override // com.google.protobuf.k0
    public final void K(int i17, com.google.protobuf.o8 o8Var, com.google.protobuf.q9 q9Var) {
        Q(i17, 2);
        S(((com.google.protobuf.f) o8Var).getSerializedSize(q9Var));
        q9Var.b(o8Var, this.f45248a);
    }

    @Override // com.google.protobuf.k0
    public final void L(com.google.protobuf.o8 o8Var) {
        S(o8Var.getSerializedSize());
        o8Var.writeTo(this);
    }

    @Override // com.google.protobuf.k0
    public final void M(int i17, com.google.protobuf.o8 o8Var) {
        Q(1, 3);
        R(2, i17);
        J(3, o8Var);
        Q(1, 4);
    }

    @Override // com.google.protobuf.k0
    public final void N(int i17, com.google.protobuf.y yVar) {
        Q(1, 3);
        R(2, i17);
        z(3, yVar);
        Q(1, 4);
    }

    @Override // com.google.protobuf.k0
    public final void O(int i17, java.lang.String str) {
        Q(i17, 2);
        P(str);
    }

    @Override // com.google.protobuf.k0
    public final void P(java.lang.String str) {
        int i17 = this.f45148f;
        try {
            int r17 = com.google.protobuf.k0.r(str.length() * 3);
            int r18 = com.google.protobuf.k0.r(str.length());
            int i18 = this.f45147e;
            byte[] bArr = this.f45146d;
            if (r18 == r17) {
                int i19 = i17 + r18;
                this.f45148f = i19;
                int d17 = com.google.protobuf.ob.f45371a.d(str, bArr, i19, i18 - i19);
                this.f45148f = i17;
                S((d17 - i17) - r18);
                this.f45148f = d17;
            } else {
                S(com.google.protobuf.ob.b(str));
                int i27 = this.f45148f;
                this.f45148f = com.google.protobuf.ob.f45371a.d(str, bArr, i27, i18 - i27);
            }
        } catch (com.google.protobuf.mb e17) {
            this.f45148f = i17;
            u(str, e17);
        } catch (java.lang.IndexOutOfBoundsException e18) {
            throw new com.google.protobuf.i0(e18);
        }
    }

    @Override // com.google.protobuf.k0
    public final void Q(int i17, int i18) {
        S((i17 << 3) | i18);
    }

    @Override // com.google.protobuf.k0
    public final void R(int i17, int i18) {
        Q(i17, 0);
        S(i18);
    }

    @Override // com.google.protobuf.k0
    public final void S(int i17) {
        int i18 = this.f45147e;
        byte[] bArr = this.f45146d;
        if (com.google.protobuf.k0.f45247c && !com.google.protobuf.i.a()) {
            int i19 = this.f45148f;
            if (i18 - i19 >= 5) {
                if ((i17 & (-128)) == 0) {
                    this.f45148f = i19 + 1;
                    com.google.protobuf.ib.r(bArr, i19, (byte) i17);
                    return;
                }
                this.f45148f = i19 + 1;
                com.google.protobuf.ib.r(bArr, i19, (byte) (i17 | 128));
                int i27 = i17 >>> 7;
                if ((i27 & (-128)) == 0) {
                    int i28 = this.f45148f;
                    this.f45148f = i28 + 1;
                    com.google.protobuf.ib.r(bArr, i28, (byte) i27);
                    return;
                }
                int i29 = this.f45148f;
                this.f45148f = i29 + 1;
                com.google.protobuf.ib.r(bArr, i29, (byte) (i27 | 128));
                int i37 = i27 >>> 7;
                if ((i37 & (-128)) == 0) {
                    int i38 = this.f45148f;
                    this.f45148f = i38 + 1;
                    com.google.protobuf.ib.r(bArr, i38, (byte) i37);
                    return;
                }
                int i39 = this.f45148f;
                this.f45148f = i39 + 1;
                com.google.protobuf.ib.r(bArr, i39, (byte) (i37 | 128));
                int i47 = i37 >>> 7;
                if ((i47 & (-128)) == 0) {
                    int i48 = this.f45148f;
                    this.f45148f = i48 + 1;
                    com.google.protobuf.ib.r(bArr, i48, (byte) i47);
                    return;
                } else {
                    int i49 = this.f45148f;
                    this.f45148f = i49 + 1;
                    com.google.protobuf.ib.r(bArr, i49, (byte) (i47 | 128));
                    int i57 = this.f45148f;
                    this.f45148f = i57 + 1;
                    com.google.protobuf.ib.r(bArr, i57, (byte) (i47 >>> 7));
                    return;
                }
            }
        }
        while ((i17 & (-128)) != 0) {
            try {
                int i58 = this.f45148f;
                this.f45148f = i58 + 1;
                bArr[i58] = (byte) ((i17 & 127) | 128);
                i17 >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(i18), 1), e17);
            }
        }
        int i59 = this.f45148f;
        this.f45148f = i59 + 1;
        bArr[i59] = (byte) i17;
    }

    @Override // com.google.protobuf.k0
    public final void T(int i17, long j17) {
        Q(i17, 0);
        U(j17);
    }

    @Override // com.google.protobuf.k0
    public final void U(long j17) {
        int i17 = this.f45147e;
        byte[] bArr = this.f45146d;
        if (com.google.protobuf.k0.f45247c && i17 - this.f45148f >= 10) {
            while ((j17 & (-128)) != 0) {
                int i18 = this.f45148f;
                this.f45148f = i18 + 1;
                com.google.protobuf.ib.r(bArr, i18, (byte) ((((int) j17) & 127) | 128));
                j17 >>>= 7;
            }
            int i19 = this.f45148f;
            this.f45148f = i19 + 1;
            com.google.protobuf.ib.r(bArr, i19, (byte) j17);
            return;
        }
        while ((j17 & (-128)) != 0) {
            try {
                int i27 = this.f45148f;
                this.f45148f = i27 + 1;
                bArr[i27] = (byte) ((((int) j17) & 127) | 128);
                j17 >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(i17), 1), e17);
            }
        }
        int i28 = this.f45148f;
        this.f45148f = i28 + 1;
        bArr[i28] = (byte) j17;
    }

    public final void V(byte[] bArr, int i17, int i18) {
        try {
            java.lang.System.arraycopy(bArr, i17, this.f45146d, this.f45148f, i18);
            this.f45148f += i18;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(this.f45147e), java.lang.Integer.valueOf(i18)), e17);
        }
    }

    @Override // com.google.protobuf.p
    public final void a(byte[] bArr, int i17, int i18) {
        V(bArr, i17, i18);
    }

    @Override // com.google.protobuf.k0
    public final int v() {
        return this.f45147e - this.f45148f;
    }

    @Override // com.google.protobuf.k0
    public final void w(byte b17) {
        try {
            byte[] bArr = this.f45146d;
            int i17 = this.f45148f;
            this.f45148f = i17 + 1;
            bArr[i17] = b17;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.google.protobuf.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f45148f), java.lang.Integer.valueOf(this.f45147e), 1), e17);
        }
    }

    @Override // com.google.protobuf.k0
    public final void x(int i17, boolean z17) {
        Q(i17, 0);
        w(z17 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.k0
    public final void y(byte[] bArr, int i17, int i18) {
        S(i18);
        V(bArr, i17, i18);
    }

    @Override // com.google.protobuf.k0
    public final void z(int i17, com.google.protobuf.y yVar) {
        Q(i17, 2);
        A(yVar);
    }
}
