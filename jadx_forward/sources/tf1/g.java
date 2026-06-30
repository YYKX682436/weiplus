package tf1;

/* loaded from: classes7.dex */
public enum g {
    /* JADX INFO: Fake field, exist only in values array */
    HIDE(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE, 1),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH_NATIVE_PAGE(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_NATIVE_PAGE, 2),
    /* JADX INFO: Fake field, exist only in values array */
    BACK(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.BACK, 3),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH_MINI_PROGRAM(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM, 5),
    /* JADX INFO: Fake field, exist only in values array */
    HOME_PRESSED(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HOME_PRESSED, 6),
    /* JADX INFO: Fake field, exist only in values array */
    RECENT_APPS_PRESSED(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.RECENT_APPS_PRESSED, 7),
    /* JADX INFO: Fake field, exist only in values array */
    HANG(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HANG, 8);


    /* renamed from: f, reason: collision with root package name */
    public static java.util.Map f500410f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.Map f500411g = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 f500413d;

    /* renamed from: e, reason: collision with root package name */
    public final int f500414e;

    g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var, int i17) {
        this.f500413d = w0Var;
        this.f500414e = i17;
    }

    public static void h() {
        tf1.g[] m166417xcee59d22 = m166417xcee59d22();
        f500410f = new java.util.HashMap(m166417xcee59d22.length * 2);
        f500411g = new java.util.HashMap(m166417xcee59d22.length * 2);
        for (tf1.g gVar : m166417xcee59d22) {
            java.util.Map map = f500410f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var = gVar.f500413d;
            int i17 = gVar.f500414e;
            map.put(w0Var, java.lang.Integer.valueOf(i17));
            f500411g.put(java.lang.Integer.valueOf(i17), gVar.f500413d);
        }
    }
}
