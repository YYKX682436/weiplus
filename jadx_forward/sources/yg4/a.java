package yg4;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yg4.a f543861a = new yg4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f543862b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f543863c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final int f543864d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f543865e = 17;

    public final void a(java.lang.String str, long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7028x7dda357 c7028x7dda357 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7028x7dda357();
        c7028x7dda357.f143444d = c7028x7dda357.b("AppId", "wx2f3fb5db9f226462", true);
        c7028x7dda357.f143447g = j18;
        c7028x7dda357.f143448h = c7028x7dda357.b("Scene", str, true);
        c7028x7dda357.f143445e = j17;
        c7028x7dda357.f143446f = j19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "eventType:" + j17 + " report appId:" + c7028x7dda357.f143444d + " sessionId:" + c7028x7dda357.f143447g + " scene:" + c7028x7dda357.f143448h + " eventTimestamp:" + c7028x7dda357.f143446f);
        c7028x7dda357.k();
    }

    public final void b(java.lang.String frameSetName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "markStartTimeForScene frameSetName:".concat(frameSetName));
        java.util.HashMap hashMap = f543862b;
        if (hashMap.containsKey(frameSetName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicLiveCardReporter", "markStartTimeForScene sessionIdMap already has frameSetName:".concat(frameSetName));
        } else {
            hashMap.put(frameSetName, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
