package k84;

/* loaded from: classes4.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386491d;

    public b6(k84.c6 c6Var) {
        this.f386491d = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$stopPAGPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        k84.c6 c6Var = this.f386491d;
        sb6.append(c6Var.j());
        sb6.append("_pagViewPlay");
        java.lang.String sb7 = sb6.toString();
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = k84.c6.D(c6Var);
            if (D != null) {
                D.n();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(sb7, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$stopPAGPlay$1");
    }
}
