package uz1;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513686a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f513687b;

    public b(int i17) {
        if ((i17 >>> 24) < 2) {
            throw new java.lang.IllegalArgumentException("[WeakViewMap] argument tagKey must pass an application specific resource id.");
        }
        this.f513687b = i17;
    }

    public final void a() {
        java.util.Iterator it = ((java.util.ArrayList) this.f513686a).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    public boolean b(android.view.View view) {
        if (view == null) {
            return false;
        }
        a();
        java.util.Iterator it = ((java.util.ArrayList) this.f513686a).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == view) {
                return true;
            }
        }
        return false;
    }

    public java.lang.Object c(android.view.View view) {
        java.lang.Object tag;
        if (view == null) {
            return null;
        }
        a();
        if (!b(view) || (tag = view.getTag(this.f513687b)) == null) {
            return null;
        }
        return tag;
    }

    public void d(android.view.View view, java.lang.Object obj) {
        if (view == null) {
            return;
        }
        a();
        a();
        boolean b17 = b(view);
        int i17 = this.f513687b;
        java.util.List list = this.f513686a;
        if (b17) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference != null && weakReference.get() == view) {
                    it.remove();
                }
            }
            if (view.getTag(i17) != null) {
                view.setTag(i17, null);
            }
        }
        view.setTag(i17, obj);
        ((java.util.ArrayList) list).add(new java.lang.ref.WeakReference(view));
    }
}
