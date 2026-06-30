package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f246226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f246228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246229g;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 o7Var, int i17, java.lang.String str, boolean z17, int i18) {
        this.f246226d = i17;
        this.f246227e = str;
        this.f246228f = z17;
        this.f246229g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
            return;
        }
        boolean z17 = this.f246228f;
        int i17 = this.f246229g;
        int i18 = this.f246226d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3(i18, this.f246227e, z17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().t(i18, l3Var.hashCode());
        gm0.j1.i();
        gm0.j1.n().f354821b.g(l3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
    }
}
