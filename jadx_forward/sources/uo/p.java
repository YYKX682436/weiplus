package uo;

/* loaded from: classes13.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final uo.p f511064d = new uo.p();

    @Override // java.lang.Runnable
    public final void run() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.util.concurrent.FutureTask futureTask = uo.q.f511068d;
        if (futureTask == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
            throw null;
        }
        ((ku5.t0) u0Var).g(futureTask);
        try {
            java.util.concurrent.FutureTask futureTask2 = uo.q.f511068d;
            if (futureTask2 != null) {
                futureTask2.get(10L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
                throw null;
            }
        } catch (java.util.concurrent.TimeoutException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "futureTask TimeoutException cancel");
            java.util.concurrent.FutureTask futureTask3 = uo.q.f511068d;
            if (futureTask3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
                throw null;
            }
            if (futureTask3.isCancelled()) {
                return;
            }
            java.util.concurrent.FutureTask futureTask4 = uo.q.f511068d;
            if (futureTask4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
                throw null;
            }
            if (futureTask4.isDone()) {
                return;
            }
            java.util.concurrent.FutureTask futureTask5 = uo.q.f511068d;
            if (futureTask5 != null) {
                futureTask5.cancel(true);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
                throw null;
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "futureTask Exception");
        }
    }
}
