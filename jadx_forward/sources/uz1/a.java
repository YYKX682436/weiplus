package uz1;

/* loaded from: classes13.dex */
public class a implements java.lang.Iterable, java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f513684d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f513685e = 0;

    public void add(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        d();
        if (m170825xde2d761f(obj)) {
            return;
        }
        ((java.util.ArrayList) this.f513684d).add(new java.lang.ref.WeakReference(obj));
    }

    /* renamed from: contains */
    public boolean m170825xde2d761f(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        d();
        java.util.Iterator it = ((java.util.ArrayList) this.f513684d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == obj) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f513684d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    public void e(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        d();
        java.util.Iterator it = ((java.util.ArrayList) this.f513684d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == obj) {
                it.remove();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513685e < ((java.util.ArrayList) this.f513684d).size();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        d();
        this.f513685e = 0;
        return this;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj;
        while (true) {
            int i17 = this.f513685e;
            java.util.List list = this.f513684d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            int i18 = this.f513685e;
            this.f513685e = i18 + 1;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) list).get(i18);
            if (weakReference != null && (obj = weakReference.get()) != null) {
                return obj;
            }
        }
    }

    /* renamed from: size */
    public int m170826x35e001() {
        d();
        return ((java.util.ArrayList) this.f513684d).size();
    }
}
