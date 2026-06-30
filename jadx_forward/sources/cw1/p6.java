package cw1;

/* loaded from: classes12.dex */
public class p6 implements aw1.o {

    /* renamed from: a, reason: collision with root package name */
    public long f304778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.o6 f304779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f304780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b f304781d;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b, cw1.o6 o6Var, long j17) {
        this.f304781d = activityC13122x435a878b;
        this.f304779b = o6Var;
        this.f304780c = j17;
    }

    @Override // aw1.o
    public void a(final int i17, final long j17) {
        if (i17 == 1) {
            this.f304779b.f304739d = true;
            long j18 = this.f304781d.Q.f547577c;
            long j19 = aw1.g1.f96059h;
            if (j19 != 0) {
                long abs = java.lang.Math.abs(j18 - j19) / j19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportStorageDetailedTask", "setWechatSize, lastWeChatSize = " + j19 + ", newSize = " + j18 + ", ratio = " + abs);
                if (abs > 0.1d) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("ReportStorageDetailedTask_Time", 0L);
                }
                aw1.g1.f96059h = j18;
            }
        } else if (i17 == 4) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FIRST_TIME_LOADING_DONE_BOOLEAN, java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "Load stage done [%d]: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        ku5.u0 u0Var = ku5.t0.f394148d;
        final long j27 = this.f304780c;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.p6$$a
            @Override // java.lang.Runnable
            public final void run() {
                cw1.p6 p6Var = cw1.p6.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b = p6Var.f304781d;
                int i18 = i17;
                long j28 = j17;
                switch (i18) {
                    case 1:
                        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.e7(j28);
                        return;
                    case 2:
                        long j29 = p6Var.f304778a;
                        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.Z6(j28, j29);
                        return;
                    case 3:
                        p6Var.f304778a = j28;
                        return;
                    case 4:
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.b7(j28);
                        try {
                            ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).wi("NewClean", j28);
                            return;
                        } catch (java.lang.Exception unused) {
                            return;
                        }
                    case 5:
                        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.d7(j28);
                        return;
                    case 6:
                        java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.a7(j27);
                        return;
                    case 7:
                        java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                        activityC13122x435a878b.c7(j28);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // aw1.o
    public void b(int i17, int i18, int i19) {
        this.f304781d.N.b(2, i18, i19);
    }

    @Override // aw1.o
    /* renamed from: onCancelled */
    public void mo9143x1a926632() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanNewUI", "Load cancelled");
    }
}
