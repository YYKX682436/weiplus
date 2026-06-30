package s8;

/* loaded from: classes15.dex */
public final class i implements q8.e {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0, reason: collision with root package name */
    public static final byte[] f486206a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0, reason: collision with root package name */
    public static final byte[] f486207b0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f486208c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: d0, reason: collision with root package name */
    public static final long f486209d0 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f486210e0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: f0, reason: collision with root package name */
    public static final java.util.UUID f486211f0 = new java.util.UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public t9.i B;
    public t9.i C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f486212J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public q8.g Y;

    /* renamed from: a, reason: collision with root package name */
    public final s8.d f486213a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.k f486214b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f486215c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f486216d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.p f486217e;

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f486218f;

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f486219g;

    /* renamed from: h, reason: collision with root package name */
    public final t9.p f486220h;

    /* renamed from: i, reason: collision with root package name */
    public final t9.p f486221i;

    /* renamed from: j, reason: collision with root package name */
    public final t9.p f486222j;

    /* renamed from: k, reason: collision with root package name */
    public final t9.p f486223k;

    /* renamed from: l, reason: collision with root package name */
    public final t9.p f486224l;

    /* renamed from: m, reason: collision with root package name */
    public final t9.p f486225m;

    /* renamed from: n, reason: collision with root package name */
    public java.nio.ByteBuffer f486226n;

    /* renamed from: o, reason: collision with root package name */
    public long f486227o;

    /* renamed from: p, reason: collision with root package name */
    public long f486228p;

    /* renamed from: q, reason: collision with root package name */
    public long f486229q;

    /* renamed from: r, reason: collision with root package name */
    public long f486230r;

    /* renamed from: s, reason: collision with root package name */
    public long f486231s;

    /* renamed from: t, reason: collision with root package name */
    public s8.h f486232t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f486233u;

    /* renamed from: v, reason: collision with root package name */
    public int f486234v;

    /* renamed from: w, reason: collision with root package name */
    public long f486235w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f486236x;

    /* renamed from: y, reason: collision with root package name */
    public long f486237y;

    /* renamed from: z, reason: collision with root package name */
    public long f486238z;

    public i(int i17) {
        s8.c cVar = new s8.c();
        this.f486228p = -1L;
        this.f486229q = -9223372036854775807L;
        this.f486230r = -9223372036854775807L;
        this.f486231s = -9223372036854775807L;
        this.f486237y = -1L;
        this.f486238z = -1L;
        this.A = -9223372036854775807L;
        this.f486213a = cVar;
        cVar.f486174d = new s8.g(this, null);
        this.f486216d = (i17 & 1) == 0;
        this.f486214b = new s8.k();
        this.f486215c = new android.util.SparseArray();
        this.f486219g = new t9.p(4);
        this.f486220h = new t9.p(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.f486221i = new t9.p(4);
        this.f486217e = new t9.p(t9.n.f498065a);
        this.f486218f = new t9.p(4);
        this.f486222j = new t9.p();
        this.f486223k = new t9.p();
        this.f486224l = new t9.p(8);
        this.f486225m = new t9.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r9, q8.k r10) {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = r1
        L5:
            if (r2 == 0) goto L3d
            boolean r3 = r8.W
            if (r3 != 0) goto L3d
            s8.d r2 = r8.f486213a
            s8.c r2 = (s8.c) r2
            boolean r2 = r2.a(r9)
            if (r2 == 0) goto L5
            r3 = r9
            q8.b r3 = (q8.b) r3
            long r3 = r3.f442151c
            boolean r5 = r8.f486236x
            if (r5 == 0) goto L28
            r8.f486238z = r3
            long r3 = r8.f486237y
            r10.f442173a = r3
            r8.f486236x = r0
        L26:
            r3 = r1
            goto L3a
        L28:
            boolean r3 = r8.f486233u
            if (r3 == 0) goto L39
            long r3 = r8.f486238z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            r10.f442173a = r3
            r8.f486238z = r5
            goto L26
        L39:
            r3 = r0
        L3a:
            if (r3 == 0) goto L5
            return r1
        L3d:
            if (r2 == 0) goto L40
            goto L41
        L40:
            r0 = -1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.i.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.Y = gVar;
    }

    public final void c(s8.h hVar, long j17) {
        if ("S_TEXT/UTF8".equals(hVar.f486180a)) {
            d(hVar, "%02d:%02d:%02d,%03d", 19, 1000L, f486206a0);
        } else if ("S_TEXT/ASS".equals(hVar.f486180a)) {
            d(hVar, "%01d:%02d:%02d:%02d", 21, f486209d0, f486210e0);
        }
        hVar.O.b(j17, this.M, this.V, 0, hVar.f486186g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.f486222j.s();
    }

    public final void d(s8.h hVar, java.lang.String str, int i17, long j17, byte[] bArr) {
        byte[] bytes;
        t9.p pVar = this.f486223k;
        byte[] bArr2 = pVar.f498073a;
        long j18 = this.G;
        if (j18 == -9223372036854775807L) {
            bytes = bArr;
        } else {
            int i18 = (int) (j18 / 3600000000L);
            long j19 = j18 - ((i18 * 3600) * 1000000);
            int i19 = (int) (j19 / 60000000);
            long j27 = j19 - ((i19 * 60) * 1000000);
            int i27 = (int) (j27 / 1000000);
            bytes = java.lang.String.format(java.util.Locale.US, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf((int) ((j27 - (i27 * 1000000)) / j17))).getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        }
        java.lang.System.arraycopy(bytes, 0, bArr2, i17, bArr.length);
        hVar.O.a(pVar, pVar.f498075c);
        this.V += pVar.f498075c;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        s8.j jVar = new s8.j();
        q8.b bVar = (q8.b) fVar;
        long j17 = bVar.f442150b;
        long j18 = 1024;
        if (j17 != -1 && j17 <= 1024) {
            j18 = j17;
        }
        int i17 = (int) j18;
        t9.p pVar = jVar.f486239a;
        boolean z17 = false;
        bVar.b(pVar.f498073a, 0, 4, false);
        jVar.f486240b = 4;
        for (long n17 = pVar.n(); n17 != 440786851; n17 = ((n17 << 8) & (-256)) | (pVar.f498073a[0] & 255)) {
            int i18 = jVar.f486240b + 1;
            jVar.f486240b = i18;
            if (i18 == i17) {
                return false;
            }
            bVar.b(pVar.f498073a, 0, 1, false);
        }
        long a17 = jVar.a(fVar);
        long j19 = jVar.f486240b;
        if (a17 != Long.MIN_VALUE && (j17 == -1 || j19 + a17 < j17)) {
            while (true) {
                long j27 = jVar.f486240b;
                long j28 = j19 + a17;
                if (j27 < j28) {
                    if (jVar.a(fVar) == Long.MIN_VALUE) {
                        return z17;
                    }
                    long a18 = jVar.a(fVar);
                    if (a18 < 0 || a18 > 2147483647L) {
                        break;
                    }
                    if (a18 != 0) {
                        bVar.a((int) a18, z17);
                        jVar.f486240b = (int) (jVar.f486240b + a18);
                        z17 = false;
                    }
                } else if (j27 == j28) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(q8.f fVar, int i17) {
        t9.p pVar = this.f486219g;
        if (pVar.f498075c >= i17) {
            return;
        }
        if (pVar.a() < i17) {
            byte[] bArr = pVar.f498073a;
            pVar.u(java.util.Arrays.copyOf(bArr, java.lang.Math.max(bArr.length * 2, i17)), pVar.f498075c);
        }
        byte[] bArr2 = pVar.f498073a;
        int i18 = pVar.f498075c;
        ((q8.b) fVar).e(bArr2, i18, i17 - i18, false);
        pVar.v(i17);
    }

    public final int g(q8.f fVar, q8.o oVar, int i17) {
        int d17;
        t9.p pVar = this.f486222j;
        int i18 = pVar.f498075c - pVar.f498074b;
        if (i18 > 0) {
            d17 = java.lang.Math.min(i17, i18);
            oVar.a(pVar, d17);
        } else {
            d17 = oVar.d(fVar, i17, false);
        }
        this.N += d17;
        this.V += d17;
        return d17;
    }

    public final long h(long j17) {
        long j18 = this.f486229q;
        if (j18 != -9223372036854775807L) {
            return t9.d0.h(j17, j18, 1000L);
        }
        throw new m8.x("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void i(q8.f fVar, s8.h hVar, int i17) {
        int i18;
        if ("S_TEXT/UTF8".equals(hVar.f486180a)) {
            j(fVar, Z, i17);
            return;
        }
        if ("S_TEXT/ASS".equals(hVar.f486180a)) {
            j(fVar, f486208c0, i17);
            return;
        }
        q8.o oVar = hVar.O;
        boolean z17 = this.O;
        t9.p pVar = this.f486222j;
        if (!z17) {
            if (hVar.f486184e) {
                this.M &= -1073741825;
                boolean z18 = this.P;
                t9.p pVar2 = this.f486219g;
                if (!z18) {
                    ((q8.b) fVar).e(pVar2.f498073a, 0, 1, false);
                    this.N++;
                    byte b17 = pVar2.f498073a[0];
                    if ((b17 & 128) == 128) {
                        throw new m8.x("Extension bit is set in signal byte");
                    }
                    this.S = b17;
                    this.P = true;
                }
                byte b18 = this.S;
                if ((b18 & 1) == 1) {
                    boolean z19 = (b18 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        t9.p pVar3 = this.f486224l;
                        ((q8.b) fVar).e(pVar3.f498073a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        pVar2.f498073a[0] = (byte) ((z19 ? 128 : 0) | 8);
                        pVar2.w(0);
                        oVar.a(pVar2, 1);
                        this.V++;
                        pVar3.w(0);
                        oVar.a(pVar3, 8);
                        this.V += 8;
                    }
                    if (z19) {
                        if (!this.R) {
                            ((q8.b) fVar).e(pVar2.f498073a, 0, 1, false);
                            this.N++;
                            pVar2.w(0);
                            this.T = pVar2.m();
                            this.R = true;
                        }
                        int i19 = this.T * 4;
                        pVar2.t(i19);
                        ((q8.b) fVar).e(pVar2.f498073a, 0, i19, false);
                        this.N += i19;
                        short s17 = (short) ((this.T / 2) + 1);
                        int i27 = (s17 * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.f486226n;
                        if (byteBuffer == null || byteBuffer.capacity() < i27) {
                            this.f486226n = java.nio.ByteBuffer.allocate(i27);
                        }
                        this.f486226n.position(0);
                        this.f486226n.putShort(s17);
                        int i28 = 0;
                        int i29 = 0;
                        while (true) {
                            i18 = this.T;
                            if (i28 >= i18) {
                                break;
                            }
                            int p17 = pVar2.p();
                            if (i28 % 2 == 0) {
                                this.f486226n.putShort((short) (p17 - i29));
                            } else {
                                this.f486226n.putInt(p17 - i29);
                            }
                            i28++;
                            i29 = p17;
                        }
                        int i37 = (i17 - this.N) - i29;
                        if (i18 % 2 == 1) {
                            this.f486226n.putInt(i37);
                        } else {
                            this.f486226n.putShort((short) i37);
                            this.f486226n.putInt(0);
                        }
                        byte[] array = this.f486226n.array();
                        t9.p pVar4 = this.f486225m;
                        pVar4.u(array, i27);
                        oVar.a(pVar4, i27);
                        this.V += i27;
                    }
                }
            } else {
                byte[] bArr = hVar.f486185f;
                if (bArr != null) {
                    pVar.u(bArr, bArr.length);
                }
            }
            this.O = true;
        }
        int i38 = i17 + pVar.f498075c;
        if (!"V_MPEG4/ISO/AVC".equals(hVar.f486180a) && !"V_MPEGH/ISO/HEVC".equals(hVar.f486180a)) {
            while (true) {
                int i39 = this.N;
                if (i39 >= i38) {
                    break;
                } else {
                    g(fVar, oVar, i38 - i39);
                }
            }
        } else {
            t9.p pVar5 = this.f486218f;
            byte[] bArr2 = pVar5.f498073a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i47 = hVar.P;
            int i48 = 4 - i47;
            while (this.N < i38) {
                int i49 = this.U;
                if (i49 == 0) {
                    int min = java.lang.Math.min(i47, pVar.f498075c - pVar.f498074b);
                    ((q8.b) fVar).e(bArr2, i48 + min, i47 - min, false);
                    if (min > 0) {
                        pVar.b(bArr2, i48, min);
                    }
                    this.N += i47;
                    pVar5.w(0);
                    this.U = pVar5.p();
                    t9.p pVar6 = this.f486217e;
                    pVar6.w(0);
                    oVar.a(pVar6, 4);
                    this.V += 4;
                } else {
                    this.U = i49 - g(fVar, oVar, i49);
                }
            }
        }
        if ("A_VORBIS".equals(hVar.f486180a)) {
            t9.p pVar7 = this.f486220h;
            pVar7.w(0);
            oVar.a(pVar7, 4);
            this.V += 4;
        }
    }

    public final void j(q8.f fVar, byte[] bArr, int i17) {
        int length = bArr.length + i17;
        t9.p pVar = this.f486223k;
        if (pVar.a() < length) {
            pVar.f498073a = java.util.Arrays.copyOf(bArr, length + i17);
        } else {
            java.lang.System.arraycopy(bArr, 0, pVar.f498073a, 0, bArr.length);
        }
        ((q8.b) fVar).e(pVar.f498073a, bArr.length, i17, false);
        pVar.t(length);
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        this.A = -9223372036854775807L;
        this.E = 0;
        s8.c cVar = (s8.c) this.f486213a;
        cVar.f486175e = 0;
        cVar.f486172b.clear();
        s8.k kVar = cVar.f486173c;
        kVar.f486243b = 0;
        kVar.f486244c = 0;
        s8.k kVar2 = this.f486214b;
        kVar2.f486243b = 0;
        kVar2.f486244c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.f486222j.s();
    }
}
