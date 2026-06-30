package cp;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(java.lang.String tag, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        fz.l lVar = (fz.l) ((cp.f) i95.n0.c(cp.f.class));
        if (lVar.wi()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gm0.j1.e().a().getThread(), java.lang.Thread.currentThread())) {
                lVar.Ai(tag, runnable);
                return;
            }
        }
        runnable.run();
    }

    public static final void b(java.lang.String tag, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        ((fz.l) ((cp.f) i95.n0.c(cp.f.class))).Ai(tag, runnable);
    }

    public static final void c(java.lang.String tag, java.lang.Runnable runnable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        fz.l lVar = (fz.l) ((cp.f) i95.n0.c(cp.f.class));
        lVar.getClass();
        if (lVar.wi()) {
            ((ku5.t0) ku5.t0.f394148d).l(runnable, j17, tag);
        } else {
            gm0.j1.e().k(runnable, j17);
        }
    }
}
