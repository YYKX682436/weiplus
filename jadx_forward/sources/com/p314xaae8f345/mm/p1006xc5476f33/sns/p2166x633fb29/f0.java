package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f245717e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var, java.lang.String str) {
        this.f245717e = m0Var;
        this.f245716d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var = this.f245717e;
        java.lang.String str = this.f245716d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "onDownLoadFinish by scene %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
        synchronized (xj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            ((java.util.HashMap) xj6.f245835e).remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        m0Var.s(str, true);
        m0Var.A();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var2 = this.f245717e;
        java.lang.String str2 = this.f245716d;
        m0Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var2.C(str2, -1, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
    }
}
