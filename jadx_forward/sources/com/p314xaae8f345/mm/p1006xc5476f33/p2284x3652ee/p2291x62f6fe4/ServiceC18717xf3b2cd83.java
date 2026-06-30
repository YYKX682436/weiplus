package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/ting/media/TingMediaBrowserService;", "Lcom/tencent/mm/plugin/ting/media/BaseTingMediaBrowserService;", "Lrl4/b;", "Lrl4/a;", "Lfl4/c;", "<init>", "()V", "fl4/e", "fl4/g", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.media.TingMediaBrowserService */
/* loaded from: classes11.dex */
public final class ServiceC18717xf3b2cd83 extends com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18715x3c419372 implements rl4.b, rl4.a, fl4.c {
    public static final fl4.e I = new fl4.e(null);
    public b66.n A;
    public java.lang.String B;
    public bw5.tp0 C;
    public java.lang.String D;
    public java.lang.String E;
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r F;
    public final jz5.g G;
    public final jz5.g H;

    /* renamed from: n, reason: collision with root package name */
    public final fl4.k f256224n;

    /* renamed from: o, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f256225o;

    /* renamed from: p, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 f256226p;

    /* renamed from: q, reason: collision with root package name */
    public tl4.e f256227q;

    /* renamed from: r, reason: collision with root package name */
    public tl4.a f256228r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f256229s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f256230t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.eq0 f256231u;

    /* renamed from: v, reason: collision with root package name */
    public rl4.c f256232v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f256233w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.jq0 f256234x;

    /* renamed from: y, reason: collision with root package name */
    public int f256235y;

    /* renamed from: z, reason: collision with root package name */
    public long f256236z;

    public ServiceC18717xf3b2cd83() {
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        this.f256224n = new fl4.k(this);
        this.f256229s = "";
        this.B = "";
        this.D = "";
        this.E = "";
        this.F = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r();
        this.G = jz5.h.b(new fl4.i(this));
        this.H = jz5.h.b(new fl4.j(this));
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "real cancel notification ok, is not playable");
        this.f256229s = "";
        this.f256230t = null;
        tl4.a aVar = this.f256228r;
        if (aVar != null) {
            ((tl4.h) aVar).a();
        }
    }

    public final void f() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var2 = this.f256225o;
        if (f0Var2 == null) {
            return;
        }
        try {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = this.f256226p;
            if (k0Var != null) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f90515b = 0;
                k0Var.f90516c = 0L;
                k0Var.f90519f = elapsedRealtime;
                k0Var.f90517d = 0.0f;
                f0Var2.h(k0Var.a());
            }
            f0Var = this.f256225o;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMediaBrowserService", "deactivateAndReleaseSession error: " + e17.getMessage());
        }
        if (f0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
            throw null;
        }
        f0Var.e(false);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var3 = this.f256225o;
        if (f0Var3 != null) {
            f0Var3.d();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
            throw null;
        }
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "disConnectSession bizType:" + this.f256231u);
        d75.b.g(new fl4.l(this, null));
        f();
        d75.b.g(tl4.o.f501858d);
    }

    public final b66.n h() {
        b66.g gVar;
        b66.n a17;
        b66.n nVar = this.A;
        if (nVar != null) {
            return nVar;
        }
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f256233w;
        if (c26845xac206036 == null || (gVar = (b66.g) c26845xac206036.m106052x32c52b()) == null || (a17 = ((b66.i) gVar).a()) == null) {
            return null;
        }
        this.A = a17;
        return a17;
    }

    public void i(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036, bw5.eq0 appId, bw5.jq0 playingInfo) {
        bw5.v70 d17;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac2060362;
        b66.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playingInfo, "playingInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate playAppRef: " + c26845xac206036 + ", appId: " + appId + ", playingInfo.status: " + playingInfo.f110643e);
        if (this.f256231u != appId) {
            this.f256231u = appId;
            if (playingInfo.f110643e == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate playTask is idle, don't need to recreate notification manager bizType:" + this.f256231u);
                return;
            }
            if (c26845xac206036 != null && (gVar = (b66.g) c26845xac206036.m106052x32c52b()) != null) {
                this.f256232v = wl4.w.f528637a.a(((b66.i) gVar).m9897x74292566(), null);
            }
            tl4.a aVar = this.f256228r;
            if (aVar != null) {
                ((tl4.h) aVar).a();
            }
            rl4.c cVar = this.f256232v;
            bw5.eq0 eq0Var = this.f256231u;
            if (cVar == null || eq0Var == null) {
                this.f256228r = null;
            } else {
                this.f256228r = new wl4.m(this, this.f256233w, cVar, eq0Var);
            }
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f256233w, c26845xac206036);
        fl4.e eVar = I;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate update playApp: " + c26845xac206036);
            b66.n h17 = h();
            fl4.k kVar = this.f256224n;
            if (h17 != null) {
                ((b66.q) h17).j(kVar);
            }
            if (c26845xac206036 != null) {
                b66.g gVar2 = (b66.g) c26845xac206036.m106052x32c52b();
                this.A = gVar2 != null ? ((b66.i) gVar2).a() : null;
                c26845xac2060362 = c26845xac206036;
            } else {
                c26845xac2060362 = null;
            }
            this.f256233w = c26845xac2060362;
            b66.n h18 = h();
            this.f256235y = h18 != null ? eVar.a(((b66.q) h18).n()) : 0;
            this.C = null;
            b66.n h19 = h();
            if (h19 != null) {
                ((b66.q) h19).a(kVar);
            }
            tl4.a aVar2 = this.f256228r;
            if (aVar2 != null) {
                ((tl4.h) aVar2).f501843c = c26845xac206036;
            }
            j(c26845xac206036);
        }
        tl4.e eVar2 = this.f256227q;
        if (eVar2 != null) {
            eVar2.f501838j = playingInfo;
        }
        bw5.lp0 b18 = playingInfo.b();
        java.lang.String m13170xcc16feb8 = (b18 == null || (d17 = b18.d()) == null) ? null : d17.m13170xcc16feb8();
        if (m13170xcc16feb8 == null) {
            m13170xcc16feb8 = "";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m13170xcc16feb8, this.B)) {
            this.C = null;
            this.B = m13170xcc16feb8;
        }
        this.f256234x = playingInfo;
        b66.n h27 = h();
        if (h27 == null) {
            return;
        }
        int a17 = eVar.a(((b66.q) h27).n());
        if (this.f256235y != a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "onStatusChanged systemState = " + a17);
        }
        try {
            l(a17, playingInfo, -1L, -1L);
            k(a17, playingInfo);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingMediaBrowserService", e17, "onStatusChanged", new java.lang.Object[0]);
        }
        this.f256235y = a17;
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.TingMediaBrowserService");
        if (a17 == 2) {
            boolean Ai = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).Ai();
            ((ov.k0) ((pv.h0) i95.n0.c(pv.h0.class))).getClass();
            boolean b19 = qp1.q.b();
            if (Ai || !b19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "begin pause notification runnable isInTing " + Ai + ", hasFloatPermission " + b19);
                ku5.u0 u0Var = ku5.t0.f394148d;
                fl4.g gVar3 = (fl4.g) ((jz5.n) this.H).mo141623x754a37bb();
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                java.util.Objects.requireNonNull(gVar3);
                t0Var.w(gVar3, 300000L, "MicroMsg.TingMediaBrowserService");
            }
        }
    }

    public final void j(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036) {
        tl4.e eVar = this.f256227q;
        if (eVar != null && eVar.m() == this.f256231u) {
            tl4.e eVar2 = this.f256227q;
            if (eVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "updatePlayApp playAppRef: " + c26845xac206036);
                eVar2.f501834f = c26845xac206036;
                return;
            }
            return;
        }
        bw5.eq0 eq0Var = this.f256231u;
        if (eq0Var == bw5.eq0.AudioRadio) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "updateMediaSessionCallback create media session callback, playAppRef: " + c26845xac206036);
            am4.h hVar = new am4.h(c26845xac206036);
            this.f256227q = hVar;
            d75.b.g(new fl4.l(this, hVar));
            return;
        }
        rl4.c cVar = this.f256232v;
        if (cVar == null || eq0Var == null) {
            this.f256227q = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "updateMediaSessionCallback create media session callback, playAppRef: " + c26845xac206036);
        if (eq0Var == bw5.eq0.TingChatRoom) {
            this.f256227q = new wl4.g(c26845xac206036, cVar);
        } else if (eq0Var == bw5.eq0.TingMusic) {
            this.f256227q = new wl4.u(c26845xac206036);
        } else {
            this.f256227q = new wl4.q(c26845xac206036, cVar, eq0Var);
        }
        d75.b.g(new fl4.l(this, this.f256227q));
    }

    public final void k(int i17, bw5.jq0 jq0Var) {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "api 26 disable notify");
            return;
        }
        if (i17 != 0) {
            if (i17 != 1) {
                if (jq0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMediaBrowserService", "updateSystemNotify playingInfo is null");
                    return;
                }
                java.lang.String m13171x7531c8a2 = jq0Var.b().d().m13171x7531c8a2();
                if (m13171x7531c8a2 == null) {
                    m13171x7531c8a2 = "";
                }
                java.lang.String c17 = jq0Var.b().d().c();
                if (c17 == null) {
                    c17 = "";
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = m13171x7531c8a2;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var2.f391656d = c17;
                if (this.C != null) {
                    h0Var.f391656d = m13171x7531c8a2 + " - " + c17;
                    bw5.tp0 tp0Var = this.C;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tp0Var);
                    java.lang.String str = tp0Var.f115107h[3] ? tp0Var.f115105f : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getText(...)");
                    h0Var2.f391656d = str;
                }
                android.graphics.Bitmap bitmap = this.f256230t;
                boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
                tl4.a aVar = this.f256228r;
                if (aVar != null) {
                    java.lang.String str2 = (java.lang.String) h0Var.f391656d;
                    java.lang.Object obj = h0Var2.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    java.lang.String str3 = (java.lang.String) obj;
                    android.graphics.Bitmap bitmap2 = z17 ? this.f256230t : null;
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f256225o;
                    if (f0Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
                        throw null;
                    }
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 b17 = f0Var.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getSessionToken(...)");
                    ((tl4.h) aVar).c(jq0Var, i17, str2, str3, bitmap2, b17);
                }
                java.lang.String f17 = jq0Var.b().d().f();
                if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f256229s, f17)) {
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                if (f17.length() > 0) {
                    ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Zi(f17, null, 0, 500, 500, null, new jl4.a(new fl4.n(jq0Var, this, f17, i17, h0Var, h0Var2)));
                    return;
                } else {
                    this.f256229s = "";
                    this.f256230t = null;
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "call cancelNotification");
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if ((r10.isRecycled()) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18, bw5.jq0 r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83.l(int, bw5.jq0, long, long):void");
    }

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33, android.app.Service
    public void onCreate() {
        bw5.jq0 jq0Var;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036;
        android.content.Intent launchIntentForPackage;
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "onCreate %s", getPackageName());
        if (!tl4.p.f501862d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMediaBrowserService", "onCreate not create by self, just return");
            stopSelf();
            return;
        }
        ef0.q3 q3Var = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var.getClass();
        q3Var.f333839d.add(this);
        ef0.q3 q3Var2 = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var2.getClass();
        q3Var2.f333840e.add(this);
        android.content.pm.PackageManager packageManager = getPackageManager();
        android.app.PendingIntent activity = (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(getPackageName())) == null) ? null : android.app.PendingIntent.getActivity(this, 0, launchIntentForPackage, fp.g0.a(0));
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0(this, "MicroMsg.TingMediaBrowserService");
        this.f256225o = f0Var;
        tl4.e eVar = this.f256227q;
        if (eVar == null) {
            j(this.f256233w);
            eVar = this.f256227q;
        }
        f0Var.f(eVar, null);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar = f0Var.f90506a;
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) wVar).f90532a.setSessionActivity(activity);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("HMOS_MEDIA_CONTROLLER", true);
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) wVar).f90532a.setExtras(bundle);
        f0Var.e(true);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var2 = this.f256225o;
        if (f0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
            throw null;
        }
        d(f0Var2.b());
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0();
        k0Var.f90518e = 1847L;
        this.f256226p = k0Var;
        bw5.eq0 eq0Var = this.f256231u;
        if (eq0Var == null || (jq0Var = this.f256234x) == null || (c26845xac206036 = this.f256233w) == null) {
            b66.h hVar = b66.i.f99700d;
            b66.g gVar = (b66.g) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169639x21b0e175();
            if (gVar instanceof jm4.n2) {
                b66.g gVar2 = (jm4.n2) gVar;
                jm4.m2 m2Var = (jm4.m2) p3380x6a61f93.p3381xf512d0a5.C30463x21b415b4.m169150x21b85833(((jm4.p2) gVar2).m105978x2737f10());
                if (m2Var instanceof tl4.l) {
                    bw5.eq0 m9897x74292566 = ((b66.i) gVar2).m9897x74292566();
                    bw5.jq0 jq0Var2 = ((tl4.l) m2Var).f501856g;
                    if (jq0Var2 != null) {
                        i(new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(gVar), m9897x74292566, jq0Var2);
                    }
                }
            }
        } else {
            i(c26845xac206036, eq0Var, jq0Var);
        }
        jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273.f256221c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273 c18716xd759b273 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273.f256221c).mo141623x754a37bb();
        c18716xd759b273.getClass();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) c18716xd759b273.f256223b).mo141623x754a37bb()).put(java.lang.Integer.valueOf(hashCode()), this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMediaBrowserService", "onDestroy bizType:" + this.f256231u);
        super.onDestroy();
        b66.n h17 = h();
        if (h17 != null) {
            ((b66.q) h17).j(this.f256224n);
        }
        ef0.q3 q3Var = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var.getClass();
        q3Var.f333839d.remove(this);
        ef0.q3 q3Var2 = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var2.getClass();
        q3Var2.f333840e.remove(this);
        this.A = null;
        this.f256233w = null;
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.TingMediaBrowserService");
        e();
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273.f256221c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273 c18716xd759b273 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.C18716xd759b273.f256221c).mo141623x754a37bb();
        c18716xd759b273.getClass();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) ((jz5.n) c18716xd759b273.f256223b).mo141623x754a37bb()).m77803xc84af884(java.lang.Integer.valueOf(hashCode()));
        if (this.f256225o == null) {
            return;
        }
        f();
        d75.b.g(tl4.o.f501858d);
    }
}
