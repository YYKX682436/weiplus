package k13;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f384822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384823e;

    public z0(java.util.List list, k13.l1 l1Var) {
        this.f384822d = list;
        this.f384823e = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = kz5.n0.x0(this.f384822d).iterator();
        while (it.hasNext()) {
            this.f384823e.g((i13.c) it.next(), false);
        }
    }
}
