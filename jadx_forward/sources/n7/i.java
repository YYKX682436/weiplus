package n7;

/* loaded from: classes13.dex */
public final class i implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f416764d;

    public i(n7.j jVar) {
        this.f416764d = new java.lang.ref.WeakReference(jVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.util.Log.isLoggable("ViewTarget", 2);
        n7.j jVar = (n7.j) this.f416764d.get();
        if (jVar != null) {
            java.util.List list = jVar.f416767b;
            if (!((java.util.ArrayList) list).isEmpty()) {
                int c17 = jVar.c();
                int b17 = jVar.b();
                boolean z17 = false;
                if (c17 > 0 || c17 == Integer.MIN_VALUE) {
                    if (b17 > 0 || b17 == Integer.MIN_VALUE) {
                        z17 = true;
                    }
                }
                if (z17) {
                    java.util.Iterator it = new java.util.ArrayList(list).iterator();
                    while (it.hasNext()) {
                        ((m7.h) ((n7.g) it.next())).l(c17, b17);
                    }
                    android.view.ViewTreeObserver viewTreeObserver = jVar.f416766a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(jVar.f416768c);
                    }
                    jVar.f416768c = null;
                    ((java.util.ArrayList) list).clear();
                }
            }
        }
        return true;
    }
}
