package androidx.lifecycle;

/* loaded from: classes13.dex */
public abstract class g0 {
    static final java.lang.Object NOT_SET = new java.lang.Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile java.lang.Object mData;
    final java.lang.Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private q.h mObservers;
    volatile java.lang.Object mPendingData;
    private final java.lang.Runnable mPostValueRunnable;
    private int mVersion;

    public g0(java.lang.Object obj) {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new q.h();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new androidx.lifecycle.d0(this);
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(java.lang.String str) {
        ((p.d) p.b.a().f350335a).getClass();
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        throw new java.lang.IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void a(androidx.lifecycle.f0 f0Var) {
        if (f0Var.f11624e) {
            if (!f0Var.d()) {
                f0Var.a(false);
                return;
            }
            int i17 = f0Var.f11625f;
            int i18 = this.mVersion;
            if (i17 >= i18) {
                return;
            }
            f0Var.f11625f = i18;
            f0Var.f11623d.onChanged(this.mData);
        }
    }

    public void changeActiveCounter(int i17) {
        int i18 = this.mActiveCount;
        this.mActiveCount = i17 + i18;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i19 = this.mActiveCount;
                if (i18 == i19) {
                    return;
                }
                boolean z17 = i18 == 0 && i19 > 0;
                boolean z18 = i18 > 0 && i19 == 0;
                if (z17) {
                    onActive();
                } else if (z18) {
                    onInactive();
                }
                i18 = i19;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(androidx.lifecycle.f0 f0Var) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (f0Var != null) {
                a(f0Var);
                f0Var = null;
            } else {
                q.h hVar = this.mObservers;
                hVar.getClass();
                q.e eVar = new q.e(hVar);
                hVar.f359213f.put(eVar, java.lang.Boolean.FALSE);
                while (eVar.hasNext()) {
                    a((androidx.lifecycle.f0) ((java.util.Map.Entry) eVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public java.lang.Object getValue() {
        java.lang.Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f359214g > 0;
    }

    public void observe(androidx.lifecycle.y yVar, androidx.lifecycle.k0 k0Var) {
        assertMainThread("observe");
        if (yVar.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
            return;
        }
        androidx.lifecycle.LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new androidx.lifecycle.LiveData$LifecycleBoundObserver(this, yVar, k0Var);
        androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) this.mObservers.e(k0Var, liveData$LifecycleBoundObserver);
        if (f0Var != null && !f0Var.c(yVar)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f0Var != null) {
            return;
        }
        yVar.mo133getLifecycle().a(liveData$LifecycleBoundObserver);
    }

    public void observeForever(androidx.lifecycle.k0 k0Var) {
        assertMainThread("observeForever");
        androidx.lifecycle.e0 e0Var = new androidx.lifecycle.e0(this, k0Var);
        androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) this.mObservers.e(k0Var, e0Var);
        if (f0Var instanceof androidx.lifecycle.LiveData$LifecycleBoundObserver) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f0Var != null) {
            return;
        }
        e0Var.a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(java.lang.Object obj) {
        boolean z17;
        synchronized (this.mDataLock) {
            z17 = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z17) {
            p.b.a().b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(androidx.lifecycle.k0 k0Var) {
        assertMainThread("removeObserver");
        androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) this.mObservers.g(k0Var);
        if (f0Var == null) {
            return;
        }
        f0Var.b();
        f0Var.a(false);
    }

    public void removeObservers(androidx.lifecycle.y yVar) {
        assertMainThread("removeObservers");
        java.util.Iterator it = this.mObservers.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) fVar.next();
            if (((androidx.lifecycle.f0) entry.getValue()).c(yVar)) {
                removeObserver((androidx.lifecycle.k0) entry.getKey());
            }
        }
    }

    public void setValue(java.lang.Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public g0() {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new q.h();
        this.mActiveCount = 0;
        java.lang.Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new androidx.lifecycle.d0(this);
        this.mData = obj;
        this.mVersion = -1;
    }
}
