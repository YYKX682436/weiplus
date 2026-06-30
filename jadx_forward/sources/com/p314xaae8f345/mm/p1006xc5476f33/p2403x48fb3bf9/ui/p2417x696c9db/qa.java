package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class qa implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268311a;

    public qa(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f268311a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268311a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1;
        if (wVar == null || wVar.c() == null || !viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1.c().f(413)) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isAccessibilityMode", java.lang.Boolean.valueOf(z17));
        viewOnCreateContextMenuListenerC19337x37f3384d.L1.g0().o("onAccessibilityStateChange", hashMap);
    }
}
