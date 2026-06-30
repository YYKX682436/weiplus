package cf0;

@j95.b
/* loaded from: classes12.dex */
public final class z extends i95.w implements df0.s, com.p314xaae8f345.mm.app.s5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 f122395d;

    /* renamed from: e, reason: collision with root package name */
    public int f122396e;

    /* renamed from: h, reason: collision with root package name */
    public volatile d95.b0 f122399h;

    /* renamed from: m, reason: collision with root package name */
    public yz0.b f122401m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f122402n;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f122397f = jz5.h.b(cf0.v.f122391d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f122398g = jz5.h.b(cf0.x.f122393d);

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f122400i = new byte[0];

    public static final boolean wi(cf0.z zVar, int i17) {
        zVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return i17 == 0 && zVar.f122395d != null;
    }

    public final void Ai() {
        if (this.f122399h == null && gm0.j1.a()) {
            synchronized (this.f122400i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbPlayerService", "checkResetDb  need reset DB now " + java.lang.Thread.currentThread().getName() + ' ' + java.lang.Thread.currentThread().getId() + ' ' + hashCode());
                if (this.f122399h == null) {
                    Ri();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbPlayerService", "resetDB done");
                }
            }
        }
    }

    public qh3.a Bi(rh3.p onePlayContext, wh3.b mediaSource, java.lang.String originMediaId, java.lang.String playMediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originMediaId, "originMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playMediaId, "playMediaId");
        return new qh3.b(onePlayContext, mediaSource, originMediaId, playMediaId);
    }

    public final ek4.s Di() {
        return (ek4.s) ((jz5.n) this.f122397f).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.app.s5
    public void Jb(java.lang.String str) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102414xccc05ea1()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102416xd0c233a0(14);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th6);
            }
        }
    }

    public boolean Ni() {
        if (this.f122402n == null) {
            this.f122402n = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_tp_play_flag, 1) == 1);
        }
        java.lang.Boolean bool = this.f122402n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void Ri() {
        d95.b0 b0Var;
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        java.lang.Object m143895xf12298133;
        if (this.f122399h == null) {
            this.f122399h = new d95.b0();
            java.lang.String str = gm0.j1.u().h() + "MMPlayerMediaInfo.db";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(1926226259, cf0.y.f122394a);
            d95.b0 b0Var2 = this.f122399h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var2);
            if (b0Var2.S(str, hashMap, true, true)) {
                return;
            }
            d95.b0 b0Var3 = new d95.b0();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                try {
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(b0Var3.S(str, hashMap, true, true)));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = bool;
                }
                if (!((java.lang.Boolean) m143895xf1229813).booleanValue()) {
                    boolean h17 = com.p314xaae8f345.mm.vfs.w6.h(str.concat("-wal"));
                    b0Var = new d95.b0();
                    try {
                        if (h17) {
                            try {
                                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(b0Var.S(str, hashMap, true, true)));
                            } catch (java.lang.Throwable th7) {
                                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                            }
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132)) {
                                m143895xf12298132 = bool2;
                            }
                            if (((java.lang.Boolean) m143895xf12298132).booleanValue()) {
                                b0Var3 = b0Var;
                            }
                        }
                        boolean h18 = com.p314xaae8f345.mm.vfs.w6.h(str);
                        b0Var3 = new d95.b0();
                        if (h18) {
                            try {
                                m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(b0Var3.S(str, hashMap, true, true)));
                            } catch (java.lang.Throwable th8) {
                                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8));
                            }
                            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298133)) {
                                m143895xf12298133 = bool3;
                            }
                            ((java.lang.Boolean) m143895xf12298133).booleanValue();
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                        b0Var3 = b0Var;
                        this.f122399h = b0Var3;
                    }
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th10) {
                th = th10;
                b0Var = b0Var3;
                p3321xbce91901.C29043x91b2b43d.Companion companion52 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                b0Var3 = b0Var;
                this.f122399h = b0Var3;
            }
            this.f122399h = b0Var3;
        }
    }

    @Override // com.p314xaae8f345.mm.app.s5
    public void k2(java.lang.String str) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102414xccc05ea1()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102416xd0c233a0(13);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th6);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        Ai();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_xlog_open_multi, 0);
        this.f122396e = Ni;
        if (Ni == 0 && this.f122395d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 m40541x1b68a74f = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40541x1b68a74f(2, 0, com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39991xdefef6c7, com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39994x145c3989, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131743k, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m40541x1b68a74f, "openLogInstance(...)");
            this.f122395d = m40541x1b68a74f;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101122x24b7f377(new cf0.w(this));
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, -1L);
        long t18 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, -1L);
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 c26466xe7648225 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225();
        c26466xe7648225.f53874x8d0f678f = 100;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        c26466xe7648225.f53869x56050483 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183669e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (t17 > 0) {
            jSONObject.put("key_localserver_buffer_size", t17);
        }
        if (t18 > 0) {
            jSONObject.put("key_localserver_send_socket_buffer_size", t18);
        }
        c26466xe7648225.f53870xf3d9c872 = jSONObject.toString();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103101xd1ade98e(c26466xe7648225);
        com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101112x7421050a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "60303", 1);
        com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101129xd5038bcf(true);
        com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101132x4f6110c3(100);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_is_enable_mediacodec_stuck_check, 1) == 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_tp_local_server_checker, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbPlayerService", " enableLocalServerCheck: " + fj6 + " mediaCodecStuckCheck: " + z17 + " localserver_buffer_size:" + t17 + " localserver_send_socket_buffer_size:" + t18);
        if (fj6) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101120x764b252a(new org.json.JSONObject().put("EnableCheckLocalServer", true).toString());
        }
        com.p314xaae8f345.mm.app.q5.b().a(this);
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101247x7d009d52(4, new com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26211xa2d97b3f(9999999, 0, 99, 0));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ek4.s Di = Di();
        Di.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "release cdn task controller");
        Di.f335220c.clear();
        Di.f335221d.clear();
        Di.f335218a.clear();
        Di.f335219b.clear();
        Di.f335222e.clear();
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Vi(null);
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Zi(null);
        xh3.h hVar = (xh3.h) ((jz5.n) this.f122398g).mo141623x754a37bb();
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "release");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTask downloadTaskListSize:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = hVar.f536114c;
        sb6.append(copyOnWriteArrayList.size());
        sb6.append(" downloadTaskList:");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add("taskId:" + ((yh3.d) it.next()));
        }
        sb6.append(arrayList);
        sb6.append(" preloadTaskListSize:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = hVar.f536113b;
        sb6.append(copyOnWriteArrayList2.size());
        sb6.append(" preloadTaskList:");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (it6.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
            arrayList2.add("taskId:null");
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", sb6.toString());
        java.util.Iterator it7 = copyOnWriteArrayList.iterator();
        while (it7.hasNext()) {
            yh3.d dVar = (yh3.d) it7.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            hVar.b(dVar);
        }
        java.util.Iterator it8 = copyOnWriteArrayList2.iterator();
        if (it8.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it8.next());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
            throw null;
        }
        xh3.d dVar2 = hVar.f536112a;
        if (dVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.b0) dVar2;
            b0Var.f172403e = null;
            b0Var.f172402d = null;
        } else {
            ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ri(null);
            ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ui(null);
        }
        if (this.f122399h != null) {
            d95.b0 b0Var2 = this.f122399h;
            if (b0Var2 != null) {
                b0Var2.L();
            }
            this.f122399h = null;
        }
        com.p314xaae8f345.mm.app.q5.b().e(this);
    }
}
