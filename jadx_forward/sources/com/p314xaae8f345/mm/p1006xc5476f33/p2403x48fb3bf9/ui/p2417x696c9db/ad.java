package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld f265446e;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar, android.os.Bundle bundle) {
        this.f265446e = ldVar;
        this.f265445d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f265446e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = ldVar.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return;
        }
        boolean z17 = this.f265445d.getBoolean("key_current_info_show");
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.f267182s).get(ldVar.f(ldVar.f267190h));
        if (bundle != null) {
            bundle.putBoolean("key_current_info_show", z17);
        }
        if (z17 || ldVar.i(bundle)) {
            ldVar.q();
        } else {
            ldVar.g();
        }
    }
}
