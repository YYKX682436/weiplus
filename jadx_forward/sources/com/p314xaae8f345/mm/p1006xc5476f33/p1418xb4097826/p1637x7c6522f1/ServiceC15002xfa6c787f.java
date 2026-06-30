package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/system_player/FinderSystemPlayerService;", "Landroidx/media/MediaBrowserServiceCompat;", "Ldu2/w;", "<init>", "()V", "du2/r", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService */
/* loaded from: classes11.dex */
public final class ServiceC15002xfa6c787f extends p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 implements du2.w {

    /* renamed from: r, reason: collision with root package name */
    public static final du2.r f210010r = new du2.r(null);

    /* renamed from: n, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f210011n;

    /* renamed from: o, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 f210012o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f210013p = jz5.h.b(new du2.s(this));

    /* renamed from: q, reason: collision with root package name */
    public final int f210014q = hashCode() + 539300132;

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33
    public c4.l b(java.lang.String clientPackageName, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientPackageName, "clientPackageName");
        return new c4.l("FinderSystemPlayerService", null);
    }

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33
    public void c(java.lang.String parentId, c4.z result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentId, "parentId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        result.a();
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[cancelNotification]");
        du2.q qVar = (du2.q) ((jz5.n) this.f210013p).mo141623x754a37bb();
        qVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerNotificationManager", "cancelNotification");
            z2.n1 b17 = qVar.b();
            int i17 = this.f210014q;
            if (b17 != null) {
                b17.f551038b.cancel(null, i17);
            }
            qVar.f325031c.remove(java.lang.Integer.valueOf(i17));
            qVar.f325029a.stopForeground(1);
            qVar.f325032d = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderSystemPlayerNotificationManager", e17, "cancelNotification exception", new java.lang.Object[0]);
        }
    }

    public final void f() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f210011n;
        if (f0Var != null) {
            f0Var.f(null, null);
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var2 = this.f210011n;
        if (f0Var2 != null) {
            f0Var2.d();
        }
        e();
        i95.m c17 = i95.n0.c(du2.n.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        du2.n nVar = (du2.n) c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerManager", "disconnectService");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = nVar.f325021h;
        if (!((mVar == null || ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar.f90470a).f90460b.isConnected()) ? false : true)) {
            nVar.f325018e = false;
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar2 = nVar.f325021h;
            if (mVar2 != null) {
                mVar2.a();
            }
            nVar.f325021h = null;
            nVar.f325020g = null;
            nVar.f325017d = null;
            fu2.c Ai = du2.n.Ai(nVar, null, 1, null);
            if (Ai != null) {
                ((eu2.j) Ai).f338326d.mj();
            }
        }
        stopSelf();
    }

    public final void g(fu2.c cVar) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 c0049x5ee9be38;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f210011n;
        if (f0Var != null) {
            fu2.b bVar = ((eu2.j) cVar).f338325c;
            int i17 = bVar.f348408b;
            long j17 = bVar.f348407a;
            float f17 = bVar.f348409c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "state = " + i17 + ", currentPlayMs = " + j17 + ", playbackSpeed = " + f17);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = this.f210012o;
            if (k0Var != null) {
                k0Var.f90520g = 0L;
                k0Var.f90518e = 774L;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f90515b = i17;
                k0Var.f90516c = j17;
                k0Var.f90519f = elapsedRealtime;
                k0Var.f90517d = f17;
                c0049x5ee9be38 = k0Var.a();
            } else {
                c0049x5ee9be38 = null;
            }
            f0Var.h(c0049x5ee9be38);
        }
    }

    public final void h(fu2.c cVar) {
        eu2.j jVar = (eu2.j) cVar;
        cw2.wa waVar = jVar.f338326d.f338291e;
        if (waVar == null) {
            return;
        }
        android.graphics.Bitmap e17 = jVar.e();
        java.lang.String d17 = jVar.d();
        java.lang.String g17 = jVar.g();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r rVar = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r();
        rVar.c("android.media.metadata.DURATION", waVar.f305631e.e().m75942xfb822ef2(24));
        rVar.d("android.media.metadata.DISPLAY_TITLE", d17);
        rVar.d("android.media.metadata.TITLE", d17);
        rVar.d("android.media.metadata.ARTIST", g17);
        rVar.d("android.media.metadata.DISPLAY_SUBTITLE", g17);
        rVar.b("android.media.metadata.ALBUM_ART", e17);
        rVar.b("android.media.metadata.DISPLAY_ICON", e17);
        rVar.e("android.media.metadata.MEDIA_ID", java.lang.String.valueOf(waVar.f305632f.getFeedId()));
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f210011n;
        if (f0Var != null) {
            ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) f0Var.f90506a).f90532a.setQueueTitle(d17);
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var2 = this.f210011n;
        if (f0Var2 != null) {
            f0Var2.g(rVar.a());
        }
        g(cVar);
    }

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (gm0.j1.a()) {
            i95.m c17 = i95.n0.c(du2.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (!((du2.n) c17).f325018e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderSystemPlayerService", "[onCreate] service not create manually, just return!");
                stopSelf();
                return;
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f210011n;
            if (f0Var == null) {
                f0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0(this, "FinderSystemPlayerService");
                f0Var.f(new du2.u(this), null);
                android.app.PendingIntent a17 = f210010r.a(this);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar = f0Var.f90506a;
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) wVar).f90532a.setSessionActivity(a17);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("HMOS_MEDIA_CONTROLLER", true);
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) wVar).f90532a.setExtras(bundle);
                f0Var.e(true);
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.y) wVar).f90532a.setFlags(3);
                this.f210011n = f0Var;
            }
            d(f0Var.b());
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0();
            k0Var.f90518e = 774L;
            this.f210012o = k0Var;
            i95.m c18 = i95.n0.c(du2.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((du2.n) c18).f325017d = this;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_action_code", 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerService", "[onStartCommand] action: " + valueOf);
        if (valueOf != null && valueOf.intValue() == 2) {
            i95.m c17 = i95.n0.c(du2.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((du2.n) c17).Di();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            i95.m c18 = i95.n0.c(du2.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((du2.n) c18).Bi();
        } else if (valueOf != null && valueOf.intValue() == 5) {
            i95.m c19 = i95.n0.c(du2.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            fu2.c Ai = du2.n.Ai((du2.n) c19, null, 1, null);
            if (Ai != null) {
                eu2.b0 b0Var = ((eu2.j) Ai).f338326d;
                b0Var.hj(b0Var.f338293g);
            }
        }
        return 2;
    }
}
