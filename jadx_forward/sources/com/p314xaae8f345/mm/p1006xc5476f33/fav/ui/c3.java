package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class c3 implements q40.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f182070d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f182071e;

    /* renamed from: f, reason: collision with root package name */
    public final q40.g f182072f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f182073g;

    /* renamed from: h, reason: collision with root package name */
    public int f182074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f182075i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f182076m;

    public c3(android.widget.FrameLayout container, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f182070d = container;
        this.f182071e = context;
        this.f182074h = -1;
        this.f182075i = -1;
        int intExtra = context.getIntent().getIntExtra("key_enter_fav_search_from", -1);
        this.f182075i = intExtra;
        java.lang.String valueOf = java.lang.String.valueOf(context.getIntent().getStringExtra("key_to_user"));
        this.f182073g = valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[FavFinderFilterUI] from = " + intExtra + ", toUser = " + valueOf);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        this.f182072f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00("Masonry");
        b().f497938f = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y2(this);
    }

    @Override // q40.h
    public boolean M(int i17) {
        c().O6(2, false);
        if (!(this.f182075i == 1) || b().f497936d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[onItemClick] position = " + i17 + ", un filter click");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[onItemClick] position = " + i17 + ", filter click");
        o72.r2 P6 = a().P6(i17);
        if (P6 != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f182071e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class)).V6(P6);
        }
        if (P6 != null) {
            if (this.f182073g.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderManager", "[showTransmitDialog] toUser empty, return");
            } else {
                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(this.f182071e, this.f182073g, P6, com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya, true, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b3(this, P6));
            }
        }
        return true;
    }

    @Override // q40.h
    public void T(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[onItemLongClick] position = " + i17 + ", rawX = 0.0, rawY = 0.0");
        int i18 = (int) 0.0f;
        this.f182074h = i17;
        b().T6(view, this.f182074h, 0L, new int[]{i18, i18});
    }

    public final t82.d a() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f182071e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(t82.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    @Override // q40.h
    public void a3(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[onItemSelectStateChang] position = " + i17 + ", type = " + i18);
        if (!b().f497936d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[onItemSelectStateChang] not in more state, maybe finder fragment bug");
            return;
        }
        if (i18 == 111) {
            a().T6(i17);
        } else {
            a().U6(i17);
        }
        if (((java.util.ArrayList) a().S6()).isEmpty()) {
            b().O6(false);
        } else {
            b().O6(true);
        }
    }

    public final t82.r b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f182071e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(t82.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.r) a17;
    }

    public final t82.s c() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f182071e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(t82.s.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (t82.s) a17;
    }
}
