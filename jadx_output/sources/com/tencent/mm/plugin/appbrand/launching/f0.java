package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84603d;

    public f0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f84603d = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f84603d;
        if (appBrandInitConfigWC.k()) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347308e);
            java.lang.String j17 = gm0.j1.b().j();
            if (!android.text.TextUtils.isEmpty(j17)) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("heavy_user_game_" + j17, "");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (android.text.TextUtils.isEmpty(string)) {
                    str = "0:" + currentTimeMillis;
                } else {
                    java.lang.String[] split = string.split(":");
                    int intValue = java.lang.Integer.valueOf(split[0]).intValue();
                    long longValue = java.lang.Long.valueOf(split[1]).longValue();
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                    calendar.setTimeInMillis(longValue);
                    calendar2.setTimeInMillis(currentTimeMillis);
                    int i17 = calendar2.get(6) - calendar.get(6);
                    if (i17 < 0) {
                        i17 += calendar.getActualMaximum(6);
                    }
                    str = (i17 == 1 ? intValue + 1 : 0) + ":" + currentTimeMillis;
                }
                com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
                L.getClass();
                L.putString("heavy_user_game_" + j17, str);
            }
        }
        if (!appBrandInitConfigWC.f77292e2) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347309f);
            if (!appBrandInitConfigWC.k()) {
                ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347310g);
            }
        }
        oe1.b2.a(appBrandInitConfigWC.f77278d);
        if (appBrandInitConfigWC.d()) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347311h);
        }
    }
}
