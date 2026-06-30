package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class q implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f274470d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f274471e = 0;

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.io.PrintWriter printWriter;
        java.lang.Exception e17;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long j17 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long j18 = j17 - freeMemory;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BitmapTracer", "Memory level: %s (+%s) / %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t.a(j18), com.p314xaae8f345.mm.sdk.p2603x2137b148.t.a(freeMemory), com.p314xaae8f345.mm.sdk.p2603x2137b148.t.a(runtime.maxMemory()));
        if (!this.f274470d && j18 > 209715200) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f274471e > 180000) {
                java.lang.System.gc();
                this.f274471e = currentTimeMillis;
                return true;
            }
            java.io.PrintWriter printWriter2 = null;
            try {
                printWriter = new java.io.PrintWriter(new java.util.zip.GZIPOutputStream(com.p314xaae8f345.mm.vfs.w6.K(lp0.b.D() + "BitmapTraces.txt.gz", false)));
                try {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t.b(printWriter, 0L, -1);
                    } catch (java.lang.Exception e18) {
                        e17 = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BitmapTracer", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
                        android.os.Debug.dumpHprofData(lp0.b.D() + "Memory.hprof");
                        this.f274470d = true;
                        return true;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    printWriter2 = printWriter;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter2);
                    throw th;
                }
            } catch (java.lang.Exception e19) {
                printWriter = null;
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter2);
                throw th;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(printWriter);
            try {
                android.os.Debug.dumpHprofData(lp0.b.D() + "Memory.hprof");
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BitmapTracer", e27, "", new java.lang.Object[0]);
            }
            this.f274470d = true;
        }
        return true;
    }
}
