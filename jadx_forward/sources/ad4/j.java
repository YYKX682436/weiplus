package ad4;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f84719d;

    public j(java.util.Map.Entry entry) {
        this.f84719d = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1$1");
        sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
        java.util.Map.Entry entry = this.f84719d;
        ((rx.l) e0Var).Di((java.lang.String) entry.getValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveImageDownloadUtil", "exec removeTask task id:" + ((java.lang.String) entry.getKey()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil$removeTask$1$1");
    }
}
