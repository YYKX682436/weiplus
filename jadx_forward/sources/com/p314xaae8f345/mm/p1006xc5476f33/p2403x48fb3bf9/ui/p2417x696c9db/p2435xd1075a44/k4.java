package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class k4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 f268898b;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var) {
        this.f268898b = o4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void a(int i17, java.lang.String reqUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = this.f268898b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var = o4Var.f269007s;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = o4Var.G;
        d0Var.getClass();
        if (r0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = r0Var.R;
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "setShareFuncFlag params failed");
            return;
        }
        java.lang.String Z = r0Var.Z();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z)) {
            return;
        }
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(new java.net.URL(Z).getHost(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9))) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c17 = wVar.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getJsPerm(...)");
                boolean f17 = d0Var.f(c17, 21, 1);
                int i18 = f17;
                if (d0Var.f(c17, 23, 2)) {
                    i18 = (f17 ? 1 : 0) | 2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebViewMenuHelper", "getShareFuncFlag %d", java.lang.Integer.valueOf(i18));
                if (r0Var.g0() != null) {
                    r0Var.g0().T("setFuncFlag", i18);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "create url fail : " + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = this.f268898b;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = o4Var.G;
            if (r0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = r0Var.e0();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var2 = o4Var.G;
                e07.A5(r0Var2 != null ? r0Var2.U() : 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var3 = o4Var.G;
            if (r0Var3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e08 = r0Var3.e0();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6 g17 = o4Var.g();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var4 = o4Var.G;
                e08.rg(g17, r0Var4 != null ? r0Var4.U() : 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var5 = o4Var.G;
            if (r0Var5 != null) {
                r0Var5.s0(o4Var.f268999h);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMWebViewWithController", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void j() {
        nw4.n g07;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = this.f268898b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = o4Var.G;
        if (r0Var == null || (g07 = r0Var.g0()) == null) {
            return;
        }
        g07.A("onCreate", o4Var.f268997f.f268709b);
    }
}
