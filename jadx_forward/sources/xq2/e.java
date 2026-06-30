package xq2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final xq2.e f537582a = new xq2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final xq2.b f537583b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f537584c;

    static {
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(xq2.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        f537583b = (xq2.b) a17;
        f537584c = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(vp2.c cardInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardInfo, "cardInfo");
        r45.le1 le1Var = cardInfo.f520443d;
        r45.wz2 wz2Var = le1Var.A;
        boolean z17 = wz2Var != null && wz2Var.f471125d;
        xq2.b bVar = f537583b;
        boolean z18 = bVar.f537573h > 0;
        java.lang.String str = le1Var.f460888o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: themeId=" + str + ", isCardEnablePreload=" + z17 + ", globalEnablePreload=" + z18);
        if (z17 && z18) {
            if (str == null || str.length() == 0) {
                return;
            }
            if (!bVar.P6(str, "")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: do not need auto refresh, expired=" + bVar.O6(str) + ", themeId=" + str);
                return;
            }
            by1.d a17 = by1.c.f117886b.a().a("LiveThemeStream+".concat(str));
            aq2.e eVar = a17 instanceof aq2.e ? (aq2.e) a17 : null;
            if (eVar != null) {
                p3325xe03a0797.p3326xc267989b.f1 f1Var = eVar.f117896d;
                if (f1Var != null && f1Var.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: cache is loading, themeId=".concat(str));
                    return;
                }
            }
            java.util.HashMap hashMap = bVar.f537572g;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
            long longValue = l17 != null ? l17.longValue() : 0L;
            long j17 = bVar.f537573h;
            if (longValue + j17 > java.lang.System.currentTimeMillis()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: request too frequency, themeId=" + str + ", globalPrefetchInterval=" + j17);
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f537584c;
            java.lang.Object obj = concurrentHashMap.get(str);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadUtil", "checkPreloadAggregationCard: is requesting, themeId=".concat(str));
                return;
            }
            concurrentHashMap.put(str, bool);
            hashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new xq2.d(str, cardInfo, null), 3, null);
        }
    }
}
