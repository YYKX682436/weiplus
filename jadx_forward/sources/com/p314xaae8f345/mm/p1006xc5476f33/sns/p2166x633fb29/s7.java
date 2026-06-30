package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f246214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f246215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 f246216f;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 o7Var, int i17, boolean z17) {
        this.f246216f = o7Var;
        this.f246214d = i17;
        this.f246215e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Set set = this.f246216f.f246093e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7 v7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7) it.next();
            if (v7Var != null) {
                v7Var.mo70052x3854353c(this.f246214d, this.f246215e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
    }
}
