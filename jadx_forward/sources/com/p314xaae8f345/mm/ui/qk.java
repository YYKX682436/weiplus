package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class qk {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f291106b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.WeakHashMap f291107c = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f291108a = new java.util.HashSet();

    public qk(android.app.Activity activity) {
        activity.runOnUiThread(new com.p314xaae8f345.mm.ui.pk(this, activity));
    }

    public static android.view.WindowInsets b(android.app.Activity activity) {
        return activity.getWindow().getDecorView().getRootWindowInsets();
    }

    public static com.p314xaae8f345.mm.ui.qk c(android.app.Activity activity, boolean z17) {
        com.p314xaae8f345.mm.ui.qk qkVar;
        java.util.WeakHashMap weakHashMap = f291107c;
        synchronized (weakHashMap) {
            qkVar = (com.p314xaae8f345.mm.ui.qk) weakHashMap.get(activity);
            if (qkVar == null && z17) {
                qkVar = new com.p314xaae8f345.mm.ui.qk(activity);
                weakHashMap.put(activity, qkVar);
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f291106b;
                if (!atomicBoolean.get() && activity.getApplication() != null) {
                    activity.getApplication().registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.ui.mk(new com.p314xaae8f345.mm.ui.lk()));
                    atomicBoolean.set(true);
                }
            }
        }
        return qkVar;
    }

    public void a(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (onApplyWindowInsetsListener == null) {
            return;
        }
        synchronized (this.f291108a) {
            ((java.util.HashSet) this.f291108a).add(onApplyWindowInsetsListener);
        }
    }

    public void d(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (onApplyWindowInsetsListener == null) {
            return;
        }
        synchronized (this.f291108a) {
            ((java.util.HashSet) this.f291108a).remove(onApplyWindowInsetsListener);
        }
    }
}
