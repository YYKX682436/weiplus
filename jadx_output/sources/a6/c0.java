package a6;

/* loaded from: classes14.dex */
public final class c0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public coil.memory.ViewTargetRequestDelegate f1644d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.UUID f1645e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1646f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1647g = true;

    /* renamed from: h, reason: collision with root package name */
    public final x.n f1648h = new x.n();

    public final java.util.UUID a(kotlinx.coroutines.r2 job) {
        kotlin.jvm.internal.o.g(job, "job");
        java.util.UUID uuid = this.f1645e;
        if (uuid == null || !this.f1646f || !kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            uuid = java.util.UUID.randomUUID();
            kotlin.jvm.internal.o.f(uuid, "randomUUID()");
        }
        this.f1645e = uuid;
        return uuid;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        if (this.f1647g) {
            this.f1647g = false;
            return;
        }
        coil.memory.ViewTargetRequestDelegate viewTargetRequestDelegate = this.f1644d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f1646f = true;
        ((r5.p) viewTargetRequestDelegate.f43907d).b(viewTargetRequestDelegate.f43908e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f1647g = false;
        coil.memory.ViewTargetRequestDelegate viewTargetRequestDelegate = this.f1644d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        viewTargetRequestDelegate.b();
    }
}
