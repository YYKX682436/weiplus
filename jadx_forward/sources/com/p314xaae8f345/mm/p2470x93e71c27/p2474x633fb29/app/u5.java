package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

@j95.b
/* loaded from: classes9.dex */
public class u5 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 f270626d = null;

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f Ai() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Bi();
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y Bi() {
        return zo3.p.Ni();
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Di() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Ri();
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 Ni() {
        gm0.j1.b().c();
        if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.class)).f270626d == null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.class)).f270626d = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5();
        }
        return ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.class)).f270626d;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0 Ri() {
        return (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai();
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c1 Ui() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Ui();
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e wi() {
        return (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t5 t5Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t5(this);
        try {
            t5Var.run();
        } catch (java.lang.Throwable th6) {
            if (!fp.h.a(20)) {
                throw th6;
            }
            t5Var.run();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        int size;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.class)).f270626d;
        if (s5Var != null) {
            s5Var.f270610o = 0;
        }
        synchronized (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270783w) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270782v;
            size = hashMap.size();
            hashMap.clear();
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270784x == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", java.lang.Integer.valueOf(size));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270784x.f274272a.size()));
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270784x.f274272a.clear();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270784x = null;
    }
}
