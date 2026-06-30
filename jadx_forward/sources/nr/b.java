package nr;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final nr.b f420563a = new nr.b();

    /* renamed from: b, reason: collision with root package name */
    public static long f420564b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f420565c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f420566d;

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f420564b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatEmojiBtnClickReport", "recordClose: " + currentTimeMillis + ", " + f420564b + ", " + f420566d);
        if (f420566d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(f420565c ? 2 : 4);
            objArr[1] = java.lang.Long.valueOf(currentTimeMillis);
            g0Var.d(17302, objArr);
        }
        f420566d = false;
    }
}
