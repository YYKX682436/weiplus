package bt;

@j95.b
/* loaded from: classes11.dex */
public class w0 extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((wv.a) ((xv.g0) i95.n0.c(xv.g0.class))).getClass();
        java.io.File file = b83.t.f99872a;
        if (!((km0.c) gm0.j1.p().a()).a()) {
            throw new java.lang.IllegalStateException("Only main process can call this method.");
        }
        try {
            if (!b83.t.f99873b) {
                try {
                    b83.t.a();
                    b83.t.f99873b = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th6, "[-] Fail to initialize.", new java.lang.Object[0]);
                    b83.t.f99873b = false;
                }
            }
            int intValue = java.lang.Integer.decode(lp0.a.f401782c).intValue();
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            int i18 = b83.t.f99874c;
            if (intValue != i18) {
                com.p314xaae8f345.mm.app.p5.e("MicroMsg.TinkerRollbackStatistic", "[+] Basepack was reinstalled, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue));
                b83.t.b(intValue, i17);
            } else if (i17 != intValue) {
                com.p314xaae8f345.mm.app.p5.e("MicroMsg.TinkerRollbackStatistic", "[+] Patch was loaded, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
                b83.t.b(intValue, i17);
            } else {
                int i19 = b83.t.f99875d;
                if (i17 != i19) {
                    com.p314xaae8f345.mm.app.p5.f("MicroMsg.TinkerRollbackStatistic", "[+] Patch was rollbacked, clientversion: [0x%x]=>[0x%x]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.app.p5.a(cg1.b.f4374x366c91de, 0, 1);
                    b83.t.b(intValue, i17);
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.TinkerRollbackStatistic", th7, "[-] Error happened.", new java.lang.Object[0]);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5302x32fdeb32().e();
        new com.p314xaae8f345.mm.app.a7().c();
        if (!fp.i.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(340L, fp.h.c(19) ? 5L : 6L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(fp.h.c(19) ? com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28 : 5002);
            objArr[1] = java.lang.String.format("%s;%s;%s", lp0.b.e0(), android.os.Environment.getExternalStorageDirectory().getAbsolutePath(), fp.m.b().getAbsolutePath());
            g0Var.d(11098, objArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LegacyWorkProfileAsyncService", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b channel:%d cv:%d. topActivityName:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.app.w7.f135430g), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), java.lang.Integer.valueOf(o45.wf.f424562g), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
    }
}
