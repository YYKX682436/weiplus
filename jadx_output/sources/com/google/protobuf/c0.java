package com.google.protobuf;

/* loaded from: classes16.dex */
public final class c0 extends com.google.protobuf.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f44937e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44938f;

    /* renamed from: g, reason: collision with root package name */
    public long f44939g;

    /* renamed from: h, reason: collision with root package name */
    public long f44940h;

    /* renamed from: i, reason: collision with root package name */
    public final long f44941i;

    /* renamed from: j, reason: collision with root package name */
    public int f44942j;

    /* renamed from: k, reason: collision with root package name */
    public int f44943k;

    /* renamed from: l, reason: collision with root package name */
    public int f44944l;

    public c0(java.nio.ByteBuffer byteBuffer, boolean z17, com.google.protobuf.z zVar) {
        super(null);
        this.f44944l = Integer.MAX_VALUE;
        this.f44937e = byteBuffer;
        long j17 = com.google.protobuf.ib.f45205d.j(byteBuffer, com.google.protobuf.ib.f45209h);
        this.f44938f = j17;
        this.f44939g = byteBuffer.limit() + j17;
        long position = j17 + byteBuffer.position();
        this.f44940h = position;
        this.f44941i = position;
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
            long j17 = this.f44939g;
            long j18 = this.f44940h;
            if (x17 <= ((int) (j17 - j18))) {
                byte[] bArr = new byte[x17];
                long j19 = x17;
                com.google.protobuf.ib.f45205d.c(j18, bArr, 0L, j19);
                java.lang.String str = new java.lang.String(bArr, com.google.protobuf.w6.f45648a);
                this.f44940h += j19;
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
            long j17 = this.f44939g;
            long j18 = this.f44940h;
            if (x17 <= ((int) (j17 - j18))) {
                int i17 = (int) (j18 - this.f44938f);
                com.google.protobuf.kb kbVar = com.google.protobuf.ob.f45371a;
                kbVar.getClass();
                java.nio.ByteBuffer byteBuffer = this.f44937e;
                java.lang.String a17 = byteBuffer.hasArray() ? kbVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i17, x17) : byteBuffer.isDirect() ? kbVar.c(byteBuffer, i17, x17) : kbVar.b(byteBuffer, i17, x17);
                this.f44940h += x17;
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
            this.f44943k = 0;
            return 0;
        }
        int x17 = x();
        this.f44943k = x17;
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
            if (((int) (this.f44939g - this.f44940h)) >= 10) {
                while (i19 < 10) {
                    long j17 = this.f44940h;
                    this.f44940h = j17 + 1;
                    if (com.google.protobuf.ib.g(j17) < 0) {
                        i19++;
                    }
                }
                throw com.google.protobuf.y6.e();
            }
            while (i19 < 10) {
                long j18 = this.f44940h;
                if (j18 == this.f44939g) {
                    throw com.google.protobuf.y6.i();
                }
                this.f44940h = j18 + 1;
                if (com.google.protobuf.ib.g(j18) < 0) {
                    i19++;
                }
            }
            throw com.google.protobuf.y6.e();
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
                throw com.google.protobuf.y6.d();
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
        long j17 = this.f44940h;
        if (this.f44939g - j17 < 4) {
            throw com.google.protobuf.y6.i();
        }
        this.f44940h = 4 + j17;
        return ((com.google.protobuf.ib.g(j17 + 3) & 255) << 24) | (com.google.protobuf.ib.g(j17) & 255) | ((com.google.protobuf.ib.g(1 + j17) & 255) << 8) | ((com.google.protobuf.ib.g(2 + j17) & 255) << 16);
    }

    public long K() {
        long j17 = this.f44940h;
        if (this.f44939g - j17 < 8) {
            throw com.google.protobuf.y6.i();
        }
        this.f44940h = 8 + j17;
        return ((com.google.protobuf.ib.g(j17 + 7) & 255) << 56) | (com.google.protobuf.ib.g(j17) & 255) | ((com.google.protobuf.ib.g(1 + j17) & 255) << 8) | ((com.google.protobuf.ib.g(2 + j17) & 255) << 16) | ((com.google.protobuf.ib.g(3 + j17) & 255) << 24) | ((com.google.protobuf.ib.g(4 + j17) & 255) << 32) | ((com.google.protobuf.ib.g(5 + j17) & 255) << 40) | ((com.google.protobuf.ib.g(6 + j17) & 255) << 48);
    }

    public long L() {
        long g17;
        long j17;
        long j18;
        int i17;
        long j19 = this.f44940h;
        if (this.f44939g != j19) {
            long j27 = j19 + 1;
            byte g18 = com.google.protobuf.ib.g(j19);
            if (g18 >= 0) {
                this.f44940h = j27;
                return g18;
            }
            if (this.f44939g - j27 >= 9) {
                long j28 = j27 + 1;
                int g19 = g18 ^ (com.google.protobuf.ib.g(j27) << 7);
                if (g19 >= 0) {
                    long j29 = j28 + 1;
                    int g27 = g19 ^ (com.google.protobuf.ib.g(j28) << 14);
                    if (g27 >= 0) {
                        g17 = g27 ^ 16256;
                    } else {
                        j28 = j29 + 1;
                        int g28 = g27 ^ (com.google.protobuf.ib.g(j29) << 21);
                        if (g28 < 0) {
                            i17 = g28 ^ (-2080896);
                        } else {
                            j29 = j28 + 1;
                            long g29 = g28 ^ (com.google.protobuf.ib.g(j28) << 28);
                            if (g29 < 0) {
                                long j37 = j29 + 1;
                                long g37 = g29 ^ (com.google.protobuf.ib.g(j29) << 35);
                                if (g37 < 0) {
                                    j17 = -34093383808L;
                                } else {
                                    j29 = j37 + 1;
                                    g29 = g37 ^ (com.google.protobuf.ib.g(j37) << 42);
                                    if (g29 >= 0) {
                                        j18 = 4363953127296L;
                                    } else {
                                        j37 = j29 + 1;
                                        g37 = g29 ^ (com.google.protobuf.ib.g(j29) << 49);
                                        if (g37 < 0) {
                                            j17 = -558586000294016L;
                                        } else {
                                            j29 = j37 + 1;
                                            g17 = (g37 ^ (com.google.protobuf.ib.g(j37) << 56)) ^ 71499008037633920L;
                                            if (g17 < 0) {
                                                long j38 = 1 + j29;
                                                if (com.google.protobuf.ib.g(j29) >= 0) {
                                                    j28 = j38;
                                                    this.f44940h = j28;
                                                    return g17;
                                                }
                                            }
                                        }
                                    }
                                }
                                g17 = g37 ^ j17;
                                j28 = j37;
                                this.f44940h = j28;
                                return g17;
                            }
                            j18 = 266354560;
                            g17 = g29 ^ j18;
                        }
                    }
                    j28 = j29;
                    this.f44940h = j28;
                    return g17;
                }
                i17 = g19 ^ (-128);
                g17 = i17;
                this.f44940h = j28;
                return g17;
            }
        }
        return M();
    }

    public long M() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            long j18 = this.f44940h;
            if (j18 == this.f44939g) {
                throw com.google.protobuf.y6.i();
            }
            this.f44940h = 1 + j18;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((com.google.protobuf.ib.g(j18) & 128) == 0) {
                return j17;
            }
        }
        throw com.google.protobuf.y6.e();
    }

    public final void N() {
        long j17 = this.f44939g + this.f44942j;
        this.f44939g = j17;
        int i17 = (int) (j17 - this.f44941i);
        int i18 = this.f44944l;
        if (i17 <= i18) {
            this.f44942j = 0;
            return;
        }
        int i19 = i17 - i18;
        this.f44942j = i19;
        this.f44939g = j17 - i19;
    }

    public void O(int i17) {
        if (i17 >= 0) {
            long j17 = this.f44939g;
            long j18 = this.f44940h;
            if (i17 <= ((int) (j17 - j18))) {
                this.f44940h = j18 + i17;
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
        if (this.f44943k != i17) {
            throw com.google.protobuf.y6.a();
        }
    }

    @Override // com.google.protobuf.d0
    public int d() {
        int i17 = this.f44944l;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - e();
    }

    @Override // com.google.protobuf.d0
    public int e() {
        return (int) (this.f44940h - this.f44941i);
    }

    @Override // com.google.protobuf.d0
    public boolean f() {
        return this.f44940h == this.f44939g;
    }

    @Override // com.google.protobuf.d0
    public void j(int i17) {
        this.f44944l = i17;
        N();
    }

    @Override // com.google.protobuf.d0
    public int k(int i17) {
        if (i17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        int e17 = i17 + e();
        int i18 = this.f44944l;
        if (e17 > i18) {
            throw com.google.protobuf.y6.i();
        }
        this.f44944l = e17;
        N();
        return i18;
    }

    @Override // com.google.protobuf.d0
    public boolean l() {
        return L() != 0;
    }

    @Override // com.google.protobuf.d0
    public com.google.protobuf.y m() {
        int x17 = x();
        if (x17 > 0) {
            long j17 = this.f44939g;
            long j18 = this.f44940h;
            if (x17 <= ((int) (j17 - j18))) {
                byte[] bArr = new byte[x17];
                long j19 = x17;
                com.google.protobuf.ib.f45205d.c(j18, bArr, 0L, j19);
                this.f44940h += j19;
                com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
                return new com.google.protobuf.w(bArr);
            }
        }
        if (x17 == 0) {
            return com.google.protobuf.y.f45712e;
        }
        if (x17 < 0) {
            throw com.google.protobuf.y6.f();
        }
        throw com.google.protobuf.y6.i();
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (com.google.protobuf.ib.g(r4) < 0) goto L34;
     */
    @Override // com.google.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int x() {
        /*
            r10 = this;
            long r0 = r10.f44940h
            long r2 = r10.f44939g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L85
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.protobuf.ib.g(r0)
            if (r0 < 0) goto L17
            r10.f44940h = r4
            return r0
        L17:
            long r6 = r10.f44939g
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L21
            goto L85
        L21:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.ib.g(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2f
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L2f:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.ib.g(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3e
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r6 = r4
            goto L8b
        L3e:
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.ib.g(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4e
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L4e:
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.ib.g(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.ib.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.ib.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.ib.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = com.google.protobuf.ib.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = com.google.protobuf.ib.g(r4)
            if (r1 >= 0) goto L8b
        L85:
            long r0 = r10.M()
            int r0 = (int) r0
            return r0
        L8b:
            r10.f44940h = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c0.x():int");
    }

    @Override // com.google.protobuf.d0
    public int z() {
        return J();
    }
}
