package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vh4 f246267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 f246268e;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var, r45.vh4 vh4Var) {
        this.f246268e = z3Var;
        this.f246267d = vh4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var = this.f246268e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
        r45.vh4 vh4Var = this.f246267d;
        int i17 = vh4Var.f469769f + 1;
        vh4Var.f469769f = i17;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "add try count %d", java.lang.Integer.valueOf(i17));
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3.b(z3Var).h());
            mj4Var.B = vh4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3.b(z3Var).m(mj4Var.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3.b(z3Var).c(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3.b(z3Var));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in checkUploadaddCount %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
    }
}
