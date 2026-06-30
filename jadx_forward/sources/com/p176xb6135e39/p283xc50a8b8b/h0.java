package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class h0 extends com.p176xb6135e39.p283xc50a8b8b.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f126679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f126680e;

    /* renamed from: f, reason: collision with root package name */
    public int f126681f;

    public h0(byte[] bArr, int i17, int i18) {
        super(null);
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        }
        int i19 = i17 + i18;
        if ((i17 | i18 | (bArr.length - i19)) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        this.f126679d = bArr;
        this.f126681f = i17;
        this.f126680e = i19;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void A(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        S(yVar.mo20907x35e001());
        yVar.s(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void C(int i17, int i18) {
        Q(i17, 5);
        D(i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void D(int i17) {
        try {
            byte[] bArr = this.f126679d;
            int i18 = this.f126681f;
            int i19 = i18 + 1;
            bArr[i18] = (byte) (i17 & 255);
            int i27 = i19 + 1;
            bArr[i19] = (byte) ((i17 >> 8) & 255);
            int i28 = i27 + 1;
            bArr[i27] = (byte) ((i17 >> 16) & 255);
            this.f126681f = i28 + 1;
            bArr[i28] = (byte) ((i17 >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(this.f126680e), 1), e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void E(int i17, long j17) {
        Q(i17, 1);
        F(j17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void F(long j17) {
        try {
            byte[] bArr = this.f126679d;
            int i17 = this.f126681f;
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
            this.f126681f = i38 + 1;
            bArr[i38] = (byte) (((int) (j17 >> 56)) & 255);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(this.f126680e), 1), e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void H(int i17, int i18) {
        Q(i17, 0);
        I(i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void I(int i17) {
        if (i17 >= 0) {
            S(i17);
        } else {
            U(i17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void J(int i17, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        Q(i17, 2);
        L(o8Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void K(int i17, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        Q(i17, 2);
        S(((com.p176xb6135e39.p283xc50a8b8b.f) o8Var).m20647x9d9c349b(q9Var));
        q9Var.b(o8Var, this.f126781a);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void L(com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        S(o8Var.mo20593x9d9c349b());
        o8Var.mo20600x5f8be6ba(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void M(int i17, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        Q(1, 3);
        R(2, i17);
        J(3, o8Var);
        Q(1, 4);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void N(int i17, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        Q(1, 3);
        R(2, i17);
        z(3, yVar);
        Q(1, 4);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void O(int i17, java.lang.String str) {
        Q(i17, 2);
        P(str);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void P(java.lang.String str) {
        int i17 = this.f126681f;
        try {
            int r17 = com.p176xb6135e39.p283xc50a8b8b.k0.r(str.length() * 3);
            int r18 = com.p176xb6135e39.p283xc50a8b8b.k0.r(str.length());
            int i18 = this.f126680e;
            byte[] bArr = this.f126679d;
            if (r18 == r17) {
                int i19 = i17 + r18;
                this.f126681f = i19;
                int d17 = com.p176xb6135e39.p283xc50a8b8b.ob.f126904a.d(str, bArr, i19, i18 - i19);
                this.f126681f = i17;
                S((d17 - i17) - r18);
                this.f126681f = d17;
            } else {
                S(com.p176xb6135e39.p283xc50a8b8b.ob.b(str));
                int i27 = this.f126681f;
                this.f126681f = com.p176xb6135e39.p283xc50a8b8b.ob.f126904a.d(str, bArr, i27, i18 - i27);
            }
        } catch (com.p176xb6135e39.p283xc50a8b8b.mb e17) {
            this.f126681f = i17;
            u(str, e17);
        } catch (java.lang.IndexOutOfBoundsException e18) {
            throw new com.p176xb6135e39.p283xc50a8b8b.i0(e18);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void Q(int i17, int i18) {
        S((i17 << 3) | i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void R(int i17, int i18) {
        Q(i17, 0);
        S(i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void S(int i17) {
        int i18 = this.f126680e;
        byte[] bArr = this.f126679d;
        if (com.p176xb6135e39.p283xc50a8b8b.k0.f126780c && !com.p176xb6135e39.p283xc50a8b8b.i.a()) {
            int i19 = this.f126681f;
            if (i18 - i19 >= 5) {
                if ((i17 & (-128)) == 0) {
                    this.f126681f = i19 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i19, (byte) i17);
                    return;
                }
                this.f126681f = i19 + 1;
                com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i19, (byte) (i17 | 128));
                int i27 = i17 >>> 7;
                if ((i27 & (-128)) == 0) {
                    int i28 = this.f126681f;
                    this.f126681f = i28 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i28, (byte) i27);
                    return;
                }
                int i29 = this.f126681f;
                this.f126681f = i29 + 1;
                com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i29, (byte) (i27 | 128));
                int i37 = i27 >>> 7;
                if ((i37 & (-128)) == 0) {
                    int i38 = this.f126681f;
                    this.f126681f = i38 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i38, (byte) i37);
                    return;
                }
                int i39 = this.f126681f;
                this.f126681f = i39 + 1;
                com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i39, (byte) (i37 | 128));
                int i47 = i37 >>> 7;
                if ((i47 & (-128)) == 0) {
                    int i48 = this.f126681f;
                    this.f126681f = i48 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i48, (byte) i47);
                    return;
                } else {
                    int i49 = this.f126681f;
                    this.f126681f = i49 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i49, (byte) (i47 | 128));
                    int i57 = this.f126681f;
                    this.f126681f = i57 + 1;
                    com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i57, (byte) (i47 >>> 7));
                    return;
                }
            }
        }
        while ((i17 & (-128)) != 0) {
            try {
                int i58 = this.f126681f;
                this.f126681f = i58 + 1;
                bArr[i58] = (byte) ((i17 & 127) | 128);
                i17 >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(i18), 1), e17);
            }
        }
        int i59 = this.f126681f;
        this.f126681f = i59 + 1;
        bArr[i59] = (byte) i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void T(int i17, long j17) {
        Q(i17, 0);
        U(j17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void U(long j17) {
        int i17 = this.f126680e;
        byte[] bArr = this.f126679d;
        if (com.p176xb6135e39.p283xc50a8b8b.k0.f126780c && i17 - this.f126681f >= 10) {
            while ((j17 & (-128)) != 0) {
                int i18 = this.f126681f;
                this.f126681f = i18 + 1;
                com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i18, (byte) ((((int) j17) & 127) | 128));
                j17 >>>= 7;
            }
            int i19 = this.f126681f;
            this.f126681f = i19 + 1;
            com.p176xb6135e39.p283xc50a8b8b.ib.r(bArr, i19, (byte) j17);
            return;
        }
        while ((j17 & (-128)) != 0) {
            try {
                int i27 = this.f126681f;
                this.f126681f = i27 + 1;
                bArr[i27] = (byte) ((((int) j17) & 127) | 128);
                j17 >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(i17), 1), e17);
            }
        }
        int i28 = this.f126681f;
        this.f126681f = i28 + 1;
        bArr[i28] = (byte) j17;
    }

    public final void V(byte[] bArr, int i17, int i18) {
        try {
            java.lang.System.arraycopy(bArr, i17, this.f126679d, this.f126681f, i18);
            this.f126681f += i18;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(this.f126680e), java.lang.Integer.valueOf(i18)), e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p
    public final void a(byte[] bArr, int i17, int i18) {
        V(bArr, i17, i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final int v() {
        return this.f126680e - this.f126681f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void w(byte b17) {
        try {
            byte[] bArr = this.f126679d;
            int i17 = this.f126681f;
            this.f126681f = i17 + 1;
            bArr[i17] = b17;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new com.p176xb6135e39.p283xc50a8b8b.i0(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f126681f), java.lang.Integer.valueOf(this.f126680e), 1), e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void x(int i17, boolean z17) {
        Q(i17, 0);
        w(z17 ? (byte) 1 : (byte) 0);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void y(byte[] bArr, int i17, int i18) {
        S(i18);
        V(bArr, i17, i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.k0
    public final void z(int i17, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        Q(i17, 2);
        A(yVar);
    }
}
