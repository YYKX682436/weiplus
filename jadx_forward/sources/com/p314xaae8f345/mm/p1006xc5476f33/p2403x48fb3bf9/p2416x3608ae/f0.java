package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class f0 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265064d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265064d = serviceC19302xd3c5b06e;
    }

    @Override // uh4.i0
    /* renamed from: onDataChanged */
    public void mo13777xf050804b() {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f265064d.f265019i).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(256, new android.os.Bundle());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
        }
    }
}
