package y40;

@j95.b
/* loaded from: classes11.dex */
public final class i0 extends i95.w implements z40.e {

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f540830f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f540831g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f540832h;

    /* renamed from: i, reason: collision with root package name */
    public long f540833i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f540834m;

    /* renamed from: w, reason: collision with root package name */
    public long f540844w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f540828d = "Finder.BoxFlutterBizFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f540829e = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f540835n = jz5.h.b(new y40.z(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f540836o = jz5.h.b(new y40.h0(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f540837p = jz5.h.b(new y40.b(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f540838q = jz5.h.b(new y40.a(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f540839r = jz5.h.b(new y40.i(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f540840s = jz5.h.b(y40.b0.f540813d);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f540841t = jz5.h.b(new y40.y(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f540842u = jz5.h.b(y40.k.f540850d);

    /* renamed from: v, reason: collision with root package name */
    public final long f540843v = 15000;

    public static final void wi(y40.i0 i0Var) {
        i0Var.getClass();
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32266, new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17 = a50.e1.f83004a.a();
            if (a17 != null) {
                a17.p(y40.h.f540825a);
            }
        }
    }

    public void Ai() {
        if (Ni()) {
            boolean z17 = yw.h1.f547865a.m().o("hide_box_when_delete", 0) == 1;
            if (z17) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f540842u).mo141623x754a37bb()).G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", true);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17 = a50.e1.f83004a.a();
            if (a17 != null) {
                a17.v(z17, y40.f.f540820a);
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f540829e, null, null, new y40.j(this, null), 3, null);
    }

    public boolean Bi(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - this.f540844w);
        java.lang.String str = this.f540828d;
        if (abs < 1000) {
            jx3.f.INSTANCE.w(1971L, 7L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openBizTimeLineWithFlutter click in 1000ms");
            return false;
        }
        if (this.f540830f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "current job not finish, return (lastClickTime=" + this.f540844w + "  current=" + currentTimeMillis + ')');
            return false;
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428858v);
        eq1.j.f337354a.j();
        this.f540844w = currentTimeMillis;
        this.f540833i = currentTimeMillis;
        this.f540830f = p3325xe03a0797.p3326xc267989b.l.d(this.f540829e, null, null, new y40.x(currentTimeMillis, intent, this, context, null), 3, null);
        return true;
    }

    public boolean Di() {
        int i17 = yw.h1.f547869e;
        if (!((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f540836o).mo141623x754a37bb()).booleanValue()) || a50.e1.f83009f) {
            yw.h1 h1Var = yw.h1.f547865a;
            int i18 = yw.h1.f547868d;
            return (i18 == 1 || i18 != 0) && ((java.lang.Boolean) ((jz5.n) this.f540835n).mo141623x754a37bb()).booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f540828d, "openFlutterBizTimeLineUseAff dbInitDone false!, check BoxFlutterBizMsgBridge.init(), forceSetEnableFinderBox(false)");
        i95.m c17 = i95.n0.c(l85.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        l85.d0 d0Var = (l85.d0) ((l85.g0) c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.BoxFinderConfigToBoxSpi", "force set enableFinderBox from " + d0Var.f398677d + " to false");
        d0Var.f398677d = java.lang.Boolean.FALSE;
        return false;
    }

    public boolean Ni() {
        int i17 = yw.h1.f547869e;
        boolean z17 = ((i17 == 1 || i17 != 0) && ((java.lang.Boolean) ((jz5.n) this.f540836o).mo141623x754a37bb()).booleanValue()) && a50.e1.f83009f && Di();
        synchronized (a50.e1.f83004a) {
            if (a50.e1.f83010g == null) {
                jz5.g gVar = a50.e1.f83005b;
                boolean i18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).i("openAff", false);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).G("openAff", z17);
                if (i18 == z17 || !z17) {
                    a50.e1.f83010g = java.lang.Boolean.FALSE;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxFlutterBizMsgBridge", "resetData");
                    a50.e1.f83010g = java.lang.Boolean.TRUE;
                }
            }
        }
        return z17;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540828d, "onAccountInitialized");
        if (z40.e.l4()) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd>(a0Var) { // from class: com.tencent.mm.feature.finderbox.BoxFlutterBizFeatureService$onAccountInitialized$1
                {
                    this.f39173x3fe91575 = 915464157;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd c5213x5fcd2dcd) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5213x5fcd2dcd event = c5213x5fcd2dcd;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y40.i0.this.f540828d, "receive reliable notify");
                    if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                        return true;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0.f300868b.u(event.f135549g.f88260a, y40.l.f540851a);
                    return true;
                }
            };
            this.f540834m = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
            a50.e1.f83004a.b();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540828d, "onAccountReleased");
        if (z40.e.l4()) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f540834m;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            this.f540834m = null;
            synchronized (a50.e1.f83004a) {
                a50.e1.f83007d = false;
            }
        }
    }
}
