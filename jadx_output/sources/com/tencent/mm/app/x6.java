package com.tencent.mm.app;

/* loaded from: classes16.dex */
public class x6 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final android.app.Activity activity, final android.os.Bundle bundle) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityCreated(activity, bundle);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(final android.app.Activity activity) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$e
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityDestroyed(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final android.app.Activity activity) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityPaused(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostSaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPostStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPrePaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreSaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivityPreStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final android.app.Activity activity) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$f
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityResumed(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.app.v6) ((fs.n) qVar.get())).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final android.app.Activity activity) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$d
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityStarted(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final android.app.Activity activity) {
        fs.g.b(com.tencent.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$c
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.app.v6) nVar).onActivityStopped(activity);
                return false;
            }
        });
    }
}
