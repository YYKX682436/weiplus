package fn4;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f346123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.r0 f346124e;

    public n0(fn4.r0 r0Var, java.lang.String str) {
        this.f346124e = r0Var;
        this.f346123d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.xn6 xn6Var;
        java.lang.String str = this.f346123d;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask folder %s not exist", str);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        java.lang.Object[] objArr = new java.lang.Object[4];
        fn4.r0 r0Var = this.f346124e;
        objArr[0] = java.lang.Integer.valueOf(r0Var.f346136d.size());
        objArr[1] = java.lang.Integer.valueOf(r0Var.f346135c.size());
        objArr[2] = java.lang.Integer.valueOf(G != null ? G.length : 0);
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoCacheTask preloadSize: %d cacheSize: %d folderSize: %d folderPath: %s", objArr);
        if (G == null || G.length <= 10) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(G.length);
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            arrayList.add(r6Var2);
        }
        java.util.Collections.sort(arrayList, new fn4.m0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "First: %s Last: %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, ((com.p314xaae8f345.mm.vfs.r6) arrayList.get(0)).B() / 1000), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, ((com.p314xaae8f345.mm.vfs.r6) arrayList.get(arrayList.size() - 1)).B() / 1000));
        java.util.List<com.p314xaae8f345.mm.vfs.r6> subList = arrayList.subList(10, arrayList.size());
        fn4.b bVar = r0Var.f346133a;
        java.lang.String c17 = (bVar == null || (xn6Var = bVar.I2().f346108d) == null) ? "" : wm4.u.c(xn6Var.f471792h, xn6Var.f471804v);
        for (com.p314xaae8f345.mm.vfs.r6 r6Var3 : subList) {
            java.lang.String str2 = r6Var3.m82467xfb82e301().split("\\.")[0];
            if (!str2.equals(c17) && !r0Var.f346136d.contains(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "Delete cache video %s %s", r6Var3.m82467xfb82e301(), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, r6Var3.B() / 1000));
                r0Var.f346135c.remove(str2);
                r6Var3.l();
            }
        }
    }
}
