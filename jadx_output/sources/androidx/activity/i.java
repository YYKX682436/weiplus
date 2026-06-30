package androidx.activity;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f9039a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayDeque f9040b = new java.util.ArrayDeque();

    public i(java.lang.Runnable runnable) {
        this.f9039a = runnable;
    }

    public void a(androidx.lifecycle.y yVar, androidx.activity.g gVar) {
        androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
        if (mo133getLifecycle.b() == androidx.lifecycle.n.DESTROYED) {
            return;
        }
        gVar.addCancellable(new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, mo133getLifecycle, gVar));
    }

    public androidx.activity.a b(androidx.activity.g gVar) {
        this.f9040b.add(gVar);
        androidx.activity.h hVar = new androidx.activity.h(this, gVar);
        gVar.addCancellable(hVar);
        return hVar;
    }

    public void c() {
        java.util.Iterator descendingIterator = this.f9040b.descendingIterator();
        while (descendingIterator.hasNext()) {
            androidx.activity.g gVar = (androidx.activity.g) descendingIterator.next();
            if (gVar.isEnabled()) {
                gVar.handleOnBackPressed();
                return;
            }
        }
        java.lang.Runnable runnable = this.f9039a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
