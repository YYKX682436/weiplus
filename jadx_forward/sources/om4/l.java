package om4;

/* loaded from: classes.dex */
public class l implements java.lang.Runnable {
    public l(om4.m mVar, om4.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard ftsrecommendVideo folder %b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(lp0.b.D() + "ftsrecommendVideo/", true)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard topstory folder %b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(lp0.b.D() + "topstory/", true)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete sdcard cache topstory folder %b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir() + "topstory/", true)));
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(pm4.w.i());
        if (!r6Var.m()) {
            com.p314xaae8f345.mm.vfs.w6.u(pm4.w.i());
            com.p314xaae8f345.mm.vfs.w6.u(pm4.w.i() + ".nomedia/");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStory", "Create TopStoryCacheFolder");
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStory", "Delete Cache File %s %b", r6Var2.o(), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true)));
            }
        }
        com.p314xaae8f345.mm.vfs.w6.u(pm4.w.i() + ".nomedia/");
    }
}
