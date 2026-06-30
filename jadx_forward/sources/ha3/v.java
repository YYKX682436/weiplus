package ha3;

/* loaded from: classes15.dex */
public final class v implements ha3.a, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f361471t;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f361472a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f361473b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f361474c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f361475d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f361476e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f361477f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f361478g;

    /* renamed from: h, reason: collision with root package name */
    public int f361479h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f361480i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f361481j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f361482k;

    /* renamed from: l, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f361483l;

    /* renamed from: m, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f361484m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f361485n;

    /* renamed from: o, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f361486o;

    /* renamed from: p, reason: collision with root package name */
    public ha3.j f361487p;

    /* renamed from: q, reason: collision with root package name */
    public final long f361488q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f361489r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f361490s;

    public v(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 eventChannel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referer, "referer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceProducer, "surfaceProducer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventChannel, "eventChannel");
        this.f361474c = "";
        this.f361475d = "";
        this.f361481j = "";
        this.f361485n = true;
        this.f361490s = p3325xe03a0797.p3326xc267989b.z0.b();
        if (!f361471t) {
            f361471t = true;
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101112x7421050a(context, "60303", 1);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101129xd5038bcf(true);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101132x4f6110c3(100);
        }
        this.f361480i = context;
        this.f361472a = dataSource;
        this.f361481j = cacheKey;
        this.f361482k = z17;
        this.f361483l = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.mo138098x76500f83(i17, i18);
        }
        this.f361488q = surfaceProducer.id();
        this.f361486o = eventChannel;
        eventChannel.m138415x95b45268(new ha3.h(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(details, "details");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.p(this, errorCode, errorMessage, details));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361484m;
            if (eventSink != null) {
                eventSink.mo138417x5c4d208(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.q(this, event));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361484m;
            if (eventSink != null) {
                eventSink.mo138418x90b54003(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setVolume textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", volume: " + d17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.u(this, d17, null), 3, null);
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "updateSize texture: " + this.f361488q + ", state: " + this.f361479h);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361483l;
        if (surfaceProducer != null) {
            surfaceProducer.mo138098x76500f83(i17, i18);
        }
    }

    @Override // ha3.a
    public void g(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerPlayBackRate textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", playBackRate: " + d17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.s(this, d17, null), 3, null);
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerLoop textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", loop: " + z17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.r(this, z17, null), 3, null);
    }

    @Override // ha3.a
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "pauseVideo textureId: " + this.f361488q + ", mediaId:" + this.f361489r + ", state: " + this.f361479h);
        if (this.f361479h == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "pauseVideo already pausing");
            return;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.j0.f361420b.i(this.f361472a, this.f361482k);
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.l(this, null), 3, null);
    }

    @Override // ha3.a
    public void j() {
        java.lang.String str = this.f361481j;
        if (str.length() == 0) {
            str = this.f361472a;
        }
        this.f361472a = str;
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.j0.f361420b.h(str);
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f361472a);
        this.f361489r = a17;
        java.util.HashMap hashMap = ha3.j0.f361421c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        hashMap.put(a17, this);
        this.f361473b = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(this.f361480i);
        java.lang.String str2 = this.f361489r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String str3 = this.f361472a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        ha3.j jVar = new ha3.j(this, str2, str3);
        this.f361487p = jVar;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100906x969bf12(jVar);
        }
        ha3.i iVar = new ha3.i(this);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f361473b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100954x6954c27b(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = this.f361473b;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100957x5dd7c812(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc64 = this.f361473b;
        if (interfaceC26164x73fc6bc64 != null) {
            interfaceC26164x73fc6bc64.mo100964x2d6d87cd(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc65 = this.f361473b;
        if (interfaceC26164x73fc6bc65 != null) {
            interfaceC26164x73fc6bc65.mo100956xa23b7bf3(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc66 = this.f361473b;
        if (interfaceC26164x73fc6bc66 != null) {
            interfaceC26164x73fc6bc66.mo100955x40f8c003(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc67 = this.f361473b;
        if (interfaceC26164x73fc6bc67 != null) {
            interfaceC26164x73fc6bc67.mo100951xa4560c71(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc68 = this.f361473b;
        if (interfaceC26164x73fc6bc68 != null) {
            interfaceC26164x73fc6bc68.mo100958xe1a2e326(iVar);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc69 = this.f361473b;
        if (interfaceC26164x73fc6bc69 != null) {
            interfaceC26164x73fc6bc69.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(123, false));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc610 = this.f361473b;
        if (interfaceC26164x73fc6bc610 != null) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361483l;
            interfaceC26164x73fc6bc610.mo100970x42c875eb(surfaceProducer != null ? surfaceProducer.mo138084xcf572877() : null);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = this.f361483l;
        this.f361485n = (surfaceProducer2 != null ? surfaceProducer2.mo138084xcf572877() : null) == null;
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.k(this, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "createPlayer textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", url: " + this.f361472a);
    }

    @Override // ha3.a
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "disposePlayer textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", url: " + this.f361472a);
        ha3.i0 i0Var = ha3.j0.f361419a;
        java.util.HashMap hashMap = ha3.j0.f361421c;
        java.lang.String str = this.f361489r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        hashMap.remove(str);
        ha3.h0 h0Var = ha3.j0.f361420b;
        h0Var.i(this.f361472a, this.f361482k);
        java.lang.String str2 = this.f361489r;
        java.util.Map map = h0Var.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(str2);
        if (e0Var != null && e0Var.f361371f) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                ha3.e0 e0Var2 = (ha3.e0) entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                if (r26.i0.y(str3, str2 + '@', false)) {
                    ha3.j0.f361419a.b(str3);
                    e0Var2.f361372g = false;
                }
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100976x360802();
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361483l;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        this.f361483l = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f361486o;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        this.f361486o = null;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f361473b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100970x42c875eb(null);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = this.f361473b;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100933x41012807();
        }
        this.f361473b = null;
        p3325xe03a0797.p3326xc267989b.z0.e(this.f361490s, null, 1, null);
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            ha3.e0 b17 = ha3.j0.f361420b.b(this.f361472a);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "setPlayerToMuted textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", outputMute: " + z17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.t(this, z17, null), 3, null);
    }

    @Override // ha3.a
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "resetPosition textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h);
        if (this.f361479h < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "resetPosition wrong state");
            return;
        }
        ha3.j jVar = this.f361487p;
        if (jVar != null) {
            jVar.a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.n(this, null), 3, null);
    }

    @Override // ha3.a
    public boolean o() {
        return this.f361478g;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback
    /* renamed from: onSurfaceAvailable */
    public void mo133094xe037649b() {
        if (this.f361485n) {
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f361473b;
            if (interfaceC26164x73fc6bc6 != null) {
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361483l;
                interfaceC26164x73fc6bc6.mo100970x42c875eb(surfaceProducer != null ? surfaceProducer.mo138084xcf572877() : null);
            }
            this.f361485n = false;
        }
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback
    /* renamed from: onSurfaceCleanup */
    public void mo133095xdff77cf6() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(null);
        }
        this.f361485n = true;
    }

    @Override // ha3.a
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "playVideo textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h);
        int i17 = this.f361479h;
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "playVideo already playing");
        } else if (i17 < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "playVideo wrong state");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.m(this, null), 3, null);
        }
    }

    @Override // ha3.a
    public long q() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            return interfaceC26164x73fc6bc6.mo100915xddd35a52();
        }
        return 0L;
    }

    @Override // ha3.a
    /* renamed from: seekTo */
    public void mo133092xc9fc1b13(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "seekTo textureId: " + this.f361488q + ", mediaId: " + this.f361489r + ", state: " + this.f361479h + ", location: " + i17);
        if (this.f361479h < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHLSPlayer", "seekTo wrong state");
            return;
        }
        ha3.j jVar = this.f361487p;
        if (jVar != null) {
            jVar.a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f361490s, null, null, new ha3.o(this, i17, null), 3, null);
    }
}
