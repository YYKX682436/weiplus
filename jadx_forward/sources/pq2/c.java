package pq2;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f439111d = "Finder.Nearby.Preload." + getClass().getSimpleName() + "_@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final int f439112e;

    /* renamed from: f, reason: collision with root package name */
    public final int f439113f;

    /* renamed from: g, reason: collision with root package name */
    public az2.w f439114g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f439115h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f439116i;

    /* renamed from: m, reason: collision with root package name */
    public final kz2.c f439117m;

    /* renamed from: n, reason: collision with root package name */
    public volatile pq2.a f439118n;

    public c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.O).mo141623x754a37bb()).r()).intValue();
        this.f439112e = intValue;
        int intValue2 = ((java.lang.Number) t70Var.P1().r()).intValue();
        this.f439113f = intValue2;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f439115h = reentrantLock;
        this.f439116i = reentrantLock.newCondition();
        this.f439117m = new kz2.c(this.f439111d);
        this.f439118n = pq2.a.f439103d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "init WAITING_PRELOAD_TIMEOUT_MS:" + intValue + " PRELOAD_RESPONSE_EXPIRED_MS:" + intValue2 + ' ');
    }

    public abstract void b();

    public void c(az2.w wVar, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        kz2.c cVar = this.f439117m;
        cVar.c("handleFetchDoneInternal begin");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f439115h;
        reentrantLock.lock();
        try {
            callback.mo152xb9724478();
            if (wVar != null && wVar.f97690a == 0 && wVar.f97691b == 0) {
                g(pq2.a.f439107h);
            } else {
                g(pq2.a.f439106g);
            }
            this.f439116i.signalAll();
            reentrantLock.unlock();
            cVar.b("handleFetchDoneInternal end");
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public final boolean d(az2.w response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - response.f97694e;
        if (elapsedRealtime <= this.f439113f) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "isExpiredResponse expiredMs:" + elapsedRealtime);
        return true;
    }

    public az2.w e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "requestCache state:" + this.f439118n);
        this.f439115h.lock();
        this.f439117m.c("requestCache");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (this.f439118n == pq2.a.f439104e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "requestCache waiting.");
                this.f439116i.await(this.f439112e, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.f439115h.unlock();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (this.f439114g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "requestCache hit null, state:" + this.f439118n + " time:" + elapsedRealtime2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "requestCache hit cache state:" + this.f439118n + " response:" + this.f439114g + " time:" + elapsedRealtime2);
                az2.w wVar = this.f439114g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
                if (d(wVar)) {
                    g(pq2.a.f439105f);
                    return null;
                }
            }
            return this.f439114g;
        } catch (java.lang.Throwable th6) {
            this.f439115h.unlock();
            throw th6;
        }
    }

    public final void f(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "requestCacheAsync state:" + this.f439118n);
        pm0.v.K(null, new pq2.b(callback, this));
    }

    public final void g(pq2.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "setLoadingState from " + this.f439118n + " to " + aVar);
        this.f439118n = aVar;
    }

    public void h() {
        if (this.f439118n != pq2.a.f439103d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "startPreload return for state:" + this.f439118n);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "startPreload");
        this.f439117m.a("startPreload begin");
        this.f439115h.lock();
        try {
            g(pq2.a.f439104e);
            b();
            this.f439115h.unlock();
            this.f439117m.c("startPreload end");
        } catch (java.lang.Throwable th6) {
            this.f439115h.unlock();
            throw th6;
        }
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "stopPreload state:" + this.f439118n);
        this.f439115h.lock();
        try {
            this.f439116i.signalAll();
            this.f439115h.unlock();
            this.f439114g = null;
            g(pq2.a.f439103d);
        } catch (java.lang.Throwable th6) {
            this.f439115h.unlock();
            throw th6;
        }
    }
}
