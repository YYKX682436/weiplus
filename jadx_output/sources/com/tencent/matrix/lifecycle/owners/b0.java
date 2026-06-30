package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class b0 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52725g;
        boolean isEmpty = weakHashMap.isEmpty();
        com.tencent.matrix.lifecycle.owners.z zVar = new com.tencent.matrix.lifecycle.owners.z(activity);
        synchronized (weakHashMap) {
            zVar.invoke(weakHashMap);
        }
        if (isEmpty) {
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52731m;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52725g;
        com.tencent.matrix.lifecycle.owners.a0 a0Var = new com.tencent.matrix.lifecycle.owners.a0(activity);
        synchronized (weakHashMap) {
            a0Var.invoke(weakHashMap);
        }
        com.tencent.matrix.lifecycle.owners.f0.f52728j.put(activity, com.tencent.matrix.lifecycle.owners.f0.f52724f);
        if (com.tencent.matrix.lifecycle.owners.f0.f52727i.remove(activity) != null) {
            oj.j.f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onStart/onStop callback", new java.lang.Object[0]);
        }
        if (com.tencent.matrix.lifecycle.owners.f0.f52726h.remove(activity) != null) {
            oj.j.f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onResume/onPause callback", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52726h;
        weakHashMap.remove(activity);
        if (weakHashMap.isEmpty()) {
            com.tencent.matrix.lifecycle.owners.f0.f52723e.postDelayed(com.tencent.matrix.lifecycle.owners.f0.f52736r, 500L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52726h;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, com.tencent.matrix.lifecycle.owners.f0.f52724f);
        if (isEmpty) {
            if (!com.tencent.matrix.lifecycle.owners.f0.f52729k) {
                com.tencent.matrix.lifecycle.owners.f0.f52723e.removeCallbacks(com.tencent.matrix.lifecycle.owners.f0.f52736r);
                return;
            }
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52732n;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
            com.tencent.matrix.lifecycle.owners.f0.f52729k = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.lang.String name = activity.getClass().getName();
        com.tencent.matrix.lifecycle.owners.y yVar = com.tencent.matrix.lifecycle.owners.f0.f52734p;
        if (yVar != null) {
            try {
                com.tencent.matrix.lifecycle.owners.f0.f52723e.post(new com.tencent.matrix.lifecycle.owners.e0(yVar, name));
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.ProcessLifecycle", th6, "", new java.lang.Object[0]);
            }
        }
        com.tencent.matrix.lifecycle.owners.f0.f52735q = name;
        java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        com.tencent.matrix.lifecycle.owners.f0.f52740v = activity.getClass().getName();
        java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52727i;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, com.tencent.matrix.lifecycle.owners.f0.f52724f);
        if (isEmpty && com.tencent.matrix.lifecycle.owners.f0.f52730l) {
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52733o;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.matrix.lifecycle.owners.f0 f0Var = com.tencent.matrix.lifecycle.owners.f0.f52742x;
        com.tencent.matrix.lifecycle.owners.f0.f52727i.remove(activity);
        f0Var.c();
    }
}
