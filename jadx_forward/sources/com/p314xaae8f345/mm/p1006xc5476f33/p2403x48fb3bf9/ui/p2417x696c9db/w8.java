package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268549e;

    public w8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, android.os.Bundle bundle) {
        this.f268548d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268549e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268548d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return;
        }
        android.os.Bundle bundle = this.f268549e;
        int i17 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
        int i18 = bundle != null ? bundle.getInt("key_webview_id", -1) : -1;
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        px4.a.f440488a.a(i18, i17);
    }
}
