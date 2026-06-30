package com.google.protobuf;

/* loaded from: classes16.dex */
public final class b0 extends com.google.protobuf.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f44873e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f44874f;

    /* renamed from: g, reason: collision with root package name */
    public int f44875g;

    /* renamed from: h, reason: collision with root package name */
    public int f44876h;

    /* renamed from: i, reason: collision with root package name */
    public int f44877i;

    /* renamed from: j, reason: collision with root package name */
    public int f44878j;

    /* renamed from: k, reason: collision with root package name */
    public int f44879k;

    /* renamed from: l, reason: collision with root package name */
    public int f44880l;

    public b0(java.io.InputStream inputStream, int i17, com.google.protobuf.z zVar) {
        super(null);
        this.f44880l = Integer.MAX_VALUE;
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        if (inputStream == null) {
            throw new java.lang.NullPointerException("input");
        }
        this.f44873e = inputStream;
        this.f44874f = new byte[i17];
        this.f44875g = 0;
        this.f44877i = 0;
        this.f44879k = 0;
    }

    @Override // com.google.protobuf.d0
    public long A() {
        return N();
    }

    @Override // com.google.protobuf.d0
    public int B() {
        return com.google.protobuf.d0.b(x());
    }

    @Override // com.google.protobuf.d0
    public long C() {
        return com.google.protobuf.d0.c(O());
    }

    @Override // com.google.protobuf.d0
    public java.lang.String D() {
        int x17 = x();
        byte[] bArr = this.f44874f;
        if (x17 > 0) {
            int i17 = this.f44875g;
            int i18 = this.f44877i;
            if (x17 <= i17 - i18) {
                java.lang.String str = new java.lang.String(bArr, i18, x17, com.google.protobuf.w6.f45648a);
                this.f44877i += x17;
                return str;
            }
        }
        if (x17 == 0) {
            return "";
        }
        if (x17 > this.f44875g) {
            return new java.lang.String(J(x17, false), com.google.protobuf.w6.f45648a);
        }
        R(x17);
        java.lang.String str2 = new java.lang.String(bArr, this.f44877i, x17, com.google.protobuf.w6.f45648a);
        this.f44877i += x17;
        return str2;
    }

    @Override // com.google.protobuf.d0
    public java.lang.String E() {
        int x17 = x();
        int i17 = this.f44877i;
        int i18 = this.f44875g;
        int i19 = i18 - i17;
        byte[] bArr = this.f44874f;
        if (x17 <= i19 && x17 > 0) {
            this.f44877i = i17 + x17;
        } else {
            if (x17 == 0) {
                return "";
            }
            i17 = 0;
            if (x17 <= i18) {
                R(x17);
                this.f44877i = x17 + 0;
            } else {
                bArr = J(x17, false);
            }
        }
        return com.google.protobuf.ob.f45371a.a(bArr, i17, x17);
    }

    @Override // com.google.protobuf.d0
    public int F() {
        if (f()) {
            this.f44878j = 0;
            return 0;
        }
        int x17 = x();
        this.f44878j = x17;
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
        return O();
    }

    @Override // com.google.protobuf.d0
    public boolean I(int i17) {
        int F;
        int i18 = i17 & 7;
        int i19 = 0;
        if (i18 == 0) {
            int i27 = this.f44875g - this.f44877i;
            byte[] bArr = this.f44874f;
            if (i27 >= 10) {
                while (i19 < 10) {
                    int i28 = this.f44877i;
                    this.f44877i = i28 + 1;
                    if (bArr[i28] < 0) {
                        i19++;
                    }
                }
                throw com.google.protobuf.y6.e();
            }
            while (i19 < 10) {
                if (this.f44877i == this.f44875g) {
                    R(1);
                }
                int i29 = this.f44877i;
                this.f44877i = i29 + 1;
                if (bArr[i29] < 0) {
                    i19++;
                }
            }
            throw com.google.protobuf.y6.e();
            return true;
        }
        if (i18 == 1) {
            S(8);
            return true;
        }
        if (i18 == 2) {
            S(x());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw com.google.protobuf.y6.d();
            }
            S(4);
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

    public final byte[] J(int i17, boolean z17) {
        byte[] K = K(i17);
        if (K != null) {
            return z17 ? (byte[]) K.clone() : K;
        }
        int i18 = this.f44877i;
        int i19 = this.f44875g;
        int i27 = i19 - i18;
        this.f44879k += i19;
        this.f44877i = 0;
        this.f44875g = 0;
        java.util.List L = L(i17 - i27);
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f44874f, i18, bArr, 0, i27);
        java.util.Iterator it = ((java.util.ArrayList) L).iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr2, 0, bArr, i27, bArr2.length);
            i27 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i17) {
        if (i17 == 0) {
            return com.google.protobuf.w6.f45650c;
        }
        if (i17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        int i18 = this.f44879k;
        int i19 = this.f44877i;
        int i27 = i18 + i19 + i17;
        if (i27 - this.f44993c > 0) {
            throw new com.google.protobuf.y6("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i28 = this.f44880l;
        if (i27 > i28) {
            S((i28 - i18) - i19);
            throw com.google.protobuf.y6.i();
        }
        int i29 = this.f44875g - i19;
        int i37 = i17 - i29;
        java.io.InputStream inputStream = this.f44873e;
        if (i37 >= 4096 && i37 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f44874f, this.f44877i, bArr, 0, i29);
        this.f44879k += this.f44875g;
        this.f44877i = 0;
        this.f44875g = 0;
        while (i29 < i17) {
            int read = inputStream.read(bArr, i29, i17 - i29);
            if (read == -1) {
                throw com.google.protobuf.y6.i();
            }
            this.f44879k += read;
            i29 += read;
        }
        return bArr;
    }

    public final java.util.List L(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i17 > 0) {
            int min = java.lang.Math.min(i17, 4096);
            byte[] bArr = new byte[min];
            int i18 = 0;
            while (i18 < min) {
                int read = this.f44873e.read(bArr, i18, min - i18);
                if (read == -1) {
                    throw com.google.protobuf.y6.i();
                }
                this.f44879k += read;
                i18 += read;
            }
            i17 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public int M() {
        int i17 = this.f44877i;
        if (this.f44875g - i17 < 4) {
            R(4);
            i17 = this.f44877i;
        }
        this.f44877i = i17 + 4;
        byte[] bArr = this.f44874f;
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public long N() {
        int i17 = this.f44877i;
        if (this.f44875g - i17 < 8) {
            R(8);
            i17 = this.f44877i;
        }
        this.f44877i = i17 + 8;
        byte[] bArr = this.f44874f;
        return ((bArr[i17 + 7] & 255) << 56) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16) | ((bArr[i17 + 3] & 255) << 24) | ((bArr[i17 + 4] & 255) << 32) | ((bArr[i17 + 5] & 255) << 40) | ((bArr[i17 + 6] & 255) << 48);
    }

    public long O() {
        long j17;
        long j18;
        long j19;
        int i17;
        int i18 = this.f44877i;
        int i19 = this.f44875g;
        if (i19 != i18) {
            int i27 = i18 + 1;
            byte[] bArr = this.f44874f;
            byte b17 = bArr[i18];
            if (b17 >= 0) {
                this.f44877i = i27;
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
                            this.f44877i = i28;
                            return j18;
                        }
                        i17 = i39 ^ (-2080896);
                    }
                    i28 = i37;
                    j18 = j17;
                    this.f44877i = i28;
                    return j18;
                }
                i17 = i29 ^ (-128);
                j18 = i17;
                this.f44877i = i28;
                return j18;
            }
        }
        return P();
    }

    public long P() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            if (this.f44877i == this.f44875g) {
                R(1);
            }
            int i18 = this.f44877i;
            this.f44877i = i18 + 1;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((this.f44874f[i18] & 128) == 0) {
                return j17;
            }
        }
        throw com.google.protobuf.y6.e();
    }

    public final void Q() {
        int i17 = this.f44875g + this.f44876h;
        this.f44875g = i17;
        int i18 = this.f44879k + i17;
        int i19 = this.f44880l;
        if (i18 <= i19) {
            this.f44876h = 0;
            return;
        }
        int i27 = i18 - i19;
        this.f44876h = i27;
        this.f44875g = i17 - i27;
    }

    public final void R(int i17) {
        if (T(i17)) {
            return;
        }
        if (i17 <= (this.f44993c - this.f44879k) - this.f44877i) {
            throw com.google.protobuf.y6.i();
        }
        throw new com.google.protobuf.y6("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public void S(int i17) {
        int i18 = this.f44875g;
        int i19 = this.f44877i;
        if (i17 <= i18 - i19 && i17 >= 0) {
            this.f44877i = i19 + i17;
            return;
        }
        java.io.InputStream inputStream = this.f44873e;
        if (i17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        int i27 = this.f44879k;
        int i28 = i27 + i19;
        int i29 = i28 + i17;
        int i37 = this.f44880l;
        if (i29 > i37) {
            S((i37 - i27) - i19);
            throw com.google.protobuf.y6.i();
        }
        this.f44879k = i28;
        int i38 = i18 - i19;
        this.f44875g = 0;
        this.f44877i = 0;
        while (i38 < i17) {
            long j17 = i17 - i38;
            try {
                long skip = inputStream.skip(j17);
                if (skip < 0 || skip > j17) {
                    java.lang.String valueOf = java.lang.String.valueOf(inputStream.getClass());
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 92);
                    sb6.append(valueOf);
                    sb6.append("#skip returned invalid result: ");
                    sb6.append(skip);
                    sb6.append("\nThe InputStream implementation is buggy.");
                    throw new java.lang.IllegalStateException(sb6.toString());
                }
                if (skip == 0) {
                    break;
                } else {
                    i38 += (int) skip;
                }
            } finally {
                this.f44879k += i38;
                Q();
            }
        }
        if (i38 >= i17) {
            return;
        }
        int i39 = this.f44875g;
        int i47 = i39 - this.f44877i;
        this.f44877i = i39;
        R(1);
        while (true) {
            int i48 = i17 - i47;
            int i49 = this.f44875g;
            if (i48 <= i49) {
                this.f44877i = i48;
                return;
            } else {
                i47 += i49;
                this.f44877i = i49;
                R(1);
            }
        }
    }

    public final boolean T(int i17) {
        int i18 = this.f44877i;
        int i19 = i18 + i17;
        int i27 = this.f44875g;
        if (i19 <= i27) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(77);
            sb6.append("refillBuffer() called when ");
            sb6.append(i17);
            sb6.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        int i28 = this.f44879k;
        int i29 = this.f44993c;
        if (i17 > (i29 - i28) - i18 || i28 + i18 + i17 > this.f44880l) {
            return false;
        }
        byte[] bArr = this.f44874f;
        if (i18 > 0) {
            if (i27 > i18) {
                java.lang.System.arraycopy(bArr, i18, bArr, 0, i27 - i18);
            }
            this.f44879k += i18;
            this.f44875g -= i18;
            this.f44877i = 0;
        }
        int i37 = this.f44875g;
        int min = java.lang.Math.min(bArr.length - i37, (i29 - this.f44879k) - i37);
        java.io.InputStream inputStream = this.f44873e;
        int read = inputStream.read(bArr, i37, min);
        if (read == 0 || read < -1 || read > bArr.length) {
            java.lang.String valueOf = java.lang.String.valueOf(inputStream.getClass());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 91);
            sb7.append(valueOf);
            sb7.append("#read(byte[]) returned invalid result: ");
            sb7.append(read);
            sb7.append("\nThe InputStream implementation is buggy.");
            throw new java.lang.IllegalStateException(sb7.toString());
        }
        if (read <= 0) {
            return false;
        }
        this.f44875g += read;
        Q();
        if (this.f44875g >= i17) {
            return true;
        }
        return T(i17);
    }

    @Override // com.google.protobuf.d0
    public void a(int i17) {
        if (this.f44878j != i17) {
            throw com.google.protobuf.y6.a();
        }
    }

    @Override // com.google.protobuf.d0
    public int d() {
        int i17 = this.f44880l;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - (this.f44879k + this.f44877i);
    }

    @Override // com.google.protobuf.d0
    public int e() {
        return this.f44879k + this.f44877i;
    }

    @Override // com.google.protobuf.d0
    public boolean f() {
        return this.f44877i == this.f44875g && !T(1);
    }

    @Override // com.google.protobuf.d0
    public void j(int i17) {
        this.f44880l = i17;
        Q();
    }

    @Override // com.google.protobuf.d0
    public int k(int i17) {
        if (i17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        int i18 = i17 + this.f44879k + this.f44877i;
        int i19 = this.f44880l;
        if (i18 > i19) {
            throw com.google.protobuf.y6.i();
        }
        this.f44880l = i18;
        Q();
        return i19;
    }

    @Override // com.google.protobuf.d0
    public boolean l() {
        return O() != 0;
    }

    @Override // com.google.protobuf.d0
    public com.google.protobuf.y m() {
        int x17 = x();
        int i17 = this.f44875g;
        int i18 = this.f44877i;
        int i19 = i17 - i18;
        byte[] bArr = this.f44874f;
        if (x17 <= i19 && x17 > 0) {
            com.google.protobuf.y g17 = com.google.protobuf.y.g(bArr, i18, x17);
            this.f44877i += x17;
            return g17;
        }
        if (x17 == 0) {
            return com.google.protobuf.y.f45712e;
        }
        byte[] K = K(x17);
        if (K != null) {
            return com.google.protobuf.y.g(K, 0, K.length);
        }
        int i27 = this.f44877i;
        int i28 = this.f44875g;
        int i29 = i28 - i27;
        this.f44879k += i28;
        this.f44877i = 0;
        this.f44875g = 0;
        java.util.List L = L(x17 - i29);
        byte[] bArr2 = new byte[x17];
        java.lang.System.arraycopy(bArr, i27, bArr2, 0, i29);
        java.util.Iterator it = ((java.util.ArrayList) L).iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr3, 0, bArr2, i29, bArr3.length);
            i29 += bArr3.length;
        }
        com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
        return new com.google.protobuf.w(bArr2);
    }

    @Override // com.google.protobuf.d0
    public double n() {
        return java.lang.Double.longBitsToDouble(N());
    }

    @Override // com.google.protobuf.d0
    public int o() {
        return x();
    }

    @Override // com.google.protobuf.d0
    public int p() {
        return M();
    }

    @Override // com.google.protobuf.d0
    public long q() {
        return N();
    }

    @Override // com.google.protobuf.d0
    public float r() {
        return java.lang.Float.intBitsToFloat(M());
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
        return O();
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
            int r0 = r5.f44877i
            int r1 = r5.f44875g
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f44874f
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f44877i = r2
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
            long r0 = r5.P()
            int r0 = (int) r0
            return r0
        L70:
            r5.f44877i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.b0.x():int");
    }

    @Override // com.google.protobuf.d0
    public int z() {
        return M();
    }
}
