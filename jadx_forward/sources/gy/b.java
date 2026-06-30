package gy;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.c f358996d;

    public b(gy.c cVar) {
        this.f358996d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy.c cVar = this.f358996d;
        synchronized (cVar.f359000d) {
            if (cVar.f359004h) {
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                try {
                    cVar.f359002f.clear();
                    if (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b.d(cVar.f359002f, cVar.f359003g) == 0) {
                        int remaining = cVar.f359002f.remaining();
                        int i17 = cVar.f359003g;
                        if (remaining >= i17) {
                            if (cVar.f358998b.write(cVar.f359002f, i17, cVar.f359008l ? 1 : 0) < 0) {
                                if (cVar.f359008l) {
                                    cVar.b();
                                } else {
                                    cVar.f();
                                }
                                long elapsedRealtimeNanos2 = (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000;
                                long j17 = cVar.f359006j + 20;
                                long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - elapsedRealtimeNanos2) - j17;
                                cVar.f359007k = cVar.f359008l ? java.lang.Math.max(0L, java.lang.Math.min(cVar.f359007k + elapsedRealtime, 60L)) : java.lang.Math.max(0L, java.lang.Math.min(cVar.f359007k + elapsedRealtime, 40L));
                                cVar.f359006j = j17;
                                if (cVar.f359004h) {
                                    cVar.c();
                                }
                            }
                        }
                    } else if (cVar.f359008l) {
                        java.lang.Thread.sleep(5L);
                    }
                } finally {
                    long elapsedRealtimeNanos3 = (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000;
                    long j18 = cVar.f359006j + 20;
                    long elapsedRealtime2 = (android.os.SystemClock.elapsedRealtime() - elapsedRealtimeNanos3) - j18;
                    cVar.f359007k = cVar.f359008l ? java.lang.Math.max(0L, java.lang.Math.min(cVar.f359007k + elapsedRealtime2, 60L)) : java.lang.Math.max(0L, java.lang.Math.min(cVar.f359007k + elapsedRealtime2, 40L));
                    cVar.f359006j = j18;
                    if (cVar.f359004h) {
                        cVar.c();
                    }
                }
            }
        }
    }
}
