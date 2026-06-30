package yl;

/* loaded from: classes12.dex */
public class c implements yl.b {

    /* renamed from: k, reason: collision with root package name */
    public static final yl.a f544454k = new yl.a();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f544455a;

    /* renamed from: b, reason: collision with root package name */
    public int f544456b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f544457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f544458d;

    /* renamed from: e, reason: collision with root package name */
    public final int f544459e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f544460f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f544461g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.io.OutputStream f544462h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f544463i;

    /* renamed from: j, reason: collision with root package name */
    public w21.s f544464j;

    public c(int i17, int i18) {
        new java.util.concurrent.ArrayBlockingQueue(1024);
        this.f544456b = 0;
        this.f544457c = null;
        this.f544458d = 16000;
        this.f544459e = 64000;
        this.f544460f = new java.lang.Object();
        this.f544461g = false;
        this.f544463i = true;
        this.f544458d = i17;
        this.f544459e = i18;
    }

    @Override // yl.b
    public int a(tl.h0 h0Var, int i17) {
        return e(h0Var, i17, false);
    }

    @Override // yl.b
    public boolean b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "initWriter path: " + str);
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "path is null");
            return false;
        }
        java.io.OutputStream outputStream = null;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            java.lang.String substring = str.substring(0, str.lastIndexOf("/") + 1);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(substring);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "[carl] !!!! VFS parent! exists(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(!m17.a() ? false : m17.f294799a.F(m17.f294800b)), substring);
            if (!r6Var.s().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "[carl] ???? Dir not created! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var.s().J()), r6Var.s().o());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(357L, 58L, 1L);
            } else if (!r6Var2.s().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "[carl] !!!! VFS not created dir! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var2.s().J()), r6Var.s().o());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(357L, 57L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpusWriter", th6, "Check out file dir error.", new java.lang.Object[0]);
        }
        try {
            outputStream = com.p314xaae8f345.mm.vfs.w6.K(str, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpusWriter", e17, "initWriter openWrite failed: %s", e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(357L, 55L, 1L);
            if (o45.wf.f424566k) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("stack", e17.getMessage());
                g0Var.i("Record", "Write failed", hashMap);
            }
        }
        if (outputStream == null) {
            return false;
        }
        try {
            return f(str, outputStream);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "initWriter FileOutputStream error:%s", e18.getMessage());
            return false;
        }
    }

    @Override // yl.b
    public boolean c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "resetWriter");
        synchronized (this.f544460f) {
            w21.s sVar = this.f544464j;
            if (sVar != null) {
                synchronized (sVar) {
                    if (!sVar.f523996b) {
                        sVar.f523996b = true;
                        com.p314xaae8f345.mm.p963x7eba77a9.C11152x3ab2b471.m48267x1478624c(sVar.f523995a);
                        sVar.f523995a = 0L;
                    }
                }
                this.f544464j = null;
            }
            w21.s sVar2 = new w21.s(this.f544458d, this.f544459e);
            this.f544464j = sVar2;
            if (0 != sVar2.f523995a) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "resetWriter OpusEncoderInit Error");
            this.f544464j = null;
            return false;
        }
    }

    @Override // yl.b
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "waitStop");
        synchronized (this) {
        }
        synchronized (this.f544460f) {
            try {
                w21.s sVar = this.f544464j;
                if (sVar != null) {
                    synchronized (sVar) {
                        if (!sVar.f523996b) {
                            sVar.f523996b = true;
                            com.p314xaae8f345.mm.p963x7eba77a9.C11152x3ab2b471.m48267x1478624c(sVar.f523995a);
                            sVar.f523995a = 0L;
                        }
                    }
                    this.f544464j = null;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "finish Thread file:" + this.f544455a);
        if (this.f544462h != null) {
            try {
                this.f544462h.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "close Opus file:" + this.f544455a + "msg:" + e17.getMessage());
            }
            this.f544462h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152 A[SYNTHETIC] */
    @Override // yl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(tl.h0 r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.c.e(tl.h0, int, boolean):int");
    }

    public boolean f(java.lang.String str, java.io.OutputStream outputStream) {
        this.f544455a = str;
        this.f544462h = outputStream;
        this.f544461g = false;
        w21.s sVar = new w21.s(this.f544458d, this.f544459e);
        this.f544464j = sVar;
        if (0 == sVar.f523995a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpusWriter", "initWriter OpusEncoderInit Error");
            this.f544464j = null;
            return false;
        }
        this.f544457c = new byte[((this.f544458d * 20) * 2) / 1000];
        if (this.f544463i) {
            w21.s sVar2 = this.f544464j;
            if (sVar2 != null) {
                sVar2.a(200, 1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "Voice Message Compression Optimization is Open !");
        } else {
            w21.s sVar3 = this.f544464j;
            if (sVar3 != null) {
                sVar3.a(200, 0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpusWriter", "Voice Message Compression Optimization is Close !");
        }
        return true;
    }
}
