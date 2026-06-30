package yz1;

/* loaded from: classes15.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final yz1.l f550047a;

    /* renamed from: b, reason: collision with root package name */
    public final yz1.s f550048b;

    /* renamed from: c, reason: collision with root package name */
    public final xz1.a f550049c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f550050d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f550052f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f550051e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final yz1.k f550053g = new yz1.o(this);

    /* renamed from: h, reason: collision with root package name */
    public final yz1.r f550054h = new yz1.p(this);

    public q(java.io.InputStream inputStream, java.io.OutputStream outputStream, xz1.a aVar, java.lang.String str) {
        this.f550047a = new yz1.l(inputStream, aVar);
        this.f550048b = new yz1.s(outputStream);
        this.f550049c = aVar;
        this.f550050d = str;
    }

    public final void a(yz1.a aVar) {
        boolean z17;
        if (this.f550051e.get()) {
            z17 = false;
        } else {
            d(new java.io.IOException("Session is closed"));
            z17 = true;
        }
        if (z17) {
            return;
        }
        yz1.s sVar = this.f550048b;
        yz1.r rVar = this.f550054h;
        synchronized (sVar) {
            try {
                aVar.b(sVar.f550055a);
                sVar.f550055a.flush();
                rVar.getClass();
            } catch (java.io.IOException e17) {
                ((yz1.p) rVar).f550046a.d(e17);
            }
        }
    }

    public void b(int i17, java.lang.String str) {
        jz5.f0 f0Var;
        if (this.f550051e.getAndSet(false)) {
            xz1.k kVar = (xz1.k) this.f550049c;
            synchronized (kVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "onClose before");
                qk.u6 u6Var = (qk.u6) kVar.f539726g.get(this.f550050d);
                if (u6Var != null) {
                    u6Var.mo52339xaf6bb359();
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DevTools.DevToolsService", "onClose without attachable");
                }
                kVar.f539727h.remove(this.f550050d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "onClose " + this.f550050d + ' ' + i17 + ' ' + str);
            }
        }
    }

    public final void c(int i17, java.lang.String str) {
        byte[] bArr;
        int i18;
        if (str != null) {
            int i19 = yz1.m.f550044a;
            try {
                bArr = str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                i18 = bArr.length + 2;
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } else {
            bArr = null;
            i18 = 2;
        }
        byte[] bArr2 = new byte[i18];
        bArr2[0] = (byte) ((i17 >> 8) & 255);
        bArr2[1] = (byte) (i17 & 255);
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        }
        a(yz1.b.a((byte) 8, bArr2, i18));
        this.f550052f = true;
    }

    public final void d(java.io.IOException ex6) {
        this.f550049c.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ex6, "ex");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DevToolsHandler", "onError: ex = " + ex6);
    }
}
