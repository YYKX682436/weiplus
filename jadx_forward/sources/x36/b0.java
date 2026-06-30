package x36;

/* loaded from: classes16.dex */
public final class b0 implements x36.m {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f533187d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f533188e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.h0 f533189f;

    public b0(x36.h0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f533189f = source;
        this.f533187d = new x36.k();
    }

    @Override // x36.m
    public java.lang.String A0(long j17) {
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j17).toString());
        }
        long j18 = j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? Long.MAX_VALUE : j17 + 1;
        byte b17 = (byte) 10;
        long a17 = a(b17, 0L, j18);
        x36.k kVar = this.f533187d;
        if (a17 != -1) {
            return y36.a.a(kVar, a17);
        }
        if (j18 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && d(j18) && kVar.c(j18 - 1) == ((byte) 13) && d(1 + j18) && kVar.c(j18) == b17) {
            return y36.a.a(kVar, j18);
        }
        x36.k kVar2 = new x36.k();
        x36.k kVar3 = this.f533187d;
        kVar3.b(kVar2, 0L, java.lang.Math.min(32, kVar3.f533227e));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(kVar.f533227e, j17) + " content=" + kVar2.l().m() + "…");
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        if (!(!this.f533188e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f533187d;
        if (kVar.f533227e == 0) {
            if (this.f533189f.B(kVar, 8192) == -1) {
                return -1L;
            }
        }
        return kVar.B(sink, java.lang.Math.min(j17, kVar.f533227e));
    }

    @Override // x36.m
    public x36.o H(long j17) {
        c1(j17);
        return this.f533187d.H(j17);
    }

    @Override // x36.m
    public java.lang.String L0() {
        return A0(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    @Override // x36.m
    public long P0(x36.f0 sink) {
        x36.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        long j17 = 0;
        while (true) {
            x36.h0 h0Var = this.f533189f;
            kVar = this.f533187d;
            if (h0Var.B(kVar, 8192) == -1) {
                break;
            }
            long a17 = kVar.a();
            if (a17 > 0) {
                j17 += a17;
                sink.U(kVar, a17);
            }
        }
        long j18 = kVar.f533227e;
        if (j18 <= 0) {
            return j17;
        }
        long j19 = j17 + j18;
        sink.U(kVar, j18);
        return j19;
    }

    public long a(byte b17, long j17, long j18) {
        if (!(!this.f533188e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (!(0 <= j17 && j18 >= j17)) {
            throw new java.lang.IllegalArgumentException(("fromIndex=" + j17 + " toIndex=" + j18).toString());
        }
        while (j17 < j18) {
            long f17 = this.f533187d.f(b17, j17, j18);
            if (f17 != -1) {
                return f17;
            }
            x36.k kVar = this.f533187d;
            long j19 = kVar.f533227e;
            if (j19 >= j18) {
                return -1L;
            }
            if (this.f533189f.B(kVar, 8192) == -1) {
                return -1L;
            }
            j17 = java.lang.Math.max(j17, j19);
        }
        return -1L;
    }

    public int b() {
        c1(4L);
        int mo174957x40655679 = this.f533187d.mo174957x40655679();
        return ((mo174957x40655679 & 255) << 24) | (((-16777216) & mo174957x40655679) >>> 24) | ((16711680 & mo174957x40655679) >>> 8) | ((65280 & mo174957x40655679) << 8);
    }

    @Override // x36.m
    public void c1(long j17) {
        if (!d(j17)) {
            throw new java.io.EOFException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.f533188e) {
            return;
        }
        this.f533188e = true;
        this.f533189f.close();
        x36.k kVar = this.f533187d;
        kVar.mo174960x35e57f(kVar.f533227e);
    }

    @Override // x36.m
    public boolean d(long j17) {
        x36.k kVar;
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        if (!(!this.f533188e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        do {
            kVar = this.f533187d;
            if (kVar.f533227e >= j17) {
                return true;
            }
        } while (this.f533189f.B(kVar, 8192) != -1);
        return false;
    }

    @Override // x36.m
    /* renamed from: getBuffer */
    public x36.k mo174954x12f2b736() {
        return this.f533187d;
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f533189f.h();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f533188e;
    }

    @Override // x36.m
    public void k1(x36.k sink, long j17) {
        x36.k kVar = this.f533187d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        try {
            c1(j17);
            kVar.k1(sink, j17);
        } catch (java.io.EOFException e17) {
            sink.C(kVar);
            throw e17;
        }
    }

    @Override // x36.m
    public x36.k m() {
        return this.f533187d;
    }

    @Override // x36.m
    public boolean o1() {
        if (!(!this.f533188e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        x36.k kVar = this.f533187d;
        if (kVar.o1()) {
            if (this.f533189f.B(kVar, 8192) == -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r26.a.a(16);
        r26.a.a(16);
        r1 = java.lang.Integer.toString(r8, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9] or '-' character but was 0x".concat(r1));
     */
    @Override // x36.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long p1() {
        /*
            r11 = this;
            r0 = 1
            r11.c1(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.d(r6)
            x36.k r9 = r11.f533187d
            if (r8 == 0) goto L4c
            byte r8 = r9.c(r4)
            r10 = 48
            byte r10 = (byte) r10
            if (r8 < r10) goto L20
            r10 = 57
            byte r10 = (byte) r10
            if (r8 <= r10) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L4c
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            r26.a.a(r1)
            r26.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4c:
            long r0 = r9.p1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.b0.p1():long");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer sink) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        x36.k kVar = this.f533187d;
        if (kVar.f533227e == 0) {
            if (this.f533189f.B(kVar, 8192) == -1) {
                return -1;
            }
        }
        return kVar.read(sink);
    }

    @Override // x36.m
    /* renamed from: readByte */
    public byte mo174955xcc4273be() {
        c1(1L);
        return this.f533187d.mo174955xcc4273be();
    }

    @Override // x36.m
    /* renamed from: readFully */
    public void mo174956xbc4273d4(byte[] sink) {
        x36.k kVar = this.f533187d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        try {
            c1(sink.length);
            kVar.mo174956xbc4273d4(sink);
        } catch (java.io.EOFException e17) {
            int i17 = 0;
            while (true) {
                long j17 = kVar.f533227e;
                if (j17 <= 0) {
                    throw e17;
                }
                int i18 = kVar.i(sink, i17, (int) j17);
                if (i18 == -1) {
                    throw new java.lang.AssertionError();
                }
                i17 += i18;
            }
        }
    }

    @Override // x36.m
    /* renamed from: readInt */
    public int mo174957x40655679() {
        c1(4L);
        return this.f533187d.mo174957x40655679();
    }

    @Override // x36.m
    /* renamed from: readLong */
    public long mo174958xcc46d932() {
        c1(8L);
        return this.f533187d.mo174958xcc46d932();
    }

    @Override // x36.m
    /* renamed from: readShort */
    public short mo174959xbcf3c886() {
        c1(2L);
        return this.f533187d.mo174959xbcf3c886();
    }

    @Override // x36.m
    /* renamed from: skip */
    public void mo174960x35e57f(long j17) {
        if (!(!this.f533188e)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (j17 > 0) {
            x36.k kVar = this.f533187d;
            if (kVar.f533227e == 0) {
                if (this.f533189f.B(kVar, 8192) == -1) {
                    throw new java.io.EOFException();
                }
            }
            long min = java.lang.Math.min(j17, kVar.f533227e);
            kVar.mo174960x35e57f(min);
            j17 -= min;
        }
    }

    @Override // x36.m
    public long t0() {
        x36.k kVar;
        byte c17;
        c1(1L);
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            boolean d17 = d(i18);
            kVar = this.f533187d;
            if (!d17) {
                break;
            }
            c17 = kVar.c(i17);
            if ((c17 < ((byte) 48) || c17 > ((byte) 57)) && ((c17 < ((byte) 97) || c17 > ((byte) 102)) && (c17 < ((byte) 65) || c17 > ((byte) 70)))) {
                break;
            }
            i17 = i18;
        }
        if (i17 == 0) {
            r26.a.a(16);
            r26.a.a(16);
            java.lang.String num = java.lang.Integer.toString(c17, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        return kVar.t0();
    }

    /* renamed from: toString */
    public java.lang.String m174961x9616526c() {
        return "buffer(" + this.f533189f + ')';
    }
}
