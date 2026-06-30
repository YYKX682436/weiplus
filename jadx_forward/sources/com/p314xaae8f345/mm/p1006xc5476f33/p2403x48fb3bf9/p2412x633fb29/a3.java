package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f264296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f264297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 f264298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264299i;

    public a3(int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var, java.lang.String str) {
        this.f264294d = i17;
        this.f264295e = i18;
        this.f264296f = oVar;
        this.f264297g = f3Var;
        this.f264298h = e3Var;
        this.f264299i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f264294d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var = this.f264297g;
        if (i17 != 0 || this.f264295e != 0) {
            try {
                db5.e1.t((android.content.Context) this.f264298h.f264384a.get(), this.f264299i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8b), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z2(f3Var));
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OauthMultiAccountMgr", "showAlert ex " + e17.getMessage());
                return;
            }
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f264296f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.OauthAuthorizeConfirmResp");
        r45.jx4 jx4Var = (r45.jx4) fVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jx4Var.f459732d)) {
            f3Var.c();
            return;
        }
        java.lang.String redirect_url = jx4Var.f459732d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(redirect_url, "redirect_url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3.b(f3Var, redirect_url);
    }
}
