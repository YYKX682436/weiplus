package wu5;

/* loaded from: classes14.dex */
public abstract class b implements java.lang.Runnable, wu5.d, wu5.g, wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f531374d;

    @Override // wu5.f
    public boolean a() {
        return !(this instanceof sj0.f);
    }

    public boolean b() {
        java.util.concurrent.Future future = this.f531374d;
        if (future == null || future.isDone()) {
            return false;
        }
        return this.f531374d.cancel(false);
    }

    public boolean c(boolean z17) {
        java.util.concurrent.Future future = this.f531374d;
        if (future == null || future.isDone()) {
            return false;
        }
        return this.f531374d.cancel(z17);
    }

    public boolean d() {
        java.util.concurrent.Future future = this.f531374d;
        if (future == null) {
            return false;
        }
        return future.isDone();
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f531374d = future;
    }
}
