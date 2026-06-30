package wm4;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm4.p f528836d;

    public q(wm4.p pVar) {
        this.f528836d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wm4.p pVar = this.f528836d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 wi6 = pVar.wi();
        wi6.getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(pm4.w.g());
        int i17 = -1;
        if (r6Var.m()) {
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
            if (G == null || G.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Files %s", r6Var.o());
            } else {
                int length = G.length;
                int i18 = 0;
                while (i18 < length) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = G[i18];
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var2.m82467xfb82e301(), i17);
                    if (P > 0) {
                        r45.jn6 jn6Var = new r45.jn6();
                        try {
                            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(r6Var2.o(), 0, i17);
                            jn6Var.mo11468x92b714fd(N);
                            wi6.f256579f.put(java.lang.Integer.valueOf(P), jn6Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put home data cache key:%d size:%d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(N.length));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "loadHomeDataCache %s", r6Var2.n());
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Decode Key Error %s", r6Var2.o());
                    }
                    i18++;
                    i17 = -1;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Exist %s", r6Var.o());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 wi7 = pVar.wi();
        wi7.getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(pm4.w.h());
        if (!r6Var3.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Exist %s", r6Var3.o());
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G2 = r6Var3.G();
        if (G2 == null || G2.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Files %s", r6Var3.o());
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var4 : G2) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6Var4.m82467xfb82e301(), -1);
            if (P2 > 0) {
                try {
                    byte[] N2 = com.p314xaae8f345.mm.vfs.w6.N(r6Var4.o(), 0, -1);
                    wi7.f256580g.put(java.lang.Integer.valueOf(P2), new java.lang.String(N2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put neg cache key:%d size:%d", java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(N2.length));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewMgr", e18, "loadNegDataCache %s", r6Var4.n());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Decode Key Error %s", r6Var4.o());
            }
        }
    }
}
