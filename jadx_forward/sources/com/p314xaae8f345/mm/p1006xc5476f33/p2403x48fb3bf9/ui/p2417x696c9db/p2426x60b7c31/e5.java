package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class e5 implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266609d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f266609d = c1Var;
        this.f266606a = str;
        this.f266607b = str2;
        this.f266608c = y2Var;
    }

    @Override // j35.d
    public void a(boolean z17) {
        nw4.y2 y2Var = this.f266608c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266609d;
        if (!z17) {
            c1Var.i5(y2Var, "install_download_task:fail", null);
            return;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.s3.f264637a.b(this.f266606a, this.f266607b);
        if (b17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            l44.z.b(4001010, b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAddDownloadTaskStraightInstallStart", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        c1Var.i5(y2Var, "install_download_task:ok", null);
    }
}
