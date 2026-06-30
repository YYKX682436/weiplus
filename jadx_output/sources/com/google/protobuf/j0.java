package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j0 extends com.google.protobuf.g0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.io.OutputStream f45215g;

    public j0(java.io.OutputStream outputStream, int i17) {
        super(i17);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.f45215g = outputStream;
    }

    @Override // com.google.protobuf.k0
    public void A(com.google.protobuf.y yVar) {
        S(yVar.size());
        yVar.s(this);
    }

    @Override // com.google.protobuf.k0
    public void C(int i17, int i18) {
        b0(14);
        X(i17, 5);
        V(i18);
    }

    @Override // com.google.protobuf.k0
    public void D(int i17) {
        b0(4);
        V(i17);
    }

    @Override // com.google.protobuf.k0
    public void E(int i17, long j17) {
        b0(18);
        X(i17, 1);
        W(j17);
    }

    @Override // com.google.protobuf.k0
    public void F(long j17) {
        b0(8);
        W(j17);
    }

    @Override // com.google.protobuf.k0
    public void H(int i17, int i18) {
        b0(20);
        X(i17, 0);
        if (i18 >= 0) {
            Y(i18);
        } else {
            Z(i18);
        }
    }

    @Override // com.google.protobuf.k0
    public void I(int i17) {
        if (i17 >= 0) {
            S(i17);
        } else {
            U(i17);
        }
    }

    @Override // com.google.protobuf.k0
    public void J(int i17, com.google.protobuf.o8 o8Var) {
        Q(i17, 2);
        L(o8Var);
    }

    @Override // com.google.protobuf.k0
    public void K(int i17, com.google.protobuf.o8 o8Var, com.google.protobuf.q9 q9Var) {
        Q(i17, 2);
        S(((com.google.protobuf.f) o8Var).getSerializedSize(q9Var));
        q9Var.b(o8Var, this.f45248a);
    }

    @Override // com.google.protobuf.k0
    public void L(com.google.protobuf.o8 o8Var) {
        S(o8Var.getSerializedSize());
        o8Var.writeTo(this);
    }

    @Override // com.google.protobuf.k0
    public void M(int i17, com.google.protobuf.o8 o8Var) {
        Q(1, 3);
        R(2, i17);
        J(3, o8Var);
        Q(1, 4);
    }

    @Override // com.google.protobuf.k0
    public void N(int i17, com.google.protobuf.y yVar) {
        Q(1, 3);
        R(2, i17);
        z(3, yVar);
        Q(1, 4);
    }

    @Override // com.google.protobuf.k0
    public void O(int i17, java.lang.String str) {
        Q(i17, 2);
        P(str);
    }

    @Override // com.google.protobuf.k0
    public void P(java.lang.String str) {
        try {
            int length = str.length() * 3;
            int r17 = com.google.protobuf.k0.r(length);
            int i17 = r17 + length;
            int i18 = this.f45093e;
            if (i17 > i18) {
                byte[] bArr = new byte[length];
                int d17 = com.google.protobuf.ob.f45371a.d(str, bArr, 0, length);
                S(d17);
                c0(bArr, 0, d17);
                return;
            }
            if (i17 > i18 - this.f45094f) {
                a0();
            }
            int r18 = com.google.protobuf.k0.r(str.length());
            int i19 = this.f45094f;
            byte[] bArr2 = this.f45092d;
            try {
                try {
                    if (r18 == r17) {
                        int i27 = i19 + r18;
                        this.f45094f = i27;
                        int d18 = com.google.protobuf.ob.f45371a.d(str, bArr2, i27, i18 - i27);
                        this.f45094f = i19;
                        Y((d18 - i19) - r18);
                        this.f45094f = d18;
                    } else {
                        int b17 = com.google.protobuf.ob.b(str);
                        Y(b17);
                        this.f45094f = com.google.protobuf.ob.f45371a.d(str, bArr2, this.f45094f, b17);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                    throw new com.google.protobuf.i0(e17);
                }
            } catch (com.google.protobuf.mb e18) {
                this.f45094f = i19;
                throw e18;
            }
        } catch (com.google.protobuf.mb e19) {
            u(str, e19);
        }
    }

    @Override // com.google.protobuf.k0
    public void Q(int i17, int i18) {
        S((i17 << 3) | i18);
    }

    @Override // com.google.protobuf.k0
    public void R(int i17, int i18) {
        b0(20);
        X(i17, 0);
        Y(i18);
    }

    @Override // com.google.protobuf.k0
    public void S(int i17) {
        b0(5);
        Y(i17);
    }

    @Override // com.google.protobuf.k0
    public void T(int i17, long j17) {
        b0(20);
        X(i17, 0);
        Z(j17);
    }

    @Override // com.google.protobuf.k0
    public void U(long j17) {
        b0(10);
        Z(j17);
    }

    @Override // com.google.protobuf.p
    public void a(byte[] bArr, int i17, int i18) {
        c0(bArr, i17, i18);
    }

    public final void a0() {
        this.f45215g.write(this.f45092d, 0, this.f45094f);
        this.f45094f = 0;
    }

    public final void b0(int i17) {
        if (this.f45093e - this.f45094f < i17) {
            a0();
        }
    }

    public void c0(byte[] bArr, int i17, int i18) {
        int i19 = this.f45094f;
        int i27 = this.f45093e;
        int i28 = i27 - i19;
        byte[] bArr2 = this.f45092d;
        if (i28 >= i18) {
            java.lang.System.arraycopy(bArr, i17, bArr2, i19, i18);
            this.f45094f += i18;
            return;
        }
        java.lang.System.arraycopy(bArr, i17, bArr2, i19, i28);
        int i29 = i17 + i28;
        int i37 = i18 - i28;
        this.f45094f = i27;
        a0();
        if (i37 > i27) {
            this.f45215g.write(bArr, i29, i37);
        } else {
            java.lang.System.arraycopy(bArr, i29, bArr2, 0, i37);
            this.f45094f = i37;
        }
    }

    @Override // com.google.protobuf.k0
    public void w(byte b17) {
        if (this.f45094f == this.f45093e) {
            a0();
        }
        int i17 = this.f45094f;
        this.f45094f = i17 + 1;
        this.f45092d[i17] = b17;
    }

    @Override // com.google.protobuf.k0
    public void x(int i17, boolean z17) {
        b0(11);
        X(i17, 0);
        byte b17 = z17 ? (byte) 1 : (byte) 0;
        int i18 = this.f45094f;
        this.f45094f = i18 + 1;
        this.f45092d[i18] = b17;
    }

    @Override // com.google.protobuf.k0
    public void y(byte[] bArr, int i17, int i18) {
        S(i18);
        c0(bArr, i17, i18);
    }

    @Override // com.google.protobuf.k0
    public void z(int i17, com.google.protobuf.y yVar) {
        Q(i17, 2);
        A(yVar);
    }
}
