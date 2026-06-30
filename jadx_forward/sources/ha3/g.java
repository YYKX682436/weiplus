package ha3;

/* loaded from: classes15.dex */
public final class g implements ha3.a, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback {

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f361383a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f361384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f361385c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f361386d;

    /* renamed from: e, reason: collision with root package name */
    public float f361387e;

    /* renamed from: f, reason: collision with root package name */
    public int f361388f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f361389g;

    /* renamed from: h, reason: collision with root package name */
    public m8.i0 f361390h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f361391i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f361392j;

    /* renamed from: k, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f361393k;

    /* renamed from: l, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f361394l;

    /* renamed from: m, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f361395m;

    /* renamed from: n, reason: collision with root package name */
    public final long f361396n;

    /* renamed from: o, reason: collision with root package name */
    public final um5.p f361397o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f361398p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f361399q;

    public g(android.content.Context context, java.lang.String dataSource, java.lang.String cacheKey, boolean z17, java.lang.String referer, int i17, int i18, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 eventChannel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referer, "referer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceProducer, "surfaceProducer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventChannel, "eventChannel");
        this.f361391i = "";
        this.f361392j = "";
        um5.p pVar = new um5.p();
        this.f361397o = pVar;
        this.f361389g = context;
        this.f361391i = dataSource;
        this.f361392j = cacheKey;
        this.f361393k = surfaceProducer;
        if (i17 != 0 && i18 != 0) {
            surfaceProducer.mo138098x76500f83(i17, i18);
            ha3.c cVar = new ha3.c(this);
            pVar.e(surfaceProducer.mo138084xcf572877(), i17, i18);
            pVar.n(cVar);
            this.f361399q = true;
        }
        this.f361396n = surfaceProducer.id();
        this.f361395m = eventChannel;
        eventChannel.m138415x95b45268(new ha3.b(this));
    }

    public final void a(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Object details) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(details, "details");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.e(this, errorCode, errorMessage, details));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361394l;
            if (eventSink != null) {
                eventSink.mo138417x5c4d208(errorCode, errorMessage, details);
            }
        }
    }

    public final void b(java.lang.Object event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ha3.f(this, event));
        } else {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f361394l;
            if (eventSink != null) {
                eventSink.mo138418x90b54003(event);
            }
        }
    }

    @Override // ha3.a
    public void e(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setVolume textureId: " + this.f361396n + ", state: " + this.f361388f + ", volume: " + d17);
        m8.i0 i0Var = this.f361390h;
        if (i0Var == null) {
            return;
        }
        i0Var.m((float) d17);
    }

    @Override // ha3.a
    public void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "updateSize texture: " + this.f361396n + ", state: " + this.f361388f);
        if (i17 == 0 || i18 == 0 || this.f361399q) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "updateSize: delayed init renderController with width=" + i17 + ", height=" + i18);
        ha3.c cVar = new ha3.c(this);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361393k;
        if (surfaceProducer != null) {
            surfaceProducer.mo138098x76500f83(i17, i18);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = this.f361393k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceProducer2);
        android.view.Surface mo138084xcf572877 = surfaceProducer2.mo138084xcf572877();
        um5.p pVar = this.f361397o;
        pVar.e(mo138084xcf572877, i17, i18);
        pVar.n(cVar);
        this.f361399q = true;
    }

    @Override // ha3.a
    public void g(double d17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerPlayBackRate textureId: " + this.f361396n + ", state: " + this.f361388f + ", playBackRate: " + d17);
        m8.y yVar = new m8.y((float) d17, 1.0f);
        m8.i0 i0Var = this.f361390h;
        if (i0Var == null) {
            return;
        }
        i0Var.a(yVar);
    }

    @Override // ha3.a
    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerLoop textureId: " + this.f361396n + ", state: " + this.f361388f + ", loop: " + z17);
        if (z17) {
            m8.i0 i0Var = this.f361390h;
            if (i0Var != null) {
                i0Var.k(1);
            }
        } else {
            m8.i0 i0Var2 = this.f361390h;
            if (i0Var2 != null) {
                i0Var2.k(0);
            }
        }
        this.f361385c = z17;
    }

    @Override // ha3.a
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "pauseVideo textureId: " + this.f361396n + ", state: " + this.f361388f);
        m8.i0 i0Var = this.f361390h;
        if (i0Var == null) {
            return;
        }
        i0Var.e(false);
    }

    @Override // ha3.a
    public void j() {
        m8.i0 i0Var;
        m8.i0 i0Var2 = new m8.i0(new m8.d(this.f361389g, null, 0), new q9.h(new q9.a(new r9.p())), new m8.c(new r9.o(true, 65536), 15000, 30000, 2500L, 5000L));
        this.f361390h = i0Var2;
        ha3.d dVar = new ha3.d(this);
        i0Var2.g(dVar);
        m8.i0 i0Var3 = this.f361390h;
        if (i0Var3 != null) {
            i0Var3.f406095c.add(dVar);
        }
        m8.i0 i0Var4 = this.f361390h;
        if (i0Var4 != null) {
            i0Var4.f406097e.add(dVar);
        }
        java.lang.String str = this.f361392j;
        if (str.length() == 0) {
            str = this.f361391i;
        }
        this.f361391i = str;
        d9.v vVar = new d9.v(com.p314xaae8f345.mm.vfs.z7.a(str).h(), new r9.v(), new q8.c(), null, null);
        android.view.Surface surface = this.f361398p;
        if (surface != null && (i0Var = this.f361390h) != null) {
            i0Var.l(surface, false);
        }
        m8.i0 i0Var5 = this.f361390h;
        if (i0Var5 != null) {
            ((m8.k) i0Var5.f406094b).j(vVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "createPlayer textureId: " + this.f361396n + ", state: " + this.f361388f + ", url: " + this.f361391i);
    }

    @Override // ha3.a
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "disposePlayer textureId: " + this.f361396n + ", state: " + this.f361388f + ", url: " + this.f361391i);
        m8.i0 i0Var = this.f361390h;
        if (i0Var != null) {
            i0Var.n();
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f361393k;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        this.f361393k = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f361395m;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        this.f361395m = null;
        android.view.Surface surface = this.f361398p;
        if (surface != null) {
            surface.release();
        }
        this.f361398p = null;
        um5.p pVar = this.f361397o;
        pVar.g();
        pVar.b();
        m8.i0 i0Var2 = this.f361390h;
        if (i0Var2 != null) {
            i0Var2.l(null, false);
        }
        m8.i0 i0Var3 = this.f361390h;
        if (i0Var3 != null) {
            i0Var3.mo146927x41012807();
        }
        this.f361390h = null;
    }

    @Override // ha3.a
    public void l(java.lang.Double d17) {
        double d18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "bufferingUpdate");
        if (d17 != null) {
            d18 = d17.doubleValue();
        } else {
            d18 = this.f361390h != null ? r7.h() : 0.0d;
        }
        hashMap.put("values", kz5.b0.c(kz5.c0.i(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(d18))));
        b(hashMap);
    }

    @Override // ha3.a
    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "setPlayerToMuted textureId: " + this.f361396n + ", state: " + this.f361388f + ", muted: " + z17);
        if (z17 == this.f361386d) {
            return;
        }
        if (z17) {
            m8.i0 i0Var = this.f361390h;
            this.f361387e = i0Var != null ? i0Var.f406104l : 0.0f;
            if (i0Var != null) {
                i0Var.m(0.0f);
            }
        } else {
            m8.i0 i0Var2 = this.f361390h;
            if (i0Var2 != null) {
                i0Var2.m(this.f361387e);
            }
            this.f361387e = 0.0f;
        }
        this.f361386d = z17;
    }

    @Override // ha3.a
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "resetPosition textureId: " + this.f361396n + ", state: " + this.f361388f);
        m8.i0 i0Var = this.f361390h;
        if (i0Var != null) {
            i0Var.mo146928xc9fc1b13(0L);
        }
    }

    @Override // ha3.a
    public boolean o() {
        return this.f361385c;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "playVideo textureId: " + this.f361396n + ", state: " + this.f361388f);
        m8.i0 i0Var = this.f361390h;
        if (i0Var == null) {
            return;
        }
        i0Var.e(true);
    }

    @Override // ha3.a
    public long q() {
        m8.i0 i0Var = this.f361390h;
        if (i0Var != null) {
            return i0Var.mo146925x9746038c();
        }
        return 0L;
    }

    @Override // ha3.a
    /* renamed from: seekTo */
    public void mo133092xc9fc1b13(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "seekTo textureId: " + this.f361396n + ", state: " + this.f361388f + ", location: " + i17);
        m8.i0 i0Var = this.f361390h;
        if (i0Var != null) {
            i0Var.mo146928xc9fc1b13(i17);
        }
    }
}
