package androidx.fragment.app;

/* loaded from: classes13.dex */
public class c3 implements o4.g {

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.b0 f11271d = null;

    /* renamed from: e, reason: collision with root package name */
    public o4.f f11272e = null;

    public void a(androidx.lifecycle.m mVar) {
        this.f11271d.f(mVar);
    }

    public void b() {
        if (this.f11271d == null) {
            this.f11271d = new androidx.lifecycle.b0(this, true);
            this.f11272e = new o4.f(this, null);
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        b();
        return this.f11271d;
    }

    @Override // o4.g
    public o4.b getSavedStateRegistry() {
        return this.f11272e.f342809b;
    }
}
