package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class c0 extends ik1.a {
    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        int hashCode = activity.hashCode();
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.platform.window.activity.e0.f87579g;
        synchronized (sparseArray) {
            sparseArray.remove(hashCode);
        }
    }
}
