package c01;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {
    public a(c01.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (c01.b.b()) {
                jx3.f.INSTANCE.idkeyStat(226L, 1L, 1L, false);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
