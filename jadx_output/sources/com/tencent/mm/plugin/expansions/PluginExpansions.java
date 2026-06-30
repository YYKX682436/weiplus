package com.tencent.mm.plugin.expansions;

@j95.b
/* loaded from: classes12.dex */
public final class PluginExpansions extends i95.w implements b42.e {
    private static final java.lang.String MMKV_PATH = "EXPANSION_DOWNLOAD_STATUS";
    private static final java.lang.String TAG = "MicroMsg.exp.PluginExpansions";

    private void execute() {
        java.util.ArrayList arrayList = com.tencent.mm.plugin.expansions.y.f99778a;
        gm0.j1.i().c(new com.tencent.mm.plugin.expansions.x());
        java.util.ArrayList arrayList2 = (java.util.ArrayList) com.tencent.mm.plugin.expansions.y.f99779b;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (pair.second instanceof java.lang.String) {
                com.tencent.mars.xlog.Log.i((java.lang.String) pair.first, "pending log: " + pair.second);
            }
            java.lang.Object obj = pair.second;
            if (obj instanceof java.lang.Throwable) {
                com.tencent.mars.xlog.Log.printErrStackTrace((java.lang.String) pair.first, (java.lang.Throwable) obj, "pending exception", new java.lang.Object[0]);
            }
        }
        arrayList2.clear();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (com.tencent.mm.plugin.expansions.i0.d()) {
                com.tencent.mars.xlog.Log.i(TAG, "request Sync at MAIN process");
                com.tencent.mm.plugin.expansions.i0.f(false);
                return;
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "request Async at MAIN process.");
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mm.plugin.expansions.i0.e(false);
                return;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.x2.p()) {
            if (com.tencent.mm.plugin.expansions.i0.d()) {
                com.tencent.mars.xlog.Log.i(TAG, "request Sync at SUB process");
                com.tencent.mm.plugin.expansions.i0.f(false);
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "request Async at SUB process");
                com.tencent.mm.plugin.expansions.i0.e(false);
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "execute done");
    }

    private void installed() {
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.expansions.e0 e0Var = new com.tencent.mm.plugin.expansions.e0();
        synchronized (com.tencent.mm.xwebutil.z0.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XWebWithExpansion", "setExpansionImp:%s", e0Var);
            synchronized (com.tencent.mm.xwebutil.z0.class) {
                zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        installed();
        execute();
    }
}
