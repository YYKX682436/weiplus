package fn4;

/* loaded from: classes15.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.j0 f346087e;

    public i0(fn4.j0 j0Var, int i17) {
        this.f346087e = j0Var;
        this.f346086d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.k0 k0Var = this.f346087e.f346091d;
        pm4.s sVar = k0Var.f346101b;
        if (sVar != null) {
            sVar.z3(this.f346086d, k0Var.f346102c);
        }
    }
}
