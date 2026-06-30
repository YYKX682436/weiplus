package ds0;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f324368d;

    public z(ds0.d0 d0Var) {
        this.f324368d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fs0.f fVar = this.f324368d.f324329f;
        if (fVar != null) {
            fVar.d();
        }
    }
}
