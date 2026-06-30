package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class m extends com.p176xb6135e39.p283xc50a8b8b.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f126835a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f126836b;

    /* renamed from: c, reason: collision with root package name */
    public int f126837c;

    /* renamed from: d, reason: collision with root package name */
    public int f126838d;

    /* renamed from: e, reason: collision with root package name */
    public int f126839e;

    /* renamed from: f, reason: collision with root package name */
    public int f126840f;

    public m(java.nio.ByteBuffer byteBuffer, boolean z17) {
        super(null);
        this.f126835a = z17;
        this.f126836b = byteBuffer.array();
        this.f126837c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f126838d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void A(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Long.valueOf(Y()));
                }
                b0(X);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(j()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                l7Var.e(Y());
            }
            b0(X2);
            return;
        }
        do {
            l7Var.e(j());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void B(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Long.valueOf(Y()));
                }
                b0(X);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(u()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                l7Var.e(Y());
            }
            b0(X2);
            return;
        }
        do {
            l7Var.e(u());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void C(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Integer.valueOf(X()));
                }
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(d()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                m6Var.e(X());
            }
            return;
        }
        do {
            m6Var.e(d());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object D(java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        c0(3);
        return R(com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(cls), t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void E(java.util.List list) {
        W(list, true);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int F() {
        c0(0);
        return X();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void G(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            int i19 = this.f126839e & 7;
            if (i19 != 1) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = X();
                e0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Long.valueOf(T()));
                }
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(v()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i28 = this.f126839e & 7;
        if (i28 != 1) {
            if (i28 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = X();
            e0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                l7Var.e(T());
            }
            return;
        }
        do {
            l7Var.e(v());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void H(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Integer.valueOf(X()));
                }
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(c()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                m6Var.e(X());
            }
            return;
        }
        do {
            m6Var.e(c());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object I(java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        c0(2);
        return U(com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(cls), t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int J() {
        c0(5);
        a0(4);
        return S();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long K() {
        c0(0);
        return com.p176xb6135e39.p283xc50a8b8b.d0.c(Y());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.String L() {
        return V(false);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object M(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        c0(2);
        return U(q9Var, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int N() {
        c0(5);
        a0(4);
        return S();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.String O() {
        return V(true);
    }

    public final boolean P() {
        return this.f126837c == this.f126838d;
    }

    public final java.lang.Object Q(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        switch (ubVar.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(mo20626xc851b907());
            case 1:
                return java.lang.Float.valueOf(mo20627xbc3e6666());
            case 2:
                return java.lang.Long.valueOf(u());
            case 3:
                return java.lang.Long.valueOf(j());
            case 4:
                return java.lang.Integer.valueOf(F());
            case 5:
                return java.lang.Long.valueOf(v());
            case 6:
                return java.lang.Integer.valueOf(J());
            case 7:
                return java.lang.Boolean.valueOf(y());
            case 8:
                return V(true);
            case 9:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case 10:
                return I(cls, t4Var);
            case 11:
                return h();
            case 12:
                return java.lang.Integer.valueOf(c());
            case 13:
                return java.lang.Integer.valueOf(d());
            case 14:
                return java.lang.Integer.valueOf(N());
            case 15:
                return java.lang.Long.valueOf(b());
            case 16:
                return java.lang.Integer.valueOf(e());
            case 17:
                return java.lang.Long.valueOf(K());
        }
    }

    public final java.lang.Object R(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int i17 = this.f126840f;
        this.f126840f = ((this.f126839e >>> 3) << 3) | 4;
        try {
            java.lang.Object g17 = q9Var.g();
            q9Var.h(g17, this, t4Var);
            q9Var.e(g17);
            if (this.f126839e == this.f126840f) {
                return g17;
            }
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        } finally {
            this.f126840f = i17;
        }
    }

    public final int S() {
        int i17 = this.f126837c;
        this.f126837c = i17 + 4;
        byte[] bArr = this.f126836b;
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public final long T() {
        this.f126837c = this.f126837c + 8;
        byte[] bArr = this.f126836b;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    public final java.lang.Object U(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int X = X();
        a0(X);
        int i17 = this.f126838d;
        int i18 = this.f126837c + X;
        this.f126838d = i18;
        try {
            java.lang.Object g17 = q9Var.g();
            q9Var.h(g17, this, t4Var);
            q9Var.e(g17);
            if (this.f126837c == i18) {
                return g17;
            }
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        } finally {
            this.f126838d = i17;
        }
    }

    public java.lang.String V(boolean z17) {
        c0(2);
        int X = X();
        if (X == 0) {
            return "";
        }
        a0(X);
        byte[] bArr = this.f126836b;
        if (z17) {
            int i17 = this.f126837c;
            if (!(com.p176xb6135e39.p283xc50a8b8b.ob.f126904a.e(0, bArr, i17, i17 + X) == 0)) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
            }
        }
        java.lang.String str = new java.lang.String(bArr, this.f126837c, X, com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
        this.f126837c += X;
        return str;
    }

    public void W(java.util.List list, boolean z17) {
        int i17;
        int i18;
        if ((this.f126839e & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.g7) || z17) {
            do {
                list.add(V(z17));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = (com.p176xb6135e39.p283xc50a8b8b.g7) list;
        do {
            g7Var.q(h());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    public final int X() {
        int i17;
        int i18 = this.f126837c;
        int i19 = this.f126838d;
        if (i19 == i18) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        int i27 = i18 + 1;
        byte[] bArr = this.f126836b;
        byte b17 = bArr[i18];
        if (b17 >= 0) {
            this.f126837c = i27;
            return b17;
        }
        if (i19 - i27 < 9) {
            return (int) Z();
        }
        int i28 = i27 + 1;
        int i29 = b17 ^ (bArr[i27] << 7);
        if (i29 < 0) {
            i17 = i29 ^ (-128);
        } else {
            int i37 = i28 + 1;
            int i38 = i29 ^ (bArr[i28] << 14);
            if (i38 >= 0) {
                i17 = i38 ^ 16256;
            } else {
                i28 = i37 + 1;
                int i39 = i38 ^ (bArr[i37] << 21);
                if (i39 < 0) {
                    i17 = i39 ^ (-2080896);
                } else {
                    i37 = i28 + 1;
                    byte b18 = bArr[i28];
                    i17 = (i39 ^ (b18 << 28)) ^ 266354560;
                    if (b18 < 0) {
                        i28 = i37 + 1;
                        if (bArr[i37] < 0) {
                            i37 = i28 + 1;
                            if (bArr[i28] < 0) {
                                i28 = i37 + 1;
                                if (bArr[i37] < 0) {
                                    i37 = i28 + 1;
                                    if (bArr[i28] < 0) {
                                        i28 = i37 + 1;
                                        if (bArr[i37] < 0) {
                                            throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i28 = i37;
        }
        this.f126837c = i28;
        return i17;
    }

    public long Y() {
        long j17;
        long j18;
        long j19;
        int i17;
        int i18 = this.f126837c;
        int i19 = this.f126838d;
        if (i19 == i18) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
        int i27 = i18 + 1;
        byte[] bArr = this.f126836b;
        byte b17 = bArr[i18];
        if (b17 >= 0) {
            this.f126837c = i27;
            return b17;
        }
        if (i19 - i27 < 9) {
            return Z();
        }
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
                                        if (bArr[i37] < 0) {
                                            throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
                                        }
                                        j18 = j17;
                                        i28 = i48;
                                    }
                                }
                            }
                        }
                        j18 = j19 ^ j29;
                        i28 = i48;
                    }
                    this.f126837c = i28;
                    return j18;
                }
                i17 = i39 ^ (-2080896);
            }
            i28 = i37;
            j18 = j17;
            this.f126837c = i28;
            return j18;
        }
        i17 = i29 ^ (-128);
        j18 = i17;
        this.f126837c = i28;
        return j18;
    }

    public final long Z() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f126837c;
            if (i18 == this.f126838d) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
            }
            this.f126837c = i18 + 1;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((this.f126836b[i18] & 128) == 0) {
                return j17;
            }
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void a(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Long.valueOf(com.p176xb6135e39.p283xc50a8b8b.d0.c(Y())));
                }
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(K()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                l7Var.e(com.p176xb6135e39.p283xc50a8b8b.d0.c(Y()));
            }
            return;
        }
        do {
            l7Var.e(K());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    public final void a0(int i17) {
        if (i17 < 0 || i17 > this.f126838d - this.f126837c) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long b() {
        c0(1);
        a0(8);
        return T();
    }

    public final void b0(int i17) {
        if (this.f126837c != i17) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int c() {
        c0(0);
        return X();
    }

    public final void c0(int i17) {
        if ((this.f126839e & 7) != i17) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int d() {
        c0(0);
        return X();
    }

    public final void d0(int i17) {
        a0(i17);
        if ((i17 & 3) != 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int e() {
        c0(0);
        return com.p176xb6135e39.p283xc50a8b8b.d0.b(X());
    }

    public final void e0(int i17) {
        a0(i17);
        if ((i17 & 7) != 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void f(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.o)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Boolean.valueOf(X() != 0));
                }
                b0(X);
                return;
            }
            do {
                list.add(java.lang.Boolean.valueOf(y()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.o oVar = (com.p176xb6135e39.p283xc50a8b8b.o) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                oVar.e(X() != 0);
            }
            b0(X2);
            return;
        }
        do {
            oVar.e(y());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void g(java.util.Map map, com.p176xb6135e39.p283xc50a8b8b.u7 u7Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        c0(2);
        int X = X();
        a0(X);
        int i17 = this.f126838d;
        this.f126838d = this.f126837c + X;
        try {
            java.lang.Object obj = u7Var.f127113b;
            java.lang.Object obj2 = u7Var.f127115d;
            java.lang.Object obj3 = obj2;
            while (true) {
                int o17 = o();
                if (o17 == Integer.MAX_VALUE) {
                    map.put(obj, obj3);
                    return;
                }
                if (o17 == 1) {
                    obj = Q(u7Var.f127112a, null, null);
                } else if (o17 != 2) {
                    try {
                        if (!r()) {
                            throw new com.p176xb6135e39.p283xc50a8b8b.y6("Unable to parse map entry.");
                            break;
                        }
                    } catch (com.p176xb6135e39.p283xc50a8b8b.x6 unused) {
                        if (!r()) {
                            throw new com.p176xb6135e39.p283xc50a8b8b.y6("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj3 = Q(u7Var.f127114c, obj2.getClass(), t4Var);
                }
            }
        } finally {
            this.f126838d = i17;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: getTag */
    public int mo20625xb5887064() {
        return this.f126839e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public com.p176xb6135e39.p283xc50a8b8b.y h() {
        com.p176xb6135e39.p283xc50a8b8b.y g17;
        c0(2);
        int X = X();
        if (X == 0) {
            return com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        }
        a0(X);
        boolean z17 = this.f126835a;
        byte[] bArr = this.f126836b;
        if (z17) {
            int i17 = this.f126837c;
            com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            g17 = new com.p176xb6135e39.p283xc50a8b8b.t(bArr, i17, X);
        } else {
            g17 = com.p176xb6135e39.p283xc50a8b8b.y.g(bArr, this.f126837c, X);
        }
        this.f126837c += X;
        return g17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void i(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Integer.valueOf(com.p176xb6135e39.p283xc50a8b8b.d0.b(X())));
                }
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(e()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                m6Var.e(com.p176xb6135e39.p283xc50a8b8b.d0.b(X()));
            }
            return;
        }
        do {
            m6Var.e(e());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long j() {
        c0(0);
        return Y();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object k(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        c0(3);
        return R(q9Var, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void l(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            int i19 = this.f126839e & 7;
            if (i19 != 1) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = X();
                e0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Long.valueOf(T()));
                }
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(b()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i28 = this.f126839e & 7;
        if (i28 != 1) {
            if (i28 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = X();
            e0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                l7Var.e(T());
            }
            return;
        }
        do {
            l7Var.e(b());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void m(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 != 0) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = this.f126837c + X();
                while (this.f126837c < X) {
                    list.add(java.lang.Integer.valueOf(X()));
                }
                b0(X);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(F()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i27 = this.f126839e & 7;
        if (i27 != 0) {
            if (i27 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = this.f126837c + X();
            while (this.f126837c < X2) {
                m6Var.e(X());
            }
            b0(X2);
            return;
        }
        do {
            m6Var.e(F());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void n(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 == 2) {
                int X = X();
                d0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Integer.valueOf(S()));
                }
                return;
            }
            if (i19 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(J()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i28 = this.f126839e & 7;
        if (i28 == 2) {
            int X2 = X();
            d0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                m6Var.e(S());
            }
            return;
        }
        if (i28 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            m6Var.e(J());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int o() {
        if (P()) {
            return Integer.MAX_VALUE;
        }
        int X = X();
        this.f126839e = X;
        if (X == this.f126840f) {
            return Integer.MAX_VALUE;
        }
        return X >>> 3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void p(java.util.List list) {
        W(list, false);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void q(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.e5)) {
            int i19 = this.f126839e & 7;
            if (i19 == 2) {
                int X = X();
                d0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(S())));
                }
                return;
            }
            if (i19 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Float.valueOf(mo20627xbc3e6666()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.e5 e5Var = (com.p176xb6135e39.p283xc50a8b8b.e5) list;
        int i28 = this.f126839e & 7;
        if (i28 == 2) {
            int X2 = X();
            d0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                e5Var.e(java.lang.Float.intBitsToFloat(S()));
            }
            return;
        }
        if (i28 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            e5Var.e(mo20627xbc3e6666());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public boolean r() {
        int i17;
        int i18;
        if (P() || (i17 = this.f126839e) == (i18 = this.f126840f)) {
            return false;
        }
        int i19 = i17 & 7;
        if (i19 != 0) {
            if (i19 == 1) {
                a0(8);
                this.f126837c += 8;
                return true;
            }
            if (i19 == 2) {
                int X = X();
                a0(X);
                this.f126837c += X;
                return true;
            }
            if (i19 != 3) {
                if (i19 != 5) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                a0(4);
                this.f126837c += 4;
                return true;
            }
            this.f126840f = ((i17 >>> 3) << 3) | 4;
            while (o() != Integer.MAX_VALUE && r()) {
            }
            if (this.f126839e != this.f126840f) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
            }
            this.f126840f = i18;
            return true;
        }
        int i27 = this.f126838d;
        int i28 = this.f126837c;
        int i29 = i27 - i28;
        byte[] bArr = this.f126836b;
        if (i29 >= 10) {
            int i37 = 0;
            while (i37 < 10) {
                int i38 = i28 + 1;
                if (bArr[i28] >= 0) {
                    this.f126837c = i38;
                    break;
                }
                i37++;
                i28 = i38;
            }
        }
        for (int i39 = 0; i39 < 10; i39++) {
            int i47 = this.f126837c;
            if (i47 == this.f126838d) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
            }
            this.f126837c = i47 + 1;
            if (bArr[i47] >= 0) {
                return true;
            }
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: readDouble */
    public double mo20626xc851b907() {
        c0(1);
        a0(8);
        return java.lang.Double.longBitsToDouble(T());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: readFloat */
    public float mo20627xbc3e6666() {
        c0(5);
        a0(4);
        return java.lang.Float.intBitsToFloat(S());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void s(java.util.List list) {
        int i17;
        if ((this.f126839e & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(h());
            if (P()) {
                return;
            } else {
                i17 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void t(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.j4)) {
            int i19 = this.f126839e & 7;
            if (i19 != 1) {
                if (i19 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int X = X();
                e0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(T())));
                }
                return;
            }
            do {
                list.add(java.lang.Double.valueOf(mo20626xc851b907()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.j4 j4Var = (com.p176xb6135e39.p283xc50a8b8b.j4) list;
        int i28 = this.f126839e & 7;
        if (i28 != 1) {
            if (i28 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int X2 = X();
            e0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                j4Var.e(java.lang.Double.longBitsToDouble(T()));
            }
            return;
        }
        do {
            j4Var.e(mo20626xc851b907());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long u() {
        c0(0);
        return Y();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long v() {
        c0(1);
        a0(8);
        return T();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void w(java.util.List list) {
        int i17;
        int i18;
        if (!(list instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            int i19 = this.f126839e & 7;
            if (i19 == 2) {
                int X = X();
                d0(X);
                int i27 = this.f126837c + X;
                while (this.f126837c < i27) {
                    list.add(java.lang.Integer.valueOf(S()));
                }
                return;
            }
            if (i19 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(N()));
                if (P()) {
                    return;
                } else {
                    i17 = this.f126837c;
                }
            } while (X() == this.f126839e);
            this.f126837c = i17;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i28 = this.f126839e & 7;
        if (i28 == 2) {
            int X2 = X();
            d0(X2);
            int i29 = this.f126837c + X2;
            while (this.f126837c < i29) {
                m6Var.e(S());
            }
            return;
        }
        if (i28 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            m6Var.e(N());
            if (P()) {
                return;
            } else {
                i18 = this.f126837c;
            }
        } while (X() == this.f126839e);
        this.f126837c = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void x(java.util.List list, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int i17;
        int i18 = this.f126839e;
        if ((i18 & 7) != 3) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(R(q9Var, t4Var));
            if (P()) {
                return;
            } else {
                i17 = this.f126837c;
            }
        } while (X() == i18);
        this.f126837c = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public boolean y() {
        c0(0);
        return X() != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void z(java.util.List list, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int i17;
        int i18 = this.f126839e;
        if ((i18 & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(U(q9Var, t4Var));
            if (P()) {
                return;
            } else {
                i17 = this.f126837c;
            }
        } while (X() == i18);
        this.f126837c = i17;
    }
}
