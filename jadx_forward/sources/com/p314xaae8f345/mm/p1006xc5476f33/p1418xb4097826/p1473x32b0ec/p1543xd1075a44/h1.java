package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public abstract class h1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f200023y = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f200024h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f200025i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f200026m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f200027n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f200028o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f200029p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f200030q;

    /* renamed from: r, reason: collision with root package name */
    public gk2.e f200031r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f200032s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f200033t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 f200034u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f200035v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f200036w;

    /* renamed from: x, reason: collision with root package name */
    public zy2.gc f200037x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f200024h = "BaseJoinFansClubWidget";
        this.f200025i = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f200034u = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193949f;
    }

    public final void b() {
        jz5.f0 f0Var;
        long j17;
        r45.o72 o72Var;
        dk2.xf W0;
        long j18;
        r45.nw1 nw1Var;
        gk2.e eVar = this.f200031r;
        if (eVar != null && ((mm2.d) eVar.a(mm2.d.class)).f410475f) {
            gk2.e eVar2 = this.f200031r;
            if (eVar2 != null) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r4Var.Q(context, eVar2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f1(this));
                return;
            }
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        gk2.e eVar3 = this.f200031r;
        ya2.b2 b17 = gVar.b(eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f410385o : null);
        java.lang.String str = this.f200024h;
        if (b17 != null) {
            boolean f17 = hc2.s.f(b17);
            boolean a17 = hc2.s.a(b17);
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.String e17 = xy2.c.e(context2);
            gk2.e eVar4 = this.f200031r;
            long j19 = eVar4 != null ? ((mm2.e1) eVar4.a(mm2.e1.class)).f410516m : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doFollowLogic, nickName:" + b17.w0() + ", objectId:" + j19 + ", participantFinderUsername:" + e17 + ", isPrivate:" + f17 + " , isBlock" + a17);
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context3 = mo58053xfb84e958().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).c(zy2.ra.class))).V6();
            java.lang.String D0 = b17.D0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = m58104xb7f4f95a();
            if (m58104xb7f4f95a == null || (W0 = m58104xb7f4f95a.W0()) == null) {
                j17 = j19;
                o72Var = null;
            } else {
                gk2.e eVar5 = this.f200031r;
                if (eVar5 == null || (nw1Var = ((mm2.e1) eVar5.a(mm2.e1.class)).f410521r) == null) {
                    j17 = j19;
                    j18 = 0;
                } else {
                    j17 = j19;
                    j18 = nw1Var.m75942xfb822ef2(0);
                }
                o72Var = ((dk2.r4) W0).K(j18);
            }
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, e17, o72Var, null, null, null, null, null, null, 8064, null);
            if (a17) {
                java.lang.String D02 = b17.D0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[doBlockOpLog] ");
                this.f200037x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e1(this);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.j9.b(ya2.r.f542058a, D02, false, null, null, this.f200037x, 12, null);
            }
            this.f200036w = true;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doFollowLogic anchorContact is null!");
            db5.t7.g(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddq));
            this.f200036w = false;
        }
    }

    public abstract void c();

    public final void d() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f200026m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f200026m = null;
        this.f200036w = false;
    }

    public abstract void e(gk2.e eVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 eh0Var);

    /* renamed from: getBottomSheet */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 m58044xb4dbbcbe() {
        return this.f200026m;
    }

    /* renamed from: getBuContext */
    public final gk2.e m58045xd7793f26() {
        return this.f200031r;
    }

    /* renamed from: getDirectJoinListener */
    public final yz5.l m58046x48cff87d() {
        return this.f200028o;
    }

    /* renamed from: getFollow */
    public final boolean m58047x19745ea7() {
        return this.f200035v;
    }

    /* renamed from: getFromGiftPanel */
    public final boolean m58048x5db7b274() {
        return this.f200033t;
    }

    /* renamed from: getFromScene */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 m58049x38bbc4c() {
        return this.f200034u;
    }

    /* renamed from: getHelpClickListener */
    public final yz5.a m58050x527e5fe5() {
        return this.f200029p;
    }

    /* renamed from: getJoinClickListener */
    public final yz5.l m58051xf236f49c() {
        return this.f200027n;
    }

    /* renamed from: getNeedPurcahse */
    public final boolean m58052x24f779db() {
        return this.f200032s;
    }

    /* renamed from: getRoot */
    public abstract android.view.View mo58053xfb84e958();

    /* renamed from: getSubscribeSuperFansCallback */
    public final yz5.a m58054x49726b0c() {
        return this.f200030q;
    }

    /* renamed from: getTryFollowing */
    public final boolean m58055x4718a58c() {
        return this.f200036w;
    }

    /* renamed from: setBottomSheet */
    public final void m58056x4b413032(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f200026m = y1Var;
    }

    /* renamed from: setBuContext */
    public final void m58057x33ccff9a(gk2.e eVar) {
        this.f200031r = eVar;
    }

    /* renamed from: setDirectJoinListener */
    public final void m58058xdffb7a89(yz5.l lVar) {
        this.f200028o = lVar;
    }

    /* renamed from: setFollow */
    public final void m58059xca992b3(boolean z17) {
        this.f200035v = z17;
    }

    /* renamed from: setFromGiftPanel */
    public final void m58060xf08e18e8(boolean z17) {
        this.f200033t = z17;
    }

    /* renamed from: setFromScene */
    public final void m58061x5fdf7cc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 eh0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eh0Var, "<set-?>");
        this.f200034u = eh0Var;
    }

    /* renamed from: setHelpClickListener */
    public final void m58062x2e146c59(yz5.a aVar) {
        this.f200029p = aVar;
    }

    /* renamed from: setJoinClickListener */
    public final void m58063xcdcd0110(yz5.l lVar) {
        this.f200027n = lVar;
    }

    /* renamed from: setNeedPurcahse */
    public final void m58064x5b4074e7(boolean z17) {
        this.f200032s = z17;
    }

    /* renamed from: setSubscribeSuperFansCallback */
    public final void m58065x39312118(yz5.a aVar) {
        this.f200030q = aVar;
    }

    /* renamed from: setTryFollowing */
    public final void m58066x7d61a098(boolean z17) {
        this.f200036w = z17;
    }
}
