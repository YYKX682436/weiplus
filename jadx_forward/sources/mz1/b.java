package mz1;

/* loaded from: classes16.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f414616d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static volatile mz1.b f414617e;

    public static mz1.b b() {
        if (f414617e == null) {
            synchronized (mz1.b.class) {
                if (f414617e == null) {
                    f414617e = new mz1.b();
                }
            }
        }
        return f414617e;
    }

    public void a(mz1.c cVar) {
        if (cVar == null) {
            return;
        }
        java.util.List list = f414616d;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).contains(cVar)) {
            return;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(cVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54634x78cb4fa(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54635xa9f48fab(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54636x99a658dc(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54637xd264673a(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54638x1da8b1eb(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54639x97ef5e9c(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54640xd6812629(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54641xadb8051(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54642x240128d3(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54643x24c57a1f(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54644xc08eef73(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54645x2b520fe4(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54646xc0a66b43(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54647xc4abae62(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54648x7267d54a(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54649x122bb10c(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54650x12f00258(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54651xba973e9(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54652x634d9e11(activity, bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54653x59297693(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) f414616d).iterator();
        while (it.hasNext()) {
            try {
                ((mz1.c) it.next()).mo54654x59edc7df(activity);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ActivityLifecycleTracker", e17.getMessage());
            }
        }
    }
}
