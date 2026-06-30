package ou5;

/* loaded from: classes12.dex */
public class d implements ou5.g {

    /* renamed from: c, reason: collision with root package name */
    public final ou5.h f430593c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f430591a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f430592b = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public volatile long f430594d = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0132 A[LOOP:0: B:16:0x012c->B:18:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r23, ku5.c r24) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ou5.d.<init>(android.content.Context, ku5.c):void");
    }

    @Override // su5.a
    public void a(wu5.l lVar, long j17, long j18) {
        boolean z17;
        lVar.getClass();
        wu5.l.f531377w.c(lVar.i());
        long[] jArr = lVar.f531383h == ku5.q.COMPLETE ? new long[]{lVar.f531382g, lVar.f531380e} : new long[2];
        java.lang.String mo1867xb5884f29 = lVar.mo1867xb5884f29();
        long j19 = jArr[0];
        long j27 = jArr[1];
        ou5.c cVar = new ou5.c(mo1867xb5884f29, j19, j27, lVar.f531390r.mo172679xfb82e301());
        ou5.b bVar = (ou5.b) i().get(mo1867xb5884f29);
        if (bVar == null) {
            bVar = new ou5.b(mo1867xb5884f29);
            i().put(mo1867xb5884f29, bVar);
        }
        bVar.f430584j.add(cVar);
        bVar.f430580f += (float) j19;
        bVar.f430581g += (float) j27;
        int size = bVar.f430584j.size();
        float f17 = bVar.f430582h;
        float f18 = cVar.f430590f;
        if (f17 > f18) {
            z17 = size <= 5000;
            if (!z17) {
                bVar.f430576b += f17;
            }
            bVar.f430582h = f18;
        } else {
            z17 = true;
        }
        float f19 = bVar.f430583i;
        if (f19 < f18) {
            z17 = size <= 5000;
            if (!z17) {
                bVar.f430576b += f19;
            }
            bVar.f430583i = f18;
        }
        if (z17) {
            bVar.f430576b += f18;
        }
        bVar.f430577c = bVar.f430576b / (size - (size <= 5000 ? 0 : 2));
        float f27 = size;
        bVar.f430578d = (bVar.f430580f * 1.0f) / f27;
        bVar.f430579e = (bVar.f430581g * 1.0f) / f27;
        if (this.f430592b.incrementAndGet() < 5000 || java.lang.System.currentTimeMillis() - this.f430594d < 600000) {
            return;
        }
        this.f430592b.set(0L);
        this.f430594d = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).q(new ou5.a(this));
    }

    @Override // su5.a
    public void b(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f531377w.c(lVar.i());
    }

    @Override // su5.a
    public void c(wu5.l lVar) {
        int i17;
        tu5.h i18 = lVar.i();
        ((uu5.a) wu5.l.f531377w).getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = i18.f503706b.f503704c;
        do {
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 + 1));
    }

    @Override // su5.a
    public void d(wu5.l lVar) {
    }

    @Override // su5.a
    public void e(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f531377w.b(lVar.i());
    }

    @Override // su5.a
    public void f(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f531377w.c(lVar.i());
    }

    @Override // su5.a
    public void g(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f531377w.c(lVar.i());
    }

    @Override // wu5.a
    public boolean h(java.lang.String str) {
        ou5.b bVar;
        if (str == null || (bVar = (ou5.b) i().get(str)) == null) {
            return true;
        }
        return !bVar.a();
    }

    public final java.util.concurrent.ConcurrentHashMap i() {
        if (this.f430591a == null) {
            synchronized (this) {
                if (this.f430591a == null) {
                    this.f430591a = new java.util.concurrent.ConcurrentHashMap();
                }
            }
        }
        return this.f430591a;
    }

    @Override // ou5.g
    public void j() {
        k(i());
    }

    public final synchronized void k(java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        if (concurrentHashMap.size() <= 0) {
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        try {
            ((ou5.f) this.f430593c).b(concurrentHashMap.values());
            ku5.o.f394132c.i("Experience", "[persistCache] successfully! size=" + concurrentHashMap.size() + " cost:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis), new java.lang.Object[0]);
            concurrentHashMap.clear();
        } catch (java.lang.Exception e17) {
            ku5.o.f394132c.e("Experience", "%s", e17.toString());
        }
    }
}
