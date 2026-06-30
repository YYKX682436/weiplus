package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

@j95.b
/* renamed from: com.tencent.mm.plugin.expansions.PluginExpansions */
/* loaded from: classes12.dex */
public final class C13488x51373747 extends i95.w implements b42.e {

    /* renamed from: MMKV_PATH */
    private static final java.lang.String f35483xeee418d9 = "EXPANSION_DOWNLOAD_STATUS";
    private static final java.lang.String TAG = "MicroMsg.exp.PluginExpansions";

    /* renamed from: execute */
    private void m55148xb158f775() {
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.f181311a;
        gm0.j1.i().c(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.x());
        java.util.ArrayList arrayList2 = (java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.f181312b;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (pair.second instanceof java.lang.String) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i((java.lang.String) pair.first, "pending log: " + pair.second);
            }
            java.lang.Object obj = pair.second;
            if (obj instanceof java.lang.Throwable) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35((java.lang.String) pair.first, (java.lang.Throwable) obj, "pending exception", new java.lang.Object[0]);
            }
        }
        arrayList2.clear();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "request Sync at MAIN process");
                com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f(false);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "request Async at MAIN process.");
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.e(false);
                return;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "request Sync at SUB process");
                com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f(false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "request Async at SUB process");
                com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.e(false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "execute done");
    }

    /* renamed from: installed */
    private void m55149x1bb377a() {
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e0();
        synchronized (com.p314xaae8f345.mm.p2829xfa87f9de.z0.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWebWithExpansion", "setExpansionImp:%s", e0Var);
            synchronized (com.p314xaae8f345.mm.p2829xfa87f9de.z0.class) {
                zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        m55149x1bb377a();
        m55148xb158f775();
    }
}
