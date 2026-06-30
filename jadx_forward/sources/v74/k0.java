package v74;

/* loaded from: classes4.dex */
public final class k0 {
    public static final v74.r E = new v74.r(null);
    public final v74.z A;
    public final yz5.a B;
    public final yz5.a C;
    public final yz5.l D;

    /* renamed from: a */
    public final int f515368a;

    /* renamed from: b */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 f515369b;

    /* renamed from: c */
    public android.app.Activity f515370c;

    /* renamed from: d */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f515371d;

    /* renamed from: e */
    public w64.n f515372e;

    /* renamed from: f */
    public v74.u f515373f;

    /* renamed from: g */
    public final v74.v0 f515374g;

    /* renamed from: h */
    public final v74.z0 f515375h;

    /* renamed from: i */
    public boolean f515376i;

    /* renamed from: j */
    public final android.os.Handler f515377j;

    /* renamed from: k */
    public boolean f515378k;

    /* renamed from: l */
    public final boolean f515379l;

    /* renamed from: m */
    public final jz5.g f515380m;

    /* renamed from: n */
    public final jz5.g f515381n;

    /* renamed from: o */
    public v74.s0 f515382o;

    /* renamed from: p */
    public int f515383p;

    /* renamed from: q */
    public int f515384q;

    /* renamed from: r */
    public v74.t f515385r;

    /* renamed from: s */
    public v74.s f515386s;

    /* renamed from: t */
    public v74.h1 f515387t;

    /* renamed from: u */
    public int f515388u;

    /* renamed from: v */
    public final v74.d0 f515389v;

    /* renamed from: w */
    public final android.graphics.Rect f515390w;

    /* renamed from: x */
    public boolean f515391x;

    /* renamed from: y */
    public final v74.b0 f515392y;

    /* renamed from: z */
    public final v74.y f515393z;

    public k0(int i17) {
        this.f515368a = i17;
        v74.v0 v0Var = new v74.v0(i17);
        this.f515374g = v0Var;
        this.f515375h = new v74.z0(v0Var);
        boolean z17 = true;
        this.f515376i = true;
        this.f515377j = new android.os.Handler(android.os.Looper.getMainLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        boolean z18 = false;
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_lookbook_smooth_mode, 1) <= 0) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            z18 = z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "isSmoothMode, exp=" + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        }
        this.f515379l = z18;
        this.f515380m = jz5.h.b(new v74.x(this));
        this.f515381n = jz5.h.b(new v74.w(this));
        this.f515384q = 3;
        this.f515389v = new v74.d0(this);
        this.f515390w = new android.graphics.Rect();
        this.f515392y = new v74.b0(this);
        this.f515393z = new v74.y(this);
        this.A = new v74.z(this);
        this.B = new v74.e0(this);
        this.C = new v74.g0(this);
        this.D = new v74.h0(this);
    }

    public static final /* synthetic */ v74.v0 a(v74.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.v0 v0Var = k0Var.f515374g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return v0Var;
    }

    public static final /* synthetic */ boolean b(v74.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPausedVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        boolean z17 = k0Var.f515376i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPausedVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return z17;
    }

    public static final int c(v74.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        int intValue = ((java.lang.Number) ((jz5.n) k0Var.f515380m).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return intValue;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 d(v74.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = k0Var.f515369b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return c17765x7b4a5f05;
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        v74.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515371d;
        java.lang.String b17 = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (mVar = m70354x74235b3e.f38191xf4087299) == null) ? null : mVar.b();
        boolean z17 = !(b17 == null || b17.length() == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:21:0x00ac, B:23:0x00b0, B:24:0x00b6, B:26:0x00ba, B:29:0x00c1, B:31:0x00c9, B:32:0x00cf, B:35:0x00ea, B:37:0x00ed, B:39:0x00f1, B:40:0x00f7, B:42:0x00fb, B:44:0x0101, B:45:0x0107, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:56:0x0129, B:59:0x0122), top: B:20:0x00ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.f():void");
    }

    public final void g(v74.t lookbookContext, w64.n nVar, v74.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lookbookContext, "lookbookContext");
        if (lookbookContext.b() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        android.app.Activity activity = lookbookContext.f515445a;
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        this.f515385r = lookbookContext;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        this.f515370c = activity;
        this.f515369b = lookbookContext.b();
        this.f515372e = nVar;
        this.f515373f = uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPlayNumConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_lookbook_max_play_video_num, 3);
            this.f515384q = java.lang.Math.max(Ni, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "initPlayNumConfig, cfg=" + Ni + ", maxPlayVideoNum=" + this.f515384q);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPlayNumConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = this.f515369b;
        if (c17765x7b4a5f05 != null) {
            c17765x7b4a5f05.setOverScrollMode(2);
            c17765x7b4a5f05.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f515370c, 0, false));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMItemSpace", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            int intValue = ((java.lang.Number) ((jz5.n) this.f515381n).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMItemSpace", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            c17765x7b4a5f05.N(new v74.a(intValue));
            c17765x7b4a5f05.i(this.f515389v);
            c17765x7b4a5f05.O(this.f515393z);
            c17765x7b4a5f05.m7963x830bc99d(true);
            c17765x7b4a5f05.m69502x63619518(i65.a.b(this.f515370c, 64) * 2);
            c17765x7b4a5f05.m69503xdfd41f2c(this.f515392y);
            if (this.f515379l) {
                c17765x7b4a5f05.m7965x440a0e9(7);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final boolean h(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = this.f515369b;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c17765x7b4a5f05 != null ? c17765x7b4a5f05.mo7946xf939df19() : null;
        v74.g gVar = mo7946xf939df19 instanceof v74.g ? (v74.g) mo7946xf939df19 : null;
        int i18 = i17 == -1 ? 0 : i17;
        v74.q x17 = gVar != null ? gVar.x(i18) : null;
        w64.n nVar = this.f515372e;
        if ((x17 != null ? x17.a() : null) == null || this.f515371d == null || nVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "onItemClick, handleClick, pos=" + i17 + ", realPos=" + i18);
        v74.f0 f0Var = new v74.f0(this, view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        nVar.f524852l = f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i19 = ca4.m0.Y(this.f515371d) ? 1 : 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = x17.a();
        if (a17 != null) {
            if (i17 == -1) {
                a17.f244102a = 27;
            } else {
                a17.f244102a = 19;
            }
        }
        nVar.p(new w64.c(x17.a(), this.f515371d, i18, null, false, i19, false, null, 216, null));
        nVar.k(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r24, v74.s r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.i(com.tencent.mm.plugin.sns.storage.SnsInfo, v74.s, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.j():void");
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "onUIDestroy");
        this.f515378k = true;
        this.f515376i = true;
        this.f515377j.removeCallbacksAndMessages(null);
        this.f515375h.c();
        v74.s0 s0Var = this.f515382o;
        if (s0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "onUIDestroy");
            s0Var.f515436m.removeCallbacksAndMessages(null);
            s0Var.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r8.c() == true) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r11) {
        /*
            r10 = this;
            java.lang.String r0 = "pauseAllPlay"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            android.os.Handler r2 = r10.f515377j
            r3 = 0
            r2.removeCallbacksAndMessages(r3)
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r2 = r10.f515369b
            if (r2 == 0) goto L17
            androidx.recyclerview.widget.f2 r2 = r2.mo7946xf939df19()
            goto L18
        L17:
            r2 = r3
        L18:
            boolean r4 = r2 instanceof v74.g
            if (r4 == 0) goto L1f
            v74.g r2 = (v74.g) r2
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r2 == 0) goto L7a
            int r4 = r2.mo1894x7e414b06()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "pauseAllPlay, count="
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = ", showIcon="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AdLookbookLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            r5 = 0
            r6 = r5
        L44:
            if (r6 >= r4) goto L6f
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r7 = r10.f515369b
            if (r7 == 0) goto L4f
            androidx.recyclerview.widget.k3 r7 = r7.p0(r6)
            goto L50
        L4f:
            r7 = r3
        L50:
            boolean r8 = r7 instanceof v74.b
            if (r8 == 0) goto L57
            v74.b r7 = (v74.b) r7
            goto L58
        L57:
            r7 = r3
        L58:
            v74.q r8 = r2.x(r6)
            if (r8 == 0) goto L66
            boolean r8 = r8.c()
            r9 = 1
            if (r8 != r9) goto L66
            goto L67
        L66:
            r9 = r5
        L67:
            if (r9 == 0) goto L6c
            r10.m(r6, r7, r11)
        L6c:
            int r6 = r6 + 1
            goto L44
        L6f:
            v74.h1 r11 = r10.f515387t
            if (r11 == 0) goto L76
            r11.c()
        L76:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L7a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.l(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r8, v74.b r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "pauseVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 0
            if (r9 == 0) goto L10
            android.widget.FrameLayout r3 = r9.i()
            goto L11
        L10:
            r3 = r2
        L11:
            java.lang.String r4 = "getVideoViewInContainer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            boolean r6 = a84.y0.e(r3)
            if (r6 == 0) goto L31
            if (r3 == 0) goto L26
            r6 = 0
            android.view.View r3 = r3.getChildAt(r6)
            goto L27
        L26:
            r3 = r2
        L27:
            boolean r6 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
            if (r6 == 0) goto L31
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r3
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            goto L35
        L31:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            r3 = r2
        L35:
            if (r3 == 0) goto L3a
            r3.F()
        L3a:
            if (r9 == 0) goto L41
            android.widget.ImageView r9 = r9.j()
            goto L42
        L41:
            r9 = r2
        L42:
            r7.n(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "pauseVideo, pos="
            r9.<init>(r4)
            r9.append(r8)
            java.lang.String r8 = ", isPlaying="
            r9.append(r8)
            if (r3 == 0) goto L5f
            boolean r8 = r3.w()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
        L5f:
            r9.append(r2)
            java.lang.String r8 = ", showPauseIcon="
            r9.append(r8)
            r9.append(r10)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "AdLookbookLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.m(int, v74.b, boolean):void");
    }

    public final void n(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        if (z17) {
            if (view.getVisibility() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view.getVisibility() == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        this.f515376i = false;
        v74.h1 h1Var = this.f515387t;
        if (h1Var != null && h1Var.b()) {
            v74.h1 h1Var2 = this.f515387t;
            if (h1Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                v74.l lVar = h1Var2.f515348o;
                if (lVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = h1Var2.f515347n;
                    if (c17933xe8d1b226 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    } else {
                        android.view.ViewGroup viewGroup = h1Var2.f515338e;
                        if (viewGroup == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "startPlay");
                            l44.c0.b(c17933xe8d1b226, lVar.a());
                            v74.z0 z0Var = h1Var2.f515335b;
                            if (z0Var != null) {
                                z0Var.a(-1, viewGroup, c17933xe8d1b226, lVar.a(), true);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "startVideoUpdateTimer");
                            h1Var2.f515351r.c(200L, 200L);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            android.widget.ImageView imageView = h1Var2.f515340g;
                            if (imageView != null) {
                                imageView.setVisibility(4);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = this.f515369b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c17765x7b4a5f05 != null ? c17765x7b4a5f05.getLayoutManager() : null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                int w17 = c1162x665295de != null ? c1162x665295de.w() : -1;
                int y17 = c1162x665295de != null ? c1162x665295de.y() : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "hideVideoStatusIcon, firstPos=" + w17 + ", lastPos=" + y17);
                if (w17 != -1 && y17 != -1) {
                    int i17 = y17 + 1;
                    while (w17 < i17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f052 = this.f515369b;
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c17765x7b4a5f052 != null ? c17765x7b4a5f052.p0(w17) : null;
                        v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
                        n(bVar != null ? bVar.j() : null, false);
                        w17++;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "hideVideoStatusIcon, exp=" + e17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        } else {
            p();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            this.f515377j.postDelayed(new v74.i0(this), 150L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f053 = this.f515369b;
            if (c17765x7b4a5f053 != null) {
                c17765x7b4a5f053.m69501x37bd608(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final void p() {
        java.util.Set set;
        android.graphics.Rect rect;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        android.app.Activity activity = this.f515370c;
        if (activity != null && activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "play video when activity destroyed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = this.f515369b;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c17765x7b4a5f05 != null ? c17765x7b4a5f05.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int w17 = c1162x665295de != null ? c1162x665295de.w() : -1;
        int y17 = c1162x665295de != null ? c1162x665295de.y() : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "triggerVideoPlay, firstPos=" + w17 + ", lastPos=" + y17);
        if (w17 != -1 && y17 != -1) {
            android.graphics.Rect rect2 = new android.graphics.Rect();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = y17 + 1;
            while (w17 < i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f052 = this.f515369b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c17765x7b4a5f052 != null ? c17765x7b4a5f052.p0(w17) : null;
                v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f053 = this.f515369b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c17765x7b4a5f053 != null ? c17765x7b4a5f053.mo7946xf939df19() : null;
                v74.g gVar = mo7946xf939df19 instanceof v74.g ? (v74.g) mo7946xf939df19 : null;
                v74.q x17 = gVar != null ? gVar.x(w17) : null;
                if (x17 != null) {
                    linkedHashSet.add(java.lang.Integer.valueOf(w17));
                }
                if (x17 != null && x17.c()) {
                    if ((bVar != null ? bVar.i() : null) != null) {
                        bVar.f3639x46306858.getLocalVisibleRect(rect2);
                        float width = (bVar.f3639x46306858.getWidth() <= 0 || (i17 = rect2.left) < 0 || (i18 = rect2.right) < 0) ? 0.0f : (i18 - i17) / bVar.f3639x46306858.getWidth();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "checkPlayVideo, pos=" + w17 + ", isPausedVideoPlay=" + this.f515376i + ", visibleRatio=" + width + ", rect=" + rect2);
                        boolean z17 = this.f515376i;
                        rect = rect2;
                        if (z17 || width < 0.5d) {
                            m(w17, bVar, z17);
                        } else {
                            arrayList.add(new jz5.l(java.lang.Integer.valueOf(w17), java.lang.Float.valueOf(width)));
                        }
                        w17++;
                        rect2 = rect;
                    }
                }
                rect = rect2;
                w17++;
                rect2 = rect;
            }
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new v74.j0());
            }
            java.util.Iterator it = arrayList.iterator();
            int i27 = 0;
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) ((jz5.l) it.next()).f384366d).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f054 = this.f515369b;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = c17765x7b4a5f054 != null ? c17765x7b4a5f054.p0(intValue) : null;
                v74.b bVar2 = p08 instanceof v74.b ? (v74.b) p08 : null;
                if ((bVar2 != null ? bVar2.i() : null) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f055 = this.f515369b;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c17765x7b4a5f055 != null ? c17765x7b4a5f055.mo7946xf939df19() : null;
                    v74.g gVar2 = mo7946xf939df192 instanceof v74.g ? (v74.g) mo7946xf939df192 : null;
                    v74.q x18 = gVar2 != null ? gVar2.x(intValue) : null;
                    if (x18 != null && x18.c()) {
                        if (i27 < this.f515384q) {
                            java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                            if ((x18 != null ? x18.b() : null) != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "playVideo, pos=" + intValue);
                                l44.c0.b(this.f515371d, x18.b());
                                v74.z0 z0Var = this.f515375h;
                                if (z0Var != null) {
                                    z0Var.a(intValue, bVar2.i(), this.f515371d, x18.b(), true);
                                }
                                n(bVar2 != null ? bVar2.j() : null, false);
                                if (this.f515379l) {
                                    E.f(bVar2);
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "playVideo, media==null, pos=" + intValue);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                            i27++;
                            java.lang.System.currentTimeMillis();
                        } else {
                            m(intValue, bVar2, this.f515376i);
                        }
                    }
                }
            }
            v74.v0 v0Var = this.f515374g;
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            java.util.Iterator it6 = linkedHashSet.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                set = v0Var.f515467d;
                if (!hasNext) {
                    break;
                }
                int intValue2 = ((java.lang.Number) it6.next()).intValue();
                if (!set.contains(java.lang.Integer.valueOf(intValue2))) {
                    v0Var.h(intValue2);
                    set.add(java.lang.Integer.valueOf(intValue2));
                }
            }
            set.retainAll(linkedHashSet);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }
}
