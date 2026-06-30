package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public class e0 extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f265061d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265062e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265062e = serviceC19302xd3c5b06e;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        synchronized (this.f265061d) {
            try {
                java.lang.String j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.j();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("webview_network_type", j17);
                java.util.Iterator it = ((java.util.ArrayList) this.f265062e.f265019i).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(90, bundle);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify network change failed :%s", e17.getMessage());
            }
        }
    }
}
