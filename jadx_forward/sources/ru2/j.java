package ru2;

/* loaded from: classes8.dex */
public final class j implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Runnable f481276f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.concurrent.Future f481277g;

    /* renamed from: h, reason: collision with root package name */
    public static java.util.concurrent.Future f481278h;

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f481281n;

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.j f481274d = new ru2.j();

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f481275e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f481279i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashSet f481280m = new java.util.HashSet();

    public final java.util.concurrent.Future a(final yz5.a aVar, long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26811xa9bfd794.f57449x6baced52, 0);
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLifecycleCallback", str + " return for delayMs:" + j17);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLifecycleCallback", str + " delayMs:" + j17);
        return ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable(aVar) { // from class: ru2.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f481273d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f481273d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f481273d.mo152xb9724478();
            }
        }, j17);
    }

    public final java.lang.String b(android.app.Activity activity) {
        return activity.getClass().getName() + '_' + activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity p07, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        i95.m c17 = i95.n0.c(zy2.aa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m2) ((zy2.aa) c17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p07.getClass().getName(), "com.tencent.mm.ui.LauncherUI")) {
            if (gm0.j1.a()) {
                pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l2(m2Var));
            } else {
                m2Var.f187233d.compareAndSet(false, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        b(p07);
        java.lang.String simpleName = p07.getClass().getSimpleName();
        boolean z17 = (p07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) || r26.n0.B(p07.getClass().getName(), "com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI", false) || r26.n0.B(p07.getClass().getName(), "com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLifecycleCallback", "isFinder=" + z17 + ",activity=" + p07 + ",name=" + p07.getClass().getName());
        if (!z17) {
            p07 = null;
        }
        if (p07 != null) {
            f481280m.add(f481274d.b(p07));
            if (f481281n) {
                return;
            }
            f481281n = true;
            ((ku5.t0) ku5.t0.f394148d).A("FINDER-BG");
            pm0.v.N("FINDER-FG", false, new ru2.b(simpleName));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity p07, android.os.Bundle p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        b(p07);
        java.util.HashSet hashSet = f481280m;
        hashSet.remove(b(p07));
        java.lang.String simpleName = p07.getClass().getSimpleName();
        if (f481281n && hashSet.isEmpty()) {
            f481281n = false;
            pm0.v.P("FINDER-BG", false, new ru2.c(simpleName), 600L);
        }
    }
}
