package nx;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        long j17 = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf) abstractC20979x809547d1).f135622g.f87750a;
        ls1.j0 j0Var = ls1.j0.f402528a;
        synchronized (ls1.j0.class) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ls1.j0.f402530c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + concurrentHashMap.size() + " webView for MpStartedWebView");
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ls1.e0 e0Var = (ls1.e0) ((java.util.Map.Entry) it.next()).getValue();
                e0Var.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w(e0Var));
            }
            ls1.j0.f402530c.clear();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = ls1.j0.f402529b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + concurrentHashMap2.size() + " webView for MpCachedWebView");
            java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
            while (it6.hasNext()) {
                ls1.e0 e0Var2 = (ls1.e0) ((java.util.Map.Entry) it6.next()).getValue();
                e0Var2.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w(e0Var2));
            }
            ls1.j0.f402529b.clear();
        }
        return false;
    }
}
