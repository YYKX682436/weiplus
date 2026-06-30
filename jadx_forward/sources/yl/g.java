package yl;

/* loaded from: classes12.dex */
public class g implements yl.b {

    /* renamed from: o, reason: collision with root package name */
    public static final yl.a f544470o = new yl.a();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f544473c;

    /* renamed from: f, reason: collision with root package name */
    public final int f544476f;

    /* renamed from: g, reason: collision with root package name */
    public final int f544477g;

    /* renamed from: k, reason: collision with root package name */
    public volatile java.io.OutputStream f544481k;

    /* renamed from: l, reason: collision with root package name */
    public int f544482l;

    /* renamed from: n, reason: collision with root package name */
    public w21.w f544484n;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f544471a = new java.util.concurrent.ArrayBlockingQueue(1024);

    /* renamed from: b, reason: collision with root package name */
    public boolean f544472b = false;

    /* renamed from: d, reason: collision with root package name */
    public int f544474d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f544475e = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f544478h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public yl.f f544479i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f544480j = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f544483m = false;

    public g(int i17, int i18) {
        this.f544476f = 16000;
        this.f544477g = 16000;
        this.f544476f = i17;
        this.f544477g = i18;
    }

    @Override // yl.b
    public int a(tl.h0 h0Var, int i17) {
        return e(h0Var, i17, false);
    }

    @Override // yl.b
    public boolean b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "initWriter path: " + str);
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "path is null");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "[carl] !!!! VFS parent! exists(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(!m17.a() ? false : m17.f294799a.F(m17.f294800b)), substring);
            if (!r6Var.s().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "[carl] ???? Dir not created! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var.s().J()), r6Var.s().o());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(357L, 58L, 1L);
            } else if (!r6Var2.s().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "[carl] !!!! VFS not created dir! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var2.s().J()), r6Var.s().o());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(357L, 57L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkWriter", th6, "Check out file dir error.", new java.lang.Object[0]);
        }
        try {
            outputStream = com.p314xaae8f345.mm.vfs.w6.K(str, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkWriter", e17, "initWriter openWrite failed: %s", e17.getMessage());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "initWriter FileOutputStream error:%s", e18.getMessage());
            return false;
        }
    }

    @Override // yl.b
    public boolean c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "resetWriter");
        synchronized (this.f544478h) {
            try {
                w21.w wVar = this.f544484n;
                if (wVar != null) {
                    com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48250xcfe9dce(wVar.f524016a);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        w21.w wVar2 = new w21.w(this.f544476f, this.f544477g, this.f544482l);
        this.f544484n = wVar2;
        if (0 != wVar2.f524016a) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "resetWriter SilkEncoderInit Error");
        this.f544484n = null;
        return false;
    }

    @Override // yl.b
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "waitStop");
        synchronized (this) {
            this.f544472b = true;
        }
        yl.f fVar = this.f544479i;
        if (fVar != null) {
            try {
                java.util.concurrent.Future future = fVar.f544468d;
                if (future != null) {
                    future.get();
                }
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            } catch (java.util.concurrent.ExecutionException e18) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        }
        synchronized (this.f544478h) {
            try {
                w21.w wVar = this.f544484n;
                if (wVar != null) {
                    com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48250xcfe9dce(wVar.f524016a);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "finish Thread file:" + this.f544473c);
        if (this.f544481k != null) {
            try {
                this.f544481k.close();
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "close silk file:" + this.f544473c + "msg:" + e19.getMessage());
            }
            this.f544481k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a A[SYNTHETIC] */
    @Override // yl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(tl.h0 r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.g.e(tl.h0, int, boolean):int");
    }

    public boolean f(java.lang.String str, java.io.OutputStream outputStream) {
        this.f544473c = str;
        this.f544481k = outputStream;
        this.f544480j = false;
        int a17 = wo.r.a();
        if ((a17 & 1024) != 0) {
            this.f544482l = 4;
        } else {
            if ((a17 & 512) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "initWriter cpuType error! silk don't support arm_v5!!!!");
                return false;
            }
            this.f544482l = 2;
        }
        w21.w wVar = new w21.w(this.f544476f, this.f544477g, this.f544482l);
        this.f544484n = wVar;
        if (0 == wVar.f524016a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "initWriter SilkEncoderInit Error");
            this.f544484n = null;
            return false;
        }
        this.f544475e = new byte[((this.f544476f * 20) * 2) / 1000];
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_msg_voice_silk_opt, -1);
        if (1 == Ni) {
            this.f544483m = true;
        }
        if (Ni == 0) {
            this.f544483m = false;
        }
        if (this.f544483m) {
            w21.w wVar2 = this.f544484n;
            if (wVar2 != null) {
                com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48243x7bd37d18(200, 1, wVar2.f524016a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Open !");
        } else {
            w21.w wVar3 = this.f544484n;
            if (wVar3 != null) {
                com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48243x7bd37d18(200, 0, wVar3.f524016a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Close !");
        }
        return true;
    }

    public void g(byte[] bArr, int i17, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.util.concurrent.BlockingQueue blockingQueue = this.f544471a;
        objArr[0] = java.lang.Integer.valueOf(blockingQueue == null ? -1 : ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).size());
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkWriter", "pushBuf queueLen:%d bufLen:%d len:%d, lastFrame: %s", objArr);
        if (i17 <= 0) {
            return;
        }
        synchronized (this) {
            if (this.f544472b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkWriter", "already stop");
                return;
            }
            if (this.f544479i == null) {
                this.f544479i = new yl.f(this, null);
                ((ku5.t0) ku5.t0.f394148d).g(this.f544479i);
            }
            java.util.concurrent.BlockingQueue blockingQueue2 = this.f544471a;
            if (blockingQueue2 != null) {
                try {
                    ((java.util.concurrent.ArrayBlockingQueue) blockingQueue2).add(new tl.h0(bArr, i17, z17));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkWriter", e17, "pushBuf add queue error:%s", e17.getMessage());
                }
            }
        }
    }
}
