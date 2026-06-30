package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f174159d;

    public j0(qo1.j0 j0Var) {
        this.f174159d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Try remove invalid auto backup task by pkgId=");
        qo1.j0 j0Var = this.f174159d;
        sb6.append(j0Var.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        qo1.j1.f447056a.e(j0Var.a(), true);
    }
}
