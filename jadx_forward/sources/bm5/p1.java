package bm5;

/* loaded from: classes8.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f104258a = null;

    public abstract java.lang.Object a();

    public final java.lang.Object b() {
        if (this.f104258a == null) {
            synchronized (this) {
                if (this.f104258a == null) {
                    this.f104258a = a();
                }
            }
        }
        return this.f104258a;
    }

    public final boolean c() {
        boolean z17 = true;
        if (this.f104258a != null) {
            return true;
        }
        synchronized (this) {
            if (this.f104258a == null) {
                z17 = false;
            }
        }
        return z17;
    }

    /* renamed from: reset */
    public final void m10823x6761d4f() {
        if (this.f104258a != null) {
            synchronized (this) {
                if (this.f104258a != null) {
                    this.f104258a = null;
                }
            }
        }
    }
}
