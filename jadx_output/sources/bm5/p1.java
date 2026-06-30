package bm5;

/* loaded from: classes8.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f22725a = null;

    public abstract java.lang.Object a();

    public final java.lang.Object b() {
        if (this.f22725a == null) {
            synchronized (this) {
                if (this.f22725a == null) {
                    this.f22725a = a();
                }
            }
        }
        return this.f22725a;
    }

    public final boolean c() {
        boolean z17 = true;
        if (this.f22725a != null) {
            return true;
        }
        synchronized (this) {
            if (this.f22725a == null) {
                z17 = false;
            }
        }
        return z17;
    }

    public final void reset() {
        if (this.f22725a != null) {
            synchronized (this) {
                if (this.f22725a != null) {
                    this.f22725a = null;
                }
            }
        }
    }
}
