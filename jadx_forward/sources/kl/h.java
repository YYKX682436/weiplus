package kl;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Long f390261b = 172800000L;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Long f390262c = 86400000L;

    /* renamed from: d, reason: collision with root package name */
    public static long f390263d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f390264a;

    public h(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        this.f390264a = arrayList;
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList.addAll(list);
    }

    public final void a(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y()) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "%s is not exist or not Directory", str);
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "none files exist", null);
            return;
        }
        for (java.lang.String str2 : D) {
            java.util.Iterator it = ((java.util.ArrayList) this.f390264a).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.contains((java.lang.String) it.next())) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is the block file, don't delete", null);
            } else {
                java.lang.String str3 = str + "/" + str2;
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str3);
                if (!r6Var2.m()) {
                    int i27 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file not exist", null);
                } else if (r6Var2.y()) {
                    int i28 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is directory, scan and delete subFilePath:%s", str3);
                    a(str3);
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > f390261b.longValue()) {
                    java.lang.Object[] objArr = {r6Var2.m82467xfb82e301(), r6Var2.o()};
                    int i29 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioScanConvertCacheController", "Clean 2 days file in mix convert file name=%s, path:%s", objArr);
                    r6Var2.l();
                }
            }
        }
    }
}
