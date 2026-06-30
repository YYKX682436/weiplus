package r36;

/* loaded from: classes16.dex */
public final class c0 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.logging.Logger f450890h = java.util.logging.Logger.getLogger(r36.g.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final x36.m f450891d;

    /* renamed from: e, reason: collision with root package name */
    public final r36.a0 f450892e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f450893f;

    /* renamed from: g, reason: collision with root package name */
    public final r36.d f450894g;

    public c0(x36.m mVar, boolean z17) {
        this.f450891d = mVar;
        this.f450893f = z17;
        r36.a0 a0Var = new r36.a0(mVar);
        this.f450892e = a0Var;
        this.f450894g = new r36.d(4096, a0Var);
    }

    public static int a(int i17, byte b17, short s17) {
        if ((b17 & 8) != 0) {
            i17--;
        }
        if (s17 <= i17) {
            return (short) (i17 - s17);
        }
        r36.g.b("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s17), java.lang.Integer.valueOf(i17));
        throw null;
    }

    public boolean b(boolean z17, r36.b0 b0Var) {
        boolean f17;
        boolean z18;
        boolean z19;
        long j17;
        boolean f18;
        boolean f19;
        r36.b bVar;
        boolean z27 = false;
        try {
            this.f450891d.c1(9L);
            x36.m mVar = this.f450891d;
            int mo174955xcc4273be = (mVar.mo174955xcc4273be() & 255) | ((mVar.mo174955xcc4273be() & 255) << 16) | ((mVar.mo174955xcc4273be() & 255) << 8);
            if (mo174955xcc4273be < 0 || mo174955xcc4273be > 16384) {
                r36.g.b("FRAME_SIZE_ERROR: %s", java.lang.Integer.valueOf(mo174955xcc4273be));
                throw null;
            }
            byte mo174955xcc4273be2 = (byte) (this.f450891d.mo174955xcc4273be() & 255);
            if (z17 && mo174955xcc4273be2 != 4) {
                r36.g.b("Expected a SETTINGS frame but was %s", java.lang.Byte.valueOf(mo174955xcc4273be2));
                throw null;
            }
            byte mo174955xcc4273be3 = (byte) (this.f450891d.mo174955xcc4273be() & 255);
            int mo174957x40655679 = this.f450891d.mo174957x40655679() & Integer.MAX_VALUE;
            java.util.logging.Logger logger = f450890h;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(r36.g.a(true, mo174957x40655679, mo174955xcc4273be, mo174955xcc4273be2, mo174955xcc4273be3));
            }
            switch (mo174955xcc4273be2) {
                case 0:
                    if (mo174957x40655679 == 0) {
                        r36.g.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    boolean z28 = (mo174955xcc4273be3 & 1) != 0;
                    if ((mo174955xcc4273be3 & 32) != 0) {
                        r36.g.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new java.lang.Object[0]);
                        throw null;
                    }
                    short mo174955xcc4273be4 = (mo174955xcc4273be3 & 8) != 0 ? (short) (this.f450891d.mo174955xcc4273be() & 255) : (short) 0;
                    int a17 = a(mo174955xcc4273be, mo174955xcc4273be3, mo174955xcc4273be4);
                    x36.m mVar2 = this.f450891d;
                    r36.y yVar = (r36.y) b0Var;
                    yVar.f451003f.getClass();
                    if (mo174957x40655679 != 0 && (mo174957x40655679 & 1) == 0) {
                        r36.z zVar = yVar.f451003f;
                        zVar.getClass();
                        x36.k kVar = new x36.k();
                        long j18 = a17;
                        mVar2.c1(j18);
                        mVar2.B(kVar, j18);
                        if (kVar.f533227e != j18) {
                            throw new java.io.IOException(kVar.f533227e + " != " + a17);
                        }
                        zVar.f(new r36.o(zVar, "OkHttp %s Push Data[%s]", new java.lang.Object[]{zVar.f451007g, java.lang.Integer.valueOf(mo174957x40655679)}, mo174957x40655679, kVar, a17, z28));
                    } else {
                        r36.g0 c17 = yVar.f451003f.c(mo174957x40655679);
                        if (c17 == null) {
                            yVar.f451003f.p(mo174957x40655679, r36.b.PROTOCOL_ERROR);
                            long j19 = a17;
                            yVar.f451003f.k(j19);
                            mVar2.mo174960x35e57f(j19);
                        } else {
                            r36.e0 e0Var = c17.f450934g;
                            long j27 = a17;
                            while (true) {
                                if (j27 > 0) {
                                    synchronized (e0Var.f450920i) {
                                        z18 = e0Var.f450919h;
                                        z19 = e0Var.f450916e.f533227e + j27 > e0Var.f450917f;
                                    }
                                    if (z19) {
                                        mVar2.mo174960x35e57f(j27);
                                        r36.g0 g0Var = e0Var.f450920i;
                                        r36.b bVar2 = r36.b.FLOW_CONTROL_ERROR;
                                        if (g0Var.d(bVar2)) {
                                            g0Var.f450931d.p(g0Var.f450930c, bVar2);
                                        }
                                    } else if (z18) {
                                        mVar2.mo174960x35e57f(j27);
                                    } else {
                                        long B = mVar2.B(e0Var.f450915d, j27);
                                        if (B == -1) {
                                            throw new java.io.EOFException();
                                        }
                                        j27 -= B;
                                        synchronized (e0Var.f450920i) {
                                            try {
                                                if (e0Var.f450918g) {
                                                    x36.k kVar2 = e0Var.f450915d;
                                                    j17 = kVar2.f533227e;
                                                    kVar2.mo174960x35e57f(j17);
                                                } else {
                                                    x36.k kVar3 = e0Var.f450916e;
                                                    boolean z29 = kVar3.f533227e == 0;
                                                    kVar3.C(e0Var.f450915d);
                                                    if (z29) {
                                                        e0Var.f450920i.notifyAll();
                                                    }
                                                    j17 = 0;
                                                }
                                            } finally {
                                            }
                                        }
                                        if (j17 > 0) {
                                            e0Var.f450920i.f450931d.k(j17);
                                        }
                                    }
                                } else {
                                    e0Var.getClass();
                                }
                            }
                            if (z28) {
                                synchronized (c17) {
                                    c17.f450934g.f450919h = true;
                                    f17 = c17.f();
                                    c17.notifyAll();
                                }
                                if (!f17) {
                                    c17.f450931d.i(c17.f450930c);
                                }
                            }
                        }
                    }
                    this.f450891d.mo174960x35e57f(mo174955xcc4273be4);
                    return true;
                case 1:
                    if (mo174957x40655679 == 0) {
                        r36.g.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    boolean z37 = (mo174955xcc4273be3 & 1) != 0;
                    short mo174955xcc4273be5 = (mo174955xcc4273be3 & 8) != 0 ? (short) (this.f450891d.mo174955xcc4273be() & 255) : (short) 0;
                    if ((mo174955xcc4273be3 & 32) != 0) {
                        x36.m mVar3 = this.f450891d;
                        mVar3.mo174957x40655679();
                        mVar3.mo174955xcc4273be();
                        b0Var.getClass();
                        mo174955xcc4273be -= 5;
                    }
                    java.util.List i17 = i(a(mo174955xcc4273be, mo174955xcc4273be3, mo174955xcc4273be5), mo174955xcc4273be5, mo174955xcc4273be3, mo174957x40655679);
                    r36.y yVar2 = (r36.y) b0Var;
                    yVar2.f451003f.getClass();
                    if (mo174957x40655679 != 0 && (mo174957x40655679 & 1) == 0) {
                        r36.z zVar2 = yVar2.f451003f;
                        zVar2.getClass();
                        try {
                            zVar2.f(new r36.n(zVar2, "OkHttp %s Push Headers[%s]", new java.lang.Object[]{zVar2.f451007g, java.lang.Integer.valueOf(mo174957x40655679)}, mo174957x40655679, i17, z37));
                            return true;
                        } catch (java.util.concurrent.RejectedExecutionException unused) {
                            return true;
                        }
                    }
                    synchronized (yVar2.f451003f) {
                        r36.g0 c18 = yVar2.f451003f.c(mo174957x40655679);
                        if (c18 == null) {
                            r36.z zVar3 = yVar2.f451003f;
                            if (!zVar3.f451010m) {
                                if (mo174957x40655679 > zVar3.f451008h) {
                                    if (mo174957x40655679 % 2 != zVar3.f451009i % 2) {
                                        r36.g0 g0Var2 = new r36.g0(mo174957x40655679, yVar2.f451003f, false, z37, m36.e.t(i17));
                                        r36.z zVar4 = yVar2.f451003f;
                                        zVar4.f451008h = mo174957x40655679;
                                        zVar4.f451006f.put(java.lang.Integer.valueOf(mo174957x40655679), g0Var2);
                                        ((java.util.concurrent.ThreadPoolExecutor) r36.z.D).execute(new r36.v(yVar2, "OkHttp %s stream %d", new java.lang.Object[]{yVar2.f451003f.f451007g, java.lang.Integer.valueOf(mo174957x40655679)}, g0Var2));
                                    }
                                }
                            }
                        } else {
                            synchronized (c18) {
                                c18.f450933f = true;
                                ((java.util.ArrayDeque) c18.f450932e).add(m36.e.t(i17));
                                f18 = c18.f();
                                c18.notifyAll();
                            }
                            if (!f18) {
                                c18.f450931d.i(c18.f450930c);
                            }
                            if (z37) {
                                synchronized (c18) {
                                    c18.f450934g.f450919h = true;
                                    f19 = c18.f();
                                    c18.notifyAll();
                                }
                                if (!f19) {
                                    c18.f450931d.i(c18.f450930c);
                                }
                            }
                        }
                    }
                    return true;
                case 2:
                    if (mo174955xcc4273be != 5) {
                        r36.g.b("TYPE_PRIORITY length: %d != 5", java.lang.Integer.valueOf(mo174955xcc4273be));
                        throw null;
                    }
                    if (mo174957x40655679 == 0) {
                        r36.g.b("TYPE_PRIORITY streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    x36.m mVar4 = this.f450891d;
                    mVar4.mo174957x40655679();
                    mVar4.mo174955xcc4273be();
                    b0Var.getClass();
                    return true;
                case 3:
                    if (mo174955xcc4273be != 4) {
                        r36.g.b("TYPE_RST_STREAM length: %d != 4", java.lang.Integer.valueOf(mo174955xcc4273be));
                        throw null;
                    }
                    if (mo174957x40655679 == 0) {
                        r36.g.b("TYPE_RST_STREAM streamId == 0", new java.lang.Object[0]);
                        throw null;
                    }
                    int mo174957x406556792 = this.f450891d.mo174957x40655679();
                    r36.b[] m161487xcee59d22 = r36.b.m161487xcee59d22();
                    int length = m161487xcee59d22.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            bVar = m161487xcee59d22[i18];
                            if (bVar.f450880d != mo174957x406556792) {
                                i18++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        r36.g.b("TYPE_RST_STREAM unexpected error code: %d", java.lang.Integer.valueOf(mo174957x406556792));
                        throw null;
                    }
                    r36.z zVar5 = ((r36.y) b0Var).f451003f;
                    zVar5.getClass();
                    if (mo174957x40655679 != 0 && (mo174957x40655679 & 1) == 0) {
                        z27 = true;
                    }
                    if (z27) {
                        zVar5.f(new r36.p(zVar5, "OkHttp %s Push Reset[%s]", new java.lang.Object[]{zVar5.f451007g, java.lang.Integer.valueOf(mo174957x40655679)}, mo174957x40655679, bVar));
                        return true;
                    }
                    r36.g0 i19 = zVar5.i(mo174957x40655679);
                    if (i19 == null) {
                        return true;
                    }
                    synchronized (i19) {
                        if (i19.f450938k == null) {
                            i19.f450938k = bVar;
                            i19.notifyAll();
                        }
                    }
                    return true;
                case 4:
                    if (mo174957x40655679 != 0) {
                        r36.g.b("TYPE_SETTINGS streamId != 0", new java.lang.Object[0]);
                        throw null;
                    }
                    if ((mo174955xcc4273be3 & 1) == 0) {
                        if (mo174955xcc4273be % 6 != 0) {
                            r36.g.b("TYPE_SETTINGS length %% 6 != 0: %s", java.lang.Integer.valueOf(mo174955xcc4273be));
                            throw null;
                        }
                        r36.m0 m0Var = new r36.m0();
                        for (int i27 = 0; i27 < mo174955xcc4273be; i27 += 6) {
                            x36.m mVar5 = this.f450891d;
                            int mo174959xbcf3c886 = mVar5.mo174959xbcf3c886() & 65535;
                            int mo174957x406556793 = mVar5.mo174957x40655679();
                            if (mo174959xbcf3c886 != 2) {
                                if (mo174959xbcf3c886 == 3) {
                                    mo174959xbcf3c886 = 4;
                                } else if (mo174959xbcf3c886 == 4) {
                                    if (mo174957x406556793 < 0) {
                                        r36.g.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new java.lang.Object[0]);
                                        throw null;
                                    }
                                    mo174959xbcf3c886 = 7;
                                } else if (mo174959xbcf3c886 == 5 && (mo174957x406556793 < 16384 || mo174957x406556793 > 16777215)) {
                                    r36.g.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(mo174957x406556793));
                                    throw null;
                                }
                            } else if (mo174957x406556793 != 0 && mo174957x406556793 != 1) {
                                r36.g.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new java.lang.Object[0]);
                                throw null;
                            }
                            m0Var.b(mo174959xbcf3c886, mo174957x406556793);
                        }
                        r36.y yVar3 = (r36.y) b0Var;
                        yVar3.getClass();
                        try {
                            r36.z zVar6 = yVar3.f451003f;
                            ((java.util.concurrent.ScheduledThreadPoolExecutor) zVar6.f451011n).execute(new r36.w(yVar3, "OkHttp %s ACK Settings", new java.lang.Object[]{zVar6.f451007g}, false, m0Var));
                            break;
                        } catch (java.util.concurrent.RejectedExecutionException unused2) {
                            break;
                        }
                    } else {
                        if (mo174955xcc4273be != 0) {
                            r36.g.b("FRAME_SIZE_ERROR ack frame should be empty!", new java.lang.Object[0]);
                            throw null;
                        }
                        b0Var.getClass();
                        break;
                    }
                    break;
                case 5:
                    k(b0Var, mo174955xcc4273be, mo174955xcc4273be3, mo174957x40655679);
                    break;
                case 6:
                    j(b0Var, mo174955xcc4273be, mo174955xcc4273be3, mo174957x40655679);
                    break;
                case 7:
                    f(b0Var, mo174955xcc4273be, mo174955xcc4273be3, mo174957x40655679);
                    break;
                case 8:
                    l(b0Var, mo174955xcc4273be, mo174955xcc4273be3, mo174957x40655679);
                    break;
                default:
                    this.f450891d.mo174960x35e57f(mo174955xcc4273be);
                    return true;
            }
            return true;
        } catch (java.io.IOException unused3) {
            return false;
        }
    }

    public void c(r36.b0 b0Var) {
        if (this.f450893f) {
            if (b(true, b0Var)) {
                return;
            }
            r36.g.b("Required SETTINGS preface not received", new java.lang.Object[0]);
            throw null;
        }
        x36.o oVar = r36.g.f450924a;
        x36.o H = this.f450891d.H(oVar.l());
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.logging.Logger logger = f450890h;
        if (logger.isLoggable(level)) {
            logger.fine(m36.e.j("<< CONNECTION %s", H.m()));
        }
        if (oVar.mo174964xb2c87fbf(H)) {
            return;
        }
        r36.g.b("Expected a connection header but was %s", H.u());
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f450891d.close();
    }

    public final void f(r36.b0 b0Var, int i17, byte b17, int i18) {
        r36.b bVar;
        r36.g0[] g0VarArr;
        if (i17 < 8) {
            r36.g.b("TYPE_GOAWAY length < 8: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        if (i18 != 0) {
            r36.g.b("TYPE_GOAWAY streamId != 0", new java.lang.Object[0]);
            throw null;
        }
        int mo174957x40655679 = this.f450891d.mo174957x40655679();
        int mo174957x406556792 = this.f450891d.mo174957x40655679();
        int i19 = i17 - 8;
        r36.b[] m161487xcee59d22 = r36.b.m161487xcee59d22();
        int length = m161487xcee59d22.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                bVar = null;
                break;
            }
            bVar = m161487xcee59d22[i27];
            if (bVar.f450880d == mo174957x406556792) {
                break;
            } else {
                i27++;
            }
        }
        if (bVar == null) {
            r36.g.b("TYPE_GOAWAY unexpected error code: %d", java.lang.Integer.valueOf(mo174957x406556792));
            throw null;
        }
        x36.o oVar = x36.o.f533228g;
        if (i19 > 0) {
            oVar = this.f450891d.H(i19);
        }
        r36.y yVar = (r36.y) b0Var;
        yVar.getClass();
        oVar.l();
        synchronized (yVar.f451003f) {
            g0VarArr = (r36.g0[]) ((java.util.LinkedHashMap) yVar.f451003f.f451006f).values().toArray(new r36.g0[yVar.f451003f.f451006f.size()]);
            yVar.f451003f.f451010m = true;
        }
        for (r36.g0 g0Var : g0VarArr) {
            if (g0Var.f450930c > mo174957x40655679 && g0Var.e()) {
                r36.b bVar2 = r36.b.REFUSED_STREAM;
                synchronized (g0Var) {
                    if (g0Var.f450938k == null) {
                        g0Var.f450938k = bVar2;
                        g0Var.notifyAll();
                    }
                }
                yVar.f451003f.i(g0Var.f450930c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r4.f450898d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(int r4, short r5, byte r6, int r7) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.c0.i(int, short, byte, int):java.util.List");
    }

    public final void j(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i17 != 8) {
            r36.g.b("TYPE_PING length != 8: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        if (i18 != 0) {
            r36.g.b("TYPE_PING streamId != 0", new java.lang.Object[0]);
            throw null;
        }
        int mo174957x40655679 = this.f450891d.mo174957x40655679();
        int mo174957x406556792 = this.f450891d.mo174957x40655679();
        boolean z17 = (b17 & 1) != 0;
        r36.y yVar = (r36.y) b0Var;
        yVar.getClass();
        if (!z17) {
            try {
                r36.z zVar = yVar.f451003f;
                ((java.util.concurrent.ScheduledThreadPoolExecutor) zVar.f451011n).execute(new r36.u(zVar, true, mo174957x40655679, mo174957x406556792));
                return;
            } catch (java.util.concurrent.RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (yVar.f451003f) {
            try {
                if (mo174957x40655679 == 1) {
                    yVar.f451003f.f451015r++;
                } else if (mo174957x40655679 == 2) {
                    yVar.f451003f.f451017t++;
                } else if (mo174957x40655679 == 3) {
                    r36.z zVar2 = yVar.f451003f;
                    zVar2.getClass();
                    zVar2.notifyAll();
                }
            } finally {
            }
        }
    }

    public final void k(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i18 == 0) {
            r36.g.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new java.lang.Object[0]);
            throw null;
        }
        short mo174955xcc4273be = (b17 & 8) != 0 ? (short) (this.f450891d.mo174955xcc4273be() & 255) : (short) 0;
        int mo174957x40655679 = this.f450891d.mo174957x40655679() & Integer.MAX_VALUE;
        java.util.List i19 = i(a(i17 - 4, b17, mo174955xcc4273be), mo174955xcc4273be, b17, i18);
        r36.z zVar = ((r36.y) b0Var).f451003f;
        synchronized (zVar) {
            if (zVar.C.contains(java.lang.Integer.valueOf(mo174957x40655679))) {
                zVar.p(mo174957x40655679, r36.b.PROTOCOL_ERROR);
                return;
            }
            zVar.C.add(java.lang.Integer.valueOf(mo174957x40655679));
            try {
                zVar.f(new r36.m(zVar, "OkHttp %s Push Request[%s]", new java.lang.Object[]{zVar.f451007g, java.lang.Integer.valueOf(mo174957x40655679)}, mo174957x40655679, i19));
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }
    }

    public final void l(r36.b0 b0Var, int i17, byte b17, int i18) {
        if (i17 != 4) {
            r36.g.b("TYPE_WINDOW_UPDATE length !=4: %s", java.lang.Integer.valueOf(i17));
            throw null;
        }
        long mo174957x40655679 = this.f450891d.mo174957x40655679() & 2147483647L;
        if (mo174957x40655679 == 0) {
            r36.g.b("windowSizeIncrement was 0", java.lang.Long.valueOf(mo174957x40655679));
            throw null;
        }
        r36.y yVar = (r36.y) b0Var;
        if (i18 == 0) {
            synchronized (yVar.f451003f) {
                r36.z zVar = yVar.f451003f;
                zVar.f451020w += mo174957x40655679;
                zVar.notifyAll();
            }
            return;
        }
        r36.g0 c17 = yVar.f451003f.c(i18);
        if (c17 != null) {
            synchronized (c17) {
                c17.f450929b += mo174957x40655679;
                if (mo174957x40655679 > 0) {
                    c17.notifyAll();
                }
            }
        }
    }
}
