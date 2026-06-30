package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6089x3a706b50 f246238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vh4 f246239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 f246241g;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6089x3a706b50 c6089x3a706b50, r45.vh4 vh4Var, java.lang.String str) {
        this.f246241g = z3Var;
        this.f246238d = c6089x3a706b50;
        this.f246239e = vh4Var;
        this.f246240f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6089x3a706b50 c6089x3a706b50 = this.f246238d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "event callback errcode %d", java.lang.Integer.valueOf(c6089x3a706b50.f136368h.f89382a));
        int i17 = c6089x3a706b50.f136368h.f89382a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var = this.f246241g;
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3.a(z3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            z3Var.f(this.f246239e, this.f246240f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            z3Var.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
    }
}
