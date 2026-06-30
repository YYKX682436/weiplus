package zy5;

/* loaded from: classes13.dex */
public final class a implements java.lang.Iterable, java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f559220d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f559221e = 0;

    public final void d() {
        java.util.Iterator it = this.f559220d.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    public final void e(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        d();
        java.util.Iterator it = this.f559220d.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == obj) {
                it.remove();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f559221e < this.f559220d.size();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        d();
        this.f559221e = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj;
        while (true) {
            int i17 = this.f559221e;
            java.util.ArrayList arrayList = this.f559220d;
            if (i17 >= arrayList.size()) {
                return null;
            }
            int i18 = this.f559221e;
            this.f559221e = i18 + 1;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) arrayList.get(i18);
            if (weakReference != null && (obj = weakReference.get()) != null) {
                return obj;
            }
        }
    }
}
