package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f96177i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f96178j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f96179k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f96180l;

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.plugin.collect.model.voice.m f96181m;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.collect.model.voice.t f96183b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f96185d;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f96187f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f96188g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96189h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f96182a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.collect.model.voice.j f96184c = new com.tencent.mm.plugin.collect.model.voice.j(this, new com.tencent.mm.plugin.collect.model.voice.e(this));

    /* renamed from: e, reason: collision with root package name */
    public int f96186e = 0;

    static {
        java.lang.String str = lp0.b.X() + "files/wxofflinevoicenew/";
        f96178j = str;
        f96179k = str + "libreadMoney.so";
        f96180l = str + "woman_putonghua.pos";
    }

    public m() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f96187f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$2
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = checkResUpdateCacheFileEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent callback");
                if (checkResUpdateCacheFileEvent2.f54053g.f7759a == 60) {
                    synchronized (com.tencent.mm.plugin.collect.model.voice.m.this.f96182a) {
                        am.r2 r2Var = checkResUpdateCacheFileEvent2.f54053g;
                        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent resTyep:%s subType:%s md5:%s fileVersion:%s", java.lang.Integer.valueOf(checkResUpdateCacheFileEvent2.f54053g.f7759a), java.lang.Integer.valueOf(checkResUpdateCacheFileEvent2.f54053g.f7760b), r2Var.f7764f, java.lang.Integer.valueOf(r2Var.f7762d));
                        int i17 = checkResUpdateCacheFileEvent2.f54053g.f7760b;
                        if (i17 != 1) {
                            if (i17 == 3) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent subType == RES_SUB_TYPE_RES");
                                java.lang.String str = com.tencent.mm.plugin.collect.model.voice.m.f96180l;
                                if (com.tencent.mm.vfs.w6.j(str)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " file exists，first delete exist file");
                                    com.tencent.mm.vfs.w6.h(str);
                                }
                                com.tencent.mm.vfs.w6.c(checkResUpdateCacheFileEvent2.f54053g.f7761c, str);
                                com.tencent.mm.plugin.collect.model.voice.m.o("0", checkResUpdateCacheFileEvent2.f54053g.f7764f);
                            }
                            if (com.tencent.mm.plugin.collect.model.voice.m.f96177i) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent OFF_LINE == true, do not reInit Synthesizer");
                            } else {
                                com.tencent.mm.plugin.collect.model.voice.m.this.m();
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f96188g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent>(a0Var) { // from class: com.tencent.mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic$3
            {
                this.__eventId = 788171318;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent reInitVoiceOffLineSynthesizerEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ReInitVoiceOffLineSynthesizerEvent");
                synchronized (com.tencent.mm.plugin.collect.model.voice.m.this.f96182a) {
                    tw1.f.Di().Ri();
                    com.tencent.mm.plugin.collect.model.voice.m.this.m();
                }
                return false;
            }
        };
        this.f96189h = false;
    }

    public static int c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        java.lang.String str5 = f96178j + str4 + ".pos";
        c2CDownloadRequest.fileKey = str4;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.setSavePath(str5);
        c2CDownloadRequest.fileType = 101;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c2CDownloadRequest.taskStartTime = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voice resource download beginTime : %s", java.lang.Long.valueOf(currentTimeMillis));
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startURLDownload(c2CDownloadRequest, new com.tencent.mm.plugin.collect.model.voice.h(currentTimeMillis, str2, str5, str4, str, str3));
    }

    public static com.tencent.mm.plugin.collect.model.voice.m d() {
        synchronized (com.tencent.mm.plugin.collect.model.voice.m.class) {
            if (f96181m == null) {
                f96181m = new com.tencent.mm.plugin.collect.model.voice.m();
            }
        }
        return f96181m;
    }

    public static java.lang.String f() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
    }

    public static java.lang.String g(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.o4.M("voice_offline_res_new").getString(str + com.tencent.mapsdk.internal.ep.f49376u, "");
    }

    public static java.lang.String h(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.o4.M("voice_offline_res_new").getString(str + com.tencent.mapsdk.internal.ep.f49375t, "");
    }

    public static void n(java.lang.String str) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, str);
        new com.tencent.mm.autogen.events.ReInitVoiceOffLineSynthesizerEvent().e();
    }

    public static void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("voice_offline_res_new");
        M.getClass();
        java.lang.String str3 = str + com.tencent.mapsdk.internal.ep.f49376u;
        if (str2 == null) {
            str2 = "";
        }
        M.putString(str3, str2);
    }

    public final boolean a() {
        return com.tencent.mm.vfs.w6.j(f96180l) ? p(g("0")) : b();
    }

    public final boolean b() {
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(60, 3);
        boolean j17 = com.tencent.mm.vfs.w6.j(Bi);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j17);
        java.lang.String str = f96180l;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResFromCache() %s no exist, cacheExist: %s", str, valueOf);
        if (j17) {
            long d17 = com.tencent.mm.vfs.w6.d(Bi, str, false);
            o("0", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile VOICE_DEFAULT_RES_PATH result == %s", java.lang.Long.valueOf(d17));
            if (!com.tencent.mm.sdk.platformtools.t8.B0(d17, -1L)) {
                java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(60, 3);
                o("0", Ni);
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResEnviroment() getOriginalMd5() resMd5:%s", Ni);
                return p(Ni);
            }
        }
        return false;
    }

    public java.lang.String e() {
        return com.tencent.mm.sdk.platformtools.t8.D0(this.f96185d, "woman_putonghua") ? "0" : this.f96185d;
    }

    public void i() {
        synchronized (this.f96182a) {
            if (f96177i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() OFF_LINE == true");
                return;
            }
            tw1.f.Di().Ri();
            this.f96188g.alive();
            if (j()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() success!! ");
                f96177i = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() fail!! ");
                f96177i = false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.collect.model.voice.m.j():boolean");
    }

    public void k(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", " begin initTTS()，delay：%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.collect.model.voice.f(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "initTTS");
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.collect.model.voice.g(this), "initTTS");
        }
    }

    public void l(com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent) {
        com.tencent.mm.plugin.collect.model.voice.i iVar = new com.tencent.mm.plugin.collect.model.voice.i(this, collectRcvVoiceEvent);
        this.f96184c.f96176b.add(iVar);
        com.tencent.mm.plugin.collect.model.voice.p pVar = this.f96183b.f96204a;
        if (!pVar.f96197f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
            return;
        }
        java.lang.Thread thread = pVar.f96194c;
        if (thread != null && thread.isAlive()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:ErrorCode.TTS_START_ERROR ");
            return;
        }
        java.lang.String str = iVar.f96174d;
        if (str == null || str.length() > 1024) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.InnerSynthesizer", "start failed:TTS_TEXT_ERROR");
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        pVar.f96196e = str;
        pVar.f96198g = false;
        java.lang.Thread thread2 = new java.lang.Thread(pVar.f96193b);
        pVar.f96194c = thread2;
        thread2.start();
    }

    public final void m() {
        if (j()) {
            f96177i = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() success!!");
        } else {
            f96177i = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() fail!!");
        }
    }

    public final boolean p(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "null" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() resMd5:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        java.lang.String str2 = f96180l;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes() %s md5:%s", str2, com.tencent.mm.vfs.w6.p(str2));
        if (str.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(str2))) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1143L, 30L, 1L, false);
        com.tencent.mm.vfs.w6.h(str2);
        o("0", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "verifyDefaultRes autoDownloadDefaultResNum:%s", java.lang.Integer.valueOf(this.f96186e));
        int i17 = this.f96186e;
        if (i17 >= 5) {
            return false;
        }
        this.f96186e = i17 + 1;
        return b();
    }
}
