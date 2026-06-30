package ri;

/* renamed from: ri.r$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C30087x345e2f implements m3.a {
    @Override // m3.a
    /* renamed from: accept */
    public final void mo3938xab27b508(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        map.put("stat-bat-temp", java.lang.Integer.valueOf(wh.m.m(context)));
        map.put("stat-dev-thermal", java.lang.Integer.valueOf(wh.m.u(context)));
        map.put("stat-dev-watt", java.lang.Integer.valueOf(wh.m.n(context)));
        map.put("stat-dev-light", java.lang.Integer.valueOf(android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness", Integer.MIN_VALUE)));
        map.put("stat-net-radio", java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40100x9d8d85b4()));
        map.put("stat-net-wifi", java.lang.Long.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40101xf0ac4f74()));
        int i17 = 0;
        for (int i18 : wh.m.p()) {
            if (i18 > i17) {
                i17 = i18;
            }
        }
        map.put("stat-cpu-freq", java.lang.Integer.valueOf(i17));
    }
}
