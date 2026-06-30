package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class z implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f93823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f93824b;

    public z(android.database.MatrixCursor matrixCursor, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f93823a = matrixCursor;
        this.f93824b = countDownLatch;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.util.List<sg1.e> list = (java.util.List) obj;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "prefetchPkgDownloadInfos is null ");
        } else {
            for (sg1.e eVar : list) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "fetchPkgInfo addRow %s", eVar);
                try {
                    this.f93823a.addRow(new java.lang.Object[]{eVar.f407879i, eVar.f407878h, java.lang.Long.valueOf(eVar.f407880m), com.tencent.mm.sdk.platformtools.t8.l(eVar.c())});
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "fetchPkgInfo metaToByteArray e=%s", e17);
                }
            }
        }
        this.f93824b.countDown();
    }
}
