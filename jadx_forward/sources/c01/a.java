package c01;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {
    public a(c01.b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (c01.b.b()) {
                jx3.f.INSTANCE.mo68477x336bdfd8(226L, 1L, 1L, false);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
