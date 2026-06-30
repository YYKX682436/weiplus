package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.Observable */
/* loaded from: classes2.dex */
public abstract class AbstractC26892x770dd163<T> {

    /* renamed from: mObservers */
    protected final java.util.ArrayList<T> f57824xfeda5270 = new java.util.ArrayList<>();

    /* renamed from: registerObserver */
    public void m106330x7029299(T t17) {
        if (t17 == null) {
            throw new java.lang.IllegalArgumentException("The observer is null.");
        }
        synchronized (this.f57824xfeda5270) {
            if (this.f57824xfeda5270.contains(t17)) {
                throw new java.lang.IllegalStateException("Observer " + t17 + " is already registered.");
            }
            this.f57824xfeda5270.add(t17);
        }
    }

    /* renamed from: unregisterAll */
    public void m106331xd10f33c5() {
        synchronized (this.f57824xfeda5270) {
            this.f57824xfeda5270.clear();
        }
    }

    /* renamed from: unregisterObserver */
    public void m106332x86ac4f32(T t17) {
        if (t17 == null) {
            throw new java.lang.IllegalArgumentException("The observer is null.");
        }
        synchronized (this.f57824xfeda5270) {
            int indexOf = this.f57824xfeda5270.indexOf(t17);
            if (indexOf == -1) {
                throw new java.lang.IllegalStateException("Observer " + t17 + " was not registered.");
            }
            this.f57824xfeda5270.remove(indexOf);
        }
    }
}
