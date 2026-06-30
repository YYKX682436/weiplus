package c6;

/* loaded from: classes14.dex */
public final class g extends androidx.lifecycle.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c6.g f38800b = new c6.g();

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.lifecycle.y f38801c = new c6.g$$a();

    @Override // androidx.lifecycle.o
    public void a(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (!(observer instanceof androidx.lifecycle.f)) {
            throw new java.lang.IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.f fVar = (androidx.lifecycle.f) observer;
        androidx.lifecycle.y yVar = f38801c;
        fVar.onCreate(yVar);
        fVar.onStart(yVar);
        fVar.onResume(yVar);
    }

    @Override // androidx.lifecycle.o
    public androidx.lifecycle.n b() {
        return androidx.lifecycle.n.RESUMED;
    }

    @Override // androidx.lifecycle.o
    public void c(androidx.lifecycle.x observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
    }

    public java.lang.String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
