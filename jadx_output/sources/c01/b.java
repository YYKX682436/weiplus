package c01;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.network.AccInfo f37065a;

    /* renamed from: b, reason: collision with root package name */
    public long f37066b = -1;

    public b() {
        if (b()) {
            com.tencent.mm.sdk.platformtools.u3.i(new c01.a(this), 5000L);
        }
    }

    public static boolean b() {
        return !gm0.m.r() && gm0.j1.a();
    }

    public final void a(com.tencent.mm.network.AccInfo accInfo) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (accInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
            jx3.f.INSTANCE.idkeyStat(226L, 2L, 1L, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b CgiKeyLength:[%d,%d]", java.lang.Boolean.valueOf(accInfo.isLogin()), java.lang.Integer.valueOf(accInfo.K()[0].length()), java.lang.Integer.valueOf(accInfo.K()[1].length()));
        if (!accInfo.isLogin()) {
            jx3.f.INSTANCE.idkeyStat(226L, 3L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
        } else {
            this.f37065a = accInfo;
            jx3.f.INSTANCE.idkeyStat(226L, 4L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s useCacheCount:%s ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(this.f37066b));
            this.f37066b = -1L;
        }
    }

    public final void c(com.tencent.mm.network.AccInfo accInfo) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        gm0.j1.i();
        com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
        com.tencent.mm.network.o G = sVar.G();
        com.tencent.mars.xlog.Log.i("MicroMsg.AccInfoCacheInWorker", "reuseToPush islogin:%b hash:%s CgiKeyLength:[%d,%d]", java.lang.Boolean.valueOf(G.isLogin()), accInfo.E, java.lang.Integer.valueOf(accInfo.K()[0].length()), java.lang.Integer.valueOf(accInfo.K()[1].length()));
        if (G.isLogin()) {
            jx3.f.INSTANCE.idkeyStat(226L, 9L, 1L, false);
            return;
        }
        G.v0(accInfo);
        sVar.u0();
        this.f37066b = 0L;
        jx3.f.INSTANCE.idkeyStat(226L, 20L, 1L, false);
    }
}
