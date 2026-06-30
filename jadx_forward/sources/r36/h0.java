package r36;

/* loaded from: classes16.dex */
public final class h0 implements java.io.Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.logging.Logger f450942m = java.util.logging.Logger.getLogger(r36.g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final x36.l f450943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f450944e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.k f450945f;

    /* renamed from: g, reason: collision with root package name */
    public int f450946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f450947h;

    /* renamed from: i, reason: collision with root package name */
    public final r36.e f450948i;

    public h0(x36.l lVar, boolean z17) {
        this.f450943d = lVar;
        this.f450944e = z17;
        x36.k kVar = new x36.k();
        this.f450945f = kVar;
        this.f450948i = new r36.e(kVar);
        this.f450946g = 16384;
    }

    public synchronized void a(r36.m0 m0Var) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        int i17 = this.f450946g;
        int i18 = m0Var.f450973a;
        if ((i18 & 32) != 0) {
            i17 = m0Var.f450974b[5];
        }
        this.f450946g = i17;
        if (((i18 & 2) != 0 ? m0Var.f450974b[1] : -1) != -1) {
            r36.e eVar = this.f450948i;
            int i19 = (i18 & 2) != 0 ? m0Var.f450974b[1] : -1;
            eVar.getClass();
            int min = java.lang.Math.min(i19, 16384);
            int i27 = eVar.f450910d;
            if (i27 != min) {
                if (min < i27) {
                    eVar.f450908b = java.lang.Math.min(eVar.f450908b, min);
                }
                eVar.f450909c = true;
                eVar.f450910d = min;
                int i28 = eVar.f450914h;
                if (min < i28) {
                    if (min == 0) {
                        java.util.Arrays.fill(eVar.f450911e, (java.lang.Object) null);
                        eVar.f450912f = eVar.f450911e.length - 1;
                        eVar.f450913g = 0;
                        eVar.f450914h = 0;
                    } else {
                        eVar.a(i28 - min);
                    }
                }
            }
        }
        c(0, 0, (byte) 4, (byte) 1);
        this.f450943d.flush();
    }

    public synchronized void b(boolean z17, int i17, x36.k kVar, int i18) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        c(i17, i18, (byte) 0, z17 ? (byte) 1 : (byte) 0);
        if (i18 > 0) {
            this.f450943d.U(kVar, i18);
        }
    }

    public void c(int i17, int i18, byte b17, byte b18) {
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f450942m;
        if (logger.isLoggable(level)) {
            logger.fine(r36.g.a(false, i17, i18, b17, b18));
        }
        int i19 = this.f450946g;
        if (i18 > i19) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18)};
            x36.o oVar = r36.g.f450924a;
            throw new java.lang.IllegalArgumentException(m36.e.j("FRAME_SIZE_ERROR length > %d: %d", objArr));
        }
        if ((Integer.MIN_VALUE & i17) != 0) {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17)};
            x36.o oVar2 = r36.g.f450924a;
            throw new java.lang.IllegalArgumentException(m36.e.j("reserved bit set: %s", objArr2));
        }
        x36.l lVar = this.f450943d;
        lVar.e((i18 >>> 16) & 255);
        lVar.e((i18 >>> 8) & 255);
        lVar.e(i18 & 255);
        lVar.e(b17 & 255);
        lVar.e(b18 & 255);
        lVar.o(i17 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f450947h = true;
        this.f450943d.close();
    }

    public synchronized void f(int i17, r36.b bVar, byte[] bArr) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        if (bVar.f450880d == -1) {
            x36.o oVar = r36.g.f450924a;
            throw new java.lang.IllegalArgumentException(m36.e.j("errorCode.httpCode == -1", new java.lang.Object[0]));
        }
        c(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f450943d.o(i17);
        this.f450943d.o(bVar.f450880d);
        if (bArr.length > 0) {
            this.f450943d.mo174975x6c257df(bArr);
        }
        this.f450943d.flush();
    }

    public void i(boolean z17, int i17, java.util.List list) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        this.f450948i.d(list);
        x36.k kVar = this.f450945f;
        long j17 = kVar.f533227e;
        int min = (int) java.lang.Math.min(this.f450946g, j17);
        long j18 = min;
        byte b17 = j17 == j18 ? (byte) 4 : (byte) 0;
        if (z17) {
            b17 = (byte) (b17 | 1);
        }
        c(i17, min, (byte) 1, b17);
        this.f450943d.U(kVar, j18);
        if (j17 > j18) {
            p(i17, j17 - j18);
        }
    }

    public synchronized void j(boolean z17, int i17, int i18) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        c(0, 8, (byte) 6, z17 ? (byte) 1 : (byte) 0);
        this.f450943d.o(i17);
        this.f450943d.o(i18);
        this.f450943d.flush();
    }

    public synchronized void k(int i17, r36.b bVar) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        if (bVar.f450880d == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        c(i17, 4, (byte) 3, (byte) 0);
        this.f450943d.o(bVar.f450880d);
        this.f450943d.flush();
    }

    public synchronized void l(int i17, long j17) {
        if (this.f450947h) {
            throw new java.io.IOException("closed");
        }
        if (j17 == 0 || j17 > 2147483647L) {
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j17)};
            x36.o oVar = r36.g.f450924a;
            throw new java.lang.IllegalArgumentException(m36.e.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        }
        c(i17, 4, (byte) 8, (byte) 0);
        this.f450943d.o((int) j17);
        this.f450943d.flush();
    }

    public final void p(int i17, long j17) {
        while (j17 > 0) {
            int min = (int) java.lang.Math.min(this.f450946g, j17);
            long j18 = min;
            j17 -= j18;
            c(i17, min, (byte) 9, j17 == 0 ? (byte) 4 : (byte) 0);
            this.f450943d.U(this.f450945f, j18);
        }
    }
}
