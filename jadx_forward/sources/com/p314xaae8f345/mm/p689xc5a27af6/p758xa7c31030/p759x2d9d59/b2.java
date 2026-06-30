package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f148934d;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f148935e;

    public b2(java.lang.Runnable action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f148934d = action;
    }

    public final synchronized void a(long j17, long j18) {
        long currentTimeMillis;
        long j19;
        currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.l lVar = this.f148935e;
        if (lVar == null) {
            j19 = j17;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
            long longValue = ((java.lang.Number) lVar.f384366d).longValue();
            jz5.l lVar2 = this.f148935e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
            long longValue2 = (longValue + ((java.lang.Number) lVar2.f384367e).longValue()) - currentTimeMillis;
            if (longValue2 < 0) {
                longValue2 = 0;
            }
            if (longValue2 <= j18) {
                j18 = longValue2;
            }
            j19 = j18 + j17;
        }
        synchronized (this) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a().removeCallbacks(this);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.a().postDelayed(this, j19);
        this.f148935e = new jz5.l(java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.f148934d.run();
        this.f148935e = null;
    }
}
