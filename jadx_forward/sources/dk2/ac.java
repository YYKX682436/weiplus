package dk2;

/* loaded from: classes3.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public final r45.bd5 f314730a;

    /* renamed from: b, reason: collision with root package name */
    public final long f314731b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f314732c;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f314733d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ya2 f314734e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f314735f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f314736g;

    public ac(r45.bd5 bd5Var, long j17, android.content.Context context, gk2.e eVar, r45.ya2 scene, yz5.a refresher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refresher, "refresher");
        this.f314730a = bd5Var;
        this.f314731b = j17;
        this.f314732c = context;
        this.f314733d = eVar;
        this.f314734e = scene;
        this.f314735f = refresher;
        this.f314736g = "Finder.FinderLiveProductSubscribePresenter";
    }

    public final void a() {
        r45.ld2 ld2Var;
        r45.za2 za2Var = new r45.za2();
        r45.bd5 bd5Var = this.f314730a;
        int i17 = 1;
        za2Var.set(1, java.lang.Integer.valueOf(bd5Var != null ? bd5Var.m75939xb282bd08(13) : 0));
        za2Var.set(0, java.lang.Long.valueOf(this.f314731b));
        za2Var.set(2, java.lang.Integer.valueOf(this.f314734e.f472456d));
        r45.bd5 bd5Var2 = this.f314730a;
        za2Var.set(3, java.lang.Integer.valueOf(bd5Var2 != null ? bd5Var2.m75939xb282bd08(15) : 0));
        gk2.e eVar = this.f314733d;
        if (eVar == null) {
            ld2Var = new r45.ld2();
        } else {
            r45.ld2 ld2Var2 = new r45.ld2();
            ld2Var2.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
            ld2Var2.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            ld2Var2.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            if (!c1Var.N7()) {
                if (c1Var.T) {
                    i17 = 3;
                } else {
                    i17 = ((mm2.n0) eVar.a(mm2.n0.class)).f410806r ? 16 : 2;
                }
            }
            ld2Var2.set(2, java.lang.Integer.valueOf(java.lang.Integer.valueOf(i17).intValue()));
            ld2Var = ld2Var2;
        }
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivesubscribeproductsaleremind", 24942, za2Var, ld2Var, null).l().K(new dk2.vb(this));
    }

    public final boolean b() {
        yg2.b bVar;
        yg2.b bVar2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
        r45.bd5 bd5Var = this.f314730a;
        sb6.append(bd5Var != null ? java.lang.Integer.valueOf(bd5Var.m75939xb282bd08(13)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314736g, sb6.toString());
        boolean z17 = bd5Var != null && bd5Var.m75939xb282bd08(13) == 1;
        gk2.e eVar = this.f314733d;
        if (z17) {
            if (eVar == null || (bVar2 = eVar.f354008i) == null) {
                a();
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(bVar2, null, null, new dk2.wb(this, null), 3, null);
            }
            return true;
        }
        if (!(bd5Var != null && bd5Var.m75939xb282bd08(13) == 2)) {
            return false;
        }
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            c();
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new dk2.xb(this, null), 3, null);
        }
        return true;
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f314732c, 1, true);
        k0Var.t(false);
        k0Var.f293405n = new dk2.yb(this);
        k0Var.f293414s = new dk2.zb(this);
        k0Var.v();
    }

    public /* synthetic */ ac(r45.bd5 bd5Var, long j17, android.content.Context context, gk2.e eVar, r45.ya2 ya2Var, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bd5Var, j17, context, eVar, (i17 & 16) != 0 ? r45.ya2.SUBSCRIBE_SCENE_DEFAULT : ya2Var, aVar);
    }
}
