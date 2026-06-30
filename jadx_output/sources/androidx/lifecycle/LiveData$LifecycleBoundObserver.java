package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class LiveData$LifecycleBoundObserver extends androidx.lifecycle.f0 implements androidx.lifecycle.v {

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.y f11585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f11586i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(androidx.lifecycle.g0 g0Var, androidx.lifecycle.y yVar, androidx.lifecycle.k0 k0Var) {
        super(g0Var, k0Var);
        this.f11586i = g0Var;
        this.f11585h = yVar;
    }

    @Override // androidx.lifecycle.f0
    public void b() {
        this.f11585h.mo133getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.f0
    public boolean c(androidx.lifecycle.y yVar) {
        return this.f11585h == yVar;
    }

    @Override // androidx.lifecycle.f0
    public boolean d() {
        return this.f11585h.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED);
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        androidx.lifecycle.y yVar2 = this.f11585h;
        androidx.lifecycle.n b17 = yVar2.mo133getLifecycle().b();
        if (b17 == androidx.lifecycle.n.DESTROYED) {
            this.f11586i.removeObserver(this.f11623d);
            return;
        }
        androidx.lifecycle.n nVar = null;
        while (nVar != b17) {
            a(d());
            nVar = b17;
            b17 = yVar2.mo133getLifecycle().b();
        }
    }
}
