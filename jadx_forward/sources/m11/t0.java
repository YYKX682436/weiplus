package m11;

/* loaded from: classes12.dex */
public class t0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, k70.b0 {
    public static final boolean E;
    public boolean A;
    public java.lang.String B;
    public int C;
    public final com.p314xaae8f345.mm.p947xba6de98f.q0 D;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404310d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.v0 f404311e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f404312f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f404313g;

    /* renamed from: h, reason: collision with root package name */
    public final long f404314h;

    /* renamed from: i, reason: collision with root package name */
    public final long f404315i;

    /* renamed from: m, reason: collision with root package name */
    public final long f404316m;

    /* renamed from: n, reason: collision with root package name */
    public int f404317n;

    /* renamed from: o, reason: collision with root package name */
    public final int f404318o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p959x883644fd.q f404319p;

    /* renamed from: q, reason: collision with root package name */
    public final long f404320q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f404321r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f404322s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f404323t;

    /* renamed from: u, reason: collision with root package name */
    public long f404324u;

    /* renamed from: v, reason: collision with root package name */
    public int f404325v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f404326w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f404327x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f404328y;

    /* renamed from: z, reason: collision with root package name */
    public int f404329z;

    static {
        boolean z17 = false;
        if ("1".equals(j62.e.g().a("clicfg_c2c_wxam_recv", "0", false, true)) || z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("recvC2CImageUseWxam", true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetMsgImg", "recvC2CImageUseWxam, use = " + z17);
        E = z17;
    }

    public t0(long j17, long j18, java.lang.String str, int i17, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var) {
        this(j17, j18, str, i17, v0Var, -1);
    }

    public final boolean H(m11.b0 b0Var, java.lang.String str, long j17) {
        java.lang.String str2;
        java.lang.String str3;
        dn.m mVar;
        g83.c cVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b0Var.f404185t)) {
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(b0Var.f404185t, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f404310d, "parse cdnInfo failed. [%s]", b0Var.f404185t);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f404310d, "img cdn info %s", b0Var.f404185t);
        j15.d dVar = new j15.d();
        dVar.m126728xdc93280d(b0Var.f404185t);
        this.f404329z = 0;
        if (this.f404318o != 1) {
            str2 = (java.lang.String) d17.get(".msg.img.$cdnmidimgurl");
            this.f404329z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0);
        } else {
            str2 = (java.lang.String) d17.get(".msg.img.$cdnbigimgurl");
            this.f404329z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$hdlength"), 0);
        }
        java.lang.String str4 = str2;
        if (this.f404318o != 1) {
            str3 = (java.lang.String) d17.get(".msg.img.$tpurl");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                this.f404329z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$tplength"), 0);
            }
        } else {
            str3 = (java.lang.String) d17.get(".msg.img.$tphdurl");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                this.f404329z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$tphdlength"), 0);
            }
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.img.$hevc_mid_size"), 0);
        if (this.f404329z <= 1 && P >= 0) {
            this.f404329z = P;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(this.f404322s.I0()));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.o().j()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.o().A())) {
            hashMap.put("source_format", java.lang.String.valueOf(2));
        } else {
            hashMap.put("source_format", java.lang.String.valueOf(1));
            if (dVar.o().r() == 0) {
                hashMap.put("source_filesize", java.lang.String.valueOf(dVar.o().r()));
            } else {
                hashMap.put("source_filesize", java.lang.String.valueOf(dVar.o().z()));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f404310d, "cdntra get cdnUrlfailed.");
            return false;
        }
        java.lang.String str5 = (java.lang.String) d17.get(".msg.img.$aeskey");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f404310d, "cdntra get aes key failed.");
            return false;
        }
        this.f404323t = com.p314xaae8f345.mm.p947xba6de98f.i2.b("downimg", b0Var.f404179n, this.f404322s.Q0(), "" + this.f404322s.m124847x74d37ac6());
        boolean z17 = this.f404326w && ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ni();
        if (z17) {
            this.f404323t += "_hevc";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f404323t)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f404310d, "cdntra genClientId failed not use cdn imgLocalId:%d", java.lang.Long.valueOf(this.f404316m));
            return false;
        }
        java.lang.String str6 = (java.lang.String) d17.get(".msg.img.$md5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(".msg.img.$cdnbigimgurl")) || this.f404318o == 1)) {
            synchronized (g83.c.class) {
                if (g83.c.f351078a == null) {
                    g83.c.f351078a = new g83.c();
                }
                cVar = g83.c.f351078a;
            }
            cVar.getClass();
            gm0.j1.b().c();
            java.lang.String g17 = ((lf3.q) ((nf3.e) i95.n0.c(nf3.e.class))).wi().g(str6, this.f404329z);
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(g17);
            int i17 = this.f404329z;
            int i18 = i17 - k17;
            java.lang.String str7 = this.f404310d;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = str6;
            objArr[2] = d17.get(".msg.img.$cdnbigimgurl");
            objArr[3] = java.lang.Boolean.valueOf(this.f404318o == 1);
            objArr[4] = java.lang.Integer.valueOf(k17);
            objArr[5] = g17;
            objArr[6] = java.lang.Integer.valueOf(i18);
            objArr[7] = this.f404328y;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && i18 >= 0 && i18 <= 16) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f404310d, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", g17, this.f404328y, java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(g17, this.f404328y) && com.p314xaae8f345.mm.vfs.w6.d(g17, this.f404328y, false) >= 0));
                int i19 = this.f404329z;
                I(b0Var, i19, i19, 0, null);
                if (this.f404322s != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(this.f404322s.Q0(), "update", this.f404322s, 0));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13267, str4, java.lang.Long.valueOf(this.f404322s.I0()), str6, java.lang.Long.valueOf(this.f404322s.mo78012x3fdd41df() / 1000), this.f404322s.Q0(), 3, java.lang.Integer.valueOf(k17));
                return true;
            }
        }
        this.B = str6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f404310d, "checkUseCdn: %s, %s", java.lang.Boolean.valueOf(this.f404326w), java.lang.Boolean.valueOf(z17));
        dn.m mVar2 = new dn.m();
        if (z17) {
            mVar2.f323318d = "task_NetSceneGetMsgImg_1";
            mVar2.f69601xaca5bdda = this.f404323t;
            mVar2.f69616xe9780272 = new int[]{1, 2};
        } else {
            mVar2.f323318d = "task_NetSceneGetMsgImg_2";
            mVar2.f69601xaca5bdda = this.f404323t;
            mVar2.f69616xe9780272 = new int[]{1};
        }
        mVar2.f69595x6d25b0d9 = this.f404328y;
        int i27 = this.f404325v;
        mVar2.f69592xf1ebe47b = i27;
        mVar2.f69620xeb1a61d6 = this.f404329z;
        if (i27 == 2) {
            mVar2.f69624xed1c3543 = P;
        }
        mVar2.f69575xf11df5f5 = str5;
        mVar2.f69591xf9dbbe9c = str4;
        mVar2.f69609xd84b8349 = 2;
        mVar2.f69586x737ec037 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f404322s.Q0()) ? 1 : 0;
        mVar2.f323323i = this.C;
        mVar2.f69593x419c9c3d = str6;
        mVar2.j(this.f404310d, hashMap);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            java.lang.String str8 = (java.lang.String) d17.get(".msg.img.$tpauthkey");
            mVar2.f69592xf1ebe47b = 19;
            mVar2.f69582x4e093552 = str8;
            mVar2.f323344z = str3;
            mVar2.f69591xf9dbbe9c = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f404310d, "cdnautostart %s %b", "image_" + this.f404322s.m124847x74d37ac6(), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.contains("image_" + this.f404322s.m124847x74d37ac6())));
        if (com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.contains("image_" + this.f404322s.m124847x74d37ac6())) {
            com.p314xaae8f345.mm.p947xba6de98f.s1.fj().f152530u.remove("image_" + this.f404322s.m124847x74d37ac6());
            mVar2.f69583xfebd470e = true;
        } else if (mVar2.f323323i != 0) {
            mVar2.f69583xfebd470e = true;
        } else {
            mVar2.f69583xfebd470e = false;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnDownload taskInfo field_mediaId:" + mVar2.f69601xaca5bdda);
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 d76 = aj6 != null ? aj6.d7(mVar2) : null;
        if (d76 != null) {
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.d0(d76, weakReference, null), 1, null);
            }
            mVar = mVar2;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f404310d, "add recv task");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 196L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f404310d, "addRecvTask failed :%s", this.f404323t);
        this.f404323t = "";
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(final m11.b0 r25, int r26, int r27, int r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.t0.I(m11.b0, int, int, int, byte[]):boolean");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f404323t) && com.p314xaae8f345.mm.p947xba6de98f.s1.fj() != null) {
            java.lang.String mediaId = this.f404323t;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.D);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:".concat(mediaId));
            com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 U6 = aj6 != null ? aj6.U6(mediaId) : null;
            if (U6 != null && (c20976x6ba6452a = gm0.j1.b().f354778h.f354678e) != null) {
                v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.b0(U6, weakReference, null), 1, null);
            }
        }
        super.mo9408xae7a2e7a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f404312f = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f404313g;
        r45.fj3 fj3Var = (r45.fj3) oVar.f152243a.f152217a;
        m11.l0 Di = m11.b1.Di();
        long j17 = this.f404316m;
        m11.b0 C1 = Di.C1(java.lang.Long.valueOf(j17));
        long j18 = C1.f404166a;
        java.lang.String str = this.f404310d;
        if (j18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 195L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doScene id:%d  img:%s", java.lang.Long.valueOf(j17), C1);
            return -1;
        }
        if (C1.f404181p != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 194L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSceneError, id:%d, status:%d", java.lang.Long.valueOf(C1.f404166a), java.lang.Integer.valueOf(C1.f404181p));
            return -1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f404322s;
        if (tg3.s1.a(f9Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "doSceneError, isUnreadMediaExpired id:%d, msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(C1.f404166a), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
            return -1;
        }
        java.lang.String str2 = C1.f404170e;
        int i17 = this.f404318o;
        if (str2 == null || !str2.startsWith("SERVERID://")) {
            this.f404327x = C1.f404170e;
            this.f404328y = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f404322s, bm5.c0.f104083a.d(C1.l()), this.f404327x, null, "");
        } else {
            if (i17 == 1) {
                this.f404327x = kk.k.g((C1.f404170e + "_hd").getBytes());
            } else {
                this.f404327x = kk.k.g(C1.f404170e.getBytes());
            }
            sx.c0 c0Var = (sx.c0) i95.n0.c(sx.c0.class);
            java.lang.String str3 = this.f404327x;
            ((rx.j) c0Var).getClass();
            com.p314xaae8f345.mm.p947xba6de98f.b1 bj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.bj();
            this.f404328y = bj6 != null ? bj6.T6(str3) : null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", java.lang.Long.valueOf(C1.f404166a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(C1.f404168c), java.lang.Integer.valueOf(C1.f404169d), str2, this.f404327x, this.f404328y);
        if (this.f404324u == 0) {
            this.f404324u = java.lang.System.currentTimeMillis();
            this.f404325v = i17 != 1 ? 2 : 1;
        }
        if (H(C1, fj3Var.f455928e.f454289d, fj3Var.f455934n)) {
            return 0;
        }
        C1.n("");
        m11.b1.Di().F4(java.lang.Long.valueOf(j17), C1);
        fj3Var.f455931h = C1.f404168c;
        fj3Var.f455932i = this.f404317n;
        fj3Var.f455930g = C1.f404169d;
        com.p314xaae8f345.mm.p959x883644fd.q qVar = this.f404319p;
        if (qVar != null) {
            if (qVar.f153079d == 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                qVar.f153076a = java.lang.System.currentTimeMillis();
                qVar.f153080e = android.os.SystemClock.elapsedRealtime();
            }
            qVar.f153079d++;
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 109;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r17, int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p971x6de15a2e.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.t0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return this.f404318o == 0 ? 100 : 1280;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public t0(long j17, long j18, java.lang.String str, int i17, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var, int i18) {
        this.f404310d = "MicroMsg.NetSceneGetMsgImg";
        this.f404315i = -1L;
        this.f404319p = null;
        this.f404322s = null;
        this.f404323t = "";
        this.f404324u = 0L;
        this.f404325v = 0;
        this.f404326w = true;
        this.f404327x = "";
        this.f404328y = "";
        this.f404329z = 0;
        this.A = false;
        this.B = null;
        this.C = 0;
        this.D = new m11.v0(this);
        iz5.a.g(null, j17 >= 0 && j18 >= 0 && v0Var != null);
        this.f404311e = v0Var;
        this.f404318o = i17;
        this.f404314h = j17;
        this.f404315i = j17;
        this.f404316m = j17;
        this.f404320q = j18;
        this.f404321r = str;
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j17));
        if (i17 == 1) {
            long j19 = C1.f404182q;
            this.f404316m = j19;
            C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j19));
        }
        this.f404310d = "MicroMsg.NetSceneGetMsgImg[" + this.f404316m + "]";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fj3();
        lVar.f152198b = new r45.gj3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getmsgimg";
        lVar.f152200d = 109;
        lVar.f152201e = 10;
        lVar.f152202f = 1000000010;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f404313g = a17;
        r45.fj3 fj3Var = (r45.fj3) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j18);
        this.f404322s = Li;
        fj3Var.f455931h = C1.f404168c;
        fj3Var.f455930g = C1.f404169d;
        fj3Var.f455934n = Li.I0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = Li.Q0();
        du5Var.f454290e = true;
        fj3Var.f455928e = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = (java.lang.String) gm0.j1.u().c().l(2, null);
        du5Var2.f454290e = true;
        fj3Var.f455929f = du5Var2;
        fj3Var.f455933m = i17;
        int i19 = C1.f404168c;
        if (i19 == 0) {
            this.f404319p = new com.p314xaae8f345.mm.p959x883644fd.q(109, false, C1.f404169d);
        }
        this.f404317n = 8192;
        if (v0Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m11.u0(this, v0Var, i19, C1.f404169d));
        }
    }
}
