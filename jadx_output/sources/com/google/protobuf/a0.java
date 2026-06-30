package com.google.protobuf;

/* loaded from: classes16.dex */
public final class a0 extends com.google.protobuf.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f44845e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44846f;

    /* renamed from: g, reason: collision with root package name */
    public int f44847g;

    /* renamed from: h, reason: collision with root package name */
    public int f44848h;

    /* renamed from: i, reason: collision with root package name */
    public int f44849i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44850j;

    /* renamed from: k, reason: collision with root package name */
    public int f44851k;

    /* renamed from: l, reason: collision with root package name */
    public int f44852l;

    public a0(byte[] bArr, int i17, int i18, boolean z17, com.google.protobuf.z zVar) {
        super(null);
        this.f44852l = Integer.MAX_VALUE;
        this.f44845e = bArr;
        this.f44847g = i18 + i17;
        this.f44849i = i17;
        this.f44850j = i17;
        this.f44846f = z17;
    }

    @Override // com.google.protobuf.d0
    public long A() {
        return K();
    }

    @Override // com.google.protobuf.d0
    public int B() {
        return com.google.protobuf.d0.b(x());
    }

    @Override // com.google.protobuf.d0
    public long C() {
        return com.google.protobuf.d0.c(L());
    }

    @Override // com.google.protobuf.d0
    public java.lang.String D() {
        int x17 = x();
        if (x17 > 0) {
            int i17 = this.f44847g;
            int i18 = this.f44849i;
            if (x17 <= i17 - i18) {
                java.lang.String str = new java.lang.String(this.f44845e, i18, x17, com.google.protobuf.w6.f45648a);
                this.f44849i += x17;
                return str;
            }
        }
        if (x17 == 0) {
            return "";
        }
        if (x17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        throw com.google.protobuf.y6.i();
    }

    @Override // com.google.protobuf.d0
    public java.lang.String E() {
        int x17 = x();
        if (x17 > 0) {
            int i17 = this.f44847g;
            int i18 = this.f44849i;
            if (x17 <= i17 - i18) {
                java.lang.String a17 = com.google.protobuf.ob.f45371a.a(this.f44845e, i18, x17);
                this.f44849i += x17;
                return a17;
            }
        }
        if (x17 == 0) {
            return "";
        }
        if (x17 <= 0) {
            throw com.google.protobuf.y6.f();
        }
        throw com.google.protobuf.y6.i();
    }

    @Override // com.google.protobuf.d0
    public int F() {
        if (f()) {
            this.f44851k = 0;
            return 0;
        }
        int x17 = x();
        this.f44851k = x17;
        if ((x17 >>> 3) != 0) {
            return x17;
        }
        throw com.google.protobuf.y6.b();
    }

    @Override // com.google.protobuf.d0
    public int G() {
        return x();
    }

    @Override // com.google.protobuf.d0
    public long H() {
        return L();
    }

    @Override // com.google.protobuf.d0
    public boolean I(int i17) {
        int F;
        int i18 = i17 & 7;
        int i19 = 0;
        if (i18 == 0) {
            int i27 = this.f44847g - this.f44849i;
            byte[] bArr = this.f44845e;
            if (i27 >= 10) {
                while (i19 < 10) {
                    int i28 = this.f44849i;
                    this.f44849i = i28 + 1;
                    if (bArr[i28] < 0) {
                        i19++;
                    }
                }
                throw com.google.protobuf.y6.e();
            }
            while (i19 < 10) {
                int i29 = this.f44849i;
                if (i29 == this.f44847g) {
                    throw com.google.protobuf.y6.i();
                }
                this.f44849i = i29 + 1;
                if (bArr[i29] < 0) {
                    i19++;
                }
            }
            throw com.google.protobuf.y6.e();
            return true;
        }
        if (i18 == 1) {
            N(8);
            return true;
        }
        if (i18 == 2) {
            N(x());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw com.google.protobuf.y6.d();
            }
            N(4);
            return true;
        }
        do {
            F = F();
            if (F == 0) {
                break;
            }
        } while (I(F));
        a(((i17 >>> 3) << 3) | 4);
        return true;
    }

    public int J() {
        int i17 = this.f44849i;
        if (this.f44847g - i17 < 4) {
            throw com.google.protobuf.y6.i();
        }
        this.f44849i = i17 + 4;
        byte[] bArr = this.f44845e;
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public long K() {
        int i17 = this.f44849i;
        if (this.f44847g - i17 < 8) {
            throw com.google.protobuf.y6.i();
        }
        this.f44849i = i17 + 8;
        byte[] bArr = this.f44845e;
        return ((bArr[i17 + 7] & 255) << 56) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16) | ((bArr[i17 + 3] & 255) << 24) | ((bArr[i17 + 4] & 255) << 32) | ((bArr[i17 + 5] & 255) << 40) | ((bArr[i17 + 6] & 255) << 48);
    }

    public long L() {
        long j17;
        long j18;
        long j19;
        int i17;
        int i18 = this.f44849i;
        int i19 = this.f44847g;
        if (i19 != i18) {
            int i27 = i18 + 1;
            byte[] bArr = this.f44845e;
            byte b17 = bArr[i18];
            if (b17 >= 0) {
                this.f44849i = i27;
                return b17;
            }
            if (i19 - i27 >= 9) {
                int i28 = i27 + 1;
                int i29 = b17 ^ (bArr[i27] << 7);
                if (i29 >= 0) {
                    int i37 = i28 + 1;
                    int i38 = i29 ^ (bArr[i28] << 14);
                    if (i38 >= 0) {
                        j17 = i38 ^ 16256;
                    } else {
                        i28 = i37 + 1;
                        int i39 = i38 ^ (bArr[i37] << 21);
                        if (i39 >= 0) {
                            long j27 = i39;
                            int i47 = i28 + 1;
                            long j28 = (bArr[i28] << 28) ^ j27;
                            if (j28 >= 0) {
                                j18 = j28 ^ 266354560;
                                i28 = i47;
                            } else {
                                int i48 = i47 + 1;
                                long j29 = j28 ^ (bArr[i47] << 35);
                                if (j29 < 0) {
                                    j19 = -34093383808L;
                                } else {
                                    i37 = i48 + 1;
                                    long j37 = j29 ^ (bArr[i48] << 42);
                                    if (j37 >= 0) {
                                        j17 = j37 ^ 4363953127296L;
                                    } else {
                                        i48 = i37 + 1;
                                        j29 = j37 ^ (bArr[i37] << 49);
                                        if (j29 < 0) {
                                            j19 = -558586000294016L;
                                        } else {
                                            i37 = i48 + 1;
                                            j17 = (j29 ^ (bArr[i48] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i48 = i37 + 1;
                                                if (bArr[i37] >= 0) {
                                                    j18 = j17;
                                                    i28 = i48;
                                                }
                                            }
                                        }
                                    }
                                }
                                j18 = j19 ^ j29;
                                i28 = i48;
                            }
                            this.f44849i = i28;
                            return j18;
                        }
                        i17 = i39 ^ (-2080896);
                    }
                    i28 = i37;
                    j18 = j17;
                    this.f44849i = i28;
                    return j18;
                }
                i17 = i29 ^ (-128);
                j18 = i17;
                this.f44849i = i28;
                return j18;
            }
        }
        return M();
    }

    public long M() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f44849i;
            if (i18 == this.f44847g) {
                throw com.google.protobuf.y6.i();
            }
            this.f44849i = i18 + 1;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((this.f44845e[i18] & 128) == 0) {
                return j17;
            }
        }
        throw com.google.protobuf.y6.e();
    }

    public void N(int i17) {
        if (i17 >= 0) {
            int i18 = this.f44847g;
            int i19 = this.f44849i;
            if (i17 <= i18 - i19) {
                this.f44849i = i19 + i17;
                return;
            }
        }
        if (i17 >= 0) {
            throw com.google.protobuf.y6.i();
        }
        throw com.google.protobuf.y6.f();
    }

    @Override // com.google.protobuf.d0
    public void a(int i17) {
        if (this.f44851k != i17) {
            throw com.google.protobuf.y6.a();
        }
    }

    @Override // com.google.protobuf.d0
    public int d() {
        int i17 = this.f44852l;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - (this.f44849i - this.f44850j);
    }

    @Override // com.google.protobuf.d0
    public int e() {
        return this.f44849i - this.f44850j;
    }

    @Override // com.google.protobuf.d0
    public boolean f() {
        return this.f44849i == this.f44847g;
    }

    @Override // com.google.protobuf.d0
    public void j(int i17) {
        this.f44852l = i17;
        int i18 = this.f44847g + this.f44848h;
        this.f44847g = i18;
        int i19 = i18 - this.f44850j;
        if (i19 <= i17) {
            this.f44848h = 0;
            return;
        }
        int i27 = i19 - i17;
        this.f44848h = i27;
        this.f44847g = i18 - i27;
    }

    @Override // com.google.protobuf.d0
    public int k(int i17) {
        if (i17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        int i18 = this.f44849i;
        int i19 = this.f44850j;
        int i27 = i17 + (i18 - i19);
        int i28 = this.f44852l;
        if (i27 > i28) {
            throw com.google.protobuf.y6.i();
        }
        this.f44852l = i27;
        int i29 = this.f44847g + this.f44848h;
        this.f44847g = i29;
        int i37 = i29 - i19;
        if (i37 > i27) {
            int i38 = i37 - i27;
            this.f44848h = i38;
            this.f44847g = i29 - i38;
        } else {
            this.f44848h = 0;
        }
        return i28;
    }

    @Override // com.google.protobuf.d0
    public boolean l() {
        return L() != 0;
    }

    @Override // com.google.protobuf.d0
    public com.google.protobuf.y m() {
        byte[] bArr;
        int x17 = x();
        byte[] bArr2 = this.f44845e;
        if (x17 > 0) {
            int i17 = this.f44847g;
            int i18 = this.f44849i;
            if (x17 <= i17 - i18) {
                boolean z17 = this.f44846f;
                com.google.protobuf.y g17 = com.google.protobuf.y.g(bArr2, i18, x17);
                this.f44849i += x17;
                return g17;
            }
        }
        if (x17 == 0) {
            return com.google.protobuf.y.f45712e;
        }
        if (x17 > 0) {
            int i19 = this.f44847g;
            int i27 = this.f44849i;
            if (x17 <= i19 - i27) {
                int i28 = x17 + i27;
                this.f44849i = i28;
                bArr = java.util.Arrays.copyOfRange(bArr2, i27, i28);
                com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
                return new com.google.protobuf.w(bArr);
            }
        }
        if (x17 > 0) {
            throw com.google.protobuf.y6.i();
        }
        if (x17 != 0) {
            throw com.google.protobuf.y6.f();
        }
        bArr = com.google.protobuf.w6.f45650c;
        com.google.protobuf.y yVar2 = com.google.protobuf.y.f45712e;
        return new com.google.protobuf.w(bArr);
    }

    @Override // com.google.protobuf.d0
    public double n() {
        return java.lang.Double.longBitsToDouble(K());
    }

    @Override // com.google.protobuf.d0
    public int o() {
        return x();
    }

    @Override // com.google.protobuf.d0
    public int p() {
        return J();
    }

    @Override // com.google.protobuf.d0
    public long q() {
        return K();
    }

    @Override // com.google.protobuf.d0
    public float r() {
        return java.lang.Float.intBitsToFloat(J());
    }

    @Override // com.google.protobuf.d0
    public void s(int i17, com.google.protobuf.n8 n8Var, com.google.protobuf.t4 t4Var) {
        int i18 = this.f44991a;
        if (i18 >= this.f44992b) {
            throw com.google.protobuf.y6.h();
        }
        this.f44991a = i18 + 1;
        n8Var.mergeFrom(this, t4Var);
        a((i17 << 3) | 4);
        this.f44991a--;
    }

    @Override // com.google.protobuf.d0
    public int t() {
        return x();
    }

    @Override // com.google.protobuf.d0
    public long u() {
        return L();
    }

    @Override // com.google.protobuf.d0
    public com.google.protobuf.o8 v(com.google.protobuf.e9 e9Var, com.google.protobuf.t4 t4Var) {
        int x17 = x();
        if (this.f44991a >= this.f44992b) {
            throw com.google.protobuf.y6.h();
        }
        int k17 = k(x17);
        this.f44991a++;
        com.google.protobuf.o8 o8Var = (com.google.protobuf.o8) e9Var.parsePartialFrom(this, t4Var);
        a(0);
        this.f44991a--;
        j(k17);
        return o8Var;
    }

    @Override // com.google.protobuf.d0
    public void w(com.google.protobuf.n8 n8Var, com.google.protobuf.t4 t4Var) {
        int x17 = x();
        if (this.f44991a >= this.f44992b) {
            throw com.google.protobuf.y6.h();
        }
        int k17 = k(x17);
        this.f44991a++;
        n8Var.mergeFrom(this, t4Var);
        a(0);
        this.f44991a--;
        j(k17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r3[r2] < 0) goto L34;
     */
    @Override // com.google.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int x() {
        /*
            r5 = this;
            int r0 = r5.f44849i
            int r1 = r5.f44847g
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f44845e
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f44849i = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r2
            goto L70
        L31:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.M()
            int r0 = (int) r0
            return r0
        L70:
            r5.f44849i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.x():int");
    }

    @Override // com.google.protobuf.d0
    public int z() {
        return J();
    }
}
