package zo1;

/* loaded from: classes5.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556107d;

    public c5(long j17) {
        this.f556107d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(this.f556107d);
        if (b17 != null) {
            b17.i();
        }
        qo1.j1 j1Var = qo1.j1.f447056a;
        long j17 = this.f556107d;
        synchronized (j1Var.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskManager", "stop and remove auto backup task, pkgId=" + j17);
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
            if (j0Var == null) {
                return;
            }
            if (j0Var instanceof qo1.v0) {
                ((qo1.v0) j0Var).t();
                j1Var.f(j17);
            }
        }
    }
}
