package c01;

/* loaded from: classes11.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f37090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.da f37091e;

    public ca(long j17, c01.da daVar) {
        this.f37090d = j17;
        this.f37091e = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(1333L, 0L, 1L, true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.plugin.fts.logic.r3) ((c01.j8) i95.n0.c(c01.j8.class))).wi();
        com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        long j17 = this.f37090d;
        x4Var.u0("", j17);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().l();
        new com.tencent.mm.autogen.events.DeleteMsgEvent().e();
        c01.da daVar = this.f37091e;
        if (daVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new c01.ba(this));
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "Delete all messages, synchronized part, time: %d ms", java.lang.Long.valueOf(currentTimeMillis2));
        fVar.idkeyStat(1333L, 6L, currentTimeMillis2 / 1000, true);
        if (daVar == null || !daVar.a()) {
            c01.w9.c();
            if (daVar == null || !daVar.a()) {
                c01.w9.d();
                if (daVar == null || !daVar.a()) {
                    java.util.List u17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().u1("bottlemessage");
                    if (u17 != null) {
                        for (int i17 = 0; i17 < u17.size(); i17++) {
                            c01.w9.e((com.tencent.mm.storage.f9) u17.get(i17), true);
                        }
                    }
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z0("bottlemessage");
                    if (daVar == null || !daVar.a()) {
                        c01.w9.b(j17, 1);
                        ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0("", 0L);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "Delete all messages, asynchronous part, time: %d ms", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) - currentTimeMillis2));
                    }
                }
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|deleteAllMsg";
    }
}
