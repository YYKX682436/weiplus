package w21;

/* loaded from: classes12.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: t, reason: collision with root package name */
    public static c01.v8 f523932t;

    /* renamed from: u, reason: collision with root package name */
    public static c01.v8 f523933u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.List f523934v = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523935d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f523936e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f523937f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f523938g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f523939h;

    /* renamed from: i, reason: collision with root package name */
    public int f523940i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f523941m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f523942n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f523943o = false;

    /* renamed from: p, reason: collision with root package name */
    public long f523944p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f523945q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f523946r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new w21.n(this), false);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.q0 f523947s = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: w21.k$$a
        @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
        public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
            int i17;
            w21.k kVar = w21.k.this;
            kVar.getClass();
            dn.m mVar = n1Var.f152639d;
            java.lang.String fileName = kVar.f523937f;
            java.lang.String str = (mVar == null || android.text.TextUtils.isEmpty(mVar.f69595x6d25b0d9)) ? fileName : mVar.f69595x6d25b0d9;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f152638c);
            com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = n1Var.f152636a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "CdnPLCJavaHelperListener fullPath: %s, fileName:%s %s %s", str, fileName, m1Var, valueOf);
            int ordinal = m1Var.ordinal();
            hg0.i iVar = hg0.i.f362858a;
            java.lang.String str2 = kVar.f523939h;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(111L, 57L, 1L, false);
                    if (n1Var.f152641f != null) {
                        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2);
                        w21.j h17 = w21.x0.h(bm5.y.a(w21.x0.k(fileName), bm5.f0.f104106u), kVar.f523938g, fileName, true);
                        if (h17 != null) {
                            i17 = h17.a(str);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn download, fileOperator is null");
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                            i17 = -1;
                        }
                        int u17 = w21.x0.u(fileName, (int) n1Var.f152641f.f69523x17c343e7, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "cdn voice download success %s ret:%s", java.lang.Long.valueOf(n1Var.f152641f.f69523x17c343e7), java.lang.Integer.valueOf(u17));
                        if (i17 < 0 || u17 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn voice Write Failed File:" + fileName + " ret:" + u17 + "newSize: " + i17);
                            hg0.k kVar2 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
                            kVar2.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
                            kVar2.f362864d.computeIfPresent(fileName, iVar);
                            kVar.f523941m = true;
                            kVar.mo807x6c193ac1(kVar.m47995xb7ba1aa7(), kVar.f523935d);
                            w21.u.a(kVar.f523937f, 2, 220, android.os.SystemClock.elapsedRealtime() - kVar.f523944p, R4, null);
                            return;
                        }
                        if (u17 >= 0) {
                            if (u17 != 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn voice download unreachable code");
                                return;
                            }
                            w21.u.a(kVar.f523937f, 2, 100, android.os.SystemClock.elapsedRealtime() - kVar.f523944p, R4, null);
                            kVar.H();
                            kVar.f523935d.mo815x76e0bfae(0, 0, "", kVar);
                            return;
                        }
                        w21.u.a(kVar.f523937f, 2, 225, android.os.SystemClock.elapsedRealtime() - kVar.f523944p, R4, u17 + "");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 229L, 1L, false);
                        kVar.f523935d.mo815x76e0bfae(0, 0, "", kVar);
                        return;
                    }
                    return;
                }
                if (ordinal == 2) {
                    dn.g gVar = n1Var.f152640e;
                    if (gVar != null) {
                        long j17 = gVar.f69496x83ec3dd;
                        if (j17 != gVar.f69500x8ab84c59) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "cdn voice download progress filename:%s %s/%s ret:%s", fileName, java.lang.Long.valueOf(n1Var.f152640e.f69496x83ec3dd), java.lang.Long.valueOf(n1Var.f152640e.f69500x8ab84c59), java.lang.Integer.valueOf(w21.x0.u(fileName, (int) j17, null)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn download error, fallback to cgi download %s", m1Var.name());
            boolean R42 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2);
            java.lang.String str3 = kVar.f523937f;
            int ordinal2 = m1Var.ordinal();
            int i18 = ordinal2 != 0 ? ordinal2 != 10 ? ordinal2 != 6 ? ordinal2 != 7 ? 230 : 232 : 231 : 234 : com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
            long j18 = kVar.f523944p;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            w21.u.a(str3, 2, i18, android.os.SystemClock.elapsedRealtime() - j18, R42, null);
            kVar.f523941m = true;
            hg0.k kVar3 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
            kVar3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
            kVar3.f362864d.computeIfPresent(fileName, iVar);
            java.util.HashMap hashMap = w21.x0.f524044a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "clearDownloadStatus: %s", fileName);
            w21.w0 j19 = w21.x0.j(fileName);
            if (j19 != null) {
                j19.f524023g = 0;
                j19.f524025i = 5;
                j19.f524017a = 80;
                if (!w21.x0.w(j19)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceLogic", "clearDownloadStatus: update storage error %s", fileName);
                }
            }
            com.p314xaae8f345.mm.vfs.w6.h(str);
            kVar.mo807x6c193ac1(kVar.m47995xb7ba1aa7(), kVar.f523935d);
        }
    };

    public k(w21.w0 w0Var) {
        iz5.a.g(null, w0Var != null);
        java.lang.String str = w0Var.f524018b;
        this.f523937f = str;
        iz5.a.g(null, str != null);
        java.lang.String str2 = w0Var.f524032p;
        this.f523938g = str2;
        java.lang.String str3 = w0Var.f524019c;
        this.f523939h = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice[%s]:  file[%s] voiceFormat[%s] user[%s]", toString(), str, str2, str3);
    }

    public final void H() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = w21.x0.k(this.f523937f);
        if (k17 != null) {
            c01.v8 v8Var = f523932t;
            if (v8Var != null) {
                v8Var.a(k17);
            }
            ((ku5.t0) ku5.t0.f394148d).B(new w21.l(this, k17));
            java.util.Iterator it = ((java.util.ArrayList) f523934v).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w21.m(this, (dg0.e) it.next(), k17));
            }
        }
    }

    public final void I(int i17, java.lang.String str) {
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f523939h);
        if (this.f523941m) {
            w21.u.a(this.f523937f, 3, i17, this.f523945q, R4, str);
        } else {
            w21.u.a(this.f523937f, 1, i17, this.f523945q, R4, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        r45.f17 f17Var;
        this.f523935d = u0Var;
        m48011xbb66a70e(sVar);
        java.lang.String str = this.f523937f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
            this.f523940i = fp.k.a() + 10000;
            return -1;
        }
        w21.w0 j17 = w21.x0.j(str);
        if (j17 != null) {
            int i17 = j17.f524025i;
            if (i17 == 5 || i17 == 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + str + " netTimes:" + j17.f524031o);
                if (!w21.x0.c(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:".concat(str));
                    w21.x0.s(str);
                    this.f523940i = fp.k.a() + 10000;
                    return -1;
                }
                int i18 = j17.f524022f;
                int i19 = j17.f524023g;
                int i27 = i18 - i19;
                if (i27 <= 0) {
                    if (j17.f524025i != 5) {
                        w21.x0.u(str, i19, null);
                        this.f523940i = fp.k.a() + 10000;
                        return -1;
                    }
                    this.f523943o = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + str + " Net:" + j17.f524022f + " Local:" + j17.f524023g);
                    this.f523940i = fp.k.a() + 10000;
                    return -1;
                }
                if (j17.f524024h == i18) {
                    this.f523942n = true;
                }
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f523944p = android.os.SystemClock.elapsedRealtime();
                int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceCdnDownloadSwitch", 0);
                java.lang.String str2 = this.f523939h;
                boolean z18 = b17 == 1 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "canUseCdnDownload %s, forceDisableCdn %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f523941m));
                if (!this.f523941m && z18 && (f17Var = j17.f524039w) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17Var.f455464d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f524039w.f455465e)) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(111L, 56L, 1L, false);
                    dn.m mVar = new dn.m();
                    mVar.f69601xaca5bdda = "VoiceData".concat(str);
                    mVar.f69595x6d25b0d9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, str, true).concat("_cdn");
                    mVar.f69592xf1ebe47b = 15;
                    r45.f17 f17Var2 = j17.f524039w;
                    mVar.f69575xf11df5f5 = f17Var2.f455465e;
                    mVar.f69591xf9dbbe9c = f17Var2.f455464d;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(j17.f524019c)) {
                        mVar.f69586x737ec037 = 1;
                    } else {
                        mVar.f69586x737ec037 = 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "startCdnVoiceDownload %s %s %s %s", mVar.f69601xaca5bdda, mVar.f69595x6d25b0d9, mVar.f69575xf11df5f5, mVar.f69591xf9dbbe9c);
                    return ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f523947s)) == null ? -1 : 0;
                }
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.vf0();
                lVar.f152198b = new r45.wf0();
                lVar.f152199c = "/cgi-bin/micromsg-bin/downloadvoice";
                lVar.f152200d = 128;
                lVar.f152201e = 20;
                lVar.f152202f = 1000000020;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                this.f523936e = a17;
                r45.vf0 vf0Var = (r45.vf0) a17.f152243a.f152217a;
                vf0Var.set(3, j17.f524020d);
                vf0Var.set(5, java.lang.Long.valueOf(j17.f524021e));
                vf0Var.set(2, java.lang.Integer.valueOf(i27));
                vf0Var.set(1, java.lang.Integer.valueOf(j17.f524023g));
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                    vf0Var.set(6, str2);
                    vf0Var.set(7, java.lang.Long.valueOf(j17.f524036t));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "[%s]doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", toString(), vf0Var.m75945x2fec8307(3), java.lang.Integer.valueOf(vf0Var.m75939xb282bd08(0)), java.lang.Long.valueOf(vf0Var.m75942xfb822ef2(5)), java.lang.Integer.valueOf(vf0Var.m75939xb282bd08(2)), java.lang.Integer.valueOf(vf0Var.m75939xb282bd08(1)), vf0Var.m75945x2fec8307(6), java.lang.Long.valueOf(vf0Var.m75942xfb822ef2(7)));
                return mo9409x10f9447a(sVar, this.f523936e, this);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:".concat(str));
        this.f523940i = fp.k.a() + 10000;
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 128;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd[");
        sb6.append(toString());
        sb6.append("] file:");
        java.lang.String str2 = this.f523937f;
        sb6.append(str2);
        sb6.append(" + id:");
        sb6.append(i17);
        sb6.append(" errtype:");
        sb6.append(i18);
        sb6.append(" errCode:");
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", sb6.toString());
        long j17 = this.f523945q;
        long j18 = this.f523944p;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f523945q = j17 + (android.os.SystemClock.elapsedRealtime() - j18);
        r45.wf0 wf0Var = (r45.wf0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (wf0Var.m75939xb282bd08(8) == 1) {
            w21.x0.a(null, str2);
            I(240, null);
            return;
        }
        if (i19 == -22) {
            w21.x0.s(str2);
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, null);
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 231L, 1L, false);
            w21.x0.s(str2);
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(223, i19 + "");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 230L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + i18 + " errCode:" + i19 + " resp:" + v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8());
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(224, java.lang.String.format("type:%d;code:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            return;
        }
        int i27 = ((r45.cu5) wf0Var.m75936x14adae67(5)).f453372d;
        wf0Var.m75939xb282bd08(1);
        if (((r45.cu5) wf0Var.m75936x14adae67(5)).f453374f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
            w21.x0.s(str2);
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, null);
            return;
        }
        byte[] g17 = ((r45.cu5) wf0Var.m75936x14adae67(5)).f453374f.g();
        if (g17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
            w21.x0.s(str2);
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, null);
            return;
        }
        bm5.y a17 = bm5.y.a(w21.x0.k(str2), bm5.f0.f104106u);
        java.lang.String str3 = this.f523938g;
        int c17 = w21.x0.h(a17, str3, str2, true).c(g17, g17.length, wf0Var.m75939xb282bd08(1));
        if (c17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + str2 + " ret:" + c17);
            w21.x0.s(str2);
            this.f523935d.mo815x76e0bfae(i18, i19, str, this);
            I(220, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + str2 + " filesize:" + c17 + " voiceFormat:" + str3);
        int u17 = w21.x0.u(str2, c17, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("OnRecvEnd[");
        sb7.append(toString());
        sb7.append("] : file:%s ret:%s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVoice", sb7.toString(), str2, java.lang.Integer.valueOf(u17));
        if (u17 >= 0) {
            if (u17 != 1) {
                long j19 = this.f523942n ? 0L : 1000L;
                this.f523946r.c(j19, j19);
                return;
            } else {
                I(100, null);
                H();
                this.f523935d.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
        }
        I(225, u17 + "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 229L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + str2 + "updateAfterRecv Ret:" + u17);
        this.f523935d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 232L, 1L, false);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.vf0 vf0Var = (r45.vf0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (vf0Var.m75942xfb822ef2(5) != 0 && vf0Var.m75945x2fec8307(3) != null && vf0Var.m75945x2fec8307(3).length() != 0 && vf0Var.m75939xb282bd08(2) > 0 && vf0Var.m75939xb282bd08(1) >= 0) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        w21.x0.s(this.f523937f);
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 233L, 1L, false);
        w21.x0.s(this.f523937f);
    }
}
