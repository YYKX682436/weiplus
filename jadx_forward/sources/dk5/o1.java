package dk5;

/* loaded from: classes9.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316304d;

    public o1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8) {
        this.f316304d = activityC22567x42e895b8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        ?? r66;
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreateOriginCompressVideo, msgType = ");
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316304d;
        sb6.append(activityC22567x42e895b8.f292485e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", sb6.toString());
        int i18 = activityC22567x42e895b8.f292485e;
        int i19 = 0;
        java.lang.String str2 = "";
        if (i18 == 1) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str3 = activityC22567x42e895b8.f292487g;
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str3);
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo TYPE_VIDEO info == null, fileName = " + activityC22567x42e895b8.f292487g);
            } else if (h17.S != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104103r, activityC22567x42e895b8.f292487g, false);
                java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, activityC22567x42e895b8.f292487g, false);
                java.lang.String str4 = h17.S;
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h18 = t21.d3.h(str4);
                if (com.p314xaae8f345.mm.vfs.w6.k(rj7) == 0 && com.p314xaae8f345.mm.vfs.w6.k(rj6) > 0 && h18 != null && h18.i()) {
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.d(21019, 0, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(rj6)), 66666, "single", "" + activityC22567x42e895b8.f292485e);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    activityC22567x42e895b8.i7(rj6, rj7);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    fVar.d(21019, 1, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(rj6)), 66667, "single", "" + activityC22567x42e895b8.f292485e, java.lang.Long.valueOf(currentTimeMillis2));
                    i19 = 1;
                }
            }
        } else {
            boolean z17 = 21019;
            if (i18 == 12 || i18 == 13) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui();
                java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287734a;
                if (list != null) {
                    int i27 = 0;
                    for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
                        if (f9Var.m78014x7b98c171()) {
                            wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z07 = f9Var.z0();
                            ((vf0.y1) x1Var2).getClass();
                            t21.v2 h19 = t21.d3.h(z07);
                            if (h19 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo TYPE_MULTI info == null, fileName = " + f9Var.z0());
                            } else if (h19.S == null) {
                                continue;
                            } else {
                                if (activityC22567x42e895b8.isDestroyed()) {
                                    break;
                                }
                                wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
                                java.lang.String str5 = h19.S;
                                ((vf0.y1) x1Var3).getClass();
                                t21.v2 h27 = t21.d3.h(str5);
                                java.lang.String rj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104103r, h19.d(), false);
                                java.lang.String rj9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, h19.d(), false);
                                if (com.p314xaae8f345.mm.vfs.w6.k(rj9) != 0 || com.p314xaae8f345.mm.vfs.w6.k(rj8) <= 0 || h27 == null || !h27.i()) {
                                    str = str2;
                                    r66 = 21019;
                                } else {
                                    jx3.f fVar2 = jx3.f.INSTANCE;
                                    fVar2.d(21019, 0, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(rj8)), 66666, "multi", str2 + activityC22567x42e895b8.f292485e);
                                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                                    activityC22567x42e895b8.i7(rj8, rj9);
                                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                                    str = str2;
                                    java.lang.Object[] objArr = {1, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(rj8)), 66667, "multi", str2 + activityC22567x42e895b8.f292485e, java.lang.Long.valueOf(currentTimeMillis4)};
                                    r66 = 21019;
                                    fVar2.d(21019, objArr);
                                    i27++;
                                }
                            }
                        } else {
                            str = str2;
                            r66 = z17;
                        }
                        z17 = r66;
                        str2 = str;
                    }
                    i19 = i27;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo done, count = " + i19);
        activityC22567x42e895b8.f292505x0.countDown();
    }
}
