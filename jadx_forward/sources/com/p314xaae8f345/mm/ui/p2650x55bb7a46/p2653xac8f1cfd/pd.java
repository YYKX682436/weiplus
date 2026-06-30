package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class pd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le f281216d;

    public pd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        this.f281216d = leVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar = this.f281216d;
        java.lang.Thread thread = leVar.f280962x;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = leVar.f280959u;
        if (u3Var == null) {
            leVar.f280959u = db5.e1.Q(leVar.f280113d.g(), leVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), leVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.de(leVar));
        } else {
            if (u3Var.isShowing()) {
                return;
            }
            leVar.f280959u.show();
        }
    }
}
