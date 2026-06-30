package ww1;

/* loaded from: classes15.dex */
public class l1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.j1, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.k {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.g f531764q = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("元");

    /* renamed from: r, reason: collision with root package name */
    public static final android.os.HandlerThread f531765r;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaPlayer f531766d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaPlayer f531767e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f531768f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f531769g;

    /* renamed from: h, reason: collision with root package name */
    public int f531770h;

    /* renamed from: i, reason: collision with root package name */
    public int f531771i;

    /* renamed from: m, reason: collision with root package name */
    public long f531772m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f531773n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7 f531774o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f531775p;

    static {
        int i17 = pu5.i.f440006b;
        f531765r = pu5.f.a("syncCreatePlayer", 5);
    }

    public l1() {
        super(0);
        this.f531768f = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f531769g = false;
        this.f531775p = new java.util.HashMap();
    }

    public static void b(ww1.l1 l1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "reset user vol: %s", java.lang.Integer.valueOf(l1Var.f531770h));
        ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).z(3, l1Var.f531770h, 0);
    }

    public static android.media.MediaPlayer c() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "[syncCreatePlayer] %s", myLooper);
        if (myLooper != null && myLooper != android.os.Looper.getMainLooper()) {
            android.os.HandlerThread handlerThread = f531765r;
            if (myLooper != handlerThread.getLooper()) {
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
                java.lang.Object obj = new java.lang.Object();
                android.media.MediaPlayer[] mediaPlayerArr = {null};
                synchronized (obj) {
                    n3Var.mo50293x3498a0(new ww1.e1(mediaPlayerArr, obj));
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
                    }
                }
                return mediaPlayerArr[0];
            }
        }
        return new to.g();
    }

    public static boolean i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "delete files");
        return com.p314xaae8f345.mm.vfs.w6.g(k(), true);
    }

    public static java.lang.String k() {
        return lp0.b.D() + "wallet/voice/";
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3) abstractC20979x809547d1;
        am.h3 h3Var = c5279xf48561e3.f135602g;
        java.lang.String str = h3Var.f88342b;
        java.lang.String str2 = h3Var.f88347g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(h3Var.f88346f);
        am.h3 h3Var2 = c5279xf48561e3.f135602g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "feeType: %s, voiceContent: %s, source: %s, tradeNo: %s, expireVoiceTimestamp: %s F2fRcvVoiceOffLineLogic.OFF_LINE: %s needFailover：%s, business_type : %s, fromByp : %s", str, str2, valueOf, h3Var2.f88343c, h3Var2.f88348h, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i), java.lang.Boolean.valueOf(h3Var2.f88349i), java.lang.Integer.valueOf(h3Var2.f88351k), java.lang.Integer.valueOf(h3Var2.f88350j));
        long j17 = h3Var2.f88345e;
        if (j17 > 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "delay over 1min: %s, tradeNo: %s", java.lang.Long.valueOf(j17), h3Var2.f88343c);
            if (j17 <= u04.d.f505010c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 3L, 1L, false);
            } else if (j17 <= 300000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 4L, 1L, false);
            } else if (j17 <= 600000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 5L, 1L, false);
            } else if (j17 <= 1800000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 6L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 7L, 1L, false);
            }
        }
        long V = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h3Var2.f88348h) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(h3Var2.f88348h, 0L) : 0L;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(V, 0L) ? c01.id.a() / 1000 > V : j17 > 600000) {
            h(c5279xf48561e3, true, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "offline Synthesize delay > 10min or CurrentServerTime > expireVoiceTimestamp");
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h3Var2.f88347g)) {
                r(3, h3Var2.f88343c, l(h3Var2.f88344d), h3Var2.f88347g, h3Var2.f88341a, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().e(), 10, m(c5279xf48561e3));
            } else {
                r(6, h3Var2.f88343c, l(h3Var2.f88344d), h3Var2.f88347g, h3Var2.f88341a, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().e(), 10, m(c5279xf48561e3));
            }
        }
        return false;
    }

    public final int f() {
        return ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).j() ? 1 : 0;
    }

    public final void h(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3, boolean z17, boolean z18) {
        boolean z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "callbackImp() tradeNo:%s useOffline:%s", c5279xf48561e3.f135602g.f88343c, java.lang.Boolean.valueOf(z17));
        am.h3 h3Var = c5279xf48561e3.f135602g;
        long j17 = h3Var.f88345e;
        if (!h3Var.f88344d.equals("wx_f2f")) {
            if (!c5279xf48561e3.f135602g.f88344d.equals("wx_md")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.F2fRcvVoiceListener", "unknown type: %s", c5279xf48561e3.f135602g.f88344d);
                return;
            }
            if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5279xf48561e3.f135602g.f88347g)) {
                ((java.util.HashMap) this.f531775p).put(c5279xf48561e3.f135602g.f88343c, c5279xf48561e3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().l(c5279xf48561e3);
                return;
            }
            am.h3 h3Var2 = c5279xf48561e3.f135602g;
            ww1.u1 u1Var = new ww1.u1(h3Var2.f88341a, 0, null, f531764q, h3Var2.f88343c);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(u1Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "on recv, fee: %s, voice open: %B", java.lang.Integer.valueOf(c5279xf48561e3.f135602g.f88341a), java.lang.Boolean.valueOf(tw1.f.Di().Ri()));
        if (!z18) {
            java.lang.String str = c5279xf48561e3.f135602g.f88343c;
            synchronized (this) {
                z19 = true;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.F2fRcvVoiceListener", "illegal no: %s, not do play", str);
                } else {
                    java.util.List n17 = n();
                    java.util.Iterator it = n().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            n17.add(str);
                            if (n17.size() > 10) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "over max size, do remove");
                                int size = n17.size();
                                n17 = n17.subList(size - 10, size);
                            }
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(n17, ","));
                            z19 = false;
                        } else if (((java.lang.String) it.next()).equals(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "has played tradeno: %s", str);
                            break;
                        }
                    }
                }
            }
            if (z19) {
                return;
            }
        }
        if (c5279xf48561e3.f135602g.f88346f == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 8L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 9L, 1L, false);
        }
        if (z17 && !com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5279xf48561e3.f135602g.f88347g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "init tts");
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().k(false);
        }
        if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5279xf48561e3.f135602g.f88347g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "useOffline");
            ((java.util.HashMap) this.f531775p).put(c5279xf48561e3.f135602g.f88343c, c5279xf48561e3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().l(c5279xf48561e3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "useOnline");
        am.h3 h3Var3 = c5279xf48561e3.f135602g;
        ww1.o1 o1Var = new ww1.o1(h3Var3.f88341a, 0, null, f531764q, h3Var3.f88343c, h3Var3.f88346f, j17);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(o1Var);
    }

    public final int l(java.lang.String str) {
        if (str.equals("wx_f2f")) {
            return 1;
        }
        return str.equals("wx_md") ? 2 : 0;
    }

    public final int m(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3) {
        am.h3 h3Var = c5279xf48561e3.f135602g;
        if (h3Var.f88351k == 0) {
            if (h3Var.f88350j == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype 0, frombyp 1, return 3");
                return 3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype 0, frombyp 0, return 0");
            return 0;
        }
        if (h3Var.f88350j == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype not 0, frombyp 1, return 2");
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype not 0, frombyp 0, return 1");
        return 1;
    }

    public final java.util.List n() {
        java.lang.ref.WeakReference weakReference = this.f531773n;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "refer is null");
            this.f531773n = new java.lang.ref.WeakReference(new java.util.ArrayList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, ""), ",")));
        }
        return (java.util.List) this.f531773n.get();
    }

    public final void o(ww1.k1 k1Var) {
        java.lang.String str = k1Var.f531755a;
        ww1.b1 b1Var = new ww1.b1(this);
        ww1.c1 c1Var = new ww1.c1(this, k1Var);
        ww1.d1 d1Var = new ww1.d1(this, k1Var);
        android.media.MediaPlayer c17 = c();
        c17.setAudioStreamType(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play start mp:%d path:%s", java.lang.Integer.valueOf(c17.hashCode()), str);
        try {
            c17.setDataSource(str);
            c17.setLooping(false);
            c17.setOnErrorListener(new ww1.h1(c17, c1Var));
            c17.setOnCompletionListener(new ww1.i1(str, c17, b1Var));
            c17.prepare();
            c17.start();
            d1Var.a();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(c17.hashCode());
            boolean z17 = true;
            objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
            if (android.os.Looper.getMainLooper() == null) {
                z17 = false;
            }
            objArr[2] = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", objArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.F2fRcvVoiceListener", "play failed path:%s e:%s", str, e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
            c17.release();
            c17 = null;
        }
        this.f531767e = c17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (!(m1Var instanceof ww1.o1)) {
            if (m1Var instanceof ww1.u1) {
                ww1.u1 u1Var = (ww1.u1) m1Var;
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", u1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14404, 3, u1Var.f531839g, 3, "", 2);
                    return;
                }
                if (u1Var.f531837e.f467525d != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14404, 3, u1Var.f531839g, 2, "", 2);
                    return;
                }
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(k());
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (!(m18.a() ? m18.f294799a.r(m18.f294800b) : false)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                        return;
                    }
                }
                java.lang.String str3 = k() + java.util.UUID.randomUUID().toString() + ".tmp";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str3);
                if (!t(str3, u1Var.f531837e.f467527f.f273689a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
                    return;
                }
                ww1.k1 k1Var = new ww1.k1(this, null);
                k1Var.f531755a = str3;
                int i19 = u1Var.f531837e.f467528g;
                k1Var.f531756b = 2;
                this.f531768f.add(k1Var);
                u();
                return;
            }
            return;
        }
        ww1.o1 o1Var = (ww1.o1) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", o1Var);
            q(1, o1Var.f531791g);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o1Var.f531792h == 1 ? 3 : 2);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(o1Var.f531794m);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(f());
            java.lang.String str4 = o1Var.f531791g;
            g0Var.d(15763, str4, 2, valueOf, valueOf2, valueOf3);
            g0Var.d(14404, 3, str4, 3, "", 1);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "overtime: %s retcode: %s", java.lang.Integer.valueOf(o1Var.f531790f.f452625h), java.lang.Integer.valueOf(o1Var.f531790f.f452621d));
        r45.bw bwVar = o1Var.f531790f;
        int i27 = bwVar.f452625h;
        java.lang.String str5 = o1Var.f531791g;
        if (i27 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.F2fRcvVoiceListener", "skip over 10min: %s", java.lang.Long.valueOf(o1Var.f531793i));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14404, 3, str5, 1, "", 1);
            return;
        }
        int i28 = bwVar.f452621d;
        int i29 = o1Var.f531792h;
        if (i28 == 0 && (gVar = bwVar.f452623f) != null) {
            s(1, gVar.f273689a, bwVar.f452624g, str5, i27, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15763, str5, 1, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f531794m), java.lang.Integer.valueOf(f()));
            return;
        }
        if (i28 > 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "retcode > 100, still play default sound");
            q(1, str5);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(14404, 3, str5, 2, "", 1);
            g0Var2.d(15763, str5, 2, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f531794m), java.lang.Integer.valueOf(f()));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i28);
        objArr[1] = o1Var.f531790f.f452623f == null ? "null" : "not null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play default sound only %s %s", objArr);
        q(1, str5);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15763, str5, 2, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f531794m), java.lang.Integer.valueOf(f()));
    }

    public final void q(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
        ww1.k1 k1Var = new ww1.k1(this, null);
        k1Var.f531756b = i17;
        k1Var.f531757c = str;
        this.f531768f.add(k1Var);
        u();
    }

    public final void r(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, java.lang.String str3, int i27, int i28) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7 c7048x4c66d0f7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7();
        this.f531774o = c7048x4c66d0f7;
        c7048x4c66d0f7.f143626d = i17;
        c7048x4c66d0f7.f143627e = c7048x4c66d0f7.b("BiilNo", str, true);
        if (!(i27 == 0)) {
            this.f531774o.f143628f = i27;
        }
        this.f531774o.f143629g = i18;
        if (str2.contains(",")) {
            str2 = str2.replaceAll(",", "").trim();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7 c7048x4c66d0f72 = this.f531774o;
        c7048x4c66d0f72.f143630h = c7048x4c66d0f72.b("content", str2, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7 c7048x4c66d0f73 = this.f531774o;
        c7048x4c66d0f73.f143631i = i19;
        if (i17 == 6) {
            c7048x4c66d0f73.f143632j = c7048x4c66d0f73.b("packId", str3, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7048x4c66d0f7 c7048x4c66d0f74 = this.f531774o;
        c7048x4c66d0f74.f143633k = i28;
        c7048x4c66d0f74.k();
    }

    public final void s(int i17, byte[] bArr, int i18, java.lang.String str, int i19, boolean z17) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(k());
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (!(m18.a() ? m18.f294799a.r(m18.f294800b) : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                return;
            }
        }
        java.lang.String str3 = k() + java.util.UUID.randomUUID().toString() + ".tmp";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str3);
        if (!t(str3, bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
            return;
        }
        ww1.k1 k1Var = new ww1.k1(this, null);
        k1Var.f531755a = str3;
        k1Var.f531756b = i17;
        k1Var.f531757c = str;
        k1Var.f531758d = z17;
        this.f531768f.add(k1Var);
        u();
    }

    public final boolean t(java.lang.String str, byte[] bArr) {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            return com.p314xaae8f345.mm.vfs.w6.S(str, bArr, 0, bArr.length) == 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "sd card not available");
        return false;
    }

    public final synchronized void u() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_f2f_voice_overtime, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "voiceOvertime: %s", java.lang.Long.valueOf(Ui));
        if (this.f531769g) {
            long j17 = this.f531772m;
            if (currentTimeMillis - j17 > Ui) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "last has outdate: %s", java.lang.Long.valueOf(j17));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1143L, 42L, 1L, false);
                this.f531769g = false;
            }
        }
        if (this.f531769g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "is playing, return");
            return;
        }
        this.f531769g = true;
        this.f531772m = java.lang.System.currentTimeMillis();
        ww1.k1 k1Var = (ww1.k1) this.f531768f.poll();
        int g17 = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).g(3);
        this.f531770h = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).h(3);
        this.f531771i = java.lang.Math.round(g17 * 0.5f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "curVol: %s, maxVol: %s, minVol: %s", java.lang.Integer.valueOf(this.f531770h), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(this.f531771i));
        boolean isStreamMute = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).c().isStreamMute(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "isMute: %s", java.lang.Boolean.valueOf(isStreamMute));
        if (this.f531770h == 0 || isStreamMute) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "music channel is mute");
            int i17 = k1Var != null ? k1Var.f531756b : 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 3;
            objArr[1] = k1Var != null ? k1Var.f531757c : "";
            objArr[2] = 5;
            objArr[3] = "";
            objArr[4] = java.lang.Integer.valueOf(i17);
            g0Var.d(14404, objArr);
        }
        int i18 = this.f531770h;
        if (i18 > 0 && i18 < this.f531771i && !isStreamMute) {
            ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).z(3, this.f531771i, 0);
        }
        if (k1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "holder.offLine = %s", java.lang.Boolean.valueOf(k1Var.f531758d));
            if (k1Var.f531758d) {
                o(k1Var);
                if (this.f531769g && this.f531767e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "isPlaying && moneyPlayer == null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "has played");
                }
            } else {
                int i19 = k1Var.f531756b;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k1Var.f531755a)) {
                    this.f531766d = ww1.j1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b_u, new ww1.z0(this, k1Var), new ww1.a1(this, k1Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(699L, 2L, 1L, false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play prefix voice: %d", java.lang.Integer.valueOf(i19));
                    android.media.MediaPlayer a17 = ww1.j1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b_u, new ww1.w0(this, k1Var), new ww1.x0(this, k1Var));
                    this.f531766d = a17;
                    if (a17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "prefix duration: %s", java.lang.Integer.valueOf(a17.getDuration()));
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ww1.y0(this), r0 + 1000);
                    }
                }
            }
        } else {
            this.f531769g = false;
        }
    }
}
