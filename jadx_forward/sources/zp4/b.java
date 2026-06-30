package zp4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556485e;

    public b(long j17, java.lang.String str) {
        this.f556484d = j17;
        this.f556485e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startClearRemainFile >> ");
        long j17 = this.f556484d;
        sb6.append(j17);
        sb6.append(' ');
        java.lang.String str = this.f556485e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundStorageClearManager", sb6.toString());
        if (com.p314xaae8f345.mm.vfs.w6.j(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/")) {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(gm0.j1.u().h() + "mediaOpt/remux/tempVideo/", false);
            if (s17 != null) {
                for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                    com.p314xaae8f345.mm.vfs.q2 q2Var = x1Var.f294770g;
                    java.lang.String str2 = x1Var.f294764a;
                    java.lang.String D = q2Var.D(str2, true);
                    if (D != null) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startClearRemainFile >> path: ");
                        sb7.append(D);
                        sb7.append(" modifiedTime: ");
                        long j18 = x1Var.f294768e;
                        sb7.append(j18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundStorageClearManager", sb7.toString());
                        if (java.lang.System.currentTimeMillis() - j18 > j17) {
                            dw3.k kVar = dw3.k.f325752a;
                            kVar.c(D, str);
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            boolean b17 = x1Var.b(true);
                            kVar.e(D, java.lang.System.currentTimeMillis() - currentTimeMillis);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundStorageClearManager", "startClearRemainFile >> path: " + str2 + " ret: " + b17);
                        }
                    }
                }
            }
        }
    }
}
