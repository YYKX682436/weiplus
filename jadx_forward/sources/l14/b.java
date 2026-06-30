package l14;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f396528b = "";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f396529c = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f396530d = "";

    /* renamed from: a, reason: collision with root package name */
    public static final l14.b f396527a = new l14.b();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f396531e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f396532f = new java.util.LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f396533g = kz5.c1.k(new jz5.l("settings_sns_switch", 0L), new jz5.l("settings_scan_switch", 1L), new jz5.l("settings_shake_switch", 2L), new jz5.l("settings_search_switch", 3L), new jz5.l("settings_nearby_switch", 4L), new jz5.l("settings_shopping_switch", 6L), new jz5.l("settings_game_switch", 7L), new jz5.l("settings_miniprogram_switch", 8L), new jz5.l("settings_wechatout_switch", 9L), new jz5.l("settings_look_switch", 10L), new jz5.l("settings_finder_switch", 11L), new jz5.l("settings_nearby_live_friend_switch", 12L), new jz5.l("settings_ting_switch", 14L), new jz5.l("settings_ignore", 0L));

    public final long a(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
            return 13L;
        }
        java.lang.Long l17 = (java.lang.Long) f396533g.get(str);
        if (l17 != null) {
            return l17.longValue();
        }
        return 9999L;
    }

    public final void b(long j17, long j18, long j19, long j27) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6455x4dc019c c6455x4dc019c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6455x4dc019c();
        c6455x4dc019c.f137971d = c6455x4dc019c.b("sessionid", f396528b, true);
        c6455x4dc019c.f137972e = j17;
        c6455x4dc019c.f137973f = j18;
        c6455x4dc019c.f137974g = j19;
        if (f396529c) {
            f396530d = kz5.n0.g0(f396531e, "#", null, null, 0, null, null, 62, null);
            f396529c = false;
        }
        c6455x4dc019c.f137975h = c6455x4dc019c.b("expose_items", f396530d, true);
        c6455x4dc019c.f137976i = j27;
        c6455x4dc019c.k();
    }

    public final void c(boolean z17, java.lang.String item, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        b(z17 ? 3L : 4L, a(item), j17, j18);
    }

    public final void d(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        long a17 = a(key);
        f396532f.add(java.lang.Long.valueOf(a(key)));
        f396531e.remove(java.lang.Long.valueOf(a17));
        f396529c = true;
    }
}
