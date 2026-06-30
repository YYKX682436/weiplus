package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public enum n {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f262909d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262910e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f262911f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f262912g = new java.util.HashSet();

    n() {
    }

    public void a(java.lang.ref.WeakReference weakReference) {
        java.util.HashSet hashSet = this.f262912g;
        if (hashSet != null) {
            if (weakReference.get() != null) {
                ((android.app.Activity) weakReference.get()).getClass();
            }
            hashSet.add(weakReference);
        }
    }

    public void h() {
        java.util.Iterator it = this.f262912g.iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) it.next()).get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
            it.remove();
        }
    }

    public void i() {
        synchronized (this.f262911f) {
            this.f262910e = true;
        }
    }

    public void j(boolean z17) {
        synchronized (this.f262911f) {
            this.f262909d = z17;
        }
    }

    public void k(boolean z17) {
        synchronized (this.f262911f) {
            this.f262910e = z17;
        }
    }
}
