package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class c3 implements q40.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f100537d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f100538e;

    /* renamed from: f, reason: collision with root package name */
    public final q40.g f100539f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f100540g;

    /* renamed from: h, reason: collision with root package name */
    public int f100541h;

    /* renamed from: i, reason: collision with root package name */
    public final int f100542i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100543m;

    public c3(android.widget.FrameLayout container, com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(context, "context");
        this.f100537d = container;
        this.f100538e = context;
        this.f100541h = -1;
        this.f100542i = -1;
        int intExtra = context.getIntent().getIntExtra("key_enter_fav_search_from", -1);
        this.f100542i = intExtra;
        java.lang.String valueOf = java.lang.String.valueOf(context.getIntent().getStringExtra("key_to_user"));
        this.f100540g = valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[FavFinderFilterUI] from = " + intExtra + ", toUser = " + valueOf);
        ((com.tencent.mm.plugin.finder.service.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        this.f100539f = new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment("Masonry");
        b().f416405f = new com.tencent.mm.plugin.fav.ui.y2(this);
    }

    @Override // q40.h
    public boolean M(int i17) {
        c().O6(2, false);
        if (!(this.f100542i == 1) || b().f416403d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[onItemClick] position = " + i17 + ", un filter click");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[onItemClick] position = " + i17 + ", filter click");
        o72.r2 P6 = a().P6(i17);
        if (P6 != null) {
            com.tencent.mm.ui.MMActivity activity = this.f100538e;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.fav.ui.da.class)).V6(P6);
        }
        if (P6 != null) {
            if (this.f100540g.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderManager", "[showTransmitDialog] toUser empty, return");
            } else {
                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(this.f100538e, this.f100540g, P6, com.tencent.mm.R.string.f490551ya, true, new com.tencent.mm.plugin.fav.ui.b3(this, P6));
            }
        }
        return true;
    }

    @Override // q40.h
    public void T(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[onItemLongClick] position = " + i17 + ", rawX = 0.0, rawY = 0.0");
        int i18 = (int) 0.0f;
        this.f100541h = i17;
        b().T6(view, this.f100541h, 0L, new int[]{i18, i18});
    }

    public final t82.d a() {
        com.tencent.mm.ui.MMActivity activity = this.f100538e;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(t82.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.d) a17;
    }

    @Override // q40.h
    public void a3(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[onItemSelectStateChang] position = " + i17 + ", type = " + i18);
        if (!b().f416403d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[onItemSelectStateChang] not in more state, maybe finder fragment bug");
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
        com.tencent.mm.ui.MMActivity activity = this.f100538e;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(t82.r.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.r) a17;
    }

    public final t82.s c() {
        com.tencent.mm.ui.MMActivity activity = this.f100538e;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(t82.s.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (t82.s) a17;
    }
}
