package wf4;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static com.p314xaae8f345.mm.p2621x8fb0427b.kb D;
    public int A;
    public long B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public ig4.a f527205d;

    /* renamed from: e, reason: collision with root package name */
    public ig4.c f527206e;

    /* renamed from: f, reason: collision with root package name */
    public ig4.b f527207f;

    /* renamed from: g, reason: collision with root package name */
    public w21.w0 f527208g;

    /* renamed from: h, reason: collision with root package name */
    public int f527209h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f527210i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f527211m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f527212n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f527213o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 f527214p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f527215q;

    /* renamed from: r, reason: collision with root package name */
    public int f527216r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f527217s;

    /* renamed from: t, reason: collision with root package name */
    public int f527218t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f527219u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f527220v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f527221w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f527222x;

    /* renamed from: y, reason: collision with root package name */
    public long f527223y;

    /* renamed from: z, reason: collision with root package name */
    public int f527224z;

    public g() {
        super(0);
        this.f527210i = false;
        this.f527211m = false;
        this.f527212n = false;
        this.f527217s = new java.util.HashMap();
        this.f527222x = true;
        this.f527223y = 0L;
        this.C = false;
    }

    public final void b() {
        if (this.f527222x) {
            this.f527222x = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f527223y = currentTimeMillis;
            this.f527224z = (int) (currentTimeMillis - this.B);
        }
    }

    public final void c(java.lang.String str, wf4.f fVar, r45.pv pvVar) {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "finishWithResult mstate:%s", fVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f527213o;
        if (b4Var != null) {
            b4Var.d();
        }
        if (!wf4.k.b()) {
            c01.d9.e().q(546, this);
            c01.d9.e().q(547, this);
            c01.d9.e().q(548, this);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = this.f527214p;
        wf4.f fVar2 = wf4.f.LOCAL_ERROR;
        wf4.f fVar3 = wf4.f.SERVER_ERROR;
        wf4.f fVar4 = wf4.f.CANCEL;
        wf4.f fVar5 = wf4.f.FINISH;
        int i27 = 2;
        if (c5402xfd96e0b5 != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((java.util.HashMap) this.f527217s).put(this.f527214p.f135746g.f89710a, str);
                com.p314xaae8f345.mm.p2621x8fb0427b.kb kbVar = D;
                if ((kbVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kbVar.f68624xad49e234)) && this.f527214p.f135746g.f89713d == 1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.lb Ai = w21.p0.Ai();
                    am.v8 v8Var = this.f527214p.f135746g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "createVoiceTT localId(%s) , fileName(%s).", v8Var.f89711b, v8Var.f89710a);
                    com.p314xaae8f345.mm.p2621x8fb0427b.kb kbVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.kb();
                    kbVar2.f68625x297eb4f7 = java.lang.Long.valueOf(this.f527214p.f135746g.f89711b).longValue();
                    java.lang.String str2 = this.f527214p.f135746g.f89710a;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        kbVar2.f68623xf4f8c8de = str2;
                    }
                    kbVar2.f68624xad49e234 = str;
                    Ai.getClass();
                    Ai.f276631d.m("VoiceTransText", "msgId", kbVar2.mo9763xeb27878e());
                    if (this.f527221w != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2 c6226xe566e8f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2();
                        c6226xe566e8f2.f136473g.f89487a = java.lang.Long.valueOf(this.f527214p.f135746g.f89711b).longValue();
                        c6226xe566e8f2.f136473g.f89488b = this.f527221w.Q0();
                        am.t00 t00Var = c6226xe566e8f2.f136473g;
                        t00Var.f89489c = str;
                        t00Var.f89490d = this.f527221w.mo78012x3fdd41df();
                        c6226xe566e8f2.f136473g.f89491e = this.f527221w.A0();
                        c6226xe566e8f2.e();
                    }
                }
            } else if (fVar == fVar5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "finishWithResult State.FINISH id:%s", this.f527214p.f135746g.f89711b);
                this.f527214p.f135747h.f89803c = 2;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b52 = this.f527214p;
            am.w8 w8Var = c5402xfd96e0b52.f135747h;
            w8Var.f89802b = true;
            w8Var.f89801a = str;
            if (fVar == fVar4) {
                w8Var.f89803c = 1;
            } else if (fVar == fVar2 || fVar == fVar3) {
                w8Var.f89803c = 2;
            }
            w8Var.f89804d = pvVar;
            java.lang.Runnable runnable = c5402xfd96e0b52.f135746g.f89714e;
            if (runnable != null) {
                runnable.run();
            }
        }
        if (this.C && this.f527208g != null) {
            int length = str != null ? str.length() : 0;
            if (fVar != fVar5) {
                this.f527224z = 0;
                this.A = 0;
                if (fVar == fVar4) {
                    i27 = 5;
                } else {
                    if (fVar != fVar3) {
                        if (fVar == fVar2) {
                            i27 = 4;
                        } else if (fVar != wf4.f.NETWORK_OVERTIME) {
                            i17 = 0;
                            i18 = 0;
                        }
                    }
                    i19 = 3;
                    i18 = i19;
                    i17 = 0;
                }
                i19 = i27;
                i18 = i19;
                i17 = 0;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f527224z = 0;
                this.A = 0;
                i19 = 3;
                i18 = i19;
                i17 = 0;
            } else {
                i17 = length;
                i18 = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "transformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, transformResult: %d", this.f527208g.f524020d, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f527224z), java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i18));
            if (i18 != 0) {
                w21.w0 w0Var = this.f527208g;
                cg4.k.a(w0Var.f524020d, i17, this.f527224z, this.A, i18, w0Var.f524028l);
            }
        }
        this.f527205d = null;
        this.f527206e = null;
        this.f527207f = null;
        this.f527214p = null;
        this.f527221w = null;
        this.f527215q = false;
        this.f527211m = false;
        this.f527210i = false;
        this.f527212n = false;
        this.f527216r = 20;
        D = null;
        this.f527222x = true;
        this.f527223y = 0L;
        this.B = 0L;
        this.f527224z = 0;
        this.A = 0;
        this.C = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a5, code lost:
    
        if (r2 == null) goto L81;
     */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r19) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf4.g.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public final void f(wf4.f fVar, r45.pv pvVar) {
        w21.j jVar;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        boolean z18;
        switch (fVar.ordinal()) {
            case 0:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "net check");
                if (wf4.k.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "use ilink CheckVoiceRecognizeRequest");
                    java.lang.String voiceId = this.f527208g.f524020d;
                    wf4.b bVar = new wf4.b(this);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest voiceId:" + voiceId + ", scene:39");
                    r45.y20 y20Var = new r45.y20();
                    y20Var.set(0, voiceId);
                    y20Var.set(1, 39);
                    com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar.f152200d = 11348;
                    lVar.f152199c = "/cgi-bin/micromsg-bin/chat_voice_recognize_check";
                    lVar.f152197a = y20Var;
                    lVar.f152198b = new r45.z20();
                    com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                    com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                    iVar.p(a17);
                    iVar.l().q(new wf4.h(bVar));
                } else {
                    long j17 = this.f527208g.f524021e;
                    if (j17 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "has msg svr id: %d", java.lang.Long.valueOf(j17));
                        w21.w0 w0Var = this.f527208g;
                        this.f527205d = new ig4.a(w0Var.f524020d, w0Var.f524024h, this.f527209h, w0Var.f524021e, w0Var.f524018b, this.f527218t, this.f527219u, this.f527220v);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "not existex msg svr id: %d", java.lang.Long.valueOf(j17));
                        w21.w0 w0Var2 = this.f527208g;
                        this.f527205d = new ig4.a(w0Var2.f524020d, w0Var2.f524024h, w0Var2.f524018b, this.f527218t, this.f527219u, this.f527220v);
                    }
                    c01.d9.e().g(this.f527205d);
                    com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
                    this.f527205d.getClass();
                    e17.a(546, this);
                }
                this.B = java.lang.System.currentTimeMillis();
                return;
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "net upload");
                if (!wf4.k.b()) {
                    ig4.a aVar = this.f527205d;
                    if (aVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExtTranslateVoiceEventListener", "request upload must after check!");
                        return;
                    }
                    w21.w0 w0Var3 = this.f527208g;
                    this.f527206e = new ig4.c(w0Var3.f524020d, aVar.f372979r, this.f527209h, w0Var3.f524018b, this.f527218t, this.f527219u, this.f527220v, w0Var3.f524029m, w0Var3.f524040x);
                    c01.d9.e().g(this.f527206e);
                    com.p314xaae8f345.mm.p944x882e457a.r1 e18 = c01.d9.e();
                    this.f527206e.getClass();
                    e18.a(547, this);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "use ilink VoiceInputController to upload voice");
                w21.w0 w0Var4 = this.f527208g;
                java.lang.String voiceId2 = w0Var4.f524020d;
                java.lang.String fileName = w0Var4.f524018b;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f527221w;
                java.lang.String str3 = w0Var4.f524040x;
                int i17 = this.f527209h;
                wf4.c cVar = new wf4.c(this);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId2, "voiceId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUploadVoiceByVoiceInputController voiceId:");
                sb6.append(voiceId2);
                sb6.append(", fileName:");
                sb6.append(fileName);
                sb6.append(", chatUsername:");
                sb6.append(str3);
                sb6.append(", voiceFormat:");
                sb6.append(i17);
                sb6.append(", msgInfo is null:");
                sb6.append(f9Var == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", sb6.toString());
                if (f9Var != null) {
                    str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, fileName, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController fullPath:".concat(str));
                    z17 = false;
                    str2 = "ExtTranslateVoiceEventListenerKtHelper";
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController msgInfo is null, fallback to IFileOperator");
                    try {
                        jVar = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Bi(null, fileName);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController getFileOp failed", e19);
                        jVar = null;
                    }
                    if (jVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController fileOperator is null!");
                        cVar.d(0, 0, "fileOperator is null");
                        return;
                    }
                    int d17 = w21.v0.d(null, fileName);
                    if (d17 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doUploadVoiceByVoiceInputController totalLen <= 0");
                        jVar.b();
                        cVar.d(0, 0, "voice file is empty");
                        return;
                    }
                    w21.t d18 = jVar.d(0, d17);
                    jVar.b();
                    if (d18 == null || d18.f524000d != 0 || d18.f523997a == null || d18.f523998b <= 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doUploadVoiceByVoiceInputController read voice data failed, ret:");
                        sb7.append(d18 != null ? java.lang.Integer.valueOf(d18.f524000d) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", sb7.toString());
                        cVar.d(0, 0, "read voice data failed");
                        return;
                    }
                    com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                    str = lp0.b.h0("voice_trans_upload") + "/voice_raw_" + java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.vfs.w6.S(str, d18.f523997a, 0, d18.f523998b);
                    str2 = "ExtTranslateVoiceEventListenerKtHelper";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doUploadVoiceByVoiceInputController IFileOperator wrote raw file:" + str + ", len:" + d18.f523998b);
                    z17 = true;
                }
                int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
                if (k17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "doUploadVoiceByVoiceInputController fileLength <= 0, rawFilePath:" + str);
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "voice file is empty");
                    return;
                }
                if (w21.v0.h(str, 0, true) && k17 > 1) {
                    com.p314xaae8f345.mm.vfs.r7 r7Var2 = com.p314xaae8f345.mm.vfs.q7.f294674a;
                    java.lang.String str4 = lp0.b.h0("voice_trans_upload") + "/silk_trimmed_" + java.lang.System.currentTimeMillis();
                    byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 1, k17 - 1);
                    wf4.k.a(z17, str);
                    if (N != null) {
                        if (!(N.length == 0)) {
                            com.p314xaae8f345.mm.vfs.w6.S(str4, N, 0, N.length);
                            k17 = N.length;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doUploadVoiceByVoiceInputController silk format, skip first byte, uploadPath:" + str4 + ", fileLength:" + k17);
                            str = str4;
                            z17 = true;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "doUploadVoiceByVoiceInputController read silk data failed");
                    cVar.d(0, 0, "read silk data failed");
                    return;
                }
                try {
                    e70.a0 wi6 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
                    z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(java.lang.System.nanoTime() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
                    a0Var.b(voiceId2);
                    z21.j0 j0Var = new z21.j0(null, new wf4.j(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), z17, str, cVar), str, a0Var, wi6, 39, 0);
                    if (i17 != 0) {
                        z18 = true;
                        if (i17 == 1) {
                            j0Var.i(0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doUploadVoiceByVoiceInputController set encodeType to SPEEX");
                        }
                    } else {
                        z18 = true;
                        j0Var.i(1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doUploadVoiceByVoiceInputController set encodeType to AMR");
                    }
                    j0Var.f551172v = java.lang.System.currentTimeMillis();
                    j0Var.f551166p = z18;
                    j0Var.f551173w = z18;
                    j0Var.f551174x = str3;
                    j0Var.b(k17);
                    if (j0Var.e()) {
                        j0Var.k();
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "doUploadVoiceByVoiceInputController preDoScene failed");
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "preDoScene failed");
                    return;
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "doUploadVoiceByVoiceInputController createStreamController failed");
                    wf4.k.a(z17, str);
                    cVar.d(0, 0, "createStreamController failed");
                    return;
                }
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "net upload more");
                ig4.c cVar2 = this.f527206e;
                if (cVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExtTranslateVoiceEventListener", "upload more need has upload netScene!");
                    return;
                }
                this.f527206e = new ig4.c(cVar2);
                c01.d9.e().g(this.f527206e);
                com.p314xaae8f345.mm.p944x882e457a.r1 e27 = c01.d9.e();
                this.f527206e.getClass();
                e27.a(547, this);
                return;
            case 3:
                if (this.f527210i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "pulling so pass");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "net get");
                this.f527210i = true;
                if (!wf4.k.b()) {
                    if (this.f527205d == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExtTranslateVoiceEventListener", "request get must after check!");
                        return;
                    }
                    this.f527207f = new ig4.b(this.f527208g.f524020d);
                    c01.d9.e().g(this.f527207f);
                    com.p314xaae8f345.mm.p944x882e457a.r1 e28 = c01.d9.e();
                    this.f527207f.getClass();
                    e28.a(548, this);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "use ilink VoiceInputController to poll voice trans result");
                w21.w0 w0Var5 = this.f527208g;
                java.lang.String voiceId3 = w0Var5.f524020d;
                java.lang.String str5 = w0Var5.f524040x;
                int i18 = this.f527209h;
                wf4.d dVar = new wf4.d(this);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId3, "voiceId");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController voiceId:" + voiceId3 + ", chatUsername:" + str5 + ", voiceFormat:" + i18);
                try {
                    e70.a0 wi7 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
                    z21.a0 a0Var2 = new z21.a0(java.lang.String.valueOf(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & java.lang.System.nanoTime()));
                    a0Var2.b(voiceId3);
                    z21.j0 j0Var2 = new z21.j0(null, new wf4.i(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), dVar), "", a0Var2, wi7, 39, 0);
                    if (i18 == 0) {
                        j0Var2.i(1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController set encodeType to AMR");
                    } else if (i18 == 1) {
                        j0Var2.i(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController set encodeType to SPEEX");
                    }
                    j0Var2.f551172v = java.lang.System.currentTimeMillis();
                    j0Var2.f551166p = true;
                    j0Var2.f551173w = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "setSendEmpty voiceId:".concat(voiceId3));
                    j0Var2.f551168r = voiceId3;
                    j0Var2.f551167q = true;
                    j0Var2.f551174x = str5;
                    j0Var2.k();
                    return;
                } catch (java.lang.Exception unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doGetVoiceTransResultByVoiceInputController createStreamController failed");
                    dVar.d(0, 0, "createStreamController failed");
                    return;
                }
            case 4:
                this.f527211m = true;
                return;
            case 5:
            case 7:
            default:
                return;
            case 6:
                if (wf4.k.b()) {
                    this.f527212n = true;
                } else {
                    c01.d9.e().d(this.f527205d);
                    c01.d9.e().d(this.f527206e);
                    c01.d9.e().d(this.f527207f);
                }
                if (this.f527215q) {
                    this.C = true;
                }
                c(null, wf4.f.CANCEL, null);
                return;
            case 8:
            case 9:
                this.C = true;
                c(null, fVar, pvVar);
                return;
            case 10:
                this.C = true;
                c(null, fVar, null);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r8, int r9, java.lang.String r10, com.p314xaae8f345.mm.p944x882e457a.m1 r11) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf4.g.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
