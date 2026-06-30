package dk2;

/* loaded from: classes12.dex */
public final class kg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.kg f315241d = new dk2.kg();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("live_exception_monitor");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        R.putInt("PARAM_THREAD_CNT_IN_PROCESS", com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.b());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        R.putInt("PARAM_THREAD_CNT_IN_JAVA", threadGroup == null ? -1 : threadGroup.enumerate(new java.lang.Thread[threadGroup.activeCount() * 2]));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.String m150953x9616526c = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.h(false, 4).m150953x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m150953x9616526c, "toString(...)");
        R.putString("PARAM_MEM_INFO", r26.i0.t(m150953x9616526c, ",", ";", false));
        java.lang.Integer a07 = zl2.r4.f555483a.a0();
        if (a07 != null) {
            R.putInt("PARAM_LIVING_BATTERY", a07.intValue());
        }
    }
}
