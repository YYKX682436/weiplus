package c01;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af f118598a;

    /* renamed from: b, reason: collision with root package name */
    public long f118599b = -1;

    public b() {
        if (b()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new c01.a(this), 5000L);
        }
    }

    public static boolean b() {
        return !gm0.m.r() && gm0.j1.a();
    }

    public final void a(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (binderC11173x1cfac0af == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
            jx3.f.INSTANCE.mo68477x336bdfd8(226L, 2L, 1L, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b CgiKeyLength:[%d,%d]", java.lang.Boolean.valueOf(binderC11173x1cfac0af.mo9865x7b0e9c5f()), java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[0].length()), java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[1].length()));
        if (!binderC11173x1cfac0af.mo9865x7b0e9c5f()) {
            jx3.f.INSTANCE.mo68477x336bdfd8(226L, 3L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
        } else {
            this.f118598a = binderC11173x1cfac0af;
            jx3.f.INSTANCE.mo68477x336bdfd8(226L, 4L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s useCacheCount:%s ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(this.f118599b));
            this.f118599b = -1L;
        }
    }

    public final void c(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        gm0.j1.i();
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
        com.p314xaae8f345.mm.p971x6de15a2e.o G = sVar.G();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfoCacheInWorker", "reuseToPush islogin:%b hash:%s CgiKeyLength:[%d,%d]", java.lang.Boolean.valueOf(G.mo9865x7b0e9c5f()), binderC11173x1cfac0af.E, java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[0].length()), java.lang.Integer.valueOf(binderC11173x1cfac0af.K()[1].length()));
        if (G.mo9865x7b0e9c5f()) {
            jx3.f.INSTANCE.mo68477x336bdfd8(226L, 9L, 1L, false);
            return;
        }
        G.v0(binderC11173x1cfac0af);
        sVar.u0();
        this.f118599b = 0L;
        jx3.f.INSTANCE.mo68477x336bdfd8(226L, 20L, 1L, false);
    }
}
