package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class c0 extends com.p176xb6135e39.p283xc50a8b8b.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f126470e;

    /* renamed from: f, reason: collision with root package name */
    public final long f126471f;

    /* renamed from: g, reason: collision with root package name */
    public long f126472g;

    /* renamed from: h, reason: collision with root package name */
    public long f126473h;

    /* renamed from: i, reason: collision with root package name */
    public final long f126474i;

    /* renamed from: j, reason: collision with root package name */
    public int f126475j;

    /* renamed from: k, reason: collision with root package name */
    public int f126476k;

    /* renamed from: l, reason: collision with root package name */
    public int f126477l;

    public c0(java.nio.ByteBuffer byteBuffer, boolean z17, com.p176xb6135e39.p283xc50a8b8b.z zVar) {
        super(null);
        this.f126477l = Integer.MAX_VALUE;
        this.f126470e = byteBuffer;
        long j17 = com.p176xb6135e39.p283xc50a8b8b.ib.f126738d.j(byteBuffer, com.p176xb6135e39.p283xc50a8b8b.ib.f126742h);
        this.f126471f = j17;
        this.f126472g = byteBuffer.limit() + j17;
        long position = j17 + byteBuffer.position();
        this.f126473h = position;
        this.f126474i = position;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public long A() {
        return K();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int B() {
        return com.p176xb6135e39.p283xc50a8b8b.d0.b(x());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public long C() {
        return com.p176xb6135e39.p283xc50a8b8b.d0.c(L());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public java.lang.String D() {
        int x17 = x();
        if (x17 > 0) {
            long j17 = this.f126472g;
            long j18 = this.f126473h;
            if (x17 <= ((int) (j17 - j18))) {
                byte[] bArr = new byte[x17];
                long j19 = x17;
                com.p176xb6135e39.p283xc50a8b8b.ib.f126738d.c(j18, bArr, 0L, j19);
                java.lang.String str = new java.lang.String(bArr, com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
                this.f126473h += j19;
                return str;
            }
        }
        if (x17 == 0) {
            return "";
        }
        if (x17 < 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.f();
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public java.lang.String E() {
        int x17 = x();
        if (x17 > 0) {
            long j17 = this.f126472g;
            long j18 = this.f126473h;
            if (x17 <= ((int) (j17 - j18))) {
                int i17 = (int) (j18 - this.f126471f);
                com.p176xb6135e39.p283xc50a8b8b.kb kbVar = com.p176xb6135e39.p283xc50a8b8b.ob.f126904a;
                kbVar.getClass();
                java.nio.ByteBuffer byteBuffer = this.f126470e;
                java.lang.String a17 = byteBuffer.hasArray() ? kbVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i17, x17) : byteBuffer.isDirect() ? kbVar.c(byteBuffer, i17, x17) : kbVar.b(byteBuffer, i17, x17);
                this.f126473h += x17;
                return a17;
            }
        }
        if (x17 == 0) {
            return "";
        }
        if (x17 <= 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.f();
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int F() {
        if (f()) {
            this.f126476k = 0;
            return 0;
        }
        int x17 = x();
        this.f126476k = x17;
        if ((x17 >>> 3) != 0) {
            return x17;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.b();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int G() {
        return x();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public long H() {
        return L();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public boolean I(int i17) {
        int F;
        int i18 = i17 & 7;
        int i19 = 0;
        if (i18 == 0) {
            if (((int) (this.f126472g - this.f126473h)) >= 10) {
                while (i19 < 10) {
                    long j17 = this.f126473h;
                    this.f126473h = j17 + 1;
                    if (com.p176xb6135e39.p283xc50a8b8b.ib.g(j17) < 0) {
                        i19++;
                    }
                }
                throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
            }
            while (i19 < 10) {
                long j18 = this.f126473h;
                if (j18 == this.f126472g) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
                }
                this.f126473h = j18 + 1;
                if (com.p176xb6135e39.p283xc50a8b8b.ib.g(j18) < 0) {
                    i19++;
                }
            }
            throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
            return true;
        }
        if (i18 == 1) {
            O(8);
            return true;
        }
        if (i18 == 2) {
            O(x());
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            O(4);
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
        long j17 = this.f126473h;
        if (this.f126472g - j17 < 4) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        this.f126473h = 4 + j17;
        return ((com.p176xb6135e39.p283xc50a8b8b.ib.g(j17 + 3) & 255) << 24) | (com.p176xb6135e39.p283xc50a8b8b.ib.g(j17) & 255) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(1 + j17) & 255) << 8) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(2 + j17) & 255) << 16);
    }

    public long K() {
        long j17 = this.f126473h;
        if (this.f126472g - j17 < 8) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        this.f126473h = 8 + j17;
        return ((com.p176xb6135e39.p283xc50a8b8b.ib.g(j17 + 7) & 255) << 56) | (com.p176xb6135e39.p283xc50a8b8b.ib.g(j17) & 255) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(1 + j17) & 255) << 8) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(2 + j17) & 255) << 16) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(3 + j17) & 255) << 24) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(4 + j17) & 255) << 32) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(5 + j17) & 255) << 40) | ((com.p176xb6135e39.p283xc50a8b8b.ib.g(6 + j17) & 255) << 48);
    }

    public long L() {
        long g17;
        long j17;
        long j18;
        int i17;
        long j19 = this.f126473h;
        if (this.f126472g != j19) {
            long j27 = j19 + 1;
            byte g18 = com.p176xb6135e39.p283xc50a8b8b.ib.g(j19);
            if (g18 >= 0) {
                this.f126473h = j27;
                return g18;
            }
            if (this.f126472g - j27 >= 9) {
                long j28 = j27 + 1;
                int g19 = g18 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j27) << 7);
                if (g19 >= 0) {
                    long j29 = j28 + 1;
                    int g27 = g19 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j28) << 14);
                    if (g27 >= 0) {
                        g17 = g27 ^ 16256;
                    } else {
                        j28 = j29 + 1;
                        int g28 = g27 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j29) << 21);
                        if (g28 < 0) {
                            i17 = g28 ^ (-2080896);
                        } else {
                            j29 = j28 + 1;
                            long g29 = g28 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j28) << 28);
                            if (g29 < 0) {
                                long j37 = j29 + 1;
                                long g37 = g29 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j29) << 35);
                                if (g37 < 0) {
                                    j17 = -34093383808L;
                                } else {
                                    j29 = j37 + 1;
                                    g29 = g37 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j37) << 42);
                                    if (g29 >= 0) {
                                        j18 = 4363953127296L;
                                    } else {
                                        j37 = j29 + 1;
                                        g37 = g29 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j29) << 49);
                                        if (g37 < 0) {
                                            j17 = -558586000294016L;
                                        } else {
                                            j29 = j37 + 1;
                                            g17 = (g37 ^ (com.p176xb6135e39.p283xc50a8b8b.ib.g(j37) << 56)) ^ 71499008037633920L;
                                            if (g17 < 0) {
                                                long j38 = 1 + j29;
                                                if (com.p176xb6135e39.p283xc50a8b8b.ib.g(j29) >= 0) {
                                                    j28 = j38;
                                                    this.f126473h = j28;
                                                    return g17;
                                                }
                                            }
                                        }
                                    }
                                }
                                g17 = g37 ^ j17;
                                j28 = j37;
                                this.f126473h = j28;
                                return g17;
                            }
                            j18 = 266354560;
                            g17 = g29 ^ j18;
                        }
                    }
                    j28 = j29;
                    this.f126473h = j28;
                    return g17;
                }
                i17 = g19 ^ (-128);
                g17 = i17;
                this.f126473h = j28;
                return g17;
            }
        }
        return M();
    }

    public long M() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            long j18 = this.f126473h;
            if (j18 == this.f126472g) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
            }
            this.f126473h = 1 + j18;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((com.p176xb6135e39.p283xc50a8b8b.ib.g(j18) & 128) == 0) {
                return j17;
            }
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
    }

    public final void N() {
        long j17 = this.f126472g + this.f126475j;
        this.f126472g = j17;
        int i17 = (int) (j17 - this.f126474i);
        int i18 = this.f126477l;
        if (i17 <= i18) {
            this.f126475j = 0;
            return;
        }
        int i19 = i17 - i18;
        this.f126475j = i19;
        this.f126472g = j17 - i19;
    }

    public void O(int i17) {
        if (i17 >= 0) {
            long j17 = this.f126472g;
            long j18 = this.f126473h;
            if (i17 <= ((int) (j17 - j18))) {
                this.f126473h = j18 + i17;
                return;
            }
        }
        if (i17 >= 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public void a(int i17) {
        if (this.f126476k != i17) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.a();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int d() {
        int i17 = this.f126477l;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - e();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int e() {
        return (int) (this.f126473h - this.f126474i);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public boolean f() {
        return this.f126473h == this.f126472g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public void j(int i17) {
        this.f126477l = i17;
        N();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int k(int i17) {
        if (i17 < 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.f();
        }
        int e17 = i17 + e();
        int i18 = this.f126477l;
        if (e17 > i18) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        this.f126477l = e17;
        N();
        return i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public boolean l() {
        return L() != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public com.p176xb6135e39.p283xc50a8b8b.y m() {
        int x17 = x();
        if (x17 > 0) {
            long j17 = this.f126472g;
            long j18 = this.f126473h;
            if (x17 <= ((int) (j17 - j18))) {
                byte[] bArr = new byte[x17];
                long j19 = x17;
                com.p176xb6135e39.p283xc50a8b8b.ib.f126738d.c(j18, bArr, 0L, j19);
                this.f126473h += j19;
                com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
                return new com.p176xb6135e39.p283xc50a8b8b.w(bArr);
            }
        }
        if (x17 == 0) {
            return com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        }
        if (x17 < 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.f();
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public double n() {
        return java.lang.Double.longBitsToDouble(K());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int o() {
        return x();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int p() {
        return J();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public long q() {
        return K();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public float r() {
        return java.lang.Float.intBitsToFloat(J());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public void s(int i17, com.p176xb6135e39.p283xc50a8b8b.n8 n8Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int i18 = this.f126524a;
        if (i18 >= this.f126525b) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.h();
        }
        this.f126524a = i18 + 1;
        n8Var.mo20526x60f45402(this, t4Var);
        a((i17 << 3) | 4);
        this.f126524a--;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int t() {
        return x();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public long u() {
        return L();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public com.p176xb6135e39.p283xc50a8b8b.o8 v(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int x17 = x();
        if (this.f126524a >= this.f126525b) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.h();
        }
        int k17 = k(x17);
        this.f126524a++;
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = (com.p176xb6135e39.p283xc50a8b8b.o8) e9Var.mo20549xc7f9c18(this, t4Var);
        a(0);
        this.f126524a--;
        j(k17);
        return o8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public void w(com.p176xb6135e39.p283xc50a8b8b.n8 n8Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int x17 = x();
        if (this.f126524a >= this.f126525b) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.h();
        }
        int k17 = k(x17);
        this.f126524a++;
        n8Var.mo20526x60f45402(this, t4Var);
        a(0);
        this.f126524a--;
        j(k17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (com.p176xb6135e39.p283xc50a8b8b.ib.g(r4) < 0) goto L34;
     */
    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int x() {
        /*
            r10 = this;
            long r0 = r10.f126473h
            long r2 = r10.f126472g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L85
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r0)
            if (r0 < 0) goto L17
            r10.f126473h = r4
            return r0
        L17:
            long r6 = r10.f126472g
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L21
            goto L85
        L21:
            long r6 = r4 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2f
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L2f:
            long r4 = r6 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3e
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r6 = r4
            goto L8b
        L3e:
            long r6 = r4 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4e
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L4e:
            long r4 = r6 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.p176xb6135e39.p283xc50a8b8b.ib.g(r4)
            if (r1 >= 0) goto L8b
        L85:
            long r0 = r10.M()
            int r0 = (int) r0
            return r0
        L8b:
            r10.f126473h = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.c0.x():int");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.d0
    public int z() {
        return J();
    }
}
