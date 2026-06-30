package x43;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.f221398a;
        hashMap.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadGameWebCoreHelp", "MultiWebView-Trace destroy 1 webView for GameCenter");
        for (sd.o0 o0Var : hashMap.values()) {
            o0Var.k();
            pf.b bVar = o0Var.f488166i;
            if (bVar != null) {
                bVar.mo32259x5cd39ffa();
            }
        }
        hashMap.clear();
        return false;
    }
}
