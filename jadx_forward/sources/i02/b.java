package i02;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f368036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i02.h f368037e;

    public b(i02.h hVar, long j17) {
        this.f368037e = hVar;
        this.f368036d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i02.h hVar = this.f368037e;
        long j17 = this.f368036d;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        try {
            hVar.j().m104829x48fc89c7(c17.f68411x238eb002);
            com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask, delete file, path: %s", c17.f68419xf1e9b966);
            hVar.f368054h.remove(java.lang.Long.valueOf(c17.f68408x32b20428));
            hVar.h(c17.f68411x238eb002);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: status = " + c17.f68441x10a0fed7);
            if (c17.f68441x10a0fed7 == 5) {
                return;
            }
            c17.f68441x10a0fed7 = 5;
            c17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hVar.f368057k.get(c17.f68411x238eb002), c17.f68440x1bb3b54a);
            long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) hVar.f368056j.get(c17.f68411x238eb002), c17.f68438x1bb3427e);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            long j18 = c17.f68413xf432b5ad;
            k02.m.a(c17.f68408x32b20428, ((((float) (j18 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j18) / ((float) c17.f68443x78351860)) * 100.0f));
            hVar.f178745a.g(c17.f68408x32b20428);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: id: %d, path: %s", java.lang.Long.valueOf(j17), c17.f68419xf1e9b966);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant remove task failed: " + e17.toString());
        }
    }
}
