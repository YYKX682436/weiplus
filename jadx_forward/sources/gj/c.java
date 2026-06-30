package gj;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i17;
        long j17;
        while (true) {
            try {
                z17 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20032xade56b42;
                if (!z17) {
                    i17 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20049xcacdcff2;
                    if (i17 > -1) {
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        j17 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20038x98cf8a05;
                        long unused = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20037x99a24418 = uptimeMillis - j17;
                        android.os.SystemClock.sleep(5L);
                    }
                }
                obj = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20051xb8082181;
                synchronized (obj) {
                    obj2 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20051xb8082181;
                    obj2.wait();
                }
            } catch (java.lang.Exception e17) {
                oj.j.b("Matrix.AppMethodBeat", "" + e17.toString(), new java.lang.Object[0]);
                return;
            }
        }
    }
}
