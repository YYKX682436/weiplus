package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0 f240470a = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f240471b;

    public final void a(java.lang.String str, java.lang.String resultType, int i17, int i18, int i19, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultType, "resultType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineScanReporter", "OfflineScan report resultType: %s, scene: %d, networkType: %d, actionType: %d, result: %s", resultType, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = resultType;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = java.lang.Integer.valueOf(f240471b ? 1 : 0);
        objArr[6] = java.lang.Long.valueOf(str2 != null ? java.lang.Long.parseLong(str2) : 0L);
        g0Var.d(17386, objArr);
    }
}
