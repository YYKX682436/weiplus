package yv1;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f547549d;

    public e0(int i17) {
        this.f547549d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Start CleanCacheFileSystems task");
        yv1.h1.g(1, null, 2, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de();
        am.p0 p0Var = c5189xf98047de.f135532g;
        p0Var.f89122a = this.f547549d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "triggering BeforeAggressiveCleanCacheEvent with groupFlags " + p0Var.f89122a);
        c5189xf98047de.e();
    }
}
