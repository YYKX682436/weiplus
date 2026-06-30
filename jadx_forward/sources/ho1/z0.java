package ho1;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364394e;

    public z0(ho1.a1 a1Var, long j17) {
        this.f364393d = a1Var;
        this.f364394e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f364393d.f364155a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeStateByPkgId pkgId=");
        long j17 = this.f364394e;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
    }
}
