package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f245718a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f245719b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();

    public abstract java.lang.Object a(java.lang.Object... objArr);

    public abstract java.util.concurrent.ExecutorService b();

    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
    }

    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        if (this.f245718a) {
            iz5.a.g("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f245718a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        java.util.concurrent.ExecutorService b17 = b();
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
            return false;
        }
        b17.execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e2(this, objArr));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        return true;
    }
}
