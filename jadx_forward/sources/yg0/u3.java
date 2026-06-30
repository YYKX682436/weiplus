package yg0;

@j95.b
/* loaded from: classes8.dex */
public final class u3 extends i95.w implements zg0.c3 {
    public void Ai(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269264a) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269265b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) concurrentHashMap.get(url);
            if (r0Var == null) {
                return;
            }
            if (r0Var.M) {
                if (!r0Var.K) {
                    r0Var.f263449a.mo52095x5cd39ffa();
                    r0Var.D0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewControllerPreloadMrg", "destroy ".concat(url));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269266c.remove(url);
                concurrentHashMap.remove(url);
            }
        }
    }

    public void wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269264a.b();
    }
}
