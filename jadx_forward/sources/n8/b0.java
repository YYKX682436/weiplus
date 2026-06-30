package n8;

/* loaded from: classes15.dex */
public class b0 extends y8.c implements t9.j {
    public final n8.m X;
    public final n8.w Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f416998l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f416999p0;

    /* renamed from: p1, reason: collision with root package name */
    public long f417000p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.media.MediaFormat f417001x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f417002x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f417003y0;

    public b0(y8.e eVar, p8.b bVar, boolean z17, android.os.Handler handler, n8.n nVar, n8.d dVar, n8.f... fVarArr) {
        super(1, eVar, bVar, z17);
        this.Y = new n8.w(dVar, fVarArr, new n8.a0(this, null));
        this.X = new n8.m(handler, nVar);
    }

    @Override // y8.c
    public void A(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        super.A(c1601x7dc4e417);
        n8.m mVar = this.X;
        if (mVar.f417070b != null) {
            mVar.f417069a.post(new n8.i(mVar, c1601x7dc4e417));
        }
        this.f417003y0 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff.equals(c1601x7dc4e417.f125613i) ? c1601x7dc4e417.f125627z : 2;
        this.f416998l1 = c1601x7dc4e417.f125625x;
    }

    @Override // y8.c
    public void C(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        int[] iArr;
        int i17;
        android.media.MediaFormat mediaFormat2 = this.f417001x0;
        boolean z17 = mediaFormat2 != null;
        java.lang.String string = z17 ? mediaFormat2.getString("mime") : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff;
        if (z17) {
            mediaFormat = this.f417001x0;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f416999p0 && integer == 6 && (i17 = this.f416998l1) < 6) {
            iArr = new int[i17];
            for (int i18 = 0; i18 < this.f416998l1; i18++) {
                iArr[i18] = i18;
            }
        } else {
            iArr = null;
        }
        try {
            this.Y.a(string, integer, integer2, this.f417003y0, 0, iArr);
        } catch (n8.r e17) {
            throw m8.e.a(e17, this.f406070f);
        }
    }

    @Override // y8.c
    public boolean F(long j17, long j18, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i17, int i18, long j19, boolean z17) {
        if (this.Z && (i18 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i17, false);
            return true;
        }
        n8.w wVar = this.Y;
        if (z17) {
            mediaCodec.releaseOutputBuffer(i17, false);
            this.V.f425139e++;
            if (wVar.M == 1) {
                wVar.M = 2;
            }
            return true;
        }
        try {
            if (!wVar.e(byteBuffer, j19)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i17, false);
            this.V.f425138d++;
            return true;
        } catch (n8.s | n8.v e17) {
            throw m8.e.a(e17, this.f406070f);
        }
    }

    @Override // y8.c
    public void H() {
        try {
            n8.w wVar = this.Y;
            if (!wVar.Y && wVar.g() && wVar.b()) {
                n8.p pVar = wVar.f417101h;
                long d17 = wVar.d();
                pVar.f417080h = pVar.a();
                pVar.f417079g = android.os.SystemClock.elapsedRealtime() * 1000;
                pVar.f417081i = d17;
                pVar.f417073a.stop();
                wVar.f417117x = 0;
                wVar.Y = true;
            }
        } catch (n8.v e17) {
            throw m8.e.a(e17, this.f406070f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (((r3 == null || (r8 = r3.getAudioCapabilities()) == null || !r8.isSampleRateSupported(r5)) ? false : true) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ff, code lost:
    
        if (r10 == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    @Override // y8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int J(y8.e r10, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.b0.J(y8.e, com.google.android.exoplayer2.Format):int");
    }

    @Override // t9.j
    public m8.y a(m8.y yVar) {
        return this.Y.l(yVar);
    }

    @Override // m8.a, m8.g
    public void b(int i17, java.lang.Object obj) {
        n8.w wVar = this.Y;
        if (i17 == 2) {
            float floatValue = ((java.lang.Float) obj).floatValue();
            if (wVar.Q != floatValue) {
                wVar.Q = floatValue;
                wVar.m();
                return;
            }
            return;
        }
        if (i17 != 3) {
            return;
        }
        n8.c cVar = (n8.c) obj;
        if (wVar.f417108o.m149199xb2c87fbf(cVar)) {
            return;
        }
        wVar.f417108o = cVar;
        if (wVar.f417093b0) {
            return;
        }
        wVar.j();
        wVar.f417091a0 = 0;
    }

    @Override // t9.j
    public m8.y d() {
        return this.Y.f417113t;
    }

    @Override // t9.j
    public long e() {
        long a17;
        java.util.LinkedList linkedList;
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        boolean h17 = h();
        n8.w wVar = this.Y;
        if (wVar.g() && wVar.M != 0) {
            int playState = wVar.f417103j.getPlayState();
            n8.p pVar = wVar.f417101h;
            if (playState == 3) {
                long a18 = (pVar.a() * 1000000) / pVar.f417075c;
                if (a18 != 0) {
                    long nanoTime = java.lang.System.nanoTime() / 1000;
                    if (nanoTime - wVar.B >= 30000) {
                        int i17 = wVar.f417118y;
                        long[] jArr = wVar.f417100g;
                        jArr[i17] = a18 - nanoTime;
                        wVar.f417118y = (i17 + 1) % 10;
                        int i18 = wVar.f417119z;
                        if (i18 < 10) {
                            wVar.f417119z = i18 + 1;
                        }
                        wVar.B = nanoTime;
                        wVar.A = 0L;
                        int i19 = 0;
                        while (true) {
                            int i27 = wVar.f417119z;
                            if (i19 >= i27) {
                                break;
                            }
                            wVar.A += jArr[i19] / i27;
                            i19++;
                        }
                    }
                    if (!wVar.h() && nanoTime - wVar.D >= 500000) {
                        boolean e17 = pVar.e();
                        wVar.C = e17;
                        if (e17) {
                            long c17 = pVar.c() / 1000;
                            long b17 = pVar.b();
                            if (c17 < wVar.O) {
                                wVar.C = false;
                            } else if (java.lang.Math.abs(c17 - nanoTime) > 5000000) {
                                if (!wVar.f417109p) {
                                    long j29 = wVar.G / wVar.F;
                                }
                                wVar.d();
                                wVar.C = false;
                            } else if (java.lang.Math.abs(((b17 * 1000000) / wVar.f417104k) - a18) > 5000000) {
                                if (!wVar.f417109p) {
                                    long j37 = wVar.G / wVar.F;
                                }
                                wVar.d();
                                wVar.C = false;
                            }
                        }
                        if (wVar.E != null && !wVar.f417109p) {
                            try {
                                long intValue = (((java.lang.Integer) r3.invoke(wVar.f417103j, null)).intValue() * 1000) - wVar.f417111r;
                                wVar.P = intValue;
                                long max = java.lang.Math.max(intValue, 0L);
                                wVar.P = max;
                                if (max > 5000000) {
                                    wVar.P = 0L;
                                }
                            } catch (java.lang.Exception unused) {
                                wVar.E = null;
                            }
                        }
                        wVar.D = nanoTime;
                    }
                }
            }
            long nanoTime2 = java.lang.System.nanoTime() / 1000;
            if (wVar.C) {
                a17 = ((pVar.b() + (((nanoTime2 - (pVar.c() / 1000)) * wVar.f417104k) / 1000000)) * 1000000) / wVar.f417104k;
            } else {
                a17 = wVar.f417119z == 0 ? (pVar.a() * 1000000) / pVar.f417075c : nanoTime2 + wVar.A;
                if (!h17) {
                    a17 -= wVar.P;
                }
            }
            long j38 = wVar.N;
            while (true) {
                linkedList = wVar.f417102i;
                if (linkedList.isEmpty() || a17 < ((n8.u) linkedList.getFirst()).f417088c) {
                    break;
                }
                n8.u uVar = (n8.u) linkedList.remove();
                wVar.f417113t = uVar.f417086a;
                wVar.f417115v = uVar.f417088c;
                wVar.f417114u = uVar.f417087b - wVar.N;
            }
            if (wVar.f417113t.f406212a == 1.0f) {
                j19 = (a17 + wVar.f417114u) - wVar.f417115v;
            } else {
                if (linkedList.isEmpty()) {
                    n8.e0 e0Var = wVar.f417094c;
                    long j39 = e0Var.f417050k;
                    if (j39 >= 1024) {
                        j17 = wVar.f417114u;
                        j18 = t9.d0.h(a17 - wVar.f417115v, e0Var.f417049j, j39);
                        j19 = j18 + j17;
                    }
                }
                j17 = wVar.f417114u;
                j18 = (long) (wVar.f417113t.f406212a * (a17 - wVar.f417115v));
                j19 = j18 + j17;
            }
            j27 = j38 + j19;
            j28 = Long.MIN_VALUE;
        } else {
            j28 = Long.MIN_VALUE;
            j27 = Long.MIN_VALUE;
        }
        if (j27 != j28) {
            if (!this.f417002x1) {
                j27 = java.lang.Math.max(this.f417000p1, j27);
            }
            this.f417000p1 = j27;
            this.f417002x1 = false;
        }
        return this.f417000p1;
    }

    @Override // y8.c, m8.b0
    public boolean h() {
        if (!this.T) {
            return false;
        }
        n8.w wVar = this.Y;
        return !wVar.g() || (wVar.Y && !wVar.f());
    }

    @Override // y8.c, m8.b0
    /* renamed from: isReady */
    public boolean mo134934x7b5e8699() {
        return this.Y.f() || super.mo134934x7b5e8699();
    }

    @Override // m8.a, m8.b0
    public t9.j j() {
        return this;
    }

    @Override // m8.a
    public void l() {
        try {
            n8.w wVar = this.Y;
            wVar.j();
            for (n8.f fVar : wVar.f417096d) {
                fVar.mo149202x6761d4f();
            }
            wVar.f417091a0 = 0;
            wVar.Z = false;
            try {
                this.f541340u = null;
                G();
                synchronized (this.V) {
                }
                this.X.a(this.V);
            } catch (java.lang.Throwable th6) {
                synchronized (this.V) {
                    this.X.a(this.V);
                    throw th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            try {
                this.f541340u = null;
                G();
                synchronized (this.V) {
                    this.X.a(this.V);
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                synchronized (this.V) {
                    this.X.a(this.V);
                    throw th8;
                }
            }
        }
    }

    @Override // m8.a
    public void m(boolean z17) {
        o8.f fVar = new o8.f();
        this.V = fVar;
        n8.m mVar = this.X;
        if (mVar.f417070b != null) {
            mVar.f417069a.post(new n8.g(mVar, fVar));
        }
        int i17 = this.f406069e.f406087a;
        n8.w wVar = this.Y;
        if (i17 == 0) {
            if (wVar.f417093b0) {
                wVar.f417093b0 = false;
                wVar.f417091a0 = 0;
                wVar.j();
                return;
            }
            return;
        }
        wVar.getClass();
        t9.a.d(t9.d0.f498031a >= 21);
        if (wVar.f417093b0 && wVar.f417091a0 == i17) {
            return;
        }
        wVar.f417093b0 = true;
        wVar.f417091a0 = i17;
        wVar.j();
    }

    @Override // y8.c, m8.a
    public void n(long j17, boolean z17) {
        super.n(j17, z17);
        this.Y.j();
        this.f417000p1 = j17;
        this.f417002x1 = true;
    }

    @Override // m8.a
    public void o() {
        n8.w wVar = this.Y;
        wVar.Z = true;
        if (wVar.g()) {
            wVar.O = java.lang.System.nanoTime() / 1000;
            wVar.f417103j.play();
        }
    }

    @Override // m8.a
    public void p() {
        n8.w wVar = this.Y;
        wVar.Z = false;
        if (wVar.g()) {
            wVar.A = 0L;
            wVar.f417119z = 0;
            wVar.f417118y = 0;
            wVar.B = 0L;
            wVar.C = false;
            wVar.D = 0L;
            n8.p pVar = wVar.f417101h;
            if (pVar.f417079g != -9223372036854775807L) {
                return;
            }
            pVar.f417073a.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // y8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(y8.a r5, android.media.MediaCodec r6, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 r7, android.media.MediaCrypto r8) {
        /*
            r4 = this;
            java.lang.String r5 = r5.f541323a
            int r0 = t9.d0.f498031a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L38
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L38
            java.lang.String r5 = "samsung"
            java.lang.String r0 = t9.d0.f498033c
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L38
            java.lang.String r5 = t9.d0.f498032b
            java.lang.String r0 = "zeroflte"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = "herolte"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = "heroqlte"
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L38
        L36:
            r5 = 1
            goto L39
        L38:
            r5 = r2
        L39:
            r4.f416999p0 = r5
            boolean r5 = r4.Z
            r0 = 0
            if (r5 == 0) goto L5a
            android.media.MediaFormat r5 = r7.o()
            r4.f417001x0 = r5
            java.lang.String r1 = "audio/raw"
            java.lang.String r3 = "mime"
            r5.setString(r3, r1)
            android.media.MediaFormat r5 = r4.f417001x0
            r6.configure(r5, r0, r8, r2)
            android.media.MediaFormat r5 = r4.f417001x0
            java.lang.String r6 = r7.f125613i
            r5.setString(r3, r6)
            goto L63
        L5a:
            android.media.MediaFormat r5 = r7.o()
            r6.configure(r5, r0, r8, r2)
            r4.f417001x0 = r0
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.b0.t(y8.a, android.media.MediaCodec, com.google.android.exoplayer2.Format, android.media.MediaCrypto):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // y8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y8.a w(y8.e r5, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = r6.f125613i
            n8.w r1 = r4.Y
            n8.d r1 = r1.f417090a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            int r0 = n8.w.c(r0)
            int[] r1 = r1.f417015a
            int r0 = java.util.Arrays.binarySearch(r1, r0)
            if (r0 < 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r3
        L1e:
            if (r0 == 0) goto L2d
            r0 = r5
            y8.d r0 = (y8.d) r0
            r0.getClass()
            y8.a r0 = y8.l.f541351a
            if (r0 == 0) goto L2d
            r4.Z = r2
            return r0
        L2d:
            r4.Z = r3
            y8.a r5 = super.w(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.b0.w(y8.e, com.google.android.exoplayer2.Format, boolean):y8.a");
    }

    @Override // y8.c
    public void y(java.lang.String str, long j17, long j18) {
        n8.m mVar = this.X;
        if (mVar.f417070b != null) {
            mVar.f417069a.post(new n8.h(mVar, str, j17, j18));
        }
    }
}
