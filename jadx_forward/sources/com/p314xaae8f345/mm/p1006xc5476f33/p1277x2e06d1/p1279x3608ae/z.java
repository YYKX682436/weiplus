package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes7.dex */
public class z implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f175356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f175357b;

    public z(android.database.MatrixCursor matrixCursor, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f175356a = matrixCursor;
        this.f175357b = countDownLatch;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.util.List<sg1.e> list = (java.util.List) obj;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "prefetchPkgDownloadInfos is null ");
        } else {
            for (sg1.e eVar : list) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "fetchPkgInfo addRow %s", eVar);
                try {
                    this.f175356a.addRow(new java.lang.Object[]{eVar.f489412i, eVar.f489411h, java.lang.Long.valueOf(eVar.f489413m), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(eVar.c())});
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "fetchPkgInfo metaToByteArray e=%s", e17);
                }
            }
        }
        this.f175357b.countDown();
    }
}
