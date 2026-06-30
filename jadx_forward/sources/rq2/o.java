package rq2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f480381b;

    /* renamed from: c, reason: collision with root package name */
    public static int f480382c;

    /* renamed from: d, reason: collision with root package name */
    public static int f480383d;

    /* renamed from: f, reason: collision with root package name */
    public static int f480385f;

    /* renamed from: g, reason: collision with root package name */
    public static long f480386g;

    /* renamed from: i, reason: collision with root package name */
    public static long f480388i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f480389j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.o f480380a = new rq2.o();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f480384e = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final rq2.e f480387h = new rq2.e();

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f480390k = jz5.h.b(rq2.m.f480376d);

    public final r45.jp1 a(int i17, int i18, int i19, int i27, int i28, int i29, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.kd1 kd1Var) {
        r45.jp1 jp1Var = new r45.jp1();
        jp1Var.set(0, java.lang.Integer.valueOf(i17));
        jp1Var.set(2, java.lang.Integer.valueOf(i18));
        jp1Var.set(1, java.lang.Integer.valueOf(i19));
        jp1Var.set(4, java.lang.Integer.valueOf(i28));
        jp1Var.set(5, java.lang.Integer.valueOf(i27));
        jp1Var.set(6, java.lang.Integer.valueOf(i29));
        jp1Var.set(8, gVar);
        jp1Var.set(9, kd1Var);
        jp1Var.set(7, java.lang.Long.valueOf(f480388i));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareStateReporter", "createEnterStateEvent: scene=" + jp1Var.m75939xb282bd08(0) + ", enterType=" + i18 + ",  enter_reddot_type=" + jp1Var.m75939xb282bd08(4) + ", enter_scene=" + jp1Var.m75939xb282bd08(6) + ", loading_time_ms=" + jp1Var.m75939xb282bd08(1) + ", from_click_loading_time_ms=" + jp1Var.m75939xb282bd08(5) + ", last_buffer=" + jp1Var.m75934xbce7f2f(8) + " event_time=" + jp1Var.m75942xfb822ef2(7));
        return jp1Var;
    }

    public final boolean b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        int i17 = iArr[1];
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        return i17 < i19 && !rect.isEmpty();
    }

    public final void c(rq2.b ilogType, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ilogType, "ilogType");
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) f480390k).mo141623x754a37bb(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rq2.n(ilogType, i17, z17, null), 2, null);
    }

    public final void d(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareStateReporter", "tickLoading loadingType: " + i17 + " loadingShown: " + z17);
        f480384e.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (z17) {
            f480383d = i17;
            f480382c++;
        }
    }

    public final void e(int i17, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareStateReporter", "tickLoadingCostTime loadingType: " + i17 + " costTime: " + j17 + " loadingShown: " + z17);
        f480384e.remove(java.lang.Integer.valueOf(i17));
        if (z17) {
            f480386g = c01.id.c();
            f480385f = (int) j17;
        }
    }
}
