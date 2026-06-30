package w36;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f524337a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.m f524338b;

    /* renamed from: c, reason: collision with root package name */
    public final w36.j f524339c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f524340d;

    /* renamed from: e, reason: collision with root package name */
    public int f524341e;

    /* renamed from: f, reason: collision with root package name */
    public long f524342f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f524343g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f524344h;

    /* renamed from: i, reason: collision with root package name */
    public final x36.k f524345i = new x36.k();

    /* renamed from: j, reason: collision with root package name */
    public final x36.k f524346j = new x36.k();

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f524347k;

    /* renamed from: l, reason: collision with root package name */
    public final x36.i f524348l;

    public k(boolean z17, x36.m mVar, w36.j jVar) {
        if (mVar == null) {
            throw new java.lang.NullPointerException("source == null");
        }
        if (jVar == null) {
            throw new java.lang.NullPointerException("frameCallback == null");
        }
        this.f524337a = z17;
        this.f524338b = mVar;
        this.f524339c = jVar;
        this.f524347k = z17 ? null : new byte[4];
        this.f524348l = z17 ? null : new x36.i();
    }

    public final void a() {
        java.lang.String str;
        short s17;
        w36.g gVar;
        long j17 = this.f524342f;
        if (j17 > 0) {
            this.f524338b.k1(this.f524345i, j17);
            if (!this.f524337a) {
                this.f524345i.j(this.f524348l);
                this.f524348l.a(0L);
                w36.i.b(this.f524348l, this.f524347k);
                this.f524348l.close();
            }
        }
        switch (this.f524341e) {
            case 8:
                x36.k kVar = this.f524345i;
                long j18 = kVar.f533227e;
                if (j18 == 1) {
                    throw new java.net.ProtocolException("Malformed close payload length of 1.");
                }
                if (j18 != 0) {
                    s17 = kVar.mo174959xbcf3c886();
                    str = this.f524345i.q();
                    java.lang.String a17 = w36.i.a(s17);
                    if (a17 != null) {
                        throw new java.net.ProtocolException(a17);
                    }
                } else {
                    str = "";
                    s17 = 1005;
                }
                w36.h hVar = (w36.h) this.f524339c;
                if (s17 == -1) {
                    hVar.getClass();
                    throw new java.lang.IllegalArgumentException();
                }
                synchronized (hVar) {
                    if (hVar.f524332q != -1) {
                        throw new java.lang.IllegalStateException("already closed");
                    }
                    hVar.f524332q = s17;
                    hVar.f524333r = str;
                    gVar = null;
                    if (hVar.f524330o && hVar.f524328m.isEmpty()) {
                        w36.g gVar2 = hVar.f524326k;
                        hVar.f524326k = null;
                        java.util.concurrent.ScheduledFuture scheduledFuture = hVar.f524331p;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) hVar.f524325j).shutdown();
                        gVar = gVar2;
                    }
                }
                try {
                    hVar.f524317b.getClass();
                    if (gVar != null) {
                        hVar.f524317b.a(hVar, s17, str);
                    }
                    m36.e.c(gVar);
                    this.f524340d = true;
                    return;
                } catch (java.lang.Throwable th6) {
                    m36.e.c(gVar);
                    throw th6;
                }
            case 9:
                w36.j jVar = this.f524339c;
                x36.o l17 = this.f524345i.l();
                w36.h hVar2 = (w36.h) jVar;
                synchronized (hVar2) {
                    if (!hVar2.f524334s && (!hVar2.f524330o || !hVar2.f524328m.isEmpty())) {
                        hVar2.f524327l.add(l17);
                        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = hVar2.f524325j;
                        if (scheduledExecutorService != null) {
                            ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(hVar2.f524322g);
                        }
                        return;
                    }
                    return;
                }
            case 10:
                w36.j jVar2 = this.f524339c;
                this.f524345i.l();
                w36.h hVar3 = (w36.h) jVar2;
                synchronized (hVar3) {
                    hVar3.f524336u = false;
                }
                return;
            default:
                throw new java.net.ProtocolException("Unknown control opcode: " + java.lang.Integer.toHexString(this.f524341e));
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        if (this.f524340d) {
            throw new java.io.IOException("closed");
        }
        x36.m mVar = this.f524338b;
        long h17 = mVar.h().h();
        mVar.h().b();
        try {
            int mo174955xcc4273be = mVar.mo174955xcc4273be() & 255;
            mVar.h().g(h17, java.util.concurrent.TimeUnit.NANOSECONDS);
            this.f524341e = mo174955xcc4273be & 15;
            boolean z17 = (mo174955xcc4273be & 128) != 0;
            this.f524343g = z17;
            boolean z18 = (mo174955xcc4273be & 8) != 0;
            this.f524344h = z18;
            if (z18 && !z17) {
                throw new java.net.ProtocolException("Control frames must be final.");
            }
            boolean z19 = (mo174955xcc4273be & 64) != 0;
            boolean z27 = (mo174955xcc4273be & 32) != 0;
            boolean z28 = (mo174955xcc4273be & 16) != 0;
            if (z19 || z27 || z28) {
                throw new java.net.ProtocolException("Reserved flags are unsupported.");
            }
            int mo174955xcc4273be2 = mVar.mo174955xcc4273be() & 255;
            boolean z29 = (mo174955xcc4273be2 & 128) != 0;
            boolean z37 = this.f524337a;
            if (z29 == z37) {
                throw new java.net.ProtocolException(z37 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j17 = mo174955xcc4273be2 & 127;
            this.f524342f = j17;
            if (j17 == 126) {
                this.f524342f = mVar.mo174959xbcf3c886() & 65535;
            } else if (j17 == 127) {
                long mo174958xcc46d932 = mVar.mo174958xcc46d932();
                this.f524342f = mo174958xcc46d932;
                if (mo174958xcc46d932 < 0) {
                    throw new java.net.ProtocolException("Frame length 0x" + java.lang.Long.toHexString(this.f524342f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f524344h && this.f524342f > 125) {
                throw new java.net.ProtocolException("Control frame must be less than 125B.");
            }
            if (z29) {
                mVar.mo174956xbc4273d4(this.f524347k);
            }
        } catch (java.lang.Throwable th6) {
            mVar.h().g(h17, java.util.concurrent.TimeUnit.NANOSECONDS);
            throw th6;
        }
    }
}
