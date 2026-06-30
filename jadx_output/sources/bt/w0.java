package bt;

@j95.b
/* loaded from: classes11.dex */
public class w0 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((wv.a) ((xv.g0) i95.n0.c(xv.g0.class))).getClass();
        java.io.File file = b83.t.f18339a;
        if (!((km0.c) gm0.j1.p().a()).a()) {
            throw new java.lang.IllegalStateException("Only main process can call this method.");
        }
        try {
            if (!b83.t.f18340b) {
                try {
                    b83.t.a();
                    b83.t.f18340b = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th6, "[-] Fail to initialize.", new java.lang.Object[0]);
                    b83.t.f18340b = false;
                }
            }
            int intValue = java.lang.Integer.decode(lp0.a.f320249c).intValue();
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            int i18 = b83.t.f18341c;
            if (intValue != i18) {
                com.tencent.mm.app.p5.e("MicroMsg.TinkerRollbackStatistic", "[+] Basepack was reinstalled, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue));
                b83.t.b(intValue, i17);
            } else if (i17 != intValue) {
                com.tencent.mm.app.p5.e("MicroMsg.TinkerRollbackStatistic", "[+] Patch was loaded, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
                b83.t.b(intValue, i17);
            } else {
                int i19 = b83.t.f18342d;
                if (i17 != i19) {
                    com.tencent.mm.app.p5.f("MicroMsg.TinkerRollbackStatistic", "[+] Patch was rollbacked, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                    com.tencent.mm.app.p5.a(cg1.b.CTRL_INDEX, 0, 1);
                    b83.t.b(intValue, i17);
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th7, "[-] Error happened.", new java.lang.Object[0]);
        }
        new com.tencent.mm.autogen.events.DismissAllSendFailNotificationEvent().e();
        new com.tencent.mm.app.a7().c();
        if (!fp.i.b()) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(340L, fp.h.c(19) ? 5L : 6L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(fp.h.c(19) ? com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT : 5002);
            objArr[1] = java.lang.String.format("%s;%s;%s", lp0.b.e0(), android.os.Environment.getExternalStorageDirectory().getAbsolutePath(), fp.m.b().getAbsolutePath());
            g0Var.d(11098, objArr);
        }
        com.tencent.mars.xlog.Log.i("LegacyWorkProfileAsyncService", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b channel:%d cv:%d. topActivityName:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(com.tencent.mm.app.w7.f53897g), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), java.lang.Integer.valueOf(o45.wf.f343029g), com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a));
    }
}
