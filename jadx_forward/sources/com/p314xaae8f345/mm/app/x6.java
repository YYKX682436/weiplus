package com.p314xaae8f345.mm.app;

/* loaded from: classes16.dex */
public class x6 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final android.app.Activity activity, final android.os.Bundle bundle) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo9958x78cb4fa(activity, bundle);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(final android.app.Activity activity) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$e
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo9959xa9f48fab(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final android.app.Activity activity) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo27324x99a658dc(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27325xd264673a(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27326x1da8b1eb(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27327x97ef5e9c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27328xd6812629(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27329xadb8051(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27330x240128d3(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27331x24c57a1f(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27332xc08eef73(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27333x2b520fe4(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27334xc0a66b43(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27335xc4abae62(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27336x7267d54a(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27337x122bb10c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27338x12f00258(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final android.app.Activity activity) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$f
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo27339xba973e9(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.v6.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((com.p314xaae8f345.mm.app.v6) ((fs.n) qVar.get())).mo27340x634d9e11(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final android.app.Activity activity) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$d
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo27341x59297693(activity);
                return false;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final android.app.Activity activity) {
        fs.g.b(com.p314xaae8f345.mm.app.v6.class, new fs.o() { // from class: com.tencent.mm.app.x6$$c
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.app.v6) nVar).mo27342x59edc7df(activity);
                return false;
            }
        });
    }
}
