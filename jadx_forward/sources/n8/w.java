package n8;

/* loaded from: classes15.dex */
public final class w {
    public long A;
    public long B;
    public boolean C;
    public long D;
    public java.lang.reflect.Method E;
    public int F;
    public long G;
    public long H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f417089J;
    public long K;
    public int L;
    public int M;
    public long N;
    public long O;
    public long P;
    public float Q;
    public n8.f[] R;
    public java.nio.ByteBuffer[] S;
    public java.nio.ByteBuffer T;
    public java.nio.ByteBuffer U;
    public byte[] V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final n8.d f417090a;

    /* renamed from: a0, reason: collision with root package name */
    public int f417091a0;

    /* renamed from: b, reason: collision with root package name */
    public final n8.x f417092b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f417093b0;

    /* renamed from: c, reason: collision with root package name */
    public final n8.e0 f417094c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f417095c0;

    /* renamed from: d, reason: collision with root package name */
    public final n8.f[] f417096d;

    /* renamed from: d0, reason: collision with root package name */
    public long f417097d0;

    /* renamed from: e, reason: collision with root package name */
    public final n8.t f417098e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.ConditionVariable f417099f = new android.os.ConditionVariable(true);

    /* renamed from: g, reason: collision with root package name */
    public final long[] f417100g;

    /* renamed from: h, reason: collision with root package name */
    public final n8.p f417101h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f417102i;

    /* renamed from: j, reason: collision with root package name */
    public android.media.AudioTrack f417103j;

    /* renamed from: k, reason: collision with root package name */
    public int f417104k;

    /* renamed from: l, reason: collision with root package name */
    public int f417105l;

    /* renamed from: m, reason: collision with root package name */
    public int f417106m;

    /* renamed from: n, reason: collision with root package name */
    public int f417107n;

    /* renamed from: o, reason: collision with root package name */
    public n8.c f417108o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f417109p;

    /* renamed from: q, reason: collision with root package name */
    public int f417110q;

    /* renamed from: r, reason: collision with root package name */
    public long f417111r;

    /* renamed from: s, reason: collision with root package name */
    public m8.y f417112s;

    /* renamed from: t, reason: collision with root package name */
    public m8.y f417113t;

    /* renamed from: u, reason: collision with root package name */
    public long f417114u;

    /* renamed from: v, reason: collision with root package name */
    public long f417115v;

    /* renamed from: w, reason: collision with root package name */
    public java.nio.ByteBuffer f417116w;

    /* renamed from: x, reason: collision with root package name */
    public int f417117x;

    /* renamed from: y, reason: collision with root package name */
    public int f417118y;

    /* renamed from: z, reason: collision with root package name */
    public int f417119z;

    public w(n8.d dVar, n8.f[] fVarArr, n8.t tVar) {
        this.f417090a = dVar;
        this.f417098e = tVar;
        if (t9.d0.f498031a >= 18) {
            try {
                this.E = android.media.AudioTrack.class.getMethod("getLatency", null);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        if (t9.d0.f498031a >= 19) {
            this.f417101h = new n8.q();
        } else {
            this.f417101h = new n8.p(null);
        }
        n8.x xVar = new n8.x();
        this.f417092b = xVar;
        n8.e0 e0Var = new n8.e0();
        this.f417094c = e0Var;
        n8.f[] fVarArr2 = new n8.f[fVarArr.length + 3];
        this.f417096d = fVarArr2;
        fVarArr2[0] = new n8.c0();
        fVarArr2[1] = xVar;
        java.lang.System.arraycopy(fVarArr, 0, fVarArr2, 2, fVarArr.length);
        fVarArr2[fVarArr.length + 2] = e0Var;
        this.f417100g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.f417108o = n8.c.f417004d;
        this.f417091a0 = 0;
        this.f417113t = m8.y.f406211d;
        this.X = -1;
        this.R = new n8.f[0];
        this.S = new java.nio.ByteBuffer[0];
        this.f417102i = new java.util.LinkedList();
    }

    public static int c(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba)) {
                    c17 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448)) {
                    c17 = 1;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e)) {
                    c17 = 2;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54252xb7cd49a1)) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return 7;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    public void a(java.lang.String str, int i17, int i18, int i19, int i27, int[] iArr) {
        int i28;
        boolean z17;
        int i29;
        int i37;
        int i38;
        boolean z18 = !com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff.equals(str);
        int c17 = z18 ? c(str) : i19;
        if (z18) {
            i28 = c17;
            z17 = false;
            i29 = i17;
        } else {
            int i39 = t9.d0.f498031a;
            if (i19 == Integer.MIN_VALUE) {
                i38 = i17 * 3;
            } else if (i19 == 1073741824) {
                i38 = i17 * 4;
            } else if (i19 == 2) {
                i38 = i17 * 2;
            } else {
                if (i19 != 3) {
                    throw new java.lang.IllegalArgumentException();
                }
                i38 = i17;
            }
            this.F = i38;
            this.f417092b.f417122d = iArr;
            i28 = c17;
            z17 = false;
            i29 = i17;
            for (n8.f fVar : this.f417096d) {
                try {
                    z17 |= fVar.g(i18, i29, i28);
                    if (fVar.a()) {
                        i29 = fVar.c();
                        i28 = fVar.d();
                    }
                } catch (n8.e e17) {
                    throw new n8.r(e17);
                }
            }
            if (z17) {
                k();
            }
        }
        switch (i29) {
            case 1:
                i37 = 4;
                break;
            case 2:
                i37 = 12;
                break;
            case 3:
                i37 = 28;
                break;
            case 4:
                i37 = 204;
                break;
            case 5:
                i37 = 220;
                break;
            case 6:
                i37 = 252;
                break;
            case 7:
                i37 = eh1.b.f69673x366c91de;
                break;
            case 8:
                i37 = m8.b.f406076a;
                break;
            default:
                throw new n8.r("Unsupported channel count: " + i29);
        }
        int i47 = t9.d0.f498031a;
        if (i47 <= 23 && "foster".equals(t9.d0.f498032b) && "NVIDIA".equals(t9.d0.f498033c)) {
            if (i29 == 3 || i29 == 5) {
                i37 = 252;
            } else if (i29 == 7) {
                i37 = m8.b.f406076a;
            }
        }
        int i48 = (i47 <= 25 && "fugu".equals(t9.d0.f498032b) && z18 && i29 == 1) ? 12 : i37;
        if (!z17 && g() && this.f417106m == i28 && this.f417104k == i18 && this.f417105l == i48) {
            return;
        }
        j();
        this.f417106m = i28;
        this.f417109p = z18;
        this.f417104k = i18;
        this.f417105l = i48;
        if (!z18) {
            i28 = 2;
        }
        this.f417107n = i28;
        this.I = i29 * 2;
        if (i27 != 0) {
            this.f417110q = i27;
        } else if (!z18) {
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(i18, i48, i28);
            t9.a.d(minBufferSize != -2);
            int i49 = minBufferSize * 4;
            int i57 = this.f417104k;
            int i58 = this.I;
            int i59 = ((int) ((250000 * i57) / 1000000)) * i58;
            int max = (int) java.lang.Math.max(minBufferSize, ((750000 * i57) / 1000000) * i58);
            if (i49 < i59) {
                i49 = i59;
            } else if (i49 > max) {
                i49 = max;
            }
            this.f417110q = i49;
        } else if (i28 == 5 || i28 == 6) {
            this.f417110q = 20480;
        } else {
            this.f417110q = 49152;
        }
        this.f417111r = z18 ? -9223372036854775807L : ((this.f417110q / this.I) * 1000000) / this.f417104k;
        l(this.f417113t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f417109p
            if (r0 == 0) goto Lf
            n8.f[] r0 = r9.R
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.X = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.X
            n8.f[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.e()
        L28:
            r9.i(r7)
            boolean r0 = r4.h()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.X
            int r0 = r0 + r1
            r9.X = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L44
            r9.n(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.X = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.w.b():boolean");
    }

    public final long d() {
        return this.f417109p ? this.K : this.f417089J / this.I;
    }

    public boolean e(java.nio.ByteBuffer byteBuffer, long j17) {
        int i17;
        int i18;
        int i19;
        android.media.AudioTrack audioTrack;
        int i27;
        android.media.AudioAttributes audioAttributes;
        java.nio.ByteBuffer byteBuffer2 = this.T;
        t9.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean g17 = g();
        n8.p pVar = this.f417101h;
        n8.t tVar = this.f417098e;
        if (!g17) {
            this.f417099f.block();
            if (t9.d0.f498031a >= 21) {
                if (this.f417093b0) {
                    audioAttributes = new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
                } else {
                    n8.c cVar = this.f417108o;
                    if (cVar.f417007c == null) {
                        cVar.f417007c = new android.media.AudioAttributes.Builder().setContentType(cVar.f417005a).setFlags(0).setUsage(cVar.f417006b).build();
                    }
                    audioAttributes = cVar.f417007c;
                }
                android.media.AudioAttributes audioAttributes2 = audioAttributes;
                android.media.AudioFormat build = new android.media.AudioFormat.Builder().setChannelMask(this.f417105l).setEncoding(this.f417107n).setSampleRate(this.f417104k).build();
                int i28 = this.f417091a0;
                audioTrack = new android.media.AudioTrack(audioAttributes2, build, this.f417110q, 1, i28 != 0 ? i28 : 0);
            } else {
                int i29 = this.f417108o.f417006b;
                if (i29 != 13) {
                    switch (i29) {
                        case 2:
                            i19 = 0;
                            break;
                        case 3:
                            i27 = 8;
                            i19 = i27;
                            break;
                        case 4:
                            i27 = 4;
                            i19 = i27;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i27 = 5;
                            i19 = i27;
                            break;
                        case 6:
                            i27 = 2;
                            i19 = i27;
                            break;
                        default:
                            i27 = 3;
                            i19 = i27;
                            break;
                    }
                } else {
                    i19 = 1;
                }
                audioTrack = this.f417091a0 == 0 ? new android.media.AudioTrack(i19, this.f417104k, this.f417105l, this.f417107n, this.f417110q, 1) : new android.media.AudioTrack(i19, this.f417104k, this.f417105l, this.f417107n, this.f417110q, 1, this.f417091a0);
            }
            int state = audioTrack.getState();
            if (state != 1) {
                try {
                    audioTrack.release();
                } catch (java.lang.Exception unused) {
                }
                throw new n8.s(state, this.f417104k, this.f417105l, this.f417110q);
            }
            this.f417103j = audioTrack;
            int audioSessionId = audioTrack.getAudioSessionId();
            if (this.f417091a0 != audioSessionId) {
                this.f417091a0 = audioSessionId;
                n8.m mVar = ((n8.a0) tVar).f416997a.X;
                if (mVar.f417070b != null) {
                    mVar.f417069a.post(new n8.l(mVar, audioSessionId));
                }
            }
            pVar.d(this.f417103j, h());
            m();
            this.f417095c0 = false;
            if (this.Z) {
                this.Z = true;
                if (g()) {
                    this.O = java.lang.System.nanoTime() / 1000;
                    this.f417103j.play();
                }
            }
        }
        if (h()) {
            if (this.f417103j.getPlayState() == 2) {
                this.f417095c0 = false;
                return false;
            }
            if (this.f417103j.getPlayState() == 1 && pVar.a() != 0) {
                return false;
            }
        }
        boolean z17 = this.f417095c0;
        boolean f17 = f();
        this.f417095c0 = f17;
        if (z17 && !f17 && this.f417103j.getPlayState() != 1) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f417097d0;
            int i37 = this.f417110q;
            long b17 = m8.b.b(this.f417111r);
            n8.m mVar2 = ((n8.a0) tVar).f416997a.X;
            if (mVar2.f417070b != null) {
                mVar2.f417069a.post(new n8.j(mVar2, i37, b17, elapsedRealtime));
            }
        }
        if (this.T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f417109p && this.L == 0) {
                int i38 = this.f417107n;
                if (i38 == 7 || i38 == 8) {
                    int position = byteBuffer.position();
                    i18 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i38 == 5) {
                    i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de;
                } else {
                    if (i38 != 6) {
                        throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i38);
                    }
                    i18 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? n8.a.f416991a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                }
                this.L = i18;
            }
            if (this.f417112s != null) {
                if (!b()) {
                    return false;
                }
                this.f417102i.add(new n8.u(this.f417112s, java.lang.Math.max(0L, j17), (d() * 1000000) / this.f417104k, null));
                this.f417112s = null;
                k();
            }
            int i39 = this.M;
            if (i39 == 0) {
                this.N = java.lang.Math.max(0L, j17);
                this.M = 1;
            } else {
                long j18 = this.N + (((this.f417109p ? this.H : this.G / this.F) * 1000000) / this.f417104k);
                if (i39 != 1 || java.lang.Math.abs(j18 - j17) <= 200000) {
                    i17 = 2;
                } else {
                    i17 = 2;
                    this.M = 2;
                }
                if (this.M == i17) {
                    this.N += j17 - j18;
                    this.M = 1;
                    n8.b0 b0Var = ((n8.a0) tVar).f416997a;
                    b0Var.getClass();
                    b0Var.f417002x1 = true;
                }
            }
            if (this.f417109p) {
                this.H += this.L;
            } else {
                this.G += byteBuffer.remaining();
            }
            this.T = byteBuffer;
        }
        if (this.f417109p) {
            n(this.T, j17);
        } else {
            i(j17);
        }
        if (this.T.hasRemaining()) {
            return false;
        }
        this.T = null;
        return true;
    }

    public boolean f() {
        if (!g()) {
            return false;
        }
        if (d() <= this.f417101h.a()) {
            if (!(h() && this.f417103j.getPlayState() == 2 && this.f417103j.getPlaybackHeadPosition() == 0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.f417103j != null;
    }

    public final boolean h() {
        int i17;
        return t9.d0.f498031a < 23 && ((i17 = this.f417107n) == 5 || i17 == 6);
    }

    public final void i(long j17) {
        java.nio.ByteBuffer byteBuffer;
        int length = this.R.length;
        int i17 = length;
        while (i17 >= 0) {
            if (i17 > 0) {
                byteBuffer = this.S[i17 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = n8.f.f417052a;
                }
            }
            if (i17 == length) {
                n(byteBuffer, j17);
            } else {
                n8.f fVar = this.R[i17];
                fVar.b(byteBuffer);
                java.nio.ByteBuffer f17 = fVar.f();
                this.S[i17] = f17;
                if (f17.hasRemaining()) {
                    i17++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i17--;
            }
        }
    }

    public void j() {
        if (g()) {
            this.G = 0L;
            this.H = 0L;
            this.f417089J = 0L;
            this.K = 0L;
            this.L = 0;
            m8.y yVar = this.f417112s;
            java.util.LinkedList linkedList = this.f417102i;
            if (yVar != null) {
                this.f417113t = yVar;
                this.f417112s = null;
            } else if (!linkedList.isEmpty()) {
                this.f417113t = ((n8.u) linkedList.getLast()).f417086a;
            }
            linkedList.clear();
            this.f417114u = 0L;
            this.f417115v = 0L;
            this.T = null;
            this.U = null;
            int i17 = 0;
            while (true) {
                n8.f[] fVarArr = this.R;
                if (i17 >= fVarArr.length) {
                    break;
                }
                n8.f fVar = fVarArr[i17];
                fVar.mo149201x5d03b04();
                this.S[i17] = fVar.f();
                i17++;
            }
            this.Y = false;
            this.X = -1;
            this.f417116w = null;
            this.f417117x = 0;
            this.M = 0;
            this.P = 0L;
            this.A = 0L;
            this.f417119z = 0;
            this.f417118y = 0;
            this.B = 0L;
            this.C = false;
            this.D = 0L;
            if (this.f417103j.getPlayState() == 3) {
                this.f417103j.pause();
            }
            android.media.AudioTrack audioTrack = this.f417103j;
            this.f417103j = null;
            this.f417101h.d(null, false);
            this.f417099f.close();
            new n8.o(this, audioTrack).start();
        }
    }

    public final void k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (n8.f fVar : this.f417096d) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.mo149201x5d03b04();
            }
        }
        int size = arrayList.size();
        this.R = (n8.f[]) arrayList.toArray(new n8.f[size]);
        this.S = new java.nio.ByteBuffer[size];
        for (int i17 = 0; i17 < size; i17++) {
            n8.f fVar2 = this.R[i17];
            fVar2.mo149201x5d03b04();
            this.S[i17] = fVar2.f();
        }
    }

    public m8.y l(m8.y yVar) {
        if (this.f417109p) {
            m8.y yVar2 = m8.y.f406211d;
            this.f417113t = yVar2;
            return yVar2;
        }
        float f17 = yVar.f406212a;
        n8.e0 e0Var = this.f417094c;
        e0Var.getClass();
        int i17 = t9.d0.f498031a;
        float max = java.lang.Math.max(0.1f, java.lang.Math.min(f17, 8.0f));
        e0Var.f417044e = max;
        float f18 = yVar.f406213b;
        e0Var.f417045f = java.lang.Math.max(0.1f, java.lang.Math.min(f18, 8.0f));
        m8.y yVar3 = new m8.y(max, f18);
        m8.y yVar4 = this.f417112s;
        if (yVar4 == null) {
            java.util.LinkedList linkedList = this.f417102i;
            yVar4 = !linkedList.isEmpty() ? ((n8.u) linkedList.getLast()).f417086a : this.f417113t;
        }
        if (!yVar3.m146936xb2c87fbf(yVar4)) {
            if (g()) {
                this.f417112s = yVar3;
            } else {
                this.f417113t = yVar3;
            }
        }
        return this.f417113t;
    }

    public final void m() {
        if (g()) {
            if (t9.d0.f498031a >= 21) {
                this.f417103j.setVolume(this.Q);
                return;
            }
            android.media.AudioTrack audioTrack = this.f417103j;
            float f17 = this.Q;
            audioTrack.setStereoVolume(f17, f17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r11 < r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.nio.ByteBuffer r9, long r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.w.n(java.nio.ByteBuffer, long):boolean");
    }
}
