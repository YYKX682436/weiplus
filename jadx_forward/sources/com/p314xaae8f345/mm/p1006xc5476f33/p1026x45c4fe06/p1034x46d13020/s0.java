package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f158087a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f158088b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f158089c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f158090d = "";

    /* renamed from: e, reason: collision with root package name */
    public static long f158091e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f158092f = true;

    public static void a(int i17, int i18, boolean z17) {
        int i19;
        java.lang.String str;
        java.lang.String str2;
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            b(i17, 0, "", "", i18, 0);
            return;
        }
        if (z17) {
            b(i17, f158087a, f158088b, f158090d, i18, f158089c);
            return;
        }
        boolean z18 = false;
        f158087a = 0;
        f158088b = "";
        f158090d = "";
        f158089c = 0;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(43));
        java.lang.Object obj = c17.second;
        if (obj != null) {
            java.lang.String str3 = ((r45.pm6) obj).f464734v == null ? "" : ((r45.pm6) obj).f464734v;
            int i27 = ((r45.pm6) obj).f464733u;
            str2 = ((r45.pm6) obj).f464720e != null ? ((r45.pm6) obj).f464720e : "";
            str = str3;
            i19 = i27;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandEntranceReportLogic", "newTipsInfo.second is null");
            i19 = 0;
            str = "";
            str2 = str;
        }
        java.lang.Object obj2 = c17.first;
        if (obj2 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) obj2).f233930f != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) obj2).f233930f.size() > 0) {
            java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) c17.first).f233930f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it.next();
                if (kVar.f67148x29dcef91 == i19 && i19 != 0) {
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().getClass();
                    z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.e.c(kVar);
                    break;
                }
            }
        }
        if (!z18) {
            b(i17, 0, "", "", i18, 0);
            return;
        }
        f158087a = 1;
        f158088b = str;
        f158090d = str2;
        f158089c = i19;
        b(i17, 1, str, str2, i18, i19);
    }

    public static void b(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "log 28783: actionType:%d, hasRedDot:%d, redDotId:%s, redDotTitle:%s, appType:%d, tipsId:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28783, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
