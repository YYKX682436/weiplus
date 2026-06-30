package x36;

/* loaded from: classes16.dex */
public final class k implements x36.m, x36.l, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public x36.c0 f533226d;

    /* renamed from: e, reason: collision with root package name */
    public long f533227e;

    public x36.k A(byte[] source, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        long j17 = i18;
        x36.b.b(source.length, i17, j17);
        int i19 = i18 + i17;
        while (i17 < i19) {
            x36.c0 w17 = w(1);
            int min = java.lang.Math.min(i19 - i17, 8192 - w17.f533192c);
            int i27 = i17 + min;
            kz5.v.h(source, w17.f533190a, w17.f533192c, i17, i27);
            w17.f533192c += min;
            i17 = i27;
        }
        this.f533227e += j17;
        return this;
    }

    @Override // x36.m
    public java.lang.String A0(long j17) {
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j17).toString());
        }
        long j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            j18 = j17 + 1;
        }
        byte b17 = (byte) 10;
        long f17 = f(b17, 0L, j18);
        if (f17 != -1) {
            return y36.a.a(this, f17);
        }
        if (j18 < this.f533227e && c(j18 - 1) == ((byte) 13) && c(j18) == b17) {
            return y36.a.a(this, j18);
        }
        x36.k kVar = new x36.k();
        b(kVar, 0L, java.lang.Math.min(32, this.f533227e));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(this.f533227e, j17) + " content=" + kVar.l().m() + (char) 8230);
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        long j18 = this.f533227e;
        if (j18 == 0) {
            return -1L;
        }
        if (j17 > j18) {
            j17 = j18;
        }
        sink.U(this, j17);
        return j17;
    }

    public long C(x36.h0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        long j17 = 0;
        while (true) {
            long B = source.B(this, 8192);
            if (B == -1) {
                return j17;
            }
            j17 += B;
        }
    }

    public x36.k F(int i17) {
        x36.c0 w17 = w(1);
        int i18 = w17.f533192c;
        w17.f533192c = i18 + 1;
        w17.f533190a[i18] = (byte) i17;
        this.f533227e++;
        return this;
    }

    @Override // x36.l
    public /* bridge */ /* synthetic */ x36.l F0(java.lang.String str) {
        O(str);
        return this;
    }

    @Override // x36.m
    public x36.o H(long j17) {
        if (!(j17 >= 0 && j17 <= ((long) Integer.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j17).toString());
        }
        if (this.f533227e < j17) {
            throw new java.io.EOFException();
        }
        if (j17 < 4096) {
            return new x36.o(k(j17));
        }
        x36.o v17 = v((int) j17);
        mo174960x35e57f(j17);
        return v17;
    }

    @Override // x36.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public x36.k G(long j17) {
        boolean z17;
        byte[] bArr;
        if (j17 == 0) {
            F(48);
        } else {
            int i17 = 1;
            if (j17 < 0) {
                j17 = -j17;
                if (j17 < 0) {
                    O("-9223372036854775808");
                } else {
                    z17 = true;
                }
            } else {
                z17 = false;
            }
            if (j17 >= 100000000) {
                i17 = j17 < 1000000000000L ? j17 < 10000000000L ? j17 < 1000000000 ? 9 : 10 : j17 < 100000000000L ? 11 : 12 : j17 < 1000000000000000L ? j17 < 10000000000000L ? 13 : j17 < 100000000000000L ? 14 : 15 : j17 < 100000000000000000L ? j17 < 10000000000000000L ? 16 : 17 : j17 < 1000000000000000000L ? 18 : 19;
            } else if (j17 >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                i17 = j17 < 1000000 ? j17 < 100000 ? 5 : 6 : j17 < 10000000 ? 7 : 8;
            } else if (j17 >= 100) {
                i17 = j17 < 1000 ? 3 : 4;
            } else if (j17 >= 10) {
                i17 = 2;
            }
            if (z17) {
                i17++;
            }
            x36.c0 w17 = w(i17);
            int i18 = w17.f533192c + i17;
            while (true) {
                bArr = w17.f533190a;
                if (j17 == 0) {
                    break;
                }
                long j18 = 10;
                i18--;
                bArr[i18] = y36.a.f540803a[(int) (j17 % j18)];
                j17 /= j18;
            }
            if (z17) {
                bArr[i18 - 1] = (byte) 45;
            }
            w17.f533192c += i17;
            this.f533227e += i17;
        }
        return this;
    }

    @Override // x36.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public x36.k i0(long j17) {
        if (j17 == 0) {
            F(48);
        } else {
            long j18 = (j17 >>> 1) | j17;
            long j19 = j18 | (j18 >>> 2);
            long j27 = j19 | (j19 >>> 4);
            long j28 = j27 | (j27 >>> 8);
            long j29 = j28 | (j28 >>> 16);
            long j37 = j29 | (j29 >>> 32);
            long j38 = j37 - ((j37 >>> 1) & 6148914691236517205L);
            long j39 = ((j38 >>> 2) & 3689348814741910323L) + (j38 & 3689348814741910323L);
            long j47 = ((j39 >>> 4) + j39) & 1085102592571150095L;
            long j48 = j47 + (j47 >>> 8);
            long j49 = j48 + (j48 >>> 16);
            int i17 = (int) ((((j49 & 63) + ((j49 >>> 32) & 63)) + 3) / 4);
            x36.c0 w17 = w(i17);
            int i18 = w17.f533192c;
            for (int i19 = (i18 + i17) - 1; i19 >= i18; i19--) {
                w17.f533190a[i19] = y36.a.f540803a[(int) (15 & j17)];
                j17 >>>= 4;
            }
            w17.f533192c += i17;
            this.f533227e += i17;
        }
        return this;
    }

    public x36.k K(int i17) {
        x36.c0 w17 = w(4);
        int i18 = w17.f533192c;
        int i19 = i18 + 1;
        byte[] bArr = w17.f533190a;
        bArr[i18] = (byte) ((i17 >>> 24) & 255);
        int i27 = i19 + 1;
        bArr[i19] = (byte) ((i17 >>> 16) & 255);
        int i28 = i27 + 1;
        bArr[i27] = (byte) ((i17 >>> 8) & 255);
        bArr[i28] = (byte) (i17 & 255);
        w17.f533192c = i28 + 1;
        this.f533227e += 4;
        return this;
    }

    @Override // x36.m
    public java.lang.String L0() {
        return A0(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    public x36.k N(int i17) {
        x36.c0 w17 = w(2);
        int i18 = w17.f533192c;
        int i19 = i18 + 1;
        byte[] bArr = w17.f533190a;
        bArr[i18] = (byte) ((i17 >>> 8) & 255);
        bArr[i19] = (byte) (i17 & 255);
        w17.f533192c = i19 + 1;
        this.f533227e += 2;
        return this;
    }

    public x36.k O(java.lang.String string) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        P(string, 0, string.length());
        return this;
    }

    public x36.k P(java.lang.String string, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i17).toString());
        }
        if (!(i18 >= i17)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i18 + " < " + i17).toString());
        }
        if (!(i18 <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i18 + " > " + string.length()).toString());
        }
        while (i17 < i18) {
            char charAt = string.charAt(i17);
            if (charAt < 128) {
                x36.c0 w17 = w(1);
                int i19 = w17.f533192c - i17;
                int min = java.lang.Math.min(i18, 8192 - i19);
                int i27 = i17 + 1;
                byte[] bArr = w17.f533190a;
                bArr[i17 + i19] = (byte) charAt;
                while (i27 < min) {
                    char charAt2 = string.charAt(i27);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i27 + i19] = (byte) charAt2;
                    i27++;
                }
                int i28 = w17.f533192c;
                int i29 = (i19 + i27) - i28;
                w17.f533192c = i28 + i29;
                this.f533227e += i29;
                i17 = i27;
            } else {
                if (charAt < 2048) {
                    x36.c0 w18 = w(2);
                    int i37 = w18.f533192c;
                    byte[] bArr2 = w18.f533190a;
                    bArr2[i37] = (byte) ((charAt >> 6) | 192);
                    bArr2[i37 + 1] = (byte) ((charAt & '?') | 128);
                    w18.f533192c = i37 + 2;
                    this.f533227e += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    x36.c0 w19 = w(3);
                    int i38 = w19.f533192c;
                    byte[] bArr3 = w19.f533190a;
                    bArr3[i38] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i38 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i38 + 2] = (byte) ((charAt & '?') | 128);
                    w19.f533192c = i38 + 3;
                    this.f533227e += 3;
                } else {
                    int i39 = i17 + 1;
                    char charAt3 = i39 < i18 ? string.charAt(i39) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        F(63);
                        i17 = i39;
                    } else {
                        int i47 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        x36.c0 w27 = w(4);
                        int i48 = w27.f533192c;
                        byte[] bArr4 = w27.f533190a;
                        bArr4[i48] = (byte) ((i47 >> 18) | 240);
                        bArr4[i48 + 1] = (byte) (((i47 >> 12) & 63) | 128);
                        bArr4[i48 + 2] = (byte) (((i47 >> 6) & 63) | 128);
                        bArr4[i48 + 3] = (byte) ((i47 & 63) | 128);
                        w27.f533192c = i48 + 4;
                        this.f533227e += 4;
                        i17 += 2;
                    }
                }
                i17++;
            }
        }
        return this;
    }

    @Override // x36.m
    public long P0(x36.f0 sink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        long j17 = this.f533227e;
        if (j17 > 0) {
            sink.U(this, j17);
        }
        return j17;
    }

    public x36.k Q(int i17) {
        java.lang.String str;
        if (i17 < 128) {
            F(i17);
        } else if (i17 < 2048) {
            x36.c0 w17 = w(2);
            int i18 = w17.f533192c;
            byte[] bArr = w17.f533190a;
            bArr[i18] = (byte) ((i17 >> 6) | 192);
            bArr[i18 + 1] = (byte) ((i17 & 63) | 128);
            w17.f533192c = i18 + 2;
            this.f533227e += 2;
        } else if (55296 <= i17 && 57343 >= i17) {
            F(63);
        } else if (i17 < 65536) {
            x36.c0 w18 = w(3);
            int i19 = w18.f533192c;
            byte[] bArr2 = w18.f533190a;
            bArr2[i19] = (byte) ((i17 >> 12) | 224);
            bArr2[i19 + 1] = (byte) (((i17 >> 6) & 63) | 128);
            bArr2[i19 + 2] = (byte) ((i17 & 63) | 128);
            w18.f533192c = i19 + 3;
            this.f533227e += 3;
        } else {
            if (i17 > 1114111) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Unexpected code point: 0x");
                if (i17 != 0) {
                    char[] cArr = y36.b.f540804a;
                    int i27 = 0;
                    char[] cArr2 = {cArr[(i17 >> 28) & 15], cArr[(i17 >> 24) & 15], cArr[(i17 >> 20) & 15], cArr[(i17 >> 16) & 15], cArr[(i17 >> 12) & 15], cArr[(i17 >> 8) & 15], cArr[(i17 >> 4) & 15], cArr[i17 & 15]};
                    while (i27 < 8 && cArr2[i27] == '0') {
                        i27++;
                    }
                    str = new java.lang.String(cArr2, i27, 8 - i27);
                } else {
                    str = "0";
                }
                sb6.append(str);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
            x36.c0 w19 = w(4);
            int i28 = w19.f533192c;
            byte[] bArr3 = w19.f533190a;
            bArr3[i28] = (byte) ((i17 >> 18) | 240);
            bArr3[i28 + 1] = (byte) (((i17 >> 12) & 63) | 128);
            bArr3[i28 + 2] = (byte) (((i17 >> 6) & 63) | 128);
            bArr3[i28 + 3] = (byte) ((i17 & 63) | 128);
            w19.f533192c = i28 + 4;
            this.f533227e += 4;
        }
        return this;
    }

    @Override // x36.f0
    public void U(x36.k source, long j17) {
        int i17;
        x36.c0 c0Var;
        x36.c0 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!(source != this)) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        x36.b.b(source.f533227e, 0L, j17);
        long j18 = j17;
        while (j18 > 0) {
            x36.c0 c0Var2 = source.f533226d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
            int i18 = c0Var2.f533192c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(source.f533226d);
            if (j18 < i18 - r7.f533191b) {
                x36.c0 c0Var3 = this.f533226d;
                if (c0Var3 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
                    c0Var = c0Var3.f533196g;
                } else {
                    c0Var = null;
                }
                if (c0Var != null && c0Var.f533194e) {
                    if ((c0Var.f533192c + j18) - (c0Var.f533193d ? 0 : c0Var.f533191b) <= 8192) {
                        x36.c0 c0Var4 = source.f533226d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var4);
                        c0Var4.d(c0Var, (int) j18);
                        source.f533227e -= j18;
                        this.f533227e += j18;
                        return;
                    }
                }
                x36.c0 c0Var5 = source.f533226d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var5);
                int i19 = (int) j18;
                if (!(i19 > 0 && i19 <= c0Var5.f533192c - c0Var5.f533191b)) {
                    throw new java.lang.IllegalArgumentException("byteCount out of range".toString());
                }
                if (i19 >= 1024) {
                    b17 = c0Var5.c();
                } else {
                    b17 = x36.d0.b();
                    byte[] bArr = c0Var5.f533190a;
                    byte[] bArr2 = b17.f533190a;
                    int i27 = c0Var5.f533191b;
                    kz5.v.l(bArr, bArr2, 0, i27, i27 + i19, 2, null);
                }
                b17.f533192c = b17.f533191b + i19;
                c0Var5.f533191b += i19;
                x36.c0 c0Var6 = c0Var5.f533196g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var6);
                c0Var6.b(b17);
                source.f533226d = b17;
            }
            x36.c0 c0Var7 = source.f533226d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var7);
            long j19 = c0Var7.f533192c - c0Var7.f533191b;
            source.f533226d = c0Var7.a();
            x36.c0 c0Var8 = this.f533226d;
            if (c0Var8 == null) {
                this.f533226d = c0Var7;
                c0Var7.f533196g = c0Var7;
                c0Var7.f533195f = c0Var7;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var8);
                x36.c0 c0Var9 = c0Var8.f533196g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var9);
                c0Var9.b(c0Var7);
                x36.c0 c0Var10 = c0Var7.f533196g;
                if (!(c0Var10 != c0Var7)) {
                    throw new java.lang.IllegalStateException("cannot compact".toString());
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var10);
                if (c0Var10.f533194e) {
                    int i28 = c0Var7.f533192c - c0Var7.f533191b;
                    x36.c0 c0Var11 = c0Var7.f533196g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var11);
                    int i29 = 8192 - c0Var11.f533192c;
                    x36.c0 c0Var12 = c0Var7.f533196g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var12);
                    if (c0Var12.f533193d) {
                        i17 = 0;
                    } else {
                        x36.c0 c0Var13 = c0Var7.f533196g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var13);
                        i17 = c0Var13.f533191b;
                    }
                    if (i28 <= i29 + i17) {
                        x36.c0 c0Var14 = c0Var7.f533196g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var14);
                        c0Var7.d(c0Var14, i28);
                        c0Var7.a();
                        x36.d0.a(c0Var7);
                    }
                }
            }
            source.f533227e -= j19;
            this.f533227e += j19;
            j18 -= j19;
        }
    }

    public final long a() {
        long j17 = this.f533227e;
        if (j17 == 0) {
            return 0L;
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        x36.c0 c0Var2 = c0Var.f533196g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
        if (c0Var2.f533192c < 8192 && c0Var2.f533194e) {
            j17 -= r3 - c0Var2.f533191b;
        }
        return j17;
    }

    public final x36.k b(x36.k out, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        x36.b.b(this.f533227e, j17, j18);
        if (j18 != 0) {
            out.f533227e += j18;
            x36.c0 c0Var = this.f533226d;
            while (true) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                int i17 = c0Var.f533192c;
                int i18 = c0Var.f533191b;
                if (j17 < i17 - i18) {
                    break;
                }
                j17 -= i17 - i18;
                c0Var = c0Var.f533195f;
            }
            while (j18 > 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                x36.c0 c17 = c0Var.c();
                int i19 = c17.f533191b + ((int) j17);
                c17.f533191b = i19;
                c17.f533192c = java.lang.Math.min(i19 + ((int) j18), c17.f533192c);
                x36.c0 c0Var2 = out.f533226d;
                if (c0Var2 == null) {
                    c17.f533196g = c17;
                    c17.f533195f = c17;
                    out.f533226d = c17;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                    x36.c0 c0Var3 = c0Var2.f533196g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
                    c0Var3.b(c17);
                }
                j18 -= c17.f533192c - c17.f533191b;
                c0Var = c0Var.f533195f;
                j17 = 0;
            }
        }
        return this;
    }

    public final byte c(long j17) {
        x36.b.b(this.f533227e, j17, 1L);
        x36.c0 c0Var = this.f533226d;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
            throw null;
        }
        long j18 = this.f533227e;
        if (j18 - j17 < j17) {
            while (j18 > j17) {
                c0Var = c0Var.f533196g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                j18 -= c0Var.f533192c - c0Var.f533191b;
            }
            return c0Var.f533190a[(int) ((c0Var.f533191b + j17) - j18)];
        }
        long j19 = 0;
        while (true) {
            int i17 = c0Var.f533192c;
            int i18 = c0Var.f533191b;
            long j27 = (i17 - i18) + j19;
            if (j27 > j17) {
                return c0Var.f533190a[(int) ((i18 + j17) - j19)];
            }
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            j19 = j27;
        }
    }

    @Override // x36.m
    public void c1(long j17) {
        if (this.f533227e < j17) {
            throw new java.io.EOFException();
        }
    }

    /* renamed from: clone */
    public java.lang.Object m174971x5a5dd5d() {
        x36.k kVar = new x36.k();
        if (this.f533227e != 0) {
            x36.c0 c0Var = this.f533226d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            x36.c0 c17 = c0Var.c();
            kVar.f533226d = c17;
            c17.f533196g = c17;
            c17.f533195f = c17;
            for (x36.c0 c0Var2 = c0Var.f533195f; c0Var2 != c0Var; c0Var2 = c0Var2.f533195f) {
                x36.c0 c0Var3 = c17.f533196g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                c0Var3.b(c0Var2.c());
            }
            kVar.f533227e = this.f533227e;
        }
        return kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, x36.f0
    public void close() {
    }

    @Override // x36.m
    public boolean d(long j17) {
        return this.f533227e >= j17;
    }

    @Override // x36.l
    public /* bridge */ /* synthetic */ x36.l e(int i17) {
        F(i17);
        return this;
    }

    /* renamed from: equals */
    public boolean m174972xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof x36.k) {
                long j17 = this.f533227e;
                x36.k kVar = (x36.k) obj;
                if (j17 == kVar.f533227e) {
                    if (j17 != 0) {
                        x36.c0 c0Var = this.f533226d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                        x36.c0 c0Var2 = kVar.f533226d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                        int i17 = c0Var.f533191b;
                        int i18 = c0Var2.f533191b;
                        long j18 = 0;
                        while (j18 < this.f533227e) {
                            long min = java.lang.Math.min(c0Var.f533192c - i17, c0Var2.f533192c - i18);
                            long j19 = 0;
                            while (j19 < min) {
                                int i19 = i17 + 1;
                                byte b17 = c0Var.f533190a[i17];
                                int i27 = i18 + 1;
                                if (b17 == c0Var2.f533190a[i18]) {
                                    j19++;
                                    i18 = i27;
                                    i17 = i19;
                                }
                            }
                            if (i17 == c0Var.f533192c) {
                                x36.c0 c0Var3 = c0Var.f533195f;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var3);
                                i17 = c0Var3.f533191b;
                                c0Var = c0Var3;
                            }
                            if (i18 == c0Var2.f533192c) {
                                c0Var2 = c0Var2.f533195f;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
                                i18 = c0Var2.f533191b;
                            }
                            j18 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long f(byte b17, long j17, long j18) {
        x36.c0 c0Var;
        long j19 = 0;
        if (!(0 <= j17 && j18 >= j17)) {
            throw new java.lang.IllegalArgumentException(("size=" + this.f533227e + " fromIndex=" + j17 + " toIndex=" + j18).toString());
        }
        long j27 = this.f533227e;
        if (j18 > j27) {
            j18 = j27;
        }
        if (j17 == j18 || (c0Var = this.f533226d) == null) {
            return -1L;
        }
        if (j27 - j17 < j17) {
            while (j27 > j17) {
                c0Var = c0Var.f533196g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                j27 -= c0Var.f533192c - c0Var.f533191b;
            }
            while (j27 < j18) {
                int min = (int) java.lang.Math.min(c0Var.f533192c, (c0Var.f533191b + j18) - j27);
                for (int i17 = (int) ((c0Var.f533191b + j17) - j27); i17 < min; i17++) {
                    if (c0Var.f533190a[i17] == b17) {
                        return (i17 - c0Var.f533191b) + j27;
                    }
                }
                j27 += c0Var.f533192c - c0Var.f533191b;
                c0Var = c0Var.f533195f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                j17 = j27;
            }
            return -1L;
        }
        while (true) {
            long j28 = (c0Var.f533192c - c0Var.f533191b) + j19;
            if (j28 > j17) {
                break;
            }
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            j19 = j28;
        }
        while (j19 < j18) {
            int min2 = (int) java.lang.Math.min(c0Var.f533192c, (c0Var.f533191b + j18) - j19);
            for (int i18 = (int) ((c0Var.f533191b + j17) - j19); i18 < min2; i18++) {
                if (c0Var.f533190a[i18] == b17) {
                    return (i18 - c0Var.f533191b) + j19;
                }
            }
            j19 += c0Var.f533192c - c0Var.f533191b;
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            j17 = j19;
        }
        return -1L;
    }

    @Override // x36.l, x36.f0, java.io.Flushable
    public void flush() {
    }

    @Override // x36.m
    /* renamed from: getBuffer */
    public x36.k mo174954x12f2b736() {
        return this;
    }

    @Override // x36.h0
    public x36.j0 h() {
        return x36.j0.f533222d;
    }

    /* renamed from: hashCode */
    public int m174973x8cdac1b() {
        x36.c0 c0Var = this.f533226d;
        if (c0Var == null) {
            return 0;
        }
        int i17 = 1;
        do {
            int i18 = c0Var.f533192c;
            for (int i19 = c0Var.f533191b; i19 < i18; i19++) {
                i17 = (i17 * 31) + c0Var.f533190a[i19];
            }
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        } while (c0Var != this.f533226d);
        return i17;
    }

    public int i(byte[] sink, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        x36.b.b(sink.length, i17, i18);
        x36.c0 c0Var = this.f533226d;
        if (c0Var == null) {
            return -1;
        }
        int min = java.lang.Math.min(i18, c0Var.f533192c - c0Var.f533191b);
        int i19 = c0Var.f533191b;
        kz5.v.h(c0Var.f533190a, sink, i17, i19, i19 + min);
        int i27 = c0Var.f533191b + min;
        c0Var.f533191b = i27;
        this.f533227e -= min;
        if (i27 != c0Var.f533192c) {
            return min;
        }
        this.f533226d = c0Var.a();
        x36.d0.a(c0Var);
        return min;
    }

    @Override // x36.l
    public /* bridge */ /* synthetic */ x36.l i1(int i17) {
        N(i17);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final x36.i j(x36.i unsafeCursor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unsafeCursor, "unsafeCursor");
        byte[] bArr = y36.a.f540803a;
        if (!(unsafeCursor.f533214d == null)) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f533214d = this;
        unsafeCursor.f533215e = true;
        return unsafeCursor;
    }

    public byte[] k(long j17) {
        if (!(j17 >= 0 && j17 <= ((long) Integer.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j17).toString());
        }
        if (this.f533227e < j17) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) j17];
        mo174956xbc4273d4(bArr);
        return bArr;
    }

    @Override // x36.m
    public void k1(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        long j18 = this.f533227e;
        if (j18 >= j17) {
            sink.U(this, j17);
        } else {
            sink.U(this, j18);
            throw new java.io.EOFException();
        }
    }

    public x36.o l() {
        return H(this.f533227e);
    }

    @Override // x36.m
    public x36.k m() {
        return this;
    }

    @Override // x36.l
    public /* bridge */ /* synthetic */ x36.l o(int i17) {
        K(i17);
        return this;
    }

    @Override // x36.m
    public boolean o1() {
        return this.f533227e == 0;
    }

    public java.lang.String p(long j17, java.nio.charset.Charset charset) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        if (!(j17 >= 0 && j17 <= ((long) Integer.MAX_VALUE))) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j17).toString());
        }
        if (this.f533227e < j17) {
            throw new java.io.EOFException();
        }
        if (j17 == 0) {
            return "";
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        int i17 = c0Var.f533191b;
        if (i17 + j17 > c0Var.f533192c) {
            return new java.lang.String(k(j17), charset);
        }
        int i18 = (int) j17;
        java.lang.String str = new java.lang.String(c0Var.f533190a, i17, i18, charset);
        int i19 = c0Var.f533191b + i18;
        c0Var.f533191b = i19;
        this.f533227e -= j17;
        if (i19 == c0Var.f533192c) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[EDGE_INSN: B:46:0x00ad->B:40:0x00ad BREAK  A[LOOP:0: B:4:0x000e->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    @Override // x36.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long p1() {
        /*
            r15 = this;
            long r0 = r15.f533227e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r4 = -7
            r1 = r0
            r6 = r1
            r7 = r6
        Le:
            x36.c0 r8 = r15.f533226d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            int r9 = r8.f533191b
            int r10 = r8.f533192c
        L17:
            if (r9 >= r10) goto L99
            byte[] r11 = r8.f533190a
            r11 = r11[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L60
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L60
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r13 < 0) goto L3f
            if (r13 != 0) goto L39
            long r13 = (long) r12
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L39
            goto L3f
        L39:
            r13 = 10
            long r2 = r2 * r13
            long r11 = (long) r12
            long r2 = r2 + r11
            goto L6c
        L3f:
            x36.k r0 = new x36.k
            r0.<init>()
            x36.k r0 = r0.G(r2)
            r0.F(r11)
            if (r6 != 0) goto L50
            r0.mo174955xcc4273be()
        L50:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.q()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L60:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L71
            if (r1 != 0) goto L71
            r11 = 1
            long r4 = r4 - r11
            r6 = r13
        L6c:
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L71:
            if (r1 == 0) goto L75
            r7 = r13
            goto L99
        L75:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = y36.b.f540804a
            int r4 = r11 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r2[r0] = r4
            r0 = r11 & 15
            char r0 = r3[r0]
            r2[r13] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L99:
            if (r9 != r10) goto La5
            x36.c0 r9 = r8.a()
            r15.f533226d = r9
            x36.d0.a(r8)
            goto La7
        La5:
            r8.f533191b = r9
        La7:
            if (r7 != 0) goto Lad
            x36.c0 r8 = r15.f533226d
            if (r8 != 0) goto Le
        Lad:
            long r4 = r15.f533227e
            long r0 = (long) r1
            long r4 = r4 - r0
            r15.f533227e = r4
            if (r6 == 0) goto Lb6
            goto Lb7
        Lb6:
            long r2 = -r2
        Lb7:
            return r2
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.k.p1():long");
    }

    public java.lang.String q() {
        return p(this.f533227e, r26.c.f450398a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer sink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        x36.c0 c0Var = this.f533226d;
        if (c0Var == null) {
            return -1;
        }
        int min = java.lang.Math.min(sink.remaining(), c0Var.f533192c - c0Var.f533191b);
        sink.put(c0Var.f533190a, c0Var.f533191b, min);
        int i17 = c0Var.f533191b + min;
        c0Var.f533191b = i17;
        this.f533227e -= min;
        if (i17 == c0Var.f533192c) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        }
        return min;
    }

    @Override // x36.m
    /* renamed from: readByte */
    public byte mo174955xcc4273be() {
        if (this.f533227e == 0) {
            throw new java.io.EOFException();
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        int i17 = c0Var.f533191b;
        int i18 = c0Var.f533192c;
        int i19 = i17 + 1;
        byte b17 = c0Var.f533190a[i17];
        this.f533227e--;
        if (i19 == i18) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        } else {
            c0Var.f533191b = i19;
        }
        return b17;
    }

    @Override // x36.m
    /* renamed from: readFully */
    public void mo174956xbc4273d4(byte[] sink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        int i17 = 0;
        while (i17 < sink.length) {
            int i18 = i(sink, i17, sink.length - i17);
            if (i18 == -1) {
                throw new java.io.EOFException();
            }
            i17 += i18;
        }
    }

    @Override // x36.m
    /* renamed from: readInt */
    public int mo174957x40655679() {
        if (this.f533227e < 4) {
            throw new java.io.EOFException();
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        int i17 = c0Var.f533191b;
        int i18 = c0Var.f533192c;
        if (i18 - i17 < 4) {
            return ((mo174955xcc4273be() & 255) << 24) | ((mo174955xcc4273be() & 255) << 16) | ((mo174955xcc4273be() & 255) << 8) | (mo174955xcc4273be() & 255);
        }
        int i19 = i17 + 1;
        byte[] bArr = c0Var.f533190a;
        int i27 = i19 + 1;
        int i28 = ((bArr[i17] & 255) << 24) | ((bArr[i19] & 255) << 16);
        int i29 = i27 + 1;
        int i37 = i28 | ((bArr[i27] & 255) << 8);
        int i38 = i29 + 1;
        int i39 = i37 | (bArr[i29] & 255);
        this.f533227e -= 4;
        if (i38 == i18) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        } else {
            c0Var.f533191b = i38;
        }
        return i39;
    }

    @Override // x36.m
    /* renamed from: readLong */
    public long mo174958xcc46d932() {
        if (this.f533227e < 8) {
            throw new java.io.EOFException();
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        int i17 = c0Var.f533191b;
        int i18 = c0Var.f533192c;
        if (i18 - i17 < 8) {
            return ((mo174957x40655679() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) << 32) | (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & mo174957x40655679());
        }
        byte[] bArr = c0Var.f533190a;
        long j17 = (bArr[i17] & 255) << 56;
        long j18 = j17 | ((bArr[r5] & 255) << 48);
        long j19 = j18 | ((bArr[r1] & 255) << 40);
        int i19 = i17 + 1 + 1 + 1 + 1;
        long j27 = ((bArr[r5] & 255) << 32) | j19;
        long j28 = j27 | ((bArr[i19] & 255) << 24);
        long j29 = j28 | ((bArr[r8] & 255) << 16);
        long j37 = j29 | ((bArr[r1] & 255) << 8);
        int i27 = i19 + 1 + 1 + 1 + 1;
        long j38 = j37 | (bArr[r8] & 255);
        this.f533227e -= 8;
        if (i27 == i18) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        } else {
            c0Var.f533191b = i27;
        }
        return j38;
    }

    @Override // x36.m
    /* renamed from: readShort */
    public short mo174959xbcf3c886() {
        if (this.f533227e < 2) {
            throw new java.io.EOFException();
        }
        x36.c0 c0Var = this.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        int i17 = c0Var.f533191b;
        int i18 = c0Var.f533192c;
        if (i18 - i17 < 2) {
            return (short) (((mo174955xcc4273be() & 255) << 8) | (mo174955xcc4273be() & 255));
        }
        int i19 = i17 + 1;
        byte[] bArr = c0Var.f533190a;
        int i27 = i19 + 1;
        int i28 = ((bArr[i17] & 255) << 8) | (bArr[i19] & 255);
        this.f533227e -= 2;
        if (i27 == i18) {
            this.f533226d = c0Var.a();
            x36.d0.a(c0Var);
        } else {
            c0Var.f533191b = i27;
        }
        return (short) i28;
    }

    @Override // x36.m
    /* renamed from: skip */
    public void mo174960x35e57f(long j17) {
        while (j17 > 0) {
            x36.c0 c0Var = this.f533226d;
            if (c0Var == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j17, c0Var.f533192c - c0Var.f533191b);
            long j18 = min;
            this.f533227e -= j18;
            j17 -= j18;
            int i17 = c0Var.f533191b + min;
            c0Var.f533191b = i17;
            if (i17 == c0Var.f533192c) {
                this.f533226d = c0Var.a();
                x36.d0.a(c0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[EDGE_INSN: B:39:0x00a9->B:36:0x00a9 BREAK  A[LOOP:0: B:4:0x000c->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    @Override // x36.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long t0() {
        /*
            r14 = this;
            long r0 = r14.f533227e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        Lc:
            x36.c0 r7 = r14.f533226d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            int r8 = r7.f533191b
            int r9 = r7.f533192c
        L15:
            if (r8 >= r9) goto L95
            byte[] r10 = r7.f533190a
            r10 = r10[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L28
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L28
            int r11 = r10 - r11
            goto L41
        L28:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L33
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L33
            goto L3d
        L33:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L6d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L6d
        L3d:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r5 = r5 << r10
            long r10 = (long) r11
            long r5 = r5 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L15
        L51:
            x36.k r0 = new x36.k
            r0.<init>()
            x36.k r0 = r0.i0(r5)
            r0.F(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.q()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6d:
            r4 = 1
            if (r1 == 0) goto L71
            goto L95
        L71:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = y36.b.f540804a
            int r5 = r10 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r2[r0] = r5
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L95:
            if (r8 != r9) goto La1
            x36.c0 r8 = r7.a()
            r14.f533226d = r8
            x36.d0.a(r7)
            goto La3
        La1:
            r7.f533191b = r8
        La3:
            if (r4 != 0) goto La9
            x36.c0 r7 = r14.f533226d
            if (r7 != 0) goto Lc
        La9:
            long r2 = r14.f533227e
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f533227e = r2
            return r5
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.k.t0():long");
    }

    /* renamed from: toString */
    public java.lang.String m174974x9616526c() {
        long j17 = this.f533227e;
        if (j17 <= ((long) Integer.MAX_VALUE)) {
            return v((int) j17).mo174966x9616526c();
        }
        throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + this.f533227e).toString());
    }

    public final x36.o v(int i17) {
        if (i17 == 0) {
            return x36.o.f533228g;
        }
        x36.b.b(this.f533227e, 0L, i17);
        x36.c0 c0Var = this.f533226d;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            int i28 = c0Var.f533192c;
            int i29 = c0Var.f533191b;
            if (i28 == i29) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i19 += i28 - i29;
            i27++;
            c0Var = c0Var.f533195f;
        }
        byte[][] bArr = new byte[i27];
        int[] iArr = new int[i27 * 2];
        x36.c0 c0Var2 = this.f533226d;
        int i37 = 0;
        while (i18 < i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
            bArr[i37] = c0Var2.f533190a;
            i18 += c0Var2.f533192c - c0Var2.f533191b;
            iArr[i37] = java.lang.Math.min(i18, i17);
            iArr[i37 + i27] = c0Var2.f533191b;
            c0Var2.f533193d = true;
            i37++;
            c0Var2 = c0Var2.f533195f;
        }
        return new x36.e0(bArr, iArr);
    }

    public final x36.c0 w(int i17) {
        if (!(i17 >= 1 && i17 <= 8192)) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        x36.c0 c0Var = this.f533226d;
        if (c0Var == null) {
            x36.c0 b17 = x36.d0.b();
            this.f533226d = b17;
            b17.f533196g = b17;
            b17.f533195f = b17;
            return b17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        x36.c0 c0Var2 = c0Var.f533196g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var2);
        if (c0Var2.f533192c + i17 <= 8192 && c0Var2.f533194e) {
            return c0Var2;
        }
        x36.c0 b18 = x36.d0.b();
        c0Var2.b(b18);
        return b18;
    }

    @Override // x36.l
    public x36.l w0() {
        return this;
    }

    @Override // x36.l
    /* renamed from: write */
    public /* bridge */ /* synthetic */ x36.l mo174975x6c257df(byte[] bArr) {
        z(bArr);
        return this;
    }

    public x36.k x(x36.o byteString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteString, "byteString");
        byteString.w(this, 0, byteString.l());
        return this;
    }

    public x36.k z(byte[] source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        A(source, 0, source.length);
        return this;
    }

    @Override // x36.l
    public x36.l z0() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        int remaining = source.remaining();
        int i17 = remaining;
        while (i17 > 0) {
            x36.c0 w17 = w(1);
            int min = java.lang.Math.min(i17, 8192 - w17.f533192c);
            source.get(w17.f533190a, w17.f533192c, min);
            i17 -= min;
            w17.f533192c += min;
        }
        this.f533227e += remaining;
        return remaining;
    }
}
