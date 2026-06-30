package dl3;

/* loaded from: classes13.dex */
public class i {
    public static dl3.i W;
    public final java.util.HashMap A;
    public final ol.c B;
    public volatile boolean C;
    public volatile boolean D;
    public final bm5.x0 E;
    public long F;
    public final java.util.LinkedList G;
    public final java.util.LinkedList H;
    public final ml.b I;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Handler f316840J;
    public android.os.Looper K;
    public dl3.b L;
    public dl3.a M;
    public final dl3.f N;
    public final java.lang.Runnable O;
    public final java.lang.Runnable P;
    public final ol.b Q;
    public final ol.k R;
    public final ml.g S;
    public volatile int T;
    public final java.lang.Object U;
    public final n01.e V;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f316841a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f316842b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f316843c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f316844d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f316845e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f316846f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f316847g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f316848h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f316849i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f316850j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f316851k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f316852l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f316853m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f316854n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.util.Set f316855o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f316856p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f316857q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f316858r;

    /* renamed from: s, reason: collision with root package name */
    public long f316859s;

    /* renamed from: t, reason: collision with root package name */
    public long f316860t;

    /* renamed from: u, reason: collision with root package name */
    public el3.i f316861u;

    /* renamed from: v, reason: collision with root package name */
    public n01.a f316862v;

    /* renamed from: w, reason: collision with root package name */
    public final fl3.a f316863w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[] f316864x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f316865y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f316866z;

    public i() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f316841a = linkedList;
        this.f316842b = new java.util.HashMap();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f316843c = linkedList2;
        this.f316844d = new java.util.HashMap();
        this.f316845e = new java.util.LinkedList();
        this.f316846f = new java.util.LinkedList();
        this.f316847g = new java.util.HashMap();
        this.f316848h = new java.util.HashMap();
        this.f316849i = new java.util.HashMap();
        this.f316850j = new java.util.HashMap();
        this.f316851k = new java.util.LinkedList();
        this.f316852l = new java.util.LinkedList();
        this.f316853m = new java.util.HashMap();
        this.f316854n = new java.util.LinkedList();
        this.f316855o = new java.util.HashSet();
        java.lang.Object obj = new java.lang.Object();
        this.f316856p = obj;
        this.f316857q = false;
        this.f316858r = false;
        this.f316859s = 0L;
        this.f316860t = 0L;
        this.f316862v = new n01.a();
        this.f316863w = new fl3.a();
        this.f316864x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[]{null};
        this.f316865y = new java.util.ArrayList();
        this.f316866z = new java.util.HashMap();
        this.A = new java.util.HashMap();
        this.C = true;
        this.D = true;
        this.E = new bm5.x0(new dl3.C28235x3046d8());
        this.F = 0L;
        this.G = new java.util.LinkedList();
        this.H = new java.util.LinkedList();
        this.L = null;
        this.M = null;
        this.N = new dl3.l(this);
        this.O = new dl3.m(this);
        this.P = new dl3.n(this);
        this.Q = new dl3.p(this);
        this.R = new dl3.q(this);
        this.S = new dl3.s(this);
        this.T = 0;
        this.U = new java.lang.Object();
        this.V = new dl3.j(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "_release");
        linkedList.clear();
        synchronized (obj) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                k(str, (dl3.d0) this.f316842b.remove(str));
            }
            this.f316843c.clear();
            this.f316842b.clear();
            java.util.Iterator it6 = this.f316845e.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                k(str2, (dl3.d0) this.f316844d.remove(str2));
            }
            this.f316845e.clear();
            this.f316844d.clear();
            java.util.Iterator it7 = this.f316846f.iterator();
            while (it7.hasNext()) {
                java.util.LinkedList linkedList3 = (java.util.LinkedList) this.f316848h.remove((java.lang.String) it7.next());
                if (linkedList3 != null) {
                    linkedList3.clear();
                }
            }
        }
        this.f316846f.clear();
        this.f316847g.clear();
        this.f316848h.clear();
        this.f316849i.clear();
        this.f316850j.clear();
        this.f316853m.clear();
        this.f316854n.clear();
        this.f316851k.clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.O);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.P);
        this.f316857q = false;
        this.f316858r = false;
        synchronized (this.f316864x) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var = this.f316864x[0];
            if (h5Var != null) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(h5Var);
                this.f316864x[0] = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removePhoneStatusWatcher");
        this.L = null;
        ol.c cVar = new ol.c(false);
        this.B = cVar;
        ol.b bVar = this.Q;
        ol.h hVar = cVar.f427612a;
        hVar.f427634j = bVar;
        hVar.f427636l = this.R;
        dl3.d dVar = new dl3.d();
        this.I = dVar;
        dVar.f408704e = this.S;
    }

    public static void b(dl3.i iVar, java.lang.String str) {
        if (iVar.G.remove(str)) {
            iVar.f316849i.remove(str);
        }
    }

    public static void c(dl3.i iVar) {
        if (iVar.r() <= 0) {
            synchronized (iVar.f316856p) {
                iVar.f316858r = false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(iVar.O);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!iVar.f316858r || currentTimeMillis - iVar.f316860t >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            synchronized (iVar.f316856p) {
                iVar.f316858r = true;
            }
            iVar.f316860t = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayIfPaused, delay_ms:%d", 600000);
            java.lang.Runnable runnable = iVar.O;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 600000);
        }
    }

    public static dl3.i s() {
        if (W == null) {
            W = new dl3.i();
        }
        return W;
    }

    public void A(java.lang.String str) {
        if (t()) {
            n01.b bVar = (n01.b) this.f316849i.get(str);
            if (bVar != null && !android.text.TextUtils.isEmpty(bVar.f415371c) && this.B.e(bVar.f415371c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "preloadMixCache cache done!");
                return;
            }
            synchronized (this.H) {
                if (!this.H.contains(str)) {
                    this.H.add(str);
                }
            }
            if (this.K == null || android.os.Looper.myQueue() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "Looper.myQueue() is null!");
            } else {
                android.os.Looper.myQueue().addIdleHandler(new dl3.o(this, str));
            }
        }
    }

    public final void B() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStopPlayer");
        synchronized (this.f316856p) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f316845e);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 d0Var = (dl3.d0) this.f316844d.remove(str);
                this.f316845e.remove(str);
                if (d0Var != null) {
                    if (d0Var.f316819i) {
                        O(str, d0Var);
                        k(str, d0Var);
                    } else if (!d0Var.v()) {
                        O(str, d0Var);
                        k(str, d0Var);
                    }
                }
            }
        }
    }

    public final void C() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePausedPlayer");
        synchronized (this.f316856p) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f316845e);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 d0Var = (dl3.d0) this.f316844d.get(str);
                if (d0Var != null && d0Var.v()) {
                    z(str, d0Var);
                }
            }
        }
    }

    public final void D(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePlayer");
        java.util.HashMap hashMap = this.f316842b;
        int size = hashMap.size();
        java.util.HashMap hashMap2 = this.f316844d;
        int size2 = hashMap2.size();
        int r17 = r();
        if (size > 0 || size2 > 0 || r17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d, paused_player_count:%d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(r17));
        }
        if (size >= 10) {
            C();
        } else if (r17 >= 6) {
            C();
        } else if (size + r17 >= 8) {
            C();
        }
        java.lang.String m17 = m(str);
        int size3 = hashMap.size();
        int size4 = hashMap2.size();
        if (size3 > 0 || size4 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(size4));
        }
        java.util.LinkedList linkedList = this.f316846f;
        if (size4 >= 50) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 != null && !str2.equalsIgnoreCase(m17)) {
                    E(str2);
                }
            }
        } else if (size4 + size3 >= 50) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str3 = (java.lang.String) it6.next();
                if (str3 != null && !str3.equalsIgnoreCase(m17)) {
                    E(str3);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleStopPlayerByAppId");
        }
        int size5 = hashMap2.size();
        if (size3 > 0 || size5 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(size5));
        }
        if (size5 >= 50) {
            B();
        } else if (size3 + size5 >= 50) {
            B();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleAllStopPlayer");
        }
    }

    public final void E(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStoppedPlayerByAppId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllStoppedAudioPlayersAndSaveStateByAppId, appId:%s", str);
        e(str);
        L();
        synchronized (this.f316856p) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str);
            if (linkedList != null && linkedList.size() != 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (this.B.f(str2)) {
                        this.B.r(str2);
                    }
                    dl3.d0 d0Var = (dl3.d0) this.f316844d.remove(str2);
                    this.f316845e.remove(str2);
                    if (d0Var != null) {
                        O(str2, d0Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                        if (d0Var.f316819i) {
                            k(str2, d0Var);
                        } else {
                            k(str2, d0Var);
                        }
                    }
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
        }
    }

    public void F(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!this.f316857q || currentTimeMillis - this.f316859s >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            this.f316859s = currentTimeMillis;
            synchronized (this.f316856p) {
                this.f316857q = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayIfPaused, delay_ms:%d", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.P);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.P, i17);
        }
    }

    public final void G() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removeAndStopPlayingAudioPlayer");
        java.util.LinkedList linkedList = this.f316852l;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player audioId : %s", str);
            R(str);
            J();
        }
        java.util.LinkedList linkedList2 = this.f316854n;
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player for try audioId : %s", str2);
            R(str2);
            J();
        }
        linkedList.clear();
        linkedList2.clear();
    }

    public void H() {
        ol.c cVar = this.B;
        cVar.q(false);
        ol.h hVar = cVar.f427612a;
        hVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        hVar.f427647w = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f427618g = false;
        this.L = null;
        for (dl3.d0 d0Var : this.f316842b.values()) {
            if (d0Var != null) {
                d0Var.f316834x = null;
            }
        }
    }

    public final void I(n01.b bVar, boolean z17, boolean z18) {
        long j17;
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f316861u = iVar;
        if (iVar != null) {
            java.lang.String str = bVar.f415369a;
            java.lang.String str2 = bVar.f415370b;
            el3.h hVar = (el3.h) iVar;
            hVar.getClass();
            p95.a.a(new el3.c(hVar, str, str2, z18));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bVar.f415383o = currentTimeMillis;
        if (z17) {
            j17 = bVar.f415387s;
            bVar.f415384p = bVar.f415386r;
        } else {
            j17 = bVar.f415389u;
            bVar.f415384p = bVar.f415388t;
        }
        if (j17 <= 0 || currentTimeMillis <= j17) {
            bVar.f415385q = 0L;
        } else {
            bVar.f415385q = currentTimeMillis - j17;
        }
    }

    public final void J() {
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f316861u = iVar;
        if (iVar != null) {
            ((el3.h) iVar).getClass();
            synchronized (el3.h.f335529i) {
                el3.h.f335523c++;
            }
        }
    }

    public final void K(n01.b bVar) {
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f316861u = iVar;
        if (iVar != null) {
            java.lang.String str = bVar.f415369a;
            java.lang.String str2 = bVar.f415370b;
            el3.h hVar = (el3.h) iVar;
            hVar.getClass();
            p95.a.a(new el3.b(hVar, str, str2));
        }
    }

    public void L() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "resetSpeaker");
        if (!this.D && ((android.media.AudioManager) this.E.b()).getMode() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on and reset mode to MODE_NORMAL");
            ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(true);
            ((android.media.AudioManager) this.E.b()).setMode(0);
        } else if (!this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on");
            ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(true);
        }
        this.D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0045, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(java.lang.String r11, n01.b r12) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.i.M(java.lang.String, n01.b):boolean");
    }

    public final void N(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "saveCreateId, appId:%s, audioId:%s", str, str2);
        if (!this.f316846f.contains(str)) {
            this.f316846f.add(str);
        }
        if (!this.f316841a.contains(str2)) {
            this.f316841a.add(str2);
        }
        synchronized (this.f316856p) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str);
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            if (!linkedList.contains(str2)) {
                linkedList.add(str2);
            }
            this.f316848h.put(str, linkedList);
        }
    }

    public final void O(java.lang.String str, dl3.d0 d0Var) {
        this.f316850j.put(str, d0Var.s());
    }

    public void P(dl3.b bVar) {
        this.L = bVar;
        dl3.a aVar = new dl3.a(1, "0");
        bVar.c(aVar);
        this.M = aVar;
        ol.c cVar = this.B;
        cVar.q(true);
        ol.h hVar = cVar.f427612a;
        hVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        hVar.f427647w = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f427618g = true;
        synchronized (this.f316856p) {
            for (dl3.d0 d0Var : this.f316842b.values()) {
                if (d0Var != null) {
                    d0Var.f316834x = bVar;
                }
            }
        }
    }

    public final boolean Q(dl3.d0 d0Var) {
        if (d0Var == null) {
            return true;
        }
        return !(d0Var.i() || d0Var.v() || d0Var.x() || d0Var.w() || d0Var.g());
    }

    public boolean R(java.lang.String str) {
        dl3.d0 o17 = o(str);
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, player is null");
            ol.c cVar = this.B;
            if (!cVar.f(str)) {
                return false;
            }
            cVar.r(str);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, audioId:%s", str);
        o17.mo67222x66343656();
        n01.b bVar = (n01.b) this.f316849i.get(str);
        if (bVar != null) {
            bVar.f415372d = 0;
            bVar.f415375g = true;
        }
        O(str, o17);
        w(str, o17);
        return true;
    }

    public final void S(java.lang.String str, dl3.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "unmarkPlayer, unmark player by audioId:%s", str);
        synchronized (this.f316856p) {
            if (this.f316845e.contains(str)) {
                this.f316844d.remove(str);
                this.f316845e.remove(str);
            }
            if (this.f316843c.contains(str)) {
                this.f316843c.remove(str);
                this.f316842b.remove(str);
            }
        }
    }

    public final void T(java.lang.String str) {
        n01.b bVar = (n01.b) this.f316849i.get(str);
        if (bVar == null || android.text.TextUtils.isEmpty(bVar.f415370b)) {
            return;
        }
        if ((bVar.f415370b.startsWith("http://") || bVar.f415370b.startsWith("https://")) && gl3.j.a(bVar.f415370b)) {
            bVar.f415371c = xl3.c.d(bVar.f415370b);
            java.lang.String str2 = bVar.f415370b;
            java.util.HashMap hashMap = this.f316866z;
            if (hashMap.containsKey(str2)) {
                return;
            }
            hashMap.put(bVar.f415370b, bVar.f415371c);
        }
    }

    public final void U(n01.b bVar) {
        if (android.text.TextUtils.isEmpty(bVar.f415371c)) {
            java.lang.String str = bVar.f415370b;
            java.util.HashMap hashMap = this.f316866z;
            if (hashMap.containsKey(str)) {
                bVar.f415371c = (java.lang.String) hashMap.get(bVar.f415370b);
            }
        }
    }

    public void a() {
        fl3.a aVar = this.f316863w;
        if (aVar.f345460b) {
            aVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
            bm5.x0 x0Var = aVar.f345459a;
            if (x0Var.b() == null) {
                return;
            }
            ((android.media.AudioManager) x0Var.b()).abandonAudioFocus(aVar.f345461c);
            aVar.f345460b = false;
        }
    }

    public final boolean d(java.lang.String str) {
        n01.b bVar;
        int i17;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        synchronized (this.f316856p) {
            int size = this.f316842b.size();
            boolean z17 = false;
            if (size < 10) {
                this.f316852l.clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "playerCount:%d is not need to remove", java.lang.Integer.valueOf(size));
                return false;
            }
            java.util.Iterator it = this.f316843c.iterator();
            while (it.hasNext()) {
                n01.b bVar2 = (n01.b) this.f316849i.get((java.lang.String) it.next());
                if (bVar2 != null && (str2 = bVar2.f415370b) != null) {
                    if (hashMap.containsKey(str2)) {
                        hashMap.put(bVar2.f415370b, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(bVar2.f415370b)).intValue() + 1));
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap2.get(bVar2.f415370b);
                        if (!arrayList2.contains(bVar2.f415369a)) {
                            arrayList2.add(bVar2.f415369a);
                        }
                        hashMap2.put(bVar2.f415370b, arrayList2);
                    } else {
                        hashMap.put(bVar2.f415370b, 1);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(bVar2.f415369a);
                        hashMap2.put(bVar2.f415370b, arrayList3);
                    }
                    if (!arrayList.contains(bVar2.f415370b)) {
                        arrayList.add(bVar2.f415370b);
                    }
                }
            }
            java.lang.String str3 = "";
            int i18 = gl3.h.f354372i;
            if (i18 == 0) {
                if (gl3.e.d()) {
                    ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                    i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.n.f(3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                    i17 = 3;
                }
                gl3.h.f354372i = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceCacheHelper", "sRemovePlayingAudioPlayerGroupCount:%d", java.lang.Integer.valueOf(i17));
                if (gl3.h.f354372i == 0) {
                    gl3.h.f354372i = 3;
                }
                i18 = gl3.h.f354372i;
            }
            java.util.Iterator it6 = arrayList.iterator();
            boolean z18 = false;
            int i19 = i18;
            while (it6.hasNext()) {
                java.lang.String str4 = (java.lang.String) it6.next();
                int intValue = ((java.lang.Integer) hashMap.get(str4)).intValue();
                if (intValue >= i18) {
                    if (i19 < intValue) {
                        str3 = str4;
                        i19 = intValue;
                    }
                    if (android.text.TextUtils.isEmpty(str3)) {
                        z18 = true;
                        str3 = str4;
                    } else {
                        z18 = true;
                    }
                }
            }
            if (!z18 || (bVar = (n01.b) this.f316849i.get(str)) == null || str3 == null || !str3.equalsIgnoreCase(bVar.f415370b)) {
                z17 = z18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "srcUrl is same, not remove and don't play again");
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need to remove player");
                java.util.ArrayList arrayList4 = (java.util.ArrayList) hashMap2.get(str3);
                if (arrayList4 != null && arrayList4.size() > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        n01.b bVar3 = (n01.b) this.f316849i.get((java.lang.String) it7.next());
                        if (bVar3 != null) {
                            linkedList.add(bVar3);
                        }
                    }
                    java.util.Collections.sort(linkedList, new dl3.u(this));
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        linkedList2.add(((n01.b) it8.next()).f415369a);
                    }
                    int i27 = size - 10;
                    if (i27 > 0 && linkedList2.size() > i27) {
                        int i28 = i27 + 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "removeCount should be %d", java.lang.Integer.valueOf(i28));
                        int size2 = linkedList2.size() - i28;
                        this.f316852l.addAll(linkedList2.subList(size2 >= 0 ? size2 : 1, linkedList2.size()));
                    } else if (i27 <= 0 || linkedList2.size() >= i27) {
                        this.f316852l.add((java.lang.String) linkedList2.get(linkedList2.size() - 1));
                    } else {
                        this.f316852l.addAll(linkedList2.subList(1, linkedList2.size()));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player count : %d", java.lang.Integer.valueOf(this.f316852l.size()));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "not need to remove player");
                this.f316852l.clear();
            }
            return z17;
        }
    }

    public final void e(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(this.f316862v.f415368c) && !str.equalsIgnoreCase(this.f316862v.f415368c)) {
            n01.a aVar = this.f316862v;
            aVar.f415366a = true;
            aVar.f415367b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "reset AudioContextParam, appId:%s", str);
        }
        n01.a aVar2 = this.f316862v;
        aVar2.f415368c = str;
        this.C = aVar2.f415367b;
    }

    public void f() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f316862v.f415366a);
        fl3.a aVar = this.f316863w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther:%b, focus:%b", valueOf, java.lang.Boolean.valueOf(aVar.f345460b));
        boolean z17 = this.f316862v.f415366a;
        if (z17 || aVar.f345460b) {
            if (z17 && aVar.f345460b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "abandonFocus()");
                a();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus()");
        if (aVar.f345460b) {
            return;
        }
        bm5.x0 x0Var = aVar.f345459a;
        boolean z18 = false;
        if (x0Var.b() != null) {
            int requestAudioFocus = ((android.media.AudioManager) x0Var.b()).requestAudioFocus(aVar.f345461c, 3, 2);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(requestAudioFocus == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", objArr);
            if (requestAudioFocus == 1) {
                aVar.f345460b = true;
            }
            if (requestAudioFocus == 1) {
                z18 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus focus:%b", java.lang.Boolean.valueOf(z18));
    }

    public final void g(n01.b bVar) {
        if (bVar == null || android.text.TextUtils.isEmpty(bVar.f415370b) || !bVar.f415370b.startsWith("http")) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(bVar.f415371c) && this.B.e(bVar.f415371c)) {
            return;
        }
        if (this.f316840J == null) {
            this.f316840J = new android.os.Handler(android.os.Looper.myLooper());
        }
        gl3.h.f(bVar.f415370b);
        boolean a17 = gl3.j.a(bVar.f415370b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "checkNeedDownloadSrc audioId:%s, cacheValid:%b, checkCount:%d", bVar.f415369a, java.lang.Boolean.valueOf(a17), java.lang.Integer.valueOf(this.T));
        this.T++;
        if (a17) {
            T(bVar.f415369a);
            U(bVar);
            A(bVar.f415369a);
            return;
        }
        ml.b bVar2 = this.I;
        bVar2.getClass();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioDownloadMgr", "startDownload", null);
        if (android.text.TextUtils.isEmpty(bVar.f415370b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl is null", null);
            return;
        }
        if (bVar2.f408702c.contains(bVar.f415370b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl:%s is download finish", bVar.f415370b);
            return;
        }
        if (bVar2.f408700a.containsKey(bVar.f415370b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioDownloadMgr", "task is exit!", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioDownloadMgr", "download src:%s, audioId:%s", bVar.f415370b, bVar.f415369a);
        ml.d dVar = new ml.d(new ml.c(new ml.a(bVar2)), bVar.f415369a, 5);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String str = bVar.f415391w;
        if (str != null) {
            concurrentHashMap.put(bVar.f415370b, str);
        }
        dVar.f408711i = new dl3.e(new vl3.a(concurrentHashMap), bVar);
        dVar.f400652f = java.lang.System.currentTimeMillis();
        if (ml.e.f408712e == null) {
            synchronized (ml.e.class) {
                if (ml.e.f408712e == null) {
                    ml.e.f408712e = new ml.e();
                }
            }
        }
        ml.e eVar = ml.e.f408712e;
        synchronized (eVar.f408713a) {
            dVar.f408710h = false;
            eVar.f408715c.add(dVar);
            int i18 = eVar.f408716d;
            if (eVar.f408715c.size() > i18) {
                eVar.a(i18 + 2);
            }
        }
        eVar.f408714b.execute(dVar);
        synchronized (bVar2.f408703d) {
            bVar2.f408700a.put(bVar.f415370b, dVar);
            bVar2.f408701b.add(bVar.f415370b);
        }
    }

    public final dl3.d0 h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "createOrReusePlayer");
        synchronized (this.f316856p) {
            try {
                if (this.f316844d.size() == 0) {
                    return new dl3.d0();
                }
                java.lang.String str = "";
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = this.f316845e.iterator();
                dl3.d0 d0Var = null;
                long j17 = 0;
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    dl3.d0 d0Var2 = (dl3.d0) this.f316844d.get(str2);
                    if (d0Var2 != null) {
                        if (!d0Var2.f316819i) {
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = d0Var2.f316815e;
                            if (!(c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 7)) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = d0Var2.f316815e;
                                if (!(c25323xb43a8cc2 != null && c25323xb43a8cc2.mo93639xfa6224fa() == 6)) {
                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc3 = d0Var2.f316815e;
                                    if (c25323xb43a8cc3 != null && c25323xb43a8cc3.mo93639xfa6224fa() == 9) {
                                    }
                                }
                            }
                        }
                        if (j17 == 0 || d0Var2.f316832v < j17) {
                            j17 = d0Var2.f316832v;
                            str = str2;
                            d0Var = d0Var2;
                        }
                    }
                }
                if (d0Var == null || currentTimeMillis - j17 <= 500) {
                    return new dl3.d0();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "player is be reuse to play again with other audio");
                S(str, d0Var);
                return d0Var;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final boolean i(java.lang.String str) {
        dl3.d0 o17 = o(str);
        if (o17 == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAndRemovePlayer, audioId:%s", str);
        k(str, o17);
        synchronized (this.f316856p) {
            this.f316842b.remove(str);
            this.f316843c.remove(str);
            this.f316844d.remove(str);
            this.f316845e.remove(str);
        }
        return true;
    }

    public boolean j(java.lang.String str) {
        boolean contains;
        boolean contains2;
        synchronized (this.H) {
            contains = this.H.contains(str);
        }
        if (!contains) {
            n01.b bVar = (n01.b) this.f316849i.get(str);
            if (bVar != null) {
                ol.c cVar = this.B;
                java.lang.String str2 = bVar.f415371c;
                ll.b bVar2 = cVar.f427613b;
                synchronized (bVar2.f400609f) {
                    contains2 = ((java.util.ArrayList) bVar2.f400607d).contains(str2);
                }
                if (contains2) {
                    contains = true;
                }
            }
            contains = false;
        }
        if (!contains) {
            if (this.B.f(str) && (this.B.g(str) || this.B.h(str) || this.B.i(str) || this.B.j(str) || this.B.k(str))) {
                this.B.r(str);
            }
            this.B.n(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, audioId:%s", str);
        dl3.d0 o17 = o(str);
        if (o17 != null) {
            k(str, o17);
            synchronized (this.f316856p) {
                this.f316842b.remove(str);
                this.f316843c.remove(str);
                this.f316844d.remove(str);
                this.f316845e.remove(str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, player is null");
        }
        this.f316841a.remove(str);
        synchronized (this.f316856p) {
            java.util.Iterator it = this.f316846f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) it.next();
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str3);
                if (linkedList != null && linkedList.contains(str)) {
                    linkedList.remove(str);
                    if (linkedList.size() == 0) {
                        this.f316848h.remove(str3);
                        this.f316846f.remove(str3);
                        this.f316847g.remove(str3);
                    }
                }
            }
        }
        this.f316850j.remove(str);
        if (!contains) {
            this.f316849i.remove(str);
        } else if (!this.G.contains(str)) {
            this.G.add(str);
        }
        return true;
    }

    public final void k(java.lang.String str, dl3.d0 d0Var) {
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer player is null for audioId:%s", str);
            return;
        }
        if (d0Var.i() || d0Var.g() || d0Var.x() || d0Var.w() || d0Var.v()) {
            d0Var.mo67222x66343656();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "release");
        d0Var.f316881b = null;
        d0Var.f316834x = null;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = d0Var.f316815e;
        if (c25323xb43a8cc != null) {
            c25323xb43a8cc.mo93648x41012807();
            d0Var.f316815e = null;
        }
        dl3.i s17 = s();
        synchronized (s17.f316865y) {
            if (s17.f316865y.contains(d0Var)) {
                s17.f316865y.remove(d0Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer stop and release player by audioId:%s", str);
    }

    public void l() {
        if (this.f316862v.f415366a && !this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, useSpeakerOn is false, return");
            L();
            return;
        }
        if (this.f316862v.f415366a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, return");
            return;
        }
        if (this.C && ((android.media.AudioManager) this.E.b()).getMode() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on and reset speaker");
            L();
            return;
        }
        if (this.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on, do nothing");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when phone calling");
            return;
        }
        if (((android.media.AudioManager) this.E.b()).isBluetoothScoOn() || ((android.media.AudioManager) this.E.b()).isBluetoothA2dpOn()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when isBluetoothScoOn:%b , isBluetoothA2dpOn:%b", java.lang.Boolean.valueOf(((android.media.AudioManager) this.E.b()).isBluetoothScoOn()), java.lang.Boolean.valueOf(((android.media.AudioManager) this.E.b()).isBluetoothA2dpOn()));
            return;
        }
        if (((android.media.AudioManager) this.E.b()).isWiredHeadsetOn()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
            return;
        }
        if (!this.D && ((android.media.AudioManager) this.E.b()).getMode() == 3 && !((android.media.AudioManager) this.E.b()).isSpeakerphoneOn()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
            return;
        }
        this.D = false;
        ((android.media.AudioManager) this.E.b()).setSpeakerphoneOn(false);
        ((android.media.AudioManager) this.E.b()).setMode(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "set speaker off and change mode to MODE_IN_COMMUNICATION");
    }

    public final java.lang.String m(java.lang.String str) {
        java.util.Iterator it = this.f316846f.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str2);
            if (linkedList != null && linkedList.contains(str)) {
                return str2;
            }
        }
        return "";
    }

    public n01.b n(java.lang.String str) {
        java.util.HashMap hashMap = this.f316849i;
        if (hashMap.containsKey(str)) {
            return (n01.b) hashMap.get(str);
        }
        return null;
    }

    public final dl3.d0 o(java.lang.String str) {
        java.util.HashMap hashMap = this.f316842b;
        if (hashMap.containsKey(str)) {
            return (dl3.d0) hashMap.get(str);
        }
        java.util.HashMap hashMap2 = this.f316844d;
        if (hashMap2.containsKey(str)) {
            return (dl3.d0) hashMap2.get(str);
        }
        return null;
    }

    public int p(java.lang.String str) {
        int size;
        int r17 = r();
        synchronized (this.f316856p) {
            int size2 = this.f316841a.size();
            size = this.f316842b.size();
            int size3 = this.f316844d.size();
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "getAudioPlayerCount, count:%d, player_count:%d, recycled_player_count:%d, audioIdsCount:%d, pause_count:%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size3), java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size()), java.lang.Integer.valueOf(r17));
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n01.d q(java.lang.String r13) {
        /*
            r12 = this;
            dl3.d0 r0 = r12.o(r13)
            if (r0 == 0) goto Lb
            n01.d r13 = r0.s()
            return r13
        Lb:
            ol.c r0 = r12.B
            boolean r0 = r0.f(r13)
            if (r0 == 0) goto Lb6
            ol.c r0 = r12.B
            ol.h r0 = r0.f427612a
            java.util.HashMap r1 = r0.f427641q
            boolean r1 = r1.containsKey(r13)
            if (r1 == 0) goto L28
            java.util.HashMap r1 = r0.f427641q
            java.lang.Object r1 = r1.get(r13)
            n01.d r1 = (n01.d) r1
            goto L32
        L28:
            n01.d r1 = new n01.d
            r1.<init>()
            java.util.HashMap r2 = r0.f427641q
            r2.put(r13, r1)
        L32:
            int r2 = r0.d(r13)
            int r3 = r0.f(r13)
            boolean r4 = r0.j(r13)
            java.util.HashMap r5 = r0.f427637m
            boolean r5 = r5.containsKey(r13)
            r6 = 100
            r7 = 0
            if (r5 == 0) goto L6c
            java.util.HashMap r5 = r0.f427637m
            java.lang.Object r5 = r5.get(r13)
            n01.b r5 = (n01.b) r5
            java.lang.String r5 = r5.f415371c
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L5a
            goto L6c
        L5a:
            il.j r8 = il.j.a()
            hl.d r5 = r8.b(r5)
            long r8 = r5.f363554d
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r5 = r6
            goto L6d
        L6c:
            r5 = r7
        L6d:
            if (r5 >= 0) goto L70
            r5 = r7
        L70:
            r1.f415396b = r3
            r1.f415395a = r2
            r3 = 1
            r4 = r4 ^ r3
            r1.f415397c = r4
            java.util.HashMap r4 = r0.f427638n
            boolean r4 = r4.containsKey(r13)
            if (r4 == 0) goto L8f
            java.util.HashMap r4 = r0.f427638n
            java.lang.Object r4 = r4.get(r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L8f
            r7 = r3
        L8f:
            r1.f415398d = r7
            int r5 = r5 * r2
            int r5 = r5 / r6
            r1.f415399e = r5
            java.util.HashMap r2 = r0.f427637m
            boolean r2 = r2.containsKey(r13)
            if (r2 == 0) goto Lb2
            java.util.HashMap r0 = r0.f427637m
            java.lang.Object r0 = r0.get(r13)
            n01.b r0 = (n01.b) r0
            int r2 = r0.f415373e
            r1.f415401g = r2
            java.lang.String r2 = r0.f415370b
            r1.f415400f = r2
            java.lang.String r0 = r0.f415390v
            r1.f415402h = r0
            goto Lb3
        Lb2:
            r1 = 0
        Lb3:
            if (r1 == 0) goto Lb6
            return r1
        Lb6:
            java.util.HashMap r0 = r12.f316850j
            java.lang.Object r13 = r0.get(r13)
            n01.d r13 = (n01.d) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.i.q(java.lang.String):n01.d");
    }

    public final int r() {
        int i17;
        boolean v17;
        synchronized (this.f316856p) {
            java.util.Iterator it = this.f316845e.iterator();
            i17 = 0;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                dl3.d0 o17 = o(str);
                if (o17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "isPausedPlayer, player is null");
                    n01.d q17 = q(str);
                    v17 = q17 != null ? q17.f415397c : false;
                } else {
                    v17 = o17.v();
                }
                if (v17) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public final boolean t() {
        java.lang.System.currentTimeMillis();
        n01.a aVar = this.f316862v;
        return aVar.f415367b || aVar.f415366a;
    }

    public final boolean u(n01.b bVar) {
        return (bVar == null || !bVar.f415370b.startsWith("wxblob://") || bVar.B == null) ? false : true;
    }

    public final void v(java.lang.String str, dl3.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayer, mark player by audioId:%s", str);
        synchronized (this.f316856p) {
            if (this.f316845e.contains(str)) {
                this.f316844d.remove(str);
                this.f316845e.remove(str);
            }
            if (!this.f316843c.contains(str)) {
                this.f316843c.add(str);
                this.f316842b.put(str, d0Var);
            }
        }
    }

    public final void w(java.lang.String str, dl3.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayerRecycled, mark player recycled by audioId:%s", str);
        synchronized (this.f316856p) {
            if (this.f316843c.contains(str)) {
                this.f316842b.remove(str);
                this.f316843c.remove(str);
            }
            if (!this.f316845e.contains(str)) {
                this.f316845e.add(str);
                this.f316844d.put(str, d0Var);
            }
        }
    }

    public void x(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onErrorEvent with errCode:%d, audioId:%s", java.lang.Integer.valueOf(i17), str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "audioId is empty");
            str = dl3.h.a();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 4;
        g0Var.f88252d = "error";
        g0Var.f88254f = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.m.b(i17);
        g0Var.f88255g = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.m.a(i17);
        g0Var.f88251c = str;
        g0Var.f88253e = m(str);
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
    }

    public void y(java.lang.String str) {
        long size;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "pauseAllAudioPlayers, appId:%s", str);
        this.B.l();
        ((ku5.t0) ku5.t0.f394148d).g(new dl3.k(this));
        a();
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f316848h.get(str);
        ol.c cVar = this.B;
        long j17 = cVar.f427612a.f427633i.f419665u;
        long c17 = cVar.c();
        this.B.getClass();
        il.i a17 = il.i.a();
        synchronized (a17) {
            size = a17.f373533a.size() * 3536;
        }
        long j18 = c17 + size;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "mixAverageTime:%d, loadedCacheBufferSize:%d, remainingBufferSize:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17), java.lang.Long.valueOf(size));
        this.f316861u = (el3.i) sl3.b.b(el3.i.class);
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
            return;
        }
        if (this.f316842b.isEmpty() && this.f316844d.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
            el3.i iVar = this.f316861u;
            if (iVar != null) {
                p95.a.a(new el3.e((el3.h) iVar, str, j17, j18, c17));
                return;
            }
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        synchronized (this.f316856p) {
            linkedList2.addAll(linkedList);
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            dl3.d0 d0Var = (dl3.d0) this.f316844d.get(str2);
            if (d0Var != null) {
                z(str2, d0Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "playing player count:%d", java.lang.Integer.valueOf(this.f316842b.size()));
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            dl3.d0 d0Var2 = (dl3.d0) this.f316842b.get(str3);
            if (d0Var2 != null) {
                z(str3, d0Var2);
                w(str3, d0Var2);
            }
        }
        el3.i iVar2 = this.f316861u;
        if (iVar2 != null) {
            p95.a.a(new el3.e((el3.h) iVar2, str, j17, j18, c17));
        }
    }

    public final void z(java.lang.String str, dl3.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "pausePlayerOnBackground, pause player on background by audioId:%s", str);
        n01.b bVar = (n01.b) this.f316849i.get(str);
        if (bVar != null && d0Var.i() && d0Var.g()) {
            bVar.f415375g = true;
            bVar.f415372d = d0Var.a();
        } else if (bVar != null && d0Var.g()) {
            bVar.f415375g = true;
            bVar.f415372d = d0Var.a();
        } else if (bVar != null) {
            bVar.f415375g = true;
            bVar.f415372d = 0;
        }
        O(str, d0Var);
        n01.d q17 = q(str);
        if (q17 != null && d0Var.i()) {
            q17.f415397c = true;
        }
        if (d0Var.i() || d0Var.g() || d0Var.x() || d0Var.w() || d0Var.v()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "pauseOnBackGround");
            d0Var.f316819i = true;
            d0Var.q();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "setPauseOnBackground");
            d0Var.f316819i = true;
            d0Var.f316818h = true;
        }
    }
}
