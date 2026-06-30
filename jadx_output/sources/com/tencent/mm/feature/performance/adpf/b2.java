package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f67401d;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f67402e;

    public b2(java.lang.Runnable action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f67401d = action;
    }

    public final synchronized void a(long j17, long j18) {
        long currentTimeMillis;
        long j19;
        currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.l lVar = this.f67402e;
        if (lVar == null) {
            j19 = j17;
        } else {
            kotlin.jvm.internal.o.d(lVar);
            long longValue = ((java.lang.Number) lVar.f302833d).longValue();
            jz5.l lVar2 = this.f67402e;
            kotlin.jvm.internal.o.d(lVar2);
            long longValue2 = (longValue + ((java.lang.Number) lVar2.f302834e).longValue()) - currentTimeMillis;
            if (longValue2 < 0) {
                longValue2 = 0;
            }
            if (longValue2 <= j18) {
                j18 = longValue2;
            }
            j19 = j18 + j17;
        }
        synchronized (this) {
            com.tencent.mm.feature.performance.adpf.a2.a().removeCallbacks(this);
        }
        com.tencent.mm.feature.performance.adpf.a2.a().postDelayed(this, j19);
        this.f67402e = new jz5.l(java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.f67401d.run();
        this.f67402e = null;
    }
}
