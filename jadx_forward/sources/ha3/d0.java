package ha3;

/* loaded from: classes15.dex */
public final class d0 implements ha3.a, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f361342s = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: t, reason: collision with root package name */
    public static android.os.HandlerThread f361343t;

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f361344a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f361345b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f361346c;

    /* renamed from: d, reason: collision with root package name */
    public int f361347d;

    /* renamed from: e, reason: collision with root package name */
    public kk4.c f361348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f361349f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361350g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f361351h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f361352i;

    /* renamed from: j, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f361353j;

    /* renamed from: k, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f361354k;

    /* renamed from: l, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f361355l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f361356m;

    /* renamed from: n, reason: collision with root package name */
    public final long f361357n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f361358o;

    /* renamed from: p, reason: collision with root package name */
    public final um5.p f361359p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f361360q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f361361r;

    public d0(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 eventChannel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referer, "referer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceProducer, "surfaceProducer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventChannel, "eventChannel");
        this.f361349f = "";
        this.f361350g = "";
        this.f361352i = "";
        this.f361356m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("liteAppVideoPlayerPrepare");
        um5.p pVar = new um5.p();
        this.f361359p = pVar;
        this.f361349f = dataSource;
        this.f361350g = cacheKey;
        this.f361351h = z17;
        this.f361352i = referer;
        this.f361353j = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.mo138098x76500f83(i17, i18);
            ha3.x xVar = new ha3.x(this);
            pVar.e(surfaceProducer.mo138084xcf572877(), i17, i18);
            pVar.n(xVar);
            this.f361361r = true;
        }
        this.f361357n = surfaceProducer.id();
        this.f361355l = eventChannel;
        eventChannel.m138415x95b45268(new ha3.w(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(details, "details");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.b0(this, errorCode, errorMessage, details));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361354k;
            if (eventSink != null) {
                eventSink.mo138417x5c4d208(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.c0(this, event));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361354k;
            if (eventSink != null) {
                eventSink.mo138418x90b54003(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "setVolume textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", volume: " + d17);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100940x3aa51598((float) d17);
        }
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "updateSize texture: " + this.f361357n + ", mediaId:" + this.f361358o + ", state: " + this.f361347d + ", width: " + i17 + ", height: " + i18);
        if (i17 == 0 || i18 == 0 || this.f361361r) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "updateSize: delayed init renderController with width=" + i17 + ", height=" + i18);
        ha3.x xVar = new ha3.x(this);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361353j;
        if (surfaceProducer != null) {
            surfaceProducer.mo138098x76500f83(i17, i18);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = this.f361353j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceProducer2);
        android.view.Surface mo138084xcf572877 = surfaceProducer2.mo138084xcf572877();
        um5.p pVar = this.f361359p;
        pVar.e(mo138084xcf572877, i17, i18);
        pVar.n(xVar);
        this.f361361r = true;
    }

    @Override // ha3.a
    public void g(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerPlayBackRate textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", playBackRate: " + d17);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            cVar.mo100967xd079f5a((float) d17);
        }
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerLoop textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", loop: " + z17);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100947xfd27780d(z17);
        }
        this.f361346c = z17;
    }

    @Override // ha3.a
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "pauseVideo textureId: " + this.f361357n + ", mediaId:" + this.f361358o + ", state: " + this.f361347d);
        if (this.f361347d == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "pauseVideo already pausing");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.j0.f361420b.i(this.f361349f, this.f361351h);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100930x65825f6();
        }
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100931xe51afc9e();
        }
    }

    @Override // ha3.a
    public void j() {
        kk4.c cVar;
        if (f361343t == null) {
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("LiteAppTPCreateWorkThread", 0);
            f361343t = a17;
            a17.start();
        }
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f361342s;
        concurrentSkipListSet.add(java.lang.String.valueOf(hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHandlerThread proxy:");
        sb6.append(hashCode());
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = f361343t;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.lang.String str = this.f361350g;
        if (str.length() == 0) {
            str = this.f361349f;
        }
        this.f361349f = str;
        ha3.h0 h0Var = ha3.j0.f361420b;
        h0Var.h(str);
        java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f361349f);
        this.f361358o = a18;
        java.util.HashMap hashMap = ha3.j0.f361421c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
        hashMap.put(a18, this);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.os.HandlerThread handlerThread2 = f361343t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(handlerThread2);
        android.os.Looper looper = handlerThread2.getLooper();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(looper, "getLooper(...)");
        ((cf0.q) qVar).getClass();
        this.f361348e = new kk4.f0(context, looper);
        java.lang.String str2 = this.f361358o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        ha3.z zVar = new ha3.z(this, str2);
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100906x969bf12(zVar);
        }
        ha3.y yVar = new ha3.y(this);
        kk4.c cVar3 = this.f361348e;
        if (cVar3 != null) {
            ((kk4.f0) cVar3).mo100954x6954c27b(yVar);
        }
        kk4.c cVar4 = this.f361348e;
        if (cVar4 != null) {
            ((kk4.f0) cVar4).mo100957x5dd7c812(yVar);
        }
        kk4.c cVar5 = this.f361348e;
        if (cVar5 != null) {
            ((kk4.f0) cVar5).mo100964x2d6d87cd(yVar);
        }
        kk4.c cVar6 = this.f361348e;
        if (cVar6 != null) {
            ((kk4.f0) cVar6).f390074q = yVar;
        }
        if (cVar6 != null) {
            ((kk4.f0) cVar6).mo100955x40f8c003(yVar);
        }
        kk4.c cVar7 = this.f361348e;
        if (cVar7 != null) {
            ((kk4.f0) cVar7).mo100951xa4560c71(yVar);
        }
        kk4.c cVar8 = this.f361348e;
        if (cVar8 != null) {
            ((kk4.f0) cVar8).mo100958xe1a2e326(yVar);
        }
        kk4.c cVar9 = this.f361348e;
        if (cVar9 != null) {
            java.lang.String str3 = this.f361358o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            ((kk4.f0) cVar9).f390066i = str3;
        }
        kk4.c cVar10 = this.f361348e;
        if (cVar10 != null) {
            ((kk4.f0) cVar10).mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(123, false));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder();
        java.lang.String str4 = this.f361358o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        builder.m101226xb4088fb7(str4);
        kk4.c cVar11 = this.f361348e;
        if (cVar11 != null) {
            ((kk4.f0) cVar11).mo100974xab2f6987(builder.m101222x59bc66e());
        }
        ha3.e0 b17 = h0Var.b(this.f361349f);
        if (b17 != null && b17.f361369d && com.p314xaae8f345.mm.vfs.w6.j(b17.f361370e)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createPlayer taskInfo completed, setDataSource ");
            sb7.append(b17 != null ? b17.f361370e : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            kk4.c cVar12 = this.f361348e;
            if (cVar12 != null) {
                ((kk4.f0) cVar12).mo100945x683d6267(b17 != null ? b17.f361370e : null);
            }
        } else {
            if (b17 != null && b17.f361369d) {
                java.lang.String str5 = this.f361349f;
                if (str5 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "removeTask url is null.");
                } else {
                    java.lang.String b18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str5.getBytes());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "removeTask url: " + str5 + ", mediaId: " + b18);
                    h0Var.f361403e.remove(b18);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "createPlayer taskInfo is not complete, setDataSource " + this.f361349f);
            java.lang.String str6 = this.f361352i;
            if (str6.length() > 0) {
                kk4.c cVar13 = this.f361348e;
                if (cVar13 != null) {
                    ((kk4.f0) cVar13).mo100946x683d6267(this.f361349f, kz5.b1.e(new jz5.l("referer", str6)));
                }
            } else {
                kk4.c cVar14 = this.f361348e;
                if (cVar14 != null) {
                    ((kk4.f0) cVar14).mo100945x683d6267(this.f361349f);
                }
            }
        }
        android.view.Surface surface = this.f361360q;
        if (surface != null && (cVar = this.f361348e) != null) {
            ((kk4.f0) cVar).mo100970x42c875eb(surface);
        }
        this.f361356m.mo50293x3498a0(new ha3.a0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "createPlayer textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", url: " + this.f361349f);
    }

    @Override // ha3.a
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "disposePlayer textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", url: " + this.f361349f);
        ha3.i0 i0Var = ha3.j0.f361419a;
        java.util.HashMap hashMap = ha3.j0.f361421c;
        java.lang.String str = this.f361358o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        hashMap.remove(str);
        ha3.j0.f361420b.i(this.f361349f, this.f361351h);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            cVar.mo100976x360802();
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361353j;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        this.f361353j = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f361355l;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        this.f361355l = null;
        android.view.Surface surface = this.f361360q;
        if (surface != null) {
            surface.release();
        }
        this.f361360q = null;
        um5.p pVar = this.f361359p;
        pVar.g();
        pVar.b();
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100970x42c875eb(null);
        }
        kk4.c cVar3 = this.f361348e;
        if (cVar3 != null) {
            cVar3.mo100933x41012807();
        }
        this.f361348e = null;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f361342s;
        concurrentSkipListSet.remove(java.lang.String.valueOf(hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryQuitHandlerThread proxy:");
        sb6.append(hashCode());
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = f361343t;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (concurrentSkipListSet.isEmpty()) {
            android.os.HandlerThread handlerThread2 = f361343t;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            f361343t = null;
        }
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            ha3.e0 b17 = ha3.j0.f361420b.b(this.f361349f);
            if (b17 != null) {
                long j17 = b17.f361366a;
                long j18 = b17.f361368c;
                if (j17 > 0 && j18 > 0) {
                    d18 = ((j17 * 100.0d) / j18) * 1.0d;
                }
            }
            d18 = 0.0d;
        }
        hashMap.put("values", kz5.b0.c(kz5.c0.i(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(d18))));
        b(hashMap);
    }

    @Override // ha3.a
    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "setPlayerToMuted textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", outputMute: " + z17);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100965xd0747cbc(z17);
        }
    }

    @Override // ha3.a
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "resetPosition textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d);
        if (this.f361347d < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", "resetPosition wrong state");
            return;
        }
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100935xb0277d5();
        }
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100937xc9fc1b13(0, 3);
        }
    }

    @Override // ha3.a
    public boolean o() {
        return this.f361346c;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback
    /* renamed from: onSurfaceAvailable */
    public void mo133094xe037649b() {
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback
    /* renamed from: onSurfaceCleanup */
    public void mo133095xdff77cf6() {
    }

    @Override // ha3.a
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "playVideo textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d);
        int i17 = this.f361347d;
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "playVideo already playing");
            return;
        }
        if (i17 < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", "playVideo wrong state");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.j0.f361420b.h(this.f361349f);
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100935xb0277d5();
        }
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100975x68ac462();
        }
    }

    @Override // ha3.a
    public long q() {
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            return ((kk4.f0) cVar).mo100915xddd35a52();
        }
        return 0L;
    }

    @Override // ha3.a
    /* renamed from: seekTo */
    public void mo133092xc9fc1b13(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "seekTo textureId: " + this.f361357n + ", mediaId: " + this.f361358o + ", state: " + this.f361347d + ", location: " + i17);
        if (this.f361347d < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", "seekTo wrong state");
            return;
        }
        kk4.c cVar = this.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100935xb0277d5();
        }
        kk4.c cVar2 = this.f361348e;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).mo100937xc9fc1b13(i17, 3);
        }
    }
}
