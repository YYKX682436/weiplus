package d9;

/* loaded from: classes15.dex */
public final class f0 implements q8.o {

    /* renamed from: a, reason: collision with root package name */
    public final r9.b f308870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f308871b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.c0 f308872c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.b0 f308873d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.p f308874e;

    /* renamed from: f, reason: collision with root package name */
    public d9.d0 f308875f;

    /* renamed from: g, reason: collision with root package name */
    public d9.d0 f308876g;

    /* renamed from: h, reason: collision with root package name */
    public d9.d0 f308877h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308878i;

    /* renamed from: j, reason: collision with root package name */
    public long f308879j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f308880k;

    /* renamed from: l, reason: collision with root package name */
    public d9.e0 f308881l;

    public f0(r9.b bVar) {
        this.f308870a = bVar;
        int i17 = ((r9.o) bVar).f474924b;
        this.f308871b = i17;
        this.f308872c = new d9.c0();
        this.f308873d = new d9.b0();
        this.f308874e = new t9.p(32);
        d9.d0 d0Var = new d9.d0(0L, i17);
        this.f308875f = d0Var;
        this.f308876g = d0Var;
        this.f308877h = d0Var;
    }

    @Override // q8.o
    public void a(t9.p pVar, int i17) {
        while (i17 > 0) {
            int j17 = j(i17);
            d9.d0 d0Var = this.f308877h;
            r9.a aVar = d0Var.f308861d;
            pVar.b(aVar.f474873a, ((int) (this.f308879j - d0Var.f308858a)) + aVar.f474874b, j17);
            i17 -= j17;
            long j18 = this.f308879j + j17;
            this.f308879j = j18;
            d9.d0 d0Var2 = this.f308877h;
            if (j18 == d0Var2.f308859b) {
                this.f308877h = d0Var2.f308862e;
            }
        }
    }

    @Override // q8.o
    public void b(long j17, int i17, int i18, int i19, q8.n nVar) {
        boolean z17;
        if (this.f308880k) {
            if ((i17 & 1) == 0) {
                return;
            }
            d9.c0 c0Var = this.f308872c;
            synchronized (c0Var) {
                if (c0Var.f308834i == 0) {
                    z17 = j17 > c0Var.f308838m;
                } else if (java.lang.Math.max(c0Var.f308838m, c0Var.d(c0Var.f308837l)) >= j17) {
                    z17 = false;
                } else {
                    int i27 = c0Var.f308834i;
                    int e17 = c0Var.e(i27 - 1);
                    while (i27 > c0Var.f308837l && c0Var.f308831f[e17] >= j17) {
                        i27--;
                        e17--;
                        if (e17 == -1) {
                            e17 = c0Var.f308826a - 1;
                        }
                    }
                    c0Var.b(c0Var.f308835j + i27);
                    z17 = true;
                }
            }
            if (!z17) {
                return;
            } else {
                this.f308880k = false;
            }
        }
        long j18 = j17 + 0;
        long j19 = (this.f308879j - i18) - i19;
        d9.c0 c0Var2 = this.f308872c;
        synchronized (c0Var2) {
            if (c0Var2.f308840o) {
                if ((i17 & 1) == 0) {
                    return;
                } else {
                    c0Var2.f308840o = false;
                }
            }
            t9.a.d(!c0Var2.f308841p);
            synchronized (c0Var2) {
                c0Var2.f308839n = java.lang.Math.max(c0Var2.f308839n, j18);
                int e18 = c0Var2.e(c0Var2.f308834i);
                c0Var2.f308831f[e18] = j18;
                long[] jArr = c0Var2.f308828c;
                jArr[e18] = j19;
                c0Var2.f308829d[e18] = i18;
                c0Var2.f308830e[e18] = i17;
                c0Var2.f308832g[e18] = nVar;
                c0Var2.f308833h[e18] = c0Var2.f308842q;
                c0Var2.f308827b[e18] = c0Var2.f308843r;
                int i28 = c0Var2.f308834i + 1;
                c0Var2.f308834i = i28;
                int i29 = c0Var2.f308826a;
                if (i28 == i29) {
                    int i37 = i29 + 1000;
                    int[] iArr = new int[i37];
                    long[] jArr2 = new long[i37];
                    long[] jArr3 = new long[i37];
                    int[] iArr2 = new int[i37];
                    int[] iArr3 = new int[i37];
                    q8.n[] nVarArr = new q8.n[i37];
                    com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[i37];
                    int i38 = c0Var2.f308836k;
                    int i39 = i29 - i38;
                    java.lang.System.arraycopy(jArr, i38, jArr2, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308831f, c0Var2.f308836k, jArr3, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308830e, c0Var2.f308836k, iArr2, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308829d, c0Var2.f308836k, iArr3, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308832g, c0Var2.f308836k, nVarArr, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308833h, c0Var2.f308836k, c1601x7dc4e417Arr, 0, i39);
                    java.lang.System.arraycopy(c0Var2.f308827b, c0Var2.f308836k, iArr, 0, i39);
                    int i47 = c0Var2.f308836k;
                    java.lang.System.arraycopy(c0Var2.f308828c, 0, jArr2, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308831f, 0, jArr3, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308830e, 0, iArr2, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308829d, 0, iArr3, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308832g, 0, nVarArr, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308833h, 0, c1601x7dc4e417Arr, i39, i47);
                    java.lang.System.arraycopy(c0Var2.f308827b, 0, iArr, i39, i47);
                    c0Var2.f308828c = jArr2;
                    c0Var2.f308831f = jArr3;
                    c0Var2.f308830e = iArr2;
                    c0Var2.f308829d = iArr3;
                    c0Var2.f308832g = nVarArr;
                    c0Var2.f308833h = c1601x7dc4e417Arr;
                    c0Var2.f308827b = iArr;
                    c0Var2.f308836k = 0;
                    c0Var2.f308834i = c0Var2.f308826a;
                    c0Var2.f308826a = i37;
                }
            }
        }
    }

    @Override // q8.o
    public void c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        boolean z17;
        if (c1601x7dc4e417 == null) {
            c1601x7dc4e417 = null;
        }
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            z17 = false;
            if (c1601x7dc4e417 == null) {
                c0Var.f308841p = true;
            } else {
                c0Var.f308841p = false;
                if (!t9.d0.a(c1601x7dc4e417, c0Var.f308842q)) {
                    c0Var.f308842q = c1601x7dc4e417;
                    z17 = true;
                }
            }
        }
        d9.e0 e0Var = this.f308881l;
        if (e0Var == null || !z17) {
            return;
        }
        e0Var.a(c1601x7dc4e417);
    }

    @Override // q8.o
    public int d(q8.f fVar, int i17, boolean z17) {
        int j17 = j(i17);
        d9.d0 d0Var = this.f308877h;
        r9.a aVar = d0Var.f308861d;
        int c17 = ((q8.b) fVar).c(aVar.f474873a, ((int) (this.f308879j - d0Var.f308858a)) + aVar.f474874b, j17);
        if (c17 == -1) {
            if (z17) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        long j18 = this.f308879j + c17;
        this.f308879j = j18;
        d9.d0 d0Var2 = this.f308877h;
        if (j18 == d0Var2.f308859b) {
            this.f308877h = d0Var2.f308862e;
        }
        return c17;
    }

    public boolean e(long j17, boolean z17, boolean z18) {
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            int e17 = c0Var.e(c0Var.f308837l);
            if (c0Var.f() && j17 >= c0Var.f308831f[e17] && (j17 <= c0Var.f308839n || z18)) {
                int c17 = c0Var.c(e17, c0Var.f308834i - c0Var.f308837l, j17, z17);
                if (c17 == -1) {
                    return false;
                }
                c0Var.f308837l += c17;
                return true;
            }
            return false;
        }
    }

    public final void f(long j17) {
        d9.d0 d0Var;
        if (j17 == -1) {
            return;
        }
        while (true) {
            d0Var = this.f308875f;
            if (j17 < d0Var.f308859b) {
                break;
            }
            r9.b bVar = this.f308870a;
            r9.a aVar = d0Var.f308861d;
            r9.o oVar = (r9.o) bVar;
            synchronized (oVar) {
                r9.a[] aVarArr = oVar.f474925c;
                aVarArr[0] = aVar;
                oVar.a(aVarArr);
            }
            d9.d0 d0Var2 = this.f308875f;
            d0Var2.f308861d = null;
            d9.d0 d0Var3 = d0Var2.f308862e;
            d0Var2.f308862e = null;
            this.f308875f = d0Var3;
        }
        if (this.f308876g.f308858a < d0Var.f308858a) {
            this.f308876g = d0Var;
        }
    }

    public void g(long j17, boolean z17, boolean z18) {
        long j18;
        int i17;
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            int i18 = c0Var.f308834i;
            j18 = -1;
            if (i18 != 0) {
                long[] jArr = c0Var.f308831f;
                int i19 = c0Var.f308836k;
                if (j17 >= jArr[i19]) {
                    int c17 = c0Var.c(i19, (!z18 || (i17 = c0Var.f308837l) == i18) ? i18 : i17 + 1, j17, z17);
                    if (c17 != -1) {
                        j18 = c0Var.a(c17);
                    }
                }
            }
        }
        f(j18);
    }

    public void h() {
        long a17;
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            int i17 = c0Var.f308834i;
            if (i17 == 0) {
                a17 = -1;
            } else {
                a17 = c0Var.a(i17);
            }
        }
        f(a17);
    }

    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 i() {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417;
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            c1601x7dc4e417 = c0Var.f308841p ? null : c0Var.f308842q;
        }
        return c1601x7dc4e417;
    }

    public final int j(int i17) {
        r9.a aVar;
        d9.d0 d0Var = this.f308877h;
        if (!d0Var.f308860c) {
            r9.o oVar = (r9.o) this.f308870a;
            synchronized (oVar) {
                oVar.f474927e++;
                int i18 = oVar.f474928f;
                if (i18 > 0) {
                    r9.a[] aVarArr = oVar.f474929g;
                    int i19 = i18 - 1;
                    oVar.f474928f = i19;
                    aVar = aVarArr[i19];
                    aVarArr[i19] = null;
                } else {
                    aVar = new r9.a(new byte[oVar.f474924b], 0);
                }
            }
            d9.d0 d0Var2 = new d9.d0(this.f308877h.f308859b, this.f308871b);
            d0Var.f308861d = aVar;
            d0Var.f308862e = d0Var2;
            d0Var.f308860c = true;
        }
        return java.lang.Math.min(i17, (int) (this.f308877h.f308859b - this.f308879j));
    }

    public int k(m8.s sVar, o8.g gVar, boolean z17, boolean z18, long j17) {
        int i17;
        int i18;
        char c17;
        d9.c0 c0Var = this.f308872c;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = this.f308878i;
        d9.b0 b0Var = this.f308873d;
        synchronized (c0Var) {
            i17 = 1;
            if (c0Var.f()) {
                int e17 = c0Var.e(c0Var.f308837l);
                if (!z17 && c0Var.f308833h[e17] == c1601x7dc4e417) {
                    if (gVar.f425143f == null && gVar.f425145h == 0) {
                        c17 = 65533;
                    } else {
                        gVar.f425144g = c0Var.f308831f[e17];
                        gVar.f425127d = c0Var.f308830e[e17];
                        b0Var.f308811a = c0Var.f308829d[e17];
                        b0Var.f308812b = c0Var.f308828c[e17];
                        b0Var.f308813c = c0Var.f308832g[e17];
                        c0Var.f308837l++;
                        c17 = 65532;
                    }
                }
                sVar.f406199a = c0Var.f308833h[e17];
                c17 = 65531;
            } else if (z18) {
                gVar.f425127d = 4;
                c17 = 65532;
            } else {
                com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e4172 = c0Var.f308842q;
                if (c1601x7dc4e4172 == null || (!z17 && c1601x7dc4e4172 == c1601x7dc4e417)) {
                    c17 = 65533;
                } else {
                    sVar.f406199a = c1601x7dc4e4172;
                    c17 = 65531;
                }
            }
        }
        if (c17 == 65531) {
            this.f308878i = sVar.f406199a;
            return -5;
        }
        if (c17 != 65532) {
            if (c17 == 65533) {
                return -3;
            }
            throw new java.lang.IllegalStateException();
        }
        if (gVar.b(4)) {
            return -4;
        }
        if (gVar.f425144g < j17) {
            gVar.f425127d |= Integer.MIN_VALUE;
        }
        if (gVar.b(1073741824)) {
            d9.b0 b0Var2 = this.f308873d;
            long j18 = b0Var2.f308812b;
            t9.p pVar = this.f308874e;
            pVar.t(1);
            l(j18, pVar.f498073a, 1);
            long j19 = j18 + 1;
            byte b17 = pVar.f498073a[0];
            boolean z19 = (b17 & 128) != 0;
            int i19 = b17 & Byte.MAX_VALUE;
            o8.d dVar = gVar.f425142e;
            if (dVar.f425130a == null) {
                dVar.f425130a = new byte[16];
            }
            l(j19, dVar.f425130a, i19);
            long j27 = j19 + i19;
            if (z19) {
                pVar.t(2);
                l(j27, pVar.f498073a, 2);
                j27 += 2;
                i17 = pVar.r();
            }
            o8.d dVar2 = gVar.f425142e;
            int[] iArr = dVar2.f425131b;
            if (iArr == null || iArr.length < i17) {
                iArr = new int[i17];
            }
            int[] iArr2 = dVar2.f425132c;
            if (iArr2 == null || iArr2.length < i17) {
                iArr2 = new int[i17];
            }
            if (z19) {
                int i27 = i17 * 6;
                pVar.t(i27);
                l(j27, pVar.f498073a, i27);
                j27 += i27;
                pVar.w(0);
                for (i18 = 0; i18 < i17; i18++) {
                    iArr[i18] = pVar.r();
                    iArr2[i18] = pVar.p();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var2.f308811a - ((int) (j27 - b0Var2.f308812b));
            }
            q8.n nVar = b0Var2.f308813c;
            byte[] bArr = nVar.f442176b;
            byte[] bArr2 = dVar2.f425130a;
            dVar2.f425131b = iArr;
            dVar2.f425132c = iArr2;
            dVar2.f425130a = bArr2;
            int i28 = nVar.f442175a;
            int i29 = nVar.f442177c;
            int i37 = nVar.f442178d;
            int i38 = t9.d0.f498031a;
            if (i38 >= 16) {
                android.media.MediaCodec.CryptoInfo cryptoInfo = dVar2.f425133d;
                cryptoInfo.numSubSamples = i17;
                cryptoInfo.numBytesOfClearData = iArr;
                cryptoInfo.numBytesOfEncryptedData = iArr2;
                cryptoInfo.key = bArr;
                cryptoInfo.iv = bArr2;
                cryptoInfo.mode = i28;
                if (i38 >= 24) {
                    o8.c cVar = dVar2.f425134e;
                    android.media.MediaCodec.CryptoInfo.Pattern pattern = cVar.f425129b;
                    pattern.set(i29, i37);
                    cVar.f425128a.setPattern(pattern);
                }
            }
            long j28 = b0Var2.f308812b;
            int i39 = (int) (j27 - j28);
            b0Var2.f308812b = j28 + i39;
            b0Var2.f308811a -= i39;
        }
        gVar.n(this.f308873d.f308811a);
        d9.b0 b0Var3 = this.f308873d;
        long j29 = b0Var3.f308812b;
        java.nio.ByteBuffer byteBuffer = gVar.f425143f;
        int i47 = b0Var3.f308811a;
        while (true) {
            d9.d0 d0Var = this.f308876g;
            if (j29 < d0Var.f308859b) {
                break;
            }
            this.f308876g = d0Var.f308862e;
        }
        while (i47 > 0) {
            int min = java.lang.Math.min(i47, (int) (this.f308876g.f308859b - j29));
            d9.d0 d0Var2 = this.f308876g;
            r9.a aVar = d0Var2.f308861d;
            byteBuffer.put(aVar.f474873a, ((int) (j29 - d0Var2.f308858a)) + aVar.f474874b, min);
            i47 -= min;
            j29 += min;
            d9.d0 d0Var3 = this.f308876g;
            if (j29 == d0Var3.f308859b) {
                this.f308876g = d0Var3.f308862e;
            }
        }
        return -4;
    }

    public final void l(long j17, byte[] bArr, int i17) {
        while (true) {
            d9.d0 d0Var = this.f308876g;
            if (j17 < d0Var.f308859b) {
                break;
            } else {
                this.f308876g = d0Var.f308862e;
            }
        }
        int i18 = i17;
        while (i18 > 0) {
            int min = java.lang.Math.min(i18, (int) (this.f308876g.f308859b - j17));
            d9.d0 d0Var2 = this.f308876g;
            r9.a aVar = d0Var2.f308861d;
            java.lang.System.arraycopy(aVar.f474873a, ((int) (j17 - d0Var2.f308858a)) + aVar.f474874b, bArr, i17 - i18, min);
            i18 -= min;
            j17 += min;
            d9.d0 d0Var3 = this.f308876g;
            if (j17 == d0Var3.f308859b) {
                this.f308876g = d0Var3.f308862e;
            }
        }
    }

    public void m(boolean z17) {
        d9.c0 c0Var = this.f308872c;
        int i17 = 0;
        c0Var.f308834i = 0;
        c0Var.f308835j = 0;
        c0Var.f308836k = 0;
        c0Var.f308837l = 0;
        c0Var.f308840o = true;
        c0Var.f308838m = Long.MIN_VALUE;
        c0Var.f308839n = Long.MIN_VALUE;
        if (z17) {
            c0Var.f308842q = null;
            c0Var.f308841p = true;
        }
        d9.d0 d0Var = this.f308875f;
        boolean z18 = d0Var.f308860c;
        r9.b bVar = this.f308870a;
        int i18 = this.f308871b;
        if (z18) {
            d9.d0 d0Var2 = this.f308877h;
            boolean z19 = d0Var2.f308860c;
            int i19 = (z19 ? 1 : 0) + (((int) (d0Var2.f308858a - d0Var.f308858a)) / i18);
            r9.a[] aVarArr = new r9.a[i19];
            while (i17 < i19) {
                aVarArr[i17] = d0Var.f308861d;
                d0Var.f308861d = null;
                d9.d0 d0Var3 = d0Var.f308862e;
                d0Var.f308862e = null;
                i17++;
                d0Var = d0Var3;
            }
            ((r9.o) bVar).a(aVarArr);
        }
        d9.d0 d0Var4 = new d9.d0(0L, i18);
        this.f308875f = d0Var4;
        this.f308876g = d0Var4;
        this.f308877h = d0Var4;
        this.f308879j = 0L;
        ((r9.o) bVar).b();
    }

    public void n() {
        d9.c0 c0Var = this.f308872c;
        synchronized (c0Var) {
            c0Var.f308837l = 0;
        }
        this.f308876g = this.f308875f;
    }
}
