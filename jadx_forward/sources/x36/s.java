package x36;

/* loaded from: classes16.dex */
public final class s implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public byte f533236d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.b0 f533237e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.Inflater f533238f;

    /* renamed from: g, reason: collision with root package name */
    public final x36.t f533239g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.zip.CRC32 f533240h;

    public s(x36.h0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        x36.b0 b0Var = new x36.b0(source);
        this.f533237e = b0Var;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.f533238f = inflater;
        this.f533239g = new x36.t(b0Var, inflater);
        this.f533240h = new java.util.zip.CRC32();
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        java.util.zip.CRC32 crc32;
        x36.b0 b0Var;
        x36.k kVar;
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        byte b17 = 1;
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        if (j17 == 0) {
            return 0L;
        }
        byte b18 = this.f533236d;
        java.util.zip.CRC32 crc322 = this.f533240h;
        x36.b0 b0Var2 = this.f533237e;
        if (b18 == 0) {
            b0Var2.c1(10L);
            x36.k kVar2 = b0Var2.f533187d;
            byte c17 = kVar2.c(3L);
            boolean z17 = ((c17 >> 1) & 1) == 1;
            if (z17) {
                b(b0Var2.f533187d, 0L, 10L);
            }
            a("ID1ID2", 8075, b0Var2.mo174959xbcf3c886());
            b0Var2.mo174960x35e57f(8L);
            if (((c17 >> 2) & 1) == 1) {
                b0Var2.c1(2L);
                if (z17) {
                    b(b0Var2.f533187d, 0L, 2L);
                }
                int mo174959xbcf3c886 = kVar2.mo174959xbcf3c886() & 65535;
                long j19 = (short) (((mo174959xbcf3c886 & 255) << 8) | ((mo174959xbcf3c886 & 65280) >>> 8));
                b0Var2.c1(j19);
                if (z17) {
                    b(b0Var2.f533187d, 0L, j19);
                    j18 = j19;
                } else {
                    j18 = j19;
                }
                b0Var2.mo174960x35e57f(j18);
            }
            if (((c17 >> 3) & 1) == 1) {
                long a17 = b0Var2.a((byte) 0, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                if (a17 == -1) {
                    throw new java.io.EOFException();
                }
                if (z17) {
                    b(b0Var2.f533187d, 0L, a17 + 1);
                }
                b0Var2.mo174960x35e57f(a17 + 1);
            }
            if (((c17 >> 4) & 1) == 1) {
                kVar = kVar2;
                crc32 = crc322;
                long a18 = b0Var2.a((byte) 0, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                if (a18 == -1) {
                    throw new java.io.EOFException();
                }
                if (z17) {
                    b0Var = b0Var2;
                    b17 = 1;
                    b(b0Var2.f533187d, 0L, a18 + 1);
                } else {
                    b0Var = b0Var2;
                    b17 = 1;
                }
                b0Var.mo174960x35e57f(a18 + 1);
            } else {
                kVar = kVar2;
                crc32 = crc322;
                b0Var = b0Var2;
            }
            if (z17) {
                b0Var.c1(2L);
                int mo174959xbcf3c8862 = kVar.mo174959xbcf3c886() & 65535;
                a("FHCRC", (short) (((mo174959xbcf3c8862 & 255) << 8) | ((mo174959xbcf3c8862 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f533236d = b17;
        } else {
            crc32 = crc322;
            b0Var = b0Var2;
        }
        if (this.f533236d == b17) {
            long j27 = sink.f533227e;
            long B = this.f533239g.B(sink, j17);
            if (B != -1) {
                b(sink, j27, B);
                return B;
            }
            this.f533236d = (byte) 2;
        }
        if (this.f533236d == 2) {
            a("CRC", b0Var.b(), (int) crc32.getValue());
            a("ISIZE", b0Var.b(), (int) this.f533238f.getBytesWritten());
            this.f533236d = (byte) 3;
            if (!b0Var.o1()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(java.lang.String str, int i17, int i18) {
        if (i18 == i17) {
            return;
        }
        java.lang.String format = java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(this, *args)");
        throw new java.io.IOException(format);
    }

    public final void b(x36.k kVar, long j17, long j18) {
        x36.c0 c0Var = kVar.f533226d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        while (true) {
            int i17 = c0Var.f533192c;
            int i18 = c0Var.f533191b;
            if (j17 < i17 - i18) {
                break;
            }
            j17 -= i17 - i18;
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
        }
        while (j18 > 0) {
            int min = (int) java.lang.Math.min(c0Var.f533192c - r6, j18);
            this.f533240h.update(c0Var.f533190a, (int) (c0Var.f533191b + j17), min);
            j18 -= min;
            c0Var = c0Var.f533195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            j17 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f533239g.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f533237e.h();
    }
}
