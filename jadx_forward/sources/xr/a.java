package xr;

/* loaded from: classes8.dex */
public final class a implements qk.o7, xr.g {

    /* renamed from: a, reason: collision with root package name */
    public static final xr.a f537660a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f537661b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f537662c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f537663d;

    /* renamed from: e, reason: collision with root package name */
    public static final xr.f f537664e;

    /* renamed from: f, reason: collision with root package name */
    public static long f537665f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f537666g;

    /* renamed from: h, reason: collision with root package name */
    public static final qk.n7 f537667h;

    static {
        xr.a aVar = new xr.a();
        f537660a = aVar;
        f537664e = new xr.f(aVar);
        f537667h = new jq.e();
    }

    public final boolean a() {
        if (!f537661b) {
            long s17 = gm0.j1.u().c().s(8196, 0L);
            boolean z17 = (7 & s17) != 0;
            boolean z18 = f537666g || java.lang.System.currentTimeMillis() - f537665f >= 15000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[isNeedCheckTimer] continueFlag:" + s17 + ", isContinueSync:" + z17 + ", isNeedCheck:" + z18 + ", isNeedCheckSoon:" + f537666g);
            long uptimeMillis = z17 ? android.os.SystemClock.uptimeMillis() : 0L;
            f537663d = uptimeMillis;
            if (0 != uptimeMillis) {
                long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - f537663d;
                if (uptimeMillis2 >= 1800000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1021L, 0L, 1L, true);
                } else if (uptimeMillis2 >= 1200000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1021L, 1L, 1L, true);
                } else if (uptimeMillis2 >= 600000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1021L, 2L, 1L, true);
                }
            }
            if (!z17 && z18) {
                f537664e.b();
                f537665f = java.lang.System.currentTimeMillis();
                f537666g = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[checkLoop] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(r45.j4 r45, java.util.Map r46, java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.a.b(r45.j4, java.util.Map, java.lang.String):void");
    }
}
