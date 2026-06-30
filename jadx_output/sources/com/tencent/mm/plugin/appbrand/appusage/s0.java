package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f76554a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f76555b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f76556c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f76557d = "";

    /* renamed from: e, reason: collision with root package name */
    public static long f76558e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f76559f = true;

    public static void a(int i17, int i18, boolean z17) {
        int i19;
        java.lang.String str;
        java.lang.String str2;
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            b(i17, 0, "", "", i18, 0);
            return;
        }
        if (z17) {
            b(i17, f76554a, f76555b, f76557d, i18, f76556c);
            return;
        }
        boolean z18 = false;
        f76554a = 0;
        f76555b = "";
        f76557d = "";
        f76556c = 0;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(43));
        java.lang.Object obj = c17.second;
        if (obj != null) {
            java.lang.String str3 = ((r45.pm6) obj).f383201v == null ? "" : ((r45.pm6) obj).f383201v;
            int i27 = ((r45.pm6) obj).f383200u;
            str2 = ((r45.pm6) obj).f383187e != null ? ((r45.pm6) obj).f383187e : "";
            str = str3;
            i19 = i27;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandEntranceReportLogic", "newTipsInfo.second is null");
            i19 = 0;
            str = "";
            str2 = str;
        }
        java.lang.Object obj2 = c17.first;
        if (obj2 != null && ((com.tencent.mm.plugin.newtips.model.r) obj2).f152397f != null && ((com.tencent.mm.plugin.newtips.model.r) obj2).f152397f.size() > 0) {
            java.util.Iterator it = ((com.tencent.mm.plugin.newtips.model.r) c17.first).f152397f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it.next();
                if (kVar.field_tipId == i19 && i19 != 0) {
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().getClass();
                    z18 = com.tencent.mm.plugin.newtips.model.e.c(kVar);
                    break;
                }
            }
        }
        if (!z18) {
            b(i17, 0, "", "", i18, 0);
            return;
        }
        f76554a = 1;
        f76555b = str;
        f76557d = str2;
        f76556c = i19;
        b(i17, 1, str, str2, i18, i19);
    }

    public static void b(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "log 28783: actionType:%d, hasRedDot:%d, redDotId:%s, redDotTitle:%s, appType:%d, tipsId:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28783, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
