package dr0;

/* loaded from: classes8.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.p1 f324014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f324015e;

    public o1(dr0.p1 p1Var, boolean z17) {
        this.f324014d = p1Var;
        this.f324015e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f324014d.f().iterator();
        while (it.hasNext()) {
            ((dr0.i1) it.next()).a(this.f324015e);
        }
    }
}
