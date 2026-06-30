package bh2;

/* loaded from: classes10.dex */
public final class v implements bh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ah2.e f102426a;

    /* renamed from: b, reason: collision with root package name */
    public om2.s f102427b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f102428c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f102429d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc f102430e;

    /* renamed from: f, reason: collision with root package name */
    public bh2.b f102431f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams f102432g;

    /* renamed from: h, reason: collision with root package name */
    public long f102433h;

    /* renamed from: i, reason: collision with root package name */
    public long f102434i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f102435j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f102436k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f102437l;

    public v(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 trtcCloud, ah2.e service, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole chorusRole) {
        r45.ka4 ka4Var;
        r45.o30 o30Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.o30 o30Var2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        r45.o30 o30Var3;
        r45.o30 o30Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcCloud, "trtcCloud");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chorusRole, "chorusRole");
        this.f102426a = service;
        android.view.View.generateViewId();
        this.f102428c = "LiveKTVSongChorusPlayerHelper";
        this.f102429d = new android.os.Handler(android.os.Looper.getMainLooper());
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams();
        this.f102432g = tRTCParams;
        this.f102437l = chorusRole;
        dh2.x xVar = ((dh2.w) service).f313999a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = ((mm2.e1) xVar.f314001e.a(mm2.e1.class)).f410520q.f461833m;
        java.lang.String str = null;
        if (gVar3 != null) {
            r45.na4 na4Var = new r45.na4();
            na4Var.mo11468x92b714fd(gVar3.g());
            ka4Var = na4Var.f462730f;
        } else {
            ka4Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chorus_bgm_usr_info: ");
        sb6.append((ka4Var == null || (o30Var4 = ka4Var.G1) == null) ? null : pm0.b0.g(o30Var4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSongChorusPlayerHelper", sb6.toString());
        tRTCParams.f57079xe756702 = ((mm2.e1) xVar.f314001e.a(mm2.e1.class)).f410520q.f461827d;
        tRTCParams.f57083xce2b2e46 = (ka4Var == null || (o30Var3 = ka4Var.G1) == null) ? null : o30Var3.f463396d;
        tRTCParams.f57078xc8d8bf56 = ((mm2.e1) xVar.f314001e.a(mm2.e1.class)).f410520q.f461829f;
        tRTCParams.f57084xf73ac106 = (ka4Var == null || (o30Var2 = ka4Var.G1) == null || (gVar2 = o30Var2.f463397e) == null) ? null : gVar2.i();
        if (ka4Var != null && (o30Var = ka4Var.G1) != null && (gVar = o30Var.f463398f) != null) {
            str = gVar.i();
        }
        tRTCParams.f57076x19d1d6c6 = str;
        tRTCParams.f57077x358076 = 20;
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc m30429xaf65a0fc = com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.m30429xaf65a0fc(trtcCloud, java.lang.String.valueOf(tRTCParams.f57078xc8d8bf56), new bh2.t(this));
        this.f102430e = m30429xaf65a0fc;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSongChorusPlayerHelper", "setChorusRole chorusRole: " + chorusRole + " musicPlayer: " + m30429xaf65a0fc);
        if (m30429xaf65a0fc != null) {
            m30429xaf65a0fc.mo30456x37e4393e(chorusRole, tRTCParams);
        }
    }

    @Override // bh2.c
    public void a(float f17) {
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30458xed0efa1d(f17);
        }
    }

    @Override // bh2.c
    public void b(bh2.w channel, om2.s songData) {
        r45.yx1 yx1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songData, "songData");
        this.f102427b = songData;
        if (this.f102437l == com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay ktvSongInfo: ");
            om2.s sVar = this.f102427b;
            sb6.append((sVar == null || (yx1Var = sVar.f427911a) == null) ? null : pm0.b0.g(yx1Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, sb6.toString());
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams tXChorusExternalMusicParams = new com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams();
            om2.q qVar = songData.f427913c;
            tXChorusExternalMusicParams.f57247x324c710a = qVar.f427907c;
            tXChorusExternalMusicParams.f57243x4c3a2d54 = qVar.f427906b;
            tXChorusExternalMusicParams.f57246x54340220 = songData.a();
            tXChorusExternalMusicParams.f57245xa66d7bba = false;
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
            if (abstractC26790x777b55bc != null) {
                abstractC26790x777b55bc.mo30451x4b1651d4(tXChorusExternalMusicParams);
            }
            if (abstractC26790x777b55bc != null) {
                abstractC26790x777b55bc.mo30461x68ac462();
            }
            e(channel);
        }
    }

    @Override // bh2.c
    public boolean c() {
        return this.f102435j;
    }

    @Override // bh2.c
    public void d(int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30459x1ed14212(i17);
        }
        if (this.f102437l != com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger || abstractC26790x777b55bc == null) {
            return;
        }
        abstractC26790x777b55bc.mo30460xcd124bc7(i18);
    }

    @Override // bh2.c
    /* renamed from: destroy */
    public void mo10546x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, "destroy, currentRole: " + this.f102437l);
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole = this.f102437l;
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole2 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger;
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (tXChorusRole == tXChorusRole2 && abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30462x360802();
        }
        if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30449x5cd39ffa();
        }
    }

    @Override // bh2.c
    public void e(bh2.w channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        int i17 = bh2.u.f102425a[channel.ordinal()];
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (i17 == 1) {
            if (abstractC26790x777b55bc != null) {
                abstractC26790x777b55bc.mo30463x8f2f447a(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack.TXChorusOriginalSong);
            }
        } else if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30463x8f2f447a(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack.TXChorusAccompaniment);
        }
    }

    @Override // bh2.c
    public long f() {
        long j17 = 0;
        if (this.f102434i > 0 && this.f102436k) {
            j17 = java.lang.System.currentTimeMillis() - this.f102434i;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, "getCurPlayProgress 当前进度：" + this.f102433h + ", 偏移量：" + j17);
        return this.f102433h + j17;
    }

    @Override // bh2.c
    public void g(bh2.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f102431f = listener;
    }

    @Override // bh2.c
    /* renamed from: isPlaying */
    public boolean mo10547xc00617a4() {
        return this.f102436k;
    }

    @Override // bh2.c
    /* renamed from: pause */
    public void mo10548x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, "pause");
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30453x65825f6();
        }
    }

    @Override // bh2.c
    /* renamed from: resume */
    public void mo10549xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, "resume");
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
        if (abstractC26790x777b55bc != null) {
            abstractC26790x777b55bc.mo30454xc84dc82d();
        }
    }

    @Override // bh2.c
    /* renamed from: seek */
    public void mo10550x35ce78(long j17) {
        long f17 = f();
        if (j17 > f17) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = this.f102430e;
            if (abstractC26790x777b55bc != null) {
                abstractC26790x777b55bc.mo30455x35ce78(j17);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102428c, "ignore seek: " + j17 + ", currPos: " + f17);
    }
}
