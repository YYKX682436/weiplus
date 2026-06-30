package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class b0 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134258g;
        boolean isEmpty = weakHashMap.isEmpty();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.z zVar = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.z(activity);
        synchronized (weakHashMap) {
            zVar.mo146xb9724478(weakHashMap);
        }
        if (isEmpty) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134264m;
            if (interfaceC4661x636abfbb == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef) interfaceC4661x636abfbb).m41057xd8f7d8a0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134258g;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.a0 a0Var = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.a0(activity);
        synchronized (weakHashMap) {
            a0Var.mo146xb9724478(weakHashMap);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134261j.put(activity, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134257f);
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134260i.remove(activity) != null) {
            oj.j.f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onStart/onStop callback", new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134259h.remove(activity) != null) {
            oj.j.f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onResume/onPause callback", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134259h;
        weakHashMap.remove(activity);
        if (weakHashMap.isEmpty()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134256e.postDelayed(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134269r, 500L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134259h;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134257f);
        if (isEmpty) {
            if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134262k) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134256e.removeCallbacks(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134269r);
                return;
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134265n;
            if (interfaceC4661x636abfbb == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef) interfaceC4661x636abfbb).m41057xd8f7d8a0();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134262k = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        java.lang.String name = activity.getClass().getName();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.y yVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134267p;
        if (yVar != null) {
            try {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134256e.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.e0(yVar, name));
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.ProcessLifecycle", th6, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q = name;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v = activity.getClass().getName();
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134260i;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134257f);
        if (isEmpty && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134263l) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134266o;
            if (interfaceC4661x636abfbb == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef) interfaceC4661x636abfbb).m41057xd8f7d8a0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0 f0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134260i.remove(activity);
        f0Var.c();
    }
}
