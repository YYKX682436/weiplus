package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265060a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265060a = serviceC19302xd3c5b06e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0
    public void a(int i17, android.os.Bundle bundle) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f265060a.f265019i).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(i17 == 1 ? 121002 : 121001, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewStubService", e17, "onExitFinderFullscreenEvent exception", new java.lang.Object[0]);
        }
    }
}
