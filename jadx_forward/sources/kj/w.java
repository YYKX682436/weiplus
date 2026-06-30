package kj;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f389807d;

    public w(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f389807d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134552v = java.lang.System.currentTimeMillis();
        oj.j.c("SignalAnrTracer", "onANRDumped", new java.lang.Object[0]);
        java.lang.String a17 = lj.f.a();
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134549s = a17;
        oj.j.c("SignalAnrTracer", "onANRDumped, stackTrace = %s, duration = %d", a17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134552v));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/cgroup")));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb6.append(readLine);
                    sb6.append("\n");
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134548r = sb6.toString();
        oj.j.c("SignalAnrTracer", "onANRDumped, read cgroup duration = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134552v));
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134539f = lj.a.h();
        oj.j.c("SignalAnrTracer", "onANRDumped, isInterestingToUser duration = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134552v));
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.i(true);
        this.f389807d.countDown();
    }
}
