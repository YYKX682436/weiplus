package cf0;

@j95.b
/* loaded from: classes12.dex */
public final class z extends i95.w implements df0.s, com.tencent.mm.app.s5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mars.xlog.Log.LogInstance f40862d;

    /* renamed from: e, reason: collision with root package name */
    public int f40863e;

    /* renamed from: h, reason: collision with root package name */
    public volatile d95.b0 f40866h;

    /* renamed from: m, reason: collision with root package name */
    public yz0.b f40868m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f40869n;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f40864f = jz5.h.b(cf0.v.f40858d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f40865g = jz5.h.b(cf0.x.f40860d);

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f40867i = new byte[0];

    public static final boolean wi(cf0.z zVar, int i17) {
        zVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return i17 == 0 && zVar.f40862d != null;
    }

    public final void Ai() {
        if (this.f40866h == null && gm0.j1.a()) {
            synchronized (this.f40867i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThumbPlayerService", "checkResetDb  need reset DB now " + java.lang.Thread.currentThread().getName() + ' ' + java.lang.Thread.currentThread().getId() + ' ' + hashCode());
                if (this.f40866h == null) {
                    Ri();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThumbPlayerService", "resetDB done");
                }
            }
        }
    }

    public qh3.a Bi(rh3.p onePlayContext, wh3.b mediaSource, java.lang.String originMediaId, java.lang.String playMediaId) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(originMediaId, "originMediaId");
        kotlin.jvm.internal.o.g(playMediaId, "playMediaId");
        return new qh3.b(onePlayContext, mediaSource, originMediaId, playMediaId);
    }

    public final ek4.s Di() {
        return (ek4.s) ((jz5.n) this.f40864f).getValue();
    }

    @Override // com.tencent.mm.app.s5
    public void Jb(java.lang.String str) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isReadyForWork()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().pushEvent(14);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th6);
            }
        }
    }

    public boolean Ni() {
        if (this.f40869n == null) {
            this.f40869n = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_tp_play_flag, 1) == 1);
        }
        java.lang.Boolean bool = this.f40869n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void Ri() {
        d95.b0 b0Var;
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        java.lang.Object m521constructorimpl3;
        if (this.f40866h == null) {
            this.f40866h = new d95.b0();
            java.lang.String str = gm0.j1.u().h() + "MMPlayerMediaInfo.db";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(1926226259, cf0.y.f40861a);
            d95.b0 b0Var2 = this.f40866h;
            kotlin.jvm.internal.o.d(b0Var2);
            if (b0Var2.S(str, hashMap, true, true)) {
                return;
            }
            d95.b0 b0Var3 = new d95.b0();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                try {
                    m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(b0Var3.S(str, hashMap, true, true)));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = bool;
                }
                if (!((java.lang.Boolean) m521constructorimpl).booleanValue()) {
                    boolean h17 = com.tencent.mm.vfs.w6.h(str.concat("-wal"));
                    b0Var = new d95.b0();
                    try {
                        if (h17) {
                            try {
                                m521constructorimpl2 = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(b0Var.S(str, hashMap, true, true)));
                            } catch (java.lang.Throwable th7) {
                                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                            }
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                                m521constructorimpl2 = bool2;
                            }
                            if (((java.lang.Boolean) m521constructorimpl2).booleanValue()) {
                                b0Var3 = b0Var;
                            }
                        }
                        boolean h18 = com.tencent.mm.vfs.w6.h(str);
                        b0Var3 = new d95.b0();
                        if (h18) {
                            try {
                                m521constructorimpl3 = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(b0Var3.S(str, hashMap, true, true)));
                            } catch (java.lang.Throwable th8) {
                                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                                m521constructorimpl3 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
                            }
                            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                            if (kotlin.Result.m527isFailureimpl(m521constructorimpl3)) {
                                m521constructorimpl3 = bool3;
                            }
                            ((java.lang.Boolean) m521constructorimpl3).booleanValue();
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                        b0Var3 = b0Var;
                        this.f40866h = b0Var3;
                    }
                }
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th10) {
                th = th10;
                b0Var = b0Var3;
                kotlin.Result.Companion companion52 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                b0Var3 = b0Var;
                this.f40866h = b0Var3;
            }
            this.f40866h = b0Var3;
        }
    }

    @Override // com.tencent.mm.app.s5
    public void k2(java.lang.String str) {
        if (com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().isReadyForWork()) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().pushEvent(13);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th6);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        Ai();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_xlog_open_multi, 0);
        this.f40863e = Ni;
        if (Ni == 0 && this.f40862d == null) {
            com.tencent.mars.xlog.Log.LogInstance openLogInstance = com.tencent.mars.xlog.Log.openLogInstance(2, 0, com.tencent.mm.xlog.app.XLogSetup.cachePath, com.tencent.mm.xlog.app.XLogSetup.logPath, com.tencent.mapsdk.internal.kx.f50210k, 0);
            kotlin.jvm.internal.o.f(openLogInstance, "openLogInstance(...)");
            this.f40862d = openLogInstance;
        }
        com.tencent.thumbplayer.api.TPPlayerMgr.setOnLogListener(new cf0.w(this));
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, -1L);
        long t18 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, -1L);
        com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig = new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig();
        tPProxyServiceConfig.serviceType = 100;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        tPProxyServiceConfig.dataDir = com.tencent.mm.plugin.finder.assist.e9.f102136e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (t17 > 0) {
            jSONObject.put("key_localserver_buffer_size", t17);
        }
        if (t18 > 0) {
            jSONObject.put("key_localserver_send_socket_buffer_size", t18);
        }
        tPProxyServiceConfig.initConfig = jSONObject.toString();
        com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setProxyConfig(tPProxyServiceConfig);
        com.tencent.thumbplayer.api.TPPlayerMgr.initSdk(com.tencent.mm.sdk.platformtools.x2.f193071a, "60303", 1);
        com.tencent.thumbplayer.api.TPPlayerMgr.setProxyEnable(true);
        com.tencent.thumbplayer.api.TPPlayerMgr.setProxyServiceType(100);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_is_enable_mediacodec_stuck_check, 1) == 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_tp_local_server_checker, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbPlayerService", " enableLocalServerCheck: " + fj6 + " mediaCodecStuckCheck: " + z17 + " localserver_buffer_size:" + t17 + " localserver_send_socket_buffer_size:" + t18);
        if (fj6) {
            com.tencent.thumbplayer.api.TPPlayerMgr.setHost(new org.json.JSONObject().put("EnableCheckLocalServer", true).toString());
        }
        com.tencent.mm.app.q5.b().a(this);
        com.tencent.thumbplayer.api.capability.TPCapability.addHDRWhiteList(4, new com.tencent.thumbplayer.api.capability.TPHDRVersionRange(9999999, 0, 99, 0));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ek4.s Di = Di();
        Di.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", "release cdn task controller");
        Di.f253687c.clear();
        Di.f253688d.clear();
        Di.f253685a.clear();
        Di.f253686b.clear();
        Di.f253689e.clear();
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Vi(null);
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Zi(null);
        xh3.h hVar = (xh3.h) ((jz5.n) this.f40865g).getValue();
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "release");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTask downloadTaskListSize:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = hVar.f454581c;
        sb6.append(copyOnWriteArrayList.size());
        sb6.append(" downloadTaskList:");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add("taskId:" + ((yh3.d) it.next()));
        }
        sb6.append(arrayList);
        sb6.append(" preloadTaskListSize:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = hVar.f454580b;
        sb6.append(copyOnWriteArrayList2.size());
        sb6.append(" preloadTaskList:");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (it6.hasNext()) {
            android.support.v4.media.f.a(it6.next());
            arrayList2.add("taskId:null");
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", sb6.toString());
        java.util.Iterator it7 = copyOnWriteArrayList.iterator();
        while (it7.hasNext()) {
            yh3.d dVar = (yh3.d) it7.next();
            kotlin.jvm.internal.o.d(dVar);
            hVar.b(dVar);
        }
        java.util.Iterator it8 = copyOnWriteArrayList2.iterator();
        if (it8.hasNext()) {
            android.support.v4.media.f.a(it8.next());
            kotlin.jvm.internal.o.d(null);
            throw null;
        }
        xh3.d dVar2 = hVar.f454579a;
        if (dVar2 != null) {
            com.tencent.mm.plugin.appbrand.video.player.thumb.b0 b0Var = (com.tencent.mm.plugin.appbrand.video.player.thumb.b0) dVar2;
            b0Var.f90870e = null;
            b0Var.f90869d = null;
        } else {
            ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ri(null);
            ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ui(null);
        }
        if (this.f40866h != null) {
            d95.b0 b0Var2 = this.f40866h;
            if (b0Var2 != null) {
                b0Var2.L();
            }
            this.f40866h = null;
        }
        com.tencent.mm.app.q5.b().e(this);
    }
}
