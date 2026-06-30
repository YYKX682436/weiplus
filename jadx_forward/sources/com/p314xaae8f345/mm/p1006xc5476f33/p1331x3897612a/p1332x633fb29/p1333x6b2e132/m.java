package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f177710i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f177711j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f177712k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f177713l;

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m f177714m;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.t f177716b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177718d;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f177720f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f177721g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f177722h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f177715a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.j f177717c = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.j(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.e(this));

    /* renamed from: e, reason: collision with root package name */
    public int f177719e = 0;

    static {
        java.lang.String str = lp0.b.X() + "files/wxofflinevoicenew/";
        f177711j = str;
        f177712k = str + "libreadMoney.so";
        f177713l = str + "woman_putonghua.pos";
    }

    public m() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f177720f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$2
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd2 = c5255x5f3208fd;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent callback");
                if (c5255x5f3208fd2.f135586g.f89292a == 60) {
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.this.f177715a) {
                        am.r2 r2Var = c5255x5f3208fd2.f135586g;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent resTyep:%s subType:%s md5:%s fileVersion:%s", java.lang.Integer.valueOf(c5255x5f3208fd2.f135586g.f89292a), java.lang.Integer.valueOf(c5255x5f3208fd2.f135586g.f89293b), r2Var.f89297f, java.lang.Integer.valueOf(r2Var.f89295d));
                        int i17 = c5255x5f3208fd2.f135586g.f89293b;
                        if (i17 != 1) {
                            if (i17 == 3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent subType == RES_SUB_TYPE_RES");
                                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177713l;
                                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " file exists，first delete exist file");
                                    com.p314xaae8f345.mm.vfs.w6.h(str);
                                }
                                com.p314xaae8f345.mm.vfs.w6.c(c5255x5f3208fd2.f135586g.f89294c, str);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.o("0", c5255x5f3208fd2.f135586g.f89297f);
                            }
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.f177710i) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent OFF_LINE == true, do not reInit Synthesizer");
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.this.m();
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f177721g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5869x52e0a426>(a0Var) { // from class: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$3
            {
                this.f39173x3fe91575 = 788171318;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5869x52e0a426 c5869x52e0a426) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ReInitVoiceOffLineSynthesizerEvent");
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.this.f177715a) {
                    tw1.f.Di().Ri();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.this.m();
                }
                return false;
            }
        };
        this.f177722h = false;
    }

    public static int c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        java.lang.String str5 = f177711j + str4 + ".pos";
        c2CDownloadRequest.f17792xcd096f43 = str4;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.m37861xfb0731c4(str5);
        c2CDownloadRequest.f17793xd428dad6 = 101;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c2CDownloadRequest.f17840xf3a4da4a = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download beginTime : %s", java.lang.Long.valueOf(currentTimeMillis));
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37792x608fc155(c2CDownloadRequest, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.h(currentTimeMillis, str2, str5, str4, str, str3));
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m d() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.class) {
            if (f177714m == null) {
                f177714m = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m();
            }
        }
        return f177714m;
    }

    public static java.lang.String f() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
    }

    public static java.lang.String g(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("voice_offline_res_new").getString(str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130909u, "");
    }

    public static java.lang.String h(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("voice_offline_res_new").getString(str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130908t, "");
    }

    public static void n(java.lang.String str) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5869x52e0a426().e();
    }

    public static void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("voice_offline_res_new");
        M.getClass();
        java.lang.String str3 = str + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130909u;
        if (str2 == null) {
            str2 = "";
        }
        M.putString(str3, str2);
    }

    public final boolean a() {
        return com.p314xaae8f345.mm.vfs.w6.j(f177713l) ? p(g("0")) : b();
    }

    public final boolean b() {
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(60, 3);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(Bi);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j17);
        java.lang.String str = f177713l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResFromCache() %s no exist, cacheExist: %s", str, valueOf);
        if (j17) {
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(Bi, str, false);
            o("0", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile VOICE_DEFAULT_RES_PATH result == %s", java.lang.Long.valueOf(d17));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(d17, -1L)) {
                java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(60, 3);
                o("0", Ni);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResEnviroment() getOriginalMd5() resMd5:%s", Ni);
                return p(Ni);
            }
        }
        return false;
    }

    public java.lang.String e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f177718d, "woman_putonghua") ? "0" : this.f177718d;
    }

    public void i() {
        synchronized (this.f177715a) {
            if (f177710i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() OFF_LINE == true");
                return;
            }
            tw1.f.Di().Ri();
            this.f177721g.mo48813x58998cd();
            if (j()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() success!! ");
                f177710i = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() fail!! ");
                f177710i = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.j():boolean");
    }

    public void k(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " begin initTTS()，delay：%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.f(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "initTTS");
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.g(this), "initTTS");
        }
    }

    public void l(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.i(this, c5279xf48561e3);
        this.f177717c.f177709b.add(iVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.p pVar = this.f177716b.f177737a;
        if (!pVar.f177730f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
            return;
        }
        java.lang.Thread thread = pVar.f177727c;
        if (thread != null && thread.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
            return;
        }
        java.lang.String str = iVar.f177707d;
        if (str == null || str.length() > 1024) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:TTS_TEXT_ERROR");
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        pVar.f177729e = str;
        pVar.f177731g = false;
        java.lang.Thread thread2 = new java.lang.Thread(pVar.f177726b);
        pVar.f177727c = thread2;
        thread2.start();
    }

    public final void m() {
        if (j()) {
            f177710i = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() success!!");
        } else {
            f177710i = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() fail!!");
        }
    }

    public final boolean p(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "null" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() resMd5:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        java.lang.String str2 = f177713l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() %s md5:%s", str2, com.p314xaae8f345.mm.vfs.w6.p(str2));
        if (str.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(str2))) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1143L, 30L, 1L, false);
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        o("0", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes autoDownloadDefaultResNum:%s", java.lang.Integer.valueOf(this.f177719e));
        int i17 = this.f177719e;
        if (i17 >= 5) {
            return false;
        }
        this.f177719e = i17 + 1;
        return b();
    }
}
