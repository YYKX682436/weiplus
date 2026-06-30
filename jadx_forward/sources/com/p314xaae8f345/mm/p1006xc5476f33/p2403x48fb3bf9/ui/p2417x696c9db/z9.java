package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 f269257f;

    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, java.lang.String str, java.lang.String str2) {
        this.f269257f = u7Var;
        this.f269255d = str;
        this.f269256e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var = this.f269257f;
        if (u7Var.f268462e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f268462e;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
                return;
            }
            java.lang.String str = this.f269255d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            java.lang.String str2 = this.f269256e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                u7Var.j().putExtra("view_port_code", str2);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).p8(str, null, false);
        }
    }
}
