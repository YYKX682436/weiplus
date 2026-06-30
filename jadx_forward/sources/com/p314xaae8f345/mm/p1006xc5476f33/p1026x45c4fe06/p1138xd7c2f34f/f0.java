package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f166136d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f166136d = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f166136d;
        if (c11809xbc286be4.k()) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428841e);
            java.lang.String j17 = gm0.j1.b().j();
            if (!android.text.TextUtils.isEmpty(j17)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("heavy_user_game_" + j17, "");
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
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                L.getClass();
                L.putString("heavy_user_game_" + j17, str);
            }
        }
        if (!c11809xbc286be4.f158825e2) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428842f);
            if (!c11809xbc286be4.k()) {
                ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428843g);
            }
        }
        oe1.b2.a(c11809xbc286be4.f158811d);
        if (c11809xbc286be4.d()) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428844h);
        }
    }
}
